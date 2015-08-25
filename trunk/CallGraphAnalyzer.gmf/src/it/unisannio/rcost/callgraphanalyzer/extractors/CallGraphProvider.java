package it.unisannio.rcost.callgraphanalyzer.extractors;

import it.unisannio.rcost.callgraphanalyzer.Advice;
import it.unisannio.rcost.callgraphanalyzer.Aspect;
import it.unisannio.rcost.callgraphanalyzer.CallGraphFactory;
import it.unisannio.rcost.callgraphanalyzer.Class;
import it.unisannio.rcost.callgraphanalyzer.Field;
import it.unisannio.rcost.callgraphanalyzer.Graph;
import it.unisannio.rcost.callgraphanalyzer.Interface;
import it.unisannio.rcost.callgraphanalyzer.Method;
import it.unisannio.rcost.callgraphanalyzer.Node;
import it.unisannio.rcost.callgraphanalyzer.Package;
import it.unisannio.rcost.callgraphanalyzer.Project;
import it.unisannio.rcost.callgraphanalyzer.dbmanagers.AspectFacade;
import it.unisannio.rcost.callgraphanalyzer.dbmanagers.ClassFacade;
import it.unisannio.rcost.callgraphanalyzer.dbmanagers.DBConnectionManager;
import it.unisannio.rcost.callgraphanalyzer.dbmanagers.InterfaceFacade;
import it.unisannio.rcost.callgraphanalyzer.dbmanagers.MethodFacade;
import it.unisannio.rcost.callgraphanalyzer.dbmanagers.PackageFacade;
import it.unisannio.rcost.callgraphanalyzer.dbmanagers.RelationFacade;
import it.unisannio.rcost.callgraphanalyzer.util.Criteria;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

public class CallGraphProvider implements ITreeContentProvider {
	private static Hashtable<String, CallGraphProvider> providers = new Hashtable<String, CallGraphProvider>();

	private Project project = null;

	private Graph fullGraph = null;

	private CallGraphProvider(String projectName) {
		this.fullGraph = CallGraphFactory.eINSTANCE.createGraph();
		Criteria criteria = new Criteria();
		criteria.setEmpty(false);
		criteria.setGraphType(Criteria.GraphType.FULL_METHOD);
		criteria.setProjectName(projectName);
		this.fullGraph.setCriteria(criteria);

		this.project = CallGraphFactory.eINSTANCE.createProject();
		this.project.setName(projectName);
	}

	public static CallGraphProvider getInstance(String projectName) {
		CallGraphProvider graphExtractor = providers.get(projectName);

		if (graphExtractor == null) {
			graphExtractor = new CallGraphProvider(projectName);

			providers.put(projectName, graphExtractor);
		}

		return graphExtractor;
	}

	public void resetFullGraph() {
		Criteria oldCriteria = this.fullGraph.getCriteria();
		this.fullGraph = CallGraphFactory.eINSTANCE.createGraph();
		
		this.fullGraph.setCriteria(oldCriteria);
		
//		this.fullGraph.clearAllHash();
//		
//		this.fullGraph.setNodes(new Node[0]);
	}

	public Graph getFullGraph() {
		if (fullGraph.getNodes() == null || fullGraph.getNodes().length == 0) {
			DBConnectionManager.getInstance().graphConstructionStarted(fullGraph.getCriteria().getProjectName());
			
			// RiCostruisce l'intero albero in memoria
			makeProjectTree();

			addProjectRelations();

			Method[] mains = getMainMethods();
			
			fullGraph.getCriteria().setSources(mains);
			
//			fullGraph.setNodes(mains);
			fullGraph.setNodes(fullGraph.getPackageHash().values().toArray(new Node[fullGraph.getPackageHash().values().size()]));
			DBConnectionManager.getInstance().graphConstructionFinished(fullGraph.getCriteria().getProjectName());
		}

		return fullGraph;
	}

	public Method[] getMainMethods() {
		// Prendi tutti i main del progetto
		Method[] mains = MethodFacade.facade.getMains(project.getName());

		// Recupera le istanze dall'hashtable
		for (int i = 0; i < mains.length; i++) {
			Method mainTmp = fullGraph.getMethodHash().get(mains[i].getId());

			if (mainTmp == null) {
				fullGraph.getMethodHash().put(mains[i].getId(), mains[i]);
			} else
				mains[i] = mainTmp;
		}

		return mains;
	}

	public Project getProject() {
		return this.project;
	}

	private void makeProjectTree() {
		// Prendi tutti i package radice, incluso l'eventuale package "senza
		// nome"
		Package[] rootPackages = PackageFacade.facade.getRootPackages(project.getName());

		for (int i = 0; i < rootPackages.length; i++) {
			Package tmp = rootPackages[i];
			fullGraph.getPackageHash().put(tmp.getName(), tmp);

			rootPackages[i] = fillPackage(tmp);
		}
		project.setRootPackages(rootPackages);
	}

