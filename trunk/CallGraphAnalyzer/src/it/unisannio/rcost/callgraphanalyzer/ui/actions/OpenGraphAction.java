package it.unisannio.rcost.callgraphanalyzer.ui.actions;

import it.unisannio.rcost.callgraphanalyzer.Advice;
import it.unisannio.rcost.callgraphanalyzer.Aspect;
import it.unisannio.rcost.callgraphanalyzer.CallGraphFactory;
import it.unisannio.rcost.callgraphanalyzer.Class;
import it.unisannio.rcost.callgraphanalyzer.ExplicitCall;
import it.unisannio.rcost.callgraphanalyzer.Field;
import it.unisannio.rcost.callgraphanalyzer.Graph;
import it.unisannio.rcost.callgraphanalyzer.ImplicitCall;
import it.unisannio.rcost.callgraphanalyzer.Interface;
import it.unisannio.rcost.callgraphanalyzer.Method;
import it.unisannio.rcost.callgraphanalyzer.Node;
import it.unisannio.rcost.callgraphanalyzer.Package;
import it.unisannio.rcost.callgraphanalyzer.ui.wizards.Wizard;
import it.unisannio.rcost.callgraphanalyzer.util.Criteria;
import it.unisannio.rcost.callgraphanalyzer.util.Criteria.GraphType;

import java.util.Hashtable;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;

/**
 * The action proxy will be created by the workbench and shown in the UI. When
 * the user tries to use the action, this delegate will be created and execution
 * will be delegated to it.
 * 
 * @see IWorkbenchWindowActionDelegate
 */
public class OpenGraphAction implements IWorkbenchWindowActionDelegate {
	protected Resource diagram = null;

	private IWorkbenchWindow window;

	/**
	 * The constructor.
	 */
	public OpenGraphAction() {
	}

	/**
	 * The action has been activated. The argument of the method represents the
	 * 'real' action sitting in the workbench UI.
	 * 
	 * @see IWorkbenchWindowActionDelegate#run
	 */
	public void run(IAction action) {
//		CallGraphDiagramEditorUtil.drawGraph(createSampleGraph2());

		 Wizard wizard = new Wizard();
		 WizardDialog dialog = new WizardDialog(new Shell(), wizard);
		 dialog.create();
		 dialog.open();
	}

	private Graph getSampleGraph() {
		Criteria c = new Criteria();
		c.setProjectName(ResourcesPlugin.getWorkspace().getRoot().getProjects()[0].getName());
		c.setGraphType(GraphType.FULL_METHOD);
		
		Graph graph = CallGraphFactory.eINSTANCE.createGraph();
		
		Package pack = CallGraphFactory.eINSTANCE.createPackage();
		pack.setName("Package");
		pack.setId(7);
		// Package pack_1 = CallGraphFactory.eINSTANCE.createPackage();
		// Class aspect = CallGraphFactory.eINSTANCE.createClass();
		// aspect.setName("Aspetto");
		// Class class_1 = CallGraphFactory.eINSTANCE.createClass();
		// class_1.setName("Class_1");

		// Extension extension = CallGraphFactory.eINSTANCE.createExtension();
		// class_1.addInEdge(extension);
		// aspect.addOutEdge(extension);
		// extension.setSource(aspect);
		// extension.setTarget(class_1);
		//		

		// pack_1.setClasses(new Class[]{aspect});
		// graph.setNodes(new Node[] { pack});
		//		
		// Graph con chiamate esplicite tra metodi.
		Class c1 = CallGraphFactory.eINSTANCE.createClass();
		c1.setName("Classe_1");
		c1.setId(3);

		Method m1 = CallGraphFactory.eINSTANCE.createMethod();
		m1.setName("Chiamante");
		m1.setId(1);

		c1.addMethod(m1);

		Aspect a1 = CallGraphFactory.eINSTANCE.createAspect();
		a1.setName("Aspect_1");
		a1.setId(4);

		Method m2 = CallGraphFactory.eINSTANCE.createMethod();
		m2.setName("Chiamato");
		m2.setId(2);

		Advice advice1 = CallGraphFactory.eINSTANCE.createAdvice();
		advice1.setName("Advice_1");
		advice1.setId(5);

		a1.addAdvice(advice1);
		a1.addMethod(m2);

		// Chiamata esplicita tra metodi (m1,m2)
		ExplicitCall callM1M2 = CallGraphFactory.eINSTANCE.createExplicitCall();
		callM1M2.setSource(m1);
		callM1M2.setTarget(m2);

		// Chiamata Implicita Metodo-Advice (m1, advice1)

		ImplicitCall implicitCallM1advice1 = CallGraphFactory.eINSTANCE.createImplicitCall();
		implicitCallM1advice1.setSource(m1);
		implicitCallM1advice1.setTarget(advice1);

		pack.setInnerModules(new Class[] { c1, a1 });

		Node[]  nodes = new Node[] { pack, c1, a1, m1, m2, advice1 }; 
		graph.setNodes(nodes);

		c.setSources(nodes);
		graph.setCriteria(c);
		return graph;
	}
	
