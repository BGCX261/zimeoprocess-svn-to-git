/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unisannio.rcost.callgraphanalyzer.impl;

import it.unisannio.rcost.callgraphanalyzer.Aspect;
import it.unisannio.rcost.callgraphanalyzer.CallGraphFactory;
import it.unisannio.rcost.callgraphanalyzer.CallGraphPackage;
import it.unisannio.rcost.callgraphanalyzer.Field;
import it.unisannio.rcost.callgraphanalyzer.FlagsModifier;
import it.unisannio.rcost.callgraphanalyzer.Interface;
import it.unisannio.rcost.callgraphanalyzer.Method;
import it.unisannio.rcost.callgraphanalyzer.Node;
import it.unisannio.rcost.callgraphanalyzer.NodeContainer;
import it.unisannio.rcost.callgraphanalyzer.Package;
import it.unisannio.rcost.callgraphanalyzer.ScopeModifier;
import it.unisannio.rcost.callgraphanalyzer.dbmanagers.InterfaceFacade;
import it.unisannio.rcost.callgraphanalyzer.util.CallGraphDiagramRegistry;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.unisannio.rcost.callgraphanalyzer.impl.InterfaceImpl#getMethodsList <em>Methods</em>}</li>
 *   <li>{@link it.unisannio.rcost.callgraphanalyzer.impl.InterfaceImpl#getFieldsList <em>Fields</em>}</li>
 *   <li>{@link it.unisannio.rcost.callgraphanalyzer.impl.InterfaceImpl#isIsStatic <em>Is Static</em>}</li>
 *   <li>{@link it.unisannio.rcost.callgraphanalyzer.impl.InterfaceImpl#isIsStrictFp <em>Is Strict Fp</em>}</li>
 *   <li>{@link it.unisannio.rcost.callgraphanalyzer.impl.InterfaceImpl#getScopeModifier <em>Scope Modifier</em>}</li>
 *   <li>{@link it.unisannio.rcost.callgraphanalyzer.impl.InterfaceImpl#getFlagsModifier <em>Flags Modifier</em>}</li>
 *   <li>{@link it.unisannio.rcost.callgraphanalyzer.impl.InterfaceImpl#getInnerModulesList <em>Inner Modules</em>}</li>
 *   <li>{@link it.unisannio.rcost.callgraphanalyzer.impl.InterfaceImpl#getCompilationUnit <em>Compilation Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InterfaceImpl extends NodeContainerImpl implements Interface {
	protected boolean isEmpty = true;
	
	/**
	 * The cached value of the '{@link #getMethodsList() <em>Methods</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMethodsList()
	 * @generated
	 * @ordered
	 */
	protected EList<Method> methods;

	/**
	 * The empty value for the '{@link #getMethods() <em>Methods</em>}' array accessor.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMethods()
	 * @generated
	 * @ordered
	 */
	protected static final Method[] METHODS_EEMPTY_ARRAY = new Method [0];

	/**
	 * The cached value of the '{@link #getFieldsList() <em>Fields</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getFieldsList()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> fields;

	/**
	 * The empty value for the '{@link #getFields() <em>Fields</em>}' array accessor.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getFields()
	 * @generated
	 * @ordered
	 */
	protected static final Field[] FIELDS_EEMPTY_ARRAY = new Field [0];

	/**
	 * The default value of the '{@link #isIsStatic() <em>Is Static</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isIsStatic()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_STATIC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsStatic() <em>Is Static</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isIsStatic()
	 * @generated
	 * @ordered
	 */
	protected boolean isStatic = IS_STATIC_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsStrictFp() <em>Is Strict Fp</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isIsStrictFp()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_STRICT_FP_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsStrictFp() <em>Is Strict Fp</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isIsStrictFp()
	 * @generated
	 * @ordered
	 */
	protected boolean isStrictFp = IS_STRICT_FP_EDEFAULT;

	/**
	 * The default value of the '{@link #getScopeModifier() <em>Scope Modifier</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getScopeModifier()
	 * @generated
	 * @ordered
	 */
	protected static final ScopeModifier SCOPE_MODIFIER_EDEFAULT = ScopeModifier.PROTECTED;

	/**
	 * The cached value of the '{@link #getScopeModifier() <em>Scope Modifier</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getScopeModifier()
	 * @generated
	 * @ordered
	 */
	protected ScopeModifier scopeModifier = SCOPE_MODIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getFlagsModifier() <em>Flags Modifier</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getFlagsModifier()
	 * @generated
	 * @ordered
	 */
	protected static final FlagsModifier FLAGS_MODIFIER_EDEFAULT = FlagsModifier.ABSTRACT;

	/**
	 * The cached value of the '{@link #getFlagsModifier() <em>Flags Modifier</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getFlagsModifier()
	 * @generated
	 * @ordered
	 */
	protected FlagsModifier flagsModifier = FLAGS_MODIFIER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInnerModulesList() <em>Inner Modules</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getInnerModulesList()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface> innerModules;

	/**
	 * The empty value for the '{@link #getInnerModules() <em>Inner Modules</em>}' array accessor.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getInnerModules()
	 * @generated
	 * @ordered
	 */
	protected static final Interface[] INNER_MODULES_EEMPTY_ARRAY = new Interface [0];

	/**
	 * The default value of the '{@link #getCompilationUnit() <em>Compilation Unit</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getCompilationUnit()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPILATION_UNIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCompilationUnit() <em>Compilation Unit</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getCompilationUnit()
	 * @generated
	 * @ordered
	 */
	protected String compilationUnit = COMPILATION_UNIT_EDEFAULT;
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CallGraphPackage.Literals.INTERFACE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public Method[] getMethods() {
		if (methods == null || methods.isEmpty()) return METHODS_EEMPTY_ARRAY;
		BasicEList<Method> list = (BasicEList<Method>)methods;
		list.shrink();
		return (Method[])list.data();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Method getMethods(int index) {
		return getMethodsList().get(index);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getMethodsLength() {
		return methods == null ? 0 : methods.size();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	public void setMethods(Method[] newMethods) {
		for (int i = 0; i < newMethods.length; i++) {
			newMethods[i].setNodeContainer(this);

		}
		((BasicEList<Method>) getMethodsList()).setData(newMethods.length, newMethods);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	public void setMethods(int index, Method element) {
		getMethodsList().set(index, element);
		element.setNodeContainer(this);
	}
	
	public void addMethod(Method element) {
		EList<Method> methods = getMethodsList();
		if(!methods.contains(element)) {
			methods.add(element);
			element.setNodeContainer(this);
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Method> getMethodsList() {
		if (methods == null) {
			methods = new EObjectContainmentEList<Method>(Method.class, this, CallGraphPackage.INTERFACE__METHODS);
		}
		return methods;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public Field[] getFields() {
		if (fields == null || fields.isEmpty()) return FIELDS_EEMPTY_ARRAY;
		BasicEList<Field> list = (BasicEList<Field>)fields;
		list.shrink();
		return (Field[])list.data();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Field getFields(int index) {
		return getFieldsList().get(index);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getFieldsLength() {
		return fields == null ? 0 : fields.size();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	public void setFields(Field[] newFields) {
		for (int i = 0; i < newFields.length; i++) {
			newFields[i].setNodeContainer(this);
		}
		((BasicEList<Field>) getFieldsList()).setData(newFields.length, newFields);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	public void setFields(int index, Field element) {
		getFieldsList().set(index, element);
		element.setNodeContainer(this);
	}

	public void addField(Field element) {
		EList<Field> fields = getFieldsList();
		if(!fields.contains(element)) {
			fields.add(element);
			element.setNodeContainer(this);
		}
	}
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getFieldsList() {
		if (fields == null) {
			fields = new EObjectContainmentEList<Field>(Field.class, this, CallGraphPackage.INTERFACE__FIELDS);
		}
		return fields;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	public boolean isIsStatic() {
		
		return isStatic;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	public void setIsStatic(boolean newIsStatic) {
		boolean oldIsStatic = isStatic;
		isStatic = newIsStatic;
		if (!isValidModifiers()) {
			isStatic = oldIsStatic;
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CallGraphPackage.INTERFACE__IS_STATIC, oldIsStatic, isStatic));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	public boolean isIsStrictFp() {
		
		return isStrictFp;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	public void setIsStrictFp(boolean newIsStrictFp) {
		boolean oldIsStrictFp = isStrictFp;
		isStrictFp = newIsStrictFp;
		if (!isValidModifiers()) {
			isStrictFp = oldIsStrictFp;
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CallGraphPackage.INTERFACE__IS_STRICT_FP, oldIsStrictFp, isStrictFp));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	public ScopeModifier getScopeModifier() {
		//fill();
		return scopeModifier;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	public void setScopeModifier(ScopeModifier newScopeModifier) {
		ScopeModifier oldScopeModifier = scopeModifier;
		scopeModifier = newScopeModifier == null ? SCOPE_MODIFIER_EDEFAULT : newScopeModifier;
		if (!isValidModifiers()) {
			scopeModifier = oldScopeModifier;
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CallGraphPackage.INTERFACE__SCOPE_MODIFIER, oldScopeModifier, scopeModifier));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	public FlagsModifier getFlagsModifier() {
		//fill();
		return flagsModifier;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	public void setFlagsModifier(FlagsModifier newFlagsModifier) {
		FlagsModifier oldFlagsModifier = flagsModifier;
		flagsModifier = newFlagsModifier == null ? FLAGS_MODIFIER_EDEFAULT : newFlagsModifier;
		if (!isValidModifiers()) {
			flagsModifier = oldFlagsModifier;
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CallGraphPackage.INTERFACE__FLAGS_MODIFIER, oldFlagsModifier, flagsModifier));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public Interface[] getInnerModules() {
		if (innerModules == null || innerModules.isEmpty()) return INNER_MODULES_EEMPTY_ARRAY;
		BasicEList<Interface> list = (BasicEList<Interface>)innerModules;
		list.shrink();
		return (Interface[])list.data();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Interface getInnerModules(int index) {
		return getInnerModulesList().get(index);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getInnerModulesLength() {
		return innerModules == null ? 0 : innerModules.size();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	public void setInnerModules(Interface[] newInnerModules) {
		for (int i = 0; i < newInnerModules.length; i++) {
			newInnerModules[i].setNodeContainer(this);
		}
		((BasicEList<Interface>) getInnerModulesList()).setData(newInnerModules.length,
				newInnerModules);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	public void setInnerModules(int index, Interface element) {
		getInnerModulesList().set(index, element);
		element.setNodeContainer(this);
	}
	
	public void addInnerModule(Interface element) {
		EList<Interface> interfaces = getInnerModulesList();
		if(!interfaces.contains(element)) {
			interfaces.add(element);
			element.setNodeContainer(this);
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> getInnerModulesList() {
		if (innerModules == null) {
			innerModules = new EObjectContainmentEList<Interface>(Interface.class, this, CallGraphPackage.INTERFACE__INNER_MODULES);
		}
		return innerModules;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	public String getCompilationUnit() {
		//fill();
		return compilationUnit;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	public void setCompilationUnit(String newCompilationUnit) {
		String oldCompilationUnit = compilationUnit;
		compilationUnit = newCompilationUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CallGraphPackage.INTERFACE__COMPILATION_UNIT, oldCompilationUnit, compilationUnit));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID,
			NotificationChain msgs) {
		switch (featureID) {
			case CallGraphPackage.INTERFACE__METHODS:
				return ((InternalEList<?>)getMethodsList()).basicRemove(otherEnd, msgs);
			case CallGraphPackage.INTERFACE__FIELDS:
				return ((InternalEList<?>)getFieldsList()).basicRemove(otherEnd, msgs);
			case CallGraphPackage.INTERFACE__INNER_MODULES:
				return ((InternalEList<?>)getInnerModulesList()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
//		if(isEmpty)
//			switch (featureID) {
//			case CallGraphPackage.INTERFACE__COMPILATION_UNIT:
//			case CallGraphPackage.INTERFACE__FLAGS_MODIFIER:
//			case CallGraphPackage.INTERFACE__SCOPE_MODIFIER:
////			case CallGraphPackage.INTERFACE__IS_STATIC:
////			case CallGraphPackage.INTERFACE__IS_STRICT_FP:
//				fill();
//				break;
//			}
		
		return this.eGet_(featureID, resolve, coreType);
	}
	
//	protected void fill() {
//		if (isEmpty) {
//			try {
//				String projectName = CallGraphDiagramRegistry.getInstance().getGraph(this).getCriteria().getProjectName();
//				InterfaceFacade.facade.fillAllAttribute(projectName, (Interface) this);
//	
//				isEmpty = false;
//			} catch(Exception exc) {
//				
//			}
//		}
//	}
	
	public Object eGet_(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CallGraphPackage.INTERFACE__METHODS:
				return getMethodsList();
			case CallGraphPackage.INTERFACE__FIELDS:
				return getFieldsList();
			case CallGraphPackage.INTERFACE__IS_STATIC:
				return isIsStatic() ? Boolean.TRUE : Boolean.FALSE;
			case CallGraphPackage.INTERFACE__IS_STRICT_FP:
				return isIsStrictFp() ? Boolean.TRUE : Boolean.FALSE;
			case CallGraphPackage.INTERFACE__SCOPE_MODIFIER:
				return getScopeModifier();
			case CallGraphPackage.INTERFACE__FLAGS_MODIFIER:
				return getFlagsModifier();
			case CallGraphPackage.INTERFACE__INNER_MODULES:
				return getInnerModulesList();
			case CallGraphPackage.INTERFACE__COMPILATION_UNIT:
				return getCompilationUnit();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CallGraphPackage.INTERFACE__METHODS:
				getMethodsList().clear();
				getMethodsList().addAll((Collection<? extends Method>)newValue);
				return;
			case CallGraphPackage.INTERFACE__FIELDS:
				getFieldsList().clear();
				getFieldsList().addAll((Collection<? extends Field>)newValue);
				return;
			case CallGraphPackage.INTERFACE__IS_STATIC:
				setIsStatic(((Boolean)newValue).booleanValue());
				return;
			case CallGraphPackage.INTERFACE__IS_STRICT_FP:
				setIsStrictFp(((Boolean)newValue).booleanValue());
				return;
			case CallGraphPackage.INTERFACE__SCOPE_MODIFIER:
				setScopeModifier((ScopeModifier)newValue);
				return;
			case CallGraphPackage.INTERFACE__FLAGS_MODIFIER:
				setFlagsModifier((FlagsModifier)newValue);
				return;
			case CallGraphPackage.INTERFACE__INNER_MODULES:
				getInnerModulesList().clear();
				getInnerModulesList().addAll((Collection<? extends Interface>)newValue);
				return;
			case CallGraphPackage.INTERFACE__COMPILATION_UNIT:
				setCompilationUnit((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CallGraphPackage.INTERFACE__METHODS:
				getMethodsList().clear();
				return;
			case CallGraphPackage.INTERFACE__FIELDS:
				getFieldsList().clear();
				return;
			case CallGraphPackage.INTERFACE__IS_STATIC:
				setIsStatic(IS_STATIC_EDEFAULT);
				return;
			case CallGraphPackage.INTERFACE__IS_STRICT_FP:
				setIsStrictFp(IS_STRICT_FP_EDEFAULT);
				return;
			case CallGraphPackage.INTERFACE__SCOPE_MODIFIER:
				setScopeModifier(SCOPE_MODIFIER_EDEFAULT);
				return;
			case CallGraphPackage.INTERFACE__FLAGS_MODIFIER:
				setFlagsModifier(FLAGS_MODIFIER_EDEFAULT);
				return;
			case CallGraphPackage.INTERFACE__INNER_MODULES:
				getInnerModulesList().clear();
				return;
			case CallGraphPackage.INTERFACE__COMPILATION_UNIT:
				setCompilationUnit(COMPILATION_UNIT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CallGraphPackage.INTERFACE__METHODS:
				return methods != null && !methods.isEmpty();
			case CallGraphPackage.INTERFACE__FIELDS:
				return fields != null && !fields.isEmpty();
			case CallGraphPackage.INTERFACE__IS_STATIC:
				return isStatic != IS_STATIC_EDEFAULT;
			case CallGraphPackage.INTERFACE__IS_STRICT_FP:
				return isStrictFp != IS_STRICT_FP_EDEFAULT;
			case CallGraphPackage.INTERFACE__SCOPE_MODIFIER:
				return scopeModifier != SCOPE_MODIFIER_EDEFAULT;
			case CallGraphPackage.INTERFACE__FLAGS_MODIFIER:
				return flagsModifier != FLAGS_MODIFIER_EDEFAULT;
			case CallGraphPackage.INTERFACE__INNER_MODULES:
				return innerModules != null && !innerModules.isEmpty();
			case CallGraphPackage.INTERFACE__COMPILATION_UNIT:
				return COMPILATION_UNIT_EDEFAULT == null ? compilationUnit != null : !COMPILATION_UNIT_EDEFAULT.equals(compilationUnit);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isStatic: ");
		result.append(isStatic);
		result.append(", isStrictFp: ");
		result.append(isStrictFp);
		result.append(", scopeModifier: ");
		result.append(scopeModifier);
		result.append(", flagsModifier: ");
		result.append(flagsModifier);
		result.append(", compilationUnit: ");
		result.append(compilationUnit);
		result.append(')');
		return result.toString();
	}

	@Override
	boolean isValidModifiers() {
		return true;
	}

	@Override
	public void setNodeContainer(NodeContainer newNodeContainer) {
		if (nodeContainer == null || !nodeContainer.equals(newNodeContainer)) {
			super.setNodeContainer(newNodeContainer);

			if (newNodeContainer instanceof Package) {
				((Package) newNodeContainer).addInnerModule(this);
				this.setPackageName(newNodeContainer.getName());
			} else if(newNodeContainer instanceof Aspect) {
				((Aspect) newNodeContainer).addInnerModule(this);
			} else if(newNodeContainer instanceof Interface) {
				((Interface) newNodeContainer).addInnerModule(this);
			} 
//			else if(newNodeContainer instanceof it.unisannio.rcost.callgraphanalyzer.Class) {
//				((it.unisannio.rcost.callgraphanalyzer.Class) newNodeContainer).addInnerModule(this);
//			} 
		}
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof Interface))
			return false;
		return true;
	}
	
	@Override
	public Node clone() {
		Interface nodeClone = (Interface) super.clone();
		
		nodeClone.setIsStatic(this.isStatic);
		nodeClone.setIsStrictFp(this.isStrictFp);
		nodeClone.setScopeModifier(this.scopeModifier);
		nodeClone.setFlagsModifier(this.flagsModifier);
		nodeClone.setCompilationUnit(this.compilationUnit);
		
		return nodeClone;
	}
	
	protected Node cloneNode() {
		return CallGraphFactory.eINSTANCE.createInterface();
	}
} // InterfaceImpl
