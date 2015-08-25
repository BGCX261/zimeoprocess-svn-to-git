package it.unisannio.rcost.callgraphanalyzer.dbmanagers.hsql;

import it.unisannio.rcost.callgraphanalyzer.Class;
import it.unisannio.rcost.callgraphanalyzer.Field;
import it.unisannio.rcost.callgraphanalyzer.Interface;
import it.unisannio.rcost.callgraphanalyzer.Method;
import it.unisannio.rcost.callgraphanalyzer.Package;
import it.unisannio.rcost.callgraphanalyzer.dbmanagers.InterfaceFacade;
import it.unisannio.rcost.callgraphanalyzer.dbmanagers.dao.ClassDAO;

public class ClassHSQL implements ClassDAO {
//	private static final DBConnectionManager manager = DBConnectionManager.getInstance();
	
	public Field[] getFields(String projectName, Class owner) {
		return InterfaceFacade.facade.getFieldsByModule(projectName, owner);
	}

	public Interface[] getInnerModules(String projectName, Class owner) {
		return InterfaceFacade.facade.getInnerModules(projectName, owner);
	}

	public Method[] getMethods(String projectName, Class owner) {
		return InterfaceFacade.facade.getMethodsByModule(projectName, owner);
	}

	public Class fillAllAttribute(String projectName, Class emptyElement) {
		return (Class) InterfaceFacade.facade.fillAllAttribute(projectName, emptyElement);
	}

	public Class[] getClassesByPackage(String projectName, Package owner) {
		return (Class[]) InterfaceFacade.facade.getModulesByPackageAndType(projectName, owner, "class");
	}
}