	private Package fillPackage(Package pack) {
		// Prendi tutti i sottopackage
		Package[] innerPackages = PackageFacade.facade.getInnerPackages(project.getName(), pack);
		pack.setPackages(addInnerPackages(innerPackages));

		// Prendi tutti i moduli innestati del package
		Interface[] innerModules = PackageFacade.facade.getInnerModules(project.getName(), pack);
		pack.setInnerModules(addInnerModules(innerModules));

		// Prendi tutte le classi del package
		// Class[] innerClasses =
		// PackageFacade.facade.getInnerClasses(project.getName(), pack);
		// pack.setClasses(addInnerClasses(innerClasses));
		//
		// // Prendi tutte le interfacce del package
		// Interface[] innerInterfaces =
		// PackageFacade.facade.getInnerInterfaces(project.getName(), pack);
		// pack.setInterfaces(addInnerInterfaces(innerInterfaces));
		//
		// // Prendi tutti gli aspetti del package
		// Aspect[] innerAspects =
		// PackageFacade.facade.getInnerAspects(project.getName(), pack);;
		// pack.setAspects(addInnerAspects(innerAspects));

		return pack;
	}

	private Aspect fillAspect(Aspect aspect) {
		// Prendi tutti i campi dell'aspetto
		Field[] fields = AspectFacade.facade.getFields(project.getName(), aspect);
		aspect.setFields(addInnerFields(fields));

		// Prendi tutti i metodi dell'aspetto
		Method[] methods = AspectFacade.facade.getMethods(project.getName(), aspect);
		aspect.setMethods(addInnerMethods(methods));

		// Prendi tutti gli advice dell'aspetto
		Advice[] advices = AspectFacade.facade.getAdvices(project.getName(), aspect);
		aspect.setAdvices(addInnerAdvices(advices));

		// Prendi tutti i pointcut dell'aspetto
		// Pointcut[] pointcuts =
		// AspectFacade.facade.getPointcuts(project.getName(), aspect);
		// aspect.setPointcuts(addInnerPointcut(pointcuts));

		// Prendi tutte i moduli innestati dell'aspetto
		Interface[] innerModules = AspectFacade.facade.getInnerModules(project.getName(), aspect);

		aspect.setInnerModules(addInnerModules(innerModules));

		return aspect;
	}

	private Interface fillInterface(Interface interface1) {
		// Prendi tutti i campi dell'interfaccia
		Field[] fields = InterfaceFacade.facade.getFieldsByModule(project.getName(), interface1);
		interface1.setFields(addInnerFields(fields));

		// Prendi tutti i metodi dell'interfaccia
		Method[] methods = InterfaceFacade.facade.getMethodsByModule(project.getName(), interface1);
		interface1.setMethods(addInnerMethods(methods));

		// Prendi tutti moduli innestati dell'interfaccia
		Interface[] innerModules = InterfaceFacade.facade.getInnerModules(project.getName(),
				interface1);

		interface1.setInnerModules(addInnerModules(innerModules));

		return interface1;
	}

	private Class fillClass(Class class1) {
		// Prendi tutti i campi della classe
		Field[] fields = ClassFacade.facade.getFields(project.getName(), class1);
		class1.setFields(addInnerFields(fields));

		// Prendi tutti i metodi della classe
		Method[] methods = ClassFacade.facade.getMethods(project.getName(), class1);
		class1.setMethods(addInnerMethods(methods));

		// Prendi tutti moduli innestati della classe
		Interface[] innerModules = ClassFacade.facade.getInnerModules(project.getName(), class1);
		class1.setInnerModules(addInnerModules(innerModules));

		return class1;
	}

	// private Pointcut[] addInnerPointcut(Pointcut[] pointcuts) {
	// for (int i = 0; i < pointcuts.length; i++) {
	// Pointcut tmp = pointcutHash.get(pointcuts[i].getId());
	// if (tmp == null) {
	// tmp = pointcuts[i];
	// pointcutHash.put(tmp.getId(), tmp);
	// }
	//
	// pointcuts[i] = tmp;
	// }
	//
	// return pointcuts;
	// }
	
	private Advice[] addInnerAdvices(Advice[] advices) {
		for (int i = 0; i < advices.length; i++) {
			Advice tmp = fullGraph.getAdviceHash().get(advices[i].getId());
			if (tmp == null) {
				tmp = advices[i];
				fullGraph.getAdviceHash().put(tmp.getId(), tmp);
			}

			advices[i] = tmp;
		}

		return advices;
	}

