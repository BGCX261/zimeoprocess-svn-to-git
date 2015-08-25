/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unisannio.rcost.callgraphanalyzer.validation;

import it.unisannio.rcost.callgraphanalyzer.JoinPointShadow;


/**
 * A sample validator interface for {@link it.unisannio.rcost.callgraphanalyzer.ImplicitCall}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ImplicitCallValidator {
	boolean validate();

	boolean validateJoinPointShadow(JoinPointShadow value);

	boolean validateJoinPointShadowType(String value);

}
