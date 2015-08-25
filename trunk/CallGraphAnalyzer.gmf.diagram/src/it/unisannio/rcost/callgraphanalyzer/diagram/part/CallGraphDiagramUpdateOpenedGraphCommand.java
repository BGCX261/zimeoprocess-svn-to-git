package it.unisannio.rcost.callgraphanalyzer.diagram.part;

import it.unisannio.rcost.callgraphanalyzer.Graph;
import it.unisannio.rcost.callgraphanalyzer.extractors.CallGraphProvider;
import it.unisannio.rcost.callgraphanalyzer.util.CallGraphDiagramRegistry;
import it.unisannio.rcost.callgraphanalyzer.util.Criteria;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.IHandlerListener;
import org.eclipse.emf.common.util.URI;
import org.eclipse.ui.PartInitException;

/**
 * 
 */
public class CallGraphDiagramUpdateOpenedGraphCommand implements IHandler {

	/**
	 * 
	 */
	public void addHandlerListener(IHandlerListener handlerListener) {
	}

	/**
	 * 
	 */
	public void dispose() {
	}

	/**
	 * 
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {
		String projectName = event.getParameter("it.unisannio.rcost.callgraphanalyzer.diagram.updateOpenedDiagram.projectName");
		
		CallGraphProvider provider = CallGraphProvider.getInstance(projectName);
		provider.resetFullGraph();
		
		Hashtable<String, Graph> openGraphs = CallGraphDiagramRegistry.getInstance().getAllGraphs();
		
		Enumeration<String> openGraphNames = openGraphs.keys();
		
		while (openGraphNames.hasMoreElements()) {
			String name = (String) openGraphNames.nextElement();
			
			Graph graph = openGraphs.get(name);
			Criteria criteria = graph.getCriteria();
			
			if(criteria.getProjectName().equals(projectName)) {
				Graph tmp = provider.getFullGraph();
				//aggiorna graph
				
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
				}
				
				CallGraphDiagramRegistry.getInstance().updateGraph(name, graph);
				
				try {
					System.out.println("Visualizzazione grafo aggiornato");
					URI uri = URI.createPlatformResourceURI(projectName + "/" + name, true);
					
					CallGraphDiagramEditorUtil.showDiagram(uri, graph);
				} catch (PartInitException exc) {
					exc.printStackTrace();
				} catch (IOException exc) {
					exc.printStackTrace();
				}
				
			}
		}
		
		return null;
	}

	/**
	 * 
	 */
	public boolean isEnabled() {
		return true;
	}

	/**
	 * 
	 */
	public boolean isHandled() {
		return true;
	}

	/**
	 * 
	 */
	public void removeHandlerListener(IHandlerListener handlerListener) {
	}

}
