package it.unisannio.rcost.callgraphanalyzer.dbmanagers;

import it.unisannio.rcost.callgraphanalyzer.Advice;
import it.unisannio.rcost.callgraphanalyzer.Aspect;
import it.unisannio.rcost.callgraphanalyzer.Field;
import it.unisannio.rcost.callgraphanalyzer.Interface;
import it.unisannio.rcost.callgraphanalyzer.Method;
import it.unisannio.rcost.callgraphanalyzer.Package;
import it.unisannio.rcost.callgraphanalyzer.Pointcut;
import it.unisannio.rcost.callgraphanalyzer.dbmanagers.dao.AspectDAO;
import it.unisannio.rcost.callgraphanalyzer.dbmanagers.hsql.AspectHSQL;

public class AspectFacade implements AspectDAO {
	private AspectDAO aspectDAO = null;

	public static final AspectFacade facade = new AspectFacade();

	private AspectFacade() {
		aspectDAO = new AspectHSQL();
	}

	public Aspect fillAllAttribute(String projectName, Aspect emptyElement) {
		return aspectDAO.fillAllAttribute(projectName, emptyElement);
	}

	public Field[] getFields(String projectName, Aspect owner) {
		return aspectDAO.getFields(projectName, owner);
	}

	public Method[] getMethods(String projectName, Aspect owner) {
		return aspectDAO.getMethods(projectName, owner);
	}

	public Advice[] getAdvices(String projectName, Aspect owner) {
		return aspectDAO.getAdvices(projectName, owner);
	}

	public Pointcut[] getPointcuts(String projectName, Aspect owner) {
		return aspectDAO.getPointcuts(projectName, owner);
	}

	public Interface[] getInnerModules(String projectName, Aspect owner) {
		return aspectDAO.getInnerModules(projectName, owner);
	}

	public Aspect[] getAspectsByPackage(String projectName, Package owner) {
		return aspectDAO.getAspectsByPackage(projectName, owner);
	}
}
