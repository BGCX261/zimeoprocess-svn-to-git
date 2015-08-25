/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unisannio.rcost.callgraphanalyzer.provider;


import it.unisannio.rcost.callgraphanalyzer.Advice;
import it.unisannio.rcost.callgraphanalyzer.CallGraphPackage;
import it.unisannio.rcost.callgraphanalyzer.ImplicitCall;
import it.unisannio.rcost.callgraphanalyzer.Node;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link it.unisannio.rcost.callgraphanalyzer.ImplicitCall} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ImplicitCallItemProvider
	extends JoinPointShadowItemProvider
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
	public ImplicitCallItemProvider(AdapterFactory adapterFactory) {
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

			addJoinPointShadowPropertyDescriptor(object);
			addJoinPointShadowTypePropertyDescriptor(object);
			addSourceLinePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Join Point Shadow feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	protected void addJoinPointShadowPropertyDescriptor(Object object) {
//		itemPropertyDescriptors.add
//			(createItemPropertyDescriptor
//				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
//				 getResourceLocator(),
//				 getString("_UI_ImplicitCall_joinPointShadow_feature"),
//				 getString("_UI_PropertyDescriptor_description", "_UI_ImplicitCall_joinPointShadow_feature", "_UI_ImplicitCall_type"),
//				 CallGraphPackage.Literals.IMPLICIT_CALL__JOIN_POINT_SHADOW,
//				 true,
//				 false,
//				 true,
//				 null,
//				 null,
//				 null));
	}

	/**
	 * This adds a property descriptor for the Join Point Shadow Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	protected void addJoinPointShadowTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ImplicitCall_joinPointShadowType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ImplicitCall_joinPointShadowType_feature", "_UI_ImplicitCall_type"),
				 CallGraphPackage.Literals.IMPLICIT_CALL__JOIN_POINT_SHADOW_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Source Line feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSourceLinePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ImplicitCall_sourceLine_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ImplicitCall_sourceLine_feature", "_UI_ImplicitCall_type"),
				 CallGraphPackage.Literals.IMPLICIT_CALL__SOURCE_LINE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	@Override
	protected ItemPropertyDescriptor createItemPropertyDescriptor(
			AdapterFactory adapterFactory, ResourceLocator resourceLocator,
			String displayName, String description, EStructuralFeature feature,
			boolean isSettable, boolean multiLine, boolean sortChoices,
			Object staticImage, String category, String[] filterFlags) {
		if(feature.equals(CallGraphPackage.Literals.EDGE__TARGET)){
			return new ItemPropertyDescriptor(
				      adapterFactory,
				      resourceLocator,
				      displayName,
				      description,
				      feature,
				      isSettable,
				      multiLine,
				      sortChoices,
				      staticImage,
				      category,
				      filterFlags){
				@Override
				protected Object getValue(EObject object,
						EStructuralFeature feature) {
					Node adv = ((ImplicitCall)object).getTarget();
					if(adv instanceof Advice){
						String adv1 = ((Advice)adv).getKind() + ":" + ((Advice)adv).getPointcutExpression();
						return adv1;
					}
					return super.getValue(object, feature);
				}
			};
		}
		else
			return super.createItemPropertyDescriptor(adapterFactory, resourceLocator,
					displayName, description, feature, isSettable, multiLine, sortChoices,
					staticImage, category, filterFlags);
	}
	/**
	 * This returns ImplicitCall.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ImplicitCall"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ImplicitCall)object).getJoinPointShadowType();
		return label == null || label.length() == 0 ?
			getString("_UI_ImplicitCall_type") :
			getString("_UI_ImplicitCall_type") + " " + label;
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

		switch (notification.getFeatureID(ImplicitCall.class)) {
			case CallGraphPackage.IMPLICIT_CALL__JOIN_POINT_SHADOW_TYPE:
			case CallGraphPackage.IMPLICIT_CALL__SOURCE_LINE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
