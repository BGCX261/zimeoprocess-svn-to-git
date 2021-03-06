package it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts;

import it.unisannio.rcost.callgraphanalyzer.diagram.edit.policies.PointcutItemSemanticEditPolicy;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.Polygon;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.editpolicies.ResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class PointcutEditPart extends ShapeNodeEditPart {
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
	public static final int VISUAL_ID = 1008;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public PointcutEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new PointcutItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		LayoutEditPolicy lep = new LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = child.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if (result == null) {
					result = new NonResizableEditPolicy();
				}
				return result;
			}

			protected Command getMoveChildrenCommand(Request request) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		PointcutFigure figure = new PointcutFigure();
		return primaryShape = figure;
	}

	/**
	 * @generated
	 */
	public PointcutFigure getPrimaryShape() {
		return (PointcutFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(getMapMode().DPtoLP(40),
				getMapMode().DPtoLP(40));
		return result;
	}

	/**
	 * @generated
	 */
	public EditPolicy getPrimaryDragEditPolicy() {
		EditPolicy result = super.getPrimaryDragEditPolicy();
		if (result instanceof ResizableEditPolicy) {
			ResizableEditPolicy ep = (ResizableEditPolicy) result;
			ep.setResizeDirections(PositionConstants.NONE);
		}
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	public class PointcutFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		public PointcutFigure() {

			this.setLayoutManager(new StackLayout());
			this.setFill(false);
			this.setOutline(false);
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			Polygon pointcutFigure0 = new Polygon();
			pointcutFigure0.addPoint(new Point(getMapMode().DPtoLP(14), getMapMode().DPtoLP(2)));
			pointcutFigure0.addPoint(new Point(getMapMode().DPtoLP(26), getMapMode().DPtoLP(2)));
			pointcutFigure0.addPoint(new Point(getMapMode().DPtoLP(38), getMapMode().DPtoLP(14)));
			pointcutFigure0.addPoint(new Point(getMapMode().DPtoLP(38), getMapMode().DPtoLP(26)));
			pointcutFigure0.addPoint(new Point(getMapMode().DPtoLP(26), getMapMode().DPtoLP(38)));
			pointcutFigure0.addPoint(new Point(getMapMode().DPtoLP(14), getMapMode().DPtoLP(38)));
			pointcutFigure0.addPoint(new Point(getMapMode().DPtoLP(2), getMapMode().DPtoLP(26)));
			pointcutFigure0.addPoint(new Point(getMapMode().DPtoLP(2), getMapMode().DPtoLP(14)));
			pointcutFigure0.addPoint(new Point(getMapMode().DPtoLP(14), getMapMode().DPtoLP(2)));
			pointcutFigure0.setForegroundColor(ColorConstants.red);
			pointcutFigure0.setBackgroundColor(ColorConstants.orange);
			pointcutFigure0.setPreferredSize(new Dimension(getMapMode().DPtoLP(40), getMapMode()
					.DPtoLP(40)));
			pointcutFigure0.setMaximumSize(new Dimension(getMapMode().DPtoLP(40), getMapMode()
					.DPtoLP(40)));

			this.add(pointcutFigure0);

			WrapLabel pointcutFigureNameLabel0 = new WrapLabel();
			pointcutFigureNameLabel0.setText("");
			pointcutFigureNameLabel0.setBorder(new MarginBorder(getMapMode().DPtoLP(17),
					getMapMode().DPtoLP(0), getMapMode().DPtoLP(0), getMapMode().DPtoLP(0)));

			this.add(pointcutFigureNameLabel0);

		}

		/**
		 * @generated
		 */
		private boolean myUseLocalCoordinates = true;

		/**
		 * @generated
		 */
		protected boolean useLocalCoordinates() {
			return myUseLocalCoordinates;
		}

		/**
		 * @generated
		 */
		protected void setUseLocalCoordinates(boolean useLocalCoordinates) {
			myUseLocalCoordinates = useLocalCoordinates;
		}

	}

}
