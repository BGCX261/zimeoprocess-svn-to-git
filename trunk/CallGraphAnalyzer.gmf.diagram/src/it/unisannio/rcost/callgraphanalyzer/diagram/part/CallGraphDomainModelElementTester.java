package it.unisannio.rcost.callgraphanalyzer.diagram.part;

import it.unisannio.rcost.callgraphanalyzer.CallGraphPackage;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * @generated
 */
public class CallGraphDomainModelElementTester extends PropertyTester {

	/**
	 * @generated
	 */
	public boolean test(Object receiver, String method, Object[] args, Object expectedValue) {
		if (false == receiver instanceof EObject) {
			return false;
		}
		EObject eObject = (EObject) receiver;
		EClass eClass = eObject.eClass();
		if (eClass == CallGraphPackage.eINSTANCE.getNode()) {
			return true;
		}
		if (eClass == CallGraphPackage.eINSTANCE.getEdge()) {
			return true;
		}
		if (eClass == CallGraphPackage.eINSTANCE.getGraph()) {
			return true;
		}
		if (eClass == CallGraphPackage.eINSTANCE.getPackage()) {
			return true;
		}
		if (eClass == CallGraphPackage.eINSTANCE.getExplicitCall()) {
			return true;
		}
		if (eClass == CallGraphPackage.eINSTANCE.getClass_()) {
			return true;
		}
		if (eClass == CallGraphPackage.eINSTANCE.getField()) {
			return true;
		}
		if (eClass == CallGraphPackage.eINSTANCE.getMethod()) {
			return true;
		}
		if (eClass == CallGraphPackage.eINSTANCE.getPointcut()) {
			return true;
		}
		if (eClass == CallGraphPackage.eINSTANCE.getAdvice()) {
			return true;
		}
		if (eClass == CallGraphPackage.eINSTANCE.getAspect()) {
			return true;
		}
		if (eClass == CallGraphPackage.eINSTANCE.getInterface()) {
			return true;
		}
		if (eClass == CallGraphPackage.eINSTANCE.getNodeContainer()) {
			return true;
		}
		if (eClass == CallGraphPackage.eINSTANCE.getImplicitCall()) {
			return true;
		}
		if (eClass == CallGraphPackage.eINSTANCE.getAssociation()) {
			return true;
		}
		if (eClass == CallGraphPackage.eINSTANCE.getImplementation()) {
			return true;
		}
		if (eClass == CallGraphPackage.eINSTANCE.getDependence()) {
			return true;
		}
		if (eClass == CallGraphPackage.eINSTANCE.getExtension()) {
			return true;
		}
		if (eClass == CallGraphPackage.eINSTANCE.getProject()) {
			return true;
		}
		if (eClass == CallGraphPackage.eINSTANCE.getNodeLeaf()) {
			return true;
		}
		if (eClass == CallGraphPackage.eINSTANCE.getImplicitCallDecorator()) {
			return true;
		}
		if (eClass == CallGraphPackage.eINSTANCE.getExplicitCallDecorator()) {
			return true;
		}
		if (eClass == CallGraphPackage.eINSTANCE.getDependenceDecorator()) {
			return true;
		}
		if (eClass == CallGraphPackage.eINSTANCE.getEdgeDecorator()) {
			return true;
		}
		if (eClass == CallGraphPackage.eINSTANCE.getJoinPointShadow()) {
			return true;
		}
		return false;
	}

}
