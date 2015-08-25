package it.unisannio.rcost.callgraphanalyzer.ui.popup.actions;

import it.unisannio.rcost.callgraphanalyzer.Graph;
import it.unisannio.rcost.callgraphanalyzer.diagram.part.CallGraphDiagramEditorUtil;
import it.unisannio.rcost.callgraphanalyzer.extractors.CallGraphProvider;
import it.unisannio.rcost.callgraphanalyzer.util.Criteria;

public class ShowGraphAction extends AbstractShowGraphAction {
	@Override
	protected void handleAction(Criteria criteria) {
		// Creare il grafo qui
		final Graph graph;
		
		Graph tmp = CallGraphProvider.getInstance(criteria.getProjectName()).getFullGraph();
		
		switch (criteria.getGraphType()) {
		case FULL_PACKAGE:
			graph = tmp.getPackageGraph();
			break;
		case FULL_CLASS:
			graph = tmp.getClassAspectGraph();
			break;
		case FULL_METHOD:
			graph = tmp.getMethodAdviceGraph();
			break;
		case PARTIAL_PACKAGE:
			graph = tmp.getSubGraph(criteria).getPackageGraph();
			break;
		case PARTIAL_CLASS:
			graph = tmp.getSubGraph(criteria).getClassAspectGraph();
			break;
		case PARTIAL_METHOD:
			graph = tmp.getSubGraph(criteria).getMethodAdviceGraph();
			break;
		default:
			graph = tmp;
		}
		
		CallGraphDiagramEditorUtil.drawGraph(graph);
	}
}
