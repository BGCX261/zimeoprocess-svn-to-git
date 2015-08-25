package it.unisannio.rcost.callgraphanalyzer.diagram.edit.policies;

import it.unisannio.rcost.callgraphanalyzer.CallGraphPackage;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.commands.Aspect2CreateCommand;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.commands.Interface3CreateCommand;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.commands.Package2CreateCommand;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.commands.Package3CreateCommand;
import it.unisannio.rcost.callgraphanalyzer.diagram.providers.CallGraphElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class PackageBodyCompartmentItemSemanticEditPolicy extends
		CallGraphBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CallGraphElementTypes.Aspect_2001 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(CallGraphPackage.eINSTANCE.getPackage_InnerModules());
			}
			return getGEFWrapper(new Aspect2CreateCommand(req));
		}
		if (CallGraphElementTypes.Class_2009 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(CallGraphPackage.eINSTANCE.getPackage_InnerModules());
			}
			return getGEFWrapper(new Package2CreateCommand(req));
		}
		if (CallGraphElementTypes.Interface_2010 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(CallGraphPackage.eINSTANCE.getPackage_InnerModules());
			}
			return getGEFWrapper(new Interface3CreateCommand(req));
		}
		if (CallGraphElementTypes.Package_2011 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(CallGraphPackage.eINSTANCE.getPackage_Packages());
			}
			return getGEFWrapper(new Package3CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
