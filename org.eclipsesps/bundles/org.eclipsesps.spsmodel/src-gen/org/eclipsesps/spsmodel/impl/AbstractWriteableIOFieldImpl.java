/**
 */
package org.eclipsesps.spsmodel.impl;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipsesps.spsconnector.api.SpsConnectorException;
import org.eclipsesps.spsmodel.AbstractWriteableIOField;
import org.eclipsesps.spsmodel.SpsmodelPackage;
import org.eclipsesps.spsmodel.WriteableIOField;
import org.eclipsesps.spsmodel.util.SpsConnectorRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Abstract Writeable IO
 * Field</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class AbstractWriteableIOFieldImpl<T> extends AbstractIOFieldImpl<T>
    implements AbstractWriteableIOField<T> {

  /**
   * The usual Logger.
   * 
   * @generated NOT
   */
  private static final Logger LOGGER = LoggerFactory.getLogger(AbstractWriteableIOFieldImpl.class);


  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected AbstractWriteableIOFieldImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return SpsmodelPackage.Literals.ABSTRACT_WRITEABLE_IO_FIELD;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @throws SpsConnectorException
   * 
   * @generated NOT
   */
  public void writeValue(T value) throws SpsConnectorException {
    SpsConnectorRegistry.getInstance().getSpsConnector().queueIOWrite(getId(), value);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @throws SpsConnectorException
   * 
   * @generated NOT
   */
  public void writeValueSync(T value) throws SpsConnectorException {
    SpsConnectorRegistry.getInstance().getSpsConnector().writeIO(getId(), value);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
    if (baseClass == WriteableIOField.class) {
      switch (baseOperationID) {
        case SpsmodelPackage.WRITEABLE_IO_FIELD___WRITE_VALUE__OBJECT:
          return SpsmodelPackage.ABSTRACT_WRITEABLE_IO_FIELD___WRITE_VALUE__OBJECT;
        case SpsmodelPackage.WRITEABLE_IO_FIELD___WRITE_VALUE_SYNC__OBJECT:
          return SpsmodelPackage.ABSTRACT_WRITEABLE_IO_FIELD___WRITE_VALUE_SYNC__OBJECT;
        default:
          return -1;
      }
    }
    return super.eDerivedOperationID(baseOperationID, baseClass);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated NOT
   */
  @Override
  public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
    switch (operationID) {
      case SpsmodelPackage.ABSTRACT_WRITEABLE_IO_FIELD___WRITE_VALUE__OBJECT:
        try {
          writeValue((T) arguments.get(0));
        } catch (SpsConnectorException e) {
          LOGGER.error("Failed to write value.", e);
        }
        return null;
      case SpsmodelPackage.ABSTRACT_WRITEABLE_IO_FIELD___WRITE_VALUE_SYNC__OBJECT:
        try {
          writeValueSync((T) arguments.get(0));
        } catch (SpsConnectorException e) {
          LOGGER.error("Failed to write value.", e);
        }
        return null;
    }
    return super.eInvoke(operationID, arguments);
  }

} // AbstractWriteableIOFieldImpl
