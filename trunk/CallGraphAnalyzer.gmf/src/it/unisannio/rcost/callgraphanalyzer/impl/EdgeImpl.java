/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unisannio.rcost.callgraphanalyzer.impl;

import it.unisannio.rcost.callgraphanalyzer.CallGraphPackage;
import it.unisannio.rcost.callgraphanalyzer.Edge;
import it.unisannio.rcost.callgraphanalyzer.Node;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.unisannio.rcost.callgraphanalyzer.impl.EdgeImpl#getSource <em>Source</em>}</li>
 *   <li>{@link it.unisannio.rcost.callgraphanalyzer.impl.EdgeImpl#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class EdgeImpl extends EObjectImpl implements Edge {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Node source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Node target;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected EdgeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CallGraphPackage.Literals.EDGE;
	}

	@Override
	public boolean eNotificationRequired() {
		return false;
	}
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Node getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (Node)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CallGraphPackage.EDGE__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	public void setSource(Node newSource) {
		if (source == null || !source.equals(newSource)) {
			Node oldSource = source;
			source = newSource;

			if (this.isValidSource()) {
				if(newSource != null) {
					if (eNotificationRequired())
						eNotify(new ENotificationImpl(this, Notification.SET,
								CallGraphPackage.EDGE__SOURCE, oldSource, source));
					
					if(target != null) 
						newSource.addOutEdge(this);
				}
			} else {
				newSource.removeOutEdge(this);
				
				source = oldSource;
			}
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Node getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (Node)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CallGraphPackage.EDGE__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	public void setTarget(Node newTarget) {
		if (target == null || !target.equals(newTarget)) {
			Node oldTarget = target;
			target = newTarget;

			if (this.isValidTarget()) {
				if(newTarget != null) {
					if (eNotificationRequired())
						eNotify(new ENotificationImpl(this, Notification.SET,
								CallGraphPackage.EDGE__TARGET, oldTarget, target));
	
					if(source != null) {
						source.addOutEdge(this);
//						newTarget.addInEdge(this);
					}
				}
			} else {
//				newTarget.removeInEdge(this);
				target = oldTarget;
			}
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CallGraphPackage.EDGE__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case CallGraphPackage.EDGE__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
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
			case CallGraphPackage.EDGE__SOURCE:
				setSource((Node)newValue);
				return;
			case CallGraphPackage.EDGE__TARGET:
				setTarget((Node)newValue);
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
			case CallGraphPackage.EDGE__SOURCE:
				setSource((Node)null);
				return;
			case CallGraphPackage.EDGE__TARGET:
				setTarget((Node)null);
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
			case CallGraphPackage.EDGE__SOURCE:
				return source != null;
			case CallGraphPackage.EDGE__TARGET:
				return target != null;
		}
		return super.eIsSet(featureID);
	}

	protected abstract boolean isValidSource();

	protected abstract boolean isValidTarget();

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((source == null) ? 0 : source.hashCode());
		result = prime * result + ((target == null) ? 0 : target.hashCode());
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
		final EdgeImpl other = (EdgeImpl) obj;
		if (source == null) {
			if (other.source != null)
				return false;
		} else if (!source.equals(other.source))
			return false;
		if (target == null) {
			if (other.target != null)
				return false;
		} else if (!target.equals(other.target))
			return false;
		return true;
	}
} // EdgeImpl