	public Graph createSampleGraph2(){
		Criteria c = new Criteria();
		c.setProjectName(ResourcesPlugin.getWorkspace().getRoot().getProjects()[0].getName());
		c.setGraphType(GraphType.FULL_METHOD);
		
		Graph graph = CallGraphFactory.eINSTANCE.createGraph();
		
		Package p1, p2;
		Class c1, c2, c3, c4;
		Aspect asp1, asp2;
		Method m1, m2, m3, m4, m5, m6, m7, m8;
		Field f1, f2, f3, f4, f5;
		Advice a1, a2, a3, a4, a5;
		
		p1 = CallGraphFactory.eINSTANCE.createPackage();
		p1.setId(0);
		p1.setName("");
		
		p2 = CallGraphFactory.eINSTANCE.createPackage();
		p2.setId(1);
		p2.setName("packageUno");
		
		c1 = CallGraphFactory.eINSTANCE.createClass();
		c1.setId(0);
		c1.setName("Foo");
		
		c2 = CallGraphFactory.eINSTANCE.createClass();
		c2.setId(1);
		c2.setName("Quicksort");
		
		c3 = CallGraphFactory.eINSTANCE.createClass();
		c3.setId(2);
		c3.setName("Quicksort.Middle");
		
		c4 = CallGraphFactory.eINSTANCE.createClass();
		c4.setId(10);
		c4.setName("Classe 4");
		
		asp1 = CallGraphFactory.eINSTANCE.createAspect();
		asp1.setId(3);
		asp1.setName("Stats");

		asp2 = CallGraphFactory.eINSTANCE.createAspect();
		asp2.setId(11);
		asp2.setName("Stats");
		
		m1 = CallGraphFactory.eINSTANCE.createMethod();
		m1.setId(0);
		m1.setName("main");
		
		m2 = CallGraphFactory.eINSTANCE.createMethod();
		m2.setId(1);
		m2.setName("Foo");
		
		m3 = CallGraphFactory.eINSTANCE.createMethod();
		m3.setId(2);
		m3.setName("quicksort");
		
		m4 = CallGraphFactory.eINSTANCE.createMethod();
		m4.setId(3);
		m4.setName("Middle");
		
		m5 = CallGraphFactory.eINSTANCE.createMethod();
		m5.setId(4);
		m5.setName("partition");
		
		m6 = CallGraphFactory.eINSTANCE.createMethod();
		m6.setId(5);
		m6.setName("swap");
		
		m7 = CallGraphFactory.eINSTANCE.createMethod();
		m7.setId(6);
		m7.setName("Quicksort");
		
		m8 = CallGraphFactory.eINSTANCE.createMethod();
		m8.setId(7);
		m8.setName("prova");
		
		f1 = CallGraphFactory.eINSTANCE.createField();
		f1.setId(0);
		f1.setName("n");
		
		f2 = CallGraphFactory.eINSTANCE.createField();
		f2.setId(1);
		f2.setName("left");
		
		f3 = CallGraphFactory.eINSTANCE.createField();
		f3.setId(2);
		f3.setName("right");
		
		f4 = CallGraphFactory.eINSTANCE.createField();
		f4.setId(3);
		f4.setName("partitions");
		
		f5 = CallGraphFactory.eINSTANCE.createField();
		f5.setId(4);
		f5.setName("swaps");
		
		a1 = CallGraphFactory.eINSTANCE.createAdvice();
		a1.setId(0);
		a1.setLocalId(1);
		a1.setKind("before");
		a1.setPointcutExpression("partition()");
		
		a2 = CallGraphFactory.eINSTANCE.createAdvice();
		a2.setId(1);
		a2.setLocalId(2);
		a2.setKind("before");
		a2.setPointcutExpression("swap()");
		
		a3 = CallGraphFactory.eINSTANCE.createAdvice();
		a3.setId(2);
		a3.setLocalId(3);
		a3.setKind("before");
		a3.setPointcutExpression("entry()");
		
		a4 = CallGraphFactory.eINSTANCE.createAdvice();
		a4.setId(3);
		a4.setLocalId(1);
		a4.setKind("afterReturning");
		a4.setPointcutExpression("entry()");
		
		a5 = CallGraphFactory.eINSTANCE.createAdvice();
		a5.setId(4);
		a5.setLocalId(1);
		a5.setKind("afterReturning");
		a5.setPointcutExpression("prova()");
		
		p1.setInnerModules(new Interface[]{c1, c2, asp1});
		
		p2.setInnerModules(new Interface[]{c4, asp2});
		
		c1.setFields(new Field[]{f1,f2,f3,f4,f5});
		c1.setMethods(new Method[]{m1,m2});

		c2.setMethods(new Method[]{m3,m4,m5,m6});
		c2.setInnerModules(new Interface[]{c3});
		
		c3.setMethods(new Method[]{m7});
		
		c4.setMethods(new Method[]{m8});
		
		asp1.setAdvices(new Advice[]{a1, a2, a3, a4});
		
		asp2.setAdvices(new Advice[]{a5});
		
		ImplicitCall i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11;
		ExplicitCall e1, e2, e3, e4, e5, e6, e7, e8;
		
		
		//1 advicing
		i1 = CallGraphFactory.eINSTANCE.createImplicitCall();
		i1.setSource(m3);
		i1.setTarget(a1);
		i1.setJoinPointShadowType("method-call");
		
		i2 = CallGraphFactory.eINSTANCE.createImplicitCall();
		i2.setSource(m5);
		i2.setTarget(a2);
		i2.setJoinPointShadowType("method-call");
		
		i3 = CallGraphFactory.eINSTANCE.createImplicitCall();
		i3.setSource(m5);
		if(i3.getSource() == null)
			System.out.println("source vouto");
		i3.setTarget(a2);
		if(i3.getTarget() == null)
			System.out.println("target vouto");
		i3.setJoinPointShadowType("method-call");
		
		i4 = CallGraphFactory.eINSTANCE.createImplicitCall();
		i4.setSource(m3);
		i4.setTarget(a3);
		i4.setJoinPointShadowType("execution");
		
		i5 = CallGraphFactory.eINSTANCE.createImplicitCall();
		i5.setSource(m1);
		i5.setTarget(a3);
		i5.setJoinPointShadowType("method-call");
		
		i6 = CallGraphFactory.eINSTANCE.createImplicitCall();
		i6.setSource(m3);
		i6.setTarget(a4);
		i6.setJoinPointShadowType("execution");
		
		i7 = CallGraphFactory.eINSTANCE.createImplicitCall();
		i7.setSource(m1);
		i7.setTarget(a4);
		i7.setJoinPointShadowType("method-call");
		
		i8 = CallGraphFactory.eINSTANCE.createImplicitCall();
		i8.setSource(m1);
		i8.setTarget(a5);
		i8.setJoinPointShadowType("method-call");
		
		i9 = CallGraphFactory.eINSTANCE.createImplicitCall();
		i9.setSource(m1);
		i9.setTarget(a5);
		i9.setJoinPointShadowType("method-call");
		
		i10 = CallGraphFactory.eINSTANCE.createImplicitCall();
		i10.setSource(m2);
		i10.setTarget(a5);
		i10.setJoinPointShadowType("method-call");
		
		i11 = CallGraphFactory.eINSTANCE.createImplicitCall();
		i11.setSource(m3);
		i11.setTarget(a5);
		i11.setJoinPointShadowType("method-call");
		
		e1 = CallGraphFactory.eINSTANCE.createExplicitCall();
		e1.setSource(m1);
		e1.setTarget(m2);
		e1.setGroupId(1+"");
		
		e2 = CallGraphFactory.eINSTANCE.createExplicitCall();
		e2.setSource(m3);
		e2.setTarget(m5);
		e2.setGroupId(1+"");
		
		e3 = CallGraphFactory.eINSTANCE.createExplicitCall();
		e3.setSource(m3);
		e3.setTarget(m3);
		e3.setGroupId(2+"");
		
		e4 = CallGraphFactory.eINSTANCE.createExplicitCall();
		e4.setSource(m3);
		e4.setTarget(m3);
		e4.setGroupId(3+"");
		
		e5 = CallGraphFactory.eINSTANCE.createExplicitCall();
		e5.setSource(m5);
		e5.setTarget(m6);
		e5.setGroupId(1+"");
		
		e6 = CallGraphFactory.eINSTANCE.createExplicitCall();
		e6.setSource(m5);
		e6.setTarget(m6);
		e6.setGroupId(2+"");
		
		e7 = CallGraphFactory.eINSTANCE.createExplicitCall();
		e7.setSource(m5);
		e7.setTarget(m4);
		e7.setGroupId(3+"");
		
		e8 = CallGraphFactory.eINSTANCE.createExplicitCall();
		e8.setSource(m5);
		e8.setTarget(m8);
		e8.setGroupId(1+"");
		
		Hashtable<Integer, Method> hashM = graph.getMethodHash();
		hashM.put(m1.getId(), m1);
		hashM.put(m2.getId(), m2);
		hashM.put(m3.getId(), m3);
		hashM.put(m4.getId(), m4);
		hashM.put(m5.getId(), m5);
		hashM.put(m6.getId(), m6);
		hashM.put(m7.getId(), m7);
		hashM.put(m8.getId(), m8);
		
		Hashtable<Integer, Advice> hashA = graph.getAdviceHash();
		hashA.put(a1.getId(), a1);
		hashA.put(a2.getId(), a2);
		hashA.put(a3.getId(), a3);
		hashA.put(a4.getId(), a4);
		hashA.put(a4.getId(), a5);
		
		Hashtable<Integer, Field> hashF = graph.getFieldHash();
		hashF.put(f1.getId(), f1);
		hashF.put(f2.getId(), f2);
		hashF.put(f3.getId(), f3);
		hashF.put(f4.getId(), f4);
		hashF.put(f5.getId(), f5);
		
		c.setSources(new Node[]{m1});
		
		graph.setNodes(new Node[]{p1, p2});
		graph.setCriteria(c);
		
		return graph;		
	}

	/**
	 * Selection in the workbench has been changed. We can change the state of
	 * the 'real' action here if we want, but this can only happen after the
	 * delegate has been created.
	 * 
	 * @see IWorkbenchWindowActionDelegate#selectionChanged
	 */
	public void selectionChanged(IAction action, ISelection selection) {
	}

	/**
	 * We can use this method to dispose of any system resources we previously
	 * allocated.
	 * 
	 * @see IWorkbenchWindowActionDelegate#dispose
	 */
	public void dispose() {
	}

	/**
	 * We will cache window object in order to be able to provide parent shell
	 * for the message dialog.
	 * 
	 * @see IWorkbenchWindowActionDelegate#init
	 */
	public void init(IWorkbenchWindow window) {
		this.window = window;
	}
}
