package it.unisannio.rcost.callgraphanalyzer.dbmanagers.dao;

import it.unisannio.rcost.callgraphanalyzer.Aspect;
import it.unisannio.rcost.callgraphanalyzer.Pointcut;
import it.unisannio.rcost.callgraphanalyzer.dbmanagers.DAOInteface;

public interface PointcutDAO extends DAOInteface<Pointcut> {

	public Pointcut[] getPointcutsByAspect(String projectName, Aspect owner);
	
}
