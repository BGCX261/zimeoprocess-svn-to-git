/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unisannio.rcost.callgraphanalyzer.validation;

import it.unisannio.rcost.callgraphanalyzer.Aspect;
import it.unisannio.rcost.callgraphanalyzer.Interface;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link it.unisannio.rcost.callgraphanalyzer.Package}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface PackageValidator {
	boolean validate();

	boolean validateInnerModules(EList<Interface> value);

	boolean validateAspects(EList<Aspect> value);
	boolean validateInterfaces(EList<Interface> value);
	boolean validatePackages(EList<it.unisannio.rcost.callgraphanalyzer.Package> value);
	boolean validateClasses(EList<it.unisannio.rcost.callgraphanalyzer.Class> value);
}