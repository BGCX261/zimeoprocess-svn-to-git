/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unisannio.rcost.callgraphanalyzer.impl;

import it.unisannio.rcost.callgraphanalyzer.CallGraphFactory;
import it.unisannio.rcost.callgraphanalyzer.CallGraphPackage;
import it.unisannio.rcost.callgraphanalyzer.Edge;
import it.unisannio.rcost.callgraphanalyzer.Extension;
import it.unisannio.rcost.callgraphanalyzer.Node;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ClassImpl extends InterfaceImpl implements it.unisannio.rcost.callgraphanalyzer.Class {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CallGraphPackage.Literals.CLASS;
	}

	@Override
	public void addOutEdge(Edge element) {
		if (element instanceof Extension) {
			Edge[] edges = this.getOutEdgesByType(Extension.class);
			if (edges == null || edges.length == 0)
				super.addOutEdge(element);
		} else
			super.addOutEdge(element);
	}

	@Override
	boolean isValidModifiers() {
		return true;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof it.unisannio.rcost.callgraphanalyzer.Class))
			return false;
		return true;
	}

	@Override
	protected Node cloneNode() {
		return CallGraphFactory.eINSTANCE.createClass();
	}
} // ClassImpl
