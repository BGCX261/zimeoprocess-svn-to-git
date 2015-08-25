package it.unisannio.rcost.callgraphanalyzer.diagram.edit.policies;

import it.unisannio.rcost.callgraphanalyzer.diagram.edit.commands.AssociationCreateCommand;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.commands.AssociationReorientCommand;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.commands.DependenceCreateCommand;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.commands.DependenceReorientCommand;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.commands.ExplicitCallCreateCommand;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.commands.ExplicitCallReorientCommand;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.commands.ExtensionCreateCommand;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.commands.ExtensionReorientCommand;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.commands.ImplementationCreateCommand;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.commands.ImplementationReorientCommand;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.commands.ImplicitCallCreateCommand;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.commands.ImplicitCallReorientCommand;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.AssociationEditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.DependenceEditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.ExplicitCallEditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.ExtensionEditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.ImplementationEditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.ImplicitCallEditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.providers.CallGraphElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class FieldItemSemanticEditPolicy extends CallGraphBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		CompoundCommand cc = getDestroyEdgesCommand();
		addDestroyShortcutsCommand(cc);
		View view = (View) getHost().getModel();
		if (view.getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
			req.setElementToDestroy(view);
		}
		cc.add(getGEFWrapper(new DestroyElementCommand(req)));
		return cc.unwrap();
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (CallGraphElementTypes.ExplicitCall_3001 == req.getElementType()) {
			return getGEFWrapper(new ExplicitCallCreateCommand(req, req.getSource(), req
					.getTarget()));
		}
		if (CallGraphElementTypes.Dependence_3002 == req.getElementType()) {
			return getGEFWrapper(new DependenceCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (CallGraphElementTypes.Association_3003 == req.getElementType()) {
			return getGEFWrapper(new AssociationCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (CallGraphElementTypes.Extension_3004 == req.getElementType()) {
			return getGEFWrapper(new ExtensionCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (CallGraphElementTypes.ImplicitCall_3005 == req.getElementType()) {
			return getGEFWrapper(new ImplicitCallCreateCommand(req, req.getSource(), req
					.getTarget()));
		}
		if (CallGraphElementTypes.Implementation_3006 == req.getElementType()) {
			return getGEFWrapper(new ImplementationCreateCommand(req, req.getSource(), req
					.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (CallGraphElementTypes.ExplicitCall_3001 == req.getElementType()) {
			return getGEFWrapper(new ExplicitCallCreateCommand(req, req.getSource(), req
					.getTarget()));
		}
		if (CallGraphElementTypes.Dependence_3002 == req.getElementType()) {
			return getGEFWrapper(new DependenceCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (CallGraphElementTypes.Association_3003 == req.getElementType()) {
			return getGEFWrapper(new AssociationCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (CallGraphElementTypes.Extension_3004 == req.getElementType()) {
			return getGEFWrapper(new ExtensionCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (CallGraphElementTypes.ImplicitCall_3005 == req.getElementType()) {
			return getGEFWrapper(new ImplicitCallCreateCommand(req, req.getSource(), req
					.getTarget()));
		}
		if (CallGraphElementTypes.Implementation_3006 == req.getElementType()) {
			return getGEFWrapper(new ImplementationCreateCommand(req, req.getSource(), req
					.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EClass based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(ReorientRelationshipRequest req) {
		switch (getVisualID(req)) {
		case ExplicitCallEditPart.VISUAL_ID:
			return getGEFWrapper(new ExplicitCallReorientCommand(req));
		case DependenceEditPart.VISUAL_ID:
			return getGEFWrapper(new DependenceReorientCommand(req));
		case AssociationEditPart.VISUAL_ID:
			return getGEFWrapper(new AssociationReorientCommand(req));
		case ExtensionEditPart.VISUAL_ID:
			return getGEFWrapper(new ExtensionReorientCommand(req));
		case ImplicitCallEditPart.VISUAL_ID:
			return getGEFWrapper(new ImplicitCallReorientCommand(req));
		case ImplementationEditPart.VISUAL_ID:
			return getGEFWrapper(new ImplementationReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

}
