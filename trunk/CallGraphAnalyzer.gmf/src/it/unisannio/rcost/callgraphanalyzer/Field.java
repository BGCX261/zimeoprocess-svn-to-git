/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unisannio.rcost.callgraphanalyzer;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.unisannio.rcost.callgraphanalyzer.Field#isIsStrictFP <em>Is Strict FP</em>}</li>
 *   <li>{@link it.unisannio.rcost.callgraphanalyzer.Field#isIsFinal <em>Is Final</em>}</li>
 *   <li>{@link it.unisannio.rcost.callgraphanalyzer.Field#isIsStatic <em>Is Static</em>}</li>
 *   <li>{@link it.unisannio.rcost.callgraphanalyzer.Field#isIsVolatile <em>Is Volatile</em>}</li>
 *   <li>{@link it.unisannio.rcost.callgraphanalyzer.Field#getSignature <em>Signature</em>}</li>
 *   <li>{@link it.unisannio.rcost.callgraphanalyzer.Field#getScopeModifier <em>Scope Modifier</em>}</li>
 *   <li>{@link it.unisannio.rcost.callgraphanalyzer.Field#isIsTransient <em>Is Transient</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.unisannio.rcost.callgraphanalyzer.CallGraphPackage#getField()
 * @model
 * @generated
 */
public interface Field extends NodeLeaf {

	/**
	 * Returns the value of the '<em><b>Is Strict FP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Strict FP</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Strict FP</em>' attribute.
	 * @see #setIsStrictFP(boolean)
	 * @see it.unisannio.rcost.callgraphanalyzer.CallGraphPackage#getField_IsStrictFP()
	 * @model
	 * @generated
	 */
	boolean isIsStrictFP();

	/**
	 * Sets the value of the '{@link it.unisannio.rcost.callgraphanalyzer.Field#isIsStrictFP <em>Is Strict FP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Strict FP</em>' attribute.
	 * @see #isIsStrictFP()
	 * @generated
	 */
	void setIsStrictFP(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Final</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Final</em>' attribute.
	 * @see #setIsFinal(boolean)
	 * @see it.unisannio.rcost.callgraphanalyzer.CallGraphPackage#getField_IsFinal()
	 * @model
	 * @generated
	 */
	boolean isIsFinal();

	/**
	 * Sets the value of the '{@link it.unisannio.rcost.callgraphanalyzer.Field#isIsFinal <em>Is Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Final</em>' attribute.
	 * @see #isIsFinal()
	 * @generated
	 */
	void setIsFinal(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Static</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Static</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Static</em>' attribute.
	 * @see #setIsStatic(boolean)
	 * @see it.unisannio.rcost.callgraphanalyzer.CallGraphPackage#getField_IsStatic()
	 * @model default="false"
	 * @generated
	 */
	boolean isIsStatic();

	/**
	 * Sets the value of the '{@link it.unisannio.rcost.callgraphanalyzer.Field#isIsStatic <em>Is Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Static</em>' attribute.
	 * @see #isIsStatic()
	 * @generated
	 */
	void setIsStatic(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Volatile</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Volatile</em>' attribute.
	 * @see #setIsVolatile(boolean)
	 * @see it.unisannio.rcost.callgraphanalyzer.CallGraphPackage#getField_IsVolatile()
	 * @model
	 * @generated
	 */
	boolean isIsVolatile();

	/**
	 * Sets the value of the '{@link it.unisannio.rcost.callgraphanalyzer.Field#isIsVolatile <em>Is Volatile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Volatile</em>' attribute.
	 * @see #isIsVolatile()
	 * @generated
	 */
	void setIsVolatile(boolean value);

	/**
	 * Returns the value of the '<em><b>Signature</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signature</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signature</em>' attribute.
	 * @see #setSignature(String)
	 * @see it.unisannio.rcost.callgraphanalyzer.CallGraphPackage#getField_Signature()
	 * @model default=""
	 * @generated
	 */
	String getSignature();

	/**
	 * Sets the value of the '{@link it.unisannio.rcost.callgraphanalyzer.Field#getSignature <em>Signature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature</em>' attribute.
	 * @see #getSignature()
	 * @generated
	 */
	void setSignature(String value);

	/**
	 * Returns the value of the '<em><b>Scope Modifier</b></em>' attribute.
	 * The literals are from the enumeration {@link it.unisannio.rcost.callgraphanalyzer.ScopeModifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scope Modifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope Modifier</em>' attribute.
	 * @see it.unisannio.rcost.callgraphanalyzer.ScopeModifier
	 * @see #setScopeModifier(ScopeModifier)
	 * @see it.unisannio.rcost.callgraphanalyzer.CallGraphPackage#getField_ScopeModifier()
	 * @model
	 * @generated
	 */
	ScopeModifier getScopeModifier();

	/**
	 * Sets the value of the '{@link it.unisannio.rcost.callgraphanalyzer.Field#getScopeModifier <em>Scope Modifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope Modifier</em>' attribute.
	 * @see it.unisannio.rcost.callgraphanalyzer.ScopeModifier
	 * @see #getScopeModifier()
	 * @generated
	 */
	void setScopeModifier(ScopeModifier value);

	/**
	 * Returns the value of the '<em><b>Is Transient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Transient</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Transient</em>' attribute.
	 * @see #setIsTransient(boolean)
	 * @see it.unisannio.rcost.callgraphanalyzer.CallGraphPackage#getField_IsTransient()
	 * @model
	 * @generated
	 */
	boolean isIsTransient();

	/**
	 * Sets the value of the '{@link it.unisannio.rcost.callgraphanalyzer.Field#isIsTransient <em>Is Transient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Transient</em>' attribute.
	 * @see #isIsTransient()
	 * @generated
	 */
	void setIsTransient(boolean value);
} // Field
