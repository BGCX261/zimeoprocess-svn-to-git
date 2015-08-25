/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unisannio.rcost.callgraphanalyzer.validation;

import it.unisannio.rcost.callgraphanalyzer.Field;
import it.unisannio.rcost.callgraphanalyzer.FlagsModifier;
import it.unisannio.rcost.callgraphanalyzer.Interface;
import it.unisannio.rcost.callgraphanalyzer.Method;

import it.unisannio.rcost.callgraphanalyzer.ScopeModifier;
import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link it.unisannio.rcost.callgraphanalyzer.Interface}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface InterfaceValidator {
	boolean validate();

	boolean validateMethods(EList<Method> value);

	boolean validateFields(EList<Field> value);

	boolean validateIsStatic(boolean value);

	boolean validateIsStrictFp(boolean value);

	boolean validateScopeModifier(ScopeModifier value);

	boolean validateFlagsModifier(FlagsModifier value);

	boolean validateInnerModules(EList<Interface> value);

	boolean validateScopeModifier(String value);

	boolean validateFlagsModifier(String value);

	boolean validateInner(EList<Interface> value);

	boolean validateId(int value);

	boolean validateCompilationUnit(String value);
}
