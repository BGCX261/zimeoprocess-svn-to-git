/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unisannio.rcost.callgraphanalyzer.impl;

import it.unisannio.rcost.callgraphanalyzer.CallGraphFactory;
import it.unisannio.rcost.callgraphanalyzer.CallGraphPackage;
import it.unisannio.rcost.callgraphanalyzer.FlagsModifier;
import it.unisannio.rcost.callgraphanalyzer.Graph;
import it.unisannio.rcost.callgraphanalyzer.Interface;
import it.unisannio.rcost.callgraphanalyzer.Method;
import it.unisannio.rcost.callgraphanalyzer.Node;
import it.unisannio.rcost.callgraphanalyzer.NodeContainer;
import it.unisannio.rcost.callgraphanalyzer.ScopeModifier;
import it.unisannio.rcost.callgraphanalyzer.dbmanagers.MethodFacade;
import it.unisannio.rcost.callgraphanalyzer.util.CallGraphDiagramRegistry;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.unisannio.rcost.callgraphanalyzer.impl.MethodImpl#isIsStrictFp <em>Is Strict Fp</em>}</li>
 *   <li>{@link it.unisannio.rcost.callgraphanalyzer.impl.MethodImpl#isIsStatic <em>Is Static</em>}</li>
 *   <li>{@link it.unisannio.rcost.callgraphanalyzer.impl.MethodImpl#isIsNative <em>Is Native</em>}</li>
 *   <li>{@link it.unisannio.rcost.callgraphanalyzer.impl.MethodImpl#isIsSynchronized <em>Is Synchronized</em>}</li>
 *   <li>{@link it.unisannio.rcost.callgraphanalyzer.impl.MethodImpl#getScopeModifier <em>Scope Modifier</em>}</li>
 *   <li>{@link it.unisannio.rcost.callgraphanalyzer.impl.MethodImpl#getFlagsModifier <em>Flags Modifier</em>}</li>
 *   <li>{@link it.unisannio.rcost.callgraphanalyzer.impl.MethodImpl#getSignature <em>Signature</em>}</li>
 *   <li>{@link it.unisannio.rcost.callgraphanalyzer.impl.MethodImpl#isIsMain <em>Is Main</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MethodImpl extends NodeLeafImpl implements Method {
	protected boolean isEmpty = true;
	
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
	 * The default value of the '{@link #isIsNative() <em>Is Native</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isIsNative()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_NATIVE_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isIsNative() <em>Is Native</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isIsNative()
	 * @generated
	 * @ordered
	 */
	protected boolean isNative = IS_NATIVE_EDEFAULT;
	/**
	 * The default value of the '{@link #isIsSynchronized() <em>Is Synchronized</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isIsSynchronized()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SYNCHRONIZED_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isIsSynchronized() <em>Is Synchronized</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isIsSynchronized()
	 * @generated
	 * @ordered
	 */
	protected boolean isSynchronized = IS_SYNCHRONIZED_EDEFAULT;
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
	 * @ordered
	 */
	protected static final FlagsModifier FLAGS_MODIFIER_EDEFAULT = null;//FlagsModifier.ABSTRACT;
	/**
	 * The cached value of the '{@link #getFlagsModifier() <em>Flags Modifier</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getFlagsModifier()
	 * @generated
	 * @ordered
	 */
	protected FlagsModifier flagsModifier = FLAGS_MODIFIER_EDEFAULT;
	/**
	 * The default value of the '{@link #getSignature() <em>Signature</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSignature()
	 * @generated
	 * @ordered
	 */
	protected static final String SIGNATURE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getSignature() <em>Signature</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSignature()
	 * @generated
	 * @ordered
	 */
	protected String signature = SIGNATURE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsMain() <em>Is Main</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isIsMain()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_MAIN_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isIsMain() <em>Is Main</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isIsMain()
	 * @generated
	 * @ordered
	 */
	protected boolean isMain = IS_MAIN_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CallGraphPackage.Literals.METHOD;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
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
					CallGraphPackage.METHOD__IS_STRICT_FP, oldIsStrictFp,
					isStrictFp));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
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
		} 
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CallGraphPackage.METHOD__IS_STATIC, oldIsStatic, isStatic));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 */
	public boolean isIsNative() {
		
		return isNative;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	public void setIsNative(boolean newIsNative) {
		boolean oldIsNative = isNative;
		isNative = newIsNative;
		if (!isValidModifiers()) {
			isNative = oldIsNative;
		} 
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CallGraphPackage.METHOD__IS_NATIVE, oldIsNative, isNative));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 */
	public boolean isIsSynchronized() {
		
		return isSynchronized;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	public void setIsSynchronized(boolean newIsSynchronized) {
		boolean oldIsSynchronized = isSynchronized;
		isSynchronized = newIsSynchronized;
		if (!isValidModifiers()) {
			isSynchronized = oldIsSynchronized;
		} 
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CallGraphPackage.METHOD__IS_SYNCHRONIZED,
					oldIsSynchronized, isSynchronized));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 */
	public String getSignature() {
		//fill();
		return signature;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	public void setSignature(String newSignature) {
		String oldSignature = signature;
		signature = newSignature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CallGraphPackage.METHOD__SIGNATURE, oldSignature, signature));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 */
	public boolean isIsMain() {
		
		return isMain;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	public void setIsMain(boolean newIsMain) {
		boolean oldIsMain = isMain;
		isMain = newIsMain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CallGraphPackage.METHOD__IS_MAIN, oldIsMain, isMain));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
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
		scopeModifier = newScopeModifier == null ? SCOPE_MODIFIER_EDEFAULT
				: newScopeModifier;
		if (!isValidModifiers()) {
			scopeModifier = oldScopeModifier;
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CallGraphPackage.METHOD__SCOPE_MODIFIER, oldScopeModifier,
					scopeModifier));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
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
		flagsModifier = newFlagsModifier == null ? FLAGS_MODIFIER_EDEFAULT
				: newFlagsModifier;
		if (!isValidModifiers()) {
			flagsModifier = oldFlagsModifier;
		} 
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CallGraphPackage.METHOD__FLAGS_MODIFIER, oldFlagsModifier,
					flagsModifier));
	}

	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
