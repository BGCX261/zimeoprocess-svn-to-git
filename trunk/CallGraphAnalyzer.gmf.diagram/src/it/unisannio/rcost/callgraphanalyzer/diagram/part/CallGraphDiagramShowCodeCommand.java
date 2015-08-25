package it.unisannio.rcost.callgraphanalyzer.diagram.part;

import it.unisannio.rcost.callgraphanalyzer.Advice;
import it.unisannio.rcost.callgraphanalyzer.Field;
import it.unisannio.rcost.callgraphanalyzer.Graph;
import it.unisannio.rcost.callgraphanalyzer.Method;
import it.unisannio.rcost.callgraphanalyzer.NodeContainer;
import it.unisannio.rcost.callgraphanalyzer.NodeLeaf;
import it.unisannio.rcost.callgraphanalyzer.Package;
import it.unisannio.rcost.callgraphanalyzer.util.CallGraphDiagramRegistry;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.IHandlerListener;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaModel;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IMember;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.ui.JavaUI;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.FileEditorInput;

public class CallGraphDiagramShowCodeCommand implements IHandler, IObjectActionDelegate {

	public void addHandlerListener(IHandlerListener handlerListener) {
	}

	public void dispose() {
	}
	
	public Object execute(ExecutionEvent event) throws ExecutionException {
		actionCode();
		return null;
	}

	public void run(IAction action) {
		actionCode();
	}
	
