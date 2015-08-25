package it.unisannio.rcost.callgraphanalyzer.diagram.view.factories;

import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.AspectBodyCompartment2EditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.ClassName3EditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.Package2EditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.PackageBodyCompartment2EditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.PackageName2EditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.part.CallGraphVisualIDRegistry;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.diagram.ui.view.factories.AbstractShapeViewFactory;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.notation.NotationFactory;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class Package2ViewFactory extends AbstractShapeViewFactory {

	/**
	 * @generated
	 */
	protected List createStyles(View view) {
		List styles = new ArrayList();
		styles.add(NotationFactory.eINSTANCE.createShapeStyle());
		return styles;
	}

	/**
	 * @generated
	 */
	protected void decorateView(View containerView, View view, IAdaptable semanticAdapter,
			String semanticHint, int index, boolean persisted) {
		if (semanticHint == null) {
			semanticHint = CallGraphVisualIDRegistry.getType(Package2EditPart.VISUAL_ID);
			view.setType(semanticHint);
		}
		super.decorateView(containerView, view, semanticAdapter, semanticHint, index, persisted);
		IAdaptable eObjectAdapter = null;
		EObject eObject = (EObject) semanticAdapter.getAdapter(EObject.class);
		if (eObject != null) {
			eObjectAdapter = new EObjectAdapter(eObject);
		}
		getViewService().createNode(eObjectAdapter, view,
				CallGraphVisualIDRegistry.getType(ClassName3EditPart.VISUAL_ID), ViewUtil.APPEND,
				true, getPreferencesHint());
		getViewService().createNode(eObjectAdapter, view,
				CallGraphVisualIDRegistry.getType(AspectBodyCompartment2EditPart.VISUAL_ID),
				ViewUtil.APPEND, true, getPreferencesHint());
	}
}
