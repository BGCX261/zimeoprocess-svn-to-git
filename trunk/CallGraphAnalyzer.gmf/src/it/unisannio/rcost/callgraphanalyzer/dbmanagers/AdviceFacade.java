package it.unisannio.rcost.callgraphanalyzer.dbmanagers;

import it.unisannio.rcost.callgraphanalyzer.Advice;
import it.unisannio.rcost.callgraphanalyzer.Aspect;
import it.unisannio.rcost.callgraphanalyzer.dbmanagers.dao.AdviceDAO;
import it.unisannio.rcost.callgraphanalyzer.dbmanagers.hsql.AdviceHSQL;

public class AdviceFacade implements AdviceDAO {
	private AdviceDAO adviceDAO = null;

	public static final AdviceFacade facade = new AdviceFacade();
	
	private AdviceFacade() {
		adviceDAO = new AdviceHSQL();
	}

	public Advice fillAllAttribute(String projectName, Advice emptyElement) {
		return adviceDAO.fillAllAttribute(projectName, emptyElement);
	}

	public Advice[] getAdvicesByAspect(String projectName, Aspect owner) {
		return adviceDAO.getAdvicesByAspect(projectName, owner);
	}
}
