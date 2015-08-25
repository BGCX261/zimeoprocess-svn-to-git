/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unisannio.rcost.callgraphanalyzer.impl;

import it.unisannio.rcost.callgraphanalyzer.Aspect;
import it.unisannio.rcost.callgraphanalyzer.Class;
import it.unisannio.rcost.callgraphanalyzer.CallGraphPackage;
import it.unisannio.rcost.callgraphanalyzer.Edge;
import it.unisannio.rcost.callgraphanalyzer.Extension;
import it.unisannio.rcost.callgraphanalyzer.Interface;
import it.unisannio.rcost.callgraphanalyzer.Node;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extension</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ExtensionImpl extends EdgeImpl implements Extension {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtensionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CallGraphPackage.Literals.EXTENSION;
	}

	/**
	 * una sorgente valida per questo arco a'¨ un interfaccia, una classe o un aspetto
	 */
	@Override
	protected boolean isValidSource() {
//		Node source = getSource();
//		Node target = getTarget();
//		if (source != null && !source.equals(target)) {
//			if(source instanceof Interface) {
//				return target == null || target instanceof Interface;
//			} else if(source instanceof Class) {
//					return target == null || target instanceof Class;
//			} else if(source instanceof Aspect) {
//				return target == null || target instanceof Class || target instanceof Aspect;
//			}
//		}
//
//		return false;
		Node source = getSource();
		if (source != null &&
				(source instanceof it.unisannio.rcost.callgraphanalyzer.Interface ||
						source instanceof it.unisannio.rcost.callgraphanalyzer.Class ||
						source instanceof it.unisannio.rcost.callgraphanalyzer.Aspect)) 
			return true;

		return false;
	}
	
	
	/**
	 * target per questo arco puo' essere una classe(se il nodo sorgente ha gia'  un'altra estensione), un interfaccia 
	 */
	@Override
	protected boolean isValidTarget() {
		Node source = getSource();
		Node target = getTarget();
		
		if(target != null && (target instanceof it.unisannio.rcost.callgraphanalyzer.Class || target instanceof Interface || target instanceof Aspect)) {
			if (source != null) {
				if (source instanceof it.unisannio.rcost.callgraphanalyzer.Class){
					Edge[] outEdges = source.getOutEdgesByType(Extension.class);
					if(outEdges != null && outEdges.length > 0)
						if(outEdges.length == 1 && outEdges[0] == this)
							return true;
						else
							return false;
				}
			}
			
			return true;
		}
			
		return false;
	}
} //ExtensionImpl
