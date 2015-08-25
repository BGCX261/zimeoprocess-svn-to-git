package it.unisannio.rcost.callgraphanalyzer.ui.popup.actions;

import it.unisannio.rcost.callgraphanalyzer.ui.wizards.Wizard;
import it.unisannio.rcost.callgraphanalyzer.util.Criteria;
import it.unisannio.rcost.callgraphanalyzer.util.Criteria.GraphType;

import org.eclipse.jface.wizard.WizardDialog;

public class ShowGraphAdvancedAction extends AbstractShowGraphAction {
	@Override
	protected void handleAction(Criteria criteria) {
		// Instantiates the wizard container with the wizard and opens it

		// Nel caso in cui si tratta dell'azione "ADVANCED" i grafi sono di tipo
		// parziale.
		if (criteria.getGraphType().equals(GraphType.FULL_PACKAGE)) {
			criteria.setGraphType(GraphType.PARTIAL_PACKAGE);
		} else if (criteria.getGraphType().equals(GraphType.FULL_CLASS)) {
			criteria.setGraphType(GraphType.PARTIAL_CLASS);
		} else if (criteria.getGraphType().equals(GraphType.FULL_METHOD)) {
			criteria.setGraphType(GraphType.PARTIAL_METHOD);
		}
		try {

			Wizard wizard = new Wizard(criteria);
			wizard.init(part.getSite().getWorkbenchWindow().getWorkbench(),
					structSel);

			WizardDialog dialog = new WizardDialog(part.getSite().getShell(),
					wizard);
			dialog.create();
			dialog.open();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
