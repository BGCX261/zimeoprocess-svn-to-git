package it.unisannio.rcost.callgraphanalyzer.dbmanagers.hsql;

import it.unisannio.rcost.callgraphanalyzer.Aspect;
import it.unisannio.rcost.callgraphanalyzer.Pointcut;
import it.unisannio.rcost.callgraphanalyzer.dbmanagers.dao.PointcutDAO;

public class PointcutHSQL implements PointcutDAO {
//	private static final DBConnectionManager manager = DBConnectionManager.getInstance();
	
	public Pointcut fillAllAttribute(String projectName, Pointcut emptyElement) {
		return emptyElement;
	}
	
	public Pointcut[] getPointcutsByAspect(String projectName, Aspect owner) {
//		List<Pointcut> pointcuts = new ArrayList<Pointcut>();
//		Connection conn = manager.getConnection(projectName);
//		try {
//			PreparedStatement statement = conn.prepareStatement(
//							"SELECT * FROM Pointcut WHERE aspectName = ? AND aspectPackageName = ?;");
//			statement.setString(1, owner.getName());
//			statement.setString(2, owner.getPackageName());
//			
//			ResultSet rs = statement.executeQuery();
//
//			while (rs.next()) {
//				Pointcut converted = resultSet2Pointcut(rs);
//
//				if (converted != null)
//					pointcuts.add(converted);
//			}
//		} catch (SQLException exc) {
//			exc.printStackTrace();
//		} finally {
//			manager.freeConnection(projectName, conn);
//		}
//
//		return toArray(pointcuts);
		return null;
	}
	
//	private Pointcut[] toArray(List<Pointcut> pointcuts) {
//		if (pointcuts != null)
//			return pointcuts.toArray(new Pointcut[pointcuts.size()]);
//		else
//			return new Pointcut[0];
//	}
//    
//	private Pointcut resultSet2Pointcut(ResultSet rs) throws SQLException {
//		Pointcut pointcut = CallGraphFactory.eINSTANCE.createPointcut();
//		pointcut.setId(rs.getInt("autoIncrementCounter"));
//		pointcut.setName(rs.getString("pointcutName"));
//		pointcut.setScopeModifier(ScopeModifier.getByName(rs.getString("scopeModifier")));
//		
//		return pointcut;
//	}
}
