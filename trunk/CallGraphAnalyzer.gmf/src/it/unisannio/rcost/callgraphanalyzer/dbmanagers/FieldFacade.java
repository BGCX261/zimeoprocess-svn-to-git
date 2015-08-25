package it.unisannio.rcost.callgraphanalyzer.dbmanagers;

import it.unisannio.rcost.callgraphanalyzer.Field;
import it.unisannio.rcost.callgraphanalyzer.Interface;
import it.unisannio.rcost.callgraphanalyzer.dbmanagers.dao.FieldDAO;
import it.unisannio.rcost.callgraphanalyzer.dbmanagers.hsql.FieldHSQL;

public class FieldFacade implements FieldDAO {
	private FieldDAO fieldDAO = null;

	public static final FieldFacade facade = new FieldFacade();
	
	private FieldFacade() {
		fieldDAO = new FieldHSQL();
	}

	public Field fillAllAttribute(String projectName, Field emptyElement) {
		return fieldDAO.fillAllAttribute(projectName, emptyElement);
	}

	public Field[] getFieldsByModule(String projectName, Interface owner) {
		return fieldDAO.getFieldsByModule(projectName, owner);
	}

	public Field getFieldByNameAndModule(String projectName, String name, Interface owner) {
		return fieldDAO.getFieldByNameAndModule(projectName, name, owner);
	}
}
