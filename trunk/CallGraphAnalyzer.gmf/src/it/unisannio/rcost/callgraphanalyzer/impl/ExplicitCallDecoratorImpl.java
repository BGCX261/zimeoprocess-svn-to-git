/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unisannio.rcost.callgraphanalyzer.impl;

import it.unisannio.rcost.callgraphanalyzer.Aspect;
import it.unisannio.rcost.callgraphanalyzer.CallGraphPackage;
import it.unisannio.rcost.callgraphanalyzer.ExplicitCall;
import it.unisannio.rcost.callgraphanalyzer.ExplicitCallDecorator;
import it.unisannio.rcost.callgraphanalyzer.Node;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Explicit Call Decorator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.unisannio.rcost.callgraphanalyzer.impl.ExplicitCallDecoratorImpl#getExplicitCallsList <em>Explicit Calls</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExplicitCallDecoratorImpl extends ExplicitCallImpl implements ExplicitCallDecorator {
	/**
	 * The cached value of the '{@link #getExplicitCallsList() <em>Explicit Calls</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExplicitCallsList()
	 * @generated
	 * @ordered
	 */
	protected EList<ExplicitCall> explicitCalls;

	/**
	 * The empty value for the '{@link #getExplicitCalls() <em>Explicit Calls</em>}' array accessor.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExplicitCalls()
	 * @generated
	 * @ordered
	 */
	protected static final ExplicitCall[] EXPLICIT_CALLS_EEMPTY_ARRAY = new ExplicitCall [0];

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExplicitCallDecoratorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CallGraphPackage.Literals.EXPLICIT_CALL_DECORATOR;
	}
	
	public boolean addExplicitCall(ExplicitCall explicitCall) {
		EList<ExplicitCall> explicitCalls = getExplicitCallsList();
		
		if(!explicitCalls.contains(explicitCall)) {
			explicitCalls.add(explicitCall);
			
			return true;
		}
		
		return false;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public ExplicitCall[] getExplicitCalls() {
		if (explicitCalls == null || explicitCalls.isEmpty()) return EXPLICIT_CALLS_EEMPTY_ARRAY;
		BasicEList<ExplicitCall> list = (BasicEList<ExplicitCall>)explicitCalls;
		list.shrink();
		return (ExplicitCall[])list.data();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplicitCall getExplicitCalls(int index) {
		return getExplicitCallsList().get(index);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getExplicitCallsLength() {
		return explicitCalls == null ? 0 : explicitCalls.size();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExplicitCalls(ExplicitCall[] newExplicitCalls) {
		((BasicEList<ExplicitCall>)getExplicitCallsList()).setData(newExplicitCalls.length, newExplicitCalls);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExplicitCalls(int index, ExplicitCall element) {
		getExplicitCallsList().set(index, element);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EList<ExplicitCall> getExplicitCallsList() {
		if (explicitCalls == null) {
			explicitCalls = new EObjectContainmentEList<ExplicitCall>(ExplicitCall.class, this, CallGraphPackage.EXPLICIT_CALL_DECORATOR__EXPLICIT_CALLS) {
				@Override
				protected boolean hasInverse() {
					return false;
				}
				@Override
				protected boolean useEquals() {
					return true;
				}
			};
		}
		return explicitCalls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CallGraphPackage.EXPLICIT_CALL_DECORATOR__EXPLICIT_CALLS:
				return ((InternalEList<?>)getExplicitCallsList()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CallGraphPackage.EXPLICIT_CALL_DECORATOR__EXPLICIT_CALLS:
				return new EObjectContainmentEList<ExplicitCall>(ExplicitCall.class, this, CallGraphPackage.DEPENDENCE_DECORATOR__DEPENDENCES);
//				return getExplicitCallsList();
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
			case CallGraphPackage.EXPLICIT_CALL_DECORATOR__EXPLICIT_CALLS:
				getExplicitCallsList().clear();
				getExplicitCallsList().addAll((Collection<? extends ExplicitCall>)newValue);
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
			case CallGraphPackage.EXPLICIT_CALL_DECORATOR__EXPLICIT_CALLS:
				getExplicitCallsList().clear();
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
			case CallGraphPackage.EXPLICIT_CALL_DECORATOR__EXPLICIT_CALLS:
				return explicitCalls != null && !explicitCalls.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((explicitCalls == null) ? 0 : explicitCalls.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		final ExplicitCallDecoratorImpl other = (ExplicitCallDecoratorImpl) obj;
		if (explicitCalls == null) {
			if (other.explicitCalls != null)
				return false;
		} else if (!explicitCalls.equals(other.explicitCalls))
			return false;
		return true;
	}

	/**
	 * il sorgente di questo arco può essere un package, una classe o un aspetto
	 */
	@Override
	protected boolean isValidSource() {
		Node source = getSource();
		if (source != null &&
				(source instanceof it.unisannio.rcost.callgraphanalyzer.Package || source instanceof it.unisannio.rcost.callgraphanalyzer.Class || source instanceof Aspect)) 
			return true;

		return false;
	}

	/**
	 * target validi per questo arco sono package, interfacce, classi, aspetti  
	 */
	@Override
	protected boolean isValidTarget() {
		Node target = getTarget();
		if (target != null &&
				(target instanceof it.unisannio.rcost.callgraphanalyzer.Package || target instanceof it.unisannio.rcost.callgraphanalyzer.Interface))
			return true;

		return false;
	}

} //ExplicitCallDecoratorImpl
