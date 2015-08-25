/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unisannio.rcost.callgraphanalyzer.impl;

import it.unisannio.rcost.callgraphanalyzer.Advice;
import it.unisannio.rcost.callgraphanalyzer.Aspect;
import it.unisannio.rcost.callgraphanalyzer.CallGraphFactory;
import it.unisannio.rcost.callgraphanalyzer.CallGraphPackage;
import it.unisannio.rcost.callgraphanalyzer.Node;
import it.unisannio.rcost.callgraphanalyzer.Pointcut;

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
 * An implementation of the model object '<em><b>Aspect</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.unisannio.rcost.callgraphanalyzer.impl.AspectImpl#getPointcutsList <em>Pointcuts</em>}</li>
 *   <li>{@link it.unisannio.rcost.callgraphanalyzer.impl.AspectImpl#getAdvicesList <em>Advices</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AspectImpl extends ClassImpl implements Aspect {
	/**
	 * The cached value of the '{@link #getPointcutsList() <em>Pointcuts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointcutsList()
	 * @generated
	 * @ordered
	 */
	protected EList<Pointcut> pointcuts;

	/**
	 * The empty value for the '{@link #getPointcuts() <em>Pointcuts</em>}' array accessor.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointcuts()
	 * @generated
	 * @ordered
	 */
	protected static final Pointcut[] POINTCUTS_EEMPTY_ARRAY = new Pointcut [0];

	/**
	 * The cached value of the '{@link #getAdvicesList() <em>Advices</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdvicesList()
	 * @generated
	 * @ordered
	 */
	protected EList<Advice> advices;

	/**
	 * The empty value for the '{@link #getAdvices() <em>Advices</em>}' array accessor.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdvices()
	 * @generated
	 * @ordered
	 */
	protected static final Advice[] ADVICES_EEMPTY_ARRAY = new Advice [0];

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AspectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CallGraphPackage.Literals.ASPECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public Pointcut[] getPointcuts() {
		if (pointcuts == null || pointcuts.isEmpty()) return POINTCUTS_EEMPTY_ARRAY;
		BasicEList<Pointcut> list = (BasicEList<Pointcut>)pointcuts;
		list.shrink();
		return (Pointcut[])list.data();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pointcut getPointcuts(int index) {
		return getPointcutsList().get(index);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPointcutsLength() {
		return pointcuts == null ? 0 : pointcuts.size();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void setPointcuts(Pointcut[] newPointcuts) {
		((BasicEList<Pointcut>)getPointcutsList()).setData(newPointcuts.length, newPointcuts);
		
		for (int i = 0; i < newPointcuts.length; i++) {
			newPointcuts[i].setNodeContainer(this);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void setPointcuts(int index, Pointcut element) {
		getPointcutsList().set(index, element);
		element.setNodeContainer(this);
	}

	public void addPointcut(Pointcut element) {
		EList<Pointcut> pointcuts = getPointcutsList();
		if(!pointcuts.contains(element)) {
			pointcuts.add(element);
			element.setNodeContainer(this);
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pointcut> getPointcutsList() {
		if (pointcuts == null) {
			pointcuts = new EObjectContainmentEList<Pointcut>(Pointcut.class, this, CallGraphPackage.ASPECT__POINTCUTS);
		}
		return pointcuts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public Advice[] getAdvices() {
		if (advices == null || advices.isEmpty()) return ADVICES_EEMPTY_ARRAY;
		BasicEList<Advice> list = (BasicEList<Advice>)advices;
		list.shrink();
		return (Advice[])list.data();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Advice getAdvices(int index) {
		return getAdvicesList().get(index);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAdvicesLength() {
		return advices == null ? 0 : advices.size();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void setAdvices(Advice[] newAdvices) {
		((BasicEList<Advice>)getAdvicesList()).setData(newAdvices.length, newAdvices);
		
		for (int i = 0; i < newAdvices.length; i++) {
			newAdvices[i].setNodeContainer(this);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void setAdvices(int index, Advice element) {
		getAdvicesList().set(index, element);
		element.setNodeContainer(this);
	}

	public void addAdvice(Advice element) {
		EList<Advice> advices = getAdvicesList();
		if(!advices.contains(element)) {
			advices.add(element);
			element.setNodeContainer(this);
		}
	}
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Advice> getAdvicesList() {
		if (advices == null) {
			advices = new EObjectContainmentEList<Advice>(Advice.class, this, CallGraphPackage.ASPECT__ADVICES);
		}
		return advices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CallGraphPackage.ASPECT__POINTCUTS:
				return ((InternalEList<?>)getPointcutsList()).basicRemove(otherEnd, msgs);
			case CallGraphPackage.ASPECT__ADVICES:
				return ((InternalEList<?>)getAdvicesList()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CallGraphPackage.ASPECT__POINTCUTS:
				return getPointcutsList();
			case CallGraphPackage.ASPECT__ADVICES:
				return getAdvicesList();
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
			case CallGraphPackage.ASPECT__POINTCUTS:
				getPointcutsList().clear();
				getPointcutsList().addAll((Collection<? extends Pointcut>)newValue);
				return;
			case CallGraphPackage.ASPECT__ADVICES:
				getAdvicesList().clear();
				getAdvicesList().addAll((Collection<? extends Advice>)newValue);
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
			case CallGraphPackage.ASPECT__POINTCUTS:
				getPointcutsList().clear();
				return;
			case CallGraphPackage.ASPECT__ADVICES:
				getAdvicesList().clear();
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
			case CallGraphPackage.ASPECT__POINTCUTS:
				return pointcuts != null && !pointcuts.isEmpty();
			case CallGraphPackage.ASPECT__ADVICES:
				return advices != null && !advices.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	@Override
	boolean isValidModifiers() {
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((advices == null) ? 0 : advices.hashCode());
		result = prime * result + ((pointcuts == null) ? 0 : pointcuts.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof Aspect))
			return false;
		return true;
	}
	
	@Override
	protected Node cloneNode() {
		return CallGraphFactory.eINSTANCE.createAspect();
	}
} //AspectImpl
