/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unisannio.rcost.callgraphanalyzer.impl;

import it.unisannio.rcost.callgraphanalyzer.Advice;
import it.unisannio.rcost.callgraphanalyzer.CallGraphPackage;
import it.unisannio.rcost.callgraphanalyzer.Dependence;
import it.unisannio.rcost.callgraphanalyzer.Field;
import it.unisannio.rcost.callgraphanalyzer.Method;
import it.unisannio.rcost.callgraphanalyzer.Node;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Dependence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.unisannio.rcost.callgraphanalyzer.impl.DependenceImpl#isIsGet <em>Is Get</em>}</li>
 *   <li>{@link it.unisannio.rcost.callgraphanalyzer.impl.DependenceImpl#isIsSet <em>Is Set</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DependenceImpl extends JoinPointShadowImpl implements Dependence {
	/**
	 * The default value of the '{@link #isIsGet() <em>Is Get</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isIsGet()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_GET_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isIsGet() <em>Is Get</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isIsGet()
	 * @generated
	 * @ordered
	 */
	protected boolean isGet = IS_GET_EDEFAULT;
	/**
	 * The default value of the '{@link #isIsSet() <em>Is Set</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isIsSet()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SET_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isIsSet() <em>Is Set</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isIsSet()
	 * @generated
	 * @ordered
	 */
	protected boolean isSet = IS_SET_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected DependenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CallGraphPackage.Literals.DEPENDENCE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsGet() {
		return isGet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsGet(boolean newIsGet) {
		boolean oldIsGet = isGet;
		isGet = newIsGet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CallGraphPackage.DEPENDENCE__IS_GET, oldIsGet, isGet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsSet() {
		return isSet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsSet(boolean newIsSet) {
		boolean oldIsSet = isSet;
		isSet = newIsSet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CallGraphPackage.DEPENDENCE__IS_SET, oldIsSet, isSet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CallGraphPackage.DEPENDENCE__IS_GET:
				return isIsGet() ? Boolean.TRUE : Boolean.FALSE;
			case CallGraphPackage.DEPENDENCE__IS_SET:
				return isIsSet() ? Boolean.TRUE : Boolean.FALSE;
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CallGraphPackage.DEPENDENCE__IS_GET:
				setIsGet(((Boolean)newValue).booleanValue());
				return;
			case CallGraphPackage.DEPENDENCE__IS_SET:
				setIsSet(((Boolean)newValue).booleanValue());
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CallGraphPackage.DEPENDENCE__IS_GET:
				setIsGet(IS_GET_EDEFAULT);
				return;
			case CallGraphPackage.DEPENDENCE__IS_SET:
				setIsSet(IS_SET_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CallGraphPackage.DEPENDENCE__IS_GET:
				return isGet != IS_GET_EDEFAULT;
			case CallGraphPackage.DEPENDENCE__IS_SET:
				return isSet != IS_SET_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isGet: ");
		result.append(isGet);
		result.append(", isSet: ");
		result.append(isSet);
		result.append(')');
		return result.toString();
	}

	/**
	 * un sorgente valido per questo arco può essere solo un attributo (field)
	 */
	@Override
	protected boolean isValidSource() {
		Node source = getSource();
		if (source != null) {
			if(source instanceof Field)
				return true;
		}
//		if (source != null
//				&& (source instanceof Method || source instanceof Advice || source instanceof Field)) {
//			Node target = this.getTarget();
//
//			if (target != null) {
//				Edge[] targetInEdges = target.getInEdgesByType(Dependence.class);
//				if (targetInEdges != null && targetInEdges.length > 0) {
//					for (int i = 0; i < targetInEdges.length; i++) {
//						Edge inEdge = targetInEdges[i];
//						if (target.equals(inEdge.getSource()))
//							return false;
//					}
//				}
//			}
//			
//			return true;
//		}

		return false;
	}

	/**
	 * il target di questo arco può essere metodo, advice 
	 */
	@Override
	protected boolean isValidTarget() {
		Node target = getTarget();

		if(target != null && (target instanceof Method || target instanceof Advice))
			return true;
	
//			if (target instanceof Method || target instanceof Advice || target instanceof Field) {
//				Node source = this.getSource();
//
//				if (source != null) {
//					Edge[] targetOutEdges = target.getOutEdgesByType(Dependence.class);
//					if (targetOutEdges != null && targetOutEdges.length > 0) {
//						for (int i = 0; i < targetOutEdges.length; i++) {
//							Edge outEdge = targetOutEdges[i];
//							if (source.equals(outEdge.getTarget()))
//								return false;
//						}
//					}
//				}
//			}
//			
//			return true;
		

		return false;
	}

	@Override
	public boolean equals(Object obj) {
		if (super.equals(obj))
			return true;

		if (getClass() != obj.getClass())
			return false;
//		System.out.println("source: " + this + " target: " + obj);
		if (this.getSource() == null || this.getTarget() == null)
			return false;
		
		final DependenceImpl other = (DependenceImpl) obj;
		if (this.getSource().equals(other.getTarget()) && this.getTarget().equals(other.getSource()))
			return true;
		
		return false;
	}

} // DependenceImpl
