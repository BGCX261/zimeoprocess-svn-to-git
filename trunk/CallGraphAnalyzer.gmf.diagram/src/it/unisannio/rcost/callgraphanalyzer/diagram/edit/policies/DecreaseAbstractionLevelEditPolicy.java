package it.unisannio.rcost.callgraphanalyzer.diagram.edit.policies;

import it.unisannio.rcost.callgraphanalyzer.Graph;
import it.unisannio.rcost.callgraphanalyzer.NodeContainer;
import it.unisannio.rcost.callgraphanalyzer.diagram.part.CallGraphDiagramEditorUtil;
import it.unisannio.rcost.callgraphanalyzer.util.CallGraphDiagramRegistry;
import it.unisannio.rcost.callgraphanalyzer.util.Criteria;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.OpenEditPolicy;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

public class DecreaseAbstractionLevelEditPolicy extends OpenEditPolicy {

	@Override
	protected Command getOpenCommand(Request request) {
		EditPart selectedElement = getTargetEditPart(request);
		if (selectedElement != null && selectedElement.getModel() instanceof View) {
			EObject modelElement = ((View) (selectedElement).getModel()).getElement();

			if (modelElement != null && modelElement instanceof NodeContainer) {
				Diagram d = (Diagram) selectedElement.getViewer().getContents().getModel();
				Graph graph = CallGraphDiagramRegistry.getInstance().getGraph(d.getName());

				if (graph != null)
					if(graph.getCriteria().getGraphType() != Criteria.GraphType.FULL_METHOD && graph.getCriteria().getGraphType() != Criteria.GraphType.PARTIAL_METHOD)
						try {
							decreaseLevel(graph, (NodeContainer) modelElement);
						}catch (Exception e) {
							e.printStackTrace();
						}
			}
		}

		return null;
	}

	private void decreaseLevel(Graph graph, NodeContainer element) {
		if (graph.getCriteria() != null) {
			Criteria c = graph.getCriteria().clone();
			Graph newGraph = null;
			
//			Graph firstLevel = graph.getFirstLevelGraph();
			Graph firstLevel = graph.getMethodAdviceGraph();
			
			c.setSource(firstLevel.getNodeByHash(element));
			
//			c.setGraphType(Criteria.GraphType.PARTIAL_METHOD);
			
			newGraph = firstLevel.getSubGraph(c);
			
			switch (graph.getCriteria().getGraphType()) {
			case FULL_PACKAGE:
			case PARTIAL_PACKAGE:
				newGraph = newGraph.getClassAspectGraph();
				break;
			case FULL_CLASS:
			case PARTIAL_CLASS:
				newGraph = newGraph.getMethodAdviceGraph();
				break;
			default:
				return;
			}

			if (newGraph != null) {
				CallGraphDiagramEditorUtil.drawGraph(newGraph);
			} else
				System.out.println("il grafo è vuoto");
		}
	}
}
