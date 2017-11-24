/**
 */
package org.eclipsesps.spsmodel.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipsesps.spsmodel.AbstractIOField;
import org.eclipsesps.spsmodel.AbstractWriteableIOField;
import org.eclipsesps.spsmodel.AnalogInput;
import org.eclipsesps.spsmodel.AnalogOutput;
import org.eclipsesps.spsmodel.DigitalInput;
import org.eclipsesps.spsmodel.DigitalOutput;
import org.eclipsesps.spsmodel.IIOField;
import org.eclipsesps.spsmodel.SpsmodelFactory;
import org.eclipsesps.spsmodel.SpsmodelPackage;
import org.eclipsesps.spsmodel.WriteableIOField;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SpsmodelPackageImpl extends EPackageImpl implements SpsmodelPackage {
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass iioFieldEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass writeableIOFieldEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass abstractIOFieldEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass abstractWriteableIOFieldEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass analogInputEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass digitalInputEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass analogOutputEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass digitalOutputEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.eclipsesps.spsmodel.SpsmodelPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private SpsmodelPackageImpl() {
    super(eNS_URI, SpsmodelFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link SpsmodelPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static SpsmodelPackage init() {
    if (isInited)
      return (SpsmodelPackage) EPackage.Registry.INSTANCE.getEPackage(SpsmodelPackage.eNS_URI);

    // Obtain or create and register package
    SpsmodelPackageImpl theSpsmodelPackage = (SpsmodelPackageImpl) (EPackage.Registry.INSTANCE
        .get(eNS_URI) instanceof SpsmodelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
            : new SpsmodelPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theSpsmodelPackage.createPackageContents();

    // Initialize created meta-data
    theSpsmodelPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theSpsmodelPackage.freeze();


    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(SpsmodelPackage.eNS_URI, theSpsmodelPackage);
    return theSpsmodelPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIIOField() {
    return iioFieldEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getIIOField__GetId() {
    return iioFieldEClass.getEOperations().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getIIOField__GetValue() {
    return iioFieldEClass.getEOperations().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWriteableIOField() {
    return writeableIOFieldEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getWriteableIOField__WriteValue__Object() {
    return writeableIOFieldEClass.getEOperations().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getWriteableIOField__WriteValueSync__Object() {
    return writeableIOFieldEClass.getEOperations().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbstractIOField() {
    return abstractIOFieldEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAbstractIOField_Id() {
    return (EAttribute) abstractIOFieldEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAbstractIOField_Value() {
    return (EAttribute) abstractIOFieldEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbstractWriteableIOField() {
    return abstractWriteableIOFieldEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAnalogInput() {
    return analogInputEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDigitalInput() {
    return digitalInputEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAnalogOutput() {
    return analogOutputEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDigitalOutput() {
    return digitalOutputEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SpsmodelFactory getSpsmodelFactory() {
    return (SpsmodelFactory) getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents() {
    if (isCreated)
      return;
    isCreated = true;

    // Create classes and their features
    iioFieldEClass = createEClass(IIO_FIELD);
    createEOperation(iioFieldEClass, IIO_FIELD___GET_ID);
    createEOperation(iioFieldEClass, IIO_FIELD___GET_VALUE);

    writeableIOFieldEClass = createEClass(WRITEABLE_IO_FIELD);
    createEOperation(writeableIOFieldEClass, WRITEABLE_IO_FIELD___WRITE_VALUE__OBJECT);
    createEOperation(writeableIOFieldEClass, WRITEABLE_IO_FIELD___WRITE_VALUE_SYNC__OBJECT);

    abstractIOFieldEClass = createEClass(ABSTRACT_IO_FIELD);
    createEAttribute(abstractIOFieldEClass, ABSTRACT_IO_FIELD__ID);
    createEAttribute(abstractIOFieldEClass, ABSTRACT_IO_FIELD__VALUE);

    abstractWriteableIOFieldEClass = createEClass(ABSTRACT_WRITEABLE_IO_FIELD);

    analogInputEClass = createEClass(ANALOG_INPUT);

    digitalInputEClass = createEClass(DIGITAL_INPUT);

    analogOutputEClass = createEClass(ANALOG_OUTPUT);

    digitalOutputEClass = createEClass(DIGITAL_OUTPUT);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents() {
    if (isInitialized)
      return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters
    ETypeParameter iioFieldEClass_T = addETypeParameter(iioFieldEClass, "T");
    ETypeParameter writeableIOFieldEClass_T = addETypeParameter(writeableIOFieldEClass, "T");
    ETypeParameter abstractIOFieldEClass_T = addETypeParameter(abstractIOFieldEClass, "T");
    ETypeParameter abstractWriteableIOFieldEClass_T =
        addETypeParameter(abstractWriteableIOFieldEClass, "T");

    // Set bounds for type parameters

    // Add supertypes to classes
    EGenericType g1 = createEGenericType(this.getIIOField());
    EGenericType g2 = createEGenericType(writeableIOFieldEClass_T);
    g1.getETypeArguments().add(g2);
    writeableIOFieldEClass.getEGenericSuperTypes().add(g1);
    g1 = createEGenericType(this.getIIOField());
    g2 = createEGenericType(abstractIOFieldEClass_T);
    g1.getETypeArguments().add(g2);
    abstractIOFieldEClass.getEGenericSuperTypes().add(g1);
    g1 = createEGenericType(this.getAbstractIOField());
    g2 = createEGenericType(abstractWriteableIOFieldEClass_T);
    g1.getETypeArguments().add(g2);
    abstractWriteableIOFieldEClass.getEGenericSuperTypes().add(g1);
    g1 = createEGenericType(this.getWriteableIOField());
    g2 = createEGenericType(abstractWriteableIOFieldEClass_T);
    g1.getETypeArguments().add(g2);
    abstractWriteableIOFieldEClass.getEGenericSuperTypes().add(g1);
    g1 = createEGenericType(this.getAbstractIOField());
    g2 = createEGenericType(ecorePackage.getEIntegerObject());
    g1.getETypeArguments().add(g2);
    analogInputEClass.getEGenericSuperTypes().add(g1);
    g1 = createEGenericType(this.getAbstractIOField());
    g2 = createEGenericType(ecorePackage.getEBooleanObject());
    g1.getETypeArguments().add(g2);
    digitalInputEClass.getEGenericSuperTypes().add(g1);
    g1 = createEGenericType(this.getAbstractWriteableIOField());
    g2 = createEGenericType(ecorePackage.getEIntegerObject());
    g1.getETypeArguments().add(g2);
    analogOutputEClass.getEGenericSuperTypes().add(g1);
    g1 = createEGenericType(this.getAbstractWriteableIOField());
    g2 = createEGenericType(ecorePackage.getEBooleanObject());
    g1.getETypeArguments().add(g2);
    digitalOutputEClass.getEGenericSuperTypes().add(g1);

    // Initialize classes, features, and operations; add parameters
    initEClass(iioFieldEClass, IIOField.class, "IIOField", IS_ABSTRACT, IS_INTERFACE,
        IS_GENERATED_INSTANCE_CLASS);

    initEOperation(getIIOField__GetId(), ecorePackage.getEString(), "getId", 0, 1, IS_UNIQUE,
        IS_ORDERED);

    EOperation op =
        initEOperation(getIIOField__GetValue(), null, "getValue", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(iioFieldEClass_T);
    initEOperation(op, g1);

    initEClass(writeableIOFieldEClass, WriteableIOField.class, "WriteableIOField", IS_ABSTRACT,
        IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = initEOperation(getWriteableIOField__WriteValue__Object(), null, "writeValue", 0, 1,
        IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(writeableIOFieldEClass_T);
    addEParameter(op, g1, "value", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = initEOperation(getWriteableIOField__WriteValueSync__Object(), null, "writeValueSync", 0, 1,
        IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(writeableIOFieldEClass_T);
    addEParameter(op, g1, "value", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(abstractIOFieldEClass, AbstractIOField.class, "AbstractIOField", IS_ABSTRACT,
        !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAbstractIOField_Id(), ecorePackage.getEString(), "id", "default", 0, 1,
        AbstractIOField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID,
        IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    g1 = createEGenericType(abstractIOFieldEClass_T);
    initEAttribute(getAbstractIOField_Value(), g1, "value", null, 0, 1, AbstractIOField.class,
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
        IS_ORDERED);

    initEClass(abstractWriteableIOFieldEClass, AbstractWriteableIOField.class,
        "AbstractWriteableIOField", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(analogInputEClass, AnalogInput.class, "AnalogInput", !IS_ABSTRACT, !IS_INTERFACE,
        IS_GENERATED_INSTANCE_CLASS);

    initEClass(digitalInputEClass, DigitalInput.class, "DigitalInput", !IS_ABSTRACT, !IS_INTERFACE,
        IS_GENERATED_INSTANCE_CLASS);

    initEClass(analogOutputEClass, AnalogOutput.class, "AnalogOutput", !IS_ABSTRACT, !IS_INTERFACE,
        IS_GENERATED_INSTANCE_CLASS);

    initEClass(digitalOutputEClass, DigitalOutput.class, "DigitalOutput", !IS_ABSTRACT,
        !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);
  }

} //SpsmodelPackageImpl
