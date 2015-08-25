/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unisannio.rcost.callgraphanalyzer.impl;

import it.unisannio.rcost.callgraphanalyzer.CallGraphPackage;
import it.unisannio.rcost.callgraphanalyzer.Implementation;
import it.unisannio.rcost.callgraphanalyzer.Node;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Implementation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ImplementationImpl extends EdgeImpl implements Implementation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImplementationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CallGraphPackage.Literals.IMPLEMENTATION;
	}

	/**
	 * sorgenti valide per questo arco sono Classi o Aspetti
	 */
	@Override
	protected boolean isValidSource() {
		Node source = getSource();
		if (source != null &&
				(source instanceof it.unisannio.rcost.callgraphanalyzer.Class || source instanceof it.unisannio.rcost.callgraphanalyzer.Aspect)) 
			return true;

		return false;
	}

	/**
	 * target validi per questo arco sono Interfacce
	 */
	@Override
	protected boolean isValidTarget() {
		Node target = getTarget();
		if (target != null &&
				(target instanceof it.unisannio.rcost.callgraphanalyzer.Interface &&
						(!(target instanceof it.unisannio.rcost.callgraphanalyzer.Class) &&
								!(target instanceof it.unisannio.rcost.callgraphanalyzer.Aspect)))) 
			return true;

		return false;
	}

} //ImplementationImpl
