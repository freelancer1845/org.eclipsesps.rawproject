/**
 */
package org.eclipsesps.spsmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IIO Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * General IOField. This IO Field only supports getting its Value and its Id which should be an identfier to cleary state whate the field is.
 * <!-- end-model-doc -->
 *
 *
 * @see org.eclipsesps.spsmodel.SpsmodelPackage#getIIOField()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IIOField<T> extends EObject {
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * The Identification of the IO Field. Should cleary state the intendet use of the field.
   * <!-- end-model-doc -->
   * @model kind="operation"
   * @generated
   */
  String getId();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * Returns the current Value of the field (This is a stored value and may not reflect the true value in the machine).
   * <!-- end-model-doc -->
   * @model kind="operation"
   * @generated
   */
  T getValue();

} // IIOField
