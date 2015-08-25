package it.unisannio.rcost.callgraphanalyzer.dbmanagers.dao;

import it.unisannio.rcost.callgraphanalyzer.Interface;
import it.unisannio.rcost.callgraphanalyzer.Method;
import it.unisannio.rcost.callgraphanalyzer.dbmanagers.DAOInteface;

public interface MethodDAO extends DAOInteface<Method> {
	
	public Method[] getMains(String projectName);

	public String[][] getPackageClassMainsName(String projectName);

	public Method[] getMethodsByModule(String projectName, Interface owner);

	public Method getMainByPackageTypeName(String projectName, String typeName,
			String packageName);

	public Method getMethodByNameAndModule(String projectName, String name, String signature,
			Interface owner);

}
