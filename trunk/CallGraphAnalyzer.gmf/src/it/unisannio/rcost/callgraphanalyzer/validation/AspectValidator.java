/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unisannio.rcost.callgraphanalyzer.validation;

import it.unisannio.rcost.callgraphanalyzer.Advice;
import it.unisannio.rcost.callgraphanalyzer.Pointcut;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link it.unisannio.rcost.callgraphanalyzer.Aspect}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface AspectValidator {
	boolean validate();

	boolean validatePointcuts(EList<Pointcut> value);
	boolean validateAdvices(EList<Advice> value);
}