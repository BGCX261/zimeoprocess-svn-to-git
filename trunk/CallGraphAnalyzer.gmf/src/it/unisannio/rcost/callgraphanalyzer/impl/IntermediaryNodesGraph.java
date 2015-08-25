package it.unisannio.rcost.callgraphanalyzer.impl;

import java.util.ArrayList;
import java.util.List;

public class IntermediaryNodesGraph {
	private class IntermediaryEdgeGraph {
		private IntermediaryNodesGraph source;
		private IntermediaryNodesGraph target;
		
		public IntermediaryEdgeGraph(IntermediaryNodesGraph source,
				IntermediaryNodesGraph target) {
			this.source = source;
			this.target = target;
		}
		
		@Override
		public boolean equals(Object obj) {
			if(!super.equals(obj))
				return false;
			
			if(obj instanceof IntermediaryEdgeGraph) {
				IntermediaryEdgeGraph edge = (IntermediaryEdgeGraph) obj;
				
				if(edge.source != null && this.source.equals(edge.source))
					if(edge.target != null && this.target.equals(edge.target))
						return true;
			}
			
			return false;
		}

		public IntermediaryNodesGraph getSource() {
			return source;
		}

		public void setSource(IntermediaryNodesGraph source) {
			this.source = source;
		}

		public IntermediaryNodesGraph getTarget() {
			return target;
		}

		public void setTarget(IntermediaryNodesGraph target) {
			this.target = target;
		}
	}
	
	private List<IntermediaryEdgeGraph> edges = new ArrayList<IntermediaryEdgeGraph>(); 
	private int numberReference = -1;
	
	public IntermediaryNodesGraph(int numberReferenceTarget) {
		setNumberReference(numberReferenceTarget);
	}
	
	public boolean existPath(List<IntermediaryEdgeGraph> analyzedEdges, List<Integer> numberReferences, final int targetNode) {
		if(analyzedEdges == null)
			analyzedEdges = new ArrayList<IntermediaryEdgeGraph>();
		
		if(numberReferences.size() == 0 && targetNode == numberReference)
			return true;
		else if(edges.size() == 0)
			return false;
		
		for (int i = 0; i < edges.size(); i++) {
			if(!analyzedEdges.contains(edges.get(i))) {
				analyzedEdges.add(edges.get(i));
				
				if(numberReferences.contains(numberReference))
					numberReferences.remove(new Integer(numberReference));
				
				if(edges.get(i).target.existPath(analyzedEdges, numberReferences, targetNode))
					return true;
				else
					analyzedEdges.remove(edges.get(i));
			}
		}
		
		numberReferences.add(numberReference);
		
		return false;
	}		
	
	public void addEdge(IntermediaryNodesGraph newNode) {
		IntermediaryEdgeGraph edge = new IntermediaryEdgeGraph(this, newNode);
		if(!edges.contains(edge))
			edges.add(edge);
	}
	
	public void setNumberReference(int numberReference) {
		this.numberReference = numberReference;
	}
	
	public int getNumberReference() {
		return numberReference;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!super.equals(obj))
			return false;
		
		if(obj instanceof IntermediaryNodesGraph)
			if(numberReference == ((IntermediaryNodesGraph) obj).getNumberReference())
				return true;
		
		return false;
	}

	public List<IntermediaryEdgeGraph> getEdges() {
		return edges;
	}

	public void setEdges(List<IntermediaryEdgeGraph> edges) {
		this.edges = edges;
	}
}