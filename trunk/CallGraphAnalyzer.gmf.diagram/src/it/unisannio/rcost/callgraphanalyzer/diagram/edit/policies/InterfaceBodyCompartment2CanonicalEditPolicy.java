package it.unisannio.rcost.callgraphanalyzer.diagram.edit.policies;

import it.unisannio.rcost.callgraphanalyzer.CallGraphPackage;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.Aspect2EditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.Interface3EditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.Package2EditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.Package3EditPart;
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
public class InterfaceBodyCompartment2CanonicalEditPolicy extends CanonicalEditPolicy {

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
		for (Iterator it = CallGraphDiagramUpdater.getPackageBodyCompartment_5008SemanticChildren(
				viewObject).iterator(); it.hasNext();) {
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
		case Aspect2EditPart.VISUAL_ID:
		case Package2EditPart.VISUAL_ID:
		case Interface3EditPart.VISUAL_ID:
		case Package3EditPart.VISUAL_ID:
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
			myFeaturesToSynchronize.add(CallGraphPackage.eINSTANCE.getPackage_InnerModules());
			myFeaturesToSynchronize.add(CallGraphPackage.eINSTANCE.getPackage_Packages());
		}
		return myFeaturesToSynchronize;
	}

}
