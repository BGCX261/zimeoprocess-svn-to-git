package it.unisannio.rcost.callgraphanalyzer.diagram.edit.commands;

import it.unisannio.rcost.callgraphanalyzer.CallGraphPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.emf.type.core.commands.CreateElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class Method2CreateCommand extends CreateElementCommand {

	/**
	 * @generated
	 */
	public Method2CreateCommand(CreateElementRequest req) {
		super(req);
	}

	/**
	 * @generated
	 */
	protected EObject getElementToEdit() {
		EObject container = ((CreateElementRequest) getRequest())
				.getContainer();
		if (container instanceof View) {
			container = ((View) container).getElement();
		}
		return container;
	}

	/**
	 * @generated
	 */
	protected EClass getEClassToEdit() {
		return CallGraphPackage.eINSTANCE.getInterface();
	}
	
	@Override
	public boolean canExecute() {
		return false;
	}

}
