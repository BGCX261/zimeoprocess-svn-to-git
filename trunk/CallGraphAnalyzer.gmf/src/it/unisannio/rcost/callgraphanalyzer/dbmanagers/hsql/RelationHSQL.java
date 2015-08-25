package it.unisannio.rcost.callgraphanalyzer.dbmanagers.hsql;

import it.unisannio.rcost.callgraphanalyzer.Advice;
import it.unisannio.rcost.callgraphanalyzer.Aspect;
import it.unisannio.rcost.callgraphanalyzer.CallGraphFactory;
import it.unisannio.rcost.callgraphanalyzer.Class;
import it.unisannio.rcost.callgraphanalyzer.Dependence;
import it.unisannio.rcost.callgraphanalyzer.Edge;
import it.unisannio.rcost.callgraphanalyzer.ExplicitCall;
import it.unisannio.rcost.callgraphanalyzer.Extension;
import it.unisannio.rcost.callgraphanalyzer.Field;
import it.unisannio.rcost.callgraphanalyzer.Implementation;
import it.unisannio.rcost.callgraphanalyzer.ImplicitCall;
import it.unisannio.rcost.callgraphanalyzer.Interface;
import it.unisannio.rcost.callgraphanalyzer.Method;
import it.unisannio.rcost.callgraphanalyzer.NodeLeaf;
import it.unisannio.rcost.callgraphanalyzer.dbmanagers.DBConnectionManager;
import it.unisannio.rcost.callgraphanalyzer.dbmanagers.dao.RelationDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Hashtable;

public class RelationHSQL implements RelationDAO {
	private static final DBConnectionManager manager = DBConnectionManager.getInstance();

	public void addImplicitCallAndDependence(String projectName, Hashtable<Integer, Method> methodHash,
			Hashtable<Integer, Advice> adviceHash, Hashtable<Integer, Field> fieldHash) {
		Connection conn = manager.getConnection(projectName);

		try {
			PreparedStatement statement = conn
					.prepareStatement("SELECT * FROM implicitCallMethodToAdvice;");

			ResultSet rs = statement.executeQuery();

			while (rs.next()) {
				Method source = methodHash.get(rs.getInt("methodId"));
				Advice target = adviceHash.get(rs.getInt("adviceId"));
				String joinPointShadowType = rs.getString("joinPointShadowType");
				String targetType = rs.getString("targetType");
				String sourceLine = rs.getInt("sourceLine") + "";
				createImplicitCallWithDependence(fieldHash, rs, source, target,
						joinPointShadowType, targetType, sourceLine);
			}

			statement = conn.prepareStatement("SELECT * FROM implicitCallAdviceToAdvice;");

			rs = statement.executeQuery();

			while (rs.next()) {
				Advice source = adviceHash.get(rs.getInt("advisedAdviceId"));
				Advice target = adviceHash.get(rs.getInt("advisingAdviceId"));
				String joinPointShadowType = rs.getString("joinPointShadowType");
				String targetType = rs.getString("targetType");

				String sourceLine = rs.getInt("sourceLine") + "";
				createImplicitCallWithDependence(fieldHash, rs, source, target,
						joinPointShadowType, targetType, sourceLine);
			}
		} catch (SQLException exc) {
			exc.printStackTrace();
		} finally {
			manager.freeConnection(projectName, conn);
		}

	}

