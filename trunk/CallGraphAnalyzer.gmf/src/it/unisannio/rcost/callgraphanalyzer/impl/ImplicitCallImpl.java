/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unisannio.rcost.callgraphanalyzer.impl;

import it.unisannio.rcost.callgraphanalyzer.Advice;
import it.unisannio.rcost.callgraphanalyzer.CallGraphPackage;
import it.unisannio.rcost.callgraphanalyzer.ImplicitCall;
import it.unisannio.rcost.callgraphanalyzer.JoinPointShadow;
import it.unisannio.rcost.callgraphanalyzer.Method;
import it.unisannio.rcost.callgraphanalyzer.Node;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Implicit Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.unisannio.rcost.callgraphanalyzer.impl.ImplicitCallImpl#getJoinPointShadow <em>Join Point Shadow</em>}</li>
 *   <li>{@link it.unisannio.rcost.callgraphanalyzer.impl.ImplicitCallImpl#getJoinPointShadowType <em>Join Point Shadow Type</em>}</li>
 *   <li>{@link it.unisannio.rcost.callgraphanalyzer.impl.ImplicitCallImpl#getSourceLine <em>Source Line</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImplicitCallImpl extends JoinPointShadowImpl implements ImplicitCall {
	/**
	 * The cached value of the '{@link #getJoinPointShadow() <em>Join Point Shadow</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJoinPointShadow()
	 * @generated
	 * @ordered
	 */
	protected JoinPointShadow joinPointShadow;
	/**
	 * The default value of the '{@link #getJoinPointShadowType() <em>Join Point Shadow Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJoinPointShadowType()
	 * @generated
	 * @ordered
	 */
	protected static final String JOIN_POINT_SHADOW_TYPE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getJoinPointShadowType() <em>Join Point Shadow Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJoinPointShadowType()
	 * @generated
	 * @ordered
	 */
	protected String joinPointShadowType = JOIN_POINT_SHADOW_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourceLine() <em>Source Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceLine()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_LINE_EDEFAULT = "0";
	/**
	 * The cached value of the '{@link #getSourceLine() <em>Source Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceLine()
	 * @generated
	 * @ordered
	 */
	protected String sourceLine = SOURCE_LINE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImplicitCallImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CallGraphPackage.Literals.IMPLICIT_CALL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoinPointShadow getJoinPointShadow() {
		if (joinPointShadow != null && joinPointShadow.eIsProxy()) {
			InternalEObject oldJoinPointShadow = (InternalEObject)joinPointShadow;
			joinPointShadow = (JoinPointShadow)eResolveProxy(oldJoinPointShadow);
			if (joinPointShadow != oldJoinPointShadow) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CallGraphPackage.IMPLICIT_CALL__JOIN_POINT_SHADOW, oldJoinPointShadow, joinPointShadow));
			}
		}
		return joinPointShadow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoinPointShadow basicGetJoinPointShadow() {
		return joinPointShadow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void setJoinPointShadow(JoinPointShadow newJoinPointShadow) {
		JoinPointShadow oldJoinPointShadow = joinPointShadow;
		joinPointShadow = newJoinPointShadow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CallGraphPackage.IMPLICIT_CALL__JOIN_POINT_SHADOW, oldJoinPointShadow, joinPointShadow));
		
		if(!joinPointShadow.getHandlersList().contains(this))
			joinPointShadow.addHandler(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJoinPointShadowType() {
		return joinPointShadowType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJoinPointShadowType(String newJoinPointShadowType) {
		String oldJoinPointShadowType = joinPointShadowType;
		joinPointShadowType = newJoinPointShadowType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CallGraphPackage.IMPLICIT_CALL__JOIN_POINT_SHADOW_TYPE, oldJoinPointShadowType, joinPointShadowType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceLine() {
		return sourceLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceLine(String newSourceLine) {
		String oldSourceLine = sourceLine;
		sourceLine = newSourceLine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CallGraphPackage.IMPLICIT_CALL__SOURCE_LINE, oldSourceLine, sourceLine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CallGraphPackage.IMPLICIT_CALL__JOIN_POINT_SHADOW:
				if (resolve) return getJoinPointShadow();
				return basicGetJoinPointShadow();
			case CallGraphPackage.IMPLICIT_CALL__JOIN_POINT_SHADOW_TYPE:
				return getJoinPointShadowType();
			case CallGraphPackage.IMPLICIT_CALL__SOURCE_LINE:
				return getSourceLine();
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
			case CallGraphPackage.IMPLICIT_CALL__JOIN_POINT_SHADOW:
				setJoinPointShadow((JoinPointShadow)newValue);
				return;
			case CallGraphPackage.IMPLICIT_CALL__JOIN_POINT_SHADOW_TYPE:
				setJoinPointShadowType((String)newValue);
				return;
			case CallGraphPackage.IMPLICIT_CALL__SOURCE_LINE:
				setSourceLine((String)newValue);
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
			case CallGraphPackage.IMPLICIT_CALL__JOIN_POINT_SHADOW:
				setJoinPointShadow((JoinPointShadow)null);
				return;
			case CallGraphPackage.IMPLICIT_CALL__JOIN_POINT_SHADOW_TYPE:
				setJoinPointShadowType(JOIN_POINT_SHADOW_TYPE_EDEFAULT);
				return;
			case CallGraphPackage.IMPLICIT_CALL__SOURCE_LINE:
				setSourceLine(SOURCE_LINE_EDEFAULT);
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
			case CallGraphPackage.IMPLICIT_CALL__JOIN_POINT_SHADOW:
				return joinPointShadow != null;
			case CallGraphPackage.IMPLICIT_CALL__JOIN_POINT_SHADOW_TYPE:
				return JOIN_POINT_SHADOW_TYPE_EDEFAULT == null ? joinPointShadowType != null : !JOIN_POINT_SHADOW_TYPE_EDEFAULT.equals(joinPointShadowType);
			case CallGraphPackage.IMPLICIT_CALL__SOURCE_LINE:
				return SOURCE_LINE_EDEFAULT == null ? sourceLine != null : !SOURCE_LINE_EDEFAULT.equals(sourceLine);
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
		result.append(" (joinPointShadowType: ");
		result.append(joinPointShadowType);
		result.append(", sourceLine: ");
		result.append(sourceLine);
		result.append(')');
		return result.toString();
	}

	@Override
	/**
	 * il source di una chiamata implicita puo' essere un advice o un metodo
	 */
	protected boolean isValidSource() {
//		return true;
		Node source = getSource();
		if (source != null && (source instanceof Advice || source instanceof Method)) 
			return true;

		return false;
	}

	@Override
	/**
	 * il target di una chiamta implicita puo' essere solo un advice
	 */
	protected boolean isValidTarget() {
//		return true;
		Node target = getTarget();
		if (target != null && target instanceof Advice) 
			return true;

		return false;
	}

//	@Override
//	public boolean equals(Object obj) {
//		if(obj == null)
//			return false;
//		
//		if(!(obj instanceof ImplicitCall))
//			return false;
//		
//		if(!super.equals(obj))
//			return false;
//		
//		return true;
//	}
} //ImplicitCallImpl
