package it.unisannio.rcost.callgraphanalyzer.diagram.providers;

import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.Advice2EditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.AdviceEditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.Aspect2EditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.AspectBodyCompartment2EditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.AspectBodyCompartment3EditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.AspectBodyCompartmentEditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.AspectEditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.AspectName2EditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.AspectName3EditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.AspectNameEditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.AssociationEditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.Class2EditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.ClassBodyCompartment2EditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.ClassBodyCompartment3EditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.ClassBodyCompartmentEditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.ClassEditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.ClassName2EditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.ClassName3EditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.ClassNameEditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.DependenceEditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.ExplicitCallEditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.ExplicitCallGroupIdEditPart;
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
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.InterfaceName2EditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.InterfaceName3EditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.InterfaceNameEditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.Method2EditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.Method3EditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.MethodEditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.Package2EditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.Package3EditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.PackageBodyCompartment2EditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.PackageBodyCompartmentEditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.PackageEditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.PackageName2EditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.PackageNameEditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.Pointcut2EditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.PointcutEditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.part.CallGraphVisualIDRegistry;
import it.unisannio.rcost.callgraphanalyzer.diagram.view.factories.Advice2ViewFactory;
import it.unisannio.rcost.callgraphanalyzer.diagram.view.factories.AdviceViewFactory;
import it.unisannio.rcost.callgraphanalyzer.diagram.view.factories.Aspect2ViewFactory;
import it.unisannio.rcost.callgraphanalyzer.diagram.view.factories.AspectBodyCompartment2ViewFactory;
import it.unisannio.rcost.callgraphanalyzer.diagram.view.factories.AspectBodyCompartment3ViewFactory;
import it.unisannio.rcost.callgraphanalyzer.diagram.view.factories.AspectBodyCompartmentViewFactory;
import it.unisannio.rcost.callgraphanalyzer.diagram.view.factories.AspectName2ViewFactory;
import it.unisannio.rcost.callgraphanalyzer.diagram.view.factories.AspectName3ViewFactory;
import it.unisannio.rcost.callgraphanalyzer.diagram.view.factories.AspectNameViewFactory;
import it.unisannio.rcost.callgraphanalyzer.diagram.view.factories.AspectViewFactory;
import it.unisannio.rcost.callgraphanalyzer.diagram.view.factories.AssociationViewFactory;
import it.unisannio.rcost.callgraphanalyzer.diagram.view.factories.Class2ViewFactory;
import it.unisannio.rcost.callgraphanalyzer.diagram.view.factories.ClassBodyCompartment2ViewFactory;
import it.unisannio.rcost.callgraphanalyzer.diagram.view.factories.ClassBodyCompartment3ViewFactory;
import it.unisannio.rcost.callgraphanalyzer.diagram.view.factories.ClassBodyCompartmentViewFactory;
import it.unisannio.rcost.callgraphanalyzer.diagram.view.factories.ClassName2ViewFactory;
import it.unisannio.rcost.callgraphanalyzer.diagram.view.factories.ClassName3ViewFactory;
import it.unisannio.rcost.callgraphanalyzer.diagram.view.factories.ClassNameViewFactory;
import it.unisannio.rcost.callgraphanalyzer.diagram.view.factories.ClassViewFactory;
import it.unisannio.rcost.callgraphanalyzer.diagram.view.factories.DependenceViewFactory;
import it.unisannio.rcost.callgraphanalyzer.diagram.view.factories.ExplicitCallGroupIdViewFactory;
import it.unisannio.rcost.callgraphanalyzer.diagram.view.factories.ExplicitCallViewFactory;
import it.unisannio.rcost.callgraphanalyzer.diagram.view.factories.ExtensionViewFactory;
import it.unisannio.rcost.callgraphanalyzer.diagram.view.factories.Field2ViewFactory;
import it.unisannio.rcost.callgraphanalyzer.diagram.view.factories.FieldViewFactory;
import it.unisannio.rcost.callgraphanalyzer.diagram.view.factories.GraphViewFactory;
import it.unisannio.rcost.callgraphanalyzer.diagram.view.factories.ImplementationViewFactory;
import it.unisannio.rcost.callgraphanalyzer.diagram.view.factories.ImplicitCallViewFactory;
import it.unisannio.rcost.callgraphanalyzer.diagram.view.factories.Interface2ViewFactory;
import it.unisannio.rcost.callgraphanalyzer.diagram.view.factories.Interface3ViewFactory;
import it.unisannio.rcost.callgraphanalyzer.diagram.view.factories.InterfaceBodyCompartment2ViewFactory;
import it.unisannio.rcost.callgraphanalyzer.diagram.view.factories.InterfaceBodyCompartment3ViewFactory;
import it.unisannio.rcost.callgraphanalyzer.diagram.view.factories.InterfaceBodyCompartmentViewFactory;
import it.unisannio.rcost.callgraphanalyzer.diagram.view.factories.InterfaceName2ViewFactory;
import it.unisannio.rcost.callgraphanalyzer.diagram.view.factories.InterfaceName3ViewFactory;
import it.unisannio.rcost.callgraphanalyzer.diagram.view.factories.InterfaceNameViewFactory;
import it.unisannio.rcost.callgraphanalyzer.diagram.view.factories.InterfaceViewFactory;
import it.unisannio.rcost.callgraphanalyzer.diagram.view.factories.Method2ViewFactory;
import it.unisannio.rcost.callgraphanalyzer.diagram.view.factories.Method3ViewFactory;
import it.unisannio.rcost.callgraphanalyzer.diagram.view.factories.MethodViewFactory;
import it.unisannio.rcost.callgraphanalyzer.diagram.view.factories.Package2ViewFactory;
import it.unisannio.rcost.callgraphanalyzer.diagram.view.factories.Package3ViewFactory;
import it.unisannio.rcost.callgraphanalyzer.diagram.view.factories.PackageBodyCompartment2ViewFactory;
import it.unisannio.rcost.callgraphanalyzer.diagram.view.factories.PackageBodyCompartmentViewFactory;
import it.unisannio.rcost.callgraphanalyzer.diagram.view.factories.PackageName2ViewFactory;
import it.unisannio.rcost.callgraphanalyzer.diagram.view.factories.PackageNameViewFactory;
import it.unisannio.rcost.callgraphanalyzer.diagram.view.factories.PackageViewFactory;
import it.unisannio.rcost.callgraphanalyzer.diagram.view.factories.Pointcut2ViewFactory;
import it.unisannio.rcost.callgraphanalyzer.diagram.view.factories.PointcutViewFactory;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.core.providers.AbstractViewProvider;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.IHintedType;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class CallGraphViewProvider extends AbstractViewProvider {

	/**
	 * @generated
	 */
	protected Class getDiagramViewClass(IAdaptable semanticAdapter, String diagramKind) {
		EObject semanticElement = getSemanticElement(semanticAdapter);
		if (GraphEditPart.MODEL_ID.equals(diagramKind)
				&& CallGraphVisualIDRegistry.getDiagramVisualID(semanticElement) != -1) {
			return GraphViewFactory.class;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Class getNodeViewClass(IAdaptable semanticAdapter, View containerView,
			String semanticHint) {
		if (containerView == null) {
			return null;
		}
		IElementType elementType = getSemanticElementType(semanticAdapter);
		EObject domainElement = getSemanticElement(semanticAdapter);
		int visualID;
		if (semanticHint == null) {
			// Semantic hint is not specified. Can be a result of call from CanonicalEditPolicy.
			// In this situation there should be NO elementType, visualID will be determined
			// by VisualIDRegistry.getNodeVisualID() for domainElement.
			if (elementType != null || domainElement == null) {
				return null;
			}
			visualID = CallGraphVisualIDRegistry.getNodeVisualID(containerView, domainElement);
		} else {
			visualID = CallGraphVisualIDRegistry.getVisualID(semanticHint);
			if (elementType != null) {
				// Semantic hint is specified together with element type.
				// Both parameters should describe exactly the same diagram element.
				// In addition we check that visualID returned by VisualIDRegistry.getNodeVisualID() for
				// domainElement (if specified) is the same as in element type.
				if (!CallGraphElementTypes.isKnownElementType(elementType)
						|| (!(elementType instanceof IHintedType))) {
					return null; // foreign element type
				}
				String elementTypeHint = ((IHintedType) elementType).getSemanticHint();
				if (!semanticHint.equals(elementTypeHint)) {
					return null; // if semantic hint is specified it should be the same as in element type
				}
				if (domainElement != null
						&& visualID != CallGraphVisualIDRegistry.getNodeVisualID(containerView,
								domainElement)) {
					return null; // visual id for node EClass should match visual id from element type
				}
			} else {
				// Element type is not specified. Domain element should be present (except pure design elements).
				// This method is called with EObjectAdapter as parameter from:
				//   - ViewService.createNode(View container, EObject eObject, String type, PreferencesHint preferencesHint) 
				//   - generated ViewFactory.decorateView() for parent element
				if (!GraphEditPart.MODEL_ID.equals(CallGraphVisualIDRegistry
						.getModelID(containerView))) {
					return null; // foreign diagram
				}
				switch (visualID) {
				case PackageEditPart.VISUAL_ID:
				case Aspect2EditPart.VISUAL_ID:
				case Pointcut2EditPart.VISUAL_ID:
				case Advice2EditPart.VISUAL_ID:
				case Method2EditPart.VISUAL_ID:
				case Field2EditPart.VISUAL_ID:
				case Class2EditPart.VISUAL_ID:
				case Interface2EditPart.VISUAL_ID:
				case AspectEditPart.VISUAL_ID:
				case ClassEditPart.VISUAL_ID:
				case InterfaceEditPart.VISUAL_ID:
				case AdviceEditPart.VISUAL_ID:
				case MethodEditPart.VISUAL_ID:
				case FieldEditPart.VISUAL_ID:
				case PointcutEditPart.VISUAL_ID:
				case Method3EditPart.VISUAL_ID:
				case Package2EditPart.VISUAL_ID:
				case Interface3EditPart.VISUAL_ID:
				case Package3EditPart.VISUAL_ID:
					if (domainElement == null
							|| visualID != CallGraphVisualIDRegistry.getNodeVisualID(containerView,
									domainElement)) {
						return null; // visual id in semantic hint should match visual id for domain element
					}
					break;
				case PackageNameEditPart.VISUAL_ID:
				case PackageBodyCompartmentEditPart.VISUAL_ID:
					if (PackageEditPart.VISUAL_ID != CallGraphVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case AspectNameEditPart.VISUAL_ID:
				case AspectBodyCompartment3EditPart.VISUAL_ID:
					if (AspectEditPart.VISUAL_ID != CallGraphVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case ClassNameEditPart.VISUAL_ID:
				case ClassBodyCompartment3EditPart.VISUAL_ID:
					if (ClassEditPart.VISUAL_ID != CallGraphVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case InterfaceNameEditPart.VISUAL_ID:
				case InterfaceBodyCompartment3EditPart.VISUAL_ID:
					if (InterfaceEditPart.VISUAL_ID != CallGraphVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case AspectName2EditPart.VISUAL_ID:
				case AspectBodyCompartmentEditPart.VISUAL_ID:
					if (Aspect2EditPart.VISUAL_ID != CallGraphVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case InterfaceName2EditPart.VISUAL_ID:
				case ClassBodyCompartmentEditPart.VISUAL_ID:
					if (Class2EditPart.VISUAL_ID != CallGraphVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case ClassName2EditPart.VISUAL_ID:
				case InterfaceBodyCompartmentEditPart.VISUAL_ID:
					if (Interface2EditPart.VISUAL_ID != CallGraphVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case AspectName3EditPart.VISUAL_ID:
				case PackageBodyCompartment2EditPart.VISUAL_ID:
					if (Method3EditPart.VISUAL_ID != CallGraphVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case ClassName3EditPart.VISUAL_ID:
				case AspectBodyCompartment2EditPart.VISUAL_ID:
					if (Package2EditPart.VISUAL_ID != CallGraphVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case InterfaceName3EditPart.VISUAL_ID:
				case ClassBodyCompartment2EditPart.VISUAL_ID:
					if (Interface3EditPart.VISUAL_ID != CallGraphVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case PackageName2EditPart.VISUAL_ID:
				case InterfaceBodyCompartment2EditPart.VISUAL_ID:
					if (Package3EditPart.VISUAL_ID != CallGraphVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case ExplicitCallGroupIdEditPart.VISUAL_ID:
					if (ExplicitCallEditPart.VISUAL_ID != CallGraphVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				default:
					return null;
				}
			}
		}
		return getNodeViewClass(containerView, visualID);
	}

	/**
	 * @generated
	 */
	protected Class getNodeViewClass(View containerView, int visualID) {
		if (containerView == null
				|| !CallGraphVisualIDRegistry.canCreateNode(containerView, visualID)) {
			return null;
		}
		switch (visualID) {
		case PackageEditPart.VISUAL_ID:
			return PackageViewFactory.class;
		case PackageNameEditPart.VISUAL_ID:
			return PackageNameViewFactory.class;
		case AspectEditPart.VISUAL_ID:
			return AspectViewFactory.class;
		case AspectNameEditPart.VISUAL_ID:
			return AspectNameViewFactory.class;
		case ClassEditPart.VISUAL_ID:
			return ClassViewFactory.class;
		case ClassNameEditPart.VISUAL_ID:
			return ClassNameViewFactory.class;
		case InterfaceEditPart.VISUAL_ID:
			return InterfaceViewFactory.class;
		case InterfaceNameEditPart.VISUAL_ID:
			return InterfaceNameViewFactory.class;
		case AdviceEditPart.VISUAL_ID:
			return AdviceViewFactory.class;
		case MethodEditPart.VISUAL_ID:
			return MethodViewFactory.class;
		case FieldEditPart.VISUAL_ID:
			return FieldViewFactory.class;
		case PointcutEditPart.VISUAL_ID:
			return PointcutViewFactory.class;
		case Aspect2EditPart.VISUAL_ID:
			return Aspect2ViewFactory.class;
		case AspectName2EditPart.VISUAL_ID:
			return AspectName2ViewFactory.class;
		case Pointcut2EditPart.VISUAL_ID:
			return Pointcut2ViewFactory.class;
		case Advice2EditPart.VISUAL_ID:
			return Advice2ViewFactory.class;
		case Method2EditPart.VISUAL_ID:
			return Method2ViewFactory.class;
		case Field2EditPart.VISUAL_ID:
			return Field2ViewFactory.class;
		case Class2EditPart.VISUAL_ID:
			return Class2ViewFactory.class;
		case InterfaceName2EditPart.VISUAL_ID:
			return InterfaceName2ViewFactory.class;
		case Interface2EditPart.VISUAL_ID:
			return Interface2ViewFactory.class;
		case ClassName2EditPart.VISUAL_ID:
			return ClassName2ViewFactory.class;
		case Method3EditPart.VISUAL_ID:
			return Method3ViewFactory.class;
		case AspectName3EditPart.VISUAL_ID:
			return AspectName3ViewFactory.class;
		case Package2EditPart.VISUAL_ID:
			return Package2ViewFactory.class;
		case ClassName3EditPart.VISUAL_ID:
			return ClassName3ViewFactory.class;
		case Interface3EditPart.VISUAL_ID:
			return Interface3ViewFactory.class;
		case InterfaceName3EditPart.VISUAL_ID:
			return InterfaceName3ViewFactory.class;
		case Package3EditPart.VISUAL_ID:
			return Package3ViewFactory.class;
		case PackageName2EditPart.VISUAL_ID:
			return PackageName2ViewFactory.class;
		case PackageBodyCompartmentEditPart.VISUAL_ID:
			return PackageBodyCompartmentViewFactory.class;
		case AspectBodyCompartmentEditPart.VISUAL_ID:
			return AspectBodyCompartmentViewFactory.class;
		case ClassBodyCompartmentEditPart.VISUAL_ID:
			return ClassBodyCompartmentViewFactory.class;
		case InterfaceBodyCompartmentEditPart.VISUAL_ID:
			return InterfaceBodyCompartmentViewFactory.class;
		case PackageBodyCompartment2EditPart.VISUAL_ID:
			return PackageBodyCompartment2ViewFactory.class;
		case AspectBodyCompartment2EditPart.VISUAL_ID:
			return AspectBodyCompartment2ViewFactory.class;
		case ClassBodyCompartment2EditPart.VISUAL_ID:
			return ClassBodyCompartment2ViewFactory.class;
		case InterfaceBodyCompartment2EditPart.VISUAL_ID:
			return InterfaceBodyCompartment2ViewFactory.class;
		case AspectBodyCompartment3EditPart.VISUAL_ID:
			return AspectBodyCompartment3ViewFactory.class;
		case ClassBodyCompartment3EditPart.VISUAL_ID:
			return ClassBodyCompartment3ViewFactory.class;
		case InterfaceBodyCompartment3EditPart.VISUAL_ID:
			return InterfaceBodyCompartment3ViewFactory.class;
		case ExplicitCallGroupIdEditPart.VISUAL_ID:
			return ExplicitCallGroupIdViewFactory.class;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Class getEdgeViewClass(IAdaptable semanticAdapter, View containerView,
			String semanticHint) {
		IElementType elementType = getSemanticElementType(semanticAdapter);
		if (!CallGraphElementTypes.isKnownElementType(elementType)
				|| (!(elementType instanceof IHintedType))) {
			return null; // foreign element type
		}
		String elementTypeHint = ((IHintedType) elementType).getSemanticHint();
		if (elementTypeHint == null) {
			return null; // our hint is visual id and must be specified
		}
		if (semanticHint != null && !semanticHint.equals(elementTypeHint)) {
			return null; // if semantic hint is specified it should be the same as in element type
		}
		int visualID = CallGraphVisualIDRegistry.getVisualID(elementTypeHint);
		EObject domainElement = getSemanticElement(semanticAdapter);
		if (domainElement != null
				&& visualID != CallGraphVisualIDRegistry.getLinkWithClassVisualID(domainElement)) {
			return null; // visual id for link EClass should match visual id from element type
		}
		return getEdgeViewClass(visualID);
	}

	/**
	 * @generated
	 */
	protected Class getEdgeViewClass(int visualID) {
		switch (visualID) {
		case ExplicitCallEditPart.VISUAL_ID:
			return ExplicitCallViewFactory.class;
		case DependenceEditPart.VISUAL_ID:
			return DependenceViewFactory.class;
		case AssociationEditPart.VISUAL_ID:
			return AssociationViewFactory.class;
		case ExtensionEditPart.VISUAL_ID:
			return ExtensionViewFactory.class;
		case ImplicitCallEditPart.VISUAL_ID:
			return ImplicitCallViewFactory.class;
		case ImplementationEditPart.VISUAL_ID:
			return ImplementationViewFactory.class;
		}
		return null;
	}

	/**
	 * @generated
	 */
	private IElementType getSemanticElementType(IAdaptable semanticAdapter) {
		if (semanticAdapter == null) {
			return null;
		}
		return (IElementType) semanticAdapter.getAdapter(IElementType.class);
	}
}
