package it.unisannio.rcost.callgraphanalyzer.diagram.providers;

import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.AspectBodyCompartment2EditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.AspectBodyCompartment3EditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.AspectBodyCompartmentEditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.ClassBodyCompartment2EditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.ClassBodyCompartment3EditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.ClassBodyCompartmentEditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.GraphEditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.InterfaceBodyCompartment2EditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.InterfaceBodyCompartment3EditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.InterfaceBodyCompartmentEditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.PackageBodyCompartment2EditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.PackageBodyCompartmentEditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.part.CallGraphDiagramEditorPlugin;
import it.unisannio.rcost.callgraphanalyzer.diagram.part.Messages;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.modelingassistant.ModelingAssistantProvider;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;

/**
 * @generated
 */
public class CallGraphModelingAssistantProvider extends ModelingAssistantProvider {

	/**
	 * @generated
	 */
	public List getTypesForPopupBar(IAdaptable host) {
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart instanceof PackageBodyCompartmentEditPart) {
			List types = new ArrayList();
			types.add(CallGraphElementTypes.Aspect_2001);
			types.add(CallGraphElementTypes.Class_2009);
			types.add(CallGraphElementTypes.Interface_2010);
			types.add(CallGraphElementTypes.Package_2011);
			return types;
		}
		if (editPart instanceof AspectBodyCompartmentEditPart) {
			List types = new ArrayList();
			types.add(CallGraphElementTypes.Pointcut_2002);
			types.add(CallGraphElementTypes.Advice_2003);
			types.add(CallGraphElementTypes.Method_2004);
			types.add(CallGraphElementTypes.Field_2005);
			types.add(CallGraphElementTypes.Interface_2006);
			types.add(CallGraphElementTypes.Class_2007);
			types.add(CallGraphElementTypes.Aspect_2008);
			return types;
		}
		if (editPart instanceof ClassBodyCompartmentEditPart) {
			List types = new ArrayList();
			types.add(CallGraphElementTypes.Method_2004);
			types.add(CallGraphElementTypes.Field_2005);
			types.add(CallGraphElementTypes.Class_2007);
			types.add(CallGraphElementTypes.Interface_2006);
			types.add(CallGraphElementTypes.Aspect_2008);
			return types;
		}
		if (editPart instanceof InterfaceBodyCompartmentEditPart) {
			List types = new ArrayList();
			types.add(CallGraphElementTypes.Method_2004);
			types.add(CallGraphElementTypes.Field_2005);
			types.add(CallGraphElementTypes.Class_2007);
			types.add(CallGraphElementTypes.Interface_2006);
			types.add(CallGraphElementTypes.Aspect_2008);
			return types;
		}
		if (editPart instanceof PackageBodyCompartment2EditPart) {
			List types = new ArrayList();
			types.add(CallGraphElementTypes.Pointcut_2002);
			types.add(CallGraphElementTypes.Advice_2003);
			types.add(CallGraphElementTypes.Method_2004);
			types.add(CallGraphElementTypes.Field_2005);
			types.add(CallGraphElementTypes.Interface_2006);
			types.add(CallGraphElementTypes.Class_2007);
			types.add(CallGraphElementTypes.Aspect_2008);
			return types;
		}
		if (editPart instanceof AspectBodyCompartment2EditPart) {
			List types = new ArrayList();
			types.add(CallGraphElementTypes.Method_2004);
			types.add(CallGraphElementTypes.Field_2005);
			types.add(CallGraphElementTypes.Class_2007);
			types.add(CallGraphElementTypes.Interface_2006);
			types.add(CallGraphElementTypes.Aspect_2008);
			return types;
		}
		if (editPart instanceof ClassBodyCompartment2EditPart) {
			List types = new ArrayList();
			types.add(CallGraphElementTypes.Method_2004);
			types.add(CallGraphElementTypes.Field_2005);
			types.add(CallGraphElementTypes.Class_2007);
			types.add(CallGraphElementTypes.Interface_2006);
			types.add(CallGraphElementTypes.Aspect_2008);
			return types;
		}
		if (editPart instanceof InterfaceBodyCompartment2EditPart) {
			List types = new ArrayList();
			types.add(CallGraphElementTypes.Aspect_2001);
			types.add(CallGraphElementTypes.Class_2009);
			types.add(CallGraphElementTypes.Interface_2010);
			types.add(CallGraphElementTypes.Package_2011);
			return types;
		}
		if (editPart instanceof AspectBodyCompartment3EditPart) {
			List types = new ArrayList();
			types.add(CallGraphElementTypes.Pointcut_2002);
			types.add(CallGraphElementTypes.Advice_2003);
			types.add(CallGraphElementTypes.Method_2004);
			types.add(CallGraphElementTypes.Field_2005);
			types.add(CallGraphElementTypes.Interface_2006);
			types.add(CallGraphElementTypes.Class_2007);
			types.add(CallGraphElementTypes.Aspect_2008);
			return types;
		}
		if (editPart instanceof ClassBodyCompartment3EditPart) {
			List types = new ArrayList();
			types.add(CallGraphElementTypes.Method_2004);
			types.add(CallGraphElementTypes.Field_2005);
			types.add(CallGraphElementTypes.Class_2007);
			types.add(CallGraphElementTypes.Interface_2006);
			types.add(CallGraphElementTypes.Aspect_2008);
			return types;
		}
		if (editPart instanceof InterfaceBodyCompartment3EditPart) {
			List types = new ArrayList();
			types.add(CallGraphElementTypes.Method_2004);
			types.add(CallGraphElementTypes.Field_2005);
			types.add(CallGraphElementTypes.Class_2007);
			types.add(CallGraphElementTypes.Interface_2006);
			types.add(CallGraphElementTypes.Aspect_2008);
			return types;
		}
		if (editPart instanceof GraphEditPart) {
			List types = new ArrayList();
			types.add(CallGraphElementTypes.Package_1001);
			types.add(CallGraphElementTypes.Aspect_1002);
			types.add(CallGraphElementTypes.Class_1003);
			types.add(CallGraphElementTypes.Interface_1004);
			types.add(CallGraphElementTypes.Advice_1005);
			types.add(CallGraphElementTypes.Method_1006);
			types.add(CallGraphElementTypes.Field_1007);
			types.add(CallGraphElementTypes.Pointcut_1008);
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForSource(IAdaptable target, IElementType relationshipType) {
		return selectExistingElement(target, getTypesForSource(target, relationshipType));
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForTarget(IAdaptable source, IElementType relationshipType) {
		return selectExistingElement(source, getTypesForTarget(source, relationshipType));
	}

	/**
	 * @generated
	 */
	protected EObject selectExistingElement(IAdaptable host, Collection types) {
		if (types.isEmpty()) {
			return null;
		}
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart == null) {
			return null;
		}
		Diagram diagram = (Diagram) editPart.getRoot().getContents().getModel();
		Collection elements = new HashSet();
		for (Iterator it = diagram.getElement().eAllContents(); it.hasNext();) {
			EObject element = (EObject) it.next();
			if (isApplicableElement(element, types)) {
				elements.add(element);
			}
		}
		if (elements.isEmpty()) {
			return null;
		}
		return selectElement((EObject[]) elements.toArray(new EObject[elements.size()]));
	}

	/**
	 * @generated
	 */
	protected boolean isApplicableElement(EObject element, Collection types) {
		IElementType type = ElementTypeRegistry.getInstance().getElementType(element);
		return types.contains(type);
	}

	/**
	 * @generated
	 */
	protected EObject selectElement(EObject[] elements) {
		Shell shell = Display.getCurrent().getActiveShell();
		ILabelProvider labelProvider = new AdapterFactoryLabelProvider(CallGraphDiagramEditorPlugin
				.getInstance().getItemProvidersAdapterFactory());
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(shell, labelProvider);
		dialog.setMessage(Messages.CallGraphModelingAssistantProviderMessage);
		dialog.setTitle(Messages.CallGraphModelingAssistantProviderTitle);
		dialog.setMultipleSelection(false);
		dialog.setElements(elements);
		EObject selected = null;
		if (dialog.open() == Window.OK) {
			selected = (EObject) dialog.getFirstResult();
		}
		return selected;
	}
}
