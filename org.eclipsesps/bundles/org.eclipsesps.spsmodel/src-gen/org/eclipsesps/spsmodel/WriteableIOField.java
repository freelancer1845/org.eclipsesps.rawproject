/**
 */
package org.eclipsesps.spsmodel;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Writeable IO
 * Field</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.eclipsesps.spsmodel.SpsmodelPackage#getWriteableIOField()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface WriteableIOField<T> extends IIOField<T> {
  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Writes the value to this
   * IOField. This only triggers the machine interface to write the value and may not result in the
   * actual writing. The method is asnyc. See {@linkplain writeValueSync()} for a synchronous
   * writing <!-- end-model-doc -->
   * 
   * @throws SpsConnectorException
   * @model
   * @generated NOT
   */
  void writeValue(T value) throws SpsConnectorException;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Write the value sync and
   * blocks until the value is writen. <!-- end-model-doc -->
   * 
   * @throws SpsConnectorException
   * 
   * @model
   * @generated NOT
   */
  void writeValueSync(T value) throws SpsConnectorException;

} // WriteableIOField
