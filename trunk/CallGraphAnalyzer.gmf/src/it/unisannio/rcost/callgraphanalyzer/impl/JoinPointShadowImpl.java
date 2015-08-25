package it.unisannio.rcost.callgraphanalyzer.impl;

import it.unisannio.rcost.callgraphanalyzer.CallGraphPackage;
import it.unisannio.rcost.callgraphanalyzer.ImplicitCall;
import it.unisannio.rcost.callgraphanalyzer.JoinPointShadow;
import java.util.Collection;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

public abstract class JoinPointShadowImpl extends EdgeImpl implements JoinPointShadow {

	/**
	 * The cached value of the '{@link #getHandlersList() <em>Handlers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandlersList()
	 * @generated
	 * @ordered
	 */
	protected EList<ImplicitCall> handlers;
	/**
	 * The empty value for the '{@link #getHandlers() <em>Handlers</em>}' array accessor.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandlers()
	 * @generated
	 * @ordered
	 */
	protected static final ImplicitCall[] HANDLERS_EEMPTY_ARRAY = new ImplicitCall [0];

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JoinPointShadowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CallGraphPackage.Literals.JOIN_POINT_SHADOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public ImplicitCall[] getHandlers() {
		if (handlers == null || handlers.isEmpty()) return HANDLERS_EEMPTY_ARRAY;
		BasicEList<ImplicitCall> list = (BasicEList<ImplicitCall>)handlers;
		list.shrink();
		return (ImplicitCall[])list.data();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplicitCall getHandlers(int index) {
		return getHandlersList().get(index);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHandlersLength() {
		return handlers == null ? 0 : handlers.size();
	}

	public void addHandler(ImplicitCall implicitCall) {
		EList<ImplicitCall> list = getHandlersList();
		
		if(!list.contains(implicitCall)) {
			list.add(implicitCall);
			
			implicitCall.setJoinPointShadow(this);
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void setHandlers(ImplicitCall[] newHandlers) {
		((BasicEList<ImplicitCall>)getHandlersList()).setData(newHandlers.length, newHandlers);
		
		for (int i = 0; i < newHandlers.length; i++) {
			newHandlers[i].setJoinPointShadow(this);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void setHandlers(int index, ImplicitCall element) {
		getHandlersList().set(index, element);
		element.setJoinPointShadow(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImplicitCall> getHandlersList() {
		if (handlers == null) {
			handlers = new EObjectResolvingEList<ImplicitCall>(ImplicitCall.class, this, CallGraphPackage.JOIN_POINT_SHADOW__HANDLERS);
		}
		return handlers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CallGraphPackage.JOIN_POINT_SHADOW__HANDLERS:
				return getHandlersList();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CallGraphPackage.JOIN_POINT_SHADOW__HANDLERS:
				getHandlersList().clear();
				getHandlersList().addAll((Collection<? extends ImplicitCall>)newValue);
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
			case CallGraphPackage.JOIN_POINT_SHADOW__HANDLERS:
				getHandlersList().clear();
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
			case CallGraphPackage.JOIN_POINT_SHADOW__HANDLERS:
				return handlers != null && !handlers.isEmpty();
		}
		return super.eIsSet(featureID);
	}
}
