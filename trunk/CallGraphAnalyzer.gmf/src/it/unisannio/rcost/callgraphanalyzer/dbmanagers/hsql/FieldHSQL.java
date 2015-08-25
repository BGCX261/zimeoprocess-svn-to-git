package it.unisannio.rcost.callgraphanalyzer.dbmanagers.hsql;

import it.unisannio.rcost.callgraphanalyzer.CallGraphFactory;
import it.unisannio.rcost.callgraphanalyzer.Field;
import it.unisannio.rcost.callgraphanalyzer.Interface;
import it.unisannio.rcost.callgraphanalyzer.ScopeModifier;
import it.unisannio.rcost.callgraphanalyzer.dbmanagers.DBConnectionManager;
import it.unisannio.rcost.callgraphanalyzer.dbmanagers.dao.FieldDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FieldHSQL implements FieldDAO {
	private static final DBConnectionManager manager = DBConnectionManager.getInstance();
	
	public Field fillAllAttribute(String projectName, Field emptyElement) {
		Connection conn = manager.getConnection(projectName);
		
		try {
			PreparedStatement statement = conn.prepareStatement(
					"SELECT * FROM Field WHERE id = ?;");
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

	/**
	 * Restituisce tutti i campi del modulo ricevuto in ingresso.
	 * Non fa differenza tra interfaccia, classe o aspetto.
	 */
	public Field[] getFieldsByModule(String projectName, Interface owner) {
		List<Field> fields = new ArrayList<Field>();
		Connection conn = manager.getConnection(projectName);
		try {
			PreparedStatement statement = conn.prepareStatement(
							"SELECT * FROM Field WHERE ownerId = ?;");
//							"SELECT name, id, isFinal, isStatic, isVolatile, isTransient FROM Field WHERE ownerId = ?;");
			statement.setInt(1, owner.getId());
			
			ResultSet rs = statement.executeQuery();

			while (rs.next()) {
				Field converted = resultSet2Field(rs);

				if (converted != null)
					fields.add(converted);
			}
		} catch (SQLException exc) {
			exc.printStackTrace();
		} finally {
			manager.freeConnection(projectName, conn);
		}

		return toArray(fields);
	}
	
	public Field getFieldByNameAndModule(String projectName, String name, Interface owner) {
		Field field = null;
		Connection conn = manager.getConnection(projectName);
		try {
			PreparedStatement statement = conn.prepareStatement(
				"SELECT * FROM Field WHERE name = ? AND ownerId = ?;");
//							"SELECT name, id, isFinal, isStatic, isVolatile, isTransient FROM Field WHERE name = ? AND ownerId = ?;");
			statement.setString(1, name);
			statement.setInt(2, owner.getId());
			
			ResultSet rs = statement.executeQuery();

			if (rs.next()) {
				field = resultSet2Field(rs);
			}
		} catch (SQLException exc) {
			exc.printStackTrace();
		} finally {
			manager.freeConnection(projectName, conn);
		}
		
		return field;
	}
	
	private Field[] toArray(List<Field> fields) {
		if (fields != null)
			return fields.toArray(new Field[fields.size()]);
		else
			return new Field[0];
	}
    
	private Field resultSet2Field(ResultSet rs) throws SQLException {
		Field field = CallGraphFactory.eINSTANCE.createField();
		field.setId(rs.getInt("id"));
		field.setName(rs.getString("name"));
		field.setIsFinal(rs.getBoolean("isFinal"));
		field.setIsStatic(rs.getBoolean("isStatic"));
		field.setIsVolatile(rs.getBoolean("isVolatile"));
		field.setIsTransient(rs.getBoolean("isTransient"));
		field.setScopeModifier(ScopeModifier.getByName(rs.getString("scopeModifier")));
		field.setSignature(rs.getString("signature"));

		return field;
	}
	
	private Field fillAllAttributeSub(Field emptyElement, ResultSet rs) throws SQLException {
//		emptyElement.setScopeModifier(ScopeModifier.getByName(rs.getString("scopeModifier")));
//		emptyElement.setSignature(rs.getString("signature"));
		
//		emptyElement.setIsFinal(rs.getBoolean("isFinal"));
//		emptyElement.setIsStatic(rs.getBoolean("isStatic"));
//		emptyElement.setIsVolatile(rs.getBoolean("isVolatile"));
//		emptyElement.setIsTransient(rs.getBoolean("isTransient"));
		
		return emptyElement;
	}

}
