/*******************************************************************************
 * Copyright (c) 2006 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package it.unisannio.rcost.callgraphanalyzer.ui.perspectives;

import org.eclipse.jdt.ui.JavaUI;
import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;
import org.eclipse.ui.console.IConsoleConstants;


/**
 *  This class is meant to serve as an example for how various contributions 
 *  are made to a perspective. Note that some of the extension point id's are
 *  referred to as API constants while others are hardcoded and may be subject 
 *  to change. 
 */
public class CallGraphAnalyzerPerspective implements IPerspectiveFactory {
	private IPageLayout factory;

	public CallGraphAnalyzerPerspective() {
		super();
	}

	public void createInitialLayout(IPageLayout factory) {
		this.factory = factory;
		addViews();
		addActionSets();
		addNewWizardShortcuts();
		addPerspectiveShortcuts();
		addViewShortcuts();
	}

	private void addViews() {
		IFolderLayout topLeft =
			factory.createFolder(
				"topLeft", //NON-NLS-1
				IPageLayout.LEFT,
				0.21f,
				factory.getEditorArea());
		topLeft.addView(IPageLayout.ID_RES_NAV); //Resource navigator
		topLeft.addView(IPageLayout.ID_NAVIGATE_ACTION_SET); //navigate action set
		topLeft.addView(JavaUI.ID_PACKAGES); //Browsing Packages
		
		IFolderLayout bottom =
			factory.createFolder(
				"bottom", //NON-NLS-1
				IPageLayout.BOTTOM,
				0.80f,
				factory.getEditorArea());
		bottom.addView(IPageLayout.ID_PROP_SHEET); //Property Sheet
		bottom.addPlaceholder(IConsoleConstants.ID_CONSOLE_VIEW);

		IFolderLayout right =
			factory.createFolder(
				"right", //NON-NLS-1
				IPageLayout.RIGHT,
				0.75f,
				factory.getEditorArea());
		right.addView(IPageLayout.ID_OUTLINE); //Content Outline
	}

	private void addActionSets() {
//		factory.addActionSet("org.eclipse.debug.ui.launchActionSet"); //NON-NLS-1
//		factory.addActionSet("org.eclipse.debug.ui.debugActionSet"); //NON-NLS-1
//		factory.addActionSet("org.eclipse.debug.ui.profileActionSet"); //NON-NLS-1
//		factory.addActionSet("org.eclipse.jdt.debug.ui.JDTDebugActionSet"); //NON-NLS-1
//		factory.addActionSet("org.eclipse.jdt.junit.JUnitActionSet"); //NON-NLS-1
//		factory.addActionSet("org.eclipse.team.ui.actionSet"); //NON-NLS-1
//		factory.addActionSet("org.eclipse.team.cvs.ui.CVSActionSet"); //NON-NLS-1
//		factory.addActionSet("org.eclipse.ant.ui.actionSet.presentation"); //NON-NLS-1
//		factory.addActionSet(JavaUI.ID_ACTION_SET);
//		factory.addActionSet(JavaUI.ID_ELEMENT_CREATION_ACTION_SET);
//		factory.addActionSet(IPageLayout.ID_NAVIGATE_ACTION_SET); //NON-NLS-1
	}

	private void addPerspectiveShortcuts() {
//		factory.addPerspectiveShortcut("org.eclipse.team.ui.TeamSynchronizingPerspective"); //NON-NLS-1
//		factory.addPerspectiveShortcut("org.eclipse.team.cvs.ui.cvsPerspective"); //NON-NLS-1
//		factory.addPerspectiveShortcut("org.eclipse.ui.resourcePerspective"); //NON-NLS-1
	}

	private void addNewWizardShortcuts() {
//		factory.addNewWizardShortcut("org.eclipse.team.cvs.ui.newProjectCheckout");//NON-NLS-1
//		factory.addNewWizardShortcut("org.eclipse.ui.wizards.new.folder");//NON-NLS-1
//		factory.addNewWizardShortcut("org.eclipse.ui.wizards.new.file");//NON-NLS-1
	}

	private void addViewShortcuts() {
//		factory.addShowViewShortcut("org.eclipse.ant.ui.views.AntView"); //NON-NLS-1
//		factory.addShowViewShortcut("org.eclipse.team.ccvs.ui.AnnotateView"); //NON-NLS-1
//		factory.addShowViewShortcut("org.eclipse.pde.ui.DependenciesView"); //NON-NLS-1
//		factory.addShowViewShortcut("org.eclipse.jdt.junit.ResultView"); //NON-NLS-1
//		factory.addShowViewShortcut("org.eclipse.team.ui.GenericHistoryView"); //NON-NLS-1
//		factory.addShowViewShortcut(IConsoleConstants.ID_CONSOLE_VIEW);
//		factory.addShowViewShortcut(JavaUI.ID_PACKAGES);
//		factory.addShowViewShortcut(IPageLayout.ID_RES_NAV);
//		factory.addShowViewShortcut(IPageLayout.ID_PROBLEM_VIEW);
//		factory.addShowViewShortcut(IPageLayout.ID_OUTLINE);
	}

}
