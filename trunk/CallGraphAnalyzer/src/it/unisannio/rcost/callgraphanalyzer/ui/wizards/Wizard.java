package it.unisannio.rcost.callgraphanalyzer.ui.wizards;

import it.unisannio.rcost.callgraphanalyzer.Graph;
import it.unisannio.rcost.callgraphanalyzer.diagram.part.CallGraphDiagramEditorUtil;
import it.unisannio.rcost.callgraphanalyzer.extractors.CallGraphProvider;
import it.unisannio.rcost.callgraphanalyzer.util.Criteria;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWizard;

public class Wizard extends org.eclipse.jface.wizard.Wizard implements
		INewWizard {
	private WizardPage1 page1;
	private WizardPage2 page2;
	private Criteria criteria = null;
	private boolean isAdvancedView = false;

	/**
	 * Constructor for Wizard.
	 */
	public Wizard() {
		super();
		setHelpAvailable(false);
		setWindowTitle("CallGraph Analyzer");
		// setForcePreviousAndNextButtons(true);
		setNeedsProgressMonitor(true);

		criteria = new Criteria();
	}

	public Wizard(Criteria criteria) {
		this();

		this.criteria = criteria;

		isAdvancedView = true;
	}

	/**
	 * Adding the page to the wizard.
	 */

	public void addPages() {
		// Caso in cui si lancia il wizard direttamente
		if (!isAdvancedView) {
			page1 = new WizardPage1(criteria);
			addPage(page1);
		}//caso in cui si fa "ADVANCED" selezionando il progetto
		else if (isAdvancedView && criteria!=null
				&& criteria.getSource()==null) {
			page1 = new WizardPage1(criteria, isAdvancedView);
			addPage(page1);
		}

		page2 = new WizardPage2(criteria);
		addPage(page2);
	}

	public boolean canFinish() {

		// Default implementation is to check if all pages are complete.
		if (page1 != null && page1.isPageComplete()) {
			IWizardPage nextPage = page1.getNextPage();

			if (nextPage == null || nextPage.isPageComplete())
				return true;
		} else if (page1 == null && page2.isPageComplete()) {
			return true;
		}

		return false;
	}

	/**
	 * This method is called when 'Finish' button is pressed in the wizard. We
	 * will create an operation and run it using wizard as execution context.
	 */
	public boolean performFinish() {
		criteria.setEmpty(false);

		IRunnableWithProgress op = new IRunnableWithProgress() {
			public void run(IProgressMonitor monitor)
					throws InvocationTargetException {
				try {
					doFinish(criteria, monitor);
				} catch (CoreException e) {
					throw new InvocationTargetException(e);
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					monitor.done();
				}
			}

			private void doFinish(final Criteria criteria,
					IProgressMonitor monitor) throws CoreException {
				monitor.beginTask("Creazione del grafo... ", 2);

				// Creare il grafo qui
				final Graph graph;

				Graph tmp = CallGraphProvider.getInstance(
						criteria.getProjectName()).getFullGraph();

				switch (criteria.getGraphType()) {
				case FULL_PACKAGE:
					graph = tmp.getSubGraph(criteria).getPackageGraph();
					break;
				case FULL_CLASS:
					graph = tmp.getSubGraph(criteria).getClassAspectGraph();
					break;
				case FULL_METHOD:
					graph = tmp.getSubGraph(criteria).getMethodAdviceGraph();
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

				monitor.worked(1);

				monitor.setTaskName("Apertura della vista in corso...");
				getShell().getDisplay().asyncExec(new Runnable() {
					public void run() {
						if(!CallGraphDiagramEditorUtil.drawGraph(graph))
							MessageDialog.openInformation(new Shell(), "GraphCallAnalyzer Plug-in", "Il grafo e' vuoto.");
					}
				});

				monitor.worked(1);
			}
		};
		try {
			getContainer().run(true, false, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			Throwable realException = e.getTargetException();
			MessageDialog.openError(getShell(), "Error", realException
					.getMessage());
			return false;
		}
		return true;
	}

	/**
	 * We will accept the selection in the workbench to see if we can initialize
	 * from it.
	 * 
	 * @see IWorkbenchWizard#init(IWorkbench, IStructuredSelection)
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
	}

	public Criteria setCriteria(Criteria criteria) {
		return criteria;
	}

	public Criteria getCriteria() {
		return criteria;
	}
}