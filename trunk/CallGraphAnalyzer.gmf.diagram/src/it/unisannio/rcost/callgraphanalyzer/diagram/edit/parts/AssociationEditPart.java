package it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts;

import it.unisannio.rcost.callgraphanalyzer.diagram.edit.policies.AssociationItemSemanticEditPolicy;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.Graphics;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class AssociationEditPart extends ConnectionNodeEditPart {
	@Override
	public void deactivate() {
		try{
			super.deactivate();
		}catch(Exception e){
		}
		
	}
	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3003;

	/**
	 * @generated
	 */
	public AssociationEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new AssociationItemSemanticEditPolicy());
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */

	protected Connection createConnectionFigure() {
		return new AssociationFigure();
	}

	/**
	 * @generated
	 */
	public AssociationFigure getPrimaryShape() {
		return (AssociationFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class AssociationFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		public AssociationFigure() {
			this.setLineWidth(2);
			this.setLineStyle(Graphics.LINE_DOT);
			this.setForegroundColor(ColorConstants.orange);

		}

	}

}
