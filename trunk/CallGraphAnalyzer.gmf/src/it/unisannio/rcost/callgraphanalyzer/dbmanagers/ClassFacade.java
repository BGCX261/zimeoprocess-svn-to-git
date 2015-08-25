package it.unisannio.rcost.callgraphanalyzer.dbmanagers;

import it.unisannio.rcost.callgraphanalyzer.Class;
import it.unisannio.rcost.callgraphanalyzer.Field;
import it.unisannio.rcost.callgraphanalyzer.Interface;
import it.unisannio.rcost.callgraphanalyzer.Method;
import it.unisannio.rcost.callgraphanalyzer.Package;
import it.unisannio.rcost.callgraphanalyzer.dbmanagers.dao.ClassDAO;
import it.unisannio.rcost.callgraphanalyzer.dbmanagers.hsql.ClassHSQL;

public class ClassFacade implements ClassDAO {
	private ClassDAO classDAO = null;

	public static final ClassFacade facade = new ClassFacade();

	private ClassFacade() {
		classDAO = new ClassHSQL();
	}

	public Class fillAllAttribute(String projectName, Class emptyElement) {
		return classDAO.fillAllAttribute(projectName, emptyElement);
	}

	public Interface[] getInnerModules(String projectName, Class owner) {
		return classDAO.getInnerModules(projectName, owner);
	}

	public Field[] getFields(String projectName, Class owner) {
		return classDAO.getFields(projectName, owner);
	}

	public Method[] getMethods(String projectName, Class owner) {
		return classDAO.getMethods(projectName, owner);
	}

	public Class[] getClassesByPackage(String projectName, Package owner) {
		return classDAO.getClassesByPackage(projectName, owner);
	}

}
