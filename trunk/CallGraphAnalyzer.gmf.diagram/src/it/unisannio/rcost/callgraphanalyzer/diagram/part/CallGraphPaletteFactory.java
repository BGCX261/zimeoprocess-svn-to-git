package it.unisannio.rcost.callgraphanalyzer.diagram.part;

import it.unisannio.rcost.callgraphanalyzer.diagram.providers.CallGraphElementTypes;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.PaletteSeparator;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;

/**
 * @generated
 */
public class CallGraphPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createCallGraphAnalyzer1Group());
	}

	/**
	 * Creates "CallGraphAnalyzer" palette tool group
	 * @generated
	 */
	private PaletteContainer createCallGraphAnalyzer1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(Messages.CallGraphAnalyzer1Group_title);
		paletteContainer.add(createContenitori1Group());
		paletteContainer.add(createElementi2Group());
		paletteContainer.add(createCollegamenti3Group());
		return paletteContainer;
	}

	/**
	 * Creates "Contenitori" palette tool group
	 * @generated
	 */
	private PaletteContainer createContenitori1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(Messages.Contenitori1Group_title);
		paletteContainer.setDescription(Messages.Contenitori1Group_desc);
		paletteContainer.add(createPackage1CreationTool());
		paletteContainer.add(createClasse2CreationTool());
		paletteContainer.add(createInterfaccia3CreationTool());
		paletteContainer.add(createAspetto4CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Elementi" palette tool group
	 * @generated
	 */
	private PaletteContainer createElementi2Group() {
		PaletteGroup paletteContainer = new PaletteGroup(Messages.Elementi2Group_title);
		paletteContainer.add(createMetodo1CreationTool());
		paletteContainer.add(createCampo2CreationTool());
		paletteContainer.add(createAdvice3CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Collegamenti" palette tool group
	 * @generated
	 */
	private PaletteContainer createCollegamenti3Group() {
		PaletteGroup paletteContainer = new PaletteGroup(Messages.Collegamenti3Group_title);
		paletteContainer.setDescription(Messages.Collegamenti3Group_desc);
		paletteContainer.add(createChiamataesplicita1CreationTool());
		paletteContainer.add(createChiamataimplicita2CreationTool());
		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createAssociazione4CreationTool());
		paletteContainer.add(createDipendenza5CreationTool());
		paletteContainer.add(createImplementazione6CreationTool());
		paletteContainer.add(createEstensione7CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPackage1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(2);
		types.add(CallGraphElementTypes.Package_1001);
		types.add(CallGraphElementTypes.Package_2011);
		NodeToolEntry entry = new NodeToolEntry(Messages.Package1CreationTool_title,
				Messages.Package1CreationTool_desc, types);
		entry.setSmallIcon(CallGraphDiagramEditorPlugin
				.findImageDescriptor("/CallGraphAnalyzer.gmf/icons/obj16/Package.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createClasse2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(3);
		types.add(CallGraphElementTypes.Class_2007);
		types.add(CallGraphElementTypes.Class_2009);
		types.add(CallGraphElementTypes.Class_1003);
		NodeToolEntry entry = new NodeToolEntry(Messages.Classe2CreationTool_title,
				Messages.Classe2CreationTool_desc, types);
		entry.setSmallIcon(CallGraphDiagramEditorPlugin
				.findImageDescriptor("/CallGraphAnalyzer.gmf/icons/obj16/Class.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInterfaccia3CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(3);
		types.add(CallGraphElementTypes.Interface_2006);
		types.add(CallGraphElementTypes.Interface_2010);
		types.add(CallGraphElementTypes.Interface_1004);
		NodeToolEntry entry = new NodeToolEntry(Messages.Interfaccia3CreationTool_title,
				Messages.Interfaccia3CreationTool_desc, types);
		entry.setSmallIcon(CallGraphDiagramEditorPlugin
				.findImageDescriptor("/CallGraphAnalyzer.gmf/icons/obj16/Interface.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAspetto4CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(3);
		types.add(CallGraphElementTypes.Aspect_2001);
		types.add(CallGraphElementTypes.Aspect_2008);
		types.add(CallGraphElementTypes.Aspect_1002);
		NodeToolEntry entry = new NodeToolEntry(Messages.Aspetto4CreationTool_title,
				Messages.Aspetto4CreationTool_desc, types);
		entry.setSmallIcon(CallGraphDiagramEditorPlugin
				.findImageDescriptor("/CallGraphAnalyzer.gmf/icons/obj16/Aspect.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMetodo1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(2);
		types.add(CallGraphElementTypes.Method_2004);
		types.add(CallGraphElementTypes.Method_1006);
		NodeToolEntry entry = new NodeToolEntry(Messages.Metodo1CreationTool_title,
				Messages.Metodo1CreationTool_desc, types);
		entry.setSmallIcon(CallGraphDiagramEditorPlugin
				.findImageDescriptor("/CallGraphAnalyzer.gmf/icons/obj16/Method.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCampo2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(2);
		types.add(CallGraphElementTypes.Field_2005);
		types.add(CallGraphElementTypes.Field_1007);
		NodeToolEntry entry = new NodeToolEntry(Messages.Campo2CreationTool_title,
				Messages.Campo2CreationTool_desc, types);
		entry.setSmallIcon(CallGraphDiagramEditorPlugin
				.findImageDescriptor("/CallGraphAnalyzer.gmf/icons/obj16/Field.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAdvice3CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(2);
		types.add(CallGraphElementTypes.Advice_2003);
		types.add(CallGraphElementTypes.Advice_1005);
		NodeToolEntry entry = new NodeToolEntry(Messages.Advice3CreationTool_title,
				Messages.Advice3CreationTool_desc, types);
		entry.setSmallIcon(CallGraphDiagramEditorPlugin
				.findImageDescriptor("/CallGraphAnalyzer.gmf/icons/obj16/Advice.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createChiamataesplicita1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CallGraphElementTypes.ExplicitCall_3001);
		LinkToolEntry entry = new LinkToolEntry(Messages.Chiamataesplicita1CreationTool_title,
				Messages.Chiamataesplicita1CreationTool_desc, types);
		entry.setSmallIcon(CallGraphDiagramEditorPlugin
				.findImageDescriptor("/CallGraphAnalyzer.gmf/icons/obj16/ExplicitCall.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createChiamataimplicita2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CallGraphElementTypes.ImplicitCall_3005);
		LinkToolEntry entry = new LinkToolEntry(Messages.Chiamataimplicita2CreationTool_title,
				Messages.Chiamataimplicita2CreationTool_desc, types);
		entry.setSmallIcon(CallGraphDiagramEditorPlugin
				.findImageDescriptor("/CallGraphAnalyzer.gmf/icons/obj16/ImplicitCall.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAssociazione4CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CallGraphElementTypes.Association_3003);
		LinkToolEntry entry = new LinkToolEntry(Messages.Associazione4CreationTool_title,
				Messages.Associazione4CreationTool_desc, types);
		entry.setSmallIcon(CallGraphDiagramEditorPlugin
				.findImageDescriptor("/CallGraphAnalyzer.gmf/icons/obj16/Associates.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDipendenza5CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CallGraphElementTypes.Dependence_3002);
		LinkToolEntry entry = new LinkToolEntry(Messages.Dipendenza5CreationTool_title,
				Messages.Dipendenza5CreationTool_desc, types);
		entry.setSmallIcon(CallGraphDiagramEditorPlugin
				.findImageDescriptor("/CallGraphAnalyzer.gmf/icons/obj16/Depends.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createImplementazione6CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CallGraphElementTypes.Implementation_3006);
		LinkToolEntry entry = new LinkToolEntry(Messages.Implementazione6CreationTool_title,
				Messages.Implementazione6CreationTool_desc, types);
		entry.setSmallIcon(CallGraphDiagramEditorPlugin
				.findImageDescriptor("/CallGraphAnalyzer.gmf/icons/obj16/Implements.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEstensione7CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CallGraphElementTypes.Extension_3004);
		LinkToolEntry entry = new LinkToolEntry(Messages.Estensione7CreationTool_title,
				Messages.Estensione7CreationTool_desc, types);
		entry.setSmallIcon(CallGraphDiagramEditorPlugin
				.findImageDescriptor("/CallGraphAnalyzer.gmf/icons/obj16/Extends.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description, List elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description, List relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
