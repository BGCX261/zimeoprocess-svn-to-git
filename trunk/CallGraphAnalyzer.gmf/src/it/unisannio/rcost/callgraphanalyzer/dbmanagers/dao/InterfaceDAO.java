package it.unisannio.rcost.callgraphanalyzer.dbmanagers.dao;

import it.unisannio.rcost.callgraphanalyzer.Field;
import it.unisannio.rcost.callgraphanalyzer.Interface;
import it.unisannio.rcost.callgraphanalyzer.Method;
import it.unisannio.rcost.callgraphanalyzer.Package;
import it.unisannio.rcost.callgraphanalyzer.dbmanagers.DAOInteface;

public interface InterfaceDAO extends DAOInteface<Interface> {

	public Field[] getFieldsByModule(String projectName, Interface owner);

	public Method[] getMethodsByModule(String projectName, Interface owner);

	public Interface[] getInnerModules(String projectName, Interface owner);

	public Interface[] getInterfacesByPackage(String projectName, Package owner);
	
	public Interface[] getModulesByPackageAndType(String projectName, Package owner, String type);

	public Interface[] getModulesByPackage(String projectName, Package owner);

	public Interface getModuleByNameAndPackage(String projectName, String name, String packageName);
}
