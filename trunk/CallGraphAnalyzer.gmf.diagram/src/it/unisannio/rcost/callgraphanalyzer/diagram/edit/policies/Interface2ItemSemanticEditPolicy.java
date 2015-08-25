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
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.Class2EditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.DependenceEditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.ExplicitCallEditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.ExtensionEditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.Field2EditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.ImplementationEditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.ImplicitCallEditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.Interface2EditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.InterfaceBodyCompartmentEditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.Method2EditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts.Method3EditPart;
import it.unisannio.rcost.callgraphanalyzer.diagram.part.CallGraphVisualIDRegistry;
import it.unisannio.rcost.callgraphanalyzer.diagram.providers.CallGraphElementTypes;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class Interface2ItemSemanticEditPolicy extends CallGraphBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		CompoundCommand cc = getDestroyEdgesCommand();
		addDestroyChildNodesCommand(cc);
		addDestroyShortcutsCommand(cc);
		cc.add(getGEFWrapper(new DestroyElementCommand(req)));
		return cc.unwrap();
	}

	/**
	 * @generated
	 */
	protected void addDestroyChildNodesCommand(CompoundCommand cmd) {
		View view = (View) getHost().getModel();
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation != null) {
			return;
		}
		for (Iterator it = view.getChildren().iterator(); it.hasNext();) {
			Node node = (Node) it.next();
			switch (CallGraphVisualIDRegistry.getVisualID(node)) {
			case InterfaceBodyCompartmentEditPart.VISUAL_ID:
				for (Iterator cit = node.getChildren().iterator(); cit.hasNext();) {
					Node cnode = (Node) cit.next();
					switch (CallGraphVisualIDRegistry.getVisualID(cnode)) {
					case Method2EditPart.VISUAL_ID:
						cmd.add(getDestroyElementCommand(cnode));
						break;
					case Field2EditPart.VISUAL_ID:
						cmd.add(getDestroyElementCommand(cnode));
						break;
					case Interface2EditPart.VISUAL_ID:
						cmd.add(getDestroyElementCommand(cnode));
						break;
					case Class2EditPart.VISUAL_ID:
						cmd.add(getDestroyElementCommand(cnode));
						break;
					case Method3EditPart.VISUAL_ID:
						cmd.add(getDestroyElementCommand(cnode));
						break;
					}
				}
				break;
			}
		}
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
