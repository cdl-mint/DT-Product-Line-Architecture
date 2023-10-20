/**
 */
package com.example.Planner.momotcore.models.icmt.tool.momot.demo.architecture;

import com.example.Planner.momotcore.models.icmt.tool.momot.demo.architecture.impl.*;
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
 * @see ArchitectureFactory
 * @model kind="package"
 * @generated
 */
public interface ArchitecturePackage extends EPackage {
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
       * The meta object literal for the '{@link ClassModelImpl <em>Class
       * Model</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       *
       * @see ClassModelImpl
       * @see ArchitecturePackageImpl#getClassModel()
       * @generated
       */
      EClass CLASS_MODEL = eINSTANCE.getClassModel();

      /**
       * The meta object literal for the '<em><b>Classes</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       *
       * @generated
       */
      EReference CLASS_MODEL__CLASSES = eINSTANCE.getClassModel_Classes();

      /**
       * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       *
       * @generated
       */
      EReference CLASS_MODEL__FEATURES = eINSTANCE.getClassModel_Features();

      /**
       * The meta object literal for the '{@link ClassImpl <em>Class</em>}'
       * class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       *
       * @see ClassImpl
       * @see ArchitecturePackageImpl#getClass_()
       * @generated
       */
      EClass CLASS = eINSTANCE.getClass_();

      /**
       * The meta object literal for the '<em><b>Encapsulates</b></em>' reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       *
       * @generated
       */
      EReference CLASS__ENCAPSULATES = eINSTANCE.getClass_Encapsulates();

      /**
       * The meta object literal for the '{@link AttributeImpl
       * <em>Attribute</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       *
       * @see AttributeImpl
       * @see ArchitecturePackageImpl#getAttribute()
       * @generated
       */
      EClass ATTRIBUTE = eINSTANCE.getAttribute();

      /**
       * The meta object literal for the '{@link MethodImpl <em>Method</em>}'
       * class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       *
       * @see MethodImpl
       * @see ArchitecturePackageImpl#getMethod()
       * @generated
       */
      EClass METHOD = eINSTANCE.getMethod();

      /**
       * The meta object literal for the '<em><b>Data Dependency</b></em>' reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       *
       * @generated
       */
      EReference METHOD__DATA_DEPENDENCY = eINSTANCE.getMethod_DataDependency();

      /**
       * The meta object literal for the '<em><b>Functional Dependency</b></em>' reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       *
       * @generated
       */
      EReference METHOD__FUNCTIONAL_DEPENDENCY = eINSTANCE.getMethod_FunctionalDependency();

      /**
       * The meta object literal for the '{@link FeatureImpl <em>Feature</em>}'
       * class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       *
       * @see FeatureImpl
       * @see ArchitecturePackageImpl#getFeature()
       * @generated
       */
      EClass FEATURE = eINSTANCE.getFeature();

      /**
       * The meta object literal for the '<em><b>Is Encapsulated By</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       *
       * @generated
       */
      EReference FEATURE__IS_ENCAPSULATED_BY = eINSTANCE.getFeature_IsEncapsulatedBy();

      /**
       * The meta object literal for the '{@link NamedElementImpl <em>Named
       * Element</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       *
       * @see NamedElementImpl
       * @see ArchitecturePackageImpl#getNamedElement()
       * @generated
       */
      EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

