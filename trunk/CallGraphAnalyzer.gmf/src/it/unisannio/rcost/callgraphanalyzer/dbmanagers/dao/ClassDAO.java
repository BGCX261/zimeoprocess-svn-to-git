package it.unisannio.rcost.callgraphanalyzer.dbmanagers.dao;

import it.unisannio.rcost.callgraphanalyzer.Class;
import it.unisannio.rcost.callgraphanalyzer.Field;
import it.unisannio.rcost.callgraphanalyzer.Interface;
import it.unisannio.rcost.callgraphanalyzer.Method;
import it.unisannio.rcost.callgraphanalyzer.Package;
import it.unisannio.rcost.callgraphanalyzer.dbmanagers.DAOInteface;

public interface ClassDAO extends DAOInteface<Class> {
	public Field[] getFields(String projectName, Class owner);

	public Method[] getMethods(String projectName, Class owner);
	
	public Interface[] getInnerModules(String projectName, Class owner);

	public Class[] getClassesByPackage(String projectName, Package owner);
}
