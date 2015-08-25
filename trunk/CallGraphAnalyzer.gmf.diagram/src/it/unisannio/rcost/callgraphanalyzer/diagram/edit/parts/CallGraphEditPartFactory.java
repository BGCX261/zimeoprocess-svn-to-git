package it.unisannio.rcost.callgraphanalyzer.diagram.edit.parts;

import it.unisannio.rcost.callgraphanalyzer.diagram.part.CallGraphVisualIDRegistry;

import org.eclipse.draw2d.FigureUtilities;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;

/**
 * @generated
 */
public class CallGraphEditPartFactory implements EditPartFactory {
	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (CallGraphVisualIDRegistry.getVisualID(view)) {

			case GraphEditPart.VISUAL_ID:
				return new GraphEditPart(view);

			case PackageEditPart.VISUAL_ID:
				return new PackageEditPart(view);

			case PackageNameEditPart.VISUAL_ID:
				return new PackageNameEditPart(view);

			case AspectEditPart.VISUAL_ID:
				return new AspectEditPart(view);

			case AspectNameEditPart.VISUAL_ID:
				return new AspectNameEditPart(view);

			case ClassEditPart.VISUAL_ID:
				return new ClassEditPart(view);

			case ClassNameEditPart.VISUAL_ID:
				return new ClassNameEditPart(view);

			case InterfaceEditPart.VISUAL_ID:
				return new InterfaceEditPart(view);

			case InterfaceNameEditPart.VISUAL_ID:
				return new InterfaceNameEditPart(view);

			case AdviceEditPart.VISUAL_ID:
				return new AdviceEditPart(view);

			case MethodEditPart.VISUAL_ID:
				return new MethodEditPart(view);

			case FieldEditPart.VISUAL_ID:
				return new FieldEditPart(view);

			case PointcutEditPart.VISUAL_ID:
				return new PointcutEditPart(view);

			case Aspect2EditPart.VISUAL_ID:
				return new Aspect2EditPart(view);

			case AspectName2EditPart.VISUAL_ID:
				return new AspectName2EditPart(view);

			case Pointcut2EditPart.VISUAL_ID:
				return new Pointcut2EditPart(view);

			case Advice2EditPart.VISUAL_ID:
				return new Advice2EditPart(view);

			case Method2EditPart.VISUAL_ID:
				return new Method2EditPart(view);

			case Field2EditPart.VISUAL_ID:
				return new Field2EditPart(view);

			case Class2EditPart.VISUAL_ID:
				return new Class2EditPart(view);

			case InterfaceName2EditPart.VISUAL_ID:
				return new InterfaceName2EditPart(view);

			case Interface2EditPart.VISUAL_ID:
				return new Interface2EditPart(view);

			case ClassName2EditPart.VISUAL_ID:
				return new ClassName2EditPart(view);

			case Method3EditPart.VISUAL_ID:
				return new Method3EditPart(view);

			case AspectName3EditPart.VISUAL_ID:
				return new AspectName3EditPart(view);

			case Package2EditPart.VISUAL_ID:
				return new Package2EditPart(view);

			case ClassName3EditPart.VISUAL_ID:
				return new ClassName3EditPart(view);

			case Interface3EditPart.VISUAL_ID:
				return new Interface3EditPart(view);

			case InterfaceName3EditPart.VISUAL_ID:
				return new InterfaceName3EditPart(view);

			case Package3EditPart.VISUAL_ID:
				return new Package3EditPart(view);

			case PackageName2EditPart.VISUAL_ID:
				return new PackageName2EditPart(view);

			case PackageBodyCompartmentEditPart.VISUAL_ID:
				return new PackageBodyCompartmentEditPart(view);

			case AspectBodyCompartmentEditPart.VISUAL_ID:
				return new AspectBodyCompartmentEditPart(view);

			case ClassBodyCompartmentEditPart.VISUAL_ID:
				return new ClassBodyCompartmentEditPart(view);

			case InterfaceBodyCompartmentEditPart.VISUAL_ID:
				return new InterfaceBodyCompartmentEditPart(view);

			case PackageBodyCompartment2EditPart.VISUAL_ID:
				return new PackageBodyCompartment2EditPart(view);

			case AspectBodyCompartment2EditPart.VISUAL_ID:
				return new AspectBodyCompartment2EditPart(view);

			case ClassBodyCompartment2EditPart.VISUAL_ID:
				return new ClassBodyCompartment2EditPart(view);

			case InterfaceBodyCompartment2EditPart.VISUAL_ID:
				return new InterfaceBodyCompartment2EditPart(view);

			case AspectBodyCompartment3EditPart.VISUAL_ID:
				return new AspectBodyCompartment3EditPart(view);

			case ClassBodyCompartment3EditPart.VISUAL_ID:
				return new ClassBodyCompartment3EditPart(view);

			case InterfaceBodyCompartment3EditPart.VISUAL_ID:
				return new InterfaceBodyCompartment3EditPart(view);

			case ExplicitCallEditPart.VISUAL_ID:
				return new ExplicitCallEditPart(view);

			case ExplicitCallGroupIdEditPart.VISUAL_ID:
				return new ExplicitCallGroupIdEditPart(view);

			case DependenceEditPart.VISUAL_ID:
				return new DependenceEditPart(view);

			case AssociationEditPart.VISUAL_ID:
				return new AssociationEditPart(view);

			case ExtensionEditPart.VISUAL_ID:
				return new ExtensionEditPart(view);

			case ImplicitCallEditPart.VISUAL_ID:
				return new ImplicitCallEditPart(view);

			case ImplementationEditPart.VISUAL_ID:
				return new ImplementationEditPart(view);
			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
		if (source.getFigure() instanceof WrapLabel)
			return new TextCellEditorLocator((WrapLabel) source.getFigure());
		else {
			return new LabelCellEditorLocator((Label) source.getFigure());
		}
	}

