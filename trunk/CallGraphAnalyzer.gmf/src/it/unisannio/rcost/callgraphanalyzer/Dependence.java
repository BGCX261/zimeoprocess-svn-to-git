/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unisannio.rcost.callgraphanalyzer;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dependence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.unisannio.rcost.callgraphanalyzer.Dependence#isIsGet <em>Is Get</em>}</li>
 *   <li>{@link it.unisannio.rcost.callgraphanalyzer.Dependence#isIsSet <em>Is Set</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.unisannio.rcost.callgraphanalyzer.CallGraphPackage#getDependence()
 * @model
 * @generated
 */
public interface Dependence extends JoinPointShadow {

	/**
	 * Returns the value of the '<em><b>Is Get</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Get</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Get</em>' attribute.
	 * @see #setIsGet(boolean)
	 * @see it.unisannio.rcost.callgraphanalyzer.CallGraphPackage#getDependence_IsGet()
	 * @model
	 * @generated
	 */
	boolean isIsGet();

	/**
	 * Sets the value of the '{@link it.unisannio.rcost.callgraphanalyzer.Dependence#isIsGet <em>Is Get</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Get</em>' attribute.
	 * @see #isIsGet()
	 * @generated
	 */
	void setIsGet(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Set</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Set</em>' attribute.
	 * @see #setIsSet(boolean)
	 * @see it.unisannio.rcost.callgraphanalyzer.CallGraphPackage#getDependence_IsSet()
	 * @model
	 * @generated
	 */
	boolean isIsSet();

	/**
	 * Sets the value of the '{@link it.unisannio.rcost.callgraphanalyzer.Dependence#isIsSet <em>Is Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Set</em>' attribute.
	 * @see #isIsSet()
	 * @generated
	 */
	void setIsSet(boolean value);
} // Dependence
