package it.unisannio.rcost.callgraphanalyzer.dbmanagers;

import it.unisannio.rcost.callgraphanalyzer.Advice;
import it.unisannio.rcost.callgraphanalyzer.Aspect;
import it.unisannio.rcost.callgraphanalyzer.Class;
import it.unisannio.rcost.callgraphanalyzer.Field;
import it.unisannio.rcost.callgraphanalyzer.Interface;
import it.unisannio.rcost.callgraphanalyzer.Method;
import it.unisannio.rcost.callgraphanalyzer.dbmanagers.dao.RelationDAO;
import it.unisannio.rcost.callgraphanalyzer.dbmanagers.hsql.RelationHSQL;

import java.util.Hashtable;

public class RelationFacade implements RelationDAO {
	private RelationDAO relationDAO = null;

	public static final RelationFacade facade = new RelationFacade();
	
	private RelationFacade() {
		relationDAO = new RelationHSQL();
	}

	public void addImplicitCallAndDependence(String projectName, Hashtable<Integer, Method> methodHash,
			Hashtable<Integer, Advice> adviceHash, Hashtable<Integer, Field> fieldHash) {
		relationDAO.addImplicitCallAndDependence(projectName, methodHash, adviceHash, fieldHash);
	}

	public void addExtension(String projectName, Hashtable<Integer, Class> classHash,
			Hashtable<Integer, Interface> interfaceHash, Hashtable<Integer, Aspect> aspectHash) {
		relationDAO.addExtension(projectName, classHash, interfaceHash, aspectHash);
	}

	public void addImplementation(String projectName, Hashtable<Integer, Class> classHash,
			Hashtable<Integer, Interface> interfaceHash, Hashtable<Integer, Aspect> aspectHash) {
		relationDAO.addImplementation(projectName, classHash, interfaceHash, aspectHash);
	}

	public void addExplicitCall(String projectName, Hashtable<Integer, Method> methodHash,
			Hashtable<Integer, Advice> adviceHash) {
		relationDAO.addExplicitCall(projectName, methodHash, adviceHash);
	}
}
