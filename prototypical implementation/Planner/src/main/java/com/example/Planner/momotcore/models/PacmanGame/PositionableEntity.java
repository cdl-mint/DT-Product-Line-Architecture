/**
 */
package com.example.Planner.momotcore.models.PacmanGame;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Positionable Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PositionableEntity#getOn <em>On</em>}</li>
 *   <li>{@link PositionableEntity#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see PacmanGamePackage#getPositionableEntity()
 * @model abstract="true"
 * @generated
 */
public interface PositionableEntity extends EObject {
	/**
	 * Returns the value of the '<em><b>On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On</em>' reference.
	 * @see #setOn(GridNode)
	 * @see PacmanGamePackage#getPositionableEntity_On()
	 * @model required="true"
	 * @generated
	 */
	GridNode getOn();

	/**
	 * Sets the value of the '{@link PositionableEntity#getOn <em>On</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On</em>' reference.
	 * @see #getOn()
	 * @generated
	 */
	void setOn(GridNode value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see PacmanGamePackage#getPositionableEntity_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link PositionableEntity#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // PositionableEntity
