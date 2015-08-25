package it.unisannio.rcost.callgraphanalyzer.ui.wizards;

import it.unisannio.rcost.callgraphanalyzer.Advice;
import it.unisannio.rcost.callgraphanalyzer.Aspect;
import it.unisannio.rcost.callgraphanalyzer.Field;
import it.unisannio.rcost.callgraphanalyzer.Interface;
import it.unisannio.rcost.callgraphanalyzer.Method;
import it.unisannio.rcost.callgraphanalyzer.Node;
import it.unisannio.rcost.callgraphanalyzer.NodeContainer;
import it.unisannio.rcost.callgraphanalyzer.NodeLeaf;
import it.unisannio.rcost.callgraphanalyzer.Package;
import it.unisannio.rcost.callgraphanalyzer.extractors.CallGraphProvider;
import it.unisannio.rcost.callgraphanalyzer.util.Criteria;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.dialogs.IDialogPage;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Text;

/**
 * The "New" wizard page allows setting the container for the new file as well
 * as the file name. The page will only accept file name without the extension
 * OR with the extension that matches the expected one (callgraph).
 */

public class WizardPage2 extends org.eclipse.jface.wizard.WizardPage {
	private Criteria preferences = null;
	private Group groupHigh = null;
	private Group groupLow = null;
	private CLabel cLabel = null;
	private Button chkAllPath = null;
	private Button chkOnlyObject = null;
	private Button bttChooseSource = null;
	private Text txtSource = null;
	private CLabel lblSource = null;
	private CLabel lblTarget = null;
	private Text txtTarget = null;
	private Button bttChooseTarget = null;
	private CLabel lblIntermediary = null;
	private ListNodes lstIntermediary = null;
	private Button bttRemoveIntermediary = null;
	private Button bttChooseIntermediary = null;
	private Composite commandIntermediary = null;
	private Composite upAndDown = null;
	private Button chkOrderValid;
	private Button bttUp;
	private Button bttDown;
	private Button chkOnlyAspect;
	private Node sourceNode;
	private Node targetNode;
	protected BrowseElementDialog dialog;

	/**
	 * Constructor for WizardPage.
	 * 
	 * @param pageName
	 */
	public WizardPage2(Criteria preferences) {
		super("wizardPage");
		setTitle("CallGraph Analyzer");
		setDescription("Indicando, oltre al nodo di origine, anche il nodo finale e quelli intermedi, E' possibile aumentare la precisione del grafo visualizzato.");
		this.preferences = preferences;
		this.sourceNode=preferences.getSource();
		
	}

