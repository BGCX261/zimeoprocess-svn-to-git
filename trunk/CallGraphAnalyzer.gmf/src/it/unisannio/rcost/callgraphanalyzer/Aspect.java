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
 * A representation of the model object '<em><b>Aspect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.unisannio.rcost.callgraphanalyzer.Aspect#getPointcutsList <em>Pointcuts</em>}</li>
 *   <li>{@link it.unisannio.rcost.callgraphanalyzer.Aspect#getAdvicesList <em>Advices</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.unisannio.rcost.callgraphanalyzer.CallGraphPackage#getAspect()
 * @model
 * @generated
 */
public interface Aspect extends it.unisannio.rcost.callgraphanalyzer.Class {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Pointcut[] getPointcuts();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Pointcut getPointcuts(int index);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	int getPointcutsLength();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setPointcuts(Pointcut[] newPointcuts);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setPointcuts(int index, Pointcut element);

	/**
	 * Returns the value of the '<em><b>Pointcuts</b></em>' containment reference list.
	 * The list contents are of type {@link it.unisannio.rcost.callgraphanalyzer.Pointcut}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pointcuts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pointcuts</em>' containment reference list.
	 * @see it.unisannio.rcost.callgraphanalyzer.CallGraphPackage#getAspect_Pointcuts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Pointcut> getPointcutsList();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Advice[] getAdvices();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Advice getAdvices(int index);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	int getAdvicesLength();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setAdvices(Advice[] newAdvices);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setAdvices(int index, Advice element);

	/**
	 * Returns the value of the '<em><b>Advices</b></em>' containment reference list.
	 * The list contents are of type {@link it.unisannio.rcost.callgraphanalyzer.Advice}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Advices</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Advices</em>' containment reference list.
	 * @see it.unisannio.rcost.callgraphanalyzer.CallGraphPackage#getAspect_Advices()
	 * @model containment="true"
	 * @generated
	 */
	EList<Advice> getAdvicesList();

	void addAdvice(Advice advice);

	void addPointcut(Pointcut pointcut);

} // Aspect
