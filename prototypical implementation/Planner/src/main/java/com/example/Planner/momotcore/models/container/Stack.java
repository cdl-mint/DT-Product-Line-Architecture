/**
 */
package com.example.Planner.momotcore.models.container;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stack</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Stack#getId <em>Id</em>}</li>
 *   <li>{@link Stack#getTopContainer <em>Top Container</em>}</li>
 * </ul>
 *
 * @see ContainerPackage#getStack()
 * @model
 * @generated
 */
public interface Stack extends EObject {
   /**
    * Returns the value of the '<em><b>Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the value of the '<em>Id</em>' attribute.
    * @see #setId(String)
    * @see ContainerPackage#getStack_Id()
    * @model id="true"
    * @generated
    */
   String getId();

   /**
    * Sets the value of the '{@link Stack#getId <em>Id</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Id</em>' attribute.
    * @see #getId()
    * @generated
    */
   void setId(String value);

   /**
    * Returns the value of the '<em><b>Top Container</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the value of the '<em>Top Container</em>' reference.
    * @see #setTopContainer(Container)
    * @see ContainerPackage#getStack_TopContainer()
    * @model
    * @generated
    */
   Container getTopContainer();

   /**
    * Sets the value of the '{@link Stack#getTopContainer <em>Top Container</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Top Container</em>' reference.
    * @see #getTopContainer()
    * @generated
    */
   void setTopContainer(Container value);

} // Stack
