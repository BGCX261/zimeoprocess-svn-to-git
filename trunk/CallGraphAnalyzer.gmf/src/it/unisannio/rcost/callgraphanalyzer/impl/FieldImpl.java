/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unisannio.rcost.callgraphanalyzer.impl;

import it.unisannio.rcost.callgraphanalyzer.CallGraphFactory;
import it.unisannio.rcost.callgraphanalyzer.CallGraphPackage;
import it.unisannio.rcost.callgraphanalyzer.Field;
import it.unisannio.rcost.callgraphanalyzer.Interface;
import it.unisannio.rcost.callgraphanalyzer.Node;
import it.unisannio.rcost.callgraphanalyzer.NodeContainer;
import it.unisannio.rcost.callgraphanalyzer.ScopeModifier;
import it.unisannio.rcost.callgraphanalyzer.dbmanagers.FieldFacade;
import it.unisannio.rcost.callgraphanalyzer.util.CallGraphDiagramRegistry;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.unisannio.rcost.callgraphanalyzer.impl.FieldImpl#isIsStrictFP <em>Is Strict FP</em>}</li>
 *   <li>{@link it.unisannio.rcost.callgraphanalyzer.impl.FieldImpl#isIsFinal <em>Is Final</em>}</li>
 *   <li>{@link it.unisannio.rcost.callgraphanalyzer.impl.FieldImpl#isIsStatic <em>Is Static</em>}</li>
 *   <li>{@link it.unisannio.rcost.callgraphanalyzer.impl.FieldImpl#isIsVolatile <em>Is Volatile</em>}</li>
 *   <li>{@link it.unisannio.rcost.callgraphanalyzer.impl.FieldImpl#getSignature <em>Signature</em>}</li>
 *   <li>{@link it.unisannio.rcost.callgraphanalyzer.impl.FieldImpl#getScopeModifier <em>Scope Modifier</em>}</li>
 *   <li>{@link it.unisannio.rcost.callgraphanalyzer.impl.FieldImpl#isIsTransient <em>Is Transient</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FieldImpl extends NodeLeafImpl implements Field {
	protected boolean isEmpty = true;
	
	/**
	 * The default value of the '{@link #isIsStrictFP() <em>Is Strict FP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsStrictFP()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_STRICT_FP_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isIsStrictFP() <em>Is Strict FP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsStrictFP()
	 * @generated
	 * @ordered
	 */
	protected boolean isStrictFP = IS_STRICT_FP_EDEFAULT;
	/**
	 * The default value of the '{@link #isIsFinal() <em>Is Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsFinal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_FINAL_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isIsFinal() <em>Is Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsFinal()
	 * @generated
	 * @ordered
	 */
	protected boolean isFinal = IS_FINAL_EDEFAULT;
	/**
	 * The default value of the '{@link #isIsStatic() <em>Is Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsStatic()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_STATIC_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isIsStatic() <em>Is Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsStatic()
	 * @generated
	 * @ordered
	 */
	protected boolean isStatic = IS_STATIC_EDEFAULT;
	/**
	 * The default value of the '{@link #isIsVolatile() <em>Is Volatile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsVolatile()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_VOLATILE_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isIsVolatile() <em>Is Volatile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsVolatile()
	 * @generated
	 * @ordered
	 */
	protected boolean isVolatile = IS_VOLATILE_EDEFAULT;
	/**
	 * The default value of the '{@link #getSignature() <em>Signature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignature()
	 * @generated
	 * @ordered
	 */
	protected static final String SIGNATURE_EDEFAULT = "";
	/**
	 * The cached value of the '{@link #getSignature() <em>Signature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignature()
	 * @generated
	 * @ordered
	 */
	protected String signature = SIGNATURE_EDEFAULT;
	/**
	 * The default value of the '{@link #getScopeModifier() <em>Scope Modifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScopeModifier()
	 * @ordered
	 */
	protected static final ScopeModifier SCOPE_MODIFIER_EDEFAULT = ScopeModifier.DEFAULT;
	/**
	 * The cached value of the '{@link #getScopeModifier() <em>Scope Modifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScopeModifier()
	 * @generated
	 * @ordered
	 */
	protected ScopeModifier scopeModifier = SCOPE_MODIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsTransient() <em>Is Transient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsTransient()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_TRANSIENT_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isIsTransient() <em>Is Transient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsTransient()
	 * @generated
	 * @ordered
	 */
	protected boolean isTransient = IS_TRANSIENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	protected FieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CallGraphPackage.Literals.FIELD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean isIsStrictFP() {
//		
		return isStrictFP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void setIsStrictFP(boolean newIsStrictFP) {
		boolean oldIsStrictFP = isStrictFP;
		isStrictFP = newIsStrictFP;
		if(!isValidModifiers()){
			isStrictFP = oldIsStrictFP;
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CallGraphPackage.FIELD__IS_STRICT_FP, oldIsStrictFP, isStrictFP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean isIsFinal() {
//		
		return isFinal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void setIsFinal(boolean newIsFinal) {
		boolean oldIsFinal = isFinal;
		isFinal = newIsFinal;
		if(!isValidModifiers()){
			isFinal = oldIsFinal;
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CallGraphPackage.FIELD__IS_FINAL, oldIsFinal, isFinal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean isIsStatic() {
		return isStatic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void setIsStatic(boolean newIsStatic) {
		boolean oldIsStatic = isStatic;
		isStatic = newIsStatic;
		if(!isValidModifiers()){
			isStatic = oldIsStatic;
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CallGraphPackage.FIELD__IS_STATIC, oldIsStatic, isStatic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean isIsVolatile() {
//		
		return isVolatile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void setIsVolatile(boolean newIsVolatile) {
		boolean oldIsVolatile = isVolatile;
		isVolatile = newIsVolatile;
		if(!isValidModifiers()){
			isVolatile = oldIsVolatile;
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CallGraphPackage.FIELD__IS_VOLATILE, oldIsVolatile, isVolatile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public String getSignature() {
		////fill();
		return signature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void setSignature(String newSignature) {
		String oldSignature = signature;
		signature = newSignature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CallGraphPackage.FIELD__SIGNATURE, oldSignature, signature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public ScopeModifier getScopeModifier() {
		////fill();
		return scopeModifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void setScopeModifier(ScopeModifier newScopeModifier) {
		ScopeModifier oldScopeModifier = scopeModifier;
		scopeModifier = newScopeModifier == null ? SCOPE_MODIFIER_EDEFAULT : newScopeModifier;
		if(!isValidModifiers()){
			scopeModifier = oldScopeModifier;
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CallGraphPackage.FIELD__SCOPE_MODIFIER, oldScopeModifier, scopeModifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean isIsTransient() {
//		
		return isTransient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void setIsTransient(boolean newIsTransient) {
		boolean oldIsTransient = isTransient;
		isTransient = newIsTransient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CallGraphPackage.FIELD__IS_TRANSIENT, oldIsTransient, isTransient));
	}

//	protected void fill() {
//		if (isEmpty) {
//			try {
//				String projectName = CallGraphDiagramRegistry.getInstance().getGraph(this).getCriteria().getProjectName();
//				FieldFacade.facade.fillAllAttribute(projectName, (Field) this);
//	
//				isEmpty = false;
//			} catch(Exception exc) {
//				exc.printStackTrace();
//			}
//		}
//	}
	
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
//		if(isEmpty)
//			switch (featureID) {
//			case CallGraphPackage.FIELD__SCOPE_MODIFIER:
//			case CallGraphPackage.FIELD__SIGNATURE:
//	//		case CallGraphPackage.FIELD__IS_FINAL:
//	//		case CallGraphPackage.FIELD__IS_STATIC:
//	//		case CallGraphPackage.FIELD__IS_STRICT_FP:
//	//		case CallGraphPackage.FIELD__IS_TRANSIENT:
//	//		case CallGraphPackage.FIELD__IS_VOLATILE:
//				fill();
//				break;
//			}
		
		return this.eGet_(featureID, resolve, coreType);
	}
	
	public Object eGet_(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CallGraphPackage.FIELD__IS_STRICT_FP:
				return isIsStrictFP() ? Boolean.TRUE : Boolean.FALSE;
			case CallGraphPackage.FIELD__IS_FINAL:
				return isIsFinal() ? Boolean.TRUE : Boolean.FALSE;
			case CallGraphPackage.FIELD__IS_STATIC:
				return isIsStatic() ? Boolean.TRUE : Boolean.FALSE;
			case CallGraphPackage.FIELD__IS_VOLATILE:
				return isIsVolatile() ? Boolean.TRUE : Boolean.FALSE;
			case CallGraphPackage.FIELD__SIGNATURE:
				return getSignature();
			case CallGraphPackage.FIELD__SCOPE_MODIFIER:
				return getScopeModifier();
			case CallGraphPackage.FIELD__IS_TRANSIENT:
				return isIsTransient() ? Boolean.TRUE : Boolean.FALSE;
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CallGraphPackage.FIELD__IS_STRICT_FP:
				setIsStrictFP(((Boolean)newValue).booleanValue());
				return;
			case CallGraphPackage.FIELD__IS_FINAL:
				setIsFinal(((Boolean)newValue).booleanValue());
				return;
			case CallGraphPackage.FIELD__IS_STATIC:
				setIsStatic(((Boolean)newValue).booleanValue());
				return;
			case CallGraphPackage.FIELD__IS_VOLATILE:
				setIsVolatile(((Boolean)newValue).booleanValue());
				return;
			case CallGraphPackage.FIELD__SIGNATURE:
				setSignature((String)newValue);
				return;
			case CallGraphPackage.FIELD__SCOPE_MODIFIER:
				setScopeModifier((ScopeModifier)newValue);
				return;
			case CallGraphPackage.FIELD__IS_TRANSIENT:
				setIsTransient(((Boolean)newValue).booleanValue());
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CallGraphPackage.FIELD__IS_STRICT_FP:
				setIsStrictFP(IS_STRICT_FP_EDEFAULT);
				return;
			case CallGraphPackage.FIELD__IS_FINAL:
				setIsFinal(IS_FINAL_EDEFAULT);
				return;
			case CallGraphPackage.FIELD__IS_STATIC:
				setIsStatic(IS_STATIC_EDEFAULT);
				return;
			case CallGraphPackage.FIELD__IS_VOLATILE:
				setIsVolatile(IS_VOLATILE_EDEFAULT);
				return;
			case CallGraphPackage.FIELD__SIGNATURE:
				setSignature(SIGNATURE_EDEFAULT);
				return;
			case CallGraphPackage.FIELD__SCOPE_MODIFIER:
				setScopeModifier(SCOPE_MODIFIER_EDEFAULT);
				return;
			case CallGraphPackage.FIELD__IS_TRANSIENT:
				setIsTransient(IS_TRANSIENT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CallGraphPackage.FIELD__IS_STRICT_FP:
				return isStrictFP != IS_STRICT_FP_EDEFAULT;
			case CallGraphPackage.FIELD__IS_FINAL:
				return isFinal != IS_FINAL_EDEFAULT;
			case CallGraphPackage.FIELD__IS_STATIC:
				return isStatic != IS_STATIC_EDEFAULT;
			case CallGraphPackage.FIELD__IS_VOLATILE:
				return isVolatile != IS_VOLATILE_EDEFAULT;
			case CallGraphPackage.FIELD__SIGNATURE:
				return SIGNATURE_EDEFAULT == null ? signature != null : !SIGNATURE_EDEFAULT.equals(signature);
			case CallGraphPackage.FIELD__SCOPE_MODIFIER:
				return scopeModifier != SCOPE_MODIFIER_EDEFAULT;
			case CallGraphPackage.FIELD__IS_TRANSIENT:
				return isTransient != IS_TRANSIENT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isStrictFP: ");
		result.append(isStrictFP);
		result.append(", isFinal: ");
		result.append(isFinal);
		result.append(", isStatic: ");
		result.append(isStatic);
		result.append(", isVolatile: ");
		result.append(isVolatile);
		result.append(", signature: ");
		result.append(signature);
		result.append(", scopeModifier: ");
		result.append(scopeModifier);
		result.append(", isTransient: ");
		result.append(isTransient);
		result.append(')');
		return result.toString();
	}

	@Override
	boolean isValidModifiers() {
		if(isFinal) {
			return !isVolatile;
		}
		
		return true;
	}
	
	@Override
	public void setNodeContainer(NodeContainer newNodeContainer) {
		if (nodeContainer == null || !nodeContainer.equals(newNodeContainer)) {
			super.setNodeContainer(newNodeContainer);

			if (newNodeContainer instanceof Interface) {
				((Interface) newNodeContainer).addField(this);
			}
		}
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof Field))
			return false;
		return true;
	}
	
	@Override
	public Node clone() {
		Field nodeClone = (Field) super.clone();
		
		nodeClone.setIsFinal(this.isFinal);
		nodeClone.setIsStatic(this.isStatic);
		nodeClone.setIsStrictFP(this.isStrictFP);
		nodeClone.setIsTransient(this.isTransient);
		nodeClone.setIsVolatile(this.isVolatile);
		nodeClone.setScopeModifier(this.scopeModifier);
		nodeClone.setSignature(this.signature);
		
		return nodeClone;
	}
	
	protected Node cloneNode() {
		return CallGraphFactory.eINSTANCE.createField();
	}
} //FieldImpl
