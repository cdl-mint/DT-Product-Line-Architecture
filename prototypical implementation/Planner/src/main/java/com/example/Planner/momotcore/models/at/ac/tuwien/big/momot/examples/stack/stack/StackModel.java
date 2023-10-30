/**
 */
package com.example.Planner.momotcore.models.at.ac.tuwien.big.momot.examples.stack.stack;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link StackModel#getStacks <em>Stacks</em>}</li>
 * </ul>
 * </p>
 *
 * @see StackPackage#getStackModel()
 * @model
 * @generated
 */
public interface StackModel extends EObject {
   /**
    * Returns the value of the '<em><b>Stacks</b></em>' containment reference list.
    * The list contents are of type {@link Stack}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Stacks</em>' containment reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Stacks</em>' containment reference list.
    * @see StackPackage#getStackModel_Stacks()
    * @model containment="true"
    * @generated
    */
   EList<Stack> getStacks();

} // StackModel
