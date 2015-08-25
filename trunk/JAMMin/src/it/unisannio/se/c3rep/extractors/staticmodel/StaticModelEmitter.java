package it.unisannio.se.c3rep.extractors.staticmodel;

import org.eclipse.jdt.core.IJavaProject;

public class StaticModelEmitter {
	public void startDBCreation (IJavaProject project) {
		
	}
	
	public synchronized void addDBListener(DBListener listener) {
		
	}
	
	public synchronized void removeDBListener(DBListener listener) {
		
	}
	
	public static StaticModelEmitter getStaticModelEmitter() {
		return new StaticModelEmitter();
	}
}
