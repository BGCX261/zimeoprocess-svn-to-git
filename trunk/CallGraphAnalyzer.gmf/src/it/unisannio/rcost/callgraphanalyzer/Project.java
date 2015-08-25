/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unisannio.rcost.callgraphanalyzer;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.unisannio.rcost.callgraphanalyzer.Project#getRootPackagesList <em>Root Packages</em>}</li>
 *   <li>{@link it.unisannio.rcost.callgraphanalyzer.Project#getName <em>Name</em>}</li>
 *   <li>{@link it.unisannio.rcost.callgraphanalyzer.Project#getAuthor <em>Author</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.unisannio.rcost.callgraphanalyzer.CallGraphPackage#getProject()
 * @model
 * @generated
 */
public interface Project extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	it.unisannio.rcost.callgraphanalyzer.Package[] getRootPackages();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	it.unisannio.rcost.callgraphanalyzer.Package getRootPackages(int index);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	int getRootPackagesLength();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setRootPackages(it.unisannio.rcost.callgraphanalyzer.Package[] newRootPackages);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setRootPackages(int index, it.unisannio.rcost.callgraphanalyzer.Package element);

	/**
	 * Returns the value of the '<em><b>Root Packages</b></em>' containment reference list.
	 * The list contents are of type {@link it.unisannio.rcost.callgraphanalyzer.Package}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root Packages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Packages</em>' containment reference list.
	 * @see it.unisannio.rcost.callgraphanalyzer.CallGraphPackage#getProject_RootPackages()
	 * @model containment="true"
	 * @generated
	 */
	EList<it.unisannio.rcost.callgraphanalyzer.Package> getRootPackagesList();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see it.unisannio.rcost.callgraphanalyzer.CallGraphPackage#getProject_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link it.unisannio.rcost.callgraphanalyzer.Project#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Author</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' attribute.
	 * @see #setAuthor(String)
	 * @see it.unisannio.rcost.callgraphanalyzer.CallGraphPackage#getProject_Author()
	 * @model
	 * @generated
	 */
	String getAuthor();

	/**
	 * Sets the value of the '{@link it.unisannio.rcost.callgraphanalyzer.Project#getAuthor <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' attribute.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(String value);

} // Project
