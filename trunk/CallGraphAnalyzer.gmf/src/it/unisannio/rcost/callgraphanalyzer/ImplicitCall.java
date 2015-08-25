/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unisannio.rcost.callgraphanalyzer;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Implicit Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.unisannio.rcost.callgraphanalyzer.ImplicitCall#getJoinPointShadow <em>Join Point Shadow</em>}</li>
 *   <li>{@link it.unisannio.rcost.callgraphanalyzer.ImplicitCall#getJoinPointShadowType <em>Join Point Shadow Type</em>}</li>
 *   <li>{@link it.unisannio.rcost.callgraphanalyzer.ImplicitCall#getSourceLine <em>Source Line</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.unisannio.rcost.callgraphanalyzer.CallGraphPackage#getImplicitCall()
 * @model
 * @generated
 */
public interface ImplicitCall extends JoinPointShadow {

	/**
	 * Returns the value of the '<em><b>Join Point Shadow</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Join Point Shadow</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Join Point Shadow</em>' reference.
	 * @see #setJoinPointShadow(JoinPointShadow)
	 * @see it.unisannio.rcost.callgraphanalyzer.CallGraphPackage#getImplicitCall_JoinPointShadow()
	 * @model
	 * @generated
	 */
	JoinPointShadow getJoinPointShadow();

	/**
	 * Sets the value of the '{@link it.unisannio.rcost.callgraphanalyzer.ImplicitCall#getJoinPointShadow <em>Join Point Shadow</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Join Point Shadow</em>' reference.
	 * @see #getJoinPointShadow()
	 * @generated
	 */
	void setJoinPointShadow(JoinPointShadow value);

	/**
	 * Returns the value of the '<em><b>Join Point Shadow Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Join Point Shadow Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Join Point Shadow Type</em>' attribute.
	 * @see #setJoinPointShadowType(String)
	 * @see it.unisannio.rcost.callgraphanalyzer.CallGraphPackage#getImplicitCall_JoinPointShadowType()
	 * @model
	 * @generated
	 */
	String getJoinPointShadowType();

	/**
	 * Sets the value of the '{@link it.unisannio.rcost.callgraphanalyzer.ImplicitCall#getJoinPointShadowType <em>Join Point Shadow Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Join Point Shadow Type</em>' attribute.
	 * @see #getJoinPointShadowType()
	 * @generated
	 */
	void setJoinPointShadowType(String value);

	/**
	 * Returns the value of the '<em><b>Source Line</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Line</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Line</em>' attribute.
	 * @see #setSourceLine(String)
	 * @see it.unisannio.rcost.callgraphanalyzer.CallGraphPackage#getImplicitCall_SourceLine()
	 * @model default="0"
	 * @generated
	 */
	String getSourceLine();

	/**
	 * Sets the value of the '{@link it.unisannio.rcost.callgraphanalyzer.ImplicitCall#getSourceLine <em>Source Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Line</em>' attribute.
	 * @see #getSourceLine()
	 * @generated
	 */
	void setSourceLine(String value);
} // ImplicitCall
