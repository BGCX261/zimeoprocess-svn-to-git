/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unisannio.rcost.callgraphanalyzer.impl;

import it.unisannio.rcost.callgraphanalyzer.Advice;
import it.unisannio.rcost.callgraphanalyzer.Aspect;
import it.unisannio.rcost.callgraphanalyzer.CallGraphFactory;
import it.unisannio.rcost.callgraphanalyzer.CallGraphPackage;
import it.unisannio.rcost.callgraphanalyzer.Class;
import it.unisannio.rcost.callgraphanalyzer.Dependence;
import it.unisannio.rcost.callgraphanalyzer.DependenceDecorator;
import it.unisannio.rcost.callgraphanalyzer.Edge;
import it.unisannio.rcost.callgraphanalyzer.ExplicitCall;
import it.unisannio.rcost.callgraphanalyzer.ExplicitCallDecorator;
import it.unisannio.rcost.callgraphanalyzer.Extension;
import it.unisannio.rcost.callgraphanalyzer.Field;
import it.unisannio.rcost.callgraphanalyzer.Graph;
import it.unisannio.rcost.callgraphanalyzer.Implementation;
import it.unisannio.rcost.callgraphanalyzer.ImplicitCall;
import it.unisannio.rcost.callgraphanalyzer.ImplicitCallDecorator;
import it.unisannio.rcost.callgraphanalyzer.Interface;
import it.unisannio.rcost.callgraphanalyzer.JoinPointShadow;
import it.unisannio.rcost.callgraphanalyzer.Method;
import it.unisannio.rcost.callgraphanalyzer.Node;
import it.unisannio.rcost.callgraphanalyzer.NodeContainer;
import it.unisannio.rcost.callgraphanalyzer.NodeLeaf;
import it.unisannio.rcost.callgraphanalyzer.Package;
import it.unisannio.rcost.callgraphanalyzer.util.Criteria;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Graph</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link it.unisannio.rcost.callgraphanalyzer.impl.GraphImpl#getNodesList <em>Nodes</em>}</li>
 * </ul>
 * </p>
 * 
 */
public class GraphImpl extends EObjectImpl implements Graph {
	private class NodeContainerEdgeCounter {
		// public int outEdgesCounter;
		public List<Edge> outEdgesList = new ArrayList<Edge>();
		public NodeContainer container;
	}

	/**
	 * The empty value for the '{@link #getNodes() <em>Nodes</em>}' array
	 * accessor. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getNodes()
	 * @generated
	 * @ordered
	 */
	protected static final Node[] NODES_EEMPTY_ARRAY = new Node[0];

	private final Hashtable<Integer, Method> methodHash = new Hashtable<Integer, Method>();

	private final Hashtable<Integer, Field> fieldHash = new Hashtable<Integer, Field>();

	private final Hashtable<Integer, Advice> adviceHash = new Hashtable<Integer, Advice>();

	private final Hashtable<String, Package> packageHash = new Hashtable<String, Package>();

	private final Hashtable<Integer, Class> classHash = new Hashtable<Integer, Class>();

	private final Hashtable<Integer, Aspect> aspectHash = new Hashtable<Integer, Aspect>();

	private final Hashtable<Integer, Interface> interfaceHash = new Hashtable<Integer, Interface>();

	/**
	 * The cached value of the '{@link #getNodesList() <em>Nodes</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getNodesList()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> nodes;

	/**
	 * The cached value of the '{@link #getFirstLevelGraph() <em>First Level Graph</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getFirstLevelGraph()
	 * @generated
	 * @ordered
	 */
	protected Graph firstLevelGraph;

	private Criteria criteria;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected GraphImpl() {
		super();
	}

	private void addNodeContainer(Node node) {
		// Alle classi/aspetti nella root del progetto e' associato un
		// pacchetto di default o il nodeContainer e' null? In questo caso e'
		// stato assunto che il nodeContainer e' null.

		NodeContainer container = node.getNodeContainer();
		if (container == null) {
			BasicEList<Node> newList = (BasicEList<Node>) getNodesList();
			if (!newList.contains(node))
				newList.add(node);
		} else {
			addNodeContainer(container);
		}

	}

