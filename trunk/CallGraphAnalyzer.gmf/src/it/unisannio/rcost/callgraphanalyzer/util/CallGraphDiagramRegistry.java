package it.unisannio.rcost.callgraphanalyzer.util;

import it.unisannio.rcost.callgraphanalyzer.Graph;
import it.unisannio.rcost.callgraphanalyzer.Node;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;

import org.eclipse.gmf.runtime.notation.Diagram;

public final class CallGraphDiagramRegistry {
	private static CallGraphDiagramRegistry registry = new CallGraphDiagramRegistry();

	private Hashtable<String, Graph> graphs = new Hashtable<String, Graph>();

	protected CallGraphDiagramRegistry() {

	}

	public static CallGraphDiagramRegistry getInstance() {
		return registry;
	}

	public void addGraph(Diagram diagram, Graph graph) {
		graphs.put(diagram.getName(), graph);
	}

	public void removeGraph(Diagram diagram) {
		graphs.remove(diagram.getName());
	}

	public Graph getGraph(String diagramName) {
		return graphs.get(diagramName);
	}

	public Hashtable<String, Graph> getAllGraphs() {
		return graphs;
	}

//	public Graph getGraph(Node node) {
//		Enumeration<Graph> enumeration = graphs.elements();
//		List<Graph> graphWithNode = new ArrayList<Graph>();
//		while (enumeration.hasMoreElements()) {
//			Graph graph = (Graph) enumeration.nextElement();
//
//			if (graph.cointains(node)) {
//				boolean isContained = false;
//				for (int i = 0; i < graphWithNode.size() && !isContained; i++) {
//					if ((graphWithNode.get(i).getCriteria().getProjectName()
//							.equals(graph.getCriteria().getProjectName())))
//						isContained = true;
//				}
//				if (!isContained)
//					graphWithNode.add(graph);
//
//			}
//		}
//		// Se la lista graphWithNode contiene più di un elemento si lancia un
//		// eccezione perchè vuol dire che non si riesce a determinare in modo
//		// univoco il progectName associato al nodo
//		//
//		if(graphWithNode.size()==1)
//			return graphWithNode.get(0);
//		else
//			throw new RuntimeException("Cannot found a graph for the node.");
//	}

	public void updateGraph(String name, Graph graph) {
		this.graphs.remove(name);
		this.graphs.put(name, graph);
		
	}
}
