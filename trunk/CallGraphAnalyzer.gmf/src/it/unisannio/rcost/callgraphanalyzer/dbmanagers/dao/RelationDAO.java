package it.unisannio.rcost.callgraphanalyzer.dbmanagers.dao;

import it.unisannio.rcost.callgraphanalyzer.Advice;
import it.unisannio.rcost.callgraphanalyzer.Aspect;
import it.unisannio.rcost.callgraphanalyzer.Class;
import it.unisannio.rcost.callgraphanalyzer.Field;
import it.unisannio.rcost.callgraphanalyzer.Interface;
import it.unisannio.rcost.callgraphanalyzer.Method;

import java.util.Hashtable;

public interface RelationDAO {
	public void addImplicitCallAndDependence(String projectName, Hashtable<Integer, Method> methodHash,
			Hashtable<Integer, Advice> adviceHash, Hashtable<Integer, Field> fieldHash);

	public void addExtension(String projectName, Hashtable<Integer, Class> classHash,
			Hashtable<Integer, Interface> interfaceHash, Hashtable<Integer, Aspect> aspectHash);

	public void addImplementation(String projectName, Hashtable<Integer, Class> classHash,
			Hashtable<Integer, Interface> interfaceHash, Hashtable<Integer, Aspect> aspectHash);

	public void addExplicitCall(String projectName, Hashtable<Integer, Method> methodHash,
			Hashtable<Integer, Advice> adviceHash);
}
