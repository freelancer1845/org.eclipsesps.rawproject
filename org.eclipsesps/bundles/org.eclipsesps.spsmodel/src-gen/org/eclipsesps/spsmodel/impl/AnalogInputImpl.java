/**
 */
package org.eclipsesps.spsmodel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipsesps.spsmodel.AnalogInput;
import org.eclipsesps.spsmodel.SpsmodelPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Analog Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class AnalogInputImpl extends AbstractIOFieldImpl<Integer> implements AnalogInput {
  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated NOT
   */
  protected AnalogInputImpl() {
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
    return SpsmodelPackage.Literals.ANALOG_INPUT;
  }



} // AnalogInputImpl