//		if (isEmpty)
//			switch (featureID) {
//			case CallGraphPackage.METHOD__FLAGS_MODIFIER:
//			case CallGraphPackage.METHOD__SCOPE_MODIFIER:
//			case CallGraphPackage.METHOD__SIGNATURE:
////			case CallGraphPackage.METHOD__IS_MAIN:
////			case CallGraphPackage.METHOD__IS_NATIVE:
////			case CallGraphPackage.METHOD__IS_STATIC:
////			case CallGraphPackage.METHOD__IS_STRICT_FP:
////			case CallGraphPackage.METHOD__IS_SYNCHRONIZED:
//				fill();
//				break;
//			}

		return eGet_(featureID, resolve, coreType);
	}

//	protected void fill() {
//		if (isEmpty) {
//			try {
//				Graph graph = CallGraphDiagramRegistry.getInstance().getGraph(
//						this);
//				String projectName = graph.getCriteria().getProjectName();
//				MethodFacade.facade
//						.fillAllAttribute(projectName, (Method) this);
//				
//				isEmpty = false;
//			} catch (Exception exc) {
//				exc.printStackTrace();
//			}
//		}
//	}

	public Object eGet_(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CallGraphPackage.METHOD__IS_STRICT_FP:
			return isIsStrictFp() ? Boolean.TRUE : Boolean.FALSE;
		case CallGraphPackage.METHOD__IS_STATIC:
			return isIsStatic() ? Boolean.TRUE : Boolean.FALSE;
		case CallGraphPackage.METHOD__IS_NATIVE:
			return isIsNative() ? Boolean.TRUE : Boolean.FALSE;
		case CallGraphPackage.METHOD__IS_SYNCHRONIZED:
			return isIsSynchronized() ? Boolean.TRUE : Boolean.FALSE;
		case CallGraphPackage.METHOD__SCOPE_MODIFIER:
			return getScopeModifier();
		case CallGraphPackage.METHOD__FLAGS_MODIFIER:
			return getFlagsModifier();
		case CallGraphPackage.METHOD__SIGNATURE:
			return getSignature();
		case CallGraphPackage.METHOD__IS_MAIN:
			return isIsMain() ? Boolean.TRUE : Boolean.FALSE;
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CallGraphPackage.METHOD__IS_STRICT_FP:
				setIsStrictFp(((Boolean)newValue).booleanValue());
				return;
			case CallGraphPackage.METHOD__IS_STATIC:
				setIsStatic(((Boolean)newValue).booleanValue());
				return;
			case CallGraphPackage.METHOD__IS_NATIVE:
				setIsNative(((Boolean)newValue).booleanValue());
				return;
			case CallGraphPackage.METHOD__IS_SYNCHRONIZED:
				setIsSynchronized(((Boolean)newValue).booleanValue());
				return;
			case CallGraphPackage.METHOD__SCOPE_MODIFIER:
				setScopeModifier((ScopeModifier)newValue);
				return;
			case CallGraphPackage.METHOD__FLAGS_MODIFIER:
				setFlagsModifier((FlagsModifier)newValue);
				return;
			case CallGraphPackage.METHOD__SIGNATURE:
				setSignature((String)newValue);
				return;
			case CallGraphPackage.METHOD__IS_MAIN:
				setIsMain(((Boolean)newValue).booleanValue());
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
			case CallGraphPackage.METHOD__IS_STRICT_FP:
				setIsStrictFp(IS_STRICT_FP_EDEFAULT);
				return;
			case CallGraphPackage.METHOD__IS_STATIC:
				setIsStatic(IS_STATIC_EDEFAULT);
				return;
			case CallGraphPackage.METHOD__IS_NATIVE:
				setIsNative(IS_NATIVE_EDEFAULT);
				return;
			case CallGraphPackage.METHOD__IS_SYNCHRONIZED:
				setIsSynchronized(IS_SYNCHRONIZED_EDEFAULT);
				return;
			case CallGraphPackage.METHOD__SCOPE_MODIFIER:
				setScopeModifier(SCOPE_MODIFIER_EDEFAULT);
				return;
			case CallGraphPackage.METHOD__FLAGS_MODIFIER:
				setFlagsModifier(FLAGS_MODIFIER_EDEFAULT);
				return;
			case CallGraphPackage.METHOD__SIGNATURE:
				setSignature(SIGNATURE_EDEFAULT);
				return;
			case CallGraphPackage.METHOD__IS_MAIN:
				setIsMain(IS_MAIN_EDEFAULT);
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
			case CallGraphPackage.METHOD__IS_STRICT_FP:
				return isStrictFp != IS_STRICT_FP_EDEFAULT;
			case CallGraphPackage.METHOD__IS_STATIC:
				return isStatic != IS_STATIC_EDEFAULT;
			case CallGraphPackage.METHOD__IS_NATIVE:
				return isNative != IS_NATIVE_EDEFAULT;
			case CallGraphPackage.METHOD__IS_SYNCHRONIZED:
				return isSynchronized != IS_SYNCHRONIZED_EDEFAULT;
			case CallGraphPackage.METHOD__SCOPE_MODIFIER:
				return scopeModifier != SCOPE_MODIFIER_EDEFAULT;
			case CallGraphPackage.METHOD__FLAGS_MODIFIER:
				return flagsModifier != FLAGS_MODIFIER_EDEFAULT;
			case CallGraphPackage.METHOD__SIGNATURE:
				return SIGNATURE_EDEFAULT == null ? signature != null : !SIGNATURE_EDEFAULT.equals(signature);
			case CallGraphPackage.METHOD__IS_MAIN:
				return isMain != IS_MAIN_EDEFAULT;
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
		result.append(" (isStrictFp: ");
		result.append(isStrictFp);
		result.append(", isStatic: ");
		result.append(isStatic);
		result.append(", isNative: ");
		result.append(isNative);
		result.append(", isSynchronized: ");
		result.append(isSynchronized);
		result.append(", scopeModifier: ");
		result.append(scopeModifier);
		result.append(", flagsModifier: ");
		result.append(flagsModifier);
		result.append(", signature: ");
		result.append(signature);
		result.append(", isMain: ");
		result.append(isMain);
		result.append(')');
		return result.toString();
	}

	@Override
	boolean isValidModifiers() {
		if (this.flagsModifier == FlagsModifier.ABSTRACT)
			return this.scopeModifier != ScopeModifier.PRIVATE && !isStatic
					&& !isNative && !isStrictFp && !isSynchronized;

		return true;
	}

	@Override
	public void setNodeContainer(NodeContainer newNodeContainer) {
		if (nodeContainer == null || !nodeContainer.equals(newNodeContainer)) {
			super.setNodeContainer(newNodeContainer);

			if (newNodeContainer instanceof Interface) {
				((Interface) newNodeContainer).addMethod(this);
			}
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof Method))
			return false;
		return true;
	}
	
	@Override
	public Node clone() {
		Method nodeClone = (Method) super.clone();
		
		nodeClone.setIsMain(this.isMain);
		nodeClone.setIsStatic(this.isStatic);
		nodeClone.setIsStrictFp(this.isStrictFp);
		nodeClone.setIsSynchronized(this.isSynchronized);
		nodeClone.setScopeModifier(this.scopeModifier);
		nodeClone.setFlagsModifier(this.flagsModifier);
		nodeClone.setSignature(this.signature);
		
		return nodeClone;
	}
	
	protected Node cloneNode() {
		return CallGraphFactory.eINSTANCE.createMethod();
	}
} // MethodImpl
