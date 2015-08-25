package it.unisannio.rcost.callgraphanalyzer.diagram.navigator;

import it.unisannio.rcost.callgraphanalyzer.Advice;
import it.unisannio.rcost.callgraphanalyzer.Dependence;
import it.unisannio.rcost.callgraphanalyzer.ExplicitCall;
import it.unisannio.rcost.callgraphanalyzer.Field;
import it.unisannio.rcost.callgraphanalyzer.ImplicitCall;
import it.unisannio.rcost.callgraphanalyzer.Method;
import it.unisannio.rcost.callgraphanalyzer.Pointcut;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.Advice2EditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.AdviceEditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.Aspect2EditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.AspectEditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.AspectName2EditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.AspectName3EditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.AspectNameEditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.AssociationEditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.Class2EditPart;
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
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.InterfaceEditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.InterfaceName2EditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.InterfaceName3EditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.InterfaceNameEditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.Method2EditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.Method3EditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.MethodEditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.Package2EditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.Package3EditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.PackageEditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.PackageName2EditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.PackageNameEditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.Pointcut2EditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.PointcutEditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.part.CallGraphDiagramEditorPlugin;
import it.unisannio.rcost.callgraphanalyzer.diagram.part.CallGraphVisualIDRegistry;
import it.unisannio.rcost.callgraphanalyzer.diagram.providers.CallGraphElementTypes;
import it.unisannio.rcost.callgraphanalyzer.diagram.providers.CallGraphParserProvider;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

/**
 * @generated
 */
