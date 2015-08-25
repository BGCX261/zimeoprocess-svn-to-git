package it.unisannio.rcost.callgraphanalyzer.dbmanagers;

import it.unisannio.rcost.callgraphanalyzer.Interface;
import it.unisannio.rcost.callgraphanalyzer.Method;
import it.unisannio.rcost.callgraphanalyzer.dbmanagers.dao.MethodDAO;
import it.unisannio.rcost.callgraphanalyzer.dbmanagers.hsql.MethodHSQL;

public class MethodFacade implements MethodDAO {
	private MethodDAO methodDAO = null;

	public static final MethodFacade facade = new MethodFacade();
	
	private MethodFacade() {
		methodDAO = new MethodHSQL();
	}

	public Method fillAllAttribute(String projectName, Method emptyElement) {
		return methodDAO.fillAllAttribute(projectName, emptyElement);
	}

	public Method[] getMains(String projectName) {
		return methodDAO.getMains(projectName);
	}

	public String[][] getPackageClassMainsName(String projectName) {
		return methodDAO.getPackageClassMainsName(projectName);
	}

	public Method[] getMethodsByModule(String projectName, Interface owner) {
		return methodDAO.getMethodsByModule(projectName, owner);
	}
	
	public Method getMainByPackageTypeName(String projectName, String typeName, String packageName){
		return methodDAO.getMainByPackageTypeName(projectName, typeName, packageName);
	}

	public Method getMethodByNameAndModule(String projectName, String name, String signature,
			Interface owner) {
		return methodDAO.getMethodByNameAndModule(projectName, name, signature, owner);
	}
}
