/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unisannio.rcost.callgraphanalyzer;

import it.unisannio.rcost.callgraphanalyzer.util.Criteria;

import java.util.Hashtable;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.unisannio.rcost.callgraphanalyzer.Graph#getNodesList <em>Nodes</em>}</li>
 *   <li>{@link it.unisannio.rcost.callgraphanalyzer.Graph#getFirstLevelGraph <em>First Level Graph</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.unisannio.rcost.callgraphanalyzer.CallGraphPackage#getGraph()
 * @model
 * @generated
 */
public interface Graph extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Node[] getNodes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Node getNodes(int index);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	int getNodesLength();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setNodes(Node[] newNodes);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setNodes(int index, Node element);

	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link it.unisannio.rcost.callgraphanalyzer.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see it.unisannio.rcost.callgraphanalyzer.CallGraphPackage#getGraph_Nodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Node> getNodesList();
	
	/**
	 * Returns the value of the '<em><b>First Level Graph</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Level Graph</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Level Graph</em>' reference.
	 * @see #setFirstLevelGraph(Graph)
	 * @see it.unisannio.rcost.callgraphanalyzer.CallGraphPackage#getGraph_FirstLevelGraph()
	 * @model
	 * @generated
	 */
	Graph getFirstLevelGraph();

	/**
	 * Sets the value of the '{@link it.unisannio.rcost.callgraphanalyzer.Graph#getFirstLevelGraph <em>First Level Graph</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Level Graph</em>' reference.
	 * @see #getFirstLevelGraph()
	 * @generated
	 */
	void setFirstLevelGraph(Graph value);

	/**
	 * restituisce un sottografo del grafo su cui è invocato in base ai criteri passati
	 * @param criteria
	 * @return
	 */
	public Graph getSubGraph(Criteria criteria);
	
	/**
	 * restituisce il grafo dei Package che rispetta gli stessi criteri del grafo su cui è invocato
	 * In pratica è il grafo stesso ma ad un livello di astrazione di Pacakge
	 * @return
	 */
	public Graph getPackageGraph();
	
	/**
	 * restituisce il grafo delle Classi/Aspetti che rispetta gli stessi criteri del grafo su cui è invocato
	 * In pratica è il grafo stesso ma ad un livello di astrazione di Classi e Aspetti
	 * @return
	 */
	public Graph getClassAspectGraph();
	
	/**
	 * restituisce il grafo dei Metodi/Advice che rispetta gli stessi criteri del grafo su cui è invocato
	 * In pratica è il grafo stesso ma ad un livello di astrazione di Metodi e Advice
	 * @return
	 */
	public Graph getMethodAdviceGraph();
	
	public void setCriteria(Criteria criteria);
	
	public Criteria getCriteria();

	public Hashtable<Integer, Field> getFieldHash();
	
	public Hashtable<Integer, Method> getMethodHash();
	
//	public Hashtable<Integer, Pointcut> getPointcutHash();
	
	public Hashtable<Integer, Advice> getAdviceHash();
	
	public Hashtable<Integer, Class> getClassHash();
	
	public Hashtable<Integer, Aspect> getAspectHash();
	
	public Hashtable<Integer, Interface> getInterfaceHash();
	
	public Hashtable<String, Package> getPackageHash();
	
	public void clearAllHash();
	
	public boolean cointains(Node node);

	public Node getNodeByHash(Node element);

} // Graph
