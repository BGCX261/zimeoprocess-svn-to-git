package it.unisannio.rcost.callgraphanalyzer.diagram.edit.policies;

import it.unisannio.rcost.callgraphanalyzer.CallGraphPackage;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.commands.AdviceCreateCommand;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.commands.AspectCreateCommand;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.commands.ClassCreateCommand;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.commands.FieldCreateCommand;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.commands.InterfaceCreateCommand;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.commands.MethodCreateCommand;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.commands.PackageCreateCommand;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.commands.PointcutCreateCommand;
import it.unisannio.rcost.callgraphanalyzer.diagram.providers.CallGraphElementTypes;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

/**
 * @generated
 */
public class GraphItemSemanticEditPolicy extends CallGraphBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CallGraphElementTypes.Package_1001 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(CallGraphPackage.eINSTANCE.getGraph_Nodes());
			}
			return getGEFWrapper(new PackageCreateCommand(req));
		}
		if (CallGraphElementTypes.Aspect_1002 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(CallGraphPackage.eINSTANCE.getGraph_Nodes());
			}
			return getGEFWrapper(new AspectCreateCommand(req));
		}
		if (CallGraphElementTypes.Class_1003 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(CallGraphPackage.eINSTANCE.getGraph_Nodes());
			}
			return getGEFWrapper(new ClassCreateCommand(req));
		}
		if (CallGraphElementTypes.Interface_1004 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(CallGraphPackage.eINSTANCE.getGraph_Nodes());
			}
			return getGEFWrapper(new InterfaceCreateCommand(req));
		}
		if (CallGraphElementTypes.Advice_1005 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(CallGraphPackage.eINSTANCE.getGraph_Nodes());
			}
			return getGEFWrapper(new AdviceCreateCommand(req));
		}
		if (CallGraphElementTypes.Method_1006 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(CallGraphPackage.eINSTANCE.getGraph_Nodes());
			}
			return getGEFWrapper(new MethodCreateCommand(req));
		}
		if (CallGraphElementTypes.Field_1007 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(CallGraphPackage.eINSTANCE.getGraph_Nodes());
			}
			return getGEFWrapper(new FieldCreateCommand(req));
		}
		if (CallGraphElementTypes.Pointcut_1008 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(CallGraphPackage.eINSTANCE.getGraph_Nodes());
			}
			return getGEFWrapper(new PointcutCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(TransactionalEditingDomain editingDomain,
				DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req.getElementsToBeDuplicated(), req
					.getAllDuplicatedElementsMap());
		}

	}

}