	private Field[] addInnerFields(Field[] fields) {
		for (int i = 0; i < fields.length; i++) {
			Field tmp = fullGraph.getFieldHash().get(fields[i].getId());
			if (tmp == null) {
				tmp = fields[i];
				fullGraph.getFieldHash().put(tmp.getId(), tmp);
			}

			fields[i] = tmp;
		}

		return fields;
	}

	private Method[] addInnerMethods(Method[] methods) {
		for (int i = 0; i < methods.length; i++) {
			Method tmp = fullGraph.getMethodHash().get(methods[i].getId());

			if (tmp == null) {
				tmp = methods[i];

				fullGraph.getMethodHash().put(tmp.getId(), tmp);
			}

			methods[i] = tmp;
		}

		return methods;
	}

	private Package[] addInnerPackages(Package[] innerPackages) {
		for (int i = 0; i < innerPackages.length; i++) {
			Package tmp = fullGraph.getPackageHash().get(innerPackages[i].getName());
			if (tmp == null) {
				tmp = innerPackages[i];
				fullGraph.getPackageHash().put(tmp.getName(), tmp);

				tmp = fillPackage(tmp);
			}

			innerPackages[i] = tmp;
		}

		return innerPackages;
	}

	private Interface[] addInnerModules(Interface[] innerModules) {
		// Elabora tutti gli elementi innestati
		for (int i = 0; i < innerModules.length; i++) {
			Interface tmp = fullGraph.getClassHash().get(innerModules[i].getId());

			if (tmp == null) {
				tmp = innerModules[i];
				if (tmp instanceof Aspect) {
					fullGraph.getAspectHash().put(tmp.getId(), (Aspect) tmp);

					tmp = fillAspect((Aspect) tmp);
				} else if (tmp instanceof Class) {
					fullGraph.getClassHash().put(tmp.getId(), (Class) tmp);

					tmp = fillClass((Class) tmp);
				} else if (tmp instanceof Interface) {
					fullGraph.getInterfaceHash().put(tmp.getId(), tmp);

					tmp = fillInterface(tmp);
				}
			}

			innerModules[i] = tmp;
		}

		return innerModules;
	}

	// private Aspect[] addInnerAspects(Aspect[] aspects) {
	// for (int i = 0; i < aspects.length; i++) {
	// Aspect tmp = fullGraph.getAspectHash().get(aspects[i].getId());
	// if (tmp == null) {
	// tmp = aspects[i];
	// fullGraph.getAspectHash().put(tmp.getId(), tmp);
	//
	// tmp = fillAspect(tmp);
	// }
	//		
	// aspects[i] = tmp;
	// }
	//
	// return aspects;
	// }
	//
	// private Interface[] addInnerInterfaces(Interface[] interfaces) {
	// for (int i = 0; i < interfaces.length; i++) {
	// Interface tmp = fullGraph.getInterfaceHash().get(interfaces[i].getId());
	// if (tmp == null) {
	// tmp = interfaces[i];
	// fullGraph.getInterfaceHash().put(tmp.getId(), tmp);
	//
	// tmp = fillInterface(tmp);
	// }
	//		
	// interfaces[i] = tmp;
	// }
	//
	// return interfaces;
	// }
	//
	// private Class[] addInnerClasses(Class[] classes) {
	// for (int i = 0; i < classes.length; i++) {
	// Class tmp = fullGraph.getClassHash().get(classes[i].getId());
	// if (tmp == null) {
	// tmp = classes[i];
	// fullGraph.getClassHash().put(tmp.getId(), tmp);
	//
	// tmp = fillClass(tmp);
	// }
	//
	// classes[i] = tmp;
	// }
	//
	// return classes;
	// }

	private void addProjectRelations() {
		RelationFacade.facade.addExplicitCall(project.getName(), fullGraph.getMethodHash(),
				fullGraph.getAdviceHash());

		RelationFacade.facade.addImplicitCallAndDependence(project.getName(), fullGraph.getMethodHash(),
				fullGraph.getAdviceHash(), fullGraph.getFieldHash());

		RelationFacade.facade.addExtension(project.getName(), fullGraph.getClassHash(), fullGraph
				.getInterfaceHash(), fullGraph.getAspectHash());

		RelationFacade.facade.addImplementation(project.getName(), fullGraph.getClassHash(),
				fullGraph.getInterfaceHash(), fullGraph.getAspectHash());
	}

