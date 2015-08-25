package it.unisannio.rcost.callgraphanalyzer.dbmanagers.hsql;

import it.unisannio.rcost.callgraphanalyzer.Advice;
import it.unisannio.rcost.callgraphanalyzer.Aspect;
import it.unisannio.rcost.callgraphanalyzer.CallGraphFactory;
import it.unisannio.rcost.callgraphanalyzer.dbmanagers.DBConnectionManager;
import it.unisannio.rcost.callgraphanalyzer.dbmanagers.dao.AdviceDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AdviceHSQL implements AdviceDAO {
	private static final DBConnectionManager manager = DBConnectionManager.getInstance();

	public Advice fillAllAttribute(String projectName, Advice emptyElement) {
		Connection conn = manager.getConnection(projectName);
		
		try {
			PreparedStatement statement = conn.prepareStatement("SELECT * FROM Advice WHERE id = ?;");
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
	
	public Advice[] getAdvicesByAspect(String projectName, Aspect owner) {
		List<Advice> advices = new ArrayList<Advice>();
		Connection conn = manager.getConnection(projectName);
		try {
			PreparedStatement statement = conn.prepareStatement(
				"SELECT * FROM Advice WHERE aspectId = ?;");
//							"SELECT localId, id, pointcutExpression, adviceKind, isStrictFp FROM Advice WHERE aspectId = ?;");
			statement.setInt(1, owner.getId());
			
			ResultSet rs = statement.executeQuery();

			while (rs.next()) {
				Advice converted = resultSet2Advice(rs);

				if (converted != null)
					advices.add(converted);
			}
		} catch (SQLException exc) {
			exc.printStackTrace();
		} finally {
			manager.freeConnection(projectName, conn);
		}

		return toArray(advices);
	}
	
	private Advice[] toArray(List<Advice> advices) {
		if (advices != null)
			return advices.toArray(new Advice[advices.size()]);
		else
			return new Advice[0];
	}
    
	private Advice resultSet2Advice(ResultSet rs) throws SQLException {
		Advice advice = CallGraphFactory.eINSTANCE.createAdvice();
		advice.setId(rs.getInt("id"));
		advice.setLocalId(rs.getInt("localId"));
		advice.setPointcutExpression(rs.getString("pointcutExpression"));
		advice.setKind(rs.getString("adviceKind"));
		advice.setIsStrictFp(rs.getBoolean("isStrictFp"));
		advice.setSignature(rs.getString("signature"));
		
		return advice;
	}
    
	private Advice fillAllAttributeSub(Advice element, ResultSet rs) throws SQLException {
//        element.setSignature(rs.getString("signature"));
//        element.setIsStrictFp(rs.getBoolean("isStrictFp"));
		
		return element;
	}
}
