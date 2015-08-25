package it.unisannio.rcost.callgraphanalyzer.diagram.navigator;

import it.unisannio.rcost.callgraphanalyzer.diagram.part.CallGraphVisualIDRegistry;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class CallGraphNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 5013;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof CallGraphNavigatorItem) {
			CallGraphNavigatorItem item = (CallGraphNavigatorItem) element;
			return CallGraphVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