	/**
	 * @see IDialogPage#createControl(Composite)
	 */
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);

		container.setLayout(new GridLayout());

		createGroupHigh(container);
		createGroupLow(container);

		initialize();
		setPageComplete(false);
		setControl(container);
	}

	private void createGroupHigh(Composite container) {
		// private void createGroupHigh() {
		GridLayout gridLayout1 = new GridLayout();
		gridLayout1.numColumns = 2;
		gridLayout1.makeColumnsEqualWidth = false;
		gridLayout1.verticalSpacing = 5;
		GridLayout gridLayout2 = new GridLayout();
		gridLayout2.marginHeight = 1;
		gridLayout2.verticalSpacing = 2;

		GridData gridData1 = new GridData();
		gridData1.horizontalAlignment = GridData.FILL;
		gridData1.grabExcessHorizontalSpace = true;
		gridData1.verticalAlignment = GridData.CENTER;
		GridData gridData2 = new GridData();
		gridData2.horizontalSpan = 2;
		gridData2.horizontalIndent = 3;
		GridData gridData3 = new GridData();
		gridData3.horizontalAlignment = GridData.FILL;
		gridData3.grabExcessHorizontalSpace = true;
		gridData3.widthHint = -1;
		gridData3.heightHint = 17;
		gridData3.verticalAlignment = GridData.CENTER;
		GridData gridData4 = new GridData();
		gridData4.horizontalAlignment = GridData.CENTER;
		gridData4.heightHint = 25;
		gridData4.widthHint = 80;
		gridData4.verticalAlignment = GridData.CENTER;
		GridData gridData5 = new GridData();
		gridData5.horizontalSpan = 2;
		gridData5.horizontalIndent = 4;
		GridData gridData6 = new GridData();
		gridData6.grabExcessHorizontalSpace = true;
		gridData6.verticalAlignment = GridData.CENTER;
		gridData6.heightHint = 17;
		gridData6.horizontalAlignment = GridData.FILL;
		GridData gridData7 = new GridData();
		gridData7.horizontalAlignment = GridData.CENTER;
		gridData7.heightHint = 25;
		gridData7.widthHint = 80;
		gridData7.verticalAlignment = GridData.CENTER;
		GridData gridData8 = new GridData();
		gridData8.horizontalSpan = 2;
		gridData8.horizontalIndent = 3;
		GridData gridData9 = new GridData();
		gridData9.horizontalIndent = 0;
		gridData9.horizontalAlignment = GridData.FILL;
		gridData9.verticalAlignment = GridData.FILL;
		gridData9.grabExcessHorizontalSpace = true;
		GridData gridData10 = new GridData();
		gridData10.horizontalAlignment = GridData.CENTER;
		gridData10.verticalAlignment = GridData.CENTER;
		GridData gridData11 = new GridData();
		gridData11.horizontalSpan = 2;
		gridData11.verticalAlignment = GridData.CENTER;
		gridData11.horizontalIndent = 10;
		gridData11.horizontalAlignment = GridData.BEGINNING;
		GridData gridData12 = new GridData();
		gridData12.horizontalAlignment = GridData.CENTER;
		gridData12.heightHint = 25;
		gridData12.widthHint = 80;
		gridData12.verticalAlignment = GridData.CENTER;
		GridData gridData13 = new GridData();
		gridData13.heightHint = 25;
		gridData13.widthHint = 80;

		groupHigh = new Group(container, SWT.SHADOW_OUT);
		groupHigh.setLayout(gridLayout1);
		groupHigh.setLayoutData(gridData1);
		lblSource = new CLabel(groupHigh, SWT.NONE);
		lblSource.setText("Nodo sorgente:");
		lblSource.setLayoutData(gridData2);
		txtSource = new Text(groupHigh, SWT.BORDER);
		txtSource.setLayoutData(gridData3);
		txtSource.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				dialogChanged();
			}
		});
		txtSource.setEditable(false);

		bttChooseSource = new Button(groupHigh, SWT.NONE);
		bttChooseSource.setText("Sfoglia");
		bttChooseSource.setLayoutData(gridData4);

		bttChooseSource.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				BrowseElementDialog dialog = openBrowserElementDialog();

				Object[] result = dialog.getResult();

				if (result != null && result.length > 0) {
					// txtSource.setText(((IJavaElement)
					// result[0]).getElementName());
					sourceNode = (Node) result[0];
					txtSource.setText(getQualifiedName(sourceNode));
				}
				dialogChanged();
			}

		});

		lblIntermediary = new CLabel(groupHigh, SWT.NONE);
		lblIntermediary.setText("Nodi intermedi:");
		lblIntermediary.setLayoutData(gridData8);
		lstIntermediary = new ListNodes(groupHigh, SWT.BORDER);
		lstIntermediary.setLayoutData(gridData9);
		lstIntermediary.addDisposeListener(new DisposeListener() {
			public void widgetDisposed(DisposeEvent e) {
				bttUp.setEnabled(false);
				bttDown.setEnabled(false);
			}
		});
		lstIntermediary.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (lstIntermediary.getSelectionIndex() >= 0) {
					bttUp.setEnabled(true);
					bttDown.setEnabled(true);
				}
			}
		});

		commandIntermediary = new Composite(groupHigh, SWT.NONE);
		commandIntermediary.setLayoutData(gridData10);
		commandIntermediary.setLayout(gridLayout2);

		chkOrderValid = new Button(groupHigh, SWT.CHECK);
		chkOrderValid.setText("Considera l'ordine dei nodi intermedi");
		chkOrderValid.setLayoutData(gridData11);
		chkOrderValid.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
					dialogChanged();
				}
			});
		
		bttChooseIntermediary = new Button(commandIntermediary, SWT.NONE);
		bttChooseIntermediary.setText("Sfoglia");
		bttChooseIntermediary.setLayoutData(gridData12);
		bttChooseIntermediary.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				BrowseElementDialog dialog = openBrowserElementDialog();

				Object[] result = dialog.getResult();

				if (result != null && result.length > 0) {
					// String resultStr = ((IJavaElement)
					// result[0]).getElementName();
					// String resultStr = ((Node)result[0]).getName();
					Node resultNode = (Node) result[0];
					if (lstIntermediary.indexOf(resultNode) < 0)
						lstIntermediary.add(resultNode);

					dialogChanged();
				}
			}
		});

		bttRemoveIntermediary = new Button(commandIntermediary, SWT.NONE);
		bttRemoveIntermediary.setText("Rimuovi");
		bttRemoveIntermediary.setLayoutData(gridData13);

		bttRemoveIntermediary.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				Node[] items = lstIntermediary.getItems();

				if (items != null) {
					int selIndex = lstIntermediary.getSelectionIndex();

					lstIntermediary.remove(selIndex);

					dialogChanged();
				}
			}
		});

		createUpAndDown(commandIntermediary);
		
		lblTarget = new CLabel(groupHigh, SWT.NONE);
		lblTarget.setText("Nodo destinazione:");
		lblTarget.setLayoutData(gridData5);

		txtTarget = new Text(groupHigh, SWT.BORDER);
		txtTarget.setLayoutData(gridData6);
		txtTarget.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				dialogChanged();
			}
		});
		txtTarget.setEditable(false);

		bttChooseTarget = new Button(groupHigh, SWT.NONE);
		bttChooseTarget.setText("Sfoglia");
		bttChooseTarget.setLayoutData(gridData7);
		bttChooseTarget.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				BrowseElementDialog dialog = openBrowserElementDialog();

				Object[] result = dialog.getResult();

				if (result != null && result.length > 0) {
					// txtTarget.setText(((IJavaElement)
					// result[0]).getElementName());
					targetNode = (Node) result[0];
					txtTarget.setText(getQualifiedName(targetNode));
				}
				dialogChanged();
			}
		});

	}

	protected BrowseElementDialog openBrowserElementDialog() {
		IRunnableWithProgress op = new IRunnableWithProgress() {
			public void run(IProgressMonitor monitor)
					throws InvocationTargetException {
				
				String projectName = preferences.getProjectName();

				if(projectName != null)
					try {
						monitor.beginTask("Analisi del progetto... ", 1);
						CallGraphProvider.getInstance(preferences.getProjectName()).getFullGraph();
						
						monitor.worked(1);
						
						monitor.beginTask("Creazione della struttura del progetto... ", 2);
						
						ILabelProvider elementRenderer = new ProjectLabelProvider();
						dialog = new BrowseElementDialog(getShell(), elementRenderer, projectName);

						monitor.worked(2);
					} catch (RuntimeException e) {
						e.printStackTrace();
						
						throw new InvocationTargetException(e, "Database non connesso");
					} finally {
						monitor.done();
					}
					
					if(dialog != null)
						dialog.open();
			}
		};
		
		try {
			getContainer().run(false, false, op);
		} catch (Exception e) {
			updateStatus("Errore durante l'analisi del progetto.");
			e.printStackTrace();
			return null;
		}
		
		return dialog;
	}

	/**
	 * This method initializes upAndDown
	 * 
	 */
	private void createUpAndDown(Composite container) {
		GridData gridData14 = new GridData();
		gridData14.horizontalAlignment = GridData.CENTER;
		gridData14.widthHint = 20;
		gridData14.heightHint = 20;
		gridData14.verticalAlignment = GridData.CENTER;
		GridLayout gridLayout2 = new GridLayout();
		gridLayout2.marginWidth = 2;
		gridLayout2.horizontalSpacing = 2;
		gridLayout2.marginHeight = 2;
		gridLayout2.verticalSpacing = 2;
		GridData gridData3 = new GridData();
		gridData3.widthHint = 20;
		gridData3.verticalAlignment = GridData.CENTER;
		gridData3.heightHint = 20;
		gridData3.horizontalAlignment = GridData.CENTER;
		GridData gridData1 = new GridData();
		gridData1.horizontalAlignment = GridData.CENTER;
		gridData1.widthHint = 24;
		gridData1.grabExcessHorizontalSpace = false;
		gridData1.verticalAlignment = GridData.CENTER;
		upAndDown = new Composite(container, SWT.NONE);
		upAndDown.setLayoutData(gridData1);
		upAndDown.setLayout(gridLayout2);
		bttUp = new Button(upAndDown, SWT.ARROW | SWT.UP);
		bttUp.setLayoutData(gridData3);
		bttUp.setEnabled(false);
		bttUp.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				Node[] items = lstIntermediary.getItems();

				if (items != null) {
					int index = lstIntermediary.getSelectionIndex();

					if (index > 0) {
						// String tmp = lstIntermediary.getItem(index);
						Node tmp = lstIntermediary.getItem(index);
						lstIntermediary.setItem(index, lstIntermediary.getItem(index - 1));
						lstIntermediary.setItem(index - 1, tmp);
						lstIntermediary.setSelection(index - 1);
					}
				}
			}
		});
		bttDown = new Button(upAndDown, SWT.ARROW | SWT.DOWN);
		bttDown.setLayoutData(gridData14);
		bttDown.setEnabled(false);
		bttDown.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				Node[] items = lstIntermediary.getItems();

				if (items != null) {
					int index = lstIntermediary.getSelectionIndex();

					if (index < items.length - 1) {
						// String tmp = lstIntermediary.getItem(index);
						Node tmp = lstIntermediary.getItem(index);
						lstIntermediary.setItem(index, lstIntermediary.getItem(index + 1));
						lstIntermediary.setItem(index + 1, tmp);
						lstIntermediary.setSelection(index + 1);
					}
				}
			}
		});
	}

	private void createGroupLow(Composite container) {
		// private void createGroupLow() {
		GridData gridData1 = new GridData();
		gridData1.grabExcessHorizontalSpace = true;
		gridData1.verticalAlignment = GridData.CENTER;
		gridData1.horizontalAlignment = GridData.FILL;
		GridData gridData2 = new GridData();
		gridData2.horizontalAlignment = GridData.FILL;
		gridData2.verticalAlignment = GridData.CENTER;
		gridData2.grabExcessHorizontalSpace = true;
		GridData gridData3 = new GridData();
		gridData3.horizontalIndent = 10;
		GridData gridData4 = new GridData();
		gridData4.horizontalIndent = 26;
		GridData gridData5 = new GridData();
		gridData5.horizontalIndent = 26;
		GridData gridData6 = new GridData();
		gridData6.horizontalIndent = 26;

		GridLayout gridLayout = new GridLayout();
		gridLayout.numColumns = 1;
		gridLayout.horizontalSpacing = 25;
		gridLayout.marginWidth = 6;
		gridLayout.verticalSpacing = 10;

		groupLow = new Group(container, SWT.SHADOW_OUT);
		groupLow.setLayout(gridLayout);
		groupLow.setLayoutData(gridData1);

		cLabel = new CLabel(groupLow, SWT.NONE);
		cLabel
				.setText("Selezionare delle seguenti voci per indicare gli elementi da visualizzare sul grafo:");
		cLabel.setLayoutData(gridData2);

		chkAllPath = new Button(groupLow, SWT.CHECK);
		chkAllPath.setText("Visualizza tutti i percorsi");
		chkAllPath.setLayoutData(gridData3);
		chkAllPath.setSelection(true);

		chkAllPath.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				// super.widgetSelected(e);
				if (!chkAllPath.getSelection()) {
					chkOnlyObject.setEnabled(true);
					chkOnlyAspect.setEnabled(true);
				} else {
					chkOnlyObject.setEnabled(false);
					chkOnlyAspect.setEnabled(false);
				}
				dialogChanged();
			}

		});

		chkOnlyObject = new Button(groupLow, SWT.CHECK);
		chkOnlyObject.setText("Includi i percorsi di soli nodi object");
		chkOnlyObject.setLayoutData(gridData4);
		chkOnlyObject.setSelection(true);
		chkOnlyObject.setEnabled(false);
		chkOnlyObject.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				dialogChanged();
			}
		});

		chkOnlyAspect = new Button(groupLow, SWT.CHECK);
		chkOnlyAspect.setText("Includi i percorsi di soli nodi aspect");
		chkOnlyAspect.setLayoutData(gridData5);
		chkOnlyAspect.setSelection(true);
		chkOnlyAspect.setEnabled(false);
		chkOnlyAspect.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				dialogChanged();
			}
		});

	}

	private void initialize() {
		if (this.preferences != null && this.preferences.getSource() != null) {
			this.txtSource.setText(getQualifiedName(preferences.getSource()));
//			this.txtTarget.setText(preferences.getTarget().getName());

//			this.lstIntermediary.setItems(preferences.getLstIntermediary());

			switch (preferences.getPathOptions()) {
			case ALL_PATH:
				this.chkAllPath.setSelection(true);
				this.chkOnlyObject.setSelection(false);
				this.chkOnlyAspect.setSelection(false);
				break;
			case ONLY_ASPECT:
				this.chkAllPath.setSelection(false);
				this.chkOnlyObject.setSelection(false);
				this.chkOnlyAspect.setSelection(true);
				break;
			case ONLY_OBJECT:
				this.chkAllPath.setSelection(false);
				this.chkOnlyObject.setSelection(true);
				this.chkOnlyAspect.setSelection(false);
				break;
			}

//			this.chkOrderValid.setSelection(preferences.isOrdered());
		}
	}

	/**
	 * Ensures that both text fields are set.
	 */
	private void dialogChanged() {
		// String source = this.txtSource.getText();
		// String target = this.txtTarget.getText();
		// String[] lstIntermediary = this.lstIntermediary.getItems();
		Node[] lstIntermediary = this.lstIntermediary.getItems();

		if (sourceNode != null && sourceNode.getId() > -1) {
			if(sourceNode instanceof Advice){
				
				if (((Advice)sourceNode).getPointcutExpression() == null || ((Advice)sourceNode).getPointcutExpression().trim().length() == 0){
					updateStatus("Nodo sorgente non indicato o non valido");
					return;
				}
			}
			else if (sourceNode.getName() == null){
				updateStatus("Nodo sorgente non indicato o non valido");
				return;
			}
		} else {
			updateStatus("Indicare un nodo sorgente valido");
			return;
		}

		if (targetNode != null && targetNode.getId() > -1) {
			if(targetNode instanceof Advice){
				if (((Advice)targetNode).getPointcutExpression() == null || ((Advice)targetNode).getPointcutExpression().trim().length() == 0){
					updateStatus("Nodo destinazione non indicato o non valido");
					return;
				}
			}
			else if (sourceNode.getName() == null){
				updateStatus("Nodo destinazione non indicato o non valido");
				return;
			}
		}
		if (targetNode instanceof Field){
			updateStatus("Il nodo destinazione non puo' essere un campo");
			return;
		}

		if (lstIntermediary != null && lstIntermediary.length > 0) {
			for (int i = 0; i < lstIntermediary.length; i++) {
				if (!isValidElement(lstIntermediary[i])) {
					updateStatus("Il nodo intermedio indicato come: " + lstIntermediary[i].getName()
							+ " non e' un elemento valido, occorre rimuoverlo.");
					return;
				} else if (lstIntermediary[i] instanceof Field) {
					updateStatus("" + lstIntermediary[i].getName()
							+ ": non e' possibile indicare un campo come nodo intermedio");
					return;
				} else if (lstIntermediary[i].equals(sourceNode)) {
					updateStatus("Il nodo intermedio indicato come: " + lstIntermediary[i].getName()
							+ " coincide con il nodo sorgente.");
					return;
				} else if (lstIntermediary[i].equals(targetNode)) {
					updateStatus("Il nodo intermedio indicato come: " + lstIntermediary[i].getName()
							+ " coincide con il nodo destinazione.");
					return;
				}
				Node interI = lstIntermediary[i];
				for (int j = 0; j < lstIntermediary.length; j++) {
					if(i!=j){
						Node interJ = lstIntermediary[j];
						if(interI instanceof NodeContainer){
							if(interJ instanceof NodeContainer){
								if(containsContainer((NodeContainer)interI, (NodeContainer)interJ)){
									updateStatus("Il nodo intermedio : \"" + getQualifiedName(interI)+
											"\" contiene il nodo \"" + getQualifiedName(interJ) + "\"" );
									return;
								}
							} else if(interJ instanceof NodeLeaf){
								if(containsContainer((NodeContainer)interI, interJ.getNodeContainer())){
									updateStatus("Il nodo intermedio : \"" + getQualifiedName(interI)+
											"\" contiene il nodo \"" + getQualifiedName(interJ) + "\"" );
									return;
								}
							}
						}
						else if (interI instanceof Interface && interJ instanceof NodeLeaf){
							if(interI instanceof Aspect && interJ instanceof Advice 
									&& containsAdvice(((Aspect)interI), ((Advice)interJ))){//((Aspect)interI).getAdvicesList().contains((Advice)interJ)){
								updateStatus("Il nodo intermedio : \"" + getQualifiedName(interI)+
										"\" contiene il nodo \"" + getQualifiedName(interJ) + "\"" );
								return;
							}
							if(interJ instanceof Method && containsMethod(((Interface)interI), ((Method)interJ))){//(((Interface)interI).getMethodsList().contains((Method)interJ))){
								updateStatus("Il nodo intermedio : \"" + getQualifiedName(interI)+
										"\" contiene il nodo \"" + getQualifiedName(interJ) + "\"" );
								return;
							}
						}
						
					}
				}
			}
		}

		preferences.setLstIntermediary(lstIntermediary);
		preferences.setSource(this.sourceNode);
		preferences.setTarget(this.targetNode);

		preferences.setOrdered(this.chkOrderValid.getSelection());

		if (this.chkAllPath.getSelection()) {
			preferences.setPathOptions(Criteria.PathOptions.ALL_PATH);
			// this.chkAllPath.setEnabled(true);
		} else if (this.chkOnlyObject.getSelection() && this.chkOnlyAspect.getSelection()) {
			preferences.setPathOptions(Criteria.PathOptions.ALL_PATH);
		} else {
			if (this.chkOnlyObject.getSelection() && !this.chkOnlyAspect.getSelection())
				preferences.setPathOptions(Criteria.PathOptions.ONLY_OBJECT);
			else if (!this.chkOnlyObject.getSelection() && !this.chkOnlyAspect.getSelection()) {
				updateStatus("Indicare i percorsi da visualizzare");
				return;
			} else if (!this.chkOnlyObject.getSelection() && this.chkOnlyAspect.getSelection())
				preferences.setPathOptions(Criteria.PathOptions.ONLY_ASPECT);
		}
		updateStatus(null);
	}

	private boolean containsAdvice(Aspect aspect, Advice advice) {
		if(aspect.getAdvicesList() != null && aspect.getAdvicesList().size()>0){
			if(aspect.getAdvicesList().contains(advice))
				return true;
			else 
				for (int i = 0; i < aspect.getInnerModulesList().size(); i++) {
					if(aspect.getInnerModulesList().get(i) instanceof Aspect)
						if(containsAdvice((Aspect)aspect.getInnerModulesList().get(i), advice))
							return true;
				}
		}
		return false;
	}

	private boolean containsMethod(Interface interface1, Method method) {
		if(interface1.getMethodsList() != null && interface1.getMethodsList().size()>0){
			if(interface1.getMethodsList().contains(method)){
				return true;
			}
			else 
				for (int i = 0; i < interface1.getInnerModulesLength(); i++) {
					if(containsMethod(interface1.getInnerModulesList().get(i), method))
						return true;
				} 
		}
		return false;
	}

	private boolean containsContainer(NodeContainer interI, NodeContainer interJ) {
//		NodeContainer tmp = interI;
		if(interI.getInnerModulesList() != null && interI.getInnerModulesList().size()>0){
			if(interI.getInnerModulesList().contains(interJ)){
				return true;
			} else
				for (int k = 0; k < interI.getInnerModulesList().size(); k++) {
//					if(tmp.getInnerModulesList().get(k) instanceof NodeContainer)
					if(containsContainer(interI.getInnerModulesList().get(k), interJ))
						return true;
				}
		}
		return false;
	}

	/**
	 * Questo metodo serve a validare l'elemento indicato come nodo.<br>
	 * Sia esso un: package, classe, metodo, attributo, advice, pointcut, ...
	 * 
	 * @param source
	 * @return
	 */
	private boolean isValidElement(Node source) {
		if (source != null)
			return true;

		return false;
	}

	private void updateStatus(String message) {
		setErrorMessage(message);
		setPageComplete(message == null);
	}

	private String getQualifiedName(Node node) {
		String packageName;
		if (node instanceof Method) {
			Method method = (Method) node;
			packageName = method.getNodeContainer().getPackageName();
			if(!packageName.equals(""))
				packageName += ".";
			return packageName
				+ method.getNodeContainer().getName() + "." + method.getName();
			// + "." +method.getSignature();
		} else if (node instanceof Field) {
			Field field = (Field) node;
			packageName = field.getNodeContainer().getPackageName();
			if(!packageName.equals(""))
				packageName += ".";
			return packageName
				+ field.getNodeContainer().getName() + "." + field.getName();
		} else if (node instanceof Interface) {
			Interface interf = (Interface) node;
			packageName = interf.getPackageName();
			if(!packageName.equals(""))
				packageName += ".";
			return packageName 
				+ interf.getName();
		} else if (node instanceof Advice) {
			Advice advice = (Advice) node;
			packageName = advice.getNodeContainer().getPackageName();
			if(!packageName.equals(""))
				packageName += ".";
			return packageName
					+ advice.getNodeContainer().getName() + "."
					+ advice.getKind() + ":" + advice.getPointcutExpression();
		} else if (node instanceof Package) {
			it.unisannio.rcost.callgraphanalyzer.Package pack = (Package) node;
			NodeContainer n = pack.getNodeContainer();
			if (n == null){
				String packName = pack.getName(); 
				if(!packName.equals(""))
					return packName;
				else
					return "(default package)";
			}
			return n.getName() + "." + pack.getName();
		}
		return "";
	}

	/**
	 * questa classe e' un wrapper la calss org.eclipse.swt.widgets.List <br>
	 * In particolare gli Item di questa lista sono nodi
	 * 
	 */
	private class ListNodes {
		private List listIntermediary;
//		private java.util.Hashtable<Integer, Node> nodes;
		private java.util.List<Node> nodes;

		public ListNodes(Group groupHigh, int border) {
			listIntermediary = new List(groupHigh, border);
//			nodes = new Hashtable<Integer, Node>();
			nodes = new ArrayList<Node>();
		}

		public void setLayoutData(GridData gridData) {
			listIntermediary.setLayoutData(gridData);
		}

		public void addDisposeListener(DisposeListener listener) {
			listIntermediary.addDisposeListener(listener);
		}

		public void addSelectionListener(SelectionAdapter listener) {
			listIntermediary.addSelectionListener(listener);
		}

		public int getSelectionIndex() {
			return listIntermediary.getSelectionIndex();
		}

		public int indexOf(Node resultNode) {
			return listIntermediary.indexOf(getQualifiedName(resultNode));
		}

		public void add(Node node) {
			if (node != null) {
				String name = getQualifiedName(node);
				listIntermediary.add(name);
//				nodes.put(listIntermediary.indexOf(name), node);
				nodes.add(node);
			}
		}

		public Node[] getItems() {
//			java.util.List<Node> list = new ArrayList<Node>();
//			Enumeration<Node> e = nodes.elements();
//			while (e.hasMoreElements()) {
//				list.add((Node) e.nextElement());
//			}
//			return list.toArray(new Node[list.size()]);
			return nodes.toArray(new Node[nodes.size()]);
		}

		public void remove(int selIndex) {
			listIntermediary.remove(selIndex);
			nodes.remove(selIndex);
		}

		public Node getItem(int index) {
			return nodes.get(index);
		}

		public void setItem(int index, Node node) {
			listIntermediary.setItem(index, getQualifiedName(node));
//			nodes.put(index, node);
			nodes.set(index, node);
		}

		public void setSelection(int i) {
			listIntermediary.setSelection(i);
		}

		public void setItems(Node[] items) {
			for (int i = 0; i < items.length; i++) {
				add(items[i]);
			}
		}
	}
}