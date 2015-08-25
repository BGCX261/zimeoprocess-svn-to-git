package it.unisannio.rcost.callgraphanalyzer.dbmanagers.hsql;

import it.unisannio.rcost.callgraphanalyzer.CallGraphFactory;
import it.unisannio.rcost.callgraphanalyzer.FlagsModifier;
import it.unisannio.rcost.callgraphanalyzer.Interface;
import it.unisannio.rcost.callgraphanalyzer.Method;
import it.unisannio.rcost.callgraphanalyzer.ScopeModifier;
import it.unisannio.rcost.callgraphanalyzer.dbmanagers.DBConnectionManager;
import it.unisannio.rcost.callgraphanalyzer.dbmanagers.dao.MethodDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MethodHSQL implements MethodDAO {
	private static final DBConnectionManager manager = DBConnectionManager.getInstance();

	public Method fillAllAttribute(String projectName, Method emptyElement) {
		Connection conn = manager.getConnection(projectName);

		try {
			PreparedStatement statement = conn
					.prepareStatement("SELECT method.*, p.name as typePackageName FROM (SELECT method.*, typeTable.name as typeName, typeTable.packageId FROM (SELECT * FROM Method WHERE id = ?) as method JOIN type_table as typeTable ON method.typeid = typeTable.id) as method JOIN package as p ON method.packageId = p.id;");
			statement.setInt(1, emptyElement.getId());

			ResultSet rs = statement.executeQuery();

			if (rs.next())
				return fillAllAttributeSub(emptyElement, rs);
		} catch (SQLException exc) {
			exc.printStackTrace();
		} finally {
			manager.freeConnection(projectName, conn);
		}

		return emptyElement;
	}
	 
	public String[][] getPackageClassMainsName(String projectName) {
		Connection conn = manager.getConnection(projectName);
		List<String[]> fullyQualifiedMains = new ArrayList<String[]>();
		try {
			//TODO aggiungere (forse): AND signature = 'void main(String[] args)'
			PreparedStatement statement = conn
					.prepareStatement("SELECT method.*, p.name as typePackageName FROM (SELECT method.*, typeTable.name as typeName, typeTable.packageId FROM (SELECT * FROM Method WHERE Name = 'main' AND IsStatic = true AND ScopeModifier = 'public') as method JOIN type_table as typeTable ON method.typeid = typeTable.id) as method JOIN package as p ON method.packageId = p.id;");
			ResultSet rs = statement.executeQuery();

			while (rs.next()) {
				String[] converted = { rs.getString("TypePackageName"), rs.getString("TypeName") };
				fullyQualifiedMains.add(converted);
			}
		} catch (SQLException exc) {
//			exc.printStackTrace();
		} finally {
			manager.freeConnection(projectName, conn);
		}

		return fullyQualifiedMains.toArray(new String[fullyQualifiedMains.size()][2]);
	}

	public Method[] getMains(String projectName) {
		List<Method> methods = new ArrayList<Method>();
		Connection conn = manager.getConnection(projectName);
		try {
			//TODO aggiungere (forse): AND signature = 'void main(String[] args)'
			PreparedStatement statement = conn
					.prepareStatement("SELECT * FROM Method WHERE Name = 'main' AND IsStatic = true AND ScopeModifier = 'public';");

			ResultSet rs = statement.executeQuery();

			while (rs.next()) {
				Method converted = resultSet2Method(rs);

				if (converted != null)
					methods.add(converted);
			}
		} catch (SQLException exc) {
			exc.printStackTrace();
		} finally {
			manager.freeConnection(projectName, conn);
		}

		return toArray(methods);
	}

	public Method getMainByPackageTypeName(String projectName, String className, String packageName) {
		Method converted = null;
		Connection conn = manager.getConnection(projectName);
		try {
			//TODO aggiungere (forse): AND signature = 'void main(String[] args)'
			PreparedStatement statement = conn
					.prepareStatement("SELECT *, typeTable.* FROM (SELECT * FROM (SELECT id as packageId FROM package WHERE name = ?) as p JOIN (SELECT id as typeId, packageid as packid FROM type_table WHERE name = ?) as typeTable ON p.packageId = typeTable.packid) as typeTable JOIN method as m ON typeTable.typeId = m.typeId WHERE m.name = 'main' AND m.isStatic = true AND m.scopeModifier = 'public';");
			statement.setString(1, packageName);
			statement.setString(2, className);
			ResultSet rs = statement.executeQuery();

			if (rs.next()) {
				converted = resultSet2Method(rs);

				if (converted != null)
					return converted;
			}
		} catch (SQLException exc) {
			exc.printStackTrace();
		} finally {
			manager.freeConnection(projectName, conn);
		}

		return converted;
	}

	public Method[] getMethodsByModule(String projectName, Interface owner) {
		List<Method> methods = new ArrayList<Method>();
		Connection conn = manager.getConnection(projectName);
		try {
			PreparedStatement statement = conn
					.prepareStatement("SELECT *, typeTable.* FROM (SELECT id as typeId FROM type_table WHERE id = ?) as typeTable JOIN method as m ON typeTable.typeId = m.typeId;");
			statement.setInt(1, owner.getId());

			ResultSet rs = statement.executeQuery();

			while (rs.next()) {
				Method converted = resultSet2Method(rs);

				if (converted != null)
					methods.add(converted);
			}
		} catch (SQLException exc) {
			exc.printStackTrace();
		} finally {
			manager.freeConnection(projectName, conn);
		}

		return toArray(methods);
	}

	public Method getMethodByNameAndModule(String projectName, String name, String signature,
			Interface owner) {
		Method method = null;
		Connection conn = manager.getConnection(projectName);
		try {
			PreparedStatement statement = conn.prepareStatement(
							"SELECT *, typeTable.* FROM (SELECT id as typeId FROM type_table WHERE id = ?) as typeTable JOIN (SELECT * FROM method WHERE name = ? AND signature = ?) as m ON typeTable.typeId = m.typeId;");
			statement.setInt(1, owner.getId());
			statement.setString(2, name);
			statement.setString(3, signature);
			ResultSet rs = statement.executeQuery();

			if (rs.next()) {
				method = resultSet2Method(rs);
			}
		} catch (SQLException exc) {
			exc.printStackTrace();
		} finally {
			manager.freeConnection(projectName, conn);
		}
		
		return method;
	}
	
	private Method[] toArray(List<Method> methods) {
		if (methods != null)
			return methods.toArray(new Method[methods.size()]);
		else
			return new Method[0];
	}

	private Method resultSet2Method(ResultSet rs) throws SQLException {
		Method method = CallGraphFactory.eINSTANCE.createMethod();
		method.setId(rs.getInt("id"));
		method.setName(rs.getString("name"));
		boolean isStatic = rs.getBoolean("isStatic");
		ScopeModifier scopeModifier = ScopeModifier.getByName(rs.getString("scopeModifier"));
		method.setScopeModifier(scopeModifier);
		method.setIsStatic(isStatic);
		method.setIsNative(rs.getBoolean("isNative"));
		method.setIsStrictFp(rs.getBoolean("isStrictFp"));
		method.setIsSynchronized(rs.getBoolean("isSynchronized"));
		method.setSignature(rs.getString("signature"));
		method.setFlagsModifier(FlagsModifier.getByName(rs.getString("flagsModifier")));
		method.setIsMain(isStatic && scopeModifier == ScopeModifier.PUBLIC
				&& method.getName().equals("main"));
		return method;
	}

	private Method fillAllAttributeSub(Method element, ResultSet rs) throws SQLException {
//		boolean isStatic = rs.getBoolean("isStatic");
//		ScopeModifier scopeModifier = ScopeModifier.getByName(rs.getString("scopeModifier")); 
//		element.setIsNative(rs.getBoolean("isNative"));
//		element.setIsStatic(isStatic);
//		element.setIsStrictFp(rs.getBoolean("isStrictFp"));
//		element.setIsSynchronized(rs.getBoolean("isSynchronized"));
//		element.setFlagsModifier(FlagsModifier.getByName(rs.getString("flagsModifier")));
//		element.setScopeModifier(scopeModifier);
//		element.setSignature(rs.getString("signature"));
		//TODO aggiungere (forse): element.getSignature().equals("void main(String[] args)")
//		element.setIsMain(isStatic && scopeModifier == ScopeModifier.PUBLIC
//				&& element.getName().equals("main"));
		return element;
	}

}
