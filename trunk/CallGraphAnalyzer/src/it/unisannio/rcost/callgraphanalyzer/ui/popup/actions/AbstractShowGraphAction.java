package it.unisannio.rcost.callgraphanalyzer.ui.popup.actions;

import it.unisannio.rcost.callgraphanalyzer.Graph;
import it.unisannio.rcost.callgraphanalyzer.Interface;
import it.unisannio.rcost.callgraphanalyzer.Node;
import it.unisannio.rcost.callgraphanalyzer.dbmanagers.DBConnectionManager;
import it.unisannio.rcost.callgraphanalyzer.dbmanagers.FieldFacade;
import it.unisannio.rcost.callgraphanalyzer.dbmanagers.InterfaceFacade;
import it.unisannio.rcost.callgraphanalyzer.dbmanagers.MethodFacade;
import it.unisannio.rcost.callgraphanalyzer.extractors.CallGraphProvider;
import it.unisannio.rcost.callgraphanalyzer.util.Criteria;

import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

public abstract class AbstractShowGraphAction implements IObjectActionDelegate {
	protected Criteria criteria = null;
	private IJavaElement selection;
	protected IWorkbenchPart part;
	protected IStructuredSelection structSel;
	//Questa stringa vale "Base" o "Avanzato"
	private String actionText;

