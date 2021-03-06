/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unisannio.rcost.callgraphanalyzer.validation;

import it.unisannio.rcost.callgraphanalyzer.FlagsModifier;
import it.unisannio.rcost.callgraphanalyzer.ScopeModifier;


/**
 * A sample validator interface for {@link it.unisannio.rcost.callgraphanalyzer.Method}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface MethodValidator {
	boolean validate();

	boolean validateIsStrictFp(boolean value);

	boolean validateIsStatic(boolean value);

	boolean validateIsNative(boolean value);

	boolean validateIsSynchronized(boolean value);

	boolean validateScopeModifier(ScopeModifier value);

	boolean validateFlagsModifier(FlagsModifier value);

	boolean validateSignature(String value);

	boolean validateIsMain(boolean value);

	boolean validateScopeModifier(String value);

	boolean validateFlagsModifier(String value);

}
