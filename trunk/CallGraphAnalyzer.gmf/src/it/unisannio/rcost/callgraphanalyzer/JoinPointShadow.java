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
 * A representation of the model object '<em><b>Join Point Shadow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.unisannio.rcost.callgraphanalyzer.JoinPointShadow#getHandlersList <em>Handlers</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.unisannio.rcost.callgraphanalyzer.CallGraphPackage#getJoinPointShadow()
 * @model abstract="true"
 * @generated
 */
public interface JoinPointShadow extends Edge {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ImplicitCall[] getHandlers();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ImplicitCall getHandlers(int index);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	int getHandlersLength();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setHandlers(ImplicitCall[] newHandlers);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setHandlers(int index, ImplicitCall element);

	/**
	 * Returns the value of the '<em><b>Handlers</b></em>' reference list.
	 * The list contents are of type {@link it.unisannio.rcost.callgraphanalyzer.ImplicitCall}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Handlers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Handlers</em>' reference list.
	 * @see it.unisannio.rcost.callgraphanalyzer.CallGraphPackage#getJoinPointShadow_Handlers()
	 * @model
	 * @generated
	 */
	EList<ImplicitCall> getHandlersList();

	void addHandler(ImplicitCall implicitCall);
} // JoinPointShadow
