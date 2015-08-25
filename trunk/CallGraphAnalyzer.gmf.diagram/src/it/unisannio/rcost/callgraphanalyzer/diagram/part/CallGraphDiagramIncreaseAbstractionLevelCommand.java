package it.unisannio.rcost.callgraphanalyzer.diagram.part;

import it.unisannio.rcost.callgraphanalyzer.Graph;
import it.unisannio.rcost.callgraphanalyzer.Node;
import it.unisannio.rcost.callgraphanalyzer.NodeContainer;
import it.unisannio.rcost.callgraphanalyzer.diagram.edit.policies.DecreaseAbstractionLevelEditPolicy;
import it.unisannio.rcost.callgraphanalyzer.util.CallGraphDiagramRegistry;
import it.unisannio.rcost.callgraphanalyzer.util.Criteria;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.IHandlerListener;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;

public class CallGraphDiagramIncreaseAbstractionLevelCommand implements IHandler {

	public void addHandlerListener(IHandlerListener handlerListener) {
	}

	public void dispose() {
	}

	public Object execute(ExecutionEvent event) throws ExecutionException {
		DecreaseAbstractionLevelEditPolicy policy = new DecreaseAbstractionLevelEditPolicy() {
			@Override
			public EditPart getTargetEditPart(Request request) {
				ISelection selection = CallGraphDiagramEditorPlugin.getInstance().getWorkbench().getActiveWorkbenchWindow().getSelectionService().getSelection();
				if (selection instanceof IStructuredSelection) {
					IStructuredSelection structuredSelection = (IStructuredSelection) selection;
					if (structuredSelection.size() != 1) {
						return null;
					}
					
					return (EditPart) structuredSelection.getFirstElement();
				}
				
				return null;
			}
		};
		
		return policy.getCommand(null);
	}

	public boolean isEnabled() {
		return true;
	}

	public boolean isHandled() {
		return true;
	}

	public void removeHandlerListener(IHandlerListener handlerListener) {
	}
}
