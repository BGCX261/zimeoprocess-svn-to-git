package it.unisannio.rcost.callgraphanalyzer;

import it.unisannio.rcost.callgraphanalyzer.dbmanagers.DBConnectionManager;
import it.unisannio.se.c3rep.extractors.staticmodel.DBListener;

import org.eclipse.core.runtime.Plugin;

public class DBActivator extends Plugin {
	public DBActivator() {
		super();
		DBListener dbListener = DBConnectionManager.getInstance();
		it.unisannio.se.c3rep.extractors.staticmodel.StaticModelEmitter.getStaticModelEmitter().addDBListener(dbListener);
	}
}