	/**
	 * @generated
	 */
	static private class TextCellEditorLocator implements CellEditorLocator {

		/**
		 * @generated
		 */
		private WrapLabel wrapLabel;

		/**
		 * @generated
		 */
		public TextCellEditorLocator(WrapLabel wrapLabel) {
			this.wrapLabel = wrapLabel;
		}

		/**
		 * @generated
		 */
		public WrapLabel getWrapLabel() {
			return wrapLabel;
		}

		/**
		 * @generated
		 */
		public void relocate(CellEditor celleditor) {
			Text text = (Text) celleditor.getControl();
			Rectangle rect = getWrapLabel().getTextBounds().getCopy();
			getWrapLabel().translateToAbsolute(rect);
			if (getWrapLabel().isTextWrapped() && getWrapLabel().getText().length() > 0) {
				rect.setSize(new Dimension(text.computeSize(rect.width, SWT.DEFAULT)));
			} else {
				int avr = FigureUtilities.getFontMetrics(text.getFont()).getAverageCharWidth();
				rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT, SWT.DEFAULT)).expand(
						avr * 2, 0));
			}
			if (!rect.equals(new Rectangle(text.getBounds()))) {
				text.setBounds(rect.x, rect.y, rect.width, rect.height);
			}
		}

	}

	/**
	 * @generated
	 */
	private static class LabelCellEditorLocator implements CellEditorLocator {

		/**
		 * @generated
		 */
		private Label label;

		/**
		 * @generated
		 */
		public LabelCellEditorLocator(Label label) {
			this.label = label;
		}

		/**
		 * @generated
		 */
		public Label getLabel() {
			return label;
		}

		/**
		 * @generated
		 */
		public void relocate(CellEditor celleditor) {
			Text text = (Text) celleditor.getControl();
			Rectangle rect = getLabel().getTextBounds().getCopy();
			getLabel().translateToAbsolute(rect);
			int avr = FigureUtilities.getFontMetrics(text.getFont()).getAverageCharWidth();
			rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT, SWT.DEFAULT)).expand(avr * 2,
					0));
			if (!rect.equals(new Rectangle(text.getBounds()))) {
				text.setBounds(rect.x, rect.y, rect.width, rect.height);
			}
		}
	}
}