	private void createImplicitCallWithDependence(
			Hashtable<Integer, Field> fieldHash, ResultSet rs, NodeLeaf source,
			Advice target, String joinPointShadowType, String targetType,
			String sourceLine) throws SQLException {
		if (source != null && target != null) {
			ImplicitCall implicitCall = null;
			Edge[] outEdges = source.getOutEdgesByType(ImplicitCall.class);
			
			for (int i = 0; i < outEdges.length && implicitCall == null; i++) {
				if(outEdges[i].getTarget().equals(target)) {
					implicitCall = (ImplicitCall) outEdges[i];
					
					String oldJoinPoint = implicitCall.getJoinPointShadowType();
					String oldSourceLine = implicitCall.getSourceLine();
					
					//Verifica che non ci sia gia' il joinPointShadow
					if(!oldJoinPoint.equals(joinPointShadowType) || !oldJoinPoint.contains(joinPointShadowType)) {
						((ImplicitCall)outEdges[i]).setJoinPointShadowType(oldJoinPoint + "; " + joinPointShadowType);
					}
					
					//Verifica che non ci sia gia' la sourceline
					boolean isContainedSourceLine = false;
					String[] splittesSourceLine = oldSourceLine.trim().split(";");
					for (int j = 0; j < splittesSourceLine.length && ! isContainedSourceLine; j++) {
						if(splittesSourceLine[j].equals(sourceLine))
							isContainedSourceLine = true;
					}
					
					if(!isContainedSourceLine) {
						((ImplicitCall)outEdges[i]).setSourceLine(oldSourceLine + "; " + sourceLine);
					}
				}
			}
			
			if(implicitCall == null) {
				implicitCall = CallGraphFactory.eINSTANCE.createImplicitCall();

				implicitCall.setSourceLine(sourceLine);
				implicitCall.setJoinPointShadowType(joinPointShadowType);
				implicitCall.setTarget(target);
				implicitCall.setSource(source);
			}
			
			this.addDependence(rs, fieldHash, source, targetType, joinPointShadowType, implicitCall);
		}
	}

	private void addDependence(ResultSet rs, Hashtable<Integer, Field> fieldHash, NodeLeaf nodeLeaf,
			String targetType, String joinpointShadowType, ImplicitCall implicitCall)
			throws SQLException {
		if (targetType.equalsIgnoreCase("field")) {
			int targetId = rs.getInt("targetId");

			Field field = fieldHash.get(targetId);

			Edge[] dependences = field.getOutEdgesByType(Dependence.class);

			Dependence dependence = null;
			
			for (int i = 0; i < dependences.length; i++) {
				dependence = (Dependence) dependences[i];
				if (dependence.getTarget().equals(nodeLeaf)) 
					break;
			}
			
			if(dependence == null){
				dependence = CallGraphFactory.eINSTANCE.createDependence();
				dependence.setTarget(nodeLeaf);
				dependence.setSource(field);
			}
			
			if (joinpointShadowType.equalsIgnoreCase("fieldGet")) {
				dependence.setIsGet(true);
			} else {
				dependence.setIsSet(true);
			}
			dependence.addHandler(implicitCall);
		}
	}

	public void addExplicitCall(String projectName, Hashtable<Integer, Method> methodHash,
			Hashtable<Integer, Advice> adviceHash) {
		Connection conn = manager.getConnection(projectName);

		try {
			PreparedStatement statement = conn
					.prepareStatement("SELECT * FROM explicitCallMethodToMethod;");

			ResultSet rs = statement.executeQuery();

			while (rs.next()) {
				Method source = methodHash.get(rs.getInt("callerId"));
				Method target = methodHash.get(rs.getInt("calleeId"));
				String groupId = rs.getInt("callGroupId") + "";
				
				createExplicitCall(source, target, groupId);
			}

			statement = conn.prepareStatement("SELECT * FROM explicitCallAdviceToMethod;");

			rs = statement.executeQuery();

			while (rs.next()) {
				Advice source = adviceHash.get(rs.getInt("adviceId"));
				Method target = methodHash.get(rs.getInt("methodId"));
				String groupId = rs.getInt("callGroupId") + "";
				
				createExplicitCall(source, target, groupId);
			}
		} catch (SQLException exc) {
			exc.printStackTrace();
		} finally {
			manager.freeConnection(projectName, conn);
		}
	}

