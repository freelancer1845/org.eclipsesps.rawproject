/**
 */
package org.eclipsesps.spsmodel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipsesps.spsmodel.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SpsmodelFactoryImpl extends EFactoryImpl implements SpsmodelFactory {
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SpsmodelFactory init() {
    try {
      SpsmodelFactory theSpsmodelFactory =
          (SpsmodelFactory) EPackage.Registry.INSTANCE.getEFactory(SpsmodelPackage.eNS_URI);
      if (theSpsmodelFactory != null) {
        return theSpsmodelFactory;
      }
    } catch (Exception exception) {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SpsmodelFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SpsmodelFactoryImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass) {
    switch (eClass.getClassifierID()) {
      case SpsmodelPackage.ANALOG_INPUT:
        return createAnalogInput();
      case SpsmodelPackage.DIGITAL_INPUT:
        return createDigitalInput();
      case SpsmodelPackage.ANALOG_OUTPUT:
        return createAnalogOutput();
      case SpsmodelPackage.DIGITAL_OUTPUT:
        return createDigitalOutput();
      default:
        throw new IllegalArgumentException(
            "The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnalogInput createAnalogInput() {
    AnalogInputImpl analogInput = new AnalogInputImpl();
    return analogInput;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DigitalInput createDigitalInput() {
    DigitalInputImpl digitalInput = new DigitalInputImpl();
    return digitalInput;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnalogOutput createAnalogOutput() {
    AnalogOutputImpl analogOutput = new AnalogOutputImpl();
    return analogOutput;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DigitalOutput createDigitalOutput() {
    DigitalOutputImpl digitalOutput = new DigitalOutputImpl();
    return digitalOutput;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SpsmodelPackage getSpsmodelPackage() {
    return (SpsmodelPackage) getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SpsmodelPackage getPackage() {
    return SpsmodelPackage.eINSTANCE;
  }

} //SpsmodelFactoryImpl
