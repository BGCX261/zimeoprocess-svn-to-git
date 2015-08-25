/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unisannio.rcost.callgraphanalyzer.impl;

import it.unisannio.rcost.callgraphanalyzer.CallGraphPackage;
import it.unisannio.rcost.callgraphanalyzer.Dependence;
import it.unisannio.rcost.callgraphanalyzer.DependenceDecorator;
import it.unisannio.rcost.callgraphanalyzer.Edge;
import it.unisannio.rcost.callgraphanalyzer.ExplicitCall;
import it.unisannio.rcost.callgraphanalyzer.ExplicitCallDecorator;
import it.unisannio.rcost.callgraphanalyzer.Extension;
import it.unisannio.rcost.callgraphanalyzer.Implementation;
import it.unisannio.rcost.callgraphanalyzer.ImplicitCall;
import it.unisannio.rcost.callgraphanalyzer.ImplicitCallDecorator;
import it.unisannio.rcost.callgraphanalyzer.Node;
import it.unisannio.rcost.callgraphanalyzer.NodeContainer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.unisannio.rcost.callgraphanalyzer.impl.NodeImpl#getInEdgesList <em>In Edges</em>}</li>
 *   <li>{@link it.unisannio.rcost.callgraphanalyzer.impl.NodeImpl#getOutEdgesList <em>Out Edges</em>}</li>
 *   <li>{@link it.unisannio.rcost.callgraphanalyzer.impl.NodeImpl#getName <em>Name</em>}</li>
 *   <li>{@link it.unisannio.rcost.callgraphanalyzer.impl.NodeImpl#getNodeContainer <em>Node Container</em>}</li>
 *   <li>{@link it.unisannio.rcost.callgraphanalyzer.impl.NodeImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 */
public abstract class NodeImpl extends EObjectImpl implements Node {
	/**
	 * The cached value of the '{@link #getInEdgesList() <em>In Edges</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInEdgesList()
	 * @generated
	 * @ordered
	 */
	protected EList<Edge> inEdges;

	/**
	 * The empty value for the '{@link #getInEdges() <em>In Edges</em>}' array accessor.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInEdges()
	 * @generated
	 * @ordered
	 */
	protected static final Edge[] IN_EDGES_EEMPTY_ARRAY = new Edge [0];

	/**
	 * The cached value of the '{@link #getOutEdgesList() <em>Out Edges</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutEdgesList()
	 * @generated
	 * @ordered
	 */
	protected EList<Edge> outEdges;

	/**
	 * The empty value for the '{@link #getOutEdges() <em>Out Edges</em>}' array accessor.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutEdges()
	 * @generated
	 * @ordered
	 */
	protected static final Edge[] OUT_EDGES_EEMPTY_ARRAY = new Edge [0];

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNodeContainer() <em>Node Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeContainer()
	 * @generated
	 * @ordered
	 */
	protected NodeContainer nodeContainer;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CallGraphPackage.Literals.NODE;
	}

	@Override
	public boolean eNotificationRequired() {
		return false;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public Edge[] getInEdges() {
		if (inEdges == null || inEdges.isEmpty()) return IN_EDGES_EEMPTY_ARRAY;
		BasicEList<Edge> list = (BasicEList<Edge>)inEdges;
		list.shrink();
		return (Edge[])list.data();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Edge getInEdges(int index) {
		return getInEdgesList().get(index);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getInEdgesLength() {
		return inEdges == null ? 0 : inEdges.size();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void setInEdges(Edge[] newInEdges) {
		getInEdgesList().clear();
		
		for (int i = 0; i < newInEdges.length; i++) {
			addInEdge(newInEdges[i]);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void setInEdges(int index, Edge element) {
		getInEdgesList().set(index, element);
		element.setSource(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EList<Edge> getInEdgesList() {
		if (inEdges == null) {
			inEdges = new EObjectEList<Edge>(Edge.class, this, CallGraphPackage.NODE__IN_EDGES);
//			inEdges = new EObjectContainmentEList<Edge>(Edge.class, this, CallGraphPackage.NODE__IN_EDGES);
		}
		return inEdges;
	}
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@SuppressWarnings("serial")
	public EList<Edge> getOutEdgesList() {
		if (outEdges == null) {
			outEdges = new EObjectEList<Edge>(Edge.class, this, CallGraphPackage.NODE__OUT_EDGES){
				@Override
				protected boolean useEquals() {
					return true;
				}
				
				@Override
				protected boolean isUnique() {
					return true;
				}
				@Override
				protected boolean hasInverse() {
					return true;
				}
			};
		}
		return outEdges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public Edge[] getOutEdges() {
		if (outEdges == null || outEdges.isEmpty()) return OUT_EDGES_EEMPTY_ARRAY;
		BasicEList<Edge> list = (BasicEList<Edge>)outEdges;
		list.shrink();
		return (Edge[])list.data();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Edge getOutEdges(int index) {
		return getOutEdgesList().get(index);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOutEdgesLength() {
		return outEdges == null ? 0 : outEdges.size();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void setOutEdges(Edge[] newOutEdges) {
		getOutEdgesList().clear();
		
		for (int i = 0; i < newOutEdges.length; i++) {
			addOutEdge(newOutEdges[i]);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void setOutEdges(int index, Edge element) {
		getOutEdgesList().set(index, element);
		element.setSource(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CallGraphPackage.NODE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeContainer getNodeContainer() {
		if (nodeContainer != null && nodeContainer.eIsProxy()) {
			InternalEObject oldNodeContainer = (InternalEObject)nodeContainer;
			nodeContainer = (NodeContainer)eResolveProxy(oldNodeContainer);
			if (nodeContainer != oldNodeContainer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CallGraphPackage.NODE__NODE_CONTAINER, oldNodeContainer, nodeContainer));
			}
		}
		return nodeContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeContainer basicGetNodeContainer() {
		return nodeContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodeContainer(NodeContainer newNodeContainer) {
		NodeContainer oldNodeContainer = nodeContainer;
		nodeContainer = newNodeContainer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CallGraphPackage.NODE__NODE_CONTAINER, oldNodeContainer, nodeContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CallGraphPackage.NODE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CallGraphPackage.NODE__IN_EDGES:
				return ((InternalEList<?>)getInEdgesList()).basicRemove(otherEnd, msgs);
			case CallGraphPackage.NODE__OUT_EDGES:
				return ((InternalEList<?>)getOutEdgesList()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CallGraphPackage.NODE__IN_EDGES:
				return getInEdgesList();
			case CallGraphPackage.NODE__OUT_EDGES:
				return getOutEdgesList();
			case CallGraphPackage.NODE__NAME:
				return getName();
			case CallGraphPackage.NODE__NODE_CONTAINER:
				if (resolve) return getNodeContainer();
				return basicGetNodeContainer();
			case CallGraphPackage.NODE__ID:
				return new Integer(getId());
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CallGraphPackage.NODE__IN_EDGES:
				getInEdgesList().clear();
				Collection<? extends Edge> list = (Collection<? extends Edge>)newValue;
				for (Edge edge : list) {
					addInEdge(edge);
				}
				return;
			case CallGraphPackage.NODE__OUT_EDGES:
				getOutEdgesList().clear();
				Collection<? extends Edge> listOut = (Collection<? extends Edge>)newValue;
				for (Edge edge : listOut) {
					addOutEdge(edge);
				}
				return;
			case CallGraphPackage.NODE__NAME:
				setName((String)newValue);
				return;
			case CallGraphPackage.NODE__NODE_CONTAINER:
				setNodeContainer((NodeContainer)newValue);
				return;
			case CallGraphPackage.NODE__ID:
				setId(((Integer)newValue).intValue());
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CallGraphPackage.NODE__IN_EDGES:
				getInEdgesList().clear();
				return;
			case CallGraphPackage.NODE__OUT_EDGES:
				getOutEdgesList().clear();
				return;
			case CallGraphPackage.NODE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CallGraphPackage.NODE__NODE_CONTAINER:
				setNodeContainer((NodeContainer)null);
				return;
			case CallGraphPackage.NODE__ID:
				setId(ID_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CallGraphPackage.NODE__IN_EDGES:
				return inEdges != null && !inEdges.isEmpty();
			case CallGraphPackage.NODE__OUT_EDGES:
				return outEdges != null && !outEdges.isEmpty();
			case CallGraphPackage.NODE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CallGraphPackage.NODE__NODE_CONTAINER:
				return nodeContainer != null;
			case CallGraphPackage.NODE__ID:
				return id != ID_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

	abstract boolean isValidModifiers();
	
	public void addInEdge(Edge element) {
//		EList<Edge> inEdges = getInEdgesList();
//		if(!inEdges.contains(element)){
//			((BasicEList<Edge>)inEdges).addUnique(element);
//			element.setTarget(this);
//		}
	}

	public void addOutEdge(Edge element) {
		EList<Edge> outEdges = getOutEdgesList();
		if(!outEdges.contains(element)){
			((BasicEList<Edge>)outEdges).addUnique(element);
			element.setSource(this);
		}
	}

	@SuppressWarnings("unchecked")
	public Edge[] getInEdgesByType(Class type) {
		EList<Edge> lst = getInEdgesList();
		List<Edge> newList = getByType(type, lst);
		
		return newList.toArray(new Edge[newList.size()]);
	}
	
	@SuppressWarnings("unchecked")
	public Edge[] getOutEdgesByType(Class type) {
		EList<Edge> lst = getOutEdgesList();
		List<Edge> newList = getByType(type, lst);
		
		return newList.toArray(new Edge[newList.size()]);
	}

	@SuppressWarnings("unchecked")
	private List<Edge> getByType(Class type, EList<Edge> lst) {
		List<Edge> newList = new ArrayList<Edge>();
		
		for (Edge edge : lst) {
			if(type == ImplicitCallDecorator.class) {
				if(edge instanceof ImplicitCallDecorator)
					newList.add(edge);
			} else if(type == ExplicitCallDecorator.class) {
				if(edge instanceof ExplicitCallDecorator)
					newList.add(edge);
			} else if(type == DependenceDecorator.class) {
				if(edge instanceof DependenceDecorator)
					newList.add(edge);
			} else if(type == Extension.class) {
				if(edge instanceof Extension)
					newList.add(edge);
			} else if(type == ImplicitCall.class) {
				if(edge instanceof ImplicitCall)
					newList.add(edge);
			} else if(type == ExplicitCall.class) {
				if(edge instanceof ExplicitCall)
					newList.add(edge);
			} else if(type == Dependence.class) {
				if(edge instanceof Dependence)
					newList.add(edge);
			} else if(type == Implementation.class) {
				if(edge instanceof Implementation)
					newList.add(edge);
			}
		}
		return newList;
	}

	public Edge[] getOutCallEdges() {
		EList<Edge> outEdges = getOutEdgesList();
		List<Edge> implicitEdges = getByType(ImplicitCall.class, outEdges);
		List<Edge> explicitEdges = getByType(ExplicitCall.class, outEdges);
		
		if(implicitEdges == null)
			new ArrayList<Edge>();
		
		implicitEdges.addAll(explicitEdges);
		
		return implicitEdges.toArray(new Edge[implicitEdges.size()]);
	}
	

	public boolean removeInEdge(Edge inEdge) {
		return getInEdgesList().remove(inEdge);
	}

	public boolean removeOutEdge(Edge outEdge) {
		return getOutEdgesList().remove(outEdge);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Node))
			return false;
		final Node other = (Node) obj;
		if (id != other.getId())
			return false;
		if (name == null) {
			if (other.getName() != null)
				return false;
		} else if (!name.equals(other.getName()))
			return false;
		return true;
	}
	
	public Node clone() {
		Node nodeClone = cloneNode();
		nodeClone.setId(this.id);
		nodeClone.setName(this.name);
		
		return nodeClone;
	}
	
	protected abstract Node cloneNode();
} //NodeImpl