public class CallGraphNavigatorLabelProvider extends LabelProvider implements ICommonLabelProvider,
		ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		CallGraphDiagramEditorPlugin.getInstance().getImageRegistry().put(
				"Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		CallGraphDiagramEditorPlugin.getInstance().getImageRegistry().put(
				"Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof CallGraphNavigatorItem
				&& !isOwnView(((CallGraphNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof CallGraphNavigatorGroup) {
			CallGraphNavigatorGroup group = (CallGraphNavigatorGroup) element;
			return CallGraphDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof CallGraphNavigatorItem) {
			CallGraphNavigatorItem navigatorItem = (CallGraphNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (CallGraphVisualIDRegistry.getVisualID(view)) {
		case GraphEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?callgraphanalyzer?Graph", CallGraphElementTypes.Graph_79); //$NON-NLS-1$
		case PackageEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?callgraphanalyzer?Package", CallGraphElementTypes.Package_1001); //$NON-NLS-1$
		case AspectEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?callgraphanalyzer?Aspect", CallGraphElementTypes.Aspect_1002); //$NON-NLS-1$
		case ClassEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?callgraphanalyzer?Class", CallGraphElementTypes.Class_1003); //$NON-NLS-1$
		case InterfaceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?callgraphanalyzer?Interface", CallGraphElementTypes.Interface_1004); //$NON-NLS-1$
		case AdviceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?callgraphanalyzer?Advice", CallGraphElementTypes.Advice_1005); //$NON-NLS-1$
		case MethodEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?callgraphanalyzer?Method", CallGraphElementTypes.Method_1006); //$NON-NLS-1$
		case FieldEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?callgraphanalyzer?Field", CallGraphElementTypes.Field_1007); //$NON-NLS-1$
		case PointcutEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?callgraphanalyzer?Pointcut", CallGraphElementTypes.Pointcut_1008); //$NON-NLS-1$
		case Aspect2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?callgraphanalyzer?Aspect", CallGraphElementTypes.Aspect_2001); //$NON-NLS-1$
		case Pointcut2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?callgraphanalyzer?Pointcut", CallGraphElementTypes.Pointcut_2002); //$NON-NLS-1$
		case Advice2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?callgraphanalyzer?Advice", CallGraphElementTypes.Advice_2003); //$NON-NLS-1$
		case Method2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?callgraphanalyzer?Method", CallGraphElementTypes.Method_2004); //$NON-NLS-1$
		case Field2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?callgraphanalyzer?Field", CallGraphElementTypes.Field_2005); //$NON-NLS-1$
		case Class2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?callgraphanalyzer?Interface", CallGraphElementTypes.Interface_2006); //$NON-NLS-1$
		case Interface2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?callgraphanalyzer?Class", CallGraphElementTypes.Class_2007); //$NON-NLS-1$
		case Method3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?callgraphanalyzer?Aspect", CallGraphElementTypes.Aspect_2008); //$NON-NLS-1$
		case Package2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?callgraphanalyzer?Class", CallGraphElementTypes.Class_2009); //$NON-NLS-1$
		case Interface3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?callgraphanalyzer?Interface", CallGraphElementTypes.Interface_2010); //$NON-NLS-1$
		case Package3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?callgraphanalyzer?Package", CallGraphElementTypes.Package_2011); //$NON-NLS-1$
		case ExplicitCallEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?callgraphanalyzer?ExplicitCall", CallGraphElementTypes.ExplicitCall_3001); //$NON-NLS-1$
		case DependenceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?callgraphanalyzer?Dependence", CallGraphElementTypes.Dependence_3002); //$NON-NLS-1$
		case AssociationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?callgraphanalyzer?Association", CallGraphElementTypes.Association_3003); //$NON-NLS-1$
		case ExtensionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?callgraphanalyzer?Extension", CallGraphElementTypes.Extension_3004); //$NON-NLS-1$
		case ImplicitCallEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?callgraphanalyzer?ImplicitCall", CallGraphElementTypes.ImplicitCall_3005); //$NON-NLS-1$
		case ImplementationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?callgraphanalyzer?Implementation", CallGraphElementTypes.Implementation_3006); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = CallGraphDiagramEditorPlugin.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& CallGraphElementTypes.isKnownElementType(elementType)) {
			image = CallGraphElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof CallGraphNavigatorGroup) {
			CallGraphNavigatorGroup group = (CallGraphNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof CallGraphNavigatorItem) {
			CallGraphNavigatorItem navigatorItem = (CallGraphNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (CallGraphVisualIDRegistry.getVisualID(view)) {
		case GraphEditPart.VISUAL_ID:
			return getGraph_79Text(view);
		case PackageEditPart.VISUAL_ID:
			return getPackage_1001Text(view);
		case AspectEditPart.VISUAL_ID:
			return getAspect_1002Text(view);
		case ClassEditPart.VISUAL_ID:
			return getClass_1003Text(view);
		case InterfaceEditPart.VISUAL_ID:
			return getInterface_1004Text(view);
		case AdviceEditPart.VISUAL_ID:
			return getAdvice_1005Text(view);
		case MethodEditPart.VISUAL_ID:
			return getMethod_1006Text(view);
		case FieldEditPart.VISUAL_ID:
			return getField_1007Text(view);
		case PointcutEditPart.VISUAL_ID:
			return getPointcut_1008Text(view);
		case Aspect2EditPart.VISUAL_ID:
			return getAspect_2001Text(view);
		case Pointcut2EditPart.VISUAL_ID:
			return getPointcut_2002Text(view);
		case Advice2EditPart.VISUAL_ID:
			return getAdvice_2003Text(view);
		case Method2EditPart.VISUAL_ID:
			return getMethod_2004Text(view);
		case Field2EditPart.VISUAL_ID:
			return getField_2005Text(view);
		case Class2EditPart.VISUAL_ID:
			return getInterface_2006Text(view);
		case Interface2EditPart.VISUAL_ID:
			return getClass_2007Text(view);
		case Method3EditPart.VISUAL_ID:
			return getAspect_2008Text(view);
		case Package2EditPart.VISUAL_ID:
			return getClass_2009Text(view);
		case Interface3EditPart.VISUAL_ID:
			return getInterface_2010Text(view);
		case Package3EditPart.VISUAL_ID:
			return getPackage_2011Text(view);
		case ExplicitCallEditPart.VISUAL_ID:
			return getExplicitCall_3001Text(view);
		case DependenceEditPart.VISUAL_ID:
			return getDependence_3002Text(view);
		case AssociationEditPart.VISUAL_ID:
			return getAssociation_3003Text(view);
		case ExtensionEditPart.VISUAL_ID:
			return getExtension_3004Text(view);
		case ImplicitCallEditPart.VISUAL_ID:
			return getImplicitCall_3005Text(view);
		case ImplementationEditPart.VISUAL_ID:
			return getImplementation_3006Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getGraph_79Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getPackage_1001Text(View view) {
		IAdaptable hintAdapter = new CallGraphParserProvider.HintAdapter(
				CallGraphElementTypes.Package_1001, (view.getElement() != null ? view.getElement()
						: view), CallGraphVisualIDRegistry.getType(PackageNameEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE.intValue());
		} else {
			CallGraphDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 4008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getAspect_1002Text(View view) {
		IAdaptable hintAdapter = new CallGraphParserProvider.HintAdapter(
				CallGraphElementTypes.Aspect_1002, (view.getElement() != null ? view.getElement()
						: view), CallGraphVisualIDRegistry.getType(AspectNameEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE.intValue());
		} else {
			CallGraphDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 4009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getClass_1003Text(View view) {
		IAdaptable hintAdapter = new CallGraphParserProvider.HintAdapter(
				CallGraphElementTypes.Class_1003, (view.getElement() != null ? view.getElement()
						: view), CallGraphVisualIDRegistry.getType(ClassNameEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE.intValue());
		} else {
			CallGraphDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 4010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getInterface_1004Text(View view) {
		IAdaptable hintAdapter = new CallGraphParserProvider.HintAdapter(
				CallGraphElementTypes.Interface_1004, (view.getElement() != null ? view
						.getElement() : view), CallGraphVisualIDRegistry
						.getType(InterfaceNameEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE.intValue());
		} else {
			CallGraphDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 4011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getAdvice_1005Text(View view) {
		Advice domainModelElement = (Advice) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			CallGraphDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 1005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMethod_1006Text(View view) {
		Method domainModelElement = (Method) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			CallGraphDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 1006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getField_1007Text(View view) {
		Field domainModelElement = (Field) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			CallGraphDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 1007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPointcut_1008Text(View view) {
		Pointcut domainModelElement = (Pointcut) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			CallGraphDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 1008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAspect_2001Text(View view) {
		IAdaptable hintAdapter = new CallGraphParserProvider.HintAdapter(
				CallGraphElementTypes.Aspect_2001, (view.getElement() != null ? view.getElement()
						: view), CallGraphVisualIDRegistry.getType(AspectName2EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE.intValue());
		} else {
			CallGraphDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 4004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getPointcut_2002Text(View view) {
		Pointcut domainModelElement = (Pointcut) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			CallGraphDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAdvice_2003Text(View view) {
		Advice domainModelElement = (Advice) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			CallGraphDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMethod_2004Text(View view) {
		Method domainModelElement = (Method) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			CallGraphDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getField_2005Text(View view) {
		Field domainModelElement = (Field) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			CallGraphDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInterface_2006Text(View view) {
		IAdaptable hintAdapter = new CallGraphParserProvider.HintAdapter(
				CallGraphElementTypes.Interface_2006, (view.getElement() != null ? view
						.getElement() : view), CallGraphVisualIDRegistry
						.getType(InterfaceName2EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE.intValue());
		} else {
			CallGraphDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 4003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getClass_2007Text(View view) {
		IAdaptable hintAdapter = new CallGraphParserProvider.HintAdapter(
				CallGraphElementTypes.Class_2007, (view.getElement() != null ? view.getElement()
						: view), CallGraphVisualIDRegistry.getType(ClassName2EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE.intValue());
		} else {
			CallGraphDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 4002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getAspect_2008Text(View view) {
		IAdaptable hintAdapter = new CallGraphParserProvider.HintAdapter(
				CallGraphElementTypes.Aspect_2008, (view.getElement() != null ? view.getElement()
						: view), CallGraphVisualIDRegistry.getType(AspectName3EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE.intValue());
		} else {
			CallGraphDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 4001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getClass_2009Text(View view) {
		IAdaptable hintAdapter = new CallGraphParserProvider.HintAdapter(
				CallGraphElementTypes.Class_2009, (view.getElement() != null ? view.getElement()
						: view), CallGraphVisualIDRegistry.getType(ClassName3EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE.intValue());
		} else {
			CallGraphDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 4005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getInterface_2010Text(View view) {
		IAdaptable hintAdapter = new CallGraphParserProvider.HintAdapter(
				CallGraphElementTypes.Interface_2010, (view.getElement() != null ? view
						.getElement() : view), CallGraphVisualIDRegistry
						.getType(InterfaceName3EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE.intValue());
		} else {
			CallGraphDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 4006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getPackage_2011Text(View view) {
		IAdaptable hintAdapter = new CallGraphParserProvider.HintAdapter(
				CallGraphElementTypes.Package_2011, (view.getElement() != null ? view.getElement()
						: view), CallGraphVisualIDRegistry.getType(PackageName2EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE.intValue());
		} else {
			CallGraphDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 4007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getExplicitCall_3001Text(View view) {
		IAdaptable hintAdapter = new CallGraphParserProvider.HintAdapter(
				CallGraphElementTypes.ExplicitCall_3001, (view.getElement() != null ? view
						.getElement() : view), CallGraphVisualIDRegistry
						.getType(ExplicitCallGroupIdEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE.intValue());
		} else {
			CallGraphDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 4012); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getDependence_3002Text(View view) {
		Dependence domainModelElement = (Dependence) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.isIsGet());
		} else {
			CallGraphDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAssociation_3003Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getExtension_3004Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getImplicitCall_3005Text(View view) {
		ImplicitCall domainModelElement = (ImplicitCall) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getJoinPointShadowType();
		} else {
			CallGraphDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getImplementation_3006Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$ //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$ //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return GraphEditPart.MODEL_ID.equals(CallGraphVisualIDRegistry.getModelID(view));
	}

}