	public Object[] getChildren(Object parentElement) {
		List<Object> children = new ArrayList<Object>();

		if (parentElement instanceof Project) {
			Project parentProject = (Project) parentElement;

			children.addAll(parentProject.getRootPackagesList());
		}

		else if (parentElement instanceof Package) {
			Package parentPackage = (Package) parentElement;

			if (parentPackage.getPackages() != null)
				children.addAll(parentPackage.getPackagesList());
			children.addAll(parentPackage.getInnerModulesList());
		}
		
		else if (parentElement instanceof Aspect) {
			Aspect parentAspect = (Aspect) parentElement;

			children.addAll(parentAspect.getInnerModulesList());
			children.addAll(parentAspect.getAdvicesList());
			children.addAll(parentAspect.getMethodsList());
			children.addAll(parentAspect.getFieldsList());
		}
		
		else if (parentElement instanceof Interface) {
			Interface parentInterface = (Interface) parentElement;

			children.addAll(parentInterface.getInnerModulesList());
			children.addAll(parentInterface.getMethodsList());
			children.addAll(parentInterface.getFieldsList());
		}

		return children.toArray(new Object[children.size()]);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#getParent(java.lang.Object)
	 */
	public Object getParent(Object element) {
		
		if(element instanceof Node){
			Node node = (Node)element;
			return node.getNodeContainer();
		}

		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#hasChildren(java.lang.Object)
	 */
	public boolean hasChildren(Object element) {
		if (element instanceof Method || element instanceof Advice || element instanceof Field) {
			return false;
		}

		if (element instanceof Project) {
			Project elementProject = (Project) element;

			if (elementProject.getRootPackages() == null
					|| elementProject.getRootPackages().length == 0)
				return false;
			return true;
		}

		if (element instanceof Package) {
			Package elementPackage = (Package) element;

			if ((elementPackage.getPackages() == null || elementPackage.getPackages().length == 0)
					&& (elementPackage.getInnerModules() == null || elementPackage
							.getInnerModules().length == 0))
				return false;
			return true;
		}

		if (element instanceof Aspect) {
			Aspect elementAspect = (Aspect) element;

			if ((elementAspect.getAdvices() == null || elementAspect.getAdvices().length == 0)
					&& (elementAspect.getMethods() == null || elementAspect.getMethods().length == 0)
					&& (elementAspect.getFields() == null || elementAspect.getFields().length == 0))
				return false;
			return true;
		}
		
		if (element instanceof Interface) {
			Interface elementInterface = (Interface) element;

			if ((elementInterface.getMethods() == null || elementInterface.getMethods().length == 0)
					&& (elementInterface.getFields() == null || elementInterface.getFields().length == 0))
				return false;
			return true;
		}

		return false;
	}

	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}

	public void dispose() {
	}

	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
	}

	public static Project getTestProject() {
		CallGraphFactory graphFactory = CallGraphFactory.eINSTANCE;

		Project project = graphFactory.createProject();
		project.setName("TestGraph");
		project.setAuthor("NeverKnow");
		//		
		// Criteria criteria = new Criteria();
		// criteria.setEmpty(false);
		// criteria.setGraphType(Criteria.GraphType.FULL_METHOD);
		// criteria.setProjectName("TestGraph");
		// CallGraphProvider.getInstance("TestGraph");

		Method m1 = graphFactory.createMethod();
		m1.setId(1);
		m1.setName("metodoUno");

		Method m2 = graphFactory.createMethod();
		m2.setId(2);
		m2.setName("metodoDue");
		
		Method m2bis = graphFactory.createMethod();
		m2bis.setId(15);
		m2bis.setName("metodoDue");

		Field f1 = graphFactory.createField();
		f1.setId(7);
		f1.setName("campoUno");

		Advice a1 = graphFactory.createAdvice();
		a1.setId(3);
		a1.setName("adviceUno");

		Class c1 = graphFactory.createClass();
		c1.setId(4);
		c1.setName("ClasseUno");
		c1.setMethods(new Method[] { m1 });
		c1.setFields(new Field[] { f1 });

		Class c2 = graphFactory.createClass();
		c2.setId(5);
		c2.setName("ClasseDue");
		c2.setMethods(new Method[] { m2bis });
		
		Interface i1 = graphFactory.createInterface();
		i1.setId(10);
		i1.setName("InterfacciaUno");
		i1.setMethods(new Method[] { m2 });

		Aspect asp1 = graphFactory.createAspect();
		asp1.setId(6);
		asp1.setName("AspectUno");
		asp1.setAdvices(new Advice[] { a1 });

		Package p1 = graphFactory.createPackage();
		p1.setId(8);
		p1.setName("packageUno");
//		p1.setInnerModules(new Interface[] { c1, asp1 });
		c1.setNodeContainer(p1);
		asp1.setNodeContainer(p1);

		Package p2 = graphFactory.createPackage();
		p2.setId(9);
		p2.setName("packageDue");
//		p2.setInnerModules(new Interface[] { c2, i1 });
		c2.setNodeContainer(p2);
		i1.setNodeContainer(p2);

		project.setRootPackages(new Package[] { p1, p2 });

		return project;
	}
}
