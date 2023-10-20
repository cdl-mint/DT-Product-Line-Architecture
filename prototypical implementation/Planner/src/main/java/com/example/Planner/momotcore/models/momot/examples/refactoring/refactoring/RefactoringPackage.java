/**
 */
package com.example.Planner.momotcore.models.momot.examples.refactoring.refactoring;

import com.example.Planner.momotcore.models.momot.examples.refactoring.refactoring.impl.*;
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
 * @see RefactoringFactory
 * @model kind="package"
 * @generated
 */
public interface RefactoringPackage extends EPackage {
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
       * The meta object literal for the
       * '{@link PropertyImpl <em>Property</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see PropertyImpl
       * @see RefactoringPackageImpl#getProperty()
       * @generated
       */
      EClass PROPERTY = eINSTANCE.getProperty();

      /**
       * The meta object literal for the '<em><b>Type</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference PROPERTY__TYPE = eINSTANCE.getProperty_Type();

      /**
       * The meta object literal for the '{@link EntityImpl
       * <em>Entity</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see EntityImpl
       * @see RefactoringPackageImpl#getEntity()
       * @generated
       */
      EClass ENTITY = eINSTANCE.getEntity();

      /**
       * The meta object literal for the '<em><b>Owned Attribute</b></em>' reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference ENTITY__OWNED_ATTRIBUTE = eINSTANCE.getEntity_OwnedAttribute();

      /**
       * The meta object literal for the '<em><b>Specialization</b></em>' reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference ENTITY__SPECIALIZATION = eINSTANCE.getEntity_Specialization();

      /**
       * The meta object literal for the '<em><b>Generalization</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference ENTITY__GENERALIZATION = eINSTANCE.getEntity_Generalization();

      /**
       * The meta object literal for the
       * '{@link GeneralizationImpl
       * <em>Generalization</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see GeneralizationImpl
       * @see RefactoringPackageImpl#getGeneralization()
       * @generated
       */
      EClass GENERALIZATION = eINSTANCE.getGeneralization();

      /**
       * The meta object literal for the '<em><b>Specific</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference GENERALIZATION__SPECIFIC = eINSTANCE.getGeneralization_Specific();

      /**
       * The meta object literal for the '<em><b>General</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference GENERALIZATION__GENERAL = eINSTANCE.getGeneralization_General();

      /**
       * The meta object literal for the
       * '{@link NamedElementImpl <em>Named Element</em>}'
       * class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see NamedElementImpl
       * @see RefactoringPackageImpl#getNamedElement()
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

      /**
       * The meta object literal for the '{@link TypeImpl
       * <em>Type</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see TypeImpl
       * @see RefactoringPackageImpl#getType()
       * @generated
       */
      EClass TYPE = eINSTANCE.getType();

      /**
       * The meta object literal for the
       * '{@link RefactoringModelImpl <em>Model</em>}'
       * class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see RefactoringModelImpl
       * @see RefactoringPackageImpl#getRefactoringModel()
       * @generated
       */
      EClass REFACTORING_MODEL = eINSTANCE.getRefactoringModel();

      /**
       * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference REFACTORING_MODEL__PROPERTIES = eINSTANCE.getRefactoringModel_Properties();

      /**
       * The meta object literal for the '<em><b>Entities</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference REFACTORING_MODEL__ENTITIES = eINSTANCE.getRefactoringModel_Entities();

      /**
       * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference REFACTORING_MODEL__TYPES = eINSTANCE.getRefactoringModel_Types();

      /**
       * The meta object literal for the '<em><b>Generalizations</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference REFACTORING_MODEL__GENERALIZATIONS = eINSTANCE.getRefactoringModel_Generalizations();

   }

   /**
    * The package name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   String eNAME = "refactoring";

   /**
    * The package namespace URI.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   String eNS_URI = "http://momot.big.tuwien.ac.at/examples/refactoring/1.0";

   /**
    * The package namespace name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   String eNS_PREFIX = "refactoring";

   /**
    * The singleton instance of the package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   RefactoringPackage eINSTANCE = RefactoringPackageImpl
         .init();

   /**
    * The meta object id for the '{@link NamedElementImpl
    * <em>Named Element</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see NamedElementImpl
    * @see RefactoringPackageImpl#getNamedElement()
    * @generated
    */
   int NAMED_ELEMENT = 3;

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
    * The meta object id for the '{@link PropertyImpl
    * <em>Property</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see PropertyImpl
    * @see RefactoringPackageImpl#getProperty()
    * @generated
    */
   int PROPERTY = 0;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int PROPERTY__NAME = NAMED_ELEMENT__NAME;

