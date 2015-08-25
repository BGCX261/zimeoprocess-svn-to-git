/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unisannio.rcost.callgraphanalyzer.impl;

import it.unisannio.rcost.callgraphanalyzer.Aspect;
import it.unisannio.rcost.callgraphanalyzer.CallGraphPackage;
import it.unisannio.rcost.callgraphanalyzer.Dependence;
import it.unisannio.rcost.callgraphanalyzer.DependenceDecorator;
import it.unisannio.rcost.callgraphanalyzer.Node;
import it.unisannio.rcost.callgraphanalyzer.Package;

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
 * An implementation of the model object '<em><b>Dependence Decorator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.unisannio.rcost.callgraphanalyzer.impl.DependenceDecoratorImpl#getDependencesList <em>Dependences</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DependenceDecoratorImpl extends DependenceImpl implements DependenceDecorator {
	/**
	 * The cached value of the '{@link #getDependencesList() <em>Dependences</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependencesList()
	 * @generated
	 * @ordered
	 */
	protected EList<Dependence> dependences;

	/**
	 * The empty value for the '{@link #getDependences() <em>Dependences</em>}' array accessor.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependences()
	 * @generated
	 * @ordered
	 */
	protected static final Dependence[] DEPENDENCES_EEMPTY_ARRAY = new Dependence [0];
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DependenceDecoratorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CallGraphPackage.Literals.DEPENDENCE_DECORATOR;
	}
	
	public boolean addDependence(Dependence dependence) {
		EList<Dependence> dependences = getDependencesList();
		if(!dependences.contains(dependence)) {
			dependences.add(dependence);
			
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
	public Dependence[] getDependences() {
		if (dependences == null || dependences.isEmpty()) return DEPENDENCES_EEMPTY_ARRAY;
		BasicEList<Dependence> list = (BasicEList<Dependence>)dependences;
		list.shrink();
		return (Dependence[])list.data();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dependence getDependences(int index) {
		return getDependencesList().get(index);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDependencesLength() {
		return dependences == null ? 0 : dependences.size();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDependences(Dependence[] newDependences) {
		((BasicEList<Dependence>)getDependencesList()).setData(newDependences.length, newDependences);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDependences(int index, Dependence element) {
		getDependencesList().set(index, element);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EList<Dependence> getDependencesList() {
		if (dependences == null) {
			dependences = new EObjectContainmentEList<Dependence>(Dependence.class, this, CallGraphPackage.DEPENDENCE_DECORATOR__DEPENDENCES) {
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
		return dependences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CallGraphPackage.DEPENDENCE_DECORATOR__DEPENDENCES:
				return ((InternalEList<?>)getDependencesList()).basicRemove(otherEnd, msgs);
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
			case CallGraphPackage.DEPENDENCE_DECORATOR__DEPENDENCES:
				return new EObjectContainmentEList<Dependence>(Dependence.class, this, CallGraphPackage.DEPENDENCE_DECORATOR__DEPENDENCES);
//				return getDependencesList();
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
			case CallGraphPackage.DEPENDENCE_DECORATOR__DEPENDENCES:
				getDependencesList().clear();
				getDependencesList().addAll((Collection<? extends Dependence>)newValue);
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
			case CallGraphPackage.DEPENDENCE_DECORATOR__DEPENDENCES:
				getDependencesList().clear();
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
			case CallGraphPackage.DEPENDENCE_DECORATOR__DEPENDENCES:
				return dependences != null && !dependences.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dependences == null) ? 0 : dependences.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final DependenceDecoratorImpl other = (DependenceDecoratorImpl) obj;
		if (dependences == null) {
			if (other.dependences != null)
				return false;
		} else if (!dependences.equals(other.dependences))
			return false;
		return true;
	}

	/**
	 * la sorgente di questo arco può essere un package, una classe o un aspetto 
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
	 * il target di questo arco può essere un package, una classe o un aspetto 
	 */
	@Override
	protected boolean isValidTarget() {
		Node target = getTarget();
		
		if (target != null &&
				(target instanceof Package || target instanceof it.unisannio.rcost.callgraphanalyzer.Class || target instanceof Aspect)) 
			return true;

		return false;
	}
} //DependenceDecoratorImpl
