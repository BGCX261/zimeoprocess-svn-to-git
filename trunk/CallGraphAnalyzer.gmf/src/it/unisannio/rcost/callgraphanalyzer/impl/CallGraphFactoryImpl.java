/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unisannio.rcost.callgraphanalyzer.impl;

import it.unisannio.rcost.callgraphanalyzer.Advice;
import it.unisannio.rcost.callgraphanalyzer.Aspect;
import it.unisannio.rcost.callgraphanalyzer.Association;
import it.unisannio.rcost.callgraphanalyzer.CallGraphFactory;
import it.unisannio.rcost.callgraphanalyzer.CallGraphPackage;
import it.unisannio.rcost.callgraphanalyzer.Dependence;
import it.unisannio.rcost.callgraphanalyzer.DependenceDecorator;
import it.unisannio.rcost.callgraphanalyzer.ExplicitCall;
import it.unisannio.rcost.callgraphanalyzer.ExplicitCallDecorator;
import it.unisannio.rcost.callgraphanalyzer.Extension;
import it.unisannio.rcost.callgraphanalyzer.Field;
import it.unisannio.rcost.callgraphanalyzer.FlagsModifier;
import it.unisannio.rcost.callgraphanalyzer.Graph;
import it.unisannio.rcost.callgraphanalyzer.Implementation;
import it.unisannio.rcost.callgraphanalyzer.ImplicitCall;
import it.unisannio.rcost.callgraphanalyzer.ImplicitCallDecorator;
import it.unisannio.rcost.callgraphanalyzer.Interface;
import it.unisannio.rcost.callgraphanalyzer.Method;
import it.unisannio.rcost.callgraphanalyzer.Pointcut;
import it.unisannio.rcost.callgraphanalyzer.Project;

import it.unisannio.rcost.callgraphanalyzer.ScopeModifier;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.jdt.core.IMember;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CallGraphFactoryImpl extends EFactoryImpl implements CallGraphFactory {
	public static CallGraphFactory eINSTANCE = it.unisannio.rcost.callgraphanalyzer.impl.CallGraphFactoryImpl.init();
	
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CallGraphFactory init() {
		try {
			CallGraphFactory theCallGraphFactory = (CallGraphFactory)EPackage.Registry.INSTANCE.getEFactory("callgraphanalyzer"); 
			if (theCallGraphFactory != null) {
				return theCallGraphFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CallGraphFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallGraphFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CallGraphPackage.GRAPH: return createGraph();
			case CallGraphPackage.PACKAGE: return createPackage();
			case CallGraphPackage.EXPLICIT_CALL: return createExplicitCall();
			case CallGraphPackage.CLASS: return createClass();
			case CallGraphPackage.FIELD: return createField();
			case CallGraphPackage.METHOD: return createMethod();
			case CallGraphPackage.POINTCUT: return createPointcut();
			case CallGraphPackage.ADVICE: return createAdvice();
			case CallGraphPackage.ASPECT: return createAspect();
			case CallGraphPackage.INTERFACE: return createInterface();
			case CallGraphPackage.IMPLICIT_CALL: return createImplicitCall();
			case CallGraphPackage.ASSOCIATION: return createAssociation();
			case CallGraphPackage.IMPLEMENTATION: return createImplementation();
			case CallGraphPackage.DEPENDENCE: return createDependence();
			case CallGraphPackage.EXTENSION: return createExtension();
			case CallGraphPackage.PROJECT: return createProject();
			case CallGraphPackage.IMPLICIT_CALL_DECORATOR: return createImplicitCallDecorator();
			case CallGraphPackage.EXPLICIT_CALL_DECORATOR: return createExplicitCallDecorator();
			case CallGraphPackage.DEPENDENCE_DECORATOR: return createDependenceDecorator();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case CallGraphPackage.FLAGS_MODIFIER:
				return createFlagsModifierFromString(eDataType, initialValue);
			case CallGraphPackage.SCOPE_MODIFIER:
				return createScopeModifierFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case CallGraphPackage.FLAGS_MODIFIER:
				return convertFlagsModifierToString(eDataType, instanceValue);
			case CallGraphPackage.SCOPE_MODIFIER:
				return convertScopeModifierToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Graph createGraph() {
		GraphImpl graph = new GraphImpl();
		return graph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public it.unisannio.rcost.callgraphanalyzer.Package createPackage() {
		PackageImpl package_ = new PackageImpl();
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplicitCall createExplicitCall() {
		ExplicitCallImpl explicitCall = new ExplicitCallImpl();
		return explicitCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public it.unisannio.rcost.callgraphanalyzer.Class createClass() {
		ClassImpl class_ = new ClassImpl();
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Field createField() {
		FieldImpl field = new FieldImpl();
		return field;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Method createMethod() {
		MethodImpl method = new MethodImpl();
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pointcut createPointcut() {
		PointcutImpl pointcut = new PointcutImpl();
		return pointcut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Advice createAdvice() {
		AdviceImpl advice = new AdviceImpl();
		return advice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aspect createAspect() {
		AspectImpl aspect = new AspectImpl();
		return aspect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface createInterface() {
		InterfaceImpl interface_ = new InterfaceImpl();
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplicitCall createImplicitCall() {
		ImplicitCallImpl implicitCall = new ImplicitCallImpl();
		return implicitCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association createAssociation() {
		AssociationImpl association = new AssociationImpl();
		return association;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Implementation createImplementation() {
		ImplementationImpl implementation = new ImplementationImpl();
		return implementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dependence createDependence() {
		DependenceImpl dependence = new DependenceImpl();
		return dependence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Extension createExtension() {
		ExtensionImpl extension = new ExtensionImpl();
		return extension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Project createProject() {
		ProjectImpl project = new ProjectImpl();
		return project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplicitCallDecorator createImplicitCallDecorator() {
		ImplicitCallDecoratorImpl implicitCallDecorator = new ImplicitCallDecoratorImpl();
		return implicitCallDecorator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplicitCallDecorator createExplicitCallDecorator() {
		ExplicitCallDecoratorImpl explicitCallDecorator = new ExplicitCallDecoratorImpl();
		return explicitCallDecorator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DependenceDecorator createDependenceDecorator() {
		DependenceDecoratorImpl dependenceDecorator = new DependenceDecoratorImpl();
		return dependenceDecorator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlagsModifier createFlagsModifierFromString(EDataType eDataType, String initialValue) {
		FlagsModifier result = FlagsModifier.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFlagsModifierToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScopeModifier createScopeModifierFromString(EDataType eDataType, String initialValue) {
		ScopeModifier result = ScopeModifier.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertScopeModifierToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallGraphPackage getCallGraphPackage() {
		return (CallGraphPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CallGraphPackage getPackage() {
		return CallGraphPackage.eINSTANCE;
	}

} //CallGraphFactoryImpl
