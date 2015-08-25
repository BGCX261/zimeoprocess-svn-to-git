package it.unisannio.rcost.callgraphanalyzer.dbmanagers.hsql;

import it.unisannio.rcost.callgraphanalyzer.Advice;
import it.unisannio.rcost.callgraphanalyzer.Aspect;
import it.unisannio.rcost.callgraphanalyzer.Field;
import it.unisannio.rcost.callgraphanalyzer.Interface;
import it.unisannio.rcost.callgraphanalyzer.Method;
import it.unisannio.rcost.callgraphanalyzer.Package;
import it.unisannio.rcost.callgraphanalyzer.Pointcut;
import it.unisannio.rcost.callgraphanalyzer.dbmanagers.AdviceFacade;
import it.unisannio.rcost.callgraphanalyzer.dbmanagers.InterfaceFacade;
import it.unisannio.rcost.callgraphanalyzer.dbmanagers.PointcutFacade;
import it.unisannio.rcost.callgraphanalyzer.dbmanagers.dao.AspectDAO;

public class AspectHSQL implements AspectDAO {
//	private static final DBConnectionManager manager = DBConnectionManager.getInstance();

	public Field[] getFields(String projectName, Aspect owner) {
		return InterfaceFacade.facade.getFieldsByModule(projectName, owner);
	}

	public Interface[] getInnerModules(String projectName, Aspect owner) {
		return InterfaceFacade.facade.getInnerModules(projectName, owner);
	}

	public Method[] getMethods(String projectName, Aspect owner) {
		return InterfaceFacade.facade.getMethodsByModule(projectName, owner);
	}

	public Advice[] getAdvices(String projectName, Aspect owner) {
		return AdviceFacade.facade.getAdvicesByAspect(projectName, owner);
	}

	public Pointcut[] getPointcuts(String projectName, Aspect owner) {
		return PointcutFacade.facade.getPointcutsByAspect(projectName, owner);
	}

	public Aspect fillAllAttribute(String projectName, Aspect emptyElement) {
		return (Aspect) InterfaceFacade.facade.fillAllAttribute(projectName, emptyElement);
	}

	public Aspect[] getAspectsByPackage(String projectName, Package owner) {
		return (Aspect[]) InterfaceFacade.facade.getModulesByPackageAndType(projectName, owner, "aspect");
	}
}
