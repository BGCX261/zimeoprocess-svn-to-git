package it.unisannio.rcost.callgraphanalyzer.dbmanagers.dao;

import it.unisannio.rcost.callgraphanalyzer.Aspect;
import it.unisannio.rcost.callgraphanalyzer.Class;
import it.unisannio.rcost.callgraphanalyzer.Interface;
import it.unisannio.rcost.callgraphanalyzer.Package;
import it.unisannio.rcost.callgraphanalyzer.dbmanagers.DAOInteface;

public interface PackageDAO extends DAOInteface<Package> {
	 
	public Package[] getRootPackages(String projectName);
	
	public Package[] getInnerPackages(String projectName, Package owner);
	
	public Class[] getInnerClasses(String projectName, Package owner);
	
	public Interface[] getInnerInterfaces(String projectName, Package owner);
	
	public Aspect[] getInnerAspects(String projectName, Package owner);

	public Interface[] getInnerModules(String projectName, Package pack);
	
}
