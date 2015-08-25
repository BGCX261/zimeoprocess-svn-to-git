package it.unisannio.rcost.callgraphanalyzer.ui.wizards;

import it.unisannio.rcost.callgraphanalyzer.Advice;
import it.unisannio.rcost.callgraphanalyzer.Aspect;
import it.unisannio.rcost.callgraphanalyzer.Class;
import it.unisannio.rcost.callgraphanalyzer.Field;
import it.unisannio.rcost.callgraphanalyzer.Interface;
import it.unisannio.rcost.callgraphanalyzer.Method;
import it.unisannio.rcost.callgraphanalyzer.Node;
import it.unisannio.rcost.callgraphanalyzer.Package;
import it.unisannio.rcost.callgraphanalyzer.provider.CallGraphItemProviderAdapterFactory;
import it.unisannio.rcost.callgraphanalyzer.provider.NodeItemProvider;

import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;

public class ProjectLabelProvider implements ILabelProvider{

	public Image getImage(Object element) {
		CallGraphItemProviderAdapterFactory factory = new CallGraphItemProviderAdapterFactory();
		NodeItemProvider provider = new NodeItemProvider(factory);
		Object o = null;
		if(element instanceof Package){
			o = provider.getImage("full/obj16/Package");
		}
		else if(element instanceof Method){
			o = provider.getImage("full/obj16/Method");
			
		}
		else if(element instanceof Advice){
			o = provider.getImage("full/obj16/Advice");
		}
		else if(element instanceof Aspect){
			o = provider.getImage("full/obj16/Aspect");
		}
		else if(element instanceof Class){
			o = provider.getImage("full/obj16/Class");
		}
		else if(element instanceof Interface){
			o = provider.getImage("full/obj16/Interface");
		}
		else if(element instanceof Field){
			o = provider.getImage("full/obj16/Field");
		}
		else
			return null;
		Image i = org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry.INSTANCE.getImage(o);
		return i;
	}

	public String getText(Object element) {
		Node n = (Node) element;
		if(n instanceof Package && n.getName().equals(""))
			return "(default package)";
		else if(n instanceof Advice){
			Advice adv = (Advice) n;
			return adv.getKind() + ":" +adv.getPointcutExpression();
		}
		return n.getName();
	}

	public void addListener(ILabelProviderListener listener) {
		
	}

	public void dispose() {
		
	}

	public boolean isLabelProperty(Object element, String property) {
		return false;
	}

	public void removeListener(ILabelProviderListener listener) {
	}
	
}