	private void createExplicitCall(NodeLeaf source, NodeLeaf target, String groupId) {
		if (source != null && target != null) {
			ExplicitCall explicitCall = null;
			Edge[] outEdges = source.getOutEdgesByType(ExplicitCall.class);
			
			for (int i = 0; i < outEdges.length && explicitCall == null; i++) {
				if(outEdges[i].getTarget().equals(target)) {
					explicitCall = (ExplicitCall) outEdges[i];
					
					String oldGroupId = explicitCall.getGroupId();
					
					//Verifica che non ci sia gia' il groupId
					boolean isContainedGroupId = false;
					String[] splittesSourceLine = oldGroupId.trim().split(";");
					for (int j = 0; j < splittesSourceLine.length && ! isContainedGroupId; j++) {
						if(splittesSourceLine[j].equals(groupId))
							isContainedGroupId = true;
					}
					
					if(!isContainedGroupId) {
						((ExplicitCall)outEdges[i]).setGroupId(oldGroupId + "; " + groupId);
					}
				}
			}
			if(explicitCall == null) {
				explicitCall = CallGraphFactory.eINSTANCE.createExplicitCall();
				
				explicitCall.setGroupId(groupId + "");
				explicitCall.setTarget(target);
				explicitCall.setSource(source);
			}
		}
	}

	public void addExtension(String projectName, Hashtable<Integer, Class> classHash,
			Hashtable<Integer, Interface> interfaceHash, Hashtable<Integer, Aspect> aspectHash) {
		Connection conn = manager.getConnection(projectName);

		try {
			PreparedStatement statement = conn
					.prepareStatement("SELECT kind, id as source, supertypeid as target FROM type_table WHERE supertypeid IS NOT NULL AND kind != 'interface';");

			ResultSet rs = statement.executeQuery();

			while (rs.next()) {
				String kind = rs.getString("kind");
				Interface source = null;
				if (kind.equalsIgnoreCase("class"))
					source = classHash.get(rs.getInt("source"));
				else if (kind.equalsIgnoreCase("aspect"))
					source = aspectHash.get(rs.getInt("source"));

				int targetId = rs.getInt("target");
				Interface target = classHash.get(targetId);
				if(target == null)
					target = aspectHash.get(targetId);

				if (source != null && target != null) {
					Extension extension = CallGraphFactory.eINSTANCE.createExtension();

					extension.setTarget(target);
					extension.setSource(source);
				}
			}

			statement = conn
					.prepareStatement("SELECT typeTableSource.id as source, typeTableTarget.id as target FROM (SELECT * FROM typeinterfaceRelation WHERE relationKind = 'extension') as rel JOIN type_table as typeTableSource ON rel.typeId = typeTableSource.id JOIN type_table as typeTableTarget ON rel.interfaceID = typeTableTarget.id;");

			rs = statement.executeQuery();

			while (rs.next()) {
				Interface source = interfaceHash.get(rs.getInt("source"));
				Interface target = interfaceHash.get(rs.getInt("target"));

				if (source != null && target != null) {
					Extension extension = CallGraphFactory.eINSTANCE.createExtension();

					extension.setTarget(target);
					extension.setSource(source);
				}
			}
		} catch (SQLException exc) {
			exc.printStackTrace();
		} finally {
			manager.freeConnection(projectName, conn);
		}
	}

	public void addImplementation(String projectName, Hashtable<Integer, Class> classHash,
			Hashtable<Integer, Interface> interfaceHash, Hashtable<Integer, Aspect> aspectHash) {
		Connection conn = manager.getConnection(projectName);

		try {
			PreparedStatement statement = conn
					.prepareStatement("SELECT typeTableSource.id as source, typeTableSource.kind as sourceKind, interfaceTableTarget.id as target FROM (SELECT * FROM typeinterfaceRelation WHERE relationKind = 'implementation') as rel JOIN type_table as typeTableSource ON rel.typeId = typeTableSource.id JOIN type_table as interfaceTableTarget ON rel.interfaceID = interfaceTableTarget.id;");

			ResultSet rs = statement.executeQuery();

			while (rs.next()) {
				String kind = rs.getString("sourceKind");
				Interface source = null;
				if (kind.equalsIgnoreCase("class"))
					source = classHash.get(rs.getInt("source"));
				else if (kind.equalsIgnoreCase("aspect"))
					source = aspectHash.get(rs.getInt("source"));

				Interface target = interfaceHash.get(rs.getInt("target"));

				if (source != null && target != null) {
					Implementation implementation = CallGraphFactory.eINSTANCE
							.createImplementation();

					implementation.setTarget(target);
					implementation.setSource(source);
				}
			}
		} catch (SQLException exc) {
			exc.printStackTrace();
		} finally {
			manager.freeConnection(projectName, conn);
		}
	}
}