   /**
    * The feature id for the '<em><b>Type</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int PROPERTY__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>Property</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int PROPERTY_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

   /**
    * The number of operations of the '<em>Property</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int PROPERTY_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

   /**
    * The meta object id for the '{@link EntityImpl
    * <em>Entity</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see EntityImpl
    * @see RefactoringPackageImpl#getEntity()
    * @generated
    */
   int ENTITY = 1;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int ENTITY__NAME = NAMED_ELEMENT__NAME;

   /**
    * The feature id for the '<em><b>Owned Attribute</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int ENTITY__OWNED_ATTRIBUTE = NAMED_ELEMENT_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Specialization</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int ENTITY__SPECIALIZATION = NAMED_ELEMENT_FEATURE_COUNT + 1;

   /**
    * The feature id for the '<em><b>Generalization</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int ENTITY__GENERALIZATION = NAMED_ELEMENT_FEATURE_COUNT + 2;

   /**
    * The number of structural features of the '<em>Entity</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int ENTITY_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

   /**
    * The number of operations of the '<em>Entity</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int ENTITY_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

   /**
    * The meta object id for the '{@link GeneralizationImpl
    * <em>Generalization</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see GeneralizationImpl
    * @see RefactoringPackageImpl#getGeneralization()
    * @generated
    */
   int GENERALIZATION = 2;

   /**
    * The feature id for the '<em><b>Specific</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int GENERALIZATION__SPECIFIC = 0;

   /**
    * The feature id for the '<em><b>General</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int GENERALIZATION__GENERAL = 1;

   /**
    * The number of structural features of the '<em>Generalization</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int GENERALIZATION_FEATURE_COUNT = 2;

   /**
    * The number of operations of the '<em>Generalization</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int GENERALIZATION_OPERATION_COUNT = 0;

   /**
    * The meta object id for the '{@link TypeImpl
    * <em>Type</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see TypeImpl
    * @see RefactoringPackageImpl#getType()
    * @generated
    */
   int TYPE = 4;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int TYPE__NAME = NAMED_ELEMENT__NAME;

   /**
    * The number of structural features of the '<em>Type</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int TYPE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

   /**
    * The number of operations of the '<em>Type</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int TYPE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

   /**
    * The meta object id for the
    * '{@link RefactoringModelImpl <em>Model</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see RefactoringModelImpl
    * @see RefactoringPackageImpl#getRefactoringModel()
    * @generated
    */
   int REFACTORING_MODEL = 5;

   /**
    * The feature id for the '<em><b>Properties</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int REFACTORING_MODEL__PROPERTIES = 0;

   /**
    * The feature id for the '<em><b>Entities</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int REFACTORING_MODEL__ENTITIES = 1;

   /**
    * The feature id for the '<em><b>Types</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int REFACTORING_MODEL__TYPES = 2;

   /**
    * The feature id for the '<em><b>Generalizations</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int REFACTORING_MODEL__GENERALIZATIONS = 3;

   /**
    * The number of structural features of the '<em>Model</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int REFACTORING_MODEL_FEATURE_COUNT = 4;

   /**
    * The number of operations of the '<em>Model</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int REFACTORING_MODEL_OPERATION_COUNT = 0;

   /**
    * Returns the meta object for class '{@link Entity
    * <em>Entity</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>Entity</em>'.
    * @see Entity
    * @generated
    */
   EClass getEntity();

   /**
    * Returns the meta object for the reference
    * '{@link Entity#getGeneralization
    * <em>Generalization</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the reference '<em>Generalization</em>'.
    * @see Entity#getGeneralization()
    * @see #getEntity()
    * @generated
    */
   EReference getEntity_Generalization();

