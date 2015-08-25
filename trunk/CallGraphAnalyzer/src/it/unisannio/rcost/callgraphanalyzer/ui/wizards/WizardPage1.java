package it.unisannio.rcost.callgraphanalyzer.ui.wizards;

import it.unisannio.rcost.callgraphanalyzer.Method;
import it.unisannio.rcost.callgraphanalyzer.dbmanagers.DBConnectionManager;
import it.unisannio.rcost.callgraphanalyzer.dbmanagers.MethodFacade;
import it.unisannio.rcost.callgraphanalyzer.util.Criteria;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jface.dialogs.IDialogPage;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.ProgressMonitorPart;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Shell;

/**
 * The "New" wizard page allows setting the container for the new file as well
 * as the file name. The page will only accept file name without the extension
 * OR with the extension that matches the expected one (callgraph).
 */

public class WizardPage1 extends org.eclipse.jface.wizard.WizardPage {
	private Criteria preferences = null;

	private String[] listProjects = new String[] { "" };

	private Group groupLow = null;

	private Group groupHigh = null;

	private CLabel cLabel = null;

	private CLabel lblProjects = null;

	private Button radioFull = null;

	private Button radioClass = null;

	private Button radioPackage = null;

	private Button radioMethod = null;

	private Button radioPartial = null;

	private CCombo cmbProjects = null;

	private Group groupMiddle = null;

	private CLabel cLabel1 = null;

	private CComboMains cmbMains;

	private CLabel lblMains;

	private boolean isAdvanced = false;

	/**
	 * Constructor for WizardPage.
	 * 
	 * @param pageName
	 */
	public WizardPage1(Criteria preferences) {
		super("wizardPage");
		setTitle("CallGraph Analyzer");
		setDescription("E' ora possibile determinare le dimensioni e il livello di dettaglio del grafo.");
		this.preferences = preferences;
	}

	public WizardPage1(Criteria criteria, boolean isAdvanced) {
		super("wizardPage");
		setTitle("CallGraph Analyzer");
		setDescription("E' ora possibile determinare le dimensioni e il livello di dettaglio del grafo.");
		this.preferences = criteria;
		this.isAdvanced = isAdvanced;
	}

