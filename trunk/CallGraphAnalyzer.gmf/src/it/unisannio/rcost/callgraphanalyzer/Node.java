/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unisannio.rcost.callgraphanalyzer;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.unisannio.rcost.callgraphanalyzer.Node#getInEdgesList <em>In Edges</em>}</li>
 *   <li>{@link it.unisannio.rcost.callgraphanalyzer.Node#getOutEdgesList <em>Out Edges</em>}</li>
 *   <li>{@link it.unisannio.rcost.callgraphanalyzer.Node#getName <em>Name</em>}</li>
 *   <li>{@link it.unisannio.rcost.callgraphanalyzer.Node#getNodeContainer <em>Node Container</em>}</li>
 *   <li>{@link it.unisannio.rcost.callgraphanalyzer.Node#getIMember <em>IMember</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.unisannio.rcost.callgraphanalyzer.CallGraphPackage#getNode()
 * @model abstract="true"
 */
public interface Node extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	Edge[] getInEdges();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	void setInEdges(Edge[] newInEdges);

	/**
	 * Returns the value of the '<em><b>In Edges</b></em>' containment reference list.
	 * The list contents are of type {@link it.unisannio.rcost.callgraphanalyzer.Edge}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Edges</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Edges</em>' containment reference list.
	 * @see it.unisannio.rcost.callgraphanalyzer.CallGraphPackage#getNode_InEdges()
	 * @model containment="true"
	 */
	List<Edge> getInEdgesList();
	
	@SuppressWarnings("unchecked")
	Edge[] getInEdgesByType(java.lang.Class type);

	public boolean removeInEdge(Edge inEdge);
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	Edge[] getOutEdges();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	void setOutEdges(Edge[] newOutEdges);

	/**
	 * Returns the value of the '<em><b>Out Edges</b></em>' containment reference list.
	 * The list contents are of type {@link it.unisannio.rcost.callgraphanalyzer.Edge}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Edges</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Edges</em>' containment reference list.
	 * @see it.unisannio.rcost.callgraphanalyzer.CallGraphPackage#getNode_OutEdges()
	 * @model containment="true"
	 * @generated
	 */
	List<Edge> getOutEdgesList();
	
	Edge[] getOutCallEdges();
	
	@SuppressWarnings("unchecked")
	Edge[] getOutEdgesByType(java.lang.Class type);

	public boolean removeOutEdge(Edge outEdge);
	
	public void addInEdge(Edge element);
	
	public void addOutEdge(Edge element);
	
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
	 * @see it.unisannio.rcost.callgraphanalyzer.CallGraphPackage#getNode_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link it.unisannio.rcost.callgraphanalyzer.Node#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Node Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node Container</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Container</em>' reference.
	 * @see #setNodeContainer(NodeContainer)
	 * @see it.unisannio.rcost.callgraphanalyzer.CallGraphPackage#getNode_NodeContainer()
	 * @model
	 * @generated
	 */
	NodeContainer getNodeContainer();

	/**
	 * Sets the value of the '{@link it.unisannio.rcost.callgraphanalyzer.Node#getNodeContainer <em>Node Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Container</em>' reference.
	 * @see #getNodeContainer()
	 * @generated
	 */
	void setNodeContainer(NodeContainer value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see it.unisannio.rcost.callgraphanalyzer.CallGraphPackage#getNode_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link it.unisannio.rcost.callgraphanalyzer.Node#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);
	
	public Node clone();
} // Node
