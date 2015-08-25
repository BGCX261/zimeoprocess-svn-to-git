package it.unisannio.rcost.callgraphanalyzer.dbmanagers;

import java.sql.SQLException;

public interface DAOInteface<T> {
//	public void insert(T inserted) throws SQLException;
	
//	public void update(T updated) throws SQLException;
	
//	public void remove(T removed) throws SQLException;
	
//	public org.eclipse.jdt.core.IType findByFullyQualifiedName(String fullyQualifiedName);
	
	/**
	 * Recupera tutti gli attributi dell'elemento ricevuto in ingresso dal database.<br>
	 * Questa tecnica consente di ridurre la quantit� di informazioni che vengono mantenute dal sistema per ogni elemento.<br>
	 * L'elemento restituito non avr� informazioni sull'iType a cui fa riferimento.
	 * @param emptyElement
	 * @return
	 * @throws SQLException
	 */
	public T fillAllAttribute(String projectName, T emptyElement);
}
