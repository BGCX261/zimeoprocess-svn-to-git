package it.unisannio.rcost.callgraphanalyzer.dbmanagers.hsql;

import it.unisannio.rcost.callgraphanalyzer.CallGraphFactory;
import it.unisannio.rcost.callgraphanalyzer.Field;
import it.unisannio.rcost.callgraphanalyzer.FlagsModifier;
import it.unisannio.rcost.callgraphanalyzer.Interface;
import it.unisannio.rcost.callgraphanalyzer.Method;
import it.unisannio.rcost.callgraphanalyzer.Package;
import it.unisannio.rcost.callgraphanalyzer.ScopeModifier;
import it.unisannio.rcost.callgraphanalyzer.dbmanagers.DBConnectionManager;
import it.unisannio.rcost.callgraphanalyzer.dbmanagers.FieldFacade;
import it.unisannio.rcost.callgraphanalyzer.dbmanagers.MethodFacade;
import it.unisannio.rcost.callgraphanalyzer.dbmanagers.dao.InterfaceDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class InterfaceHSQL implements InterfaceDAO {
	private static final DBConnectionManager manager = DBConnectionManager.getInstance();

	public Field[] getFieldsByModule(String projectName, Interface owner) {
		return FieldFacade.facade.getFieldsByModule(projectName, owner);
	}

	/**
	 * Restituisce tutti i moduli innestati nel modulo ricevuto come parametro.
	 * Non fa differenza tra interfaccia, classe o aspetto.
	 */
	public Interface[] getInnerModules(String projectName, Interface owner) {
		List<Interface> interfaces = new ArrayList<Interface>();
		Connection conn = manager.getConnection(projectName);
		try {
			PreparedStatement statement = conn.prepareStatement(
							"SELECT typeTable.*, p.name as packageName FROM (SELECT * FROM type_table WHERE outertypeid = ?) as typeTable JOIN package as p ON typeTable.packageId = p.id;");
//		"SELECT typeTable.*, p.name as packageName FROM (SELECT name, packageId, id, kind, isStatic, isStrictFp FROM type_table WHERE outertypeid = ?) as typeTable JOIN package as p ON typeTable.packageId = p.id;");
			statement.setInt(1, owner.getId());
			
			ResultSet rs = statement.executeQuery();

			while (rs.next()) {
				Interface converted = resultSet2Interface(rs);

				if (converted != null)
					interfaces.add(converted);
			}
		} catch (SQLException exc) {
			exc.printStackTrace();
		} finally {
			manager.freeConnection(projectName, conn);
		}

		return toArray(interfaces);
	}
	
	public Interface[] getModulesByPackage(String projectName, Package owner) {
		List<Interface> interfaces = new ArrayList<Interface>();
		Connection conn = manager.getConnection(projectName);
		try {
			PreparedStatement statement = conn.prepareStatement(
							"SELECT typeTable.*, p.name as packageName FROM (SELECT * FROM type_table WHERE packageId = ? AND outertypeid IS NULL) as typeTable JOIN package as p ON typeTable.packageId = p.id;");
//		"SELECT typeTable.*, p.name as packageName FROM (SELECT name, id, packageId, kind, isStatic, isStrictFp FROM type_table WHERE packageId = ? AND outertypeid IS NULL) as typeTable JOIN package as p ON typeTable.packageId = p.id;");
			statement.setInt(1, owner.getId());
			
			ResultSet rs = statement.executeQuery();

			while (rs.next()) {
				Interface converted = resultSet2Interface(rs);

				if (converted != null)
					interfaces.add(converted);
			}
		} catch (SQLException exc) {
			exc.printStackTrace();
		} finally {
			manager.freeConnection(projectName, conn);
		}

		return toArray(interfaces);
	}
	
	public Interface[] getModulesByPackageAndType(String projectName, Package owner, String type) {
		List<Interface> interfaces = new ArrayList<Interface>();
		Connection conn = manager.getConnection(projectName);
		try {
			PreparedStatement statement = conn.prepareStatement(
							"SELECT typeTable.*, p.name as packageName FROM (SELECT * FROM type_table WHERE kind = ? AND packageId = ? AND outertypeid IS NULL) as typeTable JOIN package as p ON typeTable.packageId = p.id;");
//		"SELECT typeTable.*, p.name as packageName FROM (SELECT name, packageId, id, kind, isStatic, isStrictFp  FROM type_table WHERE kind = ? AND packageId = ? AND outertypeid IS NULL) as typeTable JOIN package as p ON typeTable.packageId = p.id;");
			statement.setString(1, type);
			statement.setInt(2, owner.getId());
			
			ResultSet rs = statement.executeQuery();

			while (rs.next()) {
				Interface converted = resultSet2Interface(rs);

				if (converted != null)
					interfaces.add(converted);
			}
		} catch (SQLException exc) {
			exc.printStackTrace();
		} finally {
			manager.freeConnection(projectName, conn);
		}

		return toArray(interfaces);
	}
	
	public Interface getModuleByNameAndPackage(String projectName, String name, String packageName) {
		Interface interface_ = null;
		Connection conn = manager.getConnection(projectName);
		try {
			PreparedStatement statement = conn.prepareStatement(
				"SELECT * FROM (SELECT typeTable.*, p.name as packageName FROM (SELECT * FROM type_table WHERE name = ?) as typeTable JOIN package as p ON typeTable.packageId = p.id) WHERE packageName = ?;");
//		"SELECT * FROM (SELECT typeTable.*, p.name as packageName FROM (SELECT name, packageId, id, kind, isStatic, isStrictFp FROM type_table WHERE name = ?) as typeTable JOIN package as p ON typeTable.packageId = p.id) WHERE packageName = ?;");
			statement.setString(1, name);
			statement.setString(2, packageName);
			
			ResultSet rs = statement.executeQuery();

			if (rs.next())
				interface_ = resultSet2Interface(rs);
		} catch (SQLException exc) {
			exc.printStackTrace();
		} finally {
			manager.freeConnection(projectName, conn);
		}
		
		return interface_;
	}
	
	public Interface[] getInterfacesByPackage(String projectName, Package owner) {
		return this.getModulesByPackageAndType(projectName, owner, "interface");
	}

	public Method[] getMethodsByModule(String projectName, Interface owner) {
		return MethodFacade.facade.getMethodsByModule(projectName, owner);
	}
	
	public Interface fillAllAttribute(String projectName, Interface emptyElement) {
		Connection conn = manager.getConnection(projectName);

		try {
			// Manca il nome del package, ma esso dovrebbe gia' essere disponibile nell'oggetto ricevuto
			PreparedStatement statement = conn
					.prepareStatement("SELECT * FROM type_table WHERE id = ?;");
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
    
    private Interface resultSet2Interface(ResultSet rs) throws SQLException {
		Interface interface_ = null;
		String kind = rs.getString("kind");
		
		if(kind.equalsIgnoreCase("class"))
			interface_ = CallGraphFactory.eINSTANCE.createClass();
		else if(kind.equalsIgnoreCase("aspect")){
			interface_ = CallGraphFactory.eINSTANCE.createAspect();
		}
		else //if(kind.equalsIgnoreCase("interface"))
			interface_ = CallGraphFactory.eINSTANCE.createInterface();
		
		interface_.setId(rs.getInt("id"));
		interface_.setName(rs.getString("name"));
		interface_.setPackageName(rs.getString("packageName"));
		interface_.setIsStatic(rs.getBoolean("isStatic"));
		interface_.setIsStrictFp(rs.getBoolean("isStrictFp"));
		interface_.setFlagsModifier(FlagsModifier.getByName(rs.getString("flagsModifier")));
		interface_.setScopeModifier(ScopeModifier.getByName(rs.getString("scopeModifier")));
		interface_.setCompilationUnit(rs.getString("compilationUnit"));
		
		return interface_;
	}
	
	private Interface fillAllAttributeSub(Interface element, ResultSet rs) throws SQLException {
//		element.setCompilationUnit(rs.getString("compilationUnit"));
//		element.setIsStatic(rs.getBoolean("isStatic"));
//		element.setIsStrictFp(rs.getBoolean("isStrictFp"));
//		element.setFlagsModifier(FlagsModifier.getByName(rs.getString("flagsModifier")));
//		element.setScopeModifier(ScopeModifier.getByName(rs.getString("scopeModifier")));
		
		return element;
	}
	
	private Interface[] toArray(List<Interface> interfaces) {
		if (interfaces != null)
			return interfaces.toArray(new Interface[interfaces.size()]);
		else
			return new Interface[0];
	}

}
