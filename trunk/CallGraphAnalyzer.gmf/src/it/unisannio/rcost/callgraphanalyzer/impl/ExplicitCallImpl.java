/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unisannio.rcost.callgraphanalyzer.impl;

import it.unisannio.rcost.callgraphanalyzer.Advice;
import it.unisannio.rcost.callgraphanalyzer.CallGraphPackage;
import it.unisannio.rcost.callgraphanalyzer.ExplicitCall;
import org.eclipse.emf.common.notify.Notification;
import it.unisannio.rcost.callgraphanalyzer.Method;
import it.unisannio.rcost.callgraphanalyzer.Node;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Explicit Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.unisannio.rcost.callgraphanalyzer.impl.ExplicitCallImpl#getGroupId <em>Group Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExplicitCallImpl extends JoinPointShadowImpl implements ExplicitCall {
	/**
	 * The default value of the '{@link #getGroupId() <em>Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupId()
	 * @generated
	 * @ordered
	 */
	protected static final String GROUP_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getGroupId() <em>Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupId()
	 * @generated
	 * @ordered
	 */
	protected String groupId = GROUP_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ExplicitCallImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CallGraphPackage.Literals.EXPLICIT_CALL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGroupId() {
		return groupId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroupId(String newGroupId) {
		String oldGroupId = groupId;
		groupId = newGroupId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CallGraphPackage.EXPLICIT_CALL__GROUP_ID, oldGroupId, groupId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CallGraphPackage.EXPLICIT_CALL__GROUP_ID:
				return getGroupId();
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
			case CallGraphPackage.EXPLICIT_CALL__GROUP_ID:
				setGroupId((String)newValue);
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
			case CallGraphPackage.EXPLICIT_CALL__GROUP_ID:
				setGroupId(GROUP_ID_EDEFAULT);
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
			case CallGraphPackage.EXPLICIT_CALL__GROUP_ID:
				return GROUP_ID_EDEFAULT == null ? groupId != null : !GROUP_ID_EDEFAULT.equals(groupId);
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
		result.append(" (groupId: ");
		result.append(groupId);
		result.append(')');
		return result.toString();
	}

	@Override
	/**
	 * Nella chiamata esplicita il target e il source possono coincidere
	 * (chiamate ricorsive)
	 */
	protected boolean isValidSource() {
		Node source = getSource();
		// if (source != null && !source.equals(target)) {
		// if(source.getClass() == Method.class) {
		// return target == null || target.getClass() == Method.class;
		// } else if(source.getClass() == Advice.class) {
		// return target == null || target.getClass() == Method.class;
		// }
		// }

		if (source != null
				&& (source instanceof Method || source instanceof Advice)) {
			return true;
		}
		return false;
	}

	@Override
	protected boolean isValidTarget() {
		Node target = getTarget();
		if (target != null && target instanceof Method) {
			return true;
		}
		return false;
	}
} //ExplicitCallImpl
