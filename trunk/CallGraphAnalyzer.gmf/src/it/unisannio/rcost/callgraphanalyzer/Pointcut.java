/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unisannio.rcost.callgraphanalyzer;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pointcut</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.unisannio.rcost.callgraphanalyzer.Pointcut#getScopeModifier <em>Scope Modifier</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.unisannio.rcost.callgraphanalyzer.CallGraphPackage#getPointcut()
 * @model
 * @generated
 */
public interface Pointcut extends NodeLeaf {

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
	 * @see it.unisannio.rcost.callgraphanalyzer.CallGraphPackage#getPointcut_ScopeModifier()
	 * @model
	 * @generated
	 */
	ScopeModifier getScopeModifier();

	/**
	 * Sets the value of the '{@link it.unisannio.rcost.callgraphanalyzer.Pointcut#getScopeModifier <em>Scope Modifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope Modifier</em>' attribute.
	 * @see it.unisannio.rcost.callgraphanalyzer.ScopeModifier
	 * @see #getScopeModifier()
	 * @generated
	 */
	void setScopeModifier(ScopeModifier value);
} // Pointcut
