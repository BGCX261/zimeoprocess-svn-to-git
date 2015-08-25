package it.unisannio.rcost.callgraphanalyzer.diagram.part;

import it.unisannio.rcost.callgraphanalyzer.Advice;
import it.unisannio.rcost.callgraphanalyzer.Aspect;
import it.unisannio.rcost.callgraphanalyzer.Association;
import it.unisannio.rcost.callgraphanalyzer.CallGraphPackage;
import it.unisannio.rcost.callgraphanalyzer.Class;
import it.unisannio.rcost.callgraphanalyzer.Dependence;
import it.unisannio.rcost.callgraphanalyzer.ExplicitCall;
import it.unisannio.rcost.callgraphanalyzer.Extension;
import it.unisannio.rcost.callgraphanalyzer.Field;
import it.unisannio.rcost.callgraphanalyzer.Graph;
import it.unisannio.rcost.callgraphanalyzer.Implementation;
import it.unisannio.rcost.callgraphanalyzer.ImplicitCall;
import it.unisannio.rcost.callgraphanalyzer.Interface;
import it.unisannio.rcost.callgraphanalyzer.Method;
import it.unisannio.rcost.callgraphanalyzer.Node;
import it.unisannio.rcost.callgraphanalyzer.Package;
import it.unisannio.rcost.callgraphanalyzer.Pointcut;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.Advice2EditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.AdviceEditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.Aspect2EditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.AspectBodyCompartment2EditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.AspectBodyCompartment3EditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.AspectBodyCompartmentEditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.AspectEditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.AssociationEditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.Class2EditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.ClassBodyCompartment2EditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.ClassBodyCompartment3EditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.ClassBodyCompartmentEditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.ClassEditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.DependenceEditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.ExplicitCallEditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.ExtensionEditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.Field2EditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.FieldEditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.GraphEditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.ImplementationEditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.ImplicitCallEditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.Interface2EditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.Interface3EditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.InterfaceBodyCompartment2EditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.InterfaceBodyCompartment3EditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.InterfaceBodyCompartmentEditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.InterfaceEditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.Method2EditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.Method3EditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.MethodEditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.Package2EditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.Package3EditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.PackageBodyCompartment2EditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.PackageBodyCompartmentEditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.PackageEditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.Pointcut2EditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.PointcutEditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.providers.CallGraphElementTypes;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class CallGraphDiagramUpdater {

	/**
	 * @generated
	 */
	public static List getSemanticChildren(View view) {
		switch (CallGraphVisualIDRegistry.getVisualID(view)) {
		case PackageBodyCompartmentEditPart.VISUAL_ID:
			return getPackageBodyCompartment_5001SemanticChildren(view);
		case AspectBodyCompartmentEditPart.VISUAL_ID:
			return getAspectBodyCompartment_5002SemanticChildren(view);
		case ClassBodyCompartmentEditPart.VISUAL_ID:
			return getInterfaceBodyCompartment_5003SemanticChildren(view);
		case InterfaceBodyCompartmentEditPart.VISUAL_ID:
			return getClassBodyCompartment_5004SemanticChildren(view);
		case PackageBodyCompartment2EditPart.VISUAL_ID:
			return getAspectBodyCompartment_5005SemanticChildren(view);
		case AspectBodyCompartment2EditPart.VISUAL_ID:
			return getClassBodyCompartment_5006SemanticChildren(view);
		case ClassBodyCompartment2EditPart.VISUAL_ID:
			return getInterfaceBodyCompartment_5007SemanticChildren(view);
		case InterfaceBodyCompartment2EditPart.VISUAL_ID:
			return getPackageBodyCompartment_5008SemanticChildren(view);
		case AspectBodyCompartment3EditPart.VISUAL_ID:
			return getAspectBodyCompartment_5009SemanticChildren(view);
		case ClassBodyCompartment3EditPart.VISUAL_ID:
			return getClassBodyCompartment_5010SemanticChildren(view);
		case InterfaceBodyCompartment3EditPart.VISUAL_ID:
			return getInterfaceBodyCompartment_5011SemanticChildren(view);
		case GraphEditPart.VISUAL_ID:
			return getGraph_79SemanticChildren(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPackageBodyCompartment_5001SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Package modelElement = (Package) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getInnerModulesList().iterator(); it.hasNext();) {
			Interface childElement = (Interface) it.next();
			int visualID = CallGraphVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Aspect2EditPart.VISUAL_ID) {
				result.add(new CallGraphNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Package2EditPart.VISUAL_ID) {
				result.add(new CallGraphNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Interface3EditPart.VISUAL_ID) {
				result.add(new CallGraphNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getPackagesList().iterator(); it.hasNext();) {
			Package childElement = (Package) it.next();
			int visualID = CallGraphVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Package3EditPart.VISUAL_ID) {
				result.add(new CallGraphNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAspectBodyCompartment_5002SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Aspect modelElement = (Aspect) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getPointcutsList().iterator(); it.hasNext();) {
			Pointcut childElement = (Pointcut) it.next();
			int visualID = CallGraphVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Pointcut2EditPart.VISUAL_ID) {
				result.add(new CallGraphNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getAdvicesList().iterator(); it.hasNext();) {
			Advice childElement = (Advice) it.next();
			int visualID = CallGraphVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Advice2EditPart.VISUAL_ID) {
				result.add(new CallGraphNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getMethodsList().iterator(); it.hasNext();) {
			Method childElement = (Method) it.next();
			int visualID = CallGraphVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Method2EditPart.VISUAL_ID) {
				result.add(new CallGraphNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getFieldsList().iterator(); it.hasNext();) {
			Field childElement = (Field) it.next();
			int visualID = CallGraphVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Field2EditPart.VISUAL_ID) {
				result.add(new CallGraphNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getInnerModulesList().iterator(); it.hasNext();) {
			Interface childElement = (Interface) it.next();
			int visualID = CallGraphVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Class2EditPart.VISUAL_ID) {
				result.add(new CallGraphNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Interface2EditPart.VISUAL_ID) {
				result.add(new CallGraphNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Method3EditPart.VISUAL_ID) {
				result.add(new CallGraphNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInterfaceBodyCompartment_5003SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Interface modelElement = (Interface) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getMethodsList().iterator(); it.hasNext();) {
			Method childElement = (Method) it.next();
			int visualID = CallGraphVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Method2EditPart.VISUAL_ID) {
				result.add(new CallGraphNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getFieldsList().iterator(); it.hasNext();) {
			Field childElement = (Field) it.next();
			int visualID = CallGraphVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Field2EditPart.VISUAL_ID) {
				result.add(new CallGraphNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getInnerModulesList().iterator(); it.hasNext();) {
			Interface childElement = (Interface) it.next();
			int visualID = CallGraphVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Interface2EditPart.VISUAL_ID) {
				result.add(new CallGraphNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Class2EditPart.VISUAL_ID) {
				result.add(new CallGraphNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Method3EditPart.VISUAL_ID) {
				result.add(new CallGraphNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getClassBodyCompartment_5004SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Class modelElement = (Class) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getMethodsList().iterator(); it.hasNext();) {
			Method childElement = (Method) it.next();
			int visualID = CallGraphVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Method2EditPart.VISUAL_ID) {
				result.add(new CallGraphNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getFieldsList().iterator(); it.hasNext();) {
			Field childElement = (Field) it.next();
			int visualID = CallGraphVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Field2EditPart.VISUAL_ID) {
				result.add(new CallGraphNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getInnerModulesList().iterator(); it.hasNext();) {
			Interface childElement = (Interface) it.next();
			int visualID = CallGraphVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Interface2EditPart.VISUAL_ID) {
				result.add(new CallGraphNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Class2EditPart.VISUAL_ID) {
				result.add(new CallGraphNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Method3EditPart.VISUAL_ID) {
				result.add(new CallGraphNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAspectBodyCompartment_5005SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Aspect modelElement = (Aspect) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getPointcutsList().iterator(); it.hasNext();) {
			Pointcut childElement = (Pointcut) it.next();
			int visualID = CallGraphVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Pointcut2EditPart.VISUAL_ID) {
				result.add(new CallGraphNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getAdvicesList().iterator(); it.hasNext();) {
			Advice childElement = (Advice) it.next();
			int visualID = CallGraphVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Advice2EditPart.VISUAL_ID) {
				result.add(new CallGraphNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getMethodsList().iterator(); it.hasNext();) {
			Method childElement = (Method) it.next();
			int visualID = CallGraphVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Method2EditPart.VISUAL_ID) {
				result.add(new CallGraphNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getFieldsList().iterator(); it.hasNext();) {
			Field childElement = (Field) it.next();
			int visualID = CallGraphVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Field2EditPart.VISUAL_ID) {
				result.add(new CallGraphNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getInnerModulesList().iterator(); it.hasNext();) {
			Interface childElement = (Interface) it.next();
			int visualID = CallGraphVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Class2EditPart.VISUAL_ID) {
				result.add(new CallGraphNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Interface2EditPart.VISUAL_ID) {
				result.add(new CallGraphNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Method3EditPart.VISUAL_ID) {
				result.add(new CallGraphNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getClassBodyCompartment_5006SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Class modelElement = (Class) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getMethodsList().iterator(); it.hasNext();) {
			Method childElement = (Method) it.next();
			int visualID = CallGraphVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Method2EditPart.VISUAL_ID) {
				result.add(new CallGraphNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getFieldsList().iterator(); it.hasNext();) {
			Field childElement = (Field) it.next();
			int visualID = CallGraphVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Field2EditPart.VISUAL_ID) {
				result.add(new CallGraphNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getInnerModulesList().iterator(); it.hasNext();) {
			Interface childElement = (Interface) it.next();
			int visualID = CallGraphVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Interface2EditPart.VISUAL_ID) {
				result.add(new CallGraphNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Class2EditPart.VISUAL_ID) {
				result.add(new CallGraphNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Method3EditPart.VISUAL_ID) {
				result.add(new CallGraphNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInterfaceBodyCompartment_5007SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Interface modelElement = (Interface) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getMethodsList().iterator(); it.hasNext();) {
			Method childElement = (Method) it.next();
			int visualID = CallGraphVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Method2EditPart.VISUAL_ID) {
				result.add(new CallGraphNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getFieldsList().iterator(); it.hasNext();) {
			Field childElement = (Field) it.next();
			int visualID = CallGraphVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Field2EditPart.VISUAL_ID) {
				result.add(new CallGraphNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getInnerModulesList().iterator(); it.hasNext();) {
			Interface childElement = (Interface) it.next();
			int visualID = CallGraphVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Interface2EditPart.VISUAL_ID) {
				result.add(new CallGraphNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Class2EditPart.VISUAL_ID) {
				result.add(new CallGraphNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Method3EditPart.VISUAL_ID) {
				result.add(new CallGraphNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPackageBodyCompartment_5008SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Package modelElement = (Package) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getInnerModulesList().iterator(); it.hasNext();) {
			Interface childElement = (Interface) it.next();
			int visualID = CallGraphVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Aspect2EditPart.VISUAL_ID) {
				result.add(new CallGraphNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Package2EditPart.VISUAL_ID) {
				result.add(new CallGraphNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Interface3EditPart.VISUAL_ID) {
				result.add(new CallGraphNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getPackagesList().iterator(); it.hasNext();) {
			Package childElement = (Package) it.next();
			int visualID = CallGraphVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Package3EditPart.VISUAL_ID) {
				result.add(new CallGraphNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAspectBodyCompartment_5009SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Aspect modelElement = (Aspect) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getPointcutsList().iterator(); it.hasNext();) {
			Pointcut childElement = (Pointcut) it.next();
			int visualID = CallGraphVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Pointcut2EditPart.VISUAL_ID) {
				result.add(new CallGraphNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getAdvicesList().iterator(); it.hasNext();) {
			Advice childElement = (Advice) it.next();
			int visualID = CallGraphVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Advice2EditPart.VISUAL_ID) {
				result.add(new CallGraphNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getMethodsList().iterator(); it.hasNext();) {
			Method childElement = (Method) it.next();
			int visualID = CallGraphVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Method2EditPart.VISUAL_ID) {
				result.add(new CallGraphNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getFieldsList().iterator(); it.hasNext();) {
			Field childElement = (Field) it.next();
			int visualID = CallGraphVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Field2EditPart.VISUAL_ID) {
				result.add(new CallGraphNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getInnerModulesList().iterator(); it.hasNext();) {
			Interface childElement = (Interface) it.next();
			int visualID = CallGraphVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Class2EditPart.VISUAL_ID) {
				result.add(new CallGraphNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Interface2EditPart.VISUAL_ID) {
				result.add(new CallGraphNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Method3EditPart.VISUAL_ID) {
				result.add(new CallGraphNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getClassBodyCompartment_5010SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Class modelElement = (Class) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getMethodsList().iterator(); it.hasNext();) {
			Method childElement = (Method) it.next();
			int visualID = CallGraphVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Method2EditPart.VISUAL_ID) {
				result.add(new CallGraphNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getFieldsList().iterator(); it.hasNext();) {
			Field childElement = (Field) it.next();
			int visualID = CallGraphVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Field2EditPart.VISUAL_ID) {
				result.add(new CallGraphNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getInnerModulesList().iterator(); it.hasNext();) {
			Interface childElement = (Interface) it.next();
			int visualID = CallGraphVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Interface2EditPart.VISUAL_ID) {
				result.add(new CallGraphNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Class2EditPart.VISUAL_ID) {
				result.add(new CallGraphNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Method3EditPart.VISUAL_ID) {
				result.add(new CallGraphNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInterfaceBodyCompartment_5011SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Interface modelElement = (Interface) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getMethodsList().iterator(); it.hasNext();) {
			Method childElement = (Method) it.next();
			int visualID = CallGraphVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Method2EditPart.VISUAL_ID) {
				result.add(new CallGraphNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getFieldsList().iterator(); it.hasNext();) {
			Field childElement = (Field) it.next();
			int visualID = CallGraphVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Field2EditPart.VISUAL_ID) {
				result.add(new CallGraphNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getInnerModulesList().iterator(); it.hasNext();) {
			Interface childElement = (Interface) it.next();
			int visualID = CallGraphVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Interface2EditPart.VISUAL_ID) {
				result.add(new CallGraphNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Class2EditPart.VISUAL_ID) {
				result.add(new CallGraphNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Method3EditPart.VISUAL_ID) {
				result.add(new CallGraphNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getGraph_79SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Graph modelElement = (Graph) view.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getNodesList().iterator(); it.hasNext();) {
			Node childElement = (Node) it.next();
			int visualID = CallGraphVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PackageEditPart.VISUAL_ID) {
				result.add(new CallGraphNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AspectEditPart.VISUAL_ID) {
				result.add(new CallGraphNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ClassEditPart.VISUAL_ID) {
				result.add(new CallGraphNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == InterfaceEditPart.VISUAL_ID) {
				result.add(new CallGraphNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdviceEditPart.VISUAL_ID) {
				result.add(new CallGraphNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MethodEditPart.VISUAL_ID) {
				result.add(new CallGraphNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FieldEditPart.VISUAL_ID) {
				result.add(new CallGraphNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PointcutEditPart.VISUAL_ID) {
				result.add(new CallGraphNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getContainedLinks(View view) {
		switch (CallGraphVisualIDRegistry.getVisualID(view)) {
		case GraphEditPart.VISUAL_ID:
			return getGraph_79ContainedLinks(view);
		case PackageEditPart.VISUAL_ID:
			return getPackage_1001ContainedLinks(view);
		case AspectEditPart.VISUAL_ID:
			return getAspect_1002ContainedLinks(view);
		case ClassEditPart.VISUAL_ID:
			return getClass_1003ContainedLinks(view);
		case InterfaceEditPart.VISUAL_ID:
			return getInterface_1004ContainedLinks(view);
		case AdviceEditPart.VISUAL_ID:
			return getAdvice_1005ContainedLinks(view);
		case MethodEditPart.VISUAL_ID:
			return getMethod_1006ContainedLinks(view);
		case FieldEditPart.VISUAL_ID:
			return getField_1007ContainedLinks(view);
		case PointcutEditPart.VISUAL_ID:
			return getPointcut_1008ContainedLinks(view);
		case Aspect2EditPart.VISUAL_ID:
			return getAspect_2001ContainedLinks(view);
		case Pointcut2EditPart.VISUAL_ID:
			return getPointcut_2002ContainedLinks(view);
		case Advice2EditPart.VISUAL_ID:
			return getAdvice_2003ContainedLinks(view);
		case Method2EditPart.VISUAL_ID:
			return getMethod_2004ContainedLinks(view);
		case Field2EditPart.VISUAL_ID:
			return getField_2005ContainedLinks(view);
		case Class2EditPart.VISUAL_ID:
			return getInterface_2006ContainedLinks(view);
		case Interface2EditPart.VISUAL_ID:
			return getClass_2007ContainedLinks(view);
		case Method3EditPart.VISUAL_ID:
			return getAspect_2008ContainedLinks(view);
		case Package2EditPart.VISUAL_ID:
			return getClass_2009ContainedLinks(view);
		case Interface3EditPart.VISUAL_ID:
			return getInterface_2010ContainedLinks(view);
		case Package3EditPart.VISUAL_ID:
			return getPackage_2011ContainedLinks(view);
		case ExplicitCallEditPart.VISUAL_ID:
			return getExplicitCall_3001ContainedLinks(view);
		case DependenceEditPart.VISUAL_ID:
			return getDependence_3002ContainedLinks(view);
		case AssociationEditPart.VISUAL_ID:
			return getAssociation_3003ContainedLinks(view);
		case ExtensionEditPart.VISUAL_ID:
			return getExtension_3004ContainedLinks(view);
		case ImplicitCallEditPart.VISUAL_ID:
			return getImplicitCall_3005ContainedLinks(view);
		case ImplementationEditPart.VISUAL_ID:
			return getImplementation_3006ContainedLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIncomingLinks(View view) {
		switch (CallGraphVisualIDRegistry.getVisualID(view)) {
		case PackageEditPart.VISUAL_ID:
			return getPackage_1001IncomingLinks(view);
		case AspectEditPart.VISUAL_ID:
			return getAspect_1002IncomingLinks(view);
		case ClassEditPart.VISUAL_ID:
			return getClass_1003IncomingLinks(view);
		case InterfaceEditPart.VISUAL_ID:
			return getInterface_1004IncomingLinks(view);
		case AdviceEditPart.VISUAL_ID:
			return getAdvice_1005IncomingLinks(view);
		case MethodEditPart.VISUAL_ID:
			return getMethod_1006IncomingLinks(view);
		case FieldEditPart.VISUAL_ID:
			return getField_1007IncomingLinks(view);
		case PointcutEditPart.VISUAL_ID:
			return getPointcut_1008IncomingLinks(view);
		case Aspect2EditPart.VISUAL_ID:
			return getAspect_2001IncomingLinks(view);
		case Pointcut2EditPart.VISUAL_ID:
			return getPointcut_2002IncomingLinks(view);
		case Advice2EditPart.VISUAL_ID:
			return getAdvice_2003IncomingLinks(view);
		case Method2EditPart.VISUAL_ID:
			return getMethod_2004IncomingLinks(view);
		case Field2EditPart.VISUAL_ID:
			return getField_2005IncomingLinks(view);
		case Class2EditPart.VISUAL_ID:
			return getInterface_2006IncomingLinks(view);
		case Interface2EditPart.VISUAL_ID:
			return getClass_2007IncomingLinks(view);
		case Method3EditPart.VISUAL_ID:
			return getAspect_2008IncomingLinks(view);
		case Package2EditPart.VISUAL_ID:
			return getClass_2009IncomingLinks(view);
		case Interface3EditPart.VISUAL_ID:
			return getInterface_2010IncomingLinks(view);
		case Package3EditPart.VISUAL_ID:
			return getPackage_2011IncomingLinks(view);
		case ExplicitCallEditPart.VISUAL_ID:
			return getExplicitCall_3001IncomingLinks(view);
		case DependenceEditPart.VISUAL_ID:
			return getDependence_3002IncomingLinks(view);
		case AssociationEditPart.VISUAL_ID:
			return getAssociation_3003IncomingLinks(view);
		case ExtensionEditPart.VISUAL_ID:
			return getExtension_3004IncomingLinks(view);
		case ImplicitCallEditPart.VISUAL_ID:
			return getImplicitCall_3005IncomingLinks(view);
		case ImplementationEditPart.VISUAL_ID:
			return getImplementation_3006IncomingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOutgoingLinks(View view) {
		switch (CallGraphVisualIDRegistry.getVisualID(view)) {
		case PackageEditPart.VISUAL_ID:
			return getPackage_1001OutgoingLinks(view);
		case AspectEditPart.VISUAL_ID:
			return getAspect_1002OutgoingLinks(view);
		case ClassEditPart.VISUAL_ID:
			return getClass_1003OutgoingLinks(view);
		case InterfaceEditPart.VISUAL_ID:
			return getInterface_1004OutgoingLinks(view);
		case AdviceEditPart.VISUAL_ID:
			return getAdvice_1005OutgoingLinks(view);
		case MethodEditPart.VISUAL_ID:
			return getMethod_1006OutgoingLinks(view);
		case FieldEditPart.VISUAL_ID:
			return getField_1007OutgoingLinks(view);
		case PointcutEditPart.VISUAL_ID:
			return getPointcut_1008OutgoingLinks(view);
		case Aspect2EditPart.VISUAL_ID:
			return getAspect_2001OutgoingLinks(view);
		case Pointcut2EditPart.VISUAL_ID:
			return getPointcut_2002OutgoingLinks(view);
		case Advice2EditPart.VISUAL_ID:
			return getAdvice_2003OutgoingLinks(view);
		case Method2EditPart.VISUAL_ID:
			return getMethod_2004OutgoingLinks(view);
		case Field2EditPart.VISUAL_ID:
			return getField_2005OutgoingLinks(view);
		case Class2EditPart.VISUAL_ID:
			return getInterface_2006OutgoingLinks(view);
		case Interface2EditPart.VISUAL_ID:
			return getClass_2007OutgoingLinks(view);
		case Method3EditPart.VISUAL_ID:
			return getAspect_2008OutgoingLinks(view);
		case Package2EditPart.VISUAL_ID:
			return getClass_2009OutgoingLinks(view);
		case Interface3EditPart.VISUAL_ID:
			return getInterface_2010OutgoingLinks(view);
		case Package3EditPart.VISUAL_ID:
			return getPackage_2011OutgoingLinks(view);
		case ExplicitCallEditPart.VISUAL_ID:
			return getExplicitCall_3001OutgoingLinks(view);
		case DependenceEditPart.VISUAL_ID:
			return getDependence_3002OutgoingLinks(view);
		case AssociationEditPart.VISUAL_ID:
			return getAssociation_3003OutgoingLinks(view);
		case ExtensionEditPart.VISUAL_ID:
			return getExtension_3004OutgoingLinks(view);
		case ImplicitCallEditPart.VISUAL_ID:
			return getImplicitCall_3005OutgoingLinks(view);
		case ImplementationEditPart.VISUAL_ID:
			return getImplementation_3006OutgoingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getGraph_79ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPackage_1001ContainedLinks(View view) {
		Package modelElement = (Package) view.getElement();
		List result = new LinkedList();
		result.addAll(getContainedTypeModelFacetLinks_ExplicitCall_3001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Dependence_3002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Association_3003(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Extension_3004(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_ImplicitCall_3005(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Implementation_3006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAspect_1002ContainedLinks(View view) {
		Aspect modelElement = (Aspect) view.getElement();
		List result = new LinkedList();
		result.addAll(getContainedTypeModelFacetLinks_ExplicitCall_3001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Dependence_3002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Association_3003(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Extension_3004(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_ImplicitCall_3005(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Implementation_3006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getClass_1003ContainedLinks(View view) {
		Class modelElement = (Class) view.getElement();
		List result = new LinkedList();
		result.addAll(getContainedTypeModelFacetLinks_ExplicitCall_3001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Dependence_3002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Association_3003(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Extension_3004(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_ImplicitCall_3005(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Implementation_3006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInterface_1004ContainedLinks(View view) {
		Interface modelElement = (Interface) view.getElement();
		List result = new LinkedList();
		result.addAll(getContainedTypeModelFacetLinks_ExplicitCall_3001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Dependence_3002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Association_3003(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Extension_3004(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_ImplicitCall_3005(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Implementation_3006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAdvice_1005ContainedLinks(View view) {
		Advice modelElement = (Advice) view.getElement();
		List result = new LinkedList();
		result.addAll(getContainedTypeModelFacetLinks_ExplicitCall_3001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Dependence_3002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Association_3003(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Extension_3004(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_ImplicitCall_3005(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Implementation_3006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getMethod_1006ContainedLinks(View view) {
		Method modelElement = (Method) view.getElement();
		List result = new LinkedList();
		result.addAll(getContainedTypeModelFacetLinks_ExplicitCall_3001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Dependence_3002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Association_3003(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Extension_3004(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_ImplicitCall_3005(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Implementation_3006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getField_1007ContainedLinks(View view) {
		Field modelElement = (Field) view.getElement();
		List result = new LinkedList();
		result.addAll(getContainedTypeModelFacetLinks_ExplicitCall_3001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Dependence_3002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Association_3003(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Extension_3004(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_ImplicitCall_3005(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Implementation_3006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPointcut_1008ContainedLinks(View view) {
		Pointcut modelElement = (Pointcut) view.getElement();
		List result = new LinkedList();
		result.addAll(getContainedTypeModelFacetLinks_ExplicitCall_3001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Dependence_3002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Association_3003(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Extension_3004(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_ImplicitCall_3005(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Implementation_3006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAspect_2001ContainedLinks(View view) {
		Aspect modelElement = (Aspect) view.getElement();
		List result = new LinkedList();
		result.addAll(getContainedTypeModelFacetLinks_ExplicitCall_3001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Dependence_3002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Association_3003(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Extension_3004(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_ImplicitCall_3005(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Implementation_3006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPointcut_2002ContainedLinks(View view) {
		Pointcut modelElement = (Pointcut) view.getElement();
		List result = new LinkedList();
		result.addAll(getContainedTypeModelFacetLinks_ExplicitCall_3001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Dependence_3002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Association_3003(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Extension_3004(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_ImplicitCall_3005(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Implementation_3006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAdvice_2003ContainedLinks(View view) {
		Advice modelElement = (Advice) view.getElement();
		List result = new LinkedList();
		result.addAll(getContainedTypeModelFacetLinks_ExplicitCall_3001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Dependence_3002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Association_3003(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Extension_3004(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_ImplicitCall_3005(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Implementation_3006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getMethod_2004ContainedLinks(View view) {
		Method modelElement = (Method) view.getElement();
		List result = new LinkedList();
		result.addAll(getContainedTypeModelFacetLinks_ExplicitCall_3001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Dependence_3002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Association_3003(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Extension_3004(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_ImplicitCall_3005(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Implementation_3006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getField_2005ContainedLinks(View view) {
		Field modelElement = (Field) view.getElement();
		List result = new LinkedList();
		result.addAll(getContainedTypeModelFacetLinks_ExplicitCall_3001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Dependence_3002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Association_3003(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Extension_3004(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_ImplicitCall_3005(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Implementation_3006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInterface_2006ContainedLinks(View view) {
		Interface modelElement = (Interface) view.getElement();
		List result = new LinkedList();
		result.addAll(getContainedTypeModelFacetLinks_ExplicitCall_3001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Dependence_3002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Association_3003(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Extension_3004(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_ImplicitCall_3005(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Implementation_3006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getClass_2007ContainedLinks(View view) {
		Class modelElement = (Class) view.getElement();
		List result = new LinkedList();
		result.addAll(getContainedTypeModelFacetLinks_ExplicitCall_3001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Dependence_3002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Association_3003(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Extension_3004(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_ImplicitCall_3005(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Implementation_3006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAspect_2008ContainedLinks(View view) {
		Aspect modelElement = (Aspect) view.getElement();
		List result = new LinkedList();
		result.addAll(getContainedTypeModelFacetLinks_ExplicitCall_3001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Dependence_3002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Association_3003(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Extension_3004(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_ImplicitCall_3005(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Implementation_3006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getClass_2009ContainedLinks(View view) {
		Class modelElement = (Class) view.getElement();
		List result = new LinkedList();
		result.addAll(getContainedTypeModelFacetLinks_ExplicitCall_3001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Dependence_3002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Association_3003(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Extension_3004(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_ImplicitCall_3005(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Implementation_3006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInterface_2010ContainedLinks(View view) {
		Interface modelElement = (Interface) view.getElement();
		List result = new LinkedList();
		result.addAll(getContainedTypeModelFacetLinks_ExplicitCall_3001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Dependence_3002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Association_3003(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Extension_3004(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_ImplicitCall_3005(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Implementation_3006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPackage_2011ContainedLinks(View view) {
		Package modelElement = (Package) view.getElement();
		List result = new LinkedList();
		result.addAll(getContainedTypeModelFacetLinks_ExplicitCall_3001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Dependence_3002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Association_3003(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Extension_3004(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_ImplicitCall_3005(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Implementation_3006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getExplicitCall_3001ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDependence_3002ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAssociation_3003ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExtension_3004ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getImplicitCall_3005ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getImplementation_3006ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPackage_1001IncomingLinks(View view) {
		Package modelElement = (Package) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet()
				.getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_ExplicitCall_3001(modelElement,
				crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_Dependence_3002(modelElement,
						crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_Association_3003(modelElement,
						crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Extension_3004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ImplicitCall_3005(modelElement,
				crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Implementation_3006(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAspect_1002IncomingLinks(View view) {
		Aspect modelElement = (Aspect) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet()
				.getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_ExplicitCall_3001(modelElement,
				crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_Dependence_3002(modelElement,
						crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_Association_3003(modelElement,
						crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Extension_3004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ImplicitCall_3005(modelElement,
				crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Implementation_3006(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getClass_1003IncomingLinks(View view) {
		Class modelElement = (Class) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet()
				.getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_ExplicitCall_3001(modelElement,
				crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_Dependence_3002(modelElement,
						crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_Association_3003(modelElement,
						crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Extension_3004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ImplicitCall_3005(modelElement,
				crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Implementation_3006(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInterface_1004IncomingLinks(View view) {
		Interface modelElement = (Interface) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet()
				.getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_ExplicitCall_3001(modelElement,
				crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_Dependence_3002(modelElement,
						crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_Association_3003(modelElement,
						crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Extension_3004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ImplicitCall_3005(modelElement,
				crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Implementation_3006(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAdvice_1005IncomingLinks(View view) {
		Advice modelElement = (Advice) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet()
				.getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_ExplicitCall_3001(modelElement,
				crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_Dependence_3002(modelElement,
						crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_Association_3003(modelElement,
						crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Extension_3004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ImplicitCall_3005(modelElement,
				crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Implementation_3006(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getMethod_1006IncomingLinks(View view) {
		Method modelElement = (Method) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet()
				.getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_ExplicitCall_3001(modelElement,
				crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_Dependence_3002(modelElement,
						crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_Association_3003(modelElement,
						crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Extension_3004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ImplicitCall_3005(modelElement,
				crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Implementation_3006(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getField_1007IncomingLinks(View view) {
		Field modelElement = (Field) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet()
				.getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_ExplicitCall_3001(modelElement,
				crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_Dependence_3002(modelElement,
						crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_Association_3003(modelElement,
						crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Extension_3004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ImplicitCall_3005(modelElement,
				crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Implementation_3006(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPointcut_1008IncomingLinks(View view) {
		Pointcut modelElement = (Pointcut) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet()
				.getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_ExplicitCall_3001(modelElement,
				crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_Dependence_3002(modelElement,
						crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_Association_3003(modelElement,
						crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Extension_3004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ImplicitCall_3005(modelElement,
				crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Implementation_3006(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAspect_2001IncomingLinks(View view) {
		Aspect modelElement = (Aspect) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet()
				.getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_ExplicitCall_3001(modelElement,
				crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_Dependence_3002(modelElement,
						crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_Association_3003(modelElement,
						crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Extension_3004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ImplicitCall_3005(modelElement,
				crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Implementation_3006(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPointcut_2002IncomingLinks(View view) {
		Pointcut modelElement = (Pointcut) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet()
				.getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_ExplicitCall_3001(modelElement,
				crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_Dependence_3002(modelElement,
						crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_Association_3003(modelElement,
						crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Extension_3004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ImplicitCall_3005(modelElement,
				crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Implementation_3006(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAdvice_2003IncomingLinks(View view) {
		Advice modelElement = (Advice) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet()
				.getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_ExplicitCall_3001(modelElement,
				crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_Dependence_3002(modelElement,
						crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_Association_3003(modelElement,
						crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Extension_3004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ImplicitCall_3005(modelElement,
				crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Implementation_3006(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getMethod_2004IncomingLinks(View view) {
		Method modelElement = (Method) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet()
				.getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_ExplicitCall_3001(modelElement,
				crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_Dependence_3002(modelElement,
						crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_Association_3003(modelElement,
						crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Extension_3004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ImplicitCall_3005(modelElement,
				crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Implementation_3006(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getField_2005IncomingLinks(View view) {
		Field modelElement = (Field) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet()
				.getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_ExplicitCall_3001(modelElement,
				crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_Dependence_3002(modelElement,
						crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_Association_3003(modelElement,
						crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Extension_3004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ImplicitCall_3005(modelElement,
				crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Implementation_3006(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInterface_2006IncomingLinks(View view) {
		Interface modelElement = (Interface) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet()
				.getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_ExplicitCall_3001(modelElement,
				crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_Dependence_3002(modelElement,
						crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_Association_3003(modelElement,
						crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Extension_3004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ImplicitCall_3005(modelElement,
				crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Implementation_3006(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getClass_2007IncomingLinks(View view) {
		Class modelElement = (Class) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet()
				.getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_ExplicitCall_3001(modelElement,
				crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_Dependence_3002(modelElement,
						crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_Association_3003(modelElement,
						crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Extension_3004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ImplicitCall_3005(modelElement,
				crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Implementation_3006(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAspect_2008IncomingLinks(View view) {
		Aspect modelElement = (Aspect) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet()
				.getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_ExplicitCall_3001(modelElement,
				crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_Dependence_3002(modelElement,
						crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_Association_3003(modelElement,
						crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Extension_3004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ImplicitCall_3005(modelElement,
				crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Implementation_3006(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getClass_2009IncomingLinks(View view) {
		Class modelElement = (Class) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet()
				.getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_ExplicitCall_3001(modelElement,
				crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_Dependence_3002(modelElement,
						crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_Association_3003(modelElement,
						crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Extension_3004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ImplicitCall_3005(modelElement,
				crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Implementation_3006(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInterface_2010IncomingLinks(View view) {
		Interface modelElement = (Interface) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet()
				.getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_ExplicitCall_3001(modelElement,
				crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_Dependence_3002(modelElement,
						crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_Association_3003(modelElement,
						crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Extension_3004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ImplicitCall_3005(modelElement,
				crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Implementation_3006(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPackage_2011IncomingLinks(View view) {
		Package modelElement = (Package) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet()
				.getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_ExplicitCall_3001(modelElement,
				crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_Dependence_3002(modelElement,
						crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_Association_3003(modelElement,
						crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Extension_3004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ImplicitCall_3005(modelElement,
				crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Implementation_3006(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getExplicitCall_3001IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDependence_3002IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAssociation_3003IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExtension_3004IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getImplicitCall_3005IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getImplementation_3006IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPackage_1001OutgoingLinks(View view) {
		Package modelElement = (Package) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_ExplicitCall_3001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Dependence_3002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_3003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Extension_3004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ImplicitCall_3005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Implementation_3006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAspect_1002OutgoingLinks(View view) {
		Aspect modelElement = (Aspect) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_ExplicitCall_3001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Dependence_3002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_3003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Extension_3004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ImplicitCall_3005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Implementation_3006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getClass_1003OutgoingLinks(View view) {
		Class modelElement = (Class) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_ExplicitCall_3001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Dependence_3002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_3003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Extension_3004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ImplicitCall_3005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Implementation_3006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInterface_1004OutgoingLinks(View view) {
		Interface modelElement = (Interface) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_ExplicitCall_3001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Dependence_3002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_3003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Extension_3004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ImplicitCall_3005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Implementation_3006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAdvice_1005OutgoingLinks(View view) {
		Advice modelElement = (Advice) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_ExplicitCall_3001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Dependence_3002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_3003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Extension_3004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ImplicitCall_3005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Implementation_3006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getMethod_1006OutgoingLinks(View view) {
		Method modelElement = (Method) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_ExplicitCall_3001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Dependence_3002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_3003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Extension_3004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ImplicitCall_3005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Implementation_3006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getField_1007OutgoingLinks(View view) {
		Field modelElement = (Field) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_ExplicitCall_3001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Dependence_3002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_3003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Extension_3004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ImplicitCall_3005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Implementation_3006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPointcut_1008OutgoingLinks(View view) {
		Pointcut modelElement = (Pointcut) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_ExplicitCall_3001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Dependence_3002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_3003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Extension_3004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ImplicitCall_3005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Implementation_3006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAspect_2001OutgoingLinks(View view) {
		Aspect modelElement = (Aspect) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_ExplicitCall_3001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Dependence_3002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_3003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Extension_3004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ImplicitCall_3005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Implementation_3006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPointcut_2002OutgoingLinks(View view) {
		Pointcut modelElement = (Pointcut) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_ExplicitCall_3001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Dependence_3002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_3003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Extension_3004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ImplicitCall_3005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Implementation_3006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAdvice_2003OutgoingLinks(View view) {
		Advice modelElement = (Advice) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_ExplicitCall_3001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Dependence_3002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_3003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Extension_3004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ImplicitCall_3005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Implementation_3006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getMethod_2004OutgoingLinks(View view) {
		Method modelElement = (Method) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_ExplicitCall_3001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Dependence_3002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_3003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Extension_3004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ImplicitCall_3005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Implementation_3006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getField_2005OutgoingLinks(View view) {
		Field modelElement = (Field) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_ExplicitCall_3001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Dependence_3002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_3003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Extension_3004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ImplicitCall_3005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Implementation_3006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInterface_2006OutgoingLinks(View view) {
		Interface modelElement = (Interface) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_ExplicitCall_3001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Dependence_3002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_3003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Extension_3004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ImplicitCall_3005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Implementation_3006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getClass_2007OutgoingLinks(View view) {
		Class modelElement = (Class) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_ExplicitCall_3001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Dependence_3002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_3003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Extension_3004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ImplicitCall_3005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Implementation_3006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAspect_2008OutgoingLinks(View view) {
		Aspect modelElement = (Aspect) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_ExplicitCall_3001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Dependence_3002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_3003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Extension_3004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ImplicitCall_3005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Implementation_3006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getClass_2009OutgoingLinks(View view) {
		Class modelElement = (Class) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_ExplicitCall_3001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Dependence_3002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_3003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Extension_3004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ImplicitCall_3005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Implementation_3006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInterface_2010OutgoingLinks(View view) {
		Interface modelElement = (Interface) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_ExplicitCall_3001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Dependence_3002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_3003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Extension_3004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ImplicitCall_3005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Implementation_3006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPackage_2011OutgoingLinks(View view) {
		Package modelElement = (Package) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_ExplicitCall_3001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Dependence_3002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_3003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Extension_3004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ImplicitCall_3005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Implementation_3006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getExplicitCall_3001OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDependence_3002OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAssociation_3003OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExtension_3004OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getImplicitCall_3005OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getImplementation_3006OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_ExplicitCall_3001(Node container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getOutEdgesList().iterator(); links.hasNext();) {
			Object linkObject = links.next();
			if (false == linkObject instanceof ExplicitCall) {
				continue;
			}
			ExplicitCall link = (ExplicitCall) linkObject;
			if (ExplicitCallEditPart.VISUAL_ID != CallGraphVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Node dst = link.getTarget();
			Node src = link.getSource();
			result.add(new CallGraphLinkDescriptor(src, dst, link,
					CallGraphElementTypes.ExplicitCall_3001, ExplicitCallEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_Dependence_3002(Node container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getOutEdgesList().iterator(); links.hasNext();) {
			Object linkObject = links.next();
			if (false == linkObject instanceof Dependence) {
				continue;
			}
			Dependence link = (Dependence) linkObject;
			if (DependenceEditPart.VISUAL_ID != CallGraphVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Node dst = link.getTarget();
			Node src = link.getSource();
			result.add(new CallGraphLinkDescriptor(src, dst, link,
					CallGraphElementTypes.Dependence_3002, DependenceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_Association_3003(Node container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getOutEdgesList().iterator(); links.hasNext();) {
			Object linkObject = links.next();
			if (false == linkObject instanceof Association) {
				continue;
			}
			Association link = (Association) linkObject;
			if (AssociationEditPart.VISUAL_ID != CallGraphVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Node dst = link.getTarget();
			Node src = link.getSource();
			result.add(new CallGraphLinkDescriptor(src, dst, link,
					CallGraphElementTypes.Association_3003, AssociationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_Extension_3004(Node container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getOutEdgesList().iterator(); links.hasNext();) {
			Object linkObject = links.next();
			if (false == linkObject instanceof Extension) {
				continue;
			}
			Extension link = (Extension) linkObject;
			if (ExtensionEditPart.VISUAL_ID != CallGraphVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Node dst = link.getTarget();
			Node src = link.getSource();
			result.add(new CallGraphLinkDescriptor(src, dst, link,
					CallGraphElementTypes.Extension_3004, ExtensionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_ImplicitCall_3005(Node container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getOutEdgesList().iterator(); links.hasNext();) {
			Object linkObject = links.next();
			if (false == linkObject instanceof ImplicitCall) {
				continue;
			}
			ImplicitCall link = (ImplicitCall) linkObject;
			if (ImplicitCallEditPart.VISUAL_ID != CallGraphVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Node dst = link.getTarget();
			Node src = link.getSource();
			result.add(new CallGraphLinkDescriptor(src, dst, link,
					CallGraphElementTypes.ImplicitCall_3005, ImplicitCallEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_Implementation_3006(Node container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getOutEdgesList().iterator(); links.hasNext();) {
			Object linkObject = links.next();
			if (false == linkObject instanceof Implementation) {
				continue;
			}
			Implementation link = (Implementation) linkObject;
			if (ImplementationEditPart.VISUAL_ID != CallGraphVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Node dst = link.getTarget();
			Node src = link.getSource();
			result.add(new CallGraphLinkDescriptor(src, dst, link,
					CallGraphElementTypes.Implementation_3006, ImplementationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_ExplicitCall_3001(Node target,
			Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it.next();
			if (setting.getEStructuralFeature() != CallGraphPackage.eINSTANCE.getEdge_Target()
					|| false == setting.getEObject() instanceof ExplicitCall) {
				continue;
			}
			ExplicitCall link = (ExplicitCall) setting.getEObject();
			if (ExplicitCallEditPart.VISUAL_ID != CallGraphVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Node src = link.getSource();
			result.add(new CallGraphLinkDescriptor(src, target, link,
					CallGraphElementTypes.ExplicitCall_3001, ExplicitCallEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_Dependence_3002(Node target,
			Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it.next();
			if (setting.getEStructuralFeature() != CallGraphPackage.eINSTANCE.getEdge_Target()
					|| false == setting.getEObject() instanceof Dependence) {
				continue;
			}
			Dependence link = (Dependence) setting.getEObject();
			if (DependenceEditPart.VISUAL_ID != CallGraphVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Node src = link.getSource();
			result.add(new CallGraphLinkDescriptor(src, target, link,
					CallGraphElementTypes.Dependence_3002, DependenceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_Association_3003(Node target,
			Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it.next();
			if (setting.getEStructuralFeature() != CallGraphPackage.eINSTANCE.getEdge_Target()
					|| false == setting.getEObject() instanceof Association) {
				continue;
			}
			Association link = (Association) setting.getEObject();
			if (AssociationEditPart.VISUAL_ID != CallGraphVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Node src = link.getSource();
			result.add(new CallGraphLinkDescriptor(src, target, link,
					CallGraphElementTypes.Association_3003, AssociationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_Extension_3004(Node target,
			Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it.next();
			if (setting.getEStructuralFeature() != CallGraphPackage.eINSTANCE.getEdge_Target()
					|| false == setting.getEObject() instanceof Extension) {
				continue;
			}
			Extension link = (Extension) setting.getEObject();
			if (ExtensionEditPart.VISUAL_ID != CallGraphVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Node src = link.getSource();
			result.add(new CallGraphLinkDescriptor(src, target, link,
					CallGraphElementTypes.Extension_3004, ExtensionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_ImplicitCall_3005(Node target,
			Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it.next();
			if (setting.getEStructuralFeature() != CallGraphPackage.eINSTANCE.getEdge_Target()
					|| false == setting.getEObject() instanceof ImplicitCall) {
				continue;
			}
			ImplicitCall link = (ImplicitCall) setting.getEObject();
			if (ImplicitCallEditPart.VISUAL_ID != CallGraphVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Node src = link.getSource();
			result.add(new CallGraphLinkDescriptor(src, target, link,
					CallGraphElementTypes.ImplicitCall_3005, ImplicitCallEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_Implementation_3006(Node target,
			Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it.next();
			if (setting.getEStructuralFeature() != CallGraphPackage.eINSTANCE.getEdge_Target()
					|| false == setting.getEObject() instanceof Implementation) {
				continue;
			}
			Implementation link = (Implementation) setting.getEObject();
			if (ImplementationEditPart.VISUAL_ID != CallGraphVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Node src = link.getSource();
			result.add(new CallGraphLinkDescriptor(src, target, link,
					CallGraphElementTypes.Implementation_3006, ImplementationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_ExplicitCall_3001(Node source) {
		Node container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Node) {
				container = (Node) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getOutEdgesList().iterator(); links.hasNext();) {
			Object linkObject = links.next();
			if (false == linkObject instanceof ExplicitCall) {
				continue;
			}
			ExplicitCall link = (ExplicitCall) linkObject;
			if (ExplicitCallEditPart.VISUAL_ID != CallGraphVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Node dst = link.getTarget();
			Node src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new CallGraphLinkDescriptor(src, dst, link,
					CallGraphElementTypes.ExplicitCall_3001, ExplicitCallEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_Dependence_3002(Node source) {
		Node container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Node) {
				container = (Node) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getOutEdgesList().iterator(); links.hasNext();) {
			Object linkObject = links.next();
			if (false == linkObject instanceof Dependence) {
				continue;
			}
			Dependence link = (Dependence) linkObject;
			if (DependenceEditPart.VISUAL_ID != CallGraphVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Node dst = link.getTarget();
			Node src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new CallGraphLinkDescriptor(src, dst, link,
					CallGraphElementTypes.Dependence_3002, DependenceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_Association_3003(Node source) {
		Node container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Node) {
				container = (Node) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getOutEdgesList().iterator(); links.hasNext();) {
			Object linkObject = links.next();
			if (false == linkObject instanceof Association) {
				continue;
			}
			Association link = (Association) linkObject;
			if (AssociationEditPart.VISUAL_ID != CallGraphVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Node dst = link.getTarget();
			Node src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new CallGraphLinkDescriptor(src, dst, link,
					CallGraphElementTypes.Association_3003, AssociationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_Extension_3004(Node source) {
		Node container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Node) {
				container = (Node) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getOutEdgesList().iterator(); links.hasNext();) {
			Object linkObject = links.next();
			if (false == linkObject instanceof Extension) {
				continue;
			}
			Extension link = (Extension) linkObject;
			if (ExtensionEditPart.VISUAL_ID != CallGraphVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Node dst = link.getTarget();
			Node src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new CallGraphLinkDescriptor(src, dst, link,
					CallGraphElementTypes.Extension_3004, ExtensionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_ImplicitCall_3005(Node source) {
		Node container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Node) {
				container = (Node) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getOutEdgesList().iterator(); links.hasNext();) {
			Object linkObject = links.next();
			if (false == linkObject instanceof ImplicitCall) {
				continue;
			}
			ImplicitCall link = (ImplicitCall) linkObject;
			if (ImplicitCallEditPart.VISUAL_ID != CallGraphVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Node dst = link.getTarget();
			Node src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new CallGraphLinkDescriptor(src, dst, link,
					CallGraphElementTypes.ImplicitCall_3005, ImplicitCallEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_Implementation_3006(Node source) {
		Node container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Node) {
				container = (Node) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getOutEdgesList().iterator(); links.hasNext();) {
			Object linkObject = links.next();
			if (false == linkObject instanceof Implementation) {
				continue;
			}
			Implementation link = (Implementation) linkObject;
			if (ImplementationEditPart.VISUAL_ID != CallGraphVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Node dst = link.getTarget();
			Node src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new CallGraphLinkDescriptor(src, dst, link,
					CallGraphElementTypes.Implementation_3006, ImplementationEditPart.VISUAL_ID));
		}
		return result;
	}

}
