/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unisannio.rcost.callgraphanalyzer;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see it.unisannio.rcost.callgraphanalyzer.CallGraphFactory
 * @model kind="package"
 * @generated
 */
public interface CallGraphPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "callgraphanalyzer";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "callgraphanalyzer";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "CallGraphAnalyzer";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CallGraphPackage eINSTANCE = it.unisannio.rcost.callgraphanalyzer.impl.CallGraphPackageImpl.init();

	/**
	 * The meta object id for the '{@link it.unisannio.rcost.callgraphanalyzer.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unisannio.rcost.callgraphanalyzer.impl.NodeImpl
	 * @see it.unisannio.rcost.callgraphanalyzer.impl.CallGraphPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 0;

	/**
	 * The feature id for the '<em><b>In Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__IN_EDGES = 0;

	/**
	 * The feature id for the '<em><b>Out Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__OUT_EDGES = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NAME = 2;

	/**
	 * The feature id for the '<em><b>Node Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NODE_CONTAINER = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__ID = 4;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link it.unisannio.rcost.callgraphanalyzer.impl.EdgeImpl <em>Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unisannio.rcost.callgraphanalyzer.impl.EdgeImpl
	 * @see it.unisannio.rcost.callgraphanalyzer.impl.CallGraphPackageImpl#getEdge()
	 * @generated
	 */
	int EDGE = 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link it.unisannio.rcost.callgraphanalyzer.impl.GraphImpl <em>Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unisannio.rcost.callgraphanalyzer.impl.GraphImpl
	 * @see it.unisannio.rcost.callgraphanalyzer.impl.CallGraphPackageImpl#getGraph()
	 * @generated
	 */
	int GRAPH = 2;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__NODES = 0;

	/**
	 * The feature id for the '<em><b>First Level Graph</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__FIRST_LEVEL_GRAPH = 1;

	/**
	 * The number of structural features of the '<em>Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link it.unisannio.rcost.callgraphanalyzer.impl.NodeContainerImpl <em>Node Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unisannio.rcost.callgraphanalyzer.impl.NodeContainerImpl
	 * @see it.unisannio.rcost.callgraphanalyzer.impl.CallGraphPackageImpl#getNodeContainer()
	 * @generated
	 */
	int NODE_CONTAINER = 12;

	/**
	 * The feature id for the '<em><b>In Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_CONTAINER__IN_EDGES = NODE__IN_EDGES;

	/**
	 * The feature id for the '<em><b>Out Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_CONTAINER__OUT_EDGES = NODE__OUT_EDGES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_CONTAINER__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Node Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_CONTAINER__NODE_CONTAINER = NODE__NODE_CONTAINER;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_CONTAINER__ID = NODE__ID;

	/**
	 * The feature id for the '<em><b>Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_CONTAINER__PACKAGE_NAME = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Node Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_CONTAINER_FEATURE_COUNT = NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.unisannio.rcost.callgraphanalyzer.impl.PackageImpl <em>Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unisannio.rcost.callgraphanalyzer.impl.PackageImpl
	 * @see it.unisannio.rcost.callgraphanalyzer.impl.CallGraphPackageImpl#getPackage()
	 * @generated
	 */
	int PACKAGE = 3;

	/**
	 * The feature id for the '<em><b>In Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__IN_EDGES = NODE_CONTAINER__IN_EDGES;

	/**
	 * The feature id for the '<em><b>Out Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__OUT_EDGES = NODE_CONTAINER__OUT_EDGES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__NAME = NODE_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Node Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__NODE_CONTAINER = NODE_CONTAINER__NODE_CONTAINER;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__ID = NODE_CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__PACKAGE_NAME = NODE_CONTAINER__PACKAGE_NAME;

	/**
	 * The feature id for the '<em><b>Inner Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__INNER_MODULES = NODE_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__PACKAGES = NODE_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FEATURE_COUNT = NODE_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link it.unisannio.rcost.callgraphanalyzer.impl.ExplicitCallImpl <em>Explicit Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unisannio.rcost.callgraphanalyzer.impl.ExplicitCallImpl
	 * @see it.unisannio.rcost.callgraphanalyzer.impl.CallGraphPackageImpl#getExplicitCall()
	 * @generated
	 */
	int EXPLICIT_CALL = 4;

	/**
	 * The meta object id for the '{@link it.unisannio.rcost.callgraphanalyzer.impl.ClassImpl <em>Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unisannio.rcost.callgraphanalyzer.impl.ClassImpl
	 * @see it.unisannio.rcost.callgraphanalyzer.impl.CallGraphPackageImpl#getClass_()
	 * @generated
	 */
	int CLASS = 5;

	/**
	 * The meta object id for the '{@link it.unisannio.rcost.callgraphanalyzer.impl.NodeLeafImpl <em>Node Leaf</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unisannio.rcost.callgraphanalyzer.impl.NodeLeafImpl
	 * @see it.unisannio.rcost.callgraphanalyzer.impl.CallGraphPackageImpl#getNodeLeaf()
	 * @generated
	 */
	int NODE_LEAF = 19;

	/**
	 * The meta object id for the '{@link it.unisannio.rcost.callgraphanalyzer.impl.FieldImpl <em>Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unisannio.rcost.callgraphanalyzer.impl.FieldImpl
	 * @see it.unisannio.rcost.callgraphanalyzer.impl.CallGraphPackageImpl#getField()
	 * @generated
	 */
	int FIELD = 6;

	/**
	 * The meta object id for the '{@link it.unisannio.rcost.callgraphanalyzer.impl.MethodImpl <em>Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unisannio.rcost.callgraphanalyzer.impl.MethodImpl
	 * @see it.unisannio.rcost.callgraphanalyzer.impl.CallGraphPackageImpl#getMethod()
	 * @generated
	 */
	int METHOD = 7;

	/**
	 * The meta object id for the '{@link it.unisannio.rcost.callgraphanalyzer.impl.PointcutImpl <em>Pointcut</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unisannio.rcost.callgraphanalyzer.impl.PointcutImpl
	 * @see it.unisannio.rcost.callgraphanalyzer.impl.CallGraphPackageImpl#getPointcut()
	 * @generated
	 */
	int POINTCUT = 8;

	/**
	 * The meta object id for the '{@link it.unisannio.rcost.callgraphanalyzer.impl.AdviceImpl <em>Advice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unisannio.rcost.callgraphanalyzer.impl.AdviceImpl
	 * @see it.unisannio.rcost.callgraphanalyzer.impl.CallGraphPackageImpl#getAdvice()
	 * @generated
	 */
	int ADVICE = 9;

	/**
	 * The meta object id for the '{@link it.unisannio.rcost.callgraphanalyzer.impl.AspectImpl <em>Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unisannio.rcost.callgraphanalyzer.impl.AspectImpl
	 * @see it.unisannio.rcost.callgraphanalyzer.impl.CallGraphPackageImpl#getAspect()
	 * @generated
	 */
	int ASPECT = 10;

	/**
	 * The meta object id for the '{@link it.unisannio.rcost.callgraphanalyzer.impl.InterfaceImpl <em>Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unisannio.rcost.callgraphanalyzer.impl.InterfaceImpl
	 * @see it.unisannio.rcost.callgraphanalyzer.impl.CallGraphPackageImpl#getInterface()
	 * @generated
	 */
	int INTERFACE = 11;

	/**
	 * The meta object id for the '{@link it.unisannio.rcost.callgraphanalyzer.impl.ImplicitCallImpl <em>Implicit Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unisannio.rcost.callgraphanalyzer.impl.ImplicitCallImpl
	 * @see it.unisannio.rcost.callgraphanalyzer.impl.CallGraphPackageImpl#getImplicitCall()
	 * @generated
	 */
	int IMPLICIT_CALL = 13;

	/**
	 * The meta object id for the '{@link it.unisannio.rcost.callgraphanalyzer.impl.AssociationImpl <em>Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unisannio.rcost.callgraphanalyzer.impl.AssociationImpl
	 * @see it.unisannio.rcost.callgraphanalyzer.impl.CallGraphPackageImpl#getAssociation()
	 * @generated
	 */
	int ASSOCIATION = 14;

	/**
	 * The meta object id for the '{@link it.unisannio.rcost.callgraphanalyzer.impl.ImplementationImpl <em>Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unisannio.rcost.callgraphanalyzer.impl.ImplementationImpl
	 * @see it.unisannio.rcost.callgraphanalyzer.impl.CallGraphPackageImpl#getImplementation()
	 * @generated
	 */
	int IMPLEMENTATION = 15;

	/**
	 * The meta object id for the '{@link it.unisannio.rcost.callgraphanalyzer.impl.DependenceImpl <em>Dependence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unisannio.rcost.callgraphanalyzer.impl.DependenceImpl
	 * @see it.unisannio.rcost.callgraphanalyzer.impl.CallGraphPackageImpl#getDependence()
	 * @generated
	 */
	int DEPENDENCE = 16;

	/**
	 * The meta object id for the '{@link it.unisannio.rcost.callgraphanalyzer.impl.ExtensionImpl <em>Extension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unisannio.rcost.callgraphanalyzer.impl.ExtensionImpl
	 * @see it.unisannio.rcost.callgraphanalyzer.impl.CallGraphPackageImpl#getExtension()
	 * @generated
	 */
	int EXTENSION = 17;

	/**
	 * The meta object id for the '{@link it.unisannio.rcost.callgraphanalyzer.impl.ProjectImpl <em>Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unisannio.rcost.callgraphanalyzer.impl.ProjectImpl
	 * @see it.unisannio.rcost.callgraphanalyzer.impl.CallGraphPackageImpl#getProject()
	 * @generated
	 */
	int PROJECT = 18;

	/**
	 * The meta object id for the '{@link it.unisannio.rcost.callgraphanalyzer.impl.ImplicitCallDecoratorImpl <em>Implicit Call Decorator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unisannio.rcost.callgraphanalyzer.impl.ImplicitCallDecoratorImpl
	 * @see it.unisannio.rcost.callgraphanalyzer.impl.CallGraphPackageImpl#getImplicitCallDecorator()
	 * @generated
	 */
	int IMPLICIT_CALL_DECORATOR = 20;

	/**
	 * The meta object id for the '{@link it.unisannio.rcost.callgraphanalyzer.impl.ExplicitCallDecoratorImpl <em>Explicit Call Decorator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unisannio.rcost.callgraphanalyzer.impl.ExplicitCallDecoratorImpl
	 * @see it.unisannio.rcost.callgraphanalyzer.impl.CallGraphPackageImpl#getExplicitCallDecorator()
	 * @generated
	 */
	int EXPLICIT_CALL_DECORATOR = 21;

	/**
	 * The meta object id for the '{@link it.unisannio.rcost.callgraphanalyzer.impl.DependenceDecoratorImpl <em>Dependence Decorator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unisannio.rcost.callgraphanalyzer.impl.DependenceDecoratorImpl
	 * @see it.unisannio.rcost.callgraphanalyzer.impl.CallGraphPackageImpl#getDependenceDecorator()
	 * @generated
	 */
	int DEPENDENCE_DECORATOR = 22;

	/**
	 * The meta object id for the '{@link it.unisannio.rcost.callgraphanalyzer.EdgeDecorator <em>Edge Decorator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unisannio.rcost.callgraphanalyzer.EdgeDecorator
	 * @see it.unisannio.rcost.callgraphanalyzer.impl.CallGraphPackageImpl#getEdgeDecorator()
	 * @generated
	 */
	int EDGE_DECORATOR = 23;

	/**
	 * The meta object id for the '{@link it.unisannio.rcost.callgraphanalyzer.impl.JoinPointShadowImpl <em>Join Point Shadow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unisannio.rcost.callgraphanalyzer.impl.JoinPointShadowImpl
	 * @see it.unisannio.rcost.callgraphanalyzer.impl.CallGraphPackageImpl#getJoinPointShadow()
	 * @generated
	 */
	int JOIN_POINT_SHADOW = 24;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_POINT_SHADOW__SOURCE = EDGE__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_POINT_SHADOW__TARGET = EDGE__TARGET;

	/**
	 * The feature id for the '<em><b>Handlers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_POINT_SHADOW__HANDLERS = EDGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Join Point Shadow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_POINT_SHADOW_FEATURE_COUNT = EDGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICIT_CALL__SOURCE = JOIN_POINT_SHADOW__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICIT_CALL__TARGET = JOIN_POINT_SHADOW__TARGET;

	/**
	 * The feature id for the '<em><b>Handlers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICIT_CALL__HANDLERS = JOIN_POINT_SHADOW__HANDLERS;

	/**
	 * The feature id for the '<em><b>Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICIT_CALL__GROUP_ID = JOIN_POINT_SHADOW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Explicit Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICIT_CALL_FEATURE_COUNT = JOIN_POINT_SHADOW_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>In Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__IN_EDGES = NODE_CONTAINER__IN_EDGES;

	/**
	 * The feature id for the '<em><b>Out Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__OUT_EDGES = NODE_CONTAINER__OUT_EDGES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__NAME = NODE_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Node Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__NODE_CONTAINER = NODE_CONTAINER__NODE_CONTAINER;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__ID = NODE_CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__PACKAGE_NAME = NODE_CONTAINER__PACKAGE_NAME;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__METHODS = NODE_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__FIELDS = NODE_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__IS_STATIC = NODE_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Strict Fp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__IS_STRICT_FP = NODE_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Scope Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__SCOPE_MODIFIER = NODE_CONTAINER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Flags Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__FLAGS_MODIFIER = NODE_CONTAINER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Inner Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__INNER_MODULES = NODE_CONTAINER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Compilation Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__COMPILATION_UNIT = NODE_CONTAINER_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FEATURE_COUNT = NODE_CONTAINER_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>In Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__IN_EDGES = INTERFACE__IN_EDGES;

	/**
	 * The feature id for the '<em><b>Out Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__OUT_EDGES = INTERFACE__OUT_EDGES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__NAME = INTERFACE__NAME;

	/**
	 * The feature id for the '<em><b>Node Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__NODE_CONTAINER = INTERFACE__NODE_CONTAINER;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__ID = INTERFACE__ID;

	/**
	 * The feature id for the '<em><b>Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__PACKAGE_NAME = INTERFACE__PACKAGE_NAME;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__METHODS = INTERFACE__METHODS;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__FIELDS = INTERFACE__FIELDS;

	/**
	 * The feature id for the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__IS_STATIC = INTERFACE__IS_STATIC;

	/**
	 * The feature id for the '<em><b>Is Strict Fp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__IS_STRICT_FP = INTERFACE__IS_STRICT_FP;

	/**
	 * The feature id for the '<em><b>Scope Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__SCOPE_MODIFIER = INTERFACE__SCOPE_MODIFIER;

	/**
	 * The feature id for the '<em><b>Flags Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__FLAGS_MODIFIER = INTERFACE__FLAGS_MODIFIER;

	/**
	 * The feature id for the '<em><b>Inner Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__INNER_MODULES = INTERFACE__INNER_MODULES;

	/**
	 * The feature id for the '<em><b>Compilation Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__COMPILATION_UNIT = INTERFACE__COMPILATION_UNIT;

	/**
	 * The number of structural features of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_FEATURE_COUNT = INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>In Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_LEAF__IN_EDGES = NODE__IN_EDGES;

	/**
	 * The feature id for the '<em><b>Out Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_LEAF__OUT_EDGES = NODE__OUT_EDGES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_LEAF__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Node Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_LEAF__NODE_CONTAINER = NODE__NODE_CONTAINER;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_LEAF__ID = NODE__ID;

	/**
	 * The number of structural features of the '<em>Node Leaf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_LEAF_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>In Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__IN_EDGES = NODE_LEAF__IN_EDGES;

	/**
	 * The feature id for the '<em><b>Out Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__OUT_EDGES = NODE_LEAF__OUT_EDGES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__NAME = NODE_LEAF__NAME;

	/**
	 * The feature id for the '<em><b>Node Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__NODE_CONTAINER = NODE_LEAF__NODE_CONTAINER;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__ID = NODE_LEAF__ID;

	/**
	 * The feature id for the '<em><b>Is Strict FP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__IS_STRICT_FP = NODE_LEAF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__IS_FINAL = NODE_LEAF_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__IS_STATIC = NODE_LEAF_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__IS_VOLATILE = NODE_LEAF_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__SIGNATURE = NODE_LEAF_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Scope Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__SCOPE_MODIFIER = NODE_LEAF_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Is Transient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__IS_TRANSIENT = NODE_LEAF_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_FEATURE_COUNT = NODE_LEAF_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>In Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__IN_EDGES = NODE_LEAF__IN_EDGES;

	/**
	 * The feature id for the '<em><b>Out Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__OUT_EDGES = NODE_LEAF__OUT_EDGES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__NAME = NODE_LEAF__NAME;

	/**
	 * The feature id for the '<em><b>Node Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__NODE_CONTAINER = NODE_LEAF__NODE_CONTAINER;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__ID = NODE_LEAF__ID;

	/**
	 * The feature id for the '<em><b>Is Strict Fp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__IS_STRICT_FP = NODE_LEAF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__IS_STATIC = NODE_LEAF_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Native</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__IS_NATIVE = NODE_LEAF_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Synchronized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__IS_SYNCHRONIZED = NODE_LEAF_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Scope Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__SCOPE_MODIFIER = NODE_LEAF_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Flags Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__FLAGS_MODIFIER = NODE_LEAF_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__SIGNATURE = NODE_LEAF_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Is Main</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__IS_MAIN = NODE_LEAF_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_FEATURE_COUNT = NODE_LEAF_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>In Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTCUT__IN_EDGES = NODE_LEAF__IN_EDGES;

	/**
	 * The feature id for the '<em><b>Out Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTCUT__OUT_EDGES = NODE_LEAF__OUT_EDGES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTCUT__NAME = NODE_LEAF__NAME;

	/**
	 * The feature id for the '<em><b>Node Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTCUT__NODE_CONTAINER = NODE_LEAF__NODE_CONTAINER;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTCUT__ID = NODE_LEAF__ID;

	/**
	 * The feature id for the '<em><b>Scope Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTCUT__SCOPE_MODIFIER = NODE_LEAF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pointcut</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTCUT_FEATURE_COUNT = NODE_LEAF_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>In Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVICE__IN_EDGES = NODE_LEAF__IN_EDGES;

	/**
	 * The feature id for the '<em><b>Out Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVICE__OUT_EDGES = NODE_LEAF__OUT_EDGES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVICE__NAME = NODE_LEAF__NAME;

	/**
	 * The feature id for the '<em><b>Node Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVICE__NODE_CONTAINER = NODE_LEAF__NODE_CONTAINER;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVICE__ID = NODE_LEAF__ID;

	/**
	 * The feature id for the '<em><b>Is Strict Fp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVICE__IS_STRICT_FP = NODE_LEAF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVICE__KIND = NODE_LEAF_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVICE__LOCAL_ID = NODE_LEAF_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVICE__SIGNATURE = NODE_LEAF_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Pointcut Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVICE__POINTCUT_EXPRESSION = NODE_LEAF_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Advice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVICE_FEATURE_COUNT = NODE_LEAF_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>In Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT__IN_EDGES = CLASS__IN_EDGES;

	/**
	 * The feature id for the '<em><b>Out Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT__OUT_EDGES = CLASS__OUT_EDGES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT__NAME = CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Node Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT__NODE_CONTAINER = CLASS__NODE_CONTAINER;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT__ID = CLASS__ID;

	/**
	 * The feature id for the '<em><b>Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT__PACKAGE_NAME = CLASS__PACKAGE_NAME;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT__METHODS = CLASS__METHODS;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT__FIELDS = CLASS__FIELDS;

	/**
	 * The feature id for the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT__IS_STATIC = CLASS__IS_STATIC;

	/**
	 * The feature id for the '<em><b>Is Strict Fp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT__IS_STRICT_FP = CLASS__IS_STRICT_FP;

	/**
	 * The feature id for the '<em><b>Scope Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT__SCOPE_MODIFIER = CLASS__SCOPE_MODIFIER;

	/**
	 * The feature id for the '<em><b>Flags Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT__FLAGS_MODIFIER = CLASS__FLAGS_MODIFIER;

	/**
	 * The feature id for the '<em><b>Inner Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT__INNER_MODULES = CLASS__INNER_MODULES;

	/**
	 * The feature id for the '<em><b>Compilation Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT__COMPILATION_UNIT = CLASS__COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Pointcuts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT__POINTCUTS = CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Advices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT__ADVICES = CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT_FEATURE_COUNT = CLASS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_CALL__SOURCE = JOIN_POINT_SHADOW__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_CALL__TARGET = JOIN_POINT_SHADOW__TARGET;

	/**
	 * The feature id for the '<em><b>Handlers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_CALL__HANDLERS = JOIN_POINT_SHADOW__HANDLERS;

	/**
	 * The feature id for the '<em><b>Join Point Shadow</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_CALL__JOIN_POINT_SHADOW = JOIN_POINT_SHADOW_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Join Point Shadow Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_CALL__JOIN_POINT_SHADOW_TYPE = JOIN_POINT_SHADOW_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_CALL__SOURCE_LINE = JOIN_POINT_SHADOW_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Implicit Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_CALL_FEATURE_COUNT = JOIN_POINT_SHADOW_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__SOURCE = EDGE__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__TARGET = EDGE__TARGET;

	/**
	 * The number of structural features of the '<em>Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_FEATURE_COUNT = EDGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION__SOURCE = EDGE__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION__TARGET = EDGE__TARGET;

	/**
	 * The number of structural features of the '<em>Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_FEATURE_COUNT = EDGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCE__SOURCE = JOIN_POINT_SHADOW__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCE__TARGET = JOIN_POINT_SHADOW__TARGET;

	/**
	 * The feature id for the '<em><b>Handlers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCE__HANDLERS = JOIN_POINT_SHADOW__HANDLERS;

	/**
	 * The feature id for the '<em><b>Is Get</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCE__IS_GET = JOIN_POINT_SHADOW_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCE__IS_SET = JOIN_POINT_SHADOW_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Dependence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCE_FEATURE_COUNT = JOIN_POINT_SHADOW_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__SOURCE = EDGE__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__TARGET = EDGE__TARGET;

	/**
	 * The number of structural features of the '<em>Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_FEATURE_COUNT = EDGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Root Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__ROOT_PACKAGES = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__AUTHOR = 2;

	/**
	 * The number of structural features of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FEATURE_COUNT = 3;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_CALL_DECORATOR__SOURCE = IMPLICIT_CALL__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_CALL_DECORATOR__TARGET = IMPLICIT_CALL__TARGET;

	/**
	 * The feature id for the '<em><b>Handlers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_CALL_DECORATOR__HANDLERS = IMPLICIT_CALL__HANDLERS;

	/**
	 * The feature id for the '<em><b>Join Point Shadow</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_CALL_DECORATOR__JOIN_POINT_SHADOW = IMPLICIT_CALL__JOIN_POINT_SHADOW;

	/**
	 * The feature id for the '<em><b>Join Point Shadow Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_CALL_DECORATOR__JOIN_POINT_SHADOW_TYPE = IMPLICIT_CALL__JOIN_POINT_SHADOW_TYPE;

	/**
	 * The feature id for the '<em><b>Source Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_CALL_DECORATOR__SOURCE_LINE = IMPLICIT_CALL__SOURCE_LINE;

	/**
	 * The feature id for the '<em><b>Implicit Calls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_CALL_DECORATOR__IMPLICIT_CALLS = IMPLICIT_CALL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Implicit Call Decorator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_CALL_DECORATOR_FEATURE_COUNT = IMPLICIT_CALL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICIT_CALL_DECORATOR__SOURCE = EXPLICIT_CALL__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICIT_CALL_DECORATOR__TARGET = EXPLICIT_CALL__TARGET;

	/**
	 * The feature id for the '<em><b>Handlers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICIT_CALL_DECORATOR__HANDLERS = EXPLICIT_CALL__HANDLERS;

	/**
	 * The feature id for the '<em><b>Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICIT_CALL_DECORATOR__GROUP_ID = EXPLICIT_CALL__GROUP_ID;

	/**
	 * The feature id for the '<em><b>Explicit Calls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICIT_CALL_DECORATOR__EXPLICIT_CALLS = EXPLICIT_CALL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Explicit Call Decorator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICIT_CALL_DECORATOR_FEATURE_COUNT = EXPLICIT_CALL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCE_DECORATOR__SOURCE = DEPENDENCE__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCE_DECORATOR__TARGET = DEPENDENCE__TARGET;

	/**
	 * The feature id for the '<em><b>Handlers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCE_DECORATOR__HANDLERS = DEPENDENCE__HANDLERS;

	/**
	 * The feature id for the '<em><b>Is Get</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCE_DECORATOR__IS_GET = DEPENDENCE__IS_GET;

	/**
	 * The feature id for the '<em><b>Is Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCE_DECORATOR__IS_SET = DEPENDENCE__IS_SET;

	/**
	 * The feature id for the '<em><b>Dependences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCE_DECORATOR__DEPENDENCES = DEPENDENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Dependence Decorator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCE_DECORATOR_FEATURE_COUNT = DEPENDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Edge Decorator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_DECORATOR_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link it.unisannio.rcost.callgraphanalyzer.FlagsModifier <em>Flags Modifier</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unisannio.rcost.callgraphanalyzer.FlagsModifier
	 * @see it.unisannio.rcost.callgraphanalyzer.impl.CallGraphPackageImpl#getFlagsModifier()
	 * @generated
	 */
	int FLAGS_MODIFIER = 25;

	/**
	 * The meta object id for the '{@link it.unisannio.rcost.callgraphanalyzer.ScopeModifier <em>Scope Modifier</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unisannio.rcost.callgraphanalyzer.ScopeModifier
	 * @see it.unisannio.rcost.callgraphanalyzer.impl.CallGraphPackageImpl#getScopeModifier()
	 * @generated
	 */
	int SCOPE_MODIFIER = 26;


	/**
	 * Returns the meta object for class '{@link it.unisannio.rcost.callgraphanalyzer.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see it.unisannio.rcost.callgraphanalyzer.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the containment reference list '{@link it.unisannio.rcost.callgraphanalyzer.Node#getInEdgesList <em>In Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>In Edges</em>'.
	 * @see it.unisannio.rcost.callgraphanalyzer.Node#getInEdgesList()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_InEdges();

	/**
	 * Returns the meta object for the containment reference list '{@link it.unisannio.rcost.callgraphanalyzer.Node#getOutEdgesList <em>Out Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Out Edges</em>'.
	 * @see it.unisannio.rcost.callgraphanalyzer.Node#getOutEdgesList()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_OutEdges();

	/**
	 * Returns the meta object for the attribute '{@link it.unisannio.rcost.callgraphanalyzer.Node#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.unisannio.rcost.callgraphanalyzer.Node#getName()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Name();

	/**
	 * Returns the meta object for the reference '{@link it.unisannio.rcost.callgraphanalyzer.Node#getNodeContainer <em>Node Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Node Container</em>'.
	 * @see it.unisannio.rcost.callgraphanalyzer.Node#getNodeContainer()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_NodeContainer();

	/**
	 * Returns the meta object for the attribute '{@link it.unisannio.rcost.callgraphanalyzer.Node#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see it.unisannio.rcost.callgraphanalyzer.Node#getId()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Id();

	/**
	 * Returns the meta object for class '{@link it.unisannio.rcost.callgraphanalyzer.Edge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge</em>'.
	 * @see it.unisannio.rcost.callgraphanalyzer.Edge
	 * @generated
	 */
	EClass getEdge();

	/**
	 * Returns the meta object for the reference '{@link it.unisannio.rcost.callgraphanalyzer.Edge#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see it.unisannio.rcost.callgraphanalyzer.Edge#getSource()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_Source();

	/**
	 * Returns the meta object for the reference '{@link it.unisannio.rcost.callgraphanalyzer.Edge#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see it.unisannio.rcost.callgraphanalyzer.Edge#getTarget()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_Target();

	/**
	 * Returns the meta object for class '{@link it.unisannio.rcost.callgraphanalyzer.Graph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graph</em>'.
	 * @see it.unisannio.rcost.callgraphanalyzer.Graph
	 * @generated
	 */
	EClass getGraph();

	/**
	 * Returns the meta object for the containment reference list '{@link it.unisannio.rcost.callgraphanalyzer.Graph#getNodesList <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see it.unisannio.rcost.callgraphanalyzer.Graph#getNodesList()
	 * @see #getGraph()
	 * @generated
	 */
	EReference getGraph_Nodes();

	/**
	 * Returns the meta object for the reference '{@link it.unisannio.rcost.callgraphanalyzer.Graph#getFirstLevelGraph <em>First Level Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>First Level Graph</em>'.
	 * @see it.unisannio.rcost.callgraphanalyzer.Graph#getFirstLevelGraph()
	 * @see #getGraph()
	 * @generated
	 */
	EReference getGraph_FirstLevelGraph();

	/**
	 * Returns the meta object for class '{@link it.unisannio.rcost.callgraphanalyzer.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package</em>'.
	 * @see it.unisannio.rcost.callgraphanalyzer.Package
	 * @generated
	 */
	EClass getPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link it.unisannio.rcost.callgraphanalyzer.Package#getInnerModulesList <em>Inner Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inner Modules</em>'.
	 * @see it.unisannio.rcost.callgraphanalyzer.Package#getInnerModulesList()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_InnerModules();

	/**
	 * Returns the meta object for the containment reference list '{@link it.unisannio.rcost.callgraphanalyzer.Package#getPackagesList <em>Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Packages</em>'.
	 * @see it.unisannio.rcost.callgraphanalyzer.Package#getPackagesList()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Packages();

	/**
	 * Returns the meta object for class '{@link it.unisannio.rcost.callgraphanalyzer.ExplicitCall <em>Explicit Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Explicit Call</em>'.
	 * @see it.unisannio.rcost.callgraphanalyzer.ExplicitCall
	 * @generated
	 */
	EClass getExplicitCall();

	/**
	 * Returns the meta object for the attribute '{@link it.unisannio.rcost.callgraphanalyzer.ExplicitCall#getGroupId <em>Group Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group Id</em>'.
	 * @see it.unisannio.rcost.callgraphanalyzer.ExplicitCall#getGroupId()
	 * @see #getExplicitCall()
	 * @generated
	 */
	EAttribute getExplicitCall_GroupId();

	/**
	 * Returns the meta object for class '{@link it.unisannio.rcost.callgraphanalyzer.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class</em>'.
	 * @see it.unisannio.rcost.callgraphanalyzer.Class
	 * @generated
	 */
	EClass getClass_();

	/**
	 * Returns the meta object for class '{@link it.unisannio.rcost.callgraphanalyzer.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field</em>'.
	 * @see it.unisannio.rcost.callgraphanalyzer.Field
	 * @generated
	 */
	EClass getField();

	/**
	 * Returns the meta object for the attribute '{@link it.unisannio.rcost.callgraphanalyzer.Field#isIsStrictFP <em>Is Strict FP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Strict FP</em>'.
	 * @see it.unisannio.rcost.callgraphanalyzer.Field#isIsStrictFP()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_IsStrictFP();

	/**
	 * Returns the meta object for the attribute '{@link it.unisannio.rcost.callgraphanalyzer.Field#isIsFinal <em>Is Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Final</em>'.
	 * @see it.unisannio.rcost.callgraphanalyzer.Field#isIsFinal()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_IsFinal();

	/**
	 * Returns the meta object for the attribute '{@link it.unisannio.rcost.callgraphanalyzer.Field#isIsStatic <em>Is Static</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Static</em>'.
	 * @see it.unisannio.rcost.callgraphanalyzer.Field#isIsStatic()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_IsStatic();

	/**
	 * Returns the meta object for the attribute '{@link it.unisannio.rcost.callgraphanalyzer.Field#isIsVolatile <em>Is Volatile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Volatile</em>'.
	 * @see it.unisannio.rcost.callgraphanalyzer.Field#isIsVolatile()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_IsVolatile();

	/**
	 * Returns the meta object for the attribute '{@link it.unisannio.rcost.callgraphanalyzer.Field#getSignature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Signature</em>'.
	 * @see it.unisannio.rcost.callgraphanalyzer.Field#getSignature()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Signature();

	/**
	 * Returns the meta object for the attribute '{@link it.unisannio.rcost.callgraphanalyzer.Field#getScopeModifier <em>Scope Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scope Modifier</em>'.
	 * @see it.unisannio.rcost.callgraphanalyzer.Field#getScopeModifier()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_ScopeModifier();

	/**
	 * Returns the meta object for the attribute '{@link it.unisannio.rcost.callgraphanalyzer.Field#isIsTransient <em>Is Transient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Transient</em>'.
	 * @see it.unisannio.rcost.callgraphanalyzer.Field#isIsTransient()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_IsTransient();

	/**
	 * Returns the meta object for class '{@link it.unisannio.rcost.callgraphanalyzer.Method <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method</em>'.
	 * @see it.unisannio.rcost.callgraphanalyzer.Method
	 * @generated
	 */
	EClass getMethod();

	/**
	 * Returns the meta object for the attribute '{@link it.unisannio.rcost.callgraphanalyzer.Method#isIsStrictFp <em>Is Strict Fp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Strict Fp</em>'.
	 * @see it.unisannio.rcost.callgraphanalyzer.Method#isIsStrictFp()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_IsStrictFp();

	/**
	 * Returns the meta object for the attribute '{@link it.unisannio.rcost.callgraphanalyzer.Method#isIsStatic <em>Is Static</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Static</em>'.
	 * @see it.unisannio.rcost.callgraphanalyzer.Method#isIsStatic()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_IsStatic();

	/**
	 * Returns the meta object for the attribute '{@link it.unisannio.rcost.callgraphanalyzer.Method#isIsNative <em>Is Native</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Native</em>'.
	 * @see it.unisannio.rcost.callgraphanalyzer.Method#isIsNative()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_IsNative();

	/**
	 * Returns the meta object for the attribute '{@link it.unisannio.rcost.callgraphanalyzer.Method#isIsSynchronized <em>Is Synchronized</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Synchronized</em>'.
	 * @see it.unisannio.rcost.callgraphanalyzer.Method#isIsSynchronized()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_IsSynchronized();

	/**
	 * Returns the meta object for the attribute '{@link it.unisannio.rcost.callgraphanalyzer.Method#getScopeModifier <em>Scope Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scope Modifier</em>'.
	 * @see it.unisannio.rcost.callgraphanalyzer.Method#getScopeModifier()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_ScopeModifier();

	/**
	 * Returns the meta object for the attribute '{@link it.unisannio.rcost.callgraphanalyzer.Method#getFlagsModifier <em>Flags Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flags Modifier</em>'.
	 * @see it.unisannio.rcost.callgraphanalyzer.Method#getFlagsModifier()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_FlagsModifier();

	/**
	 * Returns the meta object for the attribute '{@link it.unisannio.rcost.callgraphanalyzer.Method#getSignature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Signature</em>'.
	 * @see it.unisannio.rcost.callgraphanalyzer.Method#getSignature()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_Signature();

	/**
	 * Returns the meta object for the attribute '{@link it.unisannio.rcost.callgraphanalyzer.Method#isIsMain <em>Is Main</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Main</em>'.
	 * @see it.unisannio.rcost.callgraphanalyzer.Method#isIsMain()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_IsMain();

	/**
	 * Returns the meta object for class '{@link it.unisannio.rcost.callgraphanalyzer.Pointcut <em>Pointcut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pointcut</em>'.
	 * @see it.unisannio.rcost.callgraphanalyzer.Pointcut
	 * @generated
	 */
	EClass getPointcut();

	/**
	 * Returns the meta object for the attribute '{@link it.unisannio.rcost.callgraphanalyzer.Pointcut#getScopeModifier <em>Scope Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scope Modifier</em>'.
	 * @see it.unisannio.rcost.callgraphanalyzer.Pointcut#getScopeModifier()
	 * @see #getPointcut()
	 * @generated
	 */
	EAttribute getPointcut_ScopeModifier();

	/**
	 * Returns the meta object for class '{@link it.unisannio.rcost.callgraphanalyzer.Advice <em>Advice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Advice</em>'.
	 * @see it.unisannio.rcost.callgraphanalyzer.Advice
	 * @generated
	 */
	EClass getAdvice();

	/**
	 * Returns the meta object for the attribute '{@link it.unisannio.rcost.callgraphanalyzer.Advice#isIsStrictFp <em>Is Strict Fp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Strict Fp</em>'.
	 * @see it.unisannio.rcost.callgraphanalyzer.Advice#isIsStrictFp()
	 * @see #getAdvice()
	 * @generated
	 */
	EAttribute getAdvice_IsStrictFp();

	/**
	 * Returns the meta object for the attribute '{@link it.unisannio.rcost.callgraphanalyzer.Advice#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see it.unisannio.rcost.callgraphanalyzer.Advice#getKind()
	 * @see #getAdvice()
	 * @generated
	 */
	EAttribute getAdvice_Kind();

	/**
	 * Returns the meta object for the attribute '{@link it.unisannio.rcost.callgraphanalyzer.Advice#getLocalId <em>Local Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local Id</em>'.
	 * @see it.unisannio.rcost.callgraphanalyzer.Advice#getLocalId()
	 * @see #getAdvice()
	 * @generated
	 */
	EAttribute getAdvice_LocalId();

	/**
	 * Returns the meta object for the attribute '{@link it.unisannio.rcost.callgraphanalyzer.Advice#getSignature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Signature</em>'.
	 * @see it.unisannio.rcost.callgraphanalyzer.Advice#getSignature()
	 * @see #getAdvice()
	 * @generated
	 */
	EAttribute getAdvice_Signature();

	/**
	 * Returns the meta object for the attribute '{@link it.unisannio.rcost.callgraphanalyzer.Advice#getPointcutExpression <em>Pointcut Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pointcut Expression</em>'.
	 * @see it.unisannio.rcost.callgraphanalyzer.Advice#getPointcutExpression()
	 * @see #getAdvice()
	 * @generated
	 */
	EAttribute getAdvice_PointcutExpression();

	/**
	 * Returns the meta object for class '{@link it.unisannio.rcost.callgraphanalyzer.Aspect <em>Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aspect</em>'.
	 * @see it.unisannio.rcost.callgraphanalyzer.Aspect
	 * @generated
	 */
	EClass getAspect();

	/**
	 * Returns the meta object for the containment reference list '{@link it.unisannio.rcost.callgraphanalyzer.Aspect#getPointcutsList <em>Pointcuts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pointcuts</em>'.
	 * @see it.unisannio.rcost.callgraphanalyzer.Aspect#getPointcutsList()
	 * @see #getAspect()
	 * @generated
	 */
	EReference getAspect_Pointcuts();

	/**
	 * Returns the meta object for the containment reference list '{@link it.unisannio.rcost.callgraphanalyzer.Aspect#getAdvicesList <em>Advices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Advices</em>'.
	 * @see it.unisannio.rcost.callgraphanalyzer.Aspect#getAdvicesList()
	 * @see #getAspect()
	 * @generated
	 */
	EReference getAspect_Advices();

	/**
	 * Returns the meta object for class '{@link it.unisannio.rcost.callgraphanalyzer.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface</em>'.
	 * @see it.unisannio.rcost.callgraphanalyzer.Interface
	 * @generated
	 */
	EClass getInterface();

	/**
	 * Returns the meta object for the containment reference list '{@link it.unisannio.rcost.callgraphanalyzer.Interface#getMethodsList <em>Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Methods</em>'.
	 * @see it.unisannio.rcost.callgraphanalyzer.Interface#getMethodsList()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_Methods();

	/**
	 * Returns the meta object for the containment reference list '{@link it.unisannio.rcost.callgraphanalyzer.Interface#getFieldsList <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fields</em>'.
	 * @see it.unisannio.rcost.callgraphanalyzer.Interface#getFieldsList()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_Fields();

	/**
	 * Returns the meta object for the attribute '{@link it.unisannio.rcost.callgraphanalyzer.Interface#isIsStatic <em>Is Static</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Static</em>'.
	 * @see it.unisannio.rcost.callgraphanalyzer.Interface#isIsStatic()
	 * @see #getInterface()
	 * @generated
	 */
	EAttribute getInterface_IsStatic();

	/**
	 * Returns the meta object for the attribute '{@link it.unisannio.rcost.callgraphanalyzer.Interface#isIsStrictFp <em>Is Strict Fp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Strict Fp</em>'.
	 * @see it.unisannio.rcost.callgraphanalyzer.Interface#isIsStrictFp()
	 * @see #getInterface()
	 * @generated
	 */
	EAttribute getInterface_IsStrictFp();

	/**
	 * Returns the meta object for the attribute '{@link it.unisannio.rcost.callgraphanalyzer.Interface#getScopeModifier <em>Scope Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scope Modifier</em>'.
	 * @see it.unisannio.rcost.callgraphanalyzer.Interface#getScopeModifier()
	 * @see #getInterface()
	 * @generated
	 */
	EAttribute getInterface_ScopeModifier();

	/**
	 * Returns the meta object for the attribute '{@link it.unisannio.rcost.callgraphanalyzer.Interface#getFlagsModifier <em>Flags Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flags Modifier</em>'.
	 * @see it.unisannio.rcost.callgraphanalyzer.Interface#getFlagsModifier()
	 * @see #getInterface()
	 * @generated
	 */
	EAttribute getInterface_FlagsModifier();

	/**
	 * Returns the meta object for the containment reference list '{@link it.unisannio.rcost.callgraphanalyzer.Interface#getInnerModulesList <em>Inner Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inner Modules</em>'.
	 * @see it.unisannio.rcost.callgraphanalyzer.Interface#getInnerModulesList()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_InnerModules();

	/**
	 * Returns the meta object for the attribute '{@link it.unisannio.rcost.callgraphanalyzer.Interface#getCompilationUnit <em>Compilation Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Compilation Unit</em>'.
	 * @see it.unisannio.rcost.callgraphanalyzer.Interface#getCompilationUnit()
	 * @see #getInterface()
	 * @generated
	 */
	EAttribute getInterface_CompilationUnit();

	/**
	 * Returns the meta object for class '{@link it.unisannio.rcost.callgraphanalyzer.NodeContainer <em>Node Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Container</em>'.
	 * @see it.unisannio.rcost.callgraphanalyzer.NodeContainer
	 * @generated
	 */
	EClass getNodeContainer();

	/**
	 * Returns the meta object for the attribute '{@link it.unisannio.rcost.callgraphanalyzer.NodeContainer#getPackageName <em>Package Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package Name</em>'.
	 * @see it.unisannio.rcost.callgraphanalyzer.NodeContainer#getPackageName()
	 * @see #getNodeContainer()
	 * @generated
	 */
	EAttribute getNodeContainer_PackageName();

	/**
	 * Returns the meta object for class '{@link it.unisannio.rcost.callgraphanalyzer.ImplicitCall <em>Implicit Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implicit Call</em>'.
	 * @see it.unisannio.rcost.callgraphanalyzer.ImplicitCall
	 * @generated
	 */
	EClass getImplicitCall();

	/**
	 * Returns the meta object for the reference '{@link it.unisannio.rcost.callgraphanalyzer.ImplicitCall#getJoinPointShadow <em>Join Point Shadow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Join Point Shadow</em>'.
	 * @see it.unisannio.rcost.callgraphanalyzer.ImplicitCall#getJoinPointShadow()
	 * @see #getImplicitCall()
	 * @generated
	 */
	EReference getImplicitCall_JoinPointShadow();

	/**
	 * Returns the meta object for the attribute '{@link it.unisannio.rcost.callgraphanalyzer.ImplicitCall#getJoinPointShadowType <em>Join Point Shadow Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Join Point Shadow Type</em>'.
	 * @see it.unisannio.rcost.callgraphanalyzer.ImplicitCall#getJoinPointShadowType()
	 * @see #getImplicitCall()
	 * @generated
	 */
	EAttribute getImplicitCall_JoinPointShadowType();

	/**
	 * Returns the meta object for the attribute '{@link it.unisannio.rcost.callgraphanalyzer.ImplicitCall#getSourceLine <em>Source Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Line</em>'.
	 * @see it.unisannio.rcost.callgraphanalyzer.ImplicitCall#getSourceLine()
	 * @see #getImplicitCall()
	 * @generated
	 */
	EAttribute getImplicitCall_SourceLine();

	/**
	 * Returns the meta object for class '{@link it.unisannio.rcost.callgraphanalyzer.Association <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association</em>'.
	 * @see it.unisannio.rcost.callgraphanalyzer.Association
	 * @generated
	 */
	EClass getAssociation();

	/**
	 * Returns the meta object for class '{@link it.unisannio.rcost.callgraphanalyzer.Implementation <em>Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implementation</em>'.
	 * @see it.unisannio.rcost.callgraphanalyzer.Implementation
	 * @generated
	 */
	EClass getImplementation();

	/**
	 * Returns the meta object for class '{@link it.unisannio.rcost.callgraphanalyzer.Dependence <em>Dependence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependence</em>'.
	 * @see it.unisannio.rcost.callgraphanalyzer.Dependence
	 * @generated
	 */
	EClass getDependence();

	/**
	 * Returns the meta object for the attribute '{@link it.unisannio.rcost.callgraphanalyzer.Dependence#isIsGet <em>Is Get</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Get</em>'.
	 * @see it.unisannio.rcost.callgraphanalyzer.Dependence#isIsGet()
	 * @see #getDependence()
	 * @generated
	 */
	EAttribute getDependence_IsGet();

	/**
	 * Returns the meta object for the attribute '{@link it.unisannio.rcost.callgraphanalyzer.Dependence#isIsSet <em>Is Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Set</em>'.
	 * @see it.unisannio.rcost.callgraphanalyzer.Dependence#isIsSet()
	 * @see #getDependence()
	 * @generated
	 */
	EAttribute getDependence_IsSet();

	/**
	 * Returns the meta object for class '{@link it.unisannio.rcost.callgraphanalyzer.Extension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extension</em>'.
	 * @see it.unisannio.rcost.callgraphanalyzer.Extension
	 * @generated
	 */
	EClass getExtension();

	/**
	 * Returns the meta object for class '{@link it.unisannio.rcost.callgraphanalyzer.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project</em>'.
	 * @see it.unisannio.rcost.callgraphanalyzer.Project
	 * @generated
	 */
	EClass getProject();

	/**
	 * Returns the meta object for the containment reference list '{@link it.unisannio.rcost.callgraphanalyzer.Project#getRootPackagesList <em>Root Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Root Packages</em>'.
	 * @see it.unisannio.rcost.callgraphanalyzer.Project#getRootPackagesList()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_RootPackages();

	/**
	 * Returns the meta object for the attribute '{@link it.unisannio.rcost.callgraphanalyzer.Project#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.unisannio.rcost.callgraphanalyzer.Project#getName()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_Name();

	/**
	 * Returns the meta object for the attribute '{@link it.unisannio.rcost.callgraphanalyzer.Project#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author</em>'.
	 * @see it.unisannio.rcost.callgraphanalyzer.Project#getAuthor()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_Author();

	/**
	 * Returns the meta object for class '{@link it.unisannio.rcost.callgraphanalyzer.NodeLeaf <em>Node Leaf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Leaf</em>'.
	 * @see it.unisannio.rcost.callgraphanalyzer.NodeLeaf
	 * @generated
	 */
	EClass getNodeLeaf();

	/**
	 * Returns the meta object for class '{@link it.unisannio.rcost.callgraphanalyzer.ImplicitCallDecorator <em>Implicit Call Decorator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implicit Call Decorator</em>'.
	 * @see it.unisannio.rcost.callgraphanalyzer.ImplicitCallDecorator
	 * @generated
	 */
	EClass getImplicitCallDecorator();

	/**
	 * Returns the meta object for the containment reference list '{@link it.unisannio.rcost.callgraphanalyzer.ImplicitCallDecorator#getImplicitCallsList <em>Implicit Calls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Implicit Calls</em>'.
	 * @see it.unisannio.rcost.callgraphanalyzer.ImplicitCallDecorator#getImplicitCallsList()
	 * @see #getImplicitCallDecorator()
	 * @generated
	 */
	EReference getImplicitCallDecorator_ImplicitCalls();

	/**
	 * Returns the meta object for class '{@link it.unisannio.rcost.callgraphanalyzer.ExplicitCallDecorator <em>Explicit Call Decorator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Explicit Call Decorator</em>'.
	 * @see it.unisannio.rcost.callgraphanalyzer.ExplicitCallDecorator
	 * @generated
	 */
	EClass getExplicitCallDecorator();

	/**
	 * Returns the meta object for the containment reference list '{@link it.unisannio.rcost.callgraphanalyzer.ExplicitCallDecorator#getExplicitCallsList <em>Explicit Calls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Explicit Calls</em>'.
	 * @see it.unisannio.rcost.callgraphanalyzer.ExplicitCallDecorator#getExplicitCallsList()
	 * @see #getExplicitCallDecorator()
	 * @generated
	 */
	EReference getExplicitCallDecorator_ExplicitCalls();

	/**
	 * Returns the meta object for class '{@link it.unisannio.rcost.callgraphanalyzer.DependenceDecorator <em>Dependence Decorator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependence Decorator</em>'.
	 * @see it.unisannio.rcost.callgraphanalyzer.DependenceDecorator
	 * @generated
	 */
	EClass getDependenceDecorator();

	/**
	 * Returns the meta object for the containment reference list '{@link it.unisannio.rcost.callgraphanalyzer.DependenceDecorator#getDependencesList <em>Dependences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dependences</em>'.
	 * @see it.unisannio.rcost.callgraphanalyzer.DependenceDecorator#getDependencesList()
	 * @see #getDependenceDecorator()
	 * @generated
	 */
	EReference getDependenceDecorator_Dependences();

	/**
	 * Returns the meta object for class '{@link it.unisannio.rcost.callgraphanalyzer.EdgeDecorator <em>Edge Decorator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge Decorator</em>'.
	 * @see it.unisannio.rcost.callgraphanalyzer.EdgeDecorator
	 * @generated
	 */
	EClass getEdgeDecorator();

	/**
	 * Returns the meta object for class '{@link it.unisannio.rcost.callgraphanalyzer.JoinPointShadow <em>Join Point Shadow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Join Point Shadow</em>'.
	 * @see it.unisannio.rcost.callgraphanalyzer.JoinPointShadow
	 * @generated
	 */
	EClass getJoinPointShadow();

	/**
	 * Returns the meta object for the reference list '{@link it.unisannio.rcost.callgraphanalyzer.JoinPointShadow#getHandlersList <em>Handlers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Handlers</em>'.
	 * @see it.unisannio.rcost.callgraphanalyzer.JoinPointShadow#getHandlersList()
	 * @see #getJoinPointShadow()
	 * @generated
	 */
	EReference getJoinPointShadow_Handlers();

	/**
	 * Returns the meta object for enum '{@link it.unisannio.rcost.callgraphanalyzer.FlagsModifier <em>Flags Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Flags Modifier</em>'.
	 * @see it.unisannio.rcost.callgraphanalyzer.FlagsModifier
	 * @generated
	 */
	EEnum getFlagsModifier();

	/**
	 * Returns the meta object for enum '{@link it.unisannio.rcost.callgraphanalyzer.ScopeModifier <em>Scope Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Scope Modifier</em>'.
	 * @see it.unisannio.rcost.callgraphanalyzer.ScopeModifier
	 * @generated
	 */
	EEnum getScopeModifier();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CallGraphFactory getCallGraphFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link it.unisannio.rcost.callgraphanalyzer.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unisannio.rcost.callgraphanalyzer.impl.NodeImpl
		 * @see it.unisannio.rcost.callgraphanalyzer.impl.CallGraphPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>In Edges</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__IN_EDGES = eINSTANCE.getNode_InEdges();

		/**
		 * The meta object literal for the '<em><b>Out Edges</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__OUT_EDGES = eINSTANCE.getNode_OutEdges();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__NAME = eINSTANCE.getNode_Name();

		/**
		 * The meta object literal for the '<em><b>Node Container</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__NODE_CONTAINER = eINSTANCE.getNode_NodeContainer();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__ID = eINSTANCE.getNode_Id();

		/**
		 * The meta object literal for the '{@link it.unisannio.rcost.callgraphanalyzer.impl.EdgeImpl <em>Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unisannio.rcost.callgraphanalyzer.impl.EdgeImpl
		 * @see it.unisannio.rcost.callgraphanalyzer.impl.CallGraphPackageImpl#getEdge()
		 * @generated
		 */
		EClass EDGE = eINSTANCE.getEdge();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE__SOURCE = eINSTANCE.getEdge_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE__TARGET = eINSTANCE.getEdge_Target();

		/**
		 * The meta object literal for the '{@link it.unisannio.rcost.callgraphanalyzer.impl.GraphImpl <em>Graph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unisannio.rcost.callgraphanalyzer.impl.GraphImpl
		 * @see it.unisannio.rcost.callgraphanalyzer.impl.CallGraphPackageImpl#getGraph()
		 * @generated
		 */
		EClass GRAPH = eINSTANCE.getGraph();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH__NODES = eINSTANCE.getGraph_Nodes();

		/**
		 * The meta object literal for the '<em><b>First Level Graph</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH__FIRST_LEVEL_GRAPH = eINSTANCE.getGraph_FirstLevelGraph();

		/**
		 * The meta object literal for the '{@link it.unisannio.rcost.callgraphanalyzer.impl.PackageImpl <em>Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unisannio.rcost.callgraphanalyzer.impl.PackageImpl
		 * @see it.unisannio.rcost.callgraphanalyzer.impl.CallGraphPackageImpl#getPackage()
		 * @generated
		 */
		EClass PACKAGE = eINSTANCE.getPackage();

		/**
		 * The meta object literal for the '<em><b>Inner Modules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__INNER_MODULES = eINSTANCE.getPackage_InnerModules();

		/**
		 * The meta object literal for the '<em><b>Packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__PACKAGES = eINSTANCE.getPackage_Packages();

		/**
		 * The meta object literal for the '{@link it.unisannio.rcost.callgraphanalyzer.impl.ExplicitCallImpl <em>Explicit Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unisannio.rcost.callgraphanalyzer.impl.ExplicitCallImpl
		 * @see it.unisannio.rcost.callgraphanalyzer.impl.CallGraphPackageImpl#getExplicitCall()
		 * @generated
		 */
		EClass EXPLICIT_CALL = eINSTANCE.getExplicitCall();

		/**
		 * The meta object literal for the '<em><b>Group Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPLICIT_CALL__GROUP_ID = eINSTANCE.getExplicitCall_GroupId();

		/**
		 * The meta object literal for the '{@link it.unisannio.rcost.callgraphanalyzer.impl.ClassImpl <em>Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unisannio.rcost.callgraphanalyzer.impl.ClassImpl
		 * @see it.unisannio.rcost.callgraphanalyzer.impl.CallGraphPackageImpl#getClass_()
		 * @generated
		 */
		EClass CLASS = eINSTANCE.getClass_();

		/**
		 * The meta object literal for the '{@link it.unisannio.rcost.callgraphanalyzer.impl.FieldImpl <em>Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unisannio.rcost.callgraphanalyzer.impl.FieldImpl
		 * @see it.unisannio.rcost.callgraphanalyzer.impl.CallGraphPackageImpl#getField()
		 * @generated
		 */
		EClass FIELD = eINSTANCE.getField();

		/**
		 * The meta object literal for the '<em><b>Is Strict FP</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__IS_STRICT_FP = eINSTANCE.getField_IsStrictFP();

		/**
		 * The meta object literal for the '<em><b>Is Final</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__IS_FINAL = eINSTANCE.getField_IsFinal();

		/**
		 * The meta object literal for the '<em><b>Is Static</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__IS_STATIC = eINSTANCE.getField_IsStatic();

		/**
		 * The meta object literal for the '<em><b>Is Volatile</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__IS_VOLATILE = eINSTANCE.getField_IsVolatile();

		/**
		 * The meta object literal for the '<em><b>Signature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__SIGNATURE = eINSTANCE.getField_Signature();

		/**
		 * The meta object literal for the '<em><b>Scope Modifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__SCOPE_MODIFIER = eINSTANCE.getField_ScopeModifier();

		/**
		 * The meta object literal for the '<em><b>Is Transient</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__IS_TRANSIENT = eINSTANCE.getField_IsTransient();

		/**
		 * The meta object literal for the '{@link it.unisannio.rcost.callgraphanalyzer.impl.MethodImpl <em>Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unisannio.rcost.callgraphanalyzer.impl.MethodImpl
		 * @see it.unisannio.rcost.callgraphanalyzer.impl.CallGraphPackageImpl#getMethod()
		 * @generated
		 */
		EClass METHOD = eINSTANCE.getMethod();

		/**
		 * The meta object literal for the '<em><b>Is Strict Fp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__IS_STRICT_FP = eINSTANCE.getMethod_IsStrictFp();

		/**
		 * The meta object literal for the '<em><b>Is Static</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__IS_STATIC = eINSTANCE.getMethod_IsStatic();

		/**
		 * The meta object literal for the '<em><b>Is Native</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__IS_NATIVE = eINSTANCE.getMethod_IsNative();

		/**
		 * The meta object literal for the '<em><b>Is Synchronized</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__IS_SYNCHRONIZED = eINSTANCE.getMethod_IsSynchronized();

		/**
		 * The meta object literal for the '<em><b>Scope Modifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__SCOPE_MODIFIER = eINSTANCE.getMethod_ScopeModifier();

		/**
		 * The meta object literal for the '<em><b>Flags Modifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__FLAGS_MODIFIER = eINSTANCE.getMethod_FlagsModifier();

		/**
		 * The meta object literal for the '<em><b>Signature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__SIGNATURE = eINSTANCE.getMethod_Signature();

		/**
		 * The meta object literal for the '<em><b>Is Main</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__IS_MAIN = eINSTANCE.getMethod_IsMain();

		/**
		 * The meta object literal for the '{@link it.unisannio.rcost.callgraphanalyzer.impl.PointcutImpl <em>Pointcut</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unisannio.rcost.callgraphanalyzer.impl.PointcutImpl
		 * @see it.unisannio.rcost.callgraphanalyzer.impl.CallGraphPackageImpl#getPointcut()
		 * @generated
		 */
		EClass POINTCUT = eINSTANCE.getPointcut();

		/**
		 * The meta object literal for the '<em><b>Scope Modifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINTCUT__SCOPE_MODIFIER = eINSTANCE.getPointcut_ScopeModifier();

		/**
		 * The meta object literal for the '{@link it.unisannio.rcost.callgraphanalyzer.impl.AdviceImpl <em>Advice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unisannio.rcost.callgraphanalyzer.impl.AdviceImpl
		 * @see it.unisannio.rcost.callgraphanalyzer.impl.CallGraphPackageImpl#getAdvice()
		 * @generated
		 */
		EClass ADVICE = eINSTANCE.getAdvice();

		/**
		 * The meta object literal for the '<em><b>Is Strict Fp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADVICE__IS_STRICT_FP = eINSTANCE.getAdvice_IsStrictFp();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADVICE__KIND = eINSTANCE.getAdvice_Kind();

		/**
		 * The meta object literal for the '<em><b>Local Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADVICE__LOCAL_ID = eINSTANCE.getAdvice_LocalId();

		/**
		 * The meta object literal for the '<em><b>Signature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADVICE__SIGNATURE = eINSTANCE.getAdvice_Signature();

		/**
		 * The meta object literal for the '<em><b>Pointcut Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADVICE__POINTCUT_EXPRESSION = eINSTANCE.getAdvice_PointcutExpression();

		/**
		 * The meta object literal for the '{@link it.unisannio.rcost.callgraphanalyzer.impl.AspectImpl <em>Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unisannio.rcost.callgraphanalyzer.impl.AspectImpl
		 * @see it.unisannio.rcost.callgraphanalyzer.impl.CallGraphPackageImpl#getAspect()
		 * @generated
		 */
		EClass ASPECT = eINSTANCE.getAspect();

		/**
		 * The meta object literal for the '<em><b>Pointcuts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASPECT__POINTCUTS = eINSTANCE.getAspect_Pointcuts();

		/**
		 * The meta object literal for the '<em><b>Advices</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASPECT__ADVICES = eINSTANCE.getAspect_Advices();

		/**
		 * The meta object literal for the '{@link it.unisannio.rcost.callgraphanalyzer.impl.InterfaceImpl <em>Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unisannio.rcost.callgraphanalyzer.impl.InterfaceImpl
		 * @see it.unisannio.rcost.callgraphanalyzer.impl.CallGraphPackageImpl#getInterface()
		 * @generated
		 */
		EClass INTERFACE = eINSTANCE.getInterface();

		/**
		 * The meta object literal for the '<em><b>Methods</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE__METHODS = eINSTANCE.getInterface_Methods();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE__FIELDS = eINSTANCE.getInterface_Fields();

		/**
		 * The meta object literal for the '<em><b>Is Static</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE__IS_STATIC = eINSTANCE.getInterface_IsStatic();

		/**
		 * The meta object literal for the '<em><b>Is Strict Fp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE__IS_STRICT_FP = eINSTANCE.getInterface_IsStrictFp();

		/**
		 * The meta object literal for the '<em><b>Scope Modifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE__SCOPE_MODIFIER = eINSTANCE.getInterface_ScopeModifier();

		/**
		 * The meta object literal for the '<em><b>Flags Modifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE__FLAGS_MODIFIER = eINSTANCE.getInterface_FlagsModifier();

		/**
		 * The meta object literal for the '<em><b>Inner Modules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE__INNER_MODULES = eINSTANCE.getInterface_InnerModules();

		/**
		 * The meta object literal for the '<em><b>Compilation Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE__COMPILATION_UNIT = eINSTANCE.getInterface_CompilationUnit();

		/**
		 * The meta object literal for the '{@link it.unisannio.rcost.callgraphanalyzer.impl.NodeContainerImpl <em>Node Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unisannio.rcost.callgraphanalyzer.impl.NodeContainerImpl
		 * @see it.unisannio.rcost.callgraphanalyzer.impl.CallGraphPackageImpl#getNodeContainer()
		 * @generated
		 */
		EClass NODE_CONTAINER = eINSTANCE.getNodeContainer();

		/**
		 * The meta object literal for the '<em><b>Package Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_CONTAINER__PACKAGE_NAME = eINSTANCE.getNodeContainer_PackageName();

		/**
		 * The meta object literal for the '{@link it.unisannio.rcost.callgraphanalyzer.impl.ImplicitCallImpl <em>Implicit Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unisannio.rcost.callgraphanalyzer.impl.ImplicitCallImpl
		 * @see it.unisannio.rcost.callgraphanalyzer.impl.CallGraphPackageImpl#getImplicitCall()
		 * @generated
		 */
		EClass IMPLICIT_CALL = eINSTANCE.getImplicitCall();

		/**
		 * The meta object literal for the '<em><b>Join Point Shadow</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLICIT_CALL__JOIN_POINT_SHADOW = eINSTANCE.getImplicitCall_JoinPointShadow();

		/**
		 * The meta object literal for the '<em><b>Join Point Shadow Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPLICIT_CALL__JOIN_POINT_SHADOW_TYPE = eINSTANCE.getImplicitCall_JoinPointShadowType();

		/**
		 * The meta object literal for the '<em><b>Source Line</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPLICIT_CALL__SOURCE_LINE = eINSTANCE.getImplicitCall_SourceLine();

		/**
		 * The meta object literal for the '{@link it.unisannio.rcost.callgraphanalyzer.impl.AssociationImpl <em>Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unisannio.rcost.callgraphanalyzer.impl.AssociationImpl
		 * @see it.unisannio.rcost.callgraphanalyzer.impl.CallGraphPackageImpl#getAssociation()
		 * @generated
		 */
		EClass ASSOCIATION = eINSTANCE.getAssociation();

		/**
		 * The meta object literal for the '{@link it.unisannio.rcost.callgraphanalyzer.impl.ImplementationImpl <em>Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unisannio.rcost.callgraphanalyzer.impl.ImplementationImpl
		 * @see it.unisannio.rcost.callgraphanalyzer.impl.CallGraphPackageImpl#getImplementation()
		 * @generated
		 */
		EClass IMPLEMENTATION = eINSTANCE.getImplementation();

		/**
		 * The meta object literal for the '{@link it.unisannio.rcost.callgraphanalyzer.impl.DependenceImpl <em>Dependence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unisannio.rcost.callgraphanalyzer.impl.DependenceImpl
		 * @see it.unisannio.rcost.callgraphanalyzer.impl.CallGraphPackageImpl#getDependence()
		 * @generated
		 */
		EClass DEPENDENCE = eINSTANCE.getDependence();

		/**
		 * The meta object literal for the '<em><b>Is Get</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPENDENCE__IS_GET = eINSTANCE.getDependence_IsGet();

		/**
		 * The meta object literal for the '<em><b>Is Set</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPENDENCE__IS_SET = eINSTANCE.getDependence_IsSet();

		/**
		 * The meta object literal for the '{@link it.unisannio.rcost.callgraphanalyzer.impl.ExtensionImpl <em>Extension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unisannio.rcost.callgraphanalyzer.impl.ExtensionImpl
		 * @see it.unisannio.rcost.callgraphanalyzer.impl.CallGraphPackageImpl#getExtension()
		 * @generated
		 */
		EClass EXTENSION = eINSTANCE.getExtension();

		/**
		 * The meta object literal for the '{@link it.unisannio.rcost.callgraphanalyzer.impl.ProjectImpl <em>Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unisannio.rcost.callgraphanalyzer.impl.ProjectImpl
		 * @see it.unisannio.rcost.callgraphanalyzer.impl.CallGraphPackageImpl#getProject()
		 * @generated
		 */
		EClass PROJECT = eINSTANCE.getProject();

		/**
		 * The meta object literal for the '<em><b>Root Packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__ROOT_PACKAGES = eINSTANCE.getProject_RootPackages();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__NAME = eINSTANCE.getProject_Name();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__AUTHOR = eINSTANCE.getProject_Author();

		/**
		 * The meta object literal for the '{@link it.unisannio.rcost.callgraphanalyzer.impl.NodeLeafImpl <em>Node Leaf</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unisannio.rcost.callgraphanalyzer.impl.NodeLeafImpl
		 * @see it.unisannio.rcost.callgraphanalyzer.impl.CallGraphPackageImpl#getNodeLeaf()
		 * @generated
		 */
		EClass NODE_LEAF = eINSTANCE.getNodeLeaf();

		/**
		 * The meta object literal for the '{@link it.unisannio.rcost.callgraphanalyzer.impl.ImplicitCallDecoratorImpl <em>Implicit Call Decorator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unisannio.rcost.callgraphanalyzer.impl.ImplicitCallDecoratorImpl
		 * @see it.unisannio.rcost.callgraphanalyzer.impl.CallGraphPackageImpl#getImplicitCallDecorator()
		 * @generated
		 */
		EClass IMPLICIT_CALL_DECORATOR = eINSTANCE.getImplicitCallDecorator();

		/**
		 * The meta object literal for the '<em><b>Implicit Calls</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLICIT_CALL_DECORATOR__IMPLICIT_CALLS = eINSTANCE.getImplicitCallDecorator_ImplicitCalls();

		/**
		 * The meta object literal for the '{@link it.unisannio.rcost.callgraphanalyzer.impl.ExplicitCallDecoratorImpl <em>Explicit Call Decorator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unisannio.rcost.callgraphanalyzer.impl.ExplicitCallDecoratorImpl
		 * @see it.unisannio.rcost.callgraphanalyzer.impl.CallGraphPackageImpl#getExplicitCallDecorator()
		 * @generated
		 */
		EClass EXPLICIT_CALL_DECORATOR = eINSTANCE.getExplicitCallDecorator();

		/**
		 * The meta object literal for the '<em><b>Explicit Calls</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPLICIT_CALL_DECORATOR__EXPLICIT_CALLS = eINSTANCE.getExplicitCallDecorator_ExplicitCalls();

		/**
		 * The meta object literal for the '{@link it.unisannio.rcost.callgraphanalyzer.impl.DependenceDecoratorImpl <em>Dependence Decorator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unisannio.rcost.callgraphanalyzer.impl.DependenceDecoratorImpl
		 * @see it.unisannio.rcost.callgraphanalyzer.impl.CallGraphPackageImpl#getDependenceDecorator()
		 * @generated
		 */
		EClass DEPENDENCE_DECORATOR = eINSTANCE.getDependenceDecorator();

		/**
		 * The meta object literal for the '<em><b>Dependences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDENCE_DECORATOR__DEPENDENCES = eINSTANCE.getDependenceDecorator_Dependences();

		/**
		 * The meta object literal for the '{@link it.unisannio.rcost.callgraphanalyzer.EdgeDecorator <em>Edge Decorator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unisannio.rcost.callgraphanalyzer.EdgeDecorator
		 * @see it.unisannio.rcost.callgraphanalyzer.impl.CallGraphPackageImpl#getEdgeDecorator()
		 * @generated
		 */
		EClass EDGE_DECORATOR = eINSTANCE.getEdgeDecorator();

		/**
		 * The meta object literal for the '{@link it.unisannio.rcost.callgraphanalyzer.impl.JoinPointShadowImpl <em>Join Point Shadow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unisannio.rcost.callgraphanalyzer.impl.JoinPointShadowImpl
		 * @see it.unisannio.rcost.callgraphanalyzer.impl.CallGraphPackageImpl#getJoinPointShadow()
		 * @generated
		 */
		EClass JOIN_POINT_SHADOW = eINSTANCE.getJoinPointShadow();

		/**
		 * The meta object literal for the '<em><b>Handlers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOIN_POINT_SHADOW__HANDLERS = eINSTANCE.getJoinPointShadow_Handlers();

		/**
		 * The meta object literal for the '{@link it.unisannio.rcost.callgraphanalyzer.FlagsModifier <em>Flags Modifier</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unisannio.rcost.callgraphanalyzer.FlagsModifier
		 * @see it.unisannio.rcost.callgraphanalyzer.impl.CallGraphPackageImpl#getFlagsModifier()
		 * @generated
		 */
		EEnum FLAGS_MODIFIER = eINSTANCE.getFlagsModifier();

		/**
		 * The meta object literal for the '{@link it.unisannio.rcost.callgraphanalyzer.ScopeModifier <em>Scope Modifier</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unisannio.rcost.callgraphanalyzer.ScopeModifier
		 * @see it.unisannio.rcost.callgraphanalyzer.impl.CallGraphPackageImpl#getScopeModifier()
		 * @generated
		 */
		EEnum SCOPE_MODIFIER = eINSTANCE.getScopeModifier();

	}

} //CallGraphPackage
