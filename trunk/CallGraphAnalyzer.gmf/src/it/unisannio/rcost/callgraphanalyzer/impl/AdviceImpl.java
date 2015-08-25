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
import it.unisannio.rcost.callgraphanalyzer.Node;
import it.unisannio.rcost.callgraphanalyzer.NodeContainer;
import it.unisannio.rcost.callgraphanalyzer.dbmanagers.AdviceFacade;
import it.unisannio.rcost.callgraphanalyzer.util.CallGraphDiagramRegistry;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Advice</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.unisannio.rcost.callgraphanalyzer.impl.AdviceImpl#isIsStrictFp <em>Is Strict Fp</em>}</li>
 *   <li>{@link it.unisannio.rcost.callgraphanalyzer.impl.AdviceImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link it.unisannio.rcost.callgraphanalyzer.impl.AdviceImpl#getLocalId <em>Local Id</em>}</li>
 *   <li>{@link it.unisannio.rcost.callgraphanalyzer.impl.AdviceImpl#getSignature <em>Signature</em>}</li>
 *   <li>{@link it.unisannio.rcost.callgraphanalyzer.impl.AdviceImpl#getPointcutExpression <em>Pointcut Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AdviceImpl extends NodeLeafImpl implements Advice {
	protected boolean isEmpty = true;
	
	/**
	 * The default value of the '{@link #isIsStrictFp() <em>Is Strict Fp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsStrictFp()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_STRICT_FP_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isIsStrictFp() <em>Is Strict Fp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsStrictFp()
	 * @generated
	 * @ordered
	 */
	protected boolean isStrictFp = IS_STRICT_FP_EDEFAULT;
	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final String KIND_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected String kind = KIND_EDEFAULT;
	/**
	 * The default value of the '{@link #getLocalId() <em>Local Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalId()
	 * @generated
	 * @ordered
	 */
	protected static final int LOCAL_ID_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getLocalId() <em>Local Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalId()
	 * @generated
	 * @ordered
	 */
	protected int localId = LOCAL_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getSignature() <em>Signature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignature()
	 * @generated
	 * @ordered
	 */
	protected static final String SIGNATURE_EDEFAULT = null;
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
	 * The default value of the '{@link #getPointcutExpression() <em>Pointcut Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointcutExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String POINTCUT_EXPRESSION_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getPointcutExpression() <em>Pointcut Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointcutExpression()
	 * @generated
	 * @ordered
	 */
	protected String pointcutExpression = POINTCUT_EXPRESSION_EDEFAULT;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	protected AdviceImpl() {
		super();
		
		name = "";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CallGraphPackage.Literals.ADVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean isIsStrictFp() {
//		//fill();
		return isStrictFp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void setIsStrictFp(boolean newIsStrictFp) {
		boolean oldIsStrictFp = isStrictFp;
		isStrictFp = newIsStrictFp;
		
		if(!isValidModifiers()){
			isStrictFp = oldIsStrictFp;
		}
//		else if (eNotificationRequired())
//			eNotify(new ENotificationImpl(this, Notification.SET, CallGraphPackage.ADVICE__IS_STRICT_FP, oldIsStrictFp, isStrictFp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(String newKind) {
		String oldKind = kind;
		kind = newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CallGraphPackage.ADVICE__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLocalId() {
		return localId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocalId(int newLocalId) {
		int oldLocalId = localId;
		localId = newLocalId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CallGraphPackage.ADVICE__LOCAL_ID, oldLocalId, localId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public String getSignature() {
		//fill();
		return signature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignature(String newSignature) {
		String oldSignature = signature;
		signature = newSignature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CallGraphPackage.ADVICE__SIGNATURE, oldSignature, signature));
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPointcutExpression() {
		return pointcutExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPointcutExpression(String newPointcutExpression) {
		String oldPointcutExpression = pointcutExpression;
		pointcutExpression = newPointcutExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CallGraphPackage.ADVICE__POINTCUT_EXPRESSION, oldPointcutExpression, pointcutExpression));
	}

//	protected void fill() {
//		if (isEmpty) {
//			try {
//				String projectName = CallGraphDiagramRegistry.getInstance().getGraph(this)
//						.getCriteria().getProjectName();
//				AdviceFacade.facade.fillAllAttribute(projectName, this);
//
//				isEmpty = false;
//			} catch (Exception exc) {
//				exc.printStackTrace();
//			}
//		}
//	}
	
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
//		if (isEmpty)
//			switch (featureID) {
//			case CallGraphPackage.ADVICE__SIGNATURE:
////			case CallGraphPackage.ADVICE__IS_STRICT_FP:
//				fill();
//				break;
//			}

		return this.eGet_(featureID, resolve, coreType);
	}
	
	public Object eGet_(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CallGraphPackage.ADVICE__IS_STRICT_FP:
				return isIsStrictFp() ? Boolean.TRUE : Boolean.FALSE;
			case CallGraphPackage.ADVICE__KIND:
				return getKind();
			case CallGraphPackage.ADVICE__LOCAL_ID:
				return new Integer(getLocalId());
			case CallGraphPackage.ADVICE__SIGNATURE:
				return getSignature();
			case CallGraphPackage.ADVICE__POINTCUT_EXPRESSION:
				return getPointcutExpression();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CallGraphPackage.ADVICE__IS_STRICT_FP:
				setIsStrictFp(((Boolean)newValue).booleanValue());
				return;
			case CallGraphPackage.ADVICE__KIND:
				setKind((String)newValue);
				return;
			case CallGraphPackage.ADVICE__LOCAL_ID:
				setLocalId(((Integer)newValue).intValue());
				return;
			case CallGraphPackage.ADVICE__SIGNATURE:
				setSignature((String)newValue);
				return;
			case CallGraphPackage.ADVICE__POINTCUT_EXPRESSION:
				setPointcutExpression((String)newValue);
				return;
			case CallGraphPackage.ADVICE__NAME:
				setName("");
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
			case CallGraphPackage.ADVICE__IS_STRICT_FP:
				setIsStrictFp(IS_STRICT_FP_EDEFAULT);
				return;
			case CallGraphPackage.ADVICE__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case CallGraphPackage.ADVICE__LOCAL_ID:
				setLocalId(LOCAL_ID_EDEFAULT);
				return;
			case CallGraphPackage.ADVICE__SIGNATURE:
				setSignature(SIGNATURE_EDEFAULT);
				return;
			case CallGraphPackage.ADVICE__POINTCUT_EXPRESSION:
				setPointcutExpression(POINTCUT_EXPRESSION_EDEFAULT);
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
			case CallGraphPackage.ADVICE__IS_STRICT_FP:
				return isStrictFp != IS_STRICT_FP_EDEFAULT;
			case CallGraphPackage.ADVICE__KIND:
				return KIND_EDEFAULT == null ? kind != null : !KIND_EDEFAULT.equals(kind);
			case CallGraphPackage.ADVICE__LOCAL_ID:
				return localId != LOCAL_ID_EDEFAULT;
			case CallGraphPackage.ADVICE__SIGNATURE:
				return SIGNATURE_EDEFAULT == null ? signature != null : !SIGNATURE_EDEFAULT.equals(signature);
			case CallGraphPackage.ADVICE__POINTCUT_EXPRESSION:
				return POINTCUT_EXPRESSION_EDEFAULT == null ? pointcutExpression != null : !POINTCUT_EXPRESSION_EDEFAULT.equals(pointcutExpression);
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
		result.append(" (isStrictFp: ");
		result.append(isStrictFp);
		result.append(", kind: ");
		result.append(kind);
		result.append(", localId: ");
		result.append(localId);
		result.append(", signature: ");
		result.append(signature);
		result.append(", pointcutExpression: ");
		result.append(pointcutExpression);
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

			if (newNodeContainer instanceof Aspect) {
				((Aspect) newNodeContainer).addAdvice(this);
			}
		}
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof Advice))
			return false;
		return true;
	}
	
	@Override
	public Node clone() {
		Advice nodeClone = (Advice) super.clone();
		
		nodeClone.setIsStrictFp(this.isStrictFp);
		nodeClone.setKind(this.kind);
		nodeClone.setLocalId(this.localId);
		nodeClone.setSignature(this.signature);
		nodeClone.setPointcutExpression(this.pointcutExpression);
		
		return nodeClone;
	}
	
	protected Node cloneNode() {
		return CallGraphFactory.eINSTANCE.createAdvice();
	}
} //AdviceImpl
