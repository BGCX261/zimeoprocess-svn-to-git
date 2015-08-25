/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unisannio.rcost.callgraphanalyzer.provider;


import it.unisannio.rcost.callgraphanalyzer.CallGraphFactory;
import it.unisannio.rcost.callgraphanalyzer.CallGraphPackage;
import it.unisannio.rcost.callgraphanalyzer.Node;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link it.unisannio.rcost.callgraphanalyzer.Node} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class NodeItemProvider
	extends ItemProviderAdapter
	implements	
		IEditingDomainItemProvider,	
		IStructuredItemContentProvider,	
		ITreeItemContentProvider,	
		IItemLabelProvider,	
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNamePropertyDescriptor(object);
			addNodeContainerPropertyDescriptor(object);
			addIdPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Node_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Node_name_feature", "_UI_Node_type"),
				 CallGraphPackage.Literals.NODE__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Node Container feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNodeContainerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Node_nodeContainer_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Node_nodeContainer_feature", "_UI_Node_type"),
				 CallGraphPackage.Literals.NODE__NODE_CONTAINER,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Node_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Node_id_feature", "_UI_Node_type"),
				 CallGraphPackage.Literals.NODE__ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(CallGraphPackage.Literals.NODE__IN_EDGES);
			childrenFeatures.add(CallGraphPackage.Literals.NODE__OUT_EDGES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Node)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Node_type") :
			getString("_UI_Node_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Node.class)) {
			case CallGraphPackage.NODE__NAME:
			case CallGraphPackage.NODE__ID:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case CallGraphPackage.NODE__IN_EDGES:
			case CallGraphPackage.NODE__OUT_EDGES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(CallGraphPackage.Literals.NODE__IN_EDGES,
				 CallGraphFactory.eINSTANCE.createExplicitCall()));

		newChildDescriptors.add
			(createChildParameter
				(CallGraphPackage.Literals.NODE__IN_EDGES,
				 CallGraphFactory.eINSTANCE.createImplicitCall()));

		newChildDescriptors.add
			(createChildParameter
				(CallGraphPackage.Literals.NODE__IN_EDGES,
				 CallGraphFactory.eINSTANCE.createAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(CallGraphPackage.Literals.NODE__IN_EDGES,
				 CallGraphFactory.eINSTANCE.createImplementation()));

		newChildDescriptors.add
			(createChildParameter
				(CallGraphPackage.Literals.NODE__IN_EDGES,
				 CallGraphFactory.eINSTANCE.createDependence()));

		newChildDescriptors.add
			(createChildParameter
				(CallGraphPackage.Literals.NODE__IN_EDGES,
				 CallGraphFactory.eINSTANCE.createExtension()));

		newChildDescriptors.add
			(createChildParameter
				(CallGraphPackage.Literals.NODE__IN_EDGES,
				 CallGraphFactory.eINSTANCE.createImplicitCallDecorator()));

		newChildDescriptors.add
			(createChildParameter
				(CallGraphPackage.Literals.NODE__IN_EDGES,
				 CallGraphFactory.eINSTANCE.createExplicitCallDecorator()));

		newChildDescriptors.add
			(createChildParameter
				(CallGraphPackage.Literals.NODE__IN_EDGES,
				 CallGraphFactory.eINSTANCE.createDependenceDecorator()));

		newChildDescriptors.add
			(createChildParameter
				(CallGraphPackage.Literals.NODE__OUT_EDGES,
				 CallGraphFactory.eINSTANCE.createExplicitCall()));

		newChildDescriptors.add
			(createChildParameter
				(CallGraphPackage.Literals.NODE__OUT_EDGES,
				 CallGraphFactory.eINSTANCE.createImplicitCall()));

		newChildDescriptors.add
			(createChildParameter
				(CallGraphPackage.Literals.NODE__OUT_EDGES,
				 CallGraphFactory.eINSTANCE.createAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(CallGraphPackage.Literals.NODE__OUT_EDGES,
				 CallGraphFactory.eINSTANCE.createImplementation()));

		newChildDescriptors.add
			(createChildParameter
				(CallGraphPackage.Literals.NODE__OUT_EDGES,
				 CallGraphFactory.eINSTANCE.createDependence()));

		newChildDescriptors.add
			(createChildParameter
				(CallGraphPackage.Literals.NODE__OUT_EDGES,
				 CallGraphFactory.eINSTANCE.createExtension()));

		newChildDescriptors.add
			(createChildParameter
				(CallGraphPackage.Literals.NODE__OUT_EDGES,
				 CallGraphFactory.eINSTANCE.createImplicitCallDecorator()));

		newChildDescriptors.add
			(createChildParameter
				(CallGraphPackage.Literals.NODE__OUT_EDGES,
				 CallGraphFactory.eINSTANCE.createExplicitCallDecorator()));

		newChildDescriptors.add
			(createChildParameter
				(CallGraphPackage.Literals.NODE__OUT_EDGES,
				 CallGraphFactory.eINSTANCE.createDependenceDecorator()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == CallGraphPackage.Literals.NODE__IN_EDGES ||
			childFeature == CallGraphPackage.Literals.NODE__OUT_EDGES;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return CallGraphEditPlugin.INSTANCE;
	}

}
