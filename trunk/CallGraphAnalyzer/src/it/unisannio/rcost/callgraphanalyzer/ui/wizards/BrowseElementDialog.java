package it.unisannio.rcost.callgraphanalyzer.ui.wizards;

import it.unisannio.rcost.callgraphanalyzer.extractors.CallGraphProvider;

import org.eclipse.jface.viewers.ILabelProvider;

import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;//ElementListSelectionDialog;

public class BrowseElementDialog extends ElementTreeSelectionDialog {//ElementListSelectionDialog {

	
	public BrowseElementDialog(Shell parent, ILabelProvider elementRenderer, String projectName) {
		super(parent, elementRenderer, CallGraphProvider.getInstance(projectName));
		
		initialize(CallGraphProvider.getInstance(projectName));
	}

	private void initialize(CallGraphProvider provider) {
		this.setTitle("Seleziona un nodo...");
		this.setEmptyListMessage("Nessun elemento.");
		this.setDoubleClickSelects(true);
		this.setAllowMultiple(false);
	
		this.setInput(provider.getProject());
		
//		this.setInput(CallGraphProvider.getTestProject());

//		this.setMatchEmptyString(false);
//		this.setIgnoreCase(false);
//		IJavaProject javaProject = JavaCore.create(ResourcesPlugin.getWorkspace().getRoot())
//				.getJavaProject(projectName);
//		this.setElements(getIJavaElements(javaProject));
	}

//	private IJavaElement[] getIJavaElements(IJavaProject javaProject) {
//		IJavaElement[] javaElements = null;
//		Vector<IJavaElement> vector = new Vector<IJavaElement>();
//
//		try {
//			IPackageFragment[] packageFragments = javaProject.getPackageFragments();
//
//			for (int i = 0; i < packageFragments.length; i++) {
//				vector.add(packageFragments[i]);
//
//				ICompilationUnit[] compilationUnits = packageFragments[i].getCompilationUnits();
//				if (compilationUnits != null)
//					for (int j = 0; j < compilationUnits.length; j++) {
//						for (int k = 0; k < compilationUnits.length; k++) {
//							IType[] types = compilationUnits[j].getAllTypes();
//
//							for (int l = 0; l < types.length; l++) {
//								if (!(types[l] instanceof ICompilationUnit)) {
//									vector.add(types[l]);
//
//									IField[] fields = types[l].getFields();
//									if (fields != null)
//										for (int m = 0; m < fields.length; m++) {
//											vector.add(fields[m]);
//										}
//
//									IMethod[] methods = types[l].getMethods();
//									if (methods != null)
//										for (int m = 0; m < methods.length; m++) {
//											vector.add(methods[m]);
//										}
//								}
//							}
//						}
//					}
//			}
//
//			javaElements = vector.toArray(new IJavaElement[vector.size()]);
//		} catch (JavaModelException e) {
//		}
//
//		return javaElements;
//	}
}
