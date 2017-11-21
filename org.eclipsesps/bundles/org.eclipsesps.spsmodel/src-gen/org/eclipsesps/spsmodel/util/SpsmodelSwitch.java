/**
 */
package org.eclipsesps.spsmodel.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.eclipsesps.spsmodel.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipsesps.spsmodel.SpsmodelPackage
 * @generated
 */
public class SpsmodelSwitch<T1> extends Switch<T1> {
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static SpsmodelPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SpsmodelSwitch() {
    if (modelPackage == null) {
      modelPackage = SpsmodelPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage) {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T1 doSwitch(int classifierID, EObject theEObject) {
    switch (classifierID) {
      case SpsmodelPackage.IIO_FIELD: {
        IIOField<?> iioField = (IIOField<?>) theEObject;
        T1 result = caseIIOField(iioField);
        if (result == null)
          result = defaultCase(theEObject);
        return result;
      }
      case SpsmodelPackage.WRITEABLE_IO_FIELD: {
        WriteableIOField<?> writeableIOField = (WriteableIOField<?>) theEObject;
        T1 result = caseWriteableIOField(writeableIOField);
        if (result == null)
          result = caseIIOField(writeableIOField);
        if (result == null)
          result = defaultCase(theEObject);
        return result;
      }
      case SpsmodelPackage.ABSTRACT_IO_FIELD: {
        AbstractIOField<?> abstractIOField = (AbstractIOField<?>) theEObject;
        T1 result = caseAbstractIOField(abstractIOField);
        if (result == null)
          result = caseIIOField(abstractIOField);
        if (result == null)
          result = defaultCase(theEObject);
        return result;
      }
      case SpsmodelPackage.ABSTRACT_WRITEABLE_IO_FIELD: {
        AbstractWriteableIOField<?> abstractWriteableIOField =
            (AbstractWriteableIOField<?>) theEObject;
        T1 result = caseAbstractWriteableIOField(abstractWriteableIOField);
        if (result == null)
          result = caseAbstractIOField(abstractWriteableIOField);
        if (result == null)
          result = caseWriteableIOField(abstractWriteableIOField);
        if (result == null)
          result = caseIIOField(abstractWriteableIOField);
        if (result == null)
          result = defaultCase(theEObject);
        return result;
      }
      case SpsmodelPackage.ANALOG_INPUT: {
        AnalogInput analogInput = (AnalogInput) theEObject;
        T1 result = caseAnalogInput(analogInput);
        if (result == null)
          result = caseAbstractIOField(analogInput);
        if (result == null)
          result = caseIIOField(analogInput);
        if (result == null)
          result = defaultCase(theEObject);
        return result;
      }
      case SpsmodelPackage.DIGITAL_INPUT: {
        DigitalInput digitalInput = (DigitalInput) theEObject;
        T1 result = caseDigitalInput(digitalInput);
        if (result == null)
          result = caseAbstractIOField(digitalInput);
        if (result == null)
          result = caseIIOField(digitalInput);
        if (result == null)
          result = defaultCase(theEObject);
        return result;
      }
      case SpsmodelPackage.ANALOG_OUTPUT: {
        AnalogOutput analogOutput = (AnalogOutput) theEObject;
        T1 result = caseAnalogOutput(analogOutput);
        if (result == null)
          result = caseAbstractWriteableIOField(analogOutput);
        if (result == null)
          result = caseAbstractIOField(analogOutput);
        if (result == null)
          result = caseWriteableIOField(analogOutput);
        if (result == null)
          result = caseIIOField(analogOutput);
        if (result == null)
          result = defaultCase(theEObject);
        return result;
      }
      case SpsmodelPackage.DIGITAL_OUTPUT: {
        DigitalOutput digitalOutput = (DigitalOutput) theEObject;
        T1 result = caseDigitalOutput(digitalOutput);
        if (result == null)
          result = caseAbstractWriteableIOField(digitalOutput);
        if (result == null)
          result = caseAbstractIOField(digitalOutput);
        if (result == null)
          result = caseWriteableIOField(digitalOutput);
        if (result == null)
          result = caseIIOField(digitalOutput);
        if (result == null)
          result = defaultCase(theEObject);
        return result;
      }
      default:
        return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>IIO Field</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>IIO Field</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public <T> T1 caseIIOField(IIOField<T> object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Writeable IO Field</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Writeable IO Field</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public <T> T1 caseWriteableIOField(WriteableIOField<T> object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract IO Field</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract IO Field</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public <T> T1 caseAbstractIOField(AbstractIOField<T> object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Writeable IO Field</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Writeable IO Field</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public <T> T1 caseAbstractWriteableIOField(AbstractWriteableIOField<T> object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Analog Input</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Analog Input</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseAnalogInput(AnalogInput object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Digital Input</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Digital Input</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseDigitalInput(DigitalInput object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Analog Output</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Analog Output</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseAnalogOutput(AnalogOutput object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Digital Output</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Digital Output</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseDigitalOutput(DigitalOutput object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T1 defaultCase(EObject object) {
    return null;
  }

} //SpsmodelSwitch
