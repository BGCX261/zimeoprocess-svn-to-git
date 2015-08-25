/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unisannio.rcost.callgraphanalyzer;

import java.util.List;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.unisannio.rcost.callgraphanalyzer.NodeContainer#getPackageName <em>Package Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.unisannio.rcost.callgraphanalyzer.CallGraphPackage#getNodeContainer()
 * @model abstract="true"
 * @generated
 */
public interface NodeContainer extends Node {

	/**
	 * Returns the value of the '<em><b>Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package Name</em>' attribute.
	 * @see #setPackageName(String)
	 * @see it.unisannio.rcost.callgraphanalyzer.CallGraphPackage#getNodeContainer_PackageName()
	 * @model
	 * @generated
	 */
	String getPackageName();

	/**
	 * Sets the value of the '{@link it.unisannio.rcost.callgraphanalyzer.NodeContainer#getPackageName <em>Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package Name</em>' attribute.
	 * @see #getPackageName()
	 * @generated
	 */
	void setPackageName(String value);

	List<Interface> getInnerModulesList();
} // NodeContainer
