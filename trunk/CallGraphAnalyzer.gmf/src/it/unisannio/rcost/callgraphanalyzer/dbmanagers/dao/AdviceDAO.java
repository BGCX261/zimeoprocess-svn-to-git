package it.unisannio.rcost.callgraphanalyzer.dbmanagers.dao;

import it.unisannio.rcost.callgraphanalyzer.Advice;
import it.unisannio.rcost.callgraphanalyzer.Aspect;
import it.unisannio.rcost.callgraphanalyzer.dbmanagers.DAOInteface;

public interface AdviceDAO extends DAOInteface<Advice> {

	public Advice[] getAdvicesByAspect(String projectName, Aspect owner);
	
}
