/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unisannio.rcost.callgraphanalyzer.impl;

import it.unisannio.rcost.callgraphanalyzer.Advice;
import it.unisannio.rcost.callgraphanalyzer.Association;
import it.unisannio.rcost.callgraphanalyzer.CallGraphPackage;
import it.unisannio.rcost.callgraphanalyzer.Node;
import it.unisannio.rcost.callgraphanalyzer.Pointcut;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AssociationImpl extends EdgeImpl implements Association {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CallGraphPackage.Literals.ASSOCIATION;
	}

	/**
	 * Un'associazione puo' avere come nodo sorgente solo un advice. Non e' orientata
	 */
	@Override
	protected boolean isValidSource() {
		Node source = getSource();
		if(source != null)
			if(source instanceof Advice)
				return true;
//		if (source != null && (source instanceof Advice || source instanceof Pointcut)) {
//			Node target = this.getTarget();
//
//			if (target != null) {
//				Edge[] targetInEdges = target.getInEdgesByType(Association.class);
//				if (targetInEdges != null && targetInEdges.length > 0) {
//					for (int i = 0; i < targetInEdges.length; i++) {
//						Edge inEdge = targetInEdges[i];
//						if (target.equals(inEdge.getSource()))
//							return false;
//					}
//				}
//
//				return true;
//			}
//		}

		return false;
	}

	/**
	 * Un'associazione puo' avere come nodo target solo un pointcut.
	 * Non e' orientata
	 */
	@Override
	protected boolean isValidTarget() {
		Node target = getTarget();
		
		if(target != null)
			if(target instanceof Pointcut)
				return true;
//		if (target != null && (target instanceof Advice || target instanceof Pointcut)) {
//			Node source = this.getSource();
//
//			if (source != null) {
//				Edge[] targetOutEdges = target.getOutEdgesByType(Association.class);
//				if (targetOutEdges != null && targetOutEdges.length > 0) {
//					for (int i = 0; i < targetOutEdges.length; i++) {
//						Edge outEdge = targetOutEdges[i];
//						if (source.equals(outEdge.getTarget()))
//							return false;
//					}
//				}
//			}
//
//			return true;
//		}

		return false;
	}

	@Override
	public boolean equals(Object obj) {
		if (super.equals(obj))
			return true;

		if (this.getSource() == null || this.getTarget() == null)
			return false;

		final DependenceImpl other = (DependenceImpl) obj;
		if (!this.getSource().equals(other.getTarget()))
			return false;

		if (!this.getTarget().equals(other.getSource()))
			return false;

		return true;
	}
} // AssociationImpl
