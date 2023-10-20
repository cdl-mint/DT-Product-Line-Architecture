/**
 */
package com.example.Planner.momotcore.models.container;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Container#getId <em>Id</em>}</li>
 *   <li>{@link Container#getOnTopOf <em>On Top Of</em>}</li>
 *   <li>{@link Container#getSuccessor <em>Successor</em>}</li>
 *   <li>{@link Container#getOn <em>On</em>}</li>
 * </ul>
 *
 * @see ContainerPackage#getContainer()
 * @model
 * @generated
 */
public interface Container extends EObject {
   /**
    * Returns the value of the '<em><b>Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the value of the '<em>Id</em>' attribute.
    * @see #setId(String)
    * @see ContainerPackage#getContainer_Id()
    * @model id="true"
    * @generated
    */
   String getId();

   /**
    * Sets the value of the '{@link Container#getId <em>Id</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Id</em>' attribute.
    * @see #getId()
    * @generated
    */
   void setId(String value);

   /**
    * Returns the value of the '<em><b>On Top Of</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the value of the '<em>On Top Of</em>' reference.
    * @see #setOnTopOf(Container)
    * @see ContainerPackage#getContainer_OnTopOf()
    * @model
    * @generated
    */
   Container getOnTopOf();

   /**
    * Sets the value of the '{@link Container#getOnTopOf <em>On Top Of</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>On Top Of</em>' reference.
    * @see #getOnTopOf()
    * @generated
    */
   void setOnTopOf(Container value);

   /**
    * Returns the value of the '<em><b>Successor</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the value of the '<em>Successor</em>' reference.
    * @see #setSuccessor(Container)
    * @see ContainerPackage#getContainer_Successor()
    * @model
    * @generated
    */
   Container getSuccessor();

   /**
    * Sets the value of the '{@link Container#getSuccessor <em>Successor</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Successor</em>' reference.
    * @see #getSuccessor()
    * @generated
    */
   void setSuccessor(Container value);

   /**
    * Returns the value of the '<em><b>On</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the value of the '<em>On</em>' reference.
    * @see #setOn(Stack)
    * @see ContainerPackage#getContainer_On()
    * @model
    * @generated
    */
   Stack getOn();

   /**
    * Sets the value of the '{@link Container#getOn <em>On</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>On</em>' reference.
    * @see #getOn()
    * @generated
    */
   void setOn(Stack value);

} // Container
