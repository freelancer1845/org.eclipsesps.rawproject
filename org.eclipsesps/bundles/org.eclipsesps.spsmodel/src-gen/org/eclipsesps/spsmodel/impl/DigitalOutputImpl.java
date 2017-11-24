/**
 */
package org.eclipsesps.spsmodel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipsesps.spsmodel.DigitalOutput;
import org.eclipsesps.spsmodel.SpsmodelPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Digital Output</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class DigitalOutputImpl extends AbstractWriteableIOFieldImpl<Boolean>
    implements DigitalOutput {
  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected DigitalOutputImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return SpsmodelPackage.Literals.DIGITAL_OUTPUT;
  }

  @Override
  public void setValue(Boolean newValue) {
    throw new UnsupportedOperationException("Setting the value is not allowed... user writeValue");
  }



} // DigitalOutputImpl
