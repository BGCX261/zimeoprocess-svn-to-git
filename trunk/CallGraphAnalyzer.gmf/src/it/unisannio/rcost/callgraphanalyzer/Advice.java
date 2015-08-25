/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unisannio.rcost.callgraphanalyzer;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Advice</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.unisannio.rcost.callgraphanalyzer.Advice#isIsStrictFp <em>Is Strict Fp</em>}</li>
 *   <li>{@link it.unisannio.rcost.callgraphanalyzer.Advice#getKind <em>Kind</em>}</li>
 *   <li>{@link it.unisannio.rcost.callgraphanalyzer.Advice#getLocalId <em>Local Id</em>}</li>
 *   <li>{@link it.unisannio.rcost.callgraphanalyzer.Advice#getSignature <em>Signature</em>}</li>
 *   <li>{@link it.unisannio.rcost.callgraphanalyzer.Advice#getPointcutExpression <em>Pointcut Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.unisannio.rcost.callgraphanalyzer.CallGraphPackage#getAdvice()
 * @model
 * @generated
 */
public interface Advice extends NodeLeaf {

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
	 * @see it.unisannio.rcost.callgraphanalyzer.CallGraphPackage#getAdvice_IsStrictFp()
	 * @model
	 * @generated
	 */
	boolean isIsStrictFp();

	/**
	 * Sets the value of the '{@link it.unisannio.rcost.callgraphanalyzer.Advice#isIsStrictFp <em>Is Strict Fp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Strict Fp</em>' attribute.
	 * @see #isIsStrictFp()
	 * @generated
	 */
	void setIsStrictFp(boolean value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see #setKind(String)
	 * @see it.unisannio.rcost.callgraphanalyzer.CallGraphPackage#getAdvice_Kind()
	 * @model
	 * @generated
	 */
	String getKind();

	/**
	 * Sets the value of the '{@link it.unisannio.rcost.callgraphanalyzer.Advice#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see #getKind()
	 * @generated
	 */
	void setKind(String value);

	/**
	 * Returns the value of the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Id</em>' attribute.
	 * @see #setLocalId(int)
	 * @see it.unisannio.rcost.callgraphanalyzer.CallGraphPackage#getAdvice_LocalId()
	 * @model
	 * @generated
	 */
	int getLocalId();

	/**
	 * Sets the value of the '{@link it.unisannio.rcost.callgraphanalyzer.Advice#getLocalId <em>Local Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Id</em>' attribute.
	 * @see #getLocalId()
	 * @generated
	 */
	void setLocalId(int value);

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
	 * @see it.unisannio.rcost.callgraphanalyzer.CallGraphPackage#getAdvice_Signature()
	 * @model
	 * @generated
	 */
	String getSignature();

	/**
	 * Sets the value of the '{@link it.unisannio.rcost.callgraphanalyzer.Advice#getSignature <em>Signature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature</em>' attribute.
	 * @see #getSignature()
	 * @generated
	 */
	void setSignature(String value);

	/**
	 * Returns the value of the '<em><b>Pointcut Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pointcut Expression</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pointcut Expression</em>' attribute.
	 * @see #setPointcutExpression(String)
	 * @see it.unisannio.rcost.callgraphanalyzer.CallGraphPackage#getAdvice_PointcutExpression()
	 * @model
	 * @generated
	 */
	String getPointcutExpression();

	/**
	 * Sets the value of the '{@link it.unisannio.rcost.callgraphanalyzer.Advice#getPointcutExpression <em>Pointcut Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pointcut Expression</em>' attribute.
	 * @see #getPointcutExpression()
	 * @generated
	 */
	void setPointcutExpression(String value);
} // Advice
