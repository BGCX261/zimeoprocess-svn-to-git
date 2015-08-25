/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unisannio.rcost.callgraphanalyzer;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.unisannio.rcost.callgraphanalyzer.Method#isIsStrictFp <em>Is Strict Fp</em>}</li>
 *   <li>{@link it.unisannio.rcost.callgraphanalyzer.Method#isIsStatic <em>Is Static</em>}</li>
 *   <li>{@link it.unisannio.rcost.callgraphanalyzer.Method#isIsNative <em>Is Native</em>}</li>
 *   <li>{@link it.unisannio.rcost.callgraphanalyzer.Method#isIsSynchronized <em>Is Synchronized</em>}</li>
 *   <li>{@link it.unisannio.rcost.callgraphanalyzer.Method#getScopeModifier <em>Scope Modifier</em>}</li>
 *   <li>{@link it.unisannio.rcost.callgraphanalyzer.Method#getFlagsModifier <em>Flags Modifier</em>}</li>
 *   <li>{@link it.unisannio.rcost.callgraphanalyzer.Method#getSignature <em>Signature</em>}</li>
 *   <li>{@link it.unisannio.rcost.callgraphanalyzer.Method#isIsMain <em>Is Main</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.unisannio.rcost.callgraphanalyzer.CallGraphPackage#getMethod()
 * @model
 * @generated
 */
public interface Method extends NodeLeaf {

	/**
	 * Returns the value of the '<em><b>Is Strict Fp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Strict Fp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Strict Fp</em>' attribute.
	 * @see #setIsStrictFp(boolean)
	 * @see it.unisannio.rcost.callgraphanalyzer.CallGraphPackage#getMethod_IsStrictFp()
	 * @model
	 * @generated
	 */
	boolean isIsStrictFp();

	/**
	 * Sets the value of the '{@link it.unisannio.rcost.callgraphanalyzer.Method#isIsStrictFp <em>Is Strict Fp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Strict Fp</em>' attribute.
	 * @see #isIsStrictFp()
	 * @generated
	 */
	void setIsStrictFp(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Static</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Static</em>' attribute.
	 * @see #setIsStatic(boolean)
	 * @see it.unisannio.rcost.callgraphanalyzer.CallGraphPackage#getMethod_IsStatic()
	 * @model
	 * @generated
	 */
	boolean isIsStatic();

	/**
	 * Sets the value of the '{@link it.unisannio.rcost.callgraphanalyzer.Method#isIsStatic <em>Is Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Static</em>' attribute.
	 * @see #isIsStatic()
	 * @generated
	 */
	void setIsStatic(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Native</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Native</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Native</em>' attribute.
	 * @see #setIsNative(boolean)
	 * @see it.unisannio.rcost.callgraphanalyzer.CallGraphPackage#getMethod_IsNative()
	 * @model
	 * @generated
	 */
	boolean isIsNative();

	/**
	 * Sets the value of the '{@link it.unisannio.rcost.callgraphanalyzer.Method#isIsNative <em>Is Native</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Native</em>' attribute.
	 * @see #isIsNative()
	 * @generated
	 */
	void setIsNative(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Synchronized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Synchronized</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Synchronized</em>' attribute.
	 * @see #setIsSynchronized(boolean)
	 * @see it.unisannio.rcost.callgraphanalyzer.CallGraphPackage#getMethod_IsSynchronized()
	 * @model
	 * @generated
	 */
	boolean isIsSynchronized();

	/**
	 * Sets the value of the '{@link it.unisannio.rcost.callgraphanalyzer.Method#isIsSynchronized <em>Is Synchronized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Synchronized</em>' attribute.
	 * @see #isIsSynchronized()
	 * @generated
	 */
	void setIsSynchronized(boolean value);

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
	 * @see it.unisannio.rcost.callgraphanalyzer.CallGraphPackage#getMethod_ScopeModifier()
	 * @model
	 * @generated
	 */
	ScopeModifier getScopeModifier();

	/**
	 * Sets the value of the '{@link it.unisannio.rcost.callgraphanalyzer.Method#getScopeModifier <em>Scope Modifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope Modifier</em>' attribute.
	 * @see it.unisannio.rcost.callgraphanalyzer.ScopeModifier
	 * @see #getScopeModifier()
	 * @generated
	 */
	void setScopeModifier(ScopeModifier value);

	/**
	 * Returns the value of the '<em><b>Flags Modifier</b></em>' attribute.
	 * The literals are from the enumeration {@link it.unisannio.rcost.callgraphanalyzer.FlagsModifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flags Modifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flags Modifier</em>' attribute.
	 * @see it.unisannio.rcost.callgraphanalyzer.FlagsModifier
	 * @see #setFlagsModifier(FlagsModifier)
	 * @see it.unisannio.rcost.callgraphanalyzer.CallGraphPackage#getMethod_FlagsModifier()
	 * @model
	 * @generated
	 */
	FlagsModifier getFlagsModifier();

	/**
	 * Sets the value of the '{@link it.unisannio.rcost.callgraphanalyzer.Method#getFlagsModifier <em>Flags Modifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flags Modifier</em>' attribute.
	 * @see it.unisannio.rcost.callgraphanalyzer.FlagsModifier
	 * @see #getFlagsModifier()
	 * @generated
	 */
	void setFlagsModifier(FlagsModifier value);

	/**
	 * Returns the value of the '<em><b>Signature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signature</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signature</em>' attribute.
	 * @see #setSignature(String)
	 * @see it.unisannio.rcost.callgraphanalyzer.CallGraphPackage#getMethod_Signature()
	 * @model
	 * @generated
	 */
	String getSignature();

	/**
	 * Sets the value of the '{@link it.unisannio.rcost.callgraphanalyzer.Method#getSignature <em>Signature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature</em>' attribute.
	 * @see #getSignature()
	 * @generated
	 */
	void setSignature(String value);

	/**
	 * Returns the value of the '<em><b>Is Main</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Main</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Main</em>' attribute.
	 * @see #setIsMain(boolean)
	 * @see it.unisannio.rcost.callgraphanalyzer.CallGraphPackage#getMethod_IsMain()
	 * @model
	 * @generated
	 */
	boolean isIsMain();

	/**
	 * Sets the value of the '{@link it.unisannio.rcost.callgraphanalyzer.Method#isIsMain <em>Is Main</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Main</em>' attribute.
	 * @see #isIsMain()
	 * @generated
	 */
	void setIsMain(boolean value);
	
} // Method
