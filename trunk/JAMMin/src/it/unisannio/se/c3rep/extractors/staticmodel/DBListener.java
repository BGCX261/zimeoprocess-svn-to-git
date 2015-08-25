package it.unisannio.se.c3rep.extractors.staticmodel;

public interface DBListener {

	public void dbConstructionStarted(String projectName);
	
	public void dbConstructionFinished(String projectName);
	
	public void dbConstructionFailed(String projectName);
}