	/**
	 * Constructor for Action1.
	 */
	public AbstractShowGraphAction() {
		super();
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		this.part = targetPart;
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	@SuppressWarnings("restriction")
	public void run(IAction action) {

		String projectName = selection.getJavaProject().getElementName();
		DBConnectionManager.getInstance().graphConstructionStarted(projectName);
		String selectedElementName = selection.getElementName();
		int elementType = selection.getElementType();
		DBConnectionManager.getInstance().graphConstructionFinished(projectName);
		/**
		 * 
		 * Progetto: selectionType= 2 TYPE: JAVA_PROJECT src:selectionType= 3
		 * TYPE: Package_FragmentRoot pacchetto di default + altri
		 * pacchetti:selectionType= 4 TYPE: Package_Fragment classe + aspetti +
		 * interfacce: selectionType= 5 TYPE: COMPILATION_UNIT metodo:
		 * selectionType= 9 TYPE: METHOD campo: selectionType= 8 TYPE: FIELD
		 */

		switch (elementType) {
		case IJavaElement.JAVA_PROJECT:
		case IJavaElement.PACKAGE_FRAGMENT_ROOT:

			/**
			 * Nel caso in cui è stato selezionato il progetto o il pacchetto
			 * src si fa il diagramma completo a livello dei package con tutti i
			 * main come nodi sorgenti
			 */
			try {
				criteria = new Criteria();
				criteria.setGraphType(Criteria.GraphType.FULL_PACKAGE);
				criteria.setProjectName(projectName);

				if(actionText.equals("Base")) {
					Node[] nodes = CallGraphProvider.getInstance(projectName)
					.getMainMethods();
					criteria.setSources(nodes);
			
				}
				else {
					//nel caso di Advanced si setta a null il nodo Source di criteria.
					criteria.setSource(null);
				}
				
			} catch (Exception e) {
				errorMessage("Il nodo selezionato: "
						+ selection.getElementName() + " non e' valido.");
				e.printStackTrace();
			}

			break;

		case IJavaElement.PACKAGE_FRAGMENT:
			/**
			 * Nel caso in cui è stato selezionato un pacchetto generico(anche
			 * quello di default) si fa un diagramma completo a livello dei
			 * package che ha il pacchetto selezionato come nodo sorgente.
			 */
			try {
				Graph fullgraph = CallGraphProvider.getInstance(projectName)
						.getFullGraph();

				criteria = new Criteria();
				criteria.setGraphType(Criteria.GraphType.FULL_PACKAGE);
				criteria.setProjectName(projectName);
				Node pack = fullgraph.getPackageHash().get(selectedElementName);

				if (pack != null)
					criteria.setSource(pack);
				else
					errorMessage("Il nodo selezionato: "
							+ selection.getElementName() + " non e' valido.");
			} catch (Exception e) {
				errorMessage("Il nodo selezionato: "
						+ selection.getElementName() + " non e' valido.");
				e.printStackTrace();
				return;
			}

			break;

		case IJavaElement.COMPILATION_UNIT:
			/**
			 * Nel caso in cui è stato selezionato una
			 * classe/interfaccia/aspetto si fa un diagramma completo a livello
			 * classi/aspetti che ha come sorgente il modulo selezionato.
			 */
			if (selectedElementName.contains(".")) {
				selectedElementName = selectedElementName.substring(0,
						selectedElementName.lastIndexOf("."));
				criteria = new Criteria();
				criteria.setGraphType(Criteria.GraphType.FULL_CLASS);
				criteria.setProjectName(projectName);

				Graph fullgraph = CallGraphProvider.getInstance(projectName)
						.getFullGraph();

				// il parent di una COMPILATION_UNIT può essere solo un
				// PACKAGE_FRAGMENT
				// se il parent è null allora la COMPILATION_UNIT si trova nel
				// pacchetto di default
				IJavaElement pack = (IJavaElement) (selection.getParent());
				String packageName = (pack == null) ? "" : pack
						.getElementName();

				// Recupera il modulo dal db
				Node module = InterfaceFacade.facade.getModuleByNameAndPackage(
						projectName, selectedElementName, packageName);
				Node source = fullgraph.getNodeByHash(module);
				if (source != null)
					criteria.setSource(source);
				else
					errorMessage("Il nodo selezionato: "
							+ selection.getElementName() + " non e' valido.");
			}

			break;
		case IJavaElement.TYPE:
			/**
			 * Nel caso in cui è stato selezionato una
			 * classe/interfaccia/aspetto innestata si fa il diagramma completo
			 * che ha come nodo sorgente la classe "conteiner"
			 */
			try {
				criteria = new Criteria();
				criteria.setGraphType(Criteria.GraphType.FULL_CLASS);
				criteria.setProjectName(projectName);

				Graph fullgraph = CallGraphProvider.getInstance(projectName)
						.getFullGraph();

				IJavaElement compilationUnit = selection.getParent();
				String className = null;
				if (compilationUnit.getElementType() == IJavaElement.COMPILATION_UNIT) {
					className = selectedElementName;
				} else {
					while ((compilationUnit.getElementType()) != IJavaElement.COMPILATION_UNIT) {
						if (className == null) {
							className = compilationUnit.getElementName();
						} else {
							className = compilationUnit.getElementName() + "."
									+ className;

						}
						compilationUnit = compilationUnit.getParent();
					}
				}

				// Questo è un package
				IJavaElement pack = compilationUnit.getParent();
				String packageName = (pack == null) ? "" : pack
						.getElementName();
				Node module = InterfaceFacade.facade.getModuleByNameAndPackage(
						projectName, className, packageName);
				Node source = fullgraph.getNodeByHash(module);
				if (source != null)
					criteria.setSource(source);
				else
					errorMessage("Il nodo selezionato: "
							+ selection.getElementName() + " non e' valido.");

			} catch (Exception e) {
				errorMessage("Il nodo selezionato: "
						+ selection.getElementName() + " non e' valido.");
				e.printStackTrace();
				return;
			}

			break;

		case IJavaElement.METHOD:
			try {
				criteria = new Criteria();
				criteria.setGraphType(Criteria.GraphType.FULL_METHOD);
				criteria.setProjectName(projectName);

				IJavaElement compilationUnit = selection.getParent();
				String className = null;
				while ((compilationUnit.getElementType()) != IJavaElement.COMPILATION_UNIT) {
					if (className == null) {
						className = compilationUnit.getElementName();
					} else {
						className = compilationUnit.getElementName() + "."
								+ className;

					}
					compilationUnit = compilationUnit.getParent();
				}

				// recupera il package
				IJavaElement pack = compilationUnit.getParent();
				String packageName = (pack == null) ? "" : pack
						.getElementName();

				// recupera la classe dal db
				Node module = InterfaceFacade.facade.getModuleByNameAndPackage(
						projectName, className, packageName);

				String signature = ((IMethod) selection).getSignature();

				// Prelevo il metodo dal db
				Node method = MethodFacade.facade.getMethodByNameAndModule(
						projectName, selectedElementName, signature,
						(Interface) module);

				// Prelevo il nodo dal grafo
				Graph fullgraph = CallGraphProvider.getInstance(projectName)
						.getFullGraph();
				Node source = fullgraph.getNodeByHash(method);
				if (source != null)
					criteria.setSource(source);
				else
					errorMessage("Il nodo selezionato: "
							+ selection.getElementName() + " non e' valido.");
			} catch (JavaModelException e) {
				errorMessage("Il nodo selezionato: "
						+ selection.getElementName() + " non e' valido.");
				e.printStackTrace();
				return;
			}
			break;

		case IJavaElement.FIELD:
			try {
				criteria = new Criteria();
				criteria.setGraphType(Criteria.GraphType.FULL_METHOD);
				criteria.setProjectName(projectName);

				IJavaElement compilationUnit = selection.getParent();
				String className = null;
				while ((compilationUnit.getElementType()) != IJavaElement.COMPILATION_UNIT) {
					if (className == null) {
						className = compilationUnit.getElementName();
					} else {
						className = compilationUnit.getElementName() + "."
								+ selectedElementName;
					}

					compilationUnit = compilationUnit.getParent();
				}

				// recupera il package
				IJavaElement pack = compilationUnit.getParent();
				String packageName = (pack == null) ? "" : pack
						.getElementName();

				// recupera la classe dal db
				Node module = InterfaceFacade.facade.getModuleByNameAndPackage(
						projectName, className, packageName);

				// Recupera il campo dal db
				Node field = FieldFacade.facade.getFieldByNameAndModule(
						projectName, selectedElementName, (Interface) module);

				Graph fullgraph = CallGraphProvider.getInstance(projectName)
						.getFullGraph();
				Node source = fullgraph.getNodeByHash(field);

				if (source != null)
					criteria.setSource(source);
				else
					errorMessage("Il nodo selezionato: "
							+ selection.getElementName() + " non e' valido.");

			} catch (Exception e) {
				errorMessage("Il nodo selezionato: "
						+ selection.getElementName() + " non e' valido.");
				e.printStackTrace();
				return;
			}

			break;

		default:
			errorMessage("Il nodo selezionato: " + selection.getElementName()
					+ " non e' valido.");

			return;
		}

		handleAction(criteria);
	}

	protected abstract void handleAction(Criteria criteria);

	private void errorMessage(String string) {
		Shell shell = new Shell();
		MessageDialog.openInformation(shell, "GraphCallAnalyzer Plug-in",
				string);
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		this.structSel = (IStructuredSelection) selection;
		this.actionText = action.getText();
		this.selection = (IJavaElement) structSel.getFirstElement();
	}

}
