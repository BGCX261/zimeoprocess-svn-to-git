package it.unisannio.rcost.callgraphanalyzer.diagram.edit.policies;

import it.unisannio.rcost.callgraphanalyzer.CallGraphPackage;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.Class2EditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.Field2EditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.Interface2EditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.Method2EditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.Method3EditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.part.CallGraphDiagramUpdater;
import it.unisannio.rcost.callgraphanalyzer.diagram.part.CallGraphNodeDescriptor;
import it.unisannio.rcost.callgraphanalyzer.diagram.part.CallGraphVisualIDRegistry;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class InterfaceBodyCompartment3CanonicalEditPolicy extends CanonicalEditPolicy {

	/**
	 * @generated
	 */
	Set myFeaturesToSynchronize;

	/**
	 * @generated
	 */
	protected List getSemanticChildrenList() {
		View viewObject = (View) getHost().getModel();
		List result = new LinkedList();
		for (Iterator it = CallGraphDiagramUpdater
				.getInterfaceBodyCompartment_5011SemanticChildren(viewObject).iterator(); it
				.hasNext();) {
			result.add(((CallGraphNodeDescriptor) it.next()).getModelElement());
		}
		return result;
	}

	/**
	 * @generated
	 */
	protected boolean isOrphaned(Collection semanticChildren, final View view) {
		int visualID = CallGraphVisualIDRegistry.getVisualID(view);
		switch (visualID) {
		case Method2EditPart.VISUAL_ID:
		case Field2EditPart.VISUAL_ID:
		case Interface2EditPart.VISUAL_ID:
		case Class2EditPart.VISUAL_ID:
		case Method3EditPart.VISUAL_ID:
			return !semanticChildren.contains(view.getElement())
					|| visualID != CallGraphVisualIDRegistry.getNodeVisualID((View) getHost()
							.getModel(), view.getElement());
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected String getDefaultFactoryHint() {
		return null;
	}

	/**
	 * @generated
	 */
	protected Set getFeaturesToSynchronize() {
		if (myFeaturesToSynchronize == null) {
			myFeaturesToSynchronize = new HashSet();
			myFeaturesToSynchronize.add(CallGraphPackage.eINSTANCE.getInterface_Methods());
			myFeaturesToSynchronize.add(CallGraphPackage.eINSTANCE.getInterface_Fields());
			myFeaturesToSynchronize.add(CallGraphPackage.eINSTANCE.getInterface_InnerModules());
		}
		return myFeaturesToSynchronize;
	}

}
