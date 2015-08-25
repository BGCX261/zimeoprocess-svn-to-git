package it.unisannio.rcost.callgraphanalyzer.dbmanagers.dao;

import it.unisannio.rcost.callgraphanalyzer.Advice;
import it.unisannio.rcost.callgraphanalyzer.Aspect;
import it.unisannio.rcost.callgraphanalyzer.Field;
import it.unisannio.rcost.callgraphanalyzer.Interface;
import it.unisannio.rcost.callgraphanalyzer.Method;
import it.unisannio.rcost.callgraphanalyzer.Package;
import it.unisannio.rcost.callgraphanalyzer.Pointcut;
import it.unisannio.rcost.callgraphanalyzer.dbmanagers.DAOInteface;

public interface AspectDAO extends DAOInteface<Aspect> {

	public Field[] getFields(String projectName, Aspect owner);

	public Method[] getMethods(String projectName, Aspect owner);

	public Advice[] getAdvices(String projectName, Aspect owner);

	public Pointcut[] getPointcuts(String projectName, Aspect owner);

	public Interface[] getInnerModules(String projectName, Aspect owner);

	public Aspect[] getAspectsByPackage(String projectName, Package owner);
}
