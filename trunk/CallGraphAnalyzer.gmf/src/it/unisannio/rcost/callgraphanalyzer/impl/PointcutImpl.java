/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unisannio.rcost.callgraphanalyzer.impl;

import it.unisannio.rcost.callgraphanalyzer.Aspect;
import it.unisannio.rcost.callgraphanalyzer.CallGraphFactory;
import it.unisannio.rcost.callgraphanalyzer.CallGraphPackage;
import it.unisannio.rcost.callgraphanalyzer.Node;
import it.unisannio.rcost.callgraphanalyzer.NodeContainer;
import it.unisannio.rcost.callgraphanalyzer.Pointcut;

import it.unisannio.rcost.callgraphanalyzer.ScopeModifier;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pointcut</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.unisannio.rcost.callgraphanalyzer.impl.PointcutImpl#getScopeModifier <em>Scope Modifier</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PointcutImpl extends NodeLeafImpl implements Pointcut {
	/**
	 * The default value of the '{@link #getScopeModifier() <em>Scope Modifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScopeModifier()
	 * @generated
	 * @ordered
	 */
	protected static final ScopeModifier SCOPE_MODIFIER_EDEFAULT = ScopeModifier.PROTECTED;
	/**
	 * The cached value of the '{@link #getScopeModifier() <em>Scope Modifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScopeModifier()
	 * @generated
	 * @ordered
	 */
	protected ScopeModifier scopeModifier = SCOPE_MODIFIER_EDEFAULT;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PointcutImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CallGraphPackage.Literals.POINTCUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScopeModifier getScopeModifier() {
		return scopeModifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void setScopeModifier(ScopeModifier newScopeModifier) {
		ScopeModifier oldScopeModifier = scopeModifier;
		scopeModifier = newScopeModifier == null ? SCOPE_MODIFIER_EDEFAULT : newScopeModifier;
		if(!isValidModifiers()){
			scopeModifier = oldScopeModifier;
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CallGraphPackage.POINTCUT__SCOPE_MODIFIER, oldScopeModifier, scopeModifier));
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CallGraphPackage.POINTCUT__SCOPE_MODIFIER:
				return getScopeModifier();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CallGraphPackage.POINTCUT__SCOPE_MODIFIER:
				setScopeModifier((ScopeModifier)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CallGraphPackage.POINTCUT__SCOPE_MODIFIER:
				setScopeModifier(SCOPE_MODIFIER_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CallGraphPackage.POINTCUT__SCOPE_MODIFIER:
				return scopeModifier != SCOPE_MODIFIER_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (scopeModifier: ");
		result.append(scopeModifier);
		result.append(')');
		return result.toString();
	}

	@Override
	boolean isValidModifiers() {
		return true;
	}

	@Override
	public void setNodeContainer(NodeContainer newNodeContainer) {
		if (nodeContainer != null && !nodeContainer.equals(newNodeContainer)) {
			super.setNodeContainer(newNodeContainer);

			if (newNodeContainer instanceof Aspect) {
				((Aspect) newNodeContainer).addPointcut(this);
			}
		}
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (obj instanceof Pointcut)
			return false;
		return true;
	}
	
	@Override
	public Node clone() {
		Pointcut cloneNode = (Pointcut) super.clone();
		
		cloneNode.setScopeModifier(this.scopeModifier);
		
		return cloneNode;
	}
	
	@Override
	protected Node cloneNode() {
		return CallGraphFactory.eINSTANCE.createPointcut();
	}
} //PointcutImpl