	/**
	 * @see IDialogPage#createControl(Composite)
	 */
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);

		container.setLayout(new GridLayout());

		createGroupHigh(container);
		createGroupMiddle(container);
		createGroupLow(container);
		initialize();
		// dialogChanged();
		setPageComplete(false);
		setControl(container);
	}

	private void createGroupHigh(Composite container) {
		GridData gridData1 = new GridData();
		gridData1.grabExcessHorizontalSpace = true;
		gridData1.verticalAlignment = GridData.CENTER;
		gridData1.horizontalAlignment = GridData.FILL;
		GridData gridData2 = new GridData();
		gridData2.grabExcessHorizontalSpace = true;
		gridData2.horizontalAlignment = GridData.FILL;
		gridData2.verticalAlignment = GridData.CENTER;
		GridData gridData3 = new GridData();
		gridData3.grabExcessHorizontalSpace = true;
		gridData3.horizontalIndent = 5;
		GridData gridData4 = new GridData();
		gridData4.grabExcessHorizontalSpace = true;
		gridData4.horizontalIndent = 3;
		GridData gridData5 = new GridData();
		gridData5.widthHint = 240;
		GridData gridData6 = new GridData();
		gridData6.horizontalIndent = 0;
		gridData6.heightHint = -1;
		gridData6.widthHint = 250;

		groupHigh = new Group(container, SWT.NONE);
		groupHigh.setLayout(new GridLayout());
		// groupHigh.setLayoutData(gridData1);
		groupHigh.setLayoutData(gridData2);

		lblProjects = new CLabel(groupHigh, SWT.NONE);
		lblProjects.setText("Indicare il progetto da analizzare:");
		// lblProjects.setLayoutData(gridData3);
		lblProjects.setLayoutData(gridData4);
		cmbProjects = new CCombo(groupHigh, SWT.BORDER | SWT.FLAT
				| SWT.READ_ONLY);

		cmbProjects.setEditable(false);
		cmbProjects.setEnabled(true);
		cmbProjects.setLayoutData(gridData5);
		cmbProjects.setLayoutData(gridData6);
		cmbProjects.setBackground(Display.getCurrent().getSystemColor(
				SWT.COLOR_LIST_BACKGROUND));

		cmbProjects.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				super.widgetSelected(e);

				dialogChanged();
			}
		});
	}

	private void createGroupMiddle(Composite container) {

		GridData gridData1 = new GridData();
		gridData1.grabExcessHorizontalSpace = true;
		gridData1.horizontalAlignment = GridData.FILL;
		gridData1.verticalSpan = 3;
		gridData1.verticalAlignment = GridData.CENTER;
		GridData gridData2 = new GridData();
		gridData2.grabExcessHorizontalSpace = true;
		gridData2.verticalAlignment = GridData.CENTER;
		gridData2.horizontalIndent = 3;
		gridData2.horizontalAlignment = GridData.BEGINNING;
		GridData gridData3 = new GridData();
		gridData3.horizontalIndent = 3;
		GridData gridData4 = new GridData();
		gridData4.horizontalIndent = 3;
		GridData gridData5 = new GridData();
		gridData5.widthHint = 240;
		GridData gridData6 = new GridData();
		gridData6.horizontalIndent = 0;
		gridData6.heightHint = -1;
		gridData6.widthHint = 250;
		GridData gridData7 = new GridData();
		gridData7.horizontalIndent = 3;
		gridData7.verticalAlignment = GridData.CENTER;
		gridData7.horizontalAlignment = GridData.BEGINNING;
		gridData7.heightHint = -1;
		gridData7.widthHint = 400;

		groupMiddle = new Group(container, SWT.SHADOW_OUT);
		groupMiddle.setLayout(new GridLayout());
		groupMiddle.setLayoutData(gridData1);
		cLabel = new CLabel(groupMiddle, SWT.NONE);
		cLabel
				.setText("Selezionare una delle seguenti voci per indicare il tipo di grafo da visualizzare:");
		cLabel.setLayoutData(gridData2);
		radioFull = new Button(groupMiddle, SWT.RADIO);
		radioFull.setSelection(true);
		radioFull.setText("Completo");
		radioFull.setLayoutData(gridData3);

		radioFull.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				if (!cmbMains.isEnabled())
					cmbMains.setEnabled(true);

				dialogChanged();
			}
		});

		lblMains = new CLabel(groupMiddle, SWT.NONE);
		lblMains.setText("Indicare il main da considerare come nodo sorgente:");
		lblMains.setLayoutData(gridData7);

		cmbMains = new CComboMains(groupMiddle, SWT.BORDER | SWT.FLAT
				| SWT.READ_ONLY);

		cmbMains.setEditable(false);
		// cmbMains.setEnabled(true);
		cmbMains.setLayoutData(gridData5);
		cmbMains.setLayoutData(gridData6);
		cmbMains.setBackground(Display.getCurrent().getSystemColor(
				SWT.COLOR_LIST_BACKGROUND));
		cmbMains.setEnabled(false);
		cmbMains.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				super.widgetSelected(e);

				dialogChanged();
			}
		});

		radioPartial = new Button(groupMiddle, SWT.RADIO);
		radioPartial.setText("Parziale");
		radioPartial.setLayoutData(gridData7);

		radioPartial.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				cmbMains.setEnabled(false);
				dialogChanged();
			}
		});
	}

	public void setRadioCompletedGroupEnabled(boolean enabled) {
		radioPackage.setEnabled(enabled);
		radioClass.setEnabled(enabled);
		radioMethod.setEnabled(enabled);
	}

	private void initialize() {
		if (!isAdvanced) {

			IJavaProject[] javaProjects = null;

			try {
				javaProjects = JavaCore.create(
						ResourcesPlugin.getWorkspace().getRoot())
						.getJavaProjects();
			} catch (JavaModelException e) {
				e.printStackTrace();
			}

			if (javaProjects != null) {
				listProjects = new String[javaProjects.length];

				// listProjects[0] = "";

				for (int i = 0; i < javaProjects.length; i++) {
					listProjects[i] = javaProjects[i].getProject().getName();
				}
			}

			cmbProjects.setItems(listProjects);

			if (!this.preferences.isEmpty()) {
				String projectName = preferences.getProjectName();
				Criteria.GraphType graphType = preferences.getGraphType();

				if (projectName != null) {
					for (int i = 0; i < javaProjects.length; i++) {
						if (projectName.equals(listProjects[i])) {
							cmbProjects.select(i);

							break;
						}
					}
				}

				switch (graphType) {
				case FULL_CLASS:
					radioFull.setSelection(true);
					radioClass.setSelection(true);

					cmbMains.setEnabled(true);
					break;
				case FULL_PACKAGE:
					radioFull.setSelection(true);
					radioPackage.setSelection(true);

					cmbMains.setEnabled(true);
					break;
				case FULL_METHOD:
					radioFull.setSelection(true);
					radioMethod.setSelection(true);

					cmbMains.setEnabled(true);
					break;
				case PARTIAL_PACKAGE:
					radioPartial.setSelection(true);
					radioPackage.setSelection(true);

					cmbMains.setEnabled(false);
					break;
				case PARTIAL_CLASS:
					radioPartial.setSelection(true);
					radioClass.setSelection(true);

					cmbMains.setEnabled(false);
					break;
				case PARTIAL_METHOD:
					radioPartial.setSelection(true);
					radioMethod.setSelection(true);

					cmbMains.setEnabled(false);
					break;
				}
			}
		}// isAdvanced==true
		else {
			String[] items = { preferences.getProjectName() };
			cmbProjects.setItems(items);
			cmbProjects.select(0);
			radioFull.setSelection(false);
			radioPartial.setSelection(true);
			cmbMains.setEnabled(false);
			cmbMains.setItems(getMainsName(preferences.getProjectName()));
			isAdvanced = false;
			// cmbMains.setEnabled(true);
		}
	}

	/**
	 * Ensures that both text fields are set.
	 */
	private void dialogChanged() {
		String projectName = getProjectName();

		if (projectName == null || projectName.trim().length() == 0) {
			updateStatus("Indicare il nome di un progetto");

			return;
		} else if (!projectName.equals(preferences.getProjectName())) {
			preferences.setProjectName(projectName);

			IRunnableWithProgress op = new IRunnableWithProgress() {
				public void run(IProgressMonitor monitor)
						throws InvocationTargetException {

					String projectName = preferences.getProjectName();

					if (projectName != null)
						try {
							monitor.beginTask("Analisi del progetto... ", 1);
							DBConnectionManager.getInstance()
									.graphConstructionStarted(projectName);
							monitor.worked(1);

							monitor.beginTask("Lettura dei main... ", 2);

							cmbMains.setItems(getMainsName(projectName));
							// preferences.setSources(null);
							monitor.worked(2);
						} catch (RuntimeException e) {
							e.printStackTrace();

							throw new InvocationTargetException(e,
									"Database non connesso");
						} finally {
							DBConnectionManager.getInstance()
									.graphConstructionFinished(projectName);

							monitor.done();
						}
				}
			};

			try {
				getContainer().run(false, false, op);
			} catch (Exception e) {
				updateStatus("Errore durante l'analisi del progetto.");
				e.printStackTrace();
				return;
			}
		}

		if (this.radioFull.getSelection()) {
			cmbMains.setEnabled(true);

			Method selectedMain = getSelectedMain(projectName);

			if (selectedMain == null) {
				updateStatus("Indicare un main come nodo sorgente");

				return;
			}

			preferences.setSource(selectedMain);
			// preferences.setGraphType(Criteria.FULL);
			if (this.radioPackage.getSelection())
				preferences.setGraphType(Criteria.GraphType.FULL_PACKAGE);
			else if (this.radioClass.getSelection())
				preferences.setGraphType(Criteria.GraphType.FULL_CLASS);
			else if (this.radioMethod.getSelection())
				preferences.setGraphType(Criteria.GraphType.FULL_METHOD);
		} else {
			// preferences.setGraphType(Criteria.PARTIAL);
			if (this.radioPackage.getSelection())
				preferences.setGraphType(Criteria.GraphType.PARTIAL_PACKAGE);
			else if (this.radioClass.getSelection())
				preferences.setGraphType(Criteria.GraphType.PARTIAL_CLASS);
			else if (this.radioMethod.getSelection())
				preferences.setGraphType(Criteria.GraphType.PARTIAL_METHOD);
		}

		updateStatus(null);
	}

	public IWizardPage getNextPage() {
		if (this.radioFull != null && this.radioFull.getSelection()) {
			return null;
		}

		return super.getNextPage();
	}

	private void updateStatus(String message) {
		setErrorMessage(message);
		setPageComplete(message == null);
	}

	private String[][] getMainsName(String projectName) {
		if (projectName != null) {
			String[][] mainsNames = MethodFacade.facade
					.getPackageClassMainsName(projectName);
			if (mainsNames != null && mainsNames.length > 0)
				return mainsNames;
		}
		return new String[0][0];
	}

	private void createGroupLow(Composite container) {

		GridData gridData1 = new GridData();
		gridData1.grabExcessHorizontalSpace = true;
		gridData1.horizontalAlignment = GridData.FILL;
		gridData1.verticalSpan = 3;
		gridData1.verticalAlignment = GridData.CENTER;

		GridData gridData2 = new GridData();
		gridData2.grabExcessHorizontalSpace = true;
		gridData2.verticalAlignment = GridData.CENTER;
		gridData2.horizontalIndent = 3;
		gridData2.horizontalAlignment = GridData.BEGINNING;

		GridData gridData3 = new GridData();
		gridData3.grabExcessVerticalSpace = true;
		gridData3.horizontalIndent = 3;
		GridData gridData4 = new GridData();
		gridData4.grabExcessVerticalSpace = true;
		gridData4.horizontalIndent = 3;
		GridData gridData5 = new GridData();
		gridData5.grabExcessVerticalSpace = true;
		gridData5.horizontalIndent = 3;

		groupLow = new Group(container, SWT.SHADOW_OUT);
		groupLow.setLayout(new GridLayout());
		groupLow.setLayoutData(gridData1);

		cLabel1 = new CLabel(groupLow, SWT.NONE);
		cLabel1
				.setText("Selezionare il livello di dettaglio della visualizzazione:");
		cLabel1.setLayoutData(gridData2);

		radioPackage = new Button(groupLow, SWT.RADIO);
		radioClass = new Button(groupLow, SWT.RADIO);
		radioClass.setText("Classe/Aspetto");
		radioClass.setLayoutData(gridData4);
		radioClass.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				super.widgetSelected(e);

				dialogChanged();
			}
		});

		radioPackage.setText("Package");
		radioPackage.setLayoutData(gridData3);
		radioPackage.setSelection(true);
		radioPackage.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				super.widgetSelected(e);

				dialogChanged();
			}
		});

		radioMethod = new Button(groupLow, SWT.RADIO);
		radioMethod.setText("Metodo-Attributo/Advice-Pointcut");
		radioMethod.setLayoutData(gridData5);
		radioMethod.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				super.widgetSelected(e);

				dialogChanged();
			}
		});

	}

	private String getProjectName() {
		int index = this.cmbProjects.getSelectionIndex();

		if (index == -1)
			return null;

		return this.cmbProjects.getItem(index);
	}

	private Method getSelectedMain(String projectName) {
		int index = this.cmbMains.getSelectionIndex();

		if (index == -1)
			return null;

		String[] selectedName = this.cmbMains.getItemArray(index);

		return MethodFacade.facade.getMainByPackageTypeName(projectName,
				selectedName[1], selectedName[0]);
	}

	private class CComboMains {
		private CCombo combo = null;
		private String[][] mains;

		public CComboMains(Composite parent, int style) {
			combo = new CCombo(parent, style);
		}

		public int getSelectionIndex() {
			return combo.getSelectionIndex();
		}

		public void setItems(String[][] methods) {
			this.mains = methods;
			String[] items = new String[mains.length];
			for (int i = 0; i < items.length; i++) {
				items[i] = getItem(i);
			}

			combo.setItems(items);
		}

		public String getItem(int i) {
			String item;

			if (mains[i][0].equals(""))
				item = mains[i][1];
			else
				item = mains[i][0] + "." + mains[i][1];

			return item;
		}

		public String[] getItemArray(int index) {
			return new String[] { mains[index][0], mains[index][1] };
		}

		public boolean isEnabled() {
			return combo.isEnabled();
		}

		public void setEnabled(boolean b) {
			combo.setEnabled(b);
		}

		public void setEditable(boolean b) {
			combo.setEditable(b);
		}

		public void setLayoutData(GridData gridData5) {
			combo.setLayoutData(gridData5);
		}

		public void setBackground(Color systemColor) {
			combo.setBackground(systemColor);
		}

		public void addSelectionListener(SelectionAdapter selectionAdapter) {
			combo.addSelectionListener(selectionAdapter);
		}
	}
}