      /**
       * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       *
       * @generated
       */
      EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

   }

   /**
    * The package name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @generated
    */
   String eNAME = "architecture";

   /**
    * The package namespace URI.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @generated
    */
   String eNS_URI = "http://momot.big.tuwien.ac.at/examples/icmt/architecture/1.0";

   /**
    * The package namespace name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @generated
    */
   String eNS_PREFIX = "architecture";

   /**
    * The singleton instance of the package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @generated
    */
   ArchitecturePackage eINSTANCE = ArchitecturePackageImpl.init();

   /**
    * The meta object id for the '{@link NamedElementImpl <em>Named
    * Element</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @see NamedElementImpl
    * @see ArchitecturePackageImpl#getNamedElement()
    * @generated
    */
   int NAMED_ELEMENT = 5;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @generated
    * @ordered
    */
   int NAMED_ELEMENT__NAME = 0;

   /**
    * The number of structural features of the '<em>Named Element</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @generated
    * @ordered
    */
   int NAMED_ELEMENT_FEATURE_COUNT = 1;

   /**
    * The number of operations of the '<em>Named Element</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @generated
    * @ordered
    */
   int NAMED_ELEMENT_OPERATION_COUNT = 0;

   /**
    * The meta object id for the '{@link ClassModelImpl <em>Class Model</em>}'
    * class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @see ClassModelImpl
    * @see ArchitecturePackageImpl#getClassModel()
    * @generated
    */
   int CLASS_MODEL = 0;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @generated
    * @ordered
    */
   int CLASS_MODEL__NAME = NAMED_ELEMENT__NAME;

   /**
    * The feature id for the '<em><b>Classes</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @generated
    * @ordered
    */
   int CLASS_MODEL__CLASSES = NAMED_ELEMENT_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Features</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @generated
    * @ordered
    */
   int CLASS_MODEL__FEATURES = NAMED_ELEMENT_FEATURE_COUNT + 1;

   /**
    * The number of structural features of the '<em>Class Model</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @generated
    * @ordered
    */
   int CLASS_MODEL_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

   /**
    * The number of operations of the '<em>Class Model</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @generated
    * @ordered
    */
   int CLASS_MODEL_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

   /**
    * The meta object id for the '{@link ClassImpl <em>Class</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @see ClassImpl
    * @see ArchitecturePackageImpl#getClass_()
    * @generated
    */
   int CLASS = 1;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @generated
    * @ordered
    */
   int CLASS__NAME = NAMED_ELEMENT__NAME;

   /**
    * The feature id for the '<em><b>Encapsulates</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @generated
    * @ordered
    */
   int CLASS__ENCAPSULATES = NAMED_ELEMENT_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>Class</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @generated
    * @ordered
    */
   int CLASS_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

   /**
    * The number of operations of the '<em>Class</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @generated
    * @ordered
    */
   int CLASS_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

   /**
    * The meta object id for the '{@link FeatureImpl <em>Feature</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @see FeatureImpl
    * @see ArchitecturePackageImpl#getFeature()
    * @generated
    */
   int FEATURE = 4;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @generated
    * @ordered
    */
   int FEATURE__NAME = NAMED_ELEMENT__NAME;

   /**
    * The feature id for the '<em><b>Is Encapsulated By</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @generated
    * @ordered
    */
   int FEATURE__IS_ENCAPSULATED_BY = NAMED_ELEMENT_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>Feature</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @generated
    * @ordered
    */
   int FEATURE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

   /**
    * The number of operations of the '<em>Feature</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @generated
    * @ordered
    */
   int FEATURE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

   /**
    * The meta object id for the '{@link AttributeImpl <em>Attribute</em>}'
    * class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @see AttributeImpl
    * @see ArchitecturePackageImpl#getAttribute()
    * @generated
    */
   int ATTRIBUTE = 2;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @generated
    * @ordered
    */
   int ATTRIBUTE__NAME = FEATURE__NAME;

   /**
    * The feature id for the '<em><b>Is Encapsulated By</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @generated
    * @ordered
    */
   int ATTRIBUTE__IS_ENCAPSULATED_BY = FEATURE__IS_ENCAPSULATED_BY;

   /**
    * The number of structural features of the '<em>Attribute</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @generated
    * @ordered
    */
   int ATTRIBUTE_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 0;

   /**
    * The number of operations of the '<em>Attribute</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @generated
    * @ordered
    */
   int ATTRIBUTE_OPERATION_COUNT = FEATURE_OPERATION_COUNT + 0;

   /**
    * The meta object id for the '{@link MethodImpl <em>Method</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @see MethodImpl
    * @see ArchitecturePackageImpl#getMethod()
    * @generated
    */
   int METHOD = 3;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @generated
    * @ordered
    */
   int METHOD__NAME = FEATURE__NAME;

   /**
    * The feature id for the '<em><b>Is Encapsulated By</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @generated
    * @ordered
    */
   int METHOD__IS_ENCAPSULATED_BY = FEATURE__IS_ENCAPSULATED_BY;

   /**
    * The feature id for the '<em><b>Data Dependency</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @generated
    * @ordered
    */
   int METHOD__DATA_DEPENDENCY = FEATURE_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Functional Dependency</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @generated
    * @ordered
    */
   int METHOD__FUNCTIONAL_DEPENDENCY = FEATURE_FEATURE_COUNT + 1;

   /**
    * The number of structural features of the '<em>Method</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @generated
    * @ordered
    */
   int METHOD_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 2;

   /**
    * The number of operations of the '<em>Method</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @generated
    * @ordered
    */
   int METHOD_OPERATION_COUNT = FEATURE_OPERATION_COUNT + 0;

   /**
    * Returns the factory that creates the instances of the model.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @return the factory that creates the instances of the model.
    * @generated
    */
   ArchitectureFactory getArchitectureFactory();

   /**
    * Returns the meta object for class '{@link Attribute <em>Attribute</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @return the meta object for class '<em>Attribute</em>'.
    * @see Attribute
    * @generated
    */
   EClass getAttribute();

   /**
    * Returns the meta object for class '{@link Class <em>Class</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @return the meta object for class '<em>Class</em>'.
    * @see Class
    * @generated
    */
   EClass getClass_();

   /**
    * Returns the meta object for the reference list '{@link Class#getEncapsulates
    * <em>Encapsulates</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @return the meta object for the reference list '<em>Encapsulates</em>'.
    * @see Class#getEncapsulates()
    * @see #getClass_()
    * @generated
    */
   EReference getClass_Encapsulates();

   /**
    * Returns the meta object for class '{@link ClassModel <em>Class Model</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @return the meta object for class '<em>Class Model</em>'.
    * @see ClassModel
    * @generated
    */
   EClass getClassModel();

   /**
    * Returns the meta object for the containment reference list
    * '{@link ClassModel#getClasses <em>Classes</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @return the meta object for the containment reference list '<em>Classes</em>'.
    * @see ClassModel#getClasses()
    * @see #getClassModel()
    * @generated
    */
   EReference getClassModel_Classes();

   /**
    * Returns the meta object for the containment reference list
    * '{@link ClassModel#getFeatures <em>Features</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @return the meta object for the containment reference list '<em>Features</em>'.
    * @see ClassModel#getFeatures()
    * @see #getClassModel()
    * @generated
    */
   EReference getClassModel_Features();

   /**
    * Returns the meta object for class '{@link Feature <em>Feature</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @return the meta object for class '<em>Feature</em>'.
    * @see Feature
    * @generated
    */
   EClass getFeature();

   /**
    * Returns the meta object for the reference '{@link Feature#getIsEncapsulatedBy
    * <em>Is Encapsulated By</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @return the meta object for the reference '<em>Is Encapsulated By</em>'.
    * @see Feature#getIsEncapsulatedBy()
    * @see #getFeature()
    * @generated
    */
   EReference getFeature_IsEncapsulatedBy();

   /**
    * Returns the meta object for class '{@link Method <em>Method</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @return the meta object for class '<em>Method</em>'.
    * @see Method
    * @generated
    */
   EClass getMethod();

   /**
    * Returns the meta object for the reference list '{@link Method#getDataDependency
    * <em>Data Dependency</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @return the meta object for the reference list '<em>Data Dependency</em>'.
    * @see Method#getDataDependency()
    * @see #getMethod()
    * @generated
    */
   EReference getMethod_DataDependency();

   /**
    * Returns the meta object for the reference list
    * '{@link Method#getFunctionalDependency <em>Functional Dependency</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @return the meta object for the reference list '<em>Functional Dependency</em>'.
    * @see Method#getFunctionalDependency()
    * @see #getMethod()
    * @generated
    */
   EReference getMethod_FunctionalDependency();

   /**
    * Returns the meta object for class '{@link NamedElement <em>Named Element</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @return the meta object for class '<em>Named Element</em>'.
    * @see NamedElement
    * @generated
    */
   EClass getNamedElement();

   /**
    * Returns the meta object for the attribute '{@link NamedElement#getName
    * <em>Name</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @return the meta object for the attribute '<em>Name</em>'.
    * @see NamedElement#getName()
    * @see #getNamedElement()
    * @generated
    */
   EAttribute getNamedElement_Name();

} // ArchitecturePackage
