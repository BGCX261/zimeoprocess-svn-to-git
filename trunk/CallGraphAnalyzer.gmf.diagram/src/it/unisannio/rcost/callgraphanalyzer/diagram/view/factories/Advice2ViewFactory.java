package it.unisannio.rcost.callgraphanalyzer.diagram.view.factories;

import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.Advice2EditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.part.CallGraphVisualIDRegistry;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.view.factories.AbstractShapeViewFactory;
import org.eclipse.gmf.runtime.notation.NotationFactory;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class Advice2ViewFactory extends AbstractShapeViewFactory {

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
			semanticHint = CallGraphVisualIDRegistry.getType(Advice2EditPart.VISUAL_ID);
			view.setType(semanticHint);
		}
		super.decorateView(containerView, view, semanticAdapter, semanticHint, index, persisted);
	}
}
