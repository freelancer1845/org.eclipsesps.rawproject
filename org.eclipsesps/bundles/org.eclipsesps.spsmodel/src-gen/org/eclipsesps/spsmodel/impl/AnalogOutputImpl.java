/**
 */
package org.eclipsesps.spsmodel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipsesps.spsmodel.AnalogOutput;
import org.eclipsesps.spsmodel.SpsmodelPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Analog Output</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class AnalogOutputImpl extends AbstractWriteableIOFieldImpl<Integer>
    implements AnalogOutput {
  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated NOT
   */
  protected AnalogOutputImpl() {
    super();
    this.value = 0;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return SpsmodelPackage.Literals.ANALOG_OUTPUT;
  }



} // AnalogOutputImpl
