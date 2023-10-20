/**
 */
package com.example.Planner.momotcore.models.at.ac.tuwien.big.momot.examples.stack.stack;

import com.example.Planner.momotcore.models.at.ac.tuwien.big.momot.examples.stack.stack.impl.StackImpl;
import com.example.Planner.momotcore.models.at.ac.tuwien.big.momot.examples.stack.stack.impl.StackModelImpl;
import com.example.Planner.momotcore.models.at.ac.tuwien.big.momot.examples.stack.stack.impl.StackPackageImpl;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each operation of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * 
 * @see StackFactory
 * @model kind="package"
 * @generated
 */
public interface StackPackage extends EPackage {
   /**
    * <!-- begin-user-doc -->
    * Defines literals for the meta objects that represent
    * <ul>
    * <li>each class,</li>
    * <li>each feature of each class,</li>
    * <li>each operation of each class,</li>
    * <li>each enum,</li>
    * <li>and each data type</li>
    * </ul>
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   interface Literals {
      /**
       * The meta object literal for the '{@link StackModelImpl
       * <em>Model</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see StackModelImpl
       * @see StackPackageImpl#getStackModel()
       * @generated
       */
      EClass STACK_MODEL = eINSTANCE.getStackModel();

      /**
       * The meta object literal for the '<em><b>Stacks</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference STACK_MODEL__STACKS = eINSTANCE.getStackModel_Stacks();

      /**
       * The meta object literal for the '{@link StackImpl
       * <em>Stack</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see StackImpl
       * @see StackPackageImpl#getStack()
       * @generated
       */
      EClass STACK = eINSTANCE.getStack();

      /**
       * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EAttribute STACK__ID = eINSTANCE.getStack_Id();

      /**
       * The meta object literal for the '<em><b>Load</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EAttribute STACK__LOAD = eINSTANCE.getStack_Load();

      /**
       * The meta object literal for the '<em><b>Left</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference STACK__LEFT = eINSTANCE.getStack_Left();

      /**
       * The meta object literal for the '<em><b>Right</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference STACK__RIGHT = eINSTANCE.getStack_Right();

   }

   /**
    * The package name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   String eNAME = "stack";

   /**
    * The package namespace URI.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   String eNS_URI = "http://momot.big.tuwien.ac.at/stack/1.0";

   /**
    * The package namespace name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   String eNS_PREFIX = "stack";

   /**
    * The singleton instance of the package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   StackPackage eINSTANCE = StackPackageImpl.init();

   /**
    * The meta object id for the '{@link StackModelImpl
    * <em>Model</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see StackModelImpl
    * @see StackPackageImpl#getStackModel()
    * @generated
    */
   int STACK_MODEL = 0;

   /**
    * The feature id for the '<em><b>Stacks</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int STACK_MODEL__STACKS = 0;

   /**
    * The number of structural features of the '<em>Model</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int STACK_MODEL_FEATURE_COUNT = 1;

   /**
    * The number of operations of the '<em>Model</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int STACK_MODEL_OPERATION_COUNT = 0;

   /**
    * The meta object id for the '{@link StackImpl <em>Stack</em>}'
    * class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see StackImpl
    * @see StackPackageImpl#getStack()
    * @generated
    */
   int STACK = 1;

   /**
    * The feature id for the '<em><b>Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int STACK__ID = 0;

   /**
    * The feature id for the '<em><b>Load</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int STACK__LOAD = 1;

   /**
    * The feature id for the '<em><b>Left</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int STACK__LEFT = 2;

   /**
    * The feature id for the '<em><b>Right</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int STACK__RIGHT = 3;

   /**
    * The number of structural features of the '<em>Stack</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int STACK_FEATURE_COUNT = 4;

   /**
    * The number of operations of the '<em>Stack</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int STACK_OPERATION_COUNT = 0;

   /**
    * Returns the meta object for class '{@link Stack <em>Stack</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>Stack</em>'.
    * @see Stack
    * @generated
    */
   EClass getStack();

   /**
    * Returns the meta object for the attribute '{@link Stack#getId
    * <em>Id</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute '<em>Id</em>'.
    * @see Stack#getId()
    * @see #getStack()
    * @generated
    */
   EAttribute getStack_Id();

   /**
    * Returns the meta object for the reference '{@link Stack#getLeft
    * <em>Left</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the reference '<em>Left</em>'.
    * @see Stack#getLeft()
    * @see #getStack()
    * @generated
    */
   EReference getStack_Left();

   /**
    * Returns the meta object for the attribute '{@link Stack#getLoad
    * <em>Load</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute '<em>Load</em>'.
    * @see Stack#getLoad()
    * @see #getStack()
    * @generated
    */
   EAttribute getStack_Load();

   /**
    * Returns the meta object for the reference '{@link Stack#getRight
    * <em>Right</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the reference '<em>Right</em>'.
    * @see Stack#getRight()
    * @see #getStack()
    * @generated
    */
   EReference getStack_Right();

   /**
    * Returns the factory that creates the instances of the model.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the factory that creates the instances of the model.
    * @generated
    */
   StackFactory getStackFactory();

   /**
    * Returns the meta object for class '{@link StackModel <em>Model</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>Model</em>'.
    * @see StackModel
    * @generated
    */
   EClass getStackModel();

   /**
    * Returns the meta object for the containment reference list
    * '{@link StackModel#getStacks <em>Stacks</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference list '<em>Stacks</em>'.
    * @see StackModel#getStacks()
    * @see #getStackModel()
    * @generated
    */
   EReference getStackModel_Stacks();

} // StackPackage
