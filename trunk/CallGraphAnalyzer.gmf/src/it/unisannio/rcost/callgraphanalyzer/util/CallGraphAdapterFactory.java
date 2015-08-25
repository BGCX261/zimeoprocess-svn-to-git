/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unisannio.rcost.callgraphanalyzer.util;

import it.unisannio.rcost.callgraphanalyzer.Advice;
import it.unisannio.rcost.callgraphanalyzer.Aspect;
import it.unisannio.rcost.callgraphanalyzer.Association;
import it.unisannio.rcost.callgraphanalyzer.CallGraphPackage;
import it.unisannio.rcost.callgraphanalyzer.Dependence;
import it.unisannio.rcost.callgraphanalyzer.DependenceDecorator;
import it.unisannio.rcost.callgraphanalyzer.Edge;
import it.unisannio.rcost.callgraphanalyzer.EdgeDecorator;
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
import it.unisannio.rcost.callgraphanalyzer.Pointcut;
import it.unisannio.rcost.callgraphanalyzer.Project;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see it.unisannio.rcost.callgraphanalyzer.CallGraphPackage
 * @generated
 */
public class CallGraphAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CallGraphPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallGraphAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CallGraphPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch the delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CallGraphSwitch<Adapter> modelSwitch =
		new CallGraphSwitch<Adapter>() {
			@Override
			public Adapter caseNode(Node object) {
				return createNodeAdapter();
			}
			@Override
			public Adapter caseEdge(Edge object) {
				return createEdgeAdapter();
			}
			@Override
			public Adapter caseGraph(Graph object) {
				return createGraphAdapter();
			}
			@Override
			public Adapter casePackage(it.unisannio.rcost.callgraphanalyzer.Package object) {
				return createPackageAdapter();
			}
			@Override
			public Adapter caseExplicitCall(ExplicitCall object) {
				return createExplicitCallAdapter();
			}
			@Override
			public Adapter caseClass(it.unisannio.rcost.callgraphanalyzer.Class object) {
				return createClassAdapter();
			}
			@Override
			public Adapter caseField(Field object) {
				return createFieldAdapter();
			}
			@Override
			public Adapter caseMethod(Method object) {
				return createMethodAdapter();
			}
			@Override
			public Adapter casePointcut(Pointcut object) {
				return createPointcutAdapter();
			}
			@Override
			public Adapter caseAdvice(Advice object) {
				return createAdviceAdapter();
			}
			@Override
			public Adapter caseAspect(Aspect object) {
				return createAspectAdapter();
			}
			@Override
			public Adapter caseInterface(Interface object) {
				return createInterfaceAdapter();
			}
			@Override
			public Adapter caseNodeContainer(NodeContainer object) {
				return createNodeContainerAdapter();
			}
			@Override
			public Adapter caseImplicitCall(ImplicitCall object) {
				return createImplicitCallAdapter();
			}
			@Override
			public Adapter caseAssociation(Association object) {
				return createAssociationAdapter();
			}
			@Override
			public Adapter caseImplementation(Implementation object) {
				return createImplementationAdapter();
			}
			@Override
			public Adapter caseDependence(Dependence object) {
				return createDependenceAdapter();
			}
			@Override
			public Adapter caseExtension(Extension object) {
				return createExtensionAdapter();
			}
			@Override
			public Adapter caseProject(Project object) {
				return createProjectAdapter();
			}
			@Override
			public Adapter caseNodeLeaf(NodeLeaf object) {
				return createNodeLeafAdapter();
			}
			@Override
			public Adapter caseImplicitCallDecorator(ImplicitCallDecorator object) {
				return createImplicitCallDecoratorAdapter();
			}
			@Override
			public Adapter caseExplicitCallDecorator(ExplicitCallDecorator object) {
				return createExplicitCallDecoratorAdapter();
			}
			@Override
			public Adapter caseDependenceDecorator(DependenceDecorator object) {
				return createDependenceDecoratorAdapter();
			}
			@Override
			public Adapter caseEdgeDecorator(EdgeDecorator object) {
				return createEdgeDecoratorAdapter();
			}
			@Override
			public Adapter caseJoinPointShadow(JoinPointShadow object) {
				return createJoinPointShadowAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link it.unisannio.rcost.callgraphanalyzer.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unisannio.rcost.callgraphanalyzer.Node
	 * @generated
	 */
	public Adapter createNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unisannio.rcost.callgraphanalyzer.Edge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unisannio.rcost.callgraphanalyzer.Edge
	 * @generated
	 */
	public Adapter createEdgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unisannio.rcost.callgraphanalyzer.Graph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unisannio.rcost.callgraphanalyzer.Graph
	 * @generated
	 */
	public Adapter createGraphAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unisannio.rcost.callgraphanalyzer.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unisannio.rcost.callgraphanalyzer.Package
	 * @generated
	 */
	public Adapter createPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unisannio.rcost.callgraphanalyzer.ExplicitCall <em>Explicit Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unisannio.rcost.callgraphanalyzer.ExplicitCall
	 * @generated
	 */
	public Adapter createExplicitCallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unisannio.rcost.callgraphanalyzer.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unisannio.rcost.callgraphanalyzer.Class
	 * @generated
	 */
	public Adapter createClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unisannio.rcost.callgraphanalyzer.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unisannio.rcost.callgraphanalyzer.Field
	 * @generated
	 */
	public Adapter createFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unisannio.rcost.callgraphanalyzer.Method <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unisannio.rcost.callgraphanalyzer.Method
	 * @generated
	 */
	public Adapter createMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unisannio.rcost.callgraphanalyzer.Pointcut <em>Pointcut</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unisannio.rcost.callgraphanalyzer.Pointcut
	 * @generated
	 */
	public Adapter createPointcutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unisannio.rcost.callgraphanalyzer.Advice <em>Advice</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unisannio.rcost.callgraphanalyzer.Advice
	 * @generated
	 */
	public Adapter createAdviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unisannio.rcost.callgraphanalyzer.Aspect <em>Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unisannio.rcost.callgraphanalyzer.Aspect
	 * @generated
	 */
	public Adapter createAspectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unisannio.rcost.callgraphanalyzer.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unisannio.rcost.callgraphanalyzer.Interface
	 * @generated
	 */
	public Adapter createInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unisannio.rcost.callgraphanalyzer.NodeContainer <em>Node Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unisannio.rcost.callgraphanalyzer.NodeContainer
	 * @generated
	 */
	public Adapter createNodeContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unisannio.rcost.callgraphanalyzer.ImplicitCall <em>Implicit Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unisannio.rcost.callgraphanalyzer.ImplicitCall
	 * @generated
	 */
	public Adapter createImplicitCallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unisannio.rcost.callgraphanalyzer.Association <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unisannio.rcost.callgraphanalyzer.Association
	 * @generated
	 */
	public Adapter createAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unisannio.rcost.callgraphanalyzer.Implementation <em>Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unisannio.rcost.callgraphanalyzer.Implementation
	 * @generated
	 */
	public Adapter createImplementationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unisannio.rcost.callgraphanalyzer.Dependence <em>Dependence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unisannio.rcost.callgraphanalyzer.Dependence
	 * @generated
	 */
	public Adapter createDependenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unisannio.rcost.callgraphanalyzer.Extension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unisannio.rcost.callgraphanalyzer.Extension
	 * @generated
	 */
	public Adapter createExtensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unisannio.rcost.callgraphanalyzer.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unisannio.rcost.callgraphanalyzer.Project
	 * @generated
	 */
	public Adapter createProjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unisannio.rcost.callgraphanalyzer.NodeLeaf <em>Node Leaf</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unisannio.rcost.callgraphanalyzer.NodeLeaf
	 * @generated
	 */
	public Adapter createNodeLeafAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unisannio.rcost.callgraphanalyzer.ImplicitCallDecorator <em>Implicit Call Decorator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unisannio.rcost.callgraphanalyzer.ImplicitCallDecorator
	 * @generated
	 */
	public Adapter createImplicitCallDecoratorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unisannio.rcost.callgraphanalyzer.ExplicitCallDecorator <em>Explicit Call Decorator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unisannio.rcost.callgraphanalyzer.ExplicitCallDecorator
	 * @generated
	 */
	public Adapter createExplicitCallDecoratorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unisannio.rcost.callgraphanalyzer.DependenceDecorator <em>Dependence Decorator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unisannio.rcost.callgraphanalyzer.DependenceDecorator
	 * @generated
	 */
	public Adapter createDependenceDecoratorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unisannio.rcost.callgraphanalyzer.EdgeDecorator <em>Edge Decorator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unisannio.rcost.callgraphanalyzer.EdgeDecorator
	 * @generated
	 */
	public Adapter createEdgeDecoratorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unisannio.rcost.callgraphanalyzer.JoinPointShadow <em>Join Point Shadow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unisannio.rcost.callgraphanalyzer.JoinPointShadow
	 * @generated
	 */
	public Adapter createJoinPointShadowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //CallGraphAdapterFactory
