package it.unisannio.rcost.callgraphanalyzer.diagram.part;

import it.unisannio.rcost.callgraphanalyzer.diagram.navigator.CallGraphNavigatorItem;
import it.unisannio.rcost.callgraphanalyzer.util.CallGraphDiagramRegistry;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gmf.runtime.common.ui.services.marker.MarkerNavigationService;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.diagram.ui.actions.ActionIds;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.properties.views.IReadOnlyDiagramPropertySheetPageContributor;
import org.eclipse.gmf.runtime.diagram.ui.render.editparts.RenderedDiagramRootEditPart;
import org.eclipse.gmf.runtime.diagram.ui.requests.ArrangeRequest;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.document.IDiagramDocument;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.document.IDocument;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.document.IDocumentProvider;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.parts.DiagramDocumentEditor;
import org.eclipse.gmf.runtime.diagram.ui.services.layout.LayoutType;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorMatchingStrategy;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.SaveAsDialog;
import org.eclipse.ui.ide.IGotoMarker;
import org.eclipse.ui.navigator.resources.ProjectExplorer;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.part.IShowInTargetList;
import org.eclipse.ui.part.ShowInContext;

/**
 * @generated
 */
public class CallGraphDiagramEditor extends DiagramDocumentEditor implements
		IReadOnlyDiagramPropertySheetPageContributor, IGotoMarker {

	/**
	 * @generated
	 */
	public static final String ID = "it.unisannio.rcost.callgraphanalyzer.diagram.part.CallGraphDiagramEditorID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final String CONTEXT_ID = "it.unisannio.rcost.callgraphanalyzer.diagram.ui.diagramContext"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public CallGraphDiagramEditor() {
		super(true);
	}

	@Override
	public void dispose() {
//		Object diagramObj = getDiagram();
//		
//		if(diagramObj != null && diagramObj instanceof Diagram) {
//			Diagram diagram = (Diagram) diagramObj;
//			Resource model = diagram.eResource();
//	
//			try {
//				IFile file = WorkspaceSynchronizer.getFile(model);
//				
//				super.dispose();
//				
//				if (file != null){
//					file.delete(true, null);
////					super.close(false);
//				}
//			} catch (CoreException e) {
//				e.printStackTrace();
//			} finally {
//				CallGraphDiagramRegistry.getInstance().removeDiagram(diagram);
//			}
//		} else
		Object diagramObj = getDiagram();
		if(diagramObj != null && diagramObj instanceof Diagram){ 
			super.dispose();
			try{
				CallGraphDiagramRegistry.getInstance().removeGraph((Diagram) diagramObj);
			}catch(Exception e){
				
			}
		}
	}
	
	@Override
	public void createPartControl(Composite parent) {
//		if(parent != null) {
//			try {
				super.createPartControl(parent);
				arrangeAll();
//			}catch (Exception e) {
//				try {
//					super.close(false);
//				}catch (Exception e1) {
//					e.printStackTrace();
//				}
//			}
//		}
	}
	
	private void arrangeAll() {
		// inizio Command Arrange
		ArrangeRequest arrangeRequest = new ArrangeRequest(
				ActionIds.ACTION_ARRANGE_ALL, LayoutType.DEFAULT);

		DiagramEditPart diagramEditPart = getDiagramEditPart();
		RenderedDiagramRootEditPart root = (RenderedDiagramRootEditPart) diagramEditPart
				.getRoot();

		try {

			Command arrangeCmd = root.getContents().getCommand(arrangeRequest);
			arrangeCmd.execute();
			root.refresh();

		} catch (NullPointerException e) {
			CallGraphDiagramEditorPlugin.getInstance().logError(
					"Unable to arrange the diagram", e);
		}
		// fine Arrange
	}
	
	/**
	 * @generated
	 */
	protected String getContextID() {
		return CONTEXT_ID;
	}

	/**
	 * @generated
	 */
	protected PaletteRoot createPaletteRoot(PaletteRoot existingPaletteRoot) {
		PaletteRoot root = super.createPaletteRoot(existingPaletteRoot);
		new CallGraphPaletteFactory().fillPalette(root);
		return root;
	}

	/**
	 * @generated
	 */
	protected PreferencesHint getPreferencesHint() {
		return CallGraphDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT;
	}

	/**
	 * @generated
	 */
	public String getContributorId() {
		return CallGraphDiagramEditorPlugin.ID;
	}

	/**
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public Object getAdapter(Class type) {
		if (type == IShowInTargetList.class) {
			return new IShowInTargetList() {
				public String[] getShowInTargetIds() {
					return new String[] { ProjectExplorer.VIEW_ID };
				}
			};
		}
		return super.getAdapter(type);
	}

	/**
	 * @generated
	 */
	protected IDocumentProvider getDocumentProvider(IEditorInput input) {
		if (input instanceof IFileEditorInput || input instanceof URIEditorInput) {
			return CallGraphDiagramEditorPlugin.getInstance().getDocumentProvider();
		}
		return super.getDocumentProvider(input);
	}

	/**
	 * @generated
	 */
	public TransactionalEditingDomain getEditingDomain() {
		IDocument document = getEditorInput() != null ? getDocumentProvider().getDocument(
				getEditorInput()) : null;
		if (document instanceof IDiagramDocument) {
			return ((IDiagramDocument) document).getEditingDomain();
		}
		return super.getEditingDomain();
	}

	/**
	 * @generated
	 */
	protected void setDocumentProvider(IEditorInput input) {
		if (input instanceof IFileEditorInput || input instanceof URIEditorInput) {
			setDocumentProvider(CallGraphDiagramEditorPlugin.getInstance().getDocumentProvider());
		} else {
			super.setDocumentProvider(input);
		}
	}

	/**
	 * @generated
	 */
	public void gotoMarker(IMarker marker) {
		MarkerNavigationService.getInstance().gotoMarker(this, marker);
	}

	/**
	 * @generated
	 */
	public boolean isSaveAsAllowed() {
		return false;
	}

	@Override
	public boolean isEditable() {
		return true;
	}

	/**
	 * @generated
	 */
	public void doSaveAs() {
		performSaveAs(new NullProgressMonitor());
	}

	/**
	 * @generated
	 */
	protected void performSaveAs(IProgressMonitor progressMonitor) {
		Shell shell = getSite().getShell();
		IEditorInput input = getEditorInput();
		SaveAsDialog dialog = new SaveAsDialog(shell);
		IFile original = input instanceof IFileEditorInput ? ((IFileEditorInput) input).getFile()
				: null;
		if (original != null) {
			dialog.setOriginalFile(original);
		}
		dialog.create();
		IDocumentProvider provider = getDocumentProvider();
		if (provider == null) {
			// editor has been programmatically closed while the dialog was open
			return;
		}
		if (provider.isDeleted(input) && original != null) {
			String message = NLS.bind(Messages.CallGraphDiagramEditor_SavingDeletedFile, original
					.getName());
			dialog.setErrorMessage(null);
			dialog.setMessage(message, IMessageProvider.WARNING);
		}
		if (dialog.open() == Window.CANCEL) {
			if (progressMonitor != null) {
				progressMonitor.setCanceled(true);
			}
			return;
		}
		IPath filePath = dialog.getResult();
		if (filePath == null) {
			if (progressMonitor != null) {
				progressMonitor.setCanceled(true);
			}
			return;
		}
		IWorkspaceRoot workspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
		IFile file = workspaceRoot.getFile(filePath);
		final IEditorInput newInput = new FileEditorInput(file);
		// Check if the editor is already open
		IEditorMatchingStrategy matchingStrategy = getEditorDescriptor()
				.getEditorMatchingStrategy();
		IEditorReference[] editorRefs = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
				.getActivePage().getEditorReferences();
		for (int i = 0; i < editorRefs.length; i++) {
			if (matchingStrategy.matches(editorRefs[i], newInput)) {
				MessageDialog.openWarning(shell, Messages.CallGraphDiagramEditor_SaveAsErrorTitle,
						Messages.CallGraphDiagramEditor_SaveAsErrorMessage);
				return;
			}
		}
		boolean success = false;
		try {
			provider.aboutToChange(newInput);
			getDocumentProvider(newInput).saveDocument(progressMonitor, newInput,
					getDocumentProvider().getDocument(getEditorInput()), true);
			success = true;
		} catch (CoreException x) {
			IStatus status = x.getStatus();
			if (status == null || status.getSeverity() != IStatus.CANCEL) {
				ErrorDialog.openError(shell, Messages.CallGraphDiagramEditor_SaveErrorTitle,
						Messages.CallGraphDiagramEditor_SaveErrorMessage, x.getStatus());
			}
		} finally {
			provider.changed(newInput);
			if (success) {
				setInput(newInput);
			}
		}
		if (progressMonitor != null) {
			progressMonitor.setCanceled(!success);
		}
	}

	/**
	 * @generated
	 */
	public ShowInContext getShowInContext() {
		return new ShowInContext(getEditorInput(), getNavigatorSelection());
	}

	/**
	 * @generated
	 */
	private ISelection getNavigatorSelection() {
		IDiagramDocument document = getDiagramDocument();
		if (document == null) {
			return StructuredSelection.EMPTY;
		}
		Diagram diagram = document.getDiagram();
		IFile file = WorkspaceSynchronizer.getFile(diagram.eResource());
		if (file != null) {
			CallGraphNavigatorItem item = new CallGraphNavigatorItem(diagram, file, false);
			return new StructuredSelection(item);
		}
		return StructuredSelection.EMPTY;
	}
	
	@Override
	public void setInput(IEditorInput input) {
		
//		if(!((FileEditorInput)input).exists() || !((FileEditorInput)input).getFile().exists())
//			try {
//				doSetInput(null, true);
//			} catch (CoreException e) {
//				e.printStackTrace();
//			}
//		else
			super.setInput(input);
			
//		else{
//			IFile file = ((FileEditorInput)input).getFile();
//			File newFile = new File(file.getLocation().toOSString());
//			try {
//				
//				System.out.println(file.getLocation().toOSString());
//				PrintStream ps = new PrintStream(newFile);
//				ps.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?> " 
//+ "<xmi:XMI xmi:version=\"2.0\" xmlns:xmi=\"http://www.omg.org/XMI\" xmlns:CallGraphAnalyzer=\"callgraphanalyzer\" xmlns:notation=\"http://www.eclipse.org/gmf/runtime/1.0.1/notation\">"
//+ "<CallGraphAnalyzer:Graph xmi:id=\"_bf9g4D6iEd2OIf5BjdUBOQ\"/>"
//+ " <notation:Diagram xmi:id=\"_bgGq0D6iEd2OIf5BjdUBOQ\" type=\"CallGraph\" element=\"_bf9g4D6iEd2OIf5BjdUBOQ\" " +
//		"name=\"" + file.getName() +"\" measurementUnit=\"Pixel\">"
//+ "    <styles xmi:type=\"notation:DiagramStyle\" xmi:id=\"_bgGq0T6iEd2OIf5BjdUBOQ\"/>"
//+ "  </notation:Diagram>"
//+ " </xmi:XMI>");
//				ps.flush();
//				ps.close();
////				
//				super.setInput(input);
////				closeEditor(false);
				
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		}
	}
	
	@Override
	public boolean isSaveOnCloseNeeded() {
		return false;
	}
	
	@Override
	public boolean isDirty() {
		return false;
	}
}
