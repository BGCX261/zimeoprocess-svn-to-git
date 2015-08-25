package it.unisannio.rcost.callgraphanalyzer.extractors;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaModelException;

public class Utilities {
	public static org.eclipse.jdt.core.IType findByFullyQualifiedName(String projectName, String packageName, String typeQualifiedName) {
		try {
			IJavaProject project = (IJavaProject) ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
			
			return project.findType(packageName, typeQualifiedName);
		} catch (JavaModelException exc) {
			exc.printStackTrace();
		}
		
		return null;
	}
}