	public void actionCode() {
		ISelection selection = CallGraphDiagramEditorPlugin.getInstance().getWorkbench().getActiveWorkbenchWindow()
				.getSelectionService().getSelection();
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			if (structuredSelection.size() != 1) {
				return;
			}

			EditPart selectedElement = (EditPart) structuredSelection.getFirstElement();
			if (structuredSelection.getFirstElement() instanceof EditPart
					&& selectedElement.getModel() instanceof View) {
				EObject modelElement = ((View) (selectedElement).getModel()).getElement();
//				System.out.println("Azione invocata sul nodo: " + modelElement);
				Diagram d = (Diagram) selectedElement.getViewer().getContents().getModel();
				
				Graph graph = CallGraphDiagramRegistry.getInstance().getGraph(d.getName());

				if(graph == null) {
					return;
				}
					
				String packageName = null;
				String typeName = null;
				String projectName = graph.getCriteria().getProjectName();
				String[] signatures = null;
				String memberName = null;
				
				if(modelElement instanceof NodeContainer && !(modelElement instanceof Package)) {
					typeName = ((NodeContainer) modelElement).getName();
					packageName = ((NodeContainer) modelElement).getPackageName();
				} else if(modelElement instanceof NodeLeaf) {
					NodeLeaf node = (NodeLeaf) modelElement;
					typeName = node.getNodeContainer().getName();
					memberName = node.getName();
					packageName = node.getNodeContainer().getPackageName(); 
				} else{
					MessageDialog.openInformation(new Shell(), "", "Impossibile visualizzare il codice sorgente per l'elemento selezionato");
					return;
				}
				
				try {
					IType iType = findJavaType(typeName, packageName, projectName);
					IMember member = null;
					
					if(memberName != null) {
						if(modelElement instanceof Method)
							member = iType.getMethod(memberName, signatures);
						else if(modelElement instanceof Field)
							member = iType.getField(memberName);
						else if(modelElement instanceof Advice);
					}
					
					openJava((member != null) ? member : iType);
				} catch (JavaModelException exc) {
					exc.printStackTrace();
				} catch (PartInitException exc) {
					exc.printStackTrace();
				} catch (Exception exc) {
					exc.printStackTrace();
				}
				
//				openEditor(projectName, packageName, name);
			}
		}
	}

	private void openEditor(String projectName, String packageName, String name) {
		try {
			IWorkbench workbench = CallGraphDiagramEditorPlugin.getInstance().getWorkbench();
			IWorkbenchPage page = workbench.getActiveWorkbenchWindow().getActivePage();
			
			IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
			if(project != null) {
				IJavaProject javaProject = (IJavaProject) project.getNature(JavaCore.NATURE_ID);
				
				IType type = javaProject.findType(packageName, name);
				
				IEditorDescriptor desc = workbench.getEditorRegistry().getDefaultEditor(type.getPath().toOSString());
				
				if(desc != null) {
					IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(type.getPath());
					
					IEditorPart part = page.openEditor(new FileEditorInput(file), desc.getId());
					
					part.setFocus();
				}
			}
		} catch (JavaModelException exc) {
			exc.printStackTrace();
		} catch (PartInitException exc) {
			exc.printStackTrace();
		} catch (Exception exc) {
			exc.printStackTrace();
		}
	}

	public boolean isEnabled() {
		ISelection selection = CallGraphDiagramEditorPlugin.getInstance().getWorkbench().getActiveWorkbenchWindow()
		.getSelectionService().getSelection();
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			if (structuredSelection.size() != 1) {
				return false;
			}
		
			EditPart selectedElement = (EditPart) structuredSelection.getFirstElement();
			if (structuredSelection.getFirstElement() instanceof EditPart
					&& selectedElement.getModel() instanceof View) {
				Diagram d = (Diagram) selectedElement.getViewer().getContents().getModel();
				
				return null != CallGraphDiagramRegistry.getInstance().getGraph(d.getName());
			}
		}

		return false;
	}

	public boolean isHandled() {
		return true;
	}

	public void removeHandlerListener(IHandlerListener handlerListener) {
	}

	public void selectionChanged(IAction action, ISelection selection) {
	}
	
	/**
     * Finds IType for given name in given project.
     * 
     * @param typeName
     * @return
     * @throws JavaModelException
     */
	private IType findJavaType(String typeName, IProject project) throws JavaModelException {
        if (typeName == null) {
            return null;
        }
        
        IJavaModel model = JavaCore.create(ResourcesPlugin.getWorkspace().getRoot());
        
        return model.getJavaProject(project.getName()).findType(typeName);
    }
	
	private IType findJavaType(String typeName, String packageName, IProject project) throws JavaModelException {
        if (typeName == null) {
            return null;
        }
        
        IJavaModel model = JavaCore.create(ResourcesPlugin.getWorkspace().getRoot());
        
        return model.getJavaProject(project.getName()).findType(packageName, typeName);
    }
	
	private IType findJavaType(String typeName, String packageName, String projectName) throws JavaModelException {
        if (typeName == null) {
            return null;
        }
        
        IJavaModel model = JavaCore.create(ResourcesPlugin.getWorkspace().getRoot());
        
        return model.getJavaProject(projectName).findType(packageName, typeName);
    }
 
    /**
     * Opens source file of given type.
     *
     * @param type class whose source should be opened
     * @return whether editor with source was opened
     * @throws JavaModelException
     * @throws PartInitException
     */
    protected boolean openJavaType(IType type) throws JavaModelException, PartInitException {
        return openJava(type);
    }

    /**
     * Opens source file of given method.
     *
     * @param method method whose source should be opened
     * @return whether editor with source was opened
     * @throws JavaModelException
     * @throws PartInitException
     */
    protected boolean openJavaMethod(IMethod method) throws JavaModelException, PartInitException {
        return openJava(method);
    }

    /**
     * Opens source file of given memeber.
     *
     * @param memeber member whose source should be opened
     * @return whether editor with source was opened
     * @throws JavaModelException
     * @throws PartInitException
     */
    protected boolean openJava(IMember member) throws JavaModelException, PartInitException {
        IJavaElement je;
        if (! member.isBinary()) {
            je = member.getCompilationUnit();
        } else {
            je = member.getClassFile();
        }
        IEditorPart javaEditor = JavaUI.openInEditor(je);

        if (javaEditor == null) {
            return false;
        } else {
            JavaUI.revealInEditor(javaEditor, (IJavaElement) member);
            return true;
        }
    }

	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
//		action.setEnabled(!isEnabled());
//		System.out.println();
	}
}
