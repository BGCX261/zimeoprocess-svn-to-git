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
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.unisannio.rcost.callgraphanalyzer.Package#getInnerModulesList <em>Inner Modules</em>}</li>
 *   <li>{@link it.unisannio.rcost.callgraphanalyzer.Package#getPackagesList <em>Packages</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.unisannio.rcost.callgraphanalyzer.CallGraphPackage#getPackage()
 * @model
 * @generated
 */
public interface Package extends NodeContainer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Interface[] getInnerModules();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Interface getInnerModules(int index);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	int getInnerModulesLength();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setInnerModules(Interface[] newInnerModules);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setInnerModules(int index, Interface element);

	/**
	 * Returns the value of the '<em><b>Inner Modules</b></em>' containment reference list.
	 * The list contents are of type {@link it.unisannio.rcost.callgraphanalyzer.Interface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inner Modules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inner Modules</em>' containment reference list.
	 * @see it.unisannio.rcost.callgraphanalyzer.CallGraphPackage#getPackage_InnerModules()
	 * @model containment="true"
	 * @generated
	 */
	EList<Interface> getInnerModulesList();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Package[] getPackages();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Package getPackages(int index);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	int getPackagesLength();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setPackages(Package[] newPackages);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setPackages(int index, Package element);

	/**
	 * Returns the value of the '<em><b>Packages</b></em>' containment reference list.
	 * The list contents are of type {@link it.unisannio.rcost.callgraphanalyzer.Package}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Packages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packages</em>' containment reference list.
	 * @see it.unisannio.rcost.callgraphanalyzer.CallGraphPackage#getPackage_Packages()
	 * @model containment="true"
	 * @generated
	 */
	EList<Package> getPackagesList();

	void addInnerModule(Interface module);

	void addPackage(Package package_);

} // Package