   /**
    * Returns the meta object for the reference list
    * '{@link Entity#getOwnedAttribute <em>Owned
    * Attribute</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the reference list '<em>Owned Attribute</em>'.
    * @see Entity#getOwnedAttribute()
    * @see #getEntity()
    * @generated
    */
   EReference getEntity_OwnedAttribute();

   /**
    * Returns the meta object for the reference list
    * '{@link Entity#getSpecialization
    * <em>Specialization</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the reference list '<em>Specialization</em>'.
    * @see Entity#getSpecialization()
    * @see #getEntity()
    * @generated
    */
   EReference getEntity_Specialization();

   /**
    * Returns the meta object for class '{@link Generalization
    * <em>Generalization</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>Generalization</em>'.
    * @see Generalization
    * @generated
    */
   EClass getGeneralization();

   /**
    * Returns the meta object for the reference
    * '{@link Generalization#getGeneral <em>General</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the reference '<em>General</em>'.
    * @see Generalization#getGeneral()
    * @see #getGeneralization()
    * @generated
    */
   EReference getGeneralization_General();

   /**
    * Returns the meta object for the reference
    * '{@link Generalization#getSpecific <em>Specific</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the reference '<em>Specific</em>'.
    * @see Generalization#getSpecific()
    * @see #getGeneralization()
    * @generated
    */
   EReference getGeneralization_Specific();

   /**
    * Returns the meta object for class '{@link NamedElement
    * <em>Named Element</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>Named Element</em>'.
    * @see NamedElement
    * @generated
    */
   EClass getNamedElement();

   /**
    * Returns the meta object for the attribute
    * '{@link NamedElement#getName <em>Name</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute '<em>Name</em>'.
    * @see NamedElement#getName()
    * @see #getNamedElement()
    * @generated
    */
   EAttribute getNamedElement_Name();

   /**
    * Returns the meta object for class '{@link Property
    * <em>Property</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>Property</em>'.
    * @see Property
    * @generated
    */
   EClass getProperty();

   /**
    * Returns the meta object for the reference
    * '{@link Property#getType <em>Type</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the reference '<em>Type</em>'.
    * @see Property#getType()
    * @see #getProperty()
    * @generated
    */
   EReference getProperty_Type();

   /**
    * Returns the factory that creates the instances of the model.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the factory that creates the instances of the model.
    * @generated
    */
   RefactoringFactory getRefactoringFactory();

   /**
    * Returns the meta object for class '{@link RefactoringModel
    * <em>Model</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>Model</em>'.
    * @see RefactoringModel
    * @generated
    */
   EClass getRefactoringModel();

   /**
    * Returns the meta object for the containment reference list
    * '{@link RefactoringModel#getEntities <em>Entities</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference list '<em>Entities</em>'.
    * @see RefactoringModel#getEntities()
    * @see #getRefactoringModel()
    * @generated
    */
   EReference getRefactoringModel_Entities();

   /**
    * Returns the meta object for the containment reference list
    * '{@link RefactoringModel#getGeneralizations
    * <em>Generalizations</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference list '<em>Generalizations</em>'.
    * @see RefactoringModel#getGeneralizations()
    * @see #getRefactoringModel()
    * @generated
    */
   EReference getRefactoringModel_Generalizations();

   /**
    * Returns the meta object for the containment reference list
    * '{@link RefactoringModel#getProperties
    * <em>Properties</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference list '<em>Properties</em>'.
    * @see RefactoringModel#getProperties()
    * @see #getRefactoringModel()
    * @generated
    */
   EReference getRefactoringModel_Properties();

   /**
    * Returns the meta object for the containment reference list
    * '{@link RefactoringModel#getTypes <em>Types</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference list '<em>Types</em>'.
    * @see RefactoringModel#getTypes()
    * @see #getRefactoringModel()
    * @generated
    */
   EReference getRefactoringModel_Types();

   /**
    * Returns the meta object for class '{@link Type
    * <em>Type</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>Type</em>'.
    * @see Type
    * @generated
    */
   EClass getType();

} // RefactoringPackage