	private void addRelationToGraph(Graph subGraph, GraphImpl sourceGraph,
			Enumeration<?> enumeration) {
		while (enumeration.hasMoreElements()) {
			Edge edge = null;
			Node elem = (Node) enumeration.nextElement();
			Node original = sourceGraph.getNodeByHash(elem);

			Edge[] edges = original.getOutEdges();
			for (int i = 0; i < edges.length; i++) {
				Node source = subGraph.getNodeByHash(edges[i].getSource());
				Node target = subGraph.getNodeByHash(edges[i].getTarget());

				if (edges[i] instanceof Implementation) {
					edge = CallGraphFactory.eINSTANCE.createImplementation();

					edge.setTarget(target);
					edge.setSource(source);
				} else if (edges[i] instanceof Extension) {
					edge = CallGraphFactory.eINSTANCE.createExtension();

					edge.setTarget(target);
					edge.setSource(source);
				}
			}
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Graph basicGetFirstLevelGraph() {
		return firstLevelGraph;
	}

	public void clearAllHash() {
		this.methodHash.clear();
		this.fieldHash.clear();
		this.adviceHash.clear();
		// this.pointcutHash.clear();
		this.packageHash.clear();
		this.classHash.clear();
		this.aspectHash.clear();
		this.interfaceHash.clear();
	}

	private Node cloneGraphFromSource(GraphImpl newGraph, Node node) {
		Node nodeClone = cloneNode(newGraph, node);

		Edge[] edges = node.getOutCallEdges();

		for (int i = 0; i < edges.length; i++) {
			if (!nodeClone.getOutEdgesList().contains(edges[i])) {
				Node target = cloneNode(newGraph, edges[i].getTarget());
				Edge edge = null;

				if (edges[i] instanceof ImplicitCall) {
					edge = CallGraphFactory.eINSTANCE.createImplicitCall();
					((ImplicitCall) edge).setSourceLine(((ImplicitCall)edges[i]).getSourceLine());
					((ImplicitCall) edge).setJoinPointShadowType(((ImplicitCall)edges[i]).getJoinPointShadowType());
					Dependence originalDependence = (Dependence) ((ImplicitCall) edges[i]).getJoinPointShadow();
					if(originalDependence != null) {
						Dependence cloneDependence = CallGraphFactory.eINSTANCE.createDependence();
						
						cloneDependence.setIsGet(originalDependence.isIsGet());
						cloneDependence.setIsSet(originalDependence.isIsSet());
						((ImplicitCall) edge).setJoinPointShadow(cloneDependence);
						
						cloneDependence.setTarget(cloneNode(newGraph, originalDependence.getTarget()));
						cloneDependence.setSource(cloneNode(newGraph, originalDependence.getSource()));
					}
				} else if (edges[i] instanceof ExplicitCall) {
					edge = CallGraphFactory.eINSTANCE.createExplicitCall();
					((ExplicitCall) edge).setGroupId(((ExplicitCall) edges[i]).getGroupId());
				}
				
				edge.setTarget(target);
				edge.setSource(nodeClone);
				
				cloneGraphFromSource(newGraph, edges[i].getTarget());
			}

//			if (nodeClone.getOutEdgesList().containsAll(Arrays.asList(edges)))
//				return nodeClone;
		}

		return nodeClone;
	}

	private Edge cloneJoinPointShadow(GraphImpl graph,
			JoinPointShadow joinPointShadow, ImplicitCall call) {
		if (joinPointShadow != null) {
			Node source = cloneNode(graph, joinPointShadow.getSource());
			Node target = cloneNode(graph, joinPointShadow.getTarget());

			Dependence newEdge = CallGraphFactory.eINSTANCE.createDependence();
			
			newEdge.setIsGet(((Dependence) joinPointShadow).isIsGet());
			newEdge.setIsSet(((Dependence) joinPointShadow).isIsSet());
			
			newEdge.addHandler(call);
			
			newEdge.setTarget(target);
			newEdge.setSource(source);

		}
		return null;
	}

	/**
	 * Duplica il nodo ricevuto in ingresso in maniera profonda. In particolare
	 * duplica anche i suoi nodi container. Il nodo viene duplicato solo se non
	 * precedentemente duplicato, in quest'ultimo caso viene recuperata
	 * l'istanza precedentemente duplicata. Questo approccio consente di evitare
	 * di creare piu' path con gli stessi nodi
	 * 
	 * @param graphImpl
	 * 
	 * @param source
	 * @return nodo duplicato.
	 */
	private Node cloneNode(GraphImpl graph, Node source) {
		Node newSource = graph.getNodeByHash(source);

		if (newSource == null) {
			newSource = source.clone();
			
			if (source instanceof NodeContainer) {
				if (source instanceof Aspect) {
					graph.aspectHash.put(source.getId(), (Aspect) newSource);
				} else if (source instanceof Class) {
					graph.classHash.put(source.getId(), (Class) newSource);
				} else if (source instanceof Interface) {
					graph.interfaceHash.put(source.getId(), (Interface) newSource);
				} else if (source instanceof Package) {
					graph.packageHash.put(source.getName(), (Package) newSource);
				} else {
					return null;
				}
			} else if (source instanceof NodeLeaf) {
				if (source instanceof Method) {
					graph.methodHash.put(source.getId(), (Method) newSource);
				} else if (source instanceof Advice) {
					graph.adviceHash.put(source.getId(), (Advice) newSource);
				} else if (source instanceof Field) {
					graph.fieldHash.put(source.getId(), (Field) newSource);
				} else {
					return null;
				}
			}

			NodeContainer container = source.getNodeContainer();
			if (container != null)
				newSource.setNodeContainer((NodeContainer) cloneNode(graph, container));
		}

		return newSource;
	}

	public boolean cointains(Node node) {
		Node newNode = this.getNodeByHash(node);
		if (newNode != null && node != null && newNode.equals(node)) {
			Node newNodeContainer = newNode.getNodeContainer();
			Node nodeContainer = node.getNodeContainer();
			while (newNodeContainer != null || nodeContainer != null) {
				if (newNodeContainer == null || nodeContainer == null)
					return false;

				if (!newNodeContainer.equals(nodeContainer))
					return false;

				newNodeContainer = newNodeContainer.getNodeContainer();
				nodeContainer = nodeContainer.getNodeContainer();
			}

			return true;
		} else
			return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CallGraphPackage.GRAPH__NODES:
			return getNodesList();
		case CallGraphPackage.GRAPH__FIRST_LEVEL_GRAPH:
			return null;
			// if (resolve)
			// return getFirstLevelGraph();
			// return basicGetFirstLevelGraph();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CallGraphPackage.GRAPH__NODES:
			return ((InternalEList<?>) getNodesList()).basicRemove(otherEnd,
					msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case CallGraphPackage.GRAPH__NODES:
			return nodes != null && !nodes.isEmpty();
		case CallGraphPackage.GRAPH__FIRST_LEVEL_GRAPH:
			return firstLevelGraph != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final GraphImpl other = (GraphImpl) obj;
		if (criteria == null) {
			if (other.criteria != null)
				return false;
		} else if (!criteria.equals(other.criteria))
			return false;
		if (nodes == null) {
			if (other.nodes != null)
				return false;
		} else if (!nodes.equals(other.nodes))
			return false;
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case CallGraphPackage.GRAPH__NODES:
			getNodesList().clear();
			getNodesList().addAll((Collection<? extends Node>) newValue);
			return;
		case CallGraphPackage.GRAPH__FIRST_LEVEL_GRAPH:
			setFirstLevelGraph((Graph) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CallGraphPackage.Literals.GRAPH;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case CallGraphPackage.GRAPH__NODES:
			getNodesList().clear();
			return;
		case CallGraphPackage.GRAPH__FIRST_LEVEL_GRAPH:
			setFirstLevelGraph((Graph) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * Questo algorirmo lavora solo sui nodi di tipo NodeLeaf, cioe', method,
	 * advice, field e pointcut Il nodo <code>node</code> e' un elemento del
	 * grafo di origine. L'elemento <code>graph</code> contiene il nuovo grafo
	 */
	private NodeLeaf extractSubGraph(Criteria criteria, GraphImpl graph,
			NodeLeaf node) {
		Edge[] outEdges = node.getOutCallEdges();

		/* ------ NODO FINALE - inizio ------ */
		// Verifica che sia un nodo finale del percorso
		if (outEdges == null || outEdges.length == 0)
			if (isValidGraphLeaf(criteria, node, outEdges))
				return (NodeLeaf) cloneNode((GraphImpl) graph, node);
			else
				return null;

		/* ------ NODO FINALE - fine ------ */

		/* ------ NODO GIA' ANALIZZATO - inizio ------ */
		// Verifica che il nodo non sia gia' stato analizzato (quindi inserito
		// nell'hash). Serve ad evitare di ricreare path gia' creati
		NodeLeaf nodeTmp = (NodeLeaf) graph.getNodeByHash(node);

		if (nodeTmp != null)
			return nodeTmp;
		/* ------ NODO GIA' ANALIZZATO - fine ------ */

		// Clona il nodo ricevuto in ingresso e lo inserisce nell'hash
		// di 'graph'
		NodeLeaf nodeSourceClone = (NodeLeaf) cloneNode((GraphImpl) graph, node);
		Criteria.PathOptions path = criteria.getPathOptions();

		for (int i = 0; i < outEdges.length; i++) {
			Edge edge = outEdges[i];
			Edge newEdge = null;

			// L'arco e' una chiamata esplicita e i criteri di selezione dei
			// percorsi lo includono
			if (edge instanceof ExplicitCall
					&& (path == Criteria.PathOptions.ALL_PATH
							|| path == Criteria.PathOptions.ONLY_OBJECT)) {
				Node nodeTargetClone = extractSubGraph(criteria, graph,
						(NodeLeaf) edge.getTarget());

				if (nodeTargetClone != null) {
					newEdge = CallGraphFactory.eINSTANCE.createExplicitCall();

					((ExplicitCall) newEdge).setGroupId(((ExplicitCall) edge)
							.getGroupId());
					
					newEdge.setTarget(nodeTargetClone);
					newEdge.setSource(nodeSourceClone);
				}
			}
			// L'arco e' una chiamata implicita e i criteri di selezione dei
			// percorsi lo includono
			else if (edge instanceof ImplicitCall
					&& (path == Criteria.PathOptions.ALL_PATH
							|| path == Criteria.PathOptions.ONLY_ASPECT)) {
				Node nodeTargetClone = extractSubGraph(criteria, graph,
						(NodeLeaf) edge.getTarget());

				if (nodeTargetClone != null) {
					newEdge = CallGraphFactory.eINSTANCE.createImplicitCall();

					
					((ImplicitCall) newEdge).setSourceLine(((ImplicitCall) outEdges[i]).getSourceLine());
					((ImplicitCall) newEdge)
							.setJoinPointShadowType(((ImplicitCall) outEdges[i])
									.getJoinPointShadowType());

					newEdge.setTarget(nodeTargetClone);
					newEdge.setSource(nodeSourceClone);
					cloneJoinPointShadow((GraphImpl) graph,
							((ImplicitCall) outEdges[i]).getJoinPointShadow(),
							(ImplicitCall) newEdge);
				}
			}
		}

		return nodeSourceClone;
	}

	public Hashtable<Integer, Advice> getAdviceHash() {
		return this.adviceHash;
	}

	public Hashtable<Integer, Aspect> getAspectHash() {
		return this.aspectHash;
	}

	public Graph getClassAspectGraph() {
		Criteria newCriteria;

		switch (this.criteria.getGraphType()) {
		case FULL_PACKAGE:
		case PARTIAL_PACKAGE:
		case FULL_CLASS:
		case PARTIAL_CLASS:
			if(this.firstLevelGraph != null)
				return this.firstLevelGraph.getClassAspectGraph();
			else
				return this.getMethodAdviceGraph().getClassAspectGraph();
		case FULL_METHOD:
			newCriteria = criteria.clone();
			newCriteria.setGraphType(Criteria.GraphType.FULL_CLASS);
			break;
		case PARTIAL_METHOD:
			newCriteria = criteria.clone();
			newCriteria.setGraphType(Criteria.GraphType.PARTIAL_CLASS);
			break;
		default:
			return null;
		}

		Graph graph = CallGraphFactory.eINSTANCE.createGraph();
		graph.setFirstLevelGraph(this.getMethodAdviceGraph());
		graph.setCriteria(newCriteria);

		Node[] sources = criteria.getSources();

		List<NodeContainer> newSources = new ArrayList<NodeContainer>();
		List<Package> tmpPackages = new ArrayList<Package>();
		for (int i = 0; i < sources.length; i++) {
			NodeContainer sourceTmp = getSynthesizedGraph((GraphImpl) graph,
					(NodeLeaf) sources[i], false,
					new ArrayList<NodeContainerEdgeCounter>());

			if (!newSources.contains(sourceTmp)) {
				newSources.add(sourceTmp);
				tmpPackages.addAll(graph.getPackageHash().values());
			}
		}
//		graph.setNodes(newSources.toArray(new NodeContainer[newSources
//						.size()]));

		graph.setNodes(tmpPackages.toArray(new Package[tmpPackages.size()]));
		// Una volta estratto il grafo inserisce le relazioni di
		// implementazione e generalizzazione tra i moduli
		addRelationToGraph(graph, this, graph.getInterfaceHash().elements());
		addRelationToGraph(graph, this, graph.getClassHash().elements());
		addRelationToGraph(graph, this, graph.getAspectHash().elements());

		return graph;
	}

	public Hashtable<Integer, Class> getClassHash() {
		return this.classHash;
	}

	public Criteria getCriteria() {
		return criteria;
	}

	public Hashtable<Integer, Field> getFieldHash() {
		return this.fieldHash;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Graph getFirstLevelGraph() {
		if (firstLevelGraph != null && firstLevelGraph.eIsProxy()) {
			InternalEObject oldFirstLevelGraph = (InternalEObject) firstLevelGraph;
			firstLevelGraph = (Graph) eResolveProxy(oldFirstLevelGraph);
			if (firstLevelGraph != oldFirstLevelGraph) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CallGraphPackage.GRAPH__FIRST_LEVEL_GRAPH,
							oldFirstLevelGraph, firstLevelGraph));
			}
		}
		return firstLevelGraph;
	}
	
	private List<NodeLeaf> getFlattenNodeLeafs(Node node) {
		List<NodeLeaf> leafs = new ArrayList<NodeLeaf>();

		if (node instanceof Interface) {
			leafs.addAll(((Interface) node).getMethodsList());

			if (node instanceof Aspect) {
				leafs.addAll(((Aspect) node).getAdvicesList());
			}
		} else if (node instanceof Package) {
			List<Interface> inner = ((Package) node).getInnerModulesList();

			for (Interface interface_ : inner) {
				leafs.addAll(getFlattenNodeLeafs(interface_));
			}

			List<Package> innerPackage = ((Package) node).getPackagesList();

			for (Package pack : innerPackage) {
				leafs.addAll(getFlattenNodeLeafs(pack));
			}
		} else if (node instanceof NodeLeaf)
			leafs.add((NodeLeaf) node);

		return leafs;
	}

	public Hashtable<Integer, Interface> getInterfaceHash() {
		return this.interfaceHash;
	}

	public Graph getMethodAdviceGraph() {
		switch (this.criteria.getGraphType()) {
		case FULL_PACKAGE:
		case PARTIAL_PACKAGE:
		case FULL_CLASS:
		case PARTIAL_CLASS:
			return this.firstLevelGraph.getMethodAdviceGraph();
//			return this.firstLevelGraph.getSubGraph(criteria);
		case FULL_METHOD:
		case PARTIAL_METHOD:
		default:
			return this.getSubGraph(criteria);
		}
	}

	public Hashtable<Integer, Method> getMethodHash() {
		return this.methodHash;
	}

	public Node getNodeByHash(Node node) {
		if (node instanceof NodeLeaf) {
			if (node instanceof Field) {
				return fieldHash.get(node.getId());
			} else if (node instanceof Advice) {
				return adviceHash.get(node.getId());
			} else if (node instanceof Method) {
				return methodHash.get(node.getId());
				// } else if (node instanceof Pointcut) {
				// return graph.pointcutHash.get(node.getId());
			}
		} else if (node instanceof NodeContainer) {
			if (node instanceof Aspect) {
				return aspectHash.get(node.getId());
			} else if (node instanceof Class) {
				return classHash.get(node.getId());
			} else if (node instanceof Interface) {
				return interfaceHash.get(node.getId());
			} else if (node instanceof Package) {
				return packageHash.get(node.getName());
			}
		}

		return null;
	}

	private NodeContainerEdgeCounter getNodeContainerEdgeCounterFromList(
			List<NodeContainerEdgeCounter> counters, NodeContainer container,
			boolean isPackage) {
		for (NodeContainerEdgeCounter nodeContainerEdgeCounter : counters) {
			if (nodeContainerEdgeCounter.container != null
					&& nodeContainerEdgeCounter.container.equals(container))
				return nodeContainerEdgeCounter;
		}

		NodeContainerEdgeCounter newCounter = new NodeContainerEdgeCounter();
		newCounter.container = container;
		// newCounter.outEdgesCounter = 0;

		getOutEdgesCounterInnerModules(container, newCounter, isPackage);

		counters.add(newCounter);

		return newCounter;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public Node[] getNodes() {
		if (nodes == null || nodes.isEmpty())
			return NODES_EEMPTY_ARRAY;
		BasicEList<Node> list = (BasicEList<Node>) nodes;
		list.shrink();
		return (Node[]) list.data();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Node getNodes(int index) {
		return getNodesList().get(index);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public int getNodesLength() {
		return nodes == null ? 0 : nodes.size();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Node> getNodesList() {
		if (nodes == null) {
			nodes = new EObjectContainmentEList<Node>(Node.class, this,
					CallGraphPackage.GRAPH__NODES);
		}
		return nodes;
	}

	private void getOutEdgesCounterInnerModules(NodeContainer container,
			NodeContainerEdgeCounter newCounter, boolean isPackage) {
		if (container instanceof Aspect) {
			List<Advice> advices = ((Aspect) container).getAdvicesList();

			for (Advice advice : advices) {
				newCounter.outEdgesList.addAll(advice.getOutEdgesList());
				// newCounter.outEdgesCounter +=
				// advice.getOutEdgesList().size();
			}
		}

		if (container instanceof Interface) {
			List<Method> methods = ((Interface) container).getMethodsList();

			for (Method method : methods) {
				newCounter.outEdgesList.addAll(method.getOutEdgesList());
				// newCounter.outEdgesCounter +=
				// method.getOutEdgesList().size();
			}
		}

		if (isPackage) {
			List<Interface> interfaces = ((NodeContainer) container)
					.getInnerModulesList();

			for (Interface interface_ : interfaces) {
				getOutEdgesCounterInnerModules(interface_, newCounter,
						isPackage);
			}
		}
	}

	public Graph getPackageGraph() {
		Criteria newCriteria;

		switch (this.criteria.getGraphType()) {
		case FULL_PACKAGE:
		case PARTIAL_PACKAGE:
		case FULL_CLASS:
		case PARTIAL_CLASS:
			if(this.firstLevelGraph != null)
				return this.firstLevelGraph.getPackageGraph();
			else
				return this.getMethodAdviceGraph().getPackageGraph();
		case FULL_METHOD:
			newCriteria = criteria.clone();
			newCriteria.setGraphType(Criteria.GraphType.FULL_PACKAGE);
			break;
		case PARTIAL_METHOD:
			newCriteria = criteria.clone();
			newCriteria.setGraphType(Criteria.GraphType.PARTIAL_PACKAGE);
			break;
		default:
			return null;
		}

		Graph graph = CallGraphFactory.eINSTANCE.createGraph();
		graph.setFirstLevelGraph(this.getMethodAdviceGraph());
		graph.setCriteria(newCriteria);

		Node[] sources = newCriteria.getSources();

		List<NodeContainer> newSources = new ArrayList<NodeContainer>();
		List<Package> tmpPackages = new ArrayList<Package>();
		for (int i = 0; i < sources.length; i++) {
			NodeContainer sourceTmp = getSynthesizedGraph((GraphImpl) graph,
					(NodeLeaf) sources[i], true,
					new ArrayList<NodeContainerEdgeCounter>());

			if (!newSources.contains(sourceTmp)) {
				newSources.add(sourceTmp);
				tmpPackages.addAll(graph.getPackageHash().values());
			}
		}

//		graph.setNodes(newSources.toArray(new NodeContainer[newSources.size()]));
		graph.setNodes(tmpPackages.toArray(new Package[tmpPackages.size()]));
		return graph;
	}

	public Hashtable<String, Package> getPackageHash() {
		return this.packageHash;
	}

	/**
	 * @param subGraph
	 * @param source
	 * @param target
	 * @param c
	 * @return
	 */
	private Graph getPathBetweenTwoNodes(Graph subGraph, Node source,
			Node target, Criteria c) {
		Graph graphTmp = CallGraphFactory.eINSTANCE.createGraph();
		c = c.clone();
		c.setSources(new Node[] { source });
		c.setTarget(subGraph.getNodeByHash(target));
		graphTmp.setCriteria(c);

		NodeLeaf[] leafs = c.getSources();
		List<NodeLeaf> newSources = new ArrayList<NodeLeaf>();
		List<Package> tmpPackages = new ArrayList<Package>();
		for (int j = 0; j < leafs.length; j++) {
			NodeLeaf subGraphSource = extractSubGraph(c, (GraphImpl) graphTmp,
					(NodeLeaf) subGraph.getNodeByHash(leafs[j]));
			
			if(subGraphSource != null){
				newSources.add(subGraphSource);
				tmpPackages.addAll(graphTmp.getPackageHash().values());
			}
		}

		if(newSources.size() == 0)
			return null;
		
		leafs = newSources.toArray(new NodeLeaf[newSources.size()]);

		c.setSources(leafs);
		graphTmp.setNodes(tmpPackages.toArray(new Package[tmpPackages.size()]));
		return graphTmp;
	}
	/**
	 * Crea in nuovo grafo che soddisfi i cretiri indicati
	 * Il grafo restituito sar� di livello Partial_Method
	 */
	public Graph getSubGraph(Criteria criteria) {

		Graph subGraph = CallGraphFactory.eINSTANCE.createGraph();
		/*------------- Inizio creazione del grafo ------------------*/
		/*
		 * Questo grafo e' composto dai soli path che rispecchiano i criteri di
		 * selezione dei percorsi (solo aspetti, solo ibridi, ....). Inoltre si
		 * considerano solo i percorsi che cominciano nei nodi source e
		 * finiscono nell'eventuale nodo target.
		 * 
		 */
		Node[] sources = getSubGraphFromSourcesToTarget(criteria, subGraph);

		/*------------- Fine creazione del grafo ------------------*/

		/*-------------------- Inizio - Considera i nodi intermedi ---------------------*/
		Node[] intermediaries = criteria.getLstIntermediary();
		if (intermediaries != null && intermediaries.length > 0) {
			Criteria c = criteria.clone();
			List<Graph> graphs = new ArrayList<Graph>();
			Graph graphTmp = null;
			if (criteria.isOrdered()) {
				for (int i = 0; i < sources.length; i++) {
					graphTmp = getPathBetweenTwoNodes(subGraph, sources[i], intermediaries[0], c);

					if(graphTmp != null)
						graphs.add(graphTmp);
					else {
						Graph emptyGraph = CallGraphFactory.eINSTANCE.createGraph();
						emptyGraph.setCriteria(c);
						return emptyGraph;
					}
				}

				for (int i = 0; i < intermediaries.length - 1; i++) {
					//Nel caso in cui un nodo intermedio sia un nodo container, vanno considerati tutti i nodi foglia in esso contenuti
					if(intermediaries[i] instanceof NodeContainer){
						List<NodeLeaf> flatten = getFlattenNodeLeafs(intermediaries[i]);
						List<Graph> graphsTemp = new ArrayList<Graph>();
						
						for (NodeLeaf nodeLeaf : flatten) {
							graphTmp = getPathBetweenTwoNodes(subGraph, nodeLeaf, intermediaries[i + 1], c);
							if(graphTmp != null)
								graphsTemp.add(graphTmp);
						}
						if(graphsTemp.size()==0){
							Graph emptyGraph = CallGraphFactory.eINSTANCE.createGraph();
							emptyGraph.setCriteria(c);
							return emptyGraph;
						}
						else{
							graphs.addAll(graphsTemp);
						}
					}
					else{
						graphTmp = getPathBetweenTwoNodes(subGraph, intermediaries[i], intermediaries[i + 1], c);

						if(graphTmp != null)
							graphs.add(graphTmp);
						
						else {
							Graph emptyGraph = CallGraphFactory.eINSTANCE.createGraph();
							emptyGraph.setCriteria(c);
							return emptyGraph;
						}
					}
				}

				// Prende i percorsi rimanenti fino alle foglie del sottografo
				// precedentemente estratto
				Criteria c1 = c.clone(); 
				Node source = subGraph.getNodeByHash(intermediaries[intermediaries.length - 1]);
				c1.setSource(source);
				graphTmp = CallGraphFactory.eINSTANCE.createGraph();
				NodeLeaf[] sourceLeafs = c1.getSources();
				List<Node> sourcesTemp = new ArrayList<Node>();
				List<Package> tmpPackages = new ArrayList<Package>();
				for (int i = 0; i < sourceLeafs.length; i++) {
					Node srcTmp = extractSubGraph(c1, (GraphImpl) graphTmp, (NodeLeaf)sourceLeafs[i]);
					if(srcTmp!=null){
						sourcesTemp.add(srcTmp);
						tmpPackages.addAll(graphTmp.getPackageHash().values());
					}
				}
//				Node srcTmp = extractSubGraph(c1, (GraphImpl) graphTmp, (NodeLeaf) source);
				
				c1.setSources(sourcesTemp.toArray(new Node[sourcesTemp.size()]));
				graphTmp.setCriteria(c1);
//				graphTmp.setNodes(sourcesTemp.toArray(new Node[sourcesTemp.size()]));
				graphTmp.setNodes(tmpPackages.toArray(new Package[tmpPackages.size()]));
				graphs.add(graphTmp);
			} else {//Percorsi con nodi non ordinati
				// Tiene traccia dei percorsi rilevati tra i vari nodi
				IntermediaryNodesGraph[] sourceNodesGraph = new IntermediaryNodesGraph[sources.length];
				IntermediaryNodesGraph[] intermediaryNodesGraph = new IntermediaryNodesGraph[intermediaries.length];
				for (int j = 0; j < sourceNodesGraph.length; j++) {
					sourceNodesGraph[j] = new IntermediaryNodesGraph(-1);
				}
				
				for (int j = 0; j < intermediaryNodesGraph.length; j++) {
					intermediaryNodesGraph[j] = new IntermediaryNodesGraph(j);
				}
				//Considera i percorsi dai nodi sorgenti fino ad ogni nodo intermedio
				for (int i = 0; i < sources.length; i++) {
					for (int j = 0; j < intermediaries.length; j++) {
						graphTmp = getPathBetweenTwoNodes(subGraph, sources[i], intermediaries[j], c);
						
						if(graphTmp != null) {
							sourceNodesGraph[i].addEdge(intermediaryNodesGraph[j]);
							graphs.add(graphTmp);
						}
					}
				}
				
				//Considera i percorsi tra le coppie di nodi intermedi
				for (int i = 0; i < intermediaries.length; i++) {
					//Nel caso in cui un nodo intermedio sia un nodo container, vanno considerati tutti i nodi foglia in esso contenuti
					if(intermediaries[i] instanceof NodeContainer){
						List<NodeLeaf> flatten = getFlattenNodeLeafs(intermediaries[i]);
//						List<Graph> graphsTemp = new ArrayList<Graph>();
						
						for (NodeLeaf nodeLeaf : flatten) {
//							graphTmp = getPathBetweenTwoNodes(subGraph, nodeLeaf, intermediaries[i + 1], c);
							for (int j = 0; j < intermediaries.length; j++) {
								if (i != j) {
									graphTmp = getPathBetweenTwoNodes(subGraph, nodeLeaf, intermediaries[j], c);
									
									if(graphTmp != null) {
										intermediaryNodesGraph[i].addEdge(intermediaryNodesGraph[j]);
										
										graphs.add(graphTmp);
									}
								}
							}
//							if(graphTmp != null)
//								graphsTemp.add(graphTmp);
						}
//						if(graphsTemp.size()==0){
//							Graph emptyGraph = CallGraphFactory.eINSTANCE.createGraph();
//							emptyGraph.setCriteria(c);
//							return emptyGraph;
//						}
//						else {
//							graphs.addAll(graphsTemp);
//						}
					}
					else {
						for (int j = 0; j < intermediaries.length; j++) {
							if (i != j) {
								graphTmp = getPathBetweenTwoNodes(subGraph, intermediaries[i], intermediaries[j], c);
								
								if(graphTmp != null) {
									intermediaryNodesGraph[i].addEdge(intermediaryNodesGraph[j]);
									
									graphs.add(graphTmp);
								}
							}
						}
					}
				}
				
				//Considera i percorsi dai nodi intermedi a quelli foglia solo se ci sono dei percorsi che attraversano tutti i nodi
				//fino ad arrivare allo stesso nodo intermedio
				c.setTarget(criteria.getTarget());
				for (int i = 0; i < intermediaries.length; i++) {
					boolean use = false;
					for (int j = 0; j < sourceNodesGraph.length && !use; j++) {
						//Crea un elenco di interi indicanti ciascuno la posizione di un nodo intermedio differente
						List<Integer> nodesToAnalyze = new ArrayList<Integer>();
						for (int k = 0; k < intermediaryNodesGraph.length; k++) {
							if(k != i)
								nodesToAnalyze.add(k);
						}
						//Verifica che esiste un percorso da un nodo sorgente fino al nodo intermedio 'i'
						use = sourceNodesGraph[j].existPath(null, nodesToAnalyze, i);
					}
					
					if(use) {
						Criteria c1 = c.clone(); 
						c1.setSource(intermediaries[i]);
						graphTmp = CallGraphFactory.eINSTANCE.createGraph();
						
						NodeLeaf[] sourceLeafs = c1.getSources();
						List<Node> sourcesTemp = new ArrayList<Node>();
						List<Package> tmpPackages = new ArrayList<Package>();
						for (int k = 0; k < sourceLeafs.length; k++) {
							Node srcTmp = extractSubGraph(c1, (GraphImpl) graphTmp, sourceLeafs[k]);
							if(srcTmp!=null){
								sourcesTemp.add(srcTmp);
								tmpPackages.addAll(graphTmp.getPackageHash().values());
							}
						}
//						Node srcTmp = extractSubGraph(c1, (GraphImpl) graphTmp, (NodeLeaf) source);
						
						c1.setSources(sourcesTemp.toArray(new Node[sourcesTemp.size()]));
						graphTmp.setCriteria(c1);
//						graphTmp.setNodes(sourcesTemp.toArray(new Node[sourcesTemp.size()]));
						graphTmp.setNodes(tmpPackages.toArray(new Package[tmpPackages.size()]));
						graphs.add(graphTmp);
						
//						Node srcTmp = extractSubGraph(c1, (GraphImpl) graphTmp, (NodeLeaf) subGraph.getNodeByHash(intermediaries[i]));
//						
//						c1.setSources(new Node[]{srcTmp});
//						graphTmp.setCriteria(c1);
//						graphTmp.setNodes(new Node[]{srcTmp});
//						graphs.add(graphTmp);
					}
				}
			}

			// Unisce tutti i grafi trovati
			subGraph = mergeGraphs(graphs);

			List<Node> newSources = new ArrayList<Node>();
			List<Package> tmpPackages = new ArrayList<Package>();
			for (int i = 0; i < sources.length; i++) {
				newSources.add(subGraph.getNodeByHash(sources[i]));
			}
			
			tmpPackages.addAll(subGraph.getPackageHash().values());
			
			sources = newSources.toArray(new Node[newSources.size()]);
			criteria.setSources(sources);
//			subGraph.setNodes(sources);
			subGraph.setNodes(tmpPackages.toArray(new Package[tmpPackages.size()]));
			subGraph.setCriteria(criteria);
		}
		/*-------------------- Fine - Considera i nodi intermedi ---------------------*/

		subGraph.getCriteria().setGraphType(Criteria.GraphType.PARTIAL_METHOD);
		
		// Una volta estratto il grafo inserisce le relazioni di
		// implementazione e generalizzazione tra i moduli
		addRelationToGraph(subGraph, this, subGraph.getInterfaceHash()
				.elements());
		addRelationToGraph(subGraph, this, subGraph.getClassHash().elements());
		addRelationToGraph(subGraph, this, subGraph.getAspectHash().elements());

		return subGraph;
	}

	/**
	 * Questo grafo e' composto dai soli path che rispecchiano i criteri di
	 * selezione dei percorsi (solo aspetti, solo ibridi, ....). Inoltre si
	 * considerano solo i percorsi che cominciano nei nodi source e finiscono
	 * nell'eventuale nodo target.
	 */
	private Node[] getSubGraphFromSourcesToTarget(Criteria criteria,
			Graph subGraph) {
		subGraph.setCriteria(criteria);

		NodeLeaf[] sources = criteria.getSources();
		Node originalSource = criteria.getSource();

		java.util.List<NodeLeaf> newNodes = new ArrayList<NodeLeaf>();
		List<Package> tmpPackages = new ArrayList<Package>();
		for (int i = 0; i < sources.length; i++) {
			Node source = sources[i];

			Node sourceTmp = this.getNodeByHash(source);
			if (sourceTmp instanceof Field) {
				Field fieldClone = (Field) cloneNode((GraphImpl) subGraph,
						sourceTmp);
				Edge[] edges = sourceTmp.getOutEdgesByType(Dependence.class);
				for (int j = 0; j < edges.length; j++) {
					EList<ImplicitCall> calls = ((Dependence) edges[i])
							.getHandlersList();
					Dependence dependence = CallGraphFactory.eINSTANCE
							.createDependence();
					Node leafClone = null;
					for (ImplicitCall implicitCall : calls) {

						Node advice = extractSubGraph(criteria,
								(GraphImpl) subGraph, (NodeLeaf) implicitCall
										.getTarget());
						if (leafClone == null)
							leafClone = cloneNode((GraphImpl) subGraph,
									edges[i].getTarget());

						ImplicitCall leafCloneToAdvice = CallGraphFactory.eINSTANCE
								.createImplicitCall();
						leafCloneToAdvice.setSourceLine(implicitCall.getSourceLine());

						dependence.addHandler(leafCloneToAdvice);
						leafCloneToAdvice.setJoinPointShadowType(implicitCall
								.getJoinPointShadowType());
						
						leafCloneToAdvice.setTarget(advice);
						leafCloneToAdvice.setSource(leafClone);

					}
					
					dependence.setTarget(leafClone);
					dependence.setSource(fieldClone);
					
					newNodes.add((NodeLeaf) leafClone);
					tmpPackages.addAll(subGraph.getPackageHash().values());
				}
			} else {
				Node nodeTmp = extractSubGraph(criteria, (GraphImpl) subGraph,
						(NodeLeaf) sourceTmp);
				if(nodeTmp != null){
					newNodes.add((NodeLeaf) nodeTmp);
					tmpPackages.addAll(subGraph.getPackageHash().values());
				}
			}
		}

		//Se e' stato indicato come nodo sorgente un container verifica se per le classi vi � almeno 1 metodo con archi uscenti
		//In tal caso non inserisce i nodi sorgente senza archi uscenti. In caso contrario li mette tutti.
		if (originalSource != null && originalSource instanceof NodeContainer) {
			if(originalSource instanceof Interface) {
				boolean containsOutEdge = false;
				for (int i = 0; i < newNodes.size() && !containsOutEdge; i++) {
					if (newNodes.get(i).getOutEdgesList().size() > 0) {
						containsOutEdge = true;
					}
				}
				
				//Elimina i nodi sorgente senza archi uscenti
				if(containsOutEdge)
					for (int i = 0; i < newNodes.size(); i++) {
						if (newNodes.get(i).getOutEdgesList().size() == 0) {
							newNodes.remove(i);
							i--;
						}
					}
			} else { //Il container e' un package
			}
		} else {
			if (sources.length > 1)
				for (int i = 0; i < newNodes.size(); i++) {
					if (newNodes.get(i).getOutEdgesList().size() == 0) {
						newNodes.remove(i);
						i--;
					}
				}
		}

		sources = newNodes.toArray(new NodeLeaf[newNodes.size()]);
		criteria.setSources(sources);

//		subGraph.setNodes(sources);
		subGraph.setNodes(tmpPackages.toArray(new Package[tmpPackages.size()]));
		return sources;
	}

	private NodeContainer getSynthesizedGraph(GraphImpl newGraph,
			NodeLeaf node, boolean isPackageLevel,
			List<NodeContainerEdgeCounter> counters) {
		/* Clona il nodeSource - INIZIO */
		NodeContainer sourceContainer = node.getNodeContainer();

		// prende il primo package
		if (isPackageLevel)
			while (sourceContainer.getNodeContainer() != null
					&& !(sourceContainer instanceof Package))
				sourceContainer = sourceContainer.getNodeContainer();

		NodeContainer originalSourceContainer = sourceContainer;

		//counter contiene tutti gli archi uscenti dai nodi di questo container.
		//quando counter non ha più archi, il nodo è stato completamente esplorato
		NodeContainerEdgeCounter counter = getNodeContainerEdgeCounterFromList(
				counters, originalSourceContainer, isPackageLevel);

		// diventa un clone
		sourceContainer = (NodeContainer) cloneNode(newGraph,
				originalSourceContainer);

		/* Clona il nodeSource - FINE */

		Edge[] edges = node.getOutCallEdges();

		if (edges != null)
			for (int i = 0; i < edges.length; i++) {
				Edge e = edges[i];

				if (counter.outEdgesList.contains(e)) {
					//se l'arco è contenuto, significa che non è stato ancora analizzato 
					counter.outEdgesList.remove(e);

					NodeLeaf target = (NodeLeaf) e.getTarget();
					NodeContainer targetContainer = target.getNodeContainer();

					if (isPackageLevel
							|| originalSourceContainer instanceof Package)
						while (targetContainer.getNodeContainer() != null
								&& !(targetContainer instanceof Package))
							targetContainer = targetContainer
									.getNodeContainer();

					if (targetContainer.equals(originalSourceContainer)) {
						//se il nodo sorgente e il nodo target sono nello stesso container,
						//non devono essere aggiunte le relazioni tra di essi 
						getSynthesizedGraph(newGraph, target, isPackageLevel,
								counters);
					} else {
						/* Clona il nodeTarget - INIZIO */
						targetContainer = target.getNodeContainer();

						// prende il primo package
						if (isPackageLevel)
							while (targetContainer.getNodeContainer() != null
									&& !(targetContainer instanceof Package))
								targetContainer = targetContainer
										.getNodeContainer();

						targetContainer = (NodeContainer) cloneNode(newGraph,
								targetContainer);

						/* Clona il nodeTarget - FINE */

						Edge[] decoratorEdges;
						Edge decTmp = null;

						if (e instanceof ImplicitCall) {
							decoratorEdges = sourceContainer
									.getOutEdgesByType(ImplicitCallDecorator.class);

							for (int j = 0; j < decoratorEdges.length
									&& decTmp == null; j++) {
								if (decoratorEdges[j].getTarget().equals(
										targetContainer)) {
									decTmp = decoratorEdges[j];
								}
							}

							// Non ha trovato l'arco decoratore
							if (decTmp == null) {
								decTmp = CallGraphFactory.eINSTANCE
										.createImplicitCallDecorator();

								decTmp.setTarget(targetContainer);
								decTmp.setSource(sourceContainer);
							}

							if (((ImplicitCallDecorator) decTmp)
									.addImplicitCall((ImplicitCall) e)) {
								Edge jointPointShadow = ((ImplicitCall) e)
										.getJoinPointShadow();
								if (jointPointShadow != null
										&& jointPointShadow instanceof Dependence) {
									Node jointPointSource = jointPointShadow
											.getSource();
									Node jointPointTarget = jointPointShadow
											.getTarget();

									NodeContainer jointPointSourceContainer = jointPointSource
											.getNodeContainer();
									NodeContainer jointPointTargetContainer = jointPointTarget
											.getNodeContainer();

									if (isPackageLevel) {
										while (jointPointSourceContainer
												.getNodeContainer() != null
												&& !(jointPointSourceContainer instanceof Package))
											jointPointSourceContainer = jointPointSourceContainer
													.getNodeContainer();
										while (jointPointTargetContainer
												.getNodeContainer() != null
												&& !(jointPointTargetContainer instanceof Package))
											jointPointTargetContainer = jointPointTargetContainer
													.getNodeContainer();
									}

									if (!jointPointTargetContainer
											.equals(jointPointSourceContainer)) {
										decoratorEdges = jointPointSourceContainer
												.getOutEdgesByType(DependenceDecorator.class);

										for (int j = 0; j < decoratorEdges.length
												&& decTmp == null; j++) {
											if (decoratorEdges[j]
													.getTarget()
													.equals(
															jointPointTargetContainer)
													|| (decoratorEdges[j]
															.getSource()
															.equals(
																	jointPointTargetContainer) && decoratorEdges[j]
															.getTarget()
															.equals(
																	jointPointSourceContainer))) {
												decTmp = decoratorEdges[j];
											}
										}

										// Non ha trovato l'arco decoratore
										if (decTmp == null) {
											decTmp = CallGraphFactory.eINSTANCE
													.createDependenceDecorator();

											decTmp.setTarget(jointPointTargetContainer);
											decTmp.setSource(jointPointSourceContainer);
										}

										((DependenceDecorator) decTmp)
												.addDependence((Dependence) e);
									}
								}
							}
						} else if (e instanceof ExplicitCall) {
							decoratorEdges = sourceContainer
									.getOutEdgesByType(ExplicitCallDecorator.class);

							for (int j = 0; j < decoratorEdges.length
									&& decTmp == null; j++) {
								if (decoratorEdges[j].getTarget().equals(
										targetContainer)) {
									decTmp = decoratorEdges[j];
								}
							}

							// Non ha trovato l'arco decoratore
							if (decTmp == null) {
								decTmp = CallGraphFactory.eINSTANCE
										.createExplicitCallDecorator();

								decTmp.setTarget(targetContainer);
								decTmp.setSource(sourceContainer);
							}

							((ExplicitCallDecorator) decTmp)
									.addExplicitCall((ExplicitCall) e);
						}

						// if(counter.outEdgesCounter >= 0)
						getSynthesizedGraph(newGraph, target, isPackageLevel,
								counters);
					}
				}
			}

		return sourceContainer;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((criteria == null) ? 0 : criteria.hashCode());
		result = prime * result + ((nodes == null) ? 0 : nodes.hashCode());
		return result;
	}

	private boolean isValidGraphLeaf(Criteria criteria, Node node, Edge[] edges) {
		Node target = criteria.getTarget();

		return (target == null 
				|| (target instanceof NodeLeaf && target.equals(node)) || (target instanceof NodeContainer && isValidLeafContainer(
				(NodeContainer) target, node)));
	}

	// public Hashtable<Integer, Pointcut> getPointcutHash() {
	// return this.pointcutHash;
	// }

	private boolean isValidLeafContainer(NodeContainer target, Node testNode) {
		if (testNode == null)
			return false;
		else if (target.equals(testNode))
			return true;

		return isValidLeafContainer(target, testNode.getNodeContainer());
	}

	private Graph mergeGraphs(List<Graph> graphs) {
		GraphImpl newGraph = (GraphImpl) CallGraphFactory.eINSTANCE
				.createGraph();
		GraphImpl graphTmp = null;

		for (Graph graph : graphs) {
			graphTmp = (GraphImpl) graph;
			Node[] tmpSources = graphTmp.getCriteria().getSources();
			for (int i = 0; i < tmpSources.length; i++) {
				try {
					cloneGraphFromSource(newGraph, tmpSources[i]);
				}catch (Exception e) {
					e.printStackTrace();
				}
			}
		}

		return newGraph;
	}

	public void setCriteria(Criteria criteria) {
		this.criteria = criteria;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setFirstLevelGraph(Graph newFirstLevelGraph) {
		Graph oldFirstLevelGraph = firstLevelGraph;
		firstLevelGraph = newFirstLevelGraph;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CallGraphPackage.GRAPH__FIRST_LEVEL_GRAPH,
					oldFirstLevelGraph, firstLevelGraph));
	}
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setNodes(int index, Node element) {
		getNodesList().set(index, element);
	}

	/**
	 * <!-- begin-user-doc --> Vengono inseriti i nodi all'interno del grafo. I
	 * nodi duplicati non vengono inseriti. <!-- end-user-doc -->
	 * 
	 */
	public void setNodes(Node[] newNodes) {

		for (int i = 0; i < newNodes.length; i++) {
			// aggiungi il container
			if(newNodes[i] != null)
				addNodeContainer(newNodes[i]);
		}
	}

} // GraphImpl
