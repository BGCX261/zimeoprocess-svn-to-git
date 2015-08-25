package it.unisannio.rcost.callgraphanalyzer.dbmanagers;

import it.unisannio.rcost.callgraphanalyzer.Aspect;
import it.unisannio.rcost.callgraphanalyzer.Class;
import it.unisannio.rcost.callgraphanalyzer.Interface;
import it.unisannio.rcost.callgraphanalyzer.Package;
import it.unisannio.rcost.callgraphanalyzer.dbmanagers.dao.PackageDAO;
import it.unisannio.rcost.callgraphanalyzer.dbmanagers.hsql.PackageHSQL;

public class PackageFacade implements PackageDAO {
	private PackageDAO packageDAO = null;

	public static final PackageFacade facade = new PackageFacade();
	
	private PackageFacade() {
		packageDAO = new PackageHSQL();
	}

	public Package fillAllAttribute(String projectName, Package emptyElement) {
		return packageDAO.fillAllAttribute(projectName, emptyElement);
	}


	public Aspect[] getInnerAspects(String projectName, Package owner) {
		return packageDAO.getInnerAspects(projectName, owner);
	}

	public Class[] getInnerClasses(String projectName, Package owner) {
		return packageDAO.getInnerClasses(projectName, owner);
	}

	public Interface[] getInnerInterfaces(String projectName, Package owner) {
		return packageDAO.getInnerInterfaces(projectName, owner);
	}

	public Package[] getInnerPackages(String projectName, Package owner) {
		return packageDAO.getInnerPackages(projectName, owner);
	}

	public Package[] getRootPackages(String projectName) {
		return packageDAO.getRootPackages(projectName);
	}

	public Interface[] getInnerModules(String projectName, Package pack) {
		return packageDAO.getInnerModules(projectName, pack);
	}
}
