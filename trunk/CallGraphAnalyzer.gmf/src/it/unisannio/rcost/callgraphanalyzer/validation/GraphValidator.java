/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unisannio.rcost.callgraphanalyzer.validation;

import it.unisannio.rcost.callgraphanalyzer.Graph;
import it.unisannio.rcost.callgraphanalyzer.Node;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link it.unisannio.rcost.callgraphanalyzer.Graph}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface GraphValidator {
	boolean validate();

	boolean validateNodes(EList<Node> value);

	boolean validateFirstLevelGraph(Graph value);
}