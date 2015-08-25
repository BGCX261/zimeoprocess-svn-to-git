/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unisannio.rcost.callgraphanalyzer;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Explicit Call Decorator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.unisannio.rcost.callgraphanalyzer.ExplicitCallDecorator#getExplicitCallsList <em>Explicit Calls</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.unisannio.rcost.callgraphanalyzer.CallGraphPackage#getExplicitCallDecorator()
 * @model
 * @generated
 */
public interface ExplicitCallDecorator extends ExplicitCall, EdgeDecorator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExplicitCall[] getExplicitCalls();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExplicitCall getExplicitCalls(int index);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	int getExplicitCallsLength();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setExplicitCalls(ExplicitCall[] newExplicitCalls);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setExplicitCalls(int index, ExplicitCall element);

	/**
	 * Returns the value of the '<em><b>Explicit Calls</b></em>' containment reference list.
	 * The list contents are of type {@link it.unisannio.rcost.callgraphanalyzer.ExplicitCall}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Explicit Calls</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Explicit Calls</em>' containment reference list.
	 * @see it.unisannio.rcost.callgraphanalyzer.CallGraphPackage#getExplicitCallDecorator_ExplicitCalls()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExplicitCall> getExplicitCallsList();

	boolean addExplicitCall(ExplicitCall explicitCall);

} // ExplicitCallDecorator
