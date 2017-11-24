/**
 */
package org.eclipsesps.spsmodel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipsesps.spsmodel.DigitalInput;
import org.eclipsesps.spsmodel.SpsmodelPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Digital Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class DigitalInputImpl extends AbstractIOFieldImpl<Boolean> implements DigitalInput {
  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated NOT
   */
  protected DigitalInputImpl() {
    super();
    this.value = false;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return SpsmodelPackage.Literals.DIGITAL_INPUT;
  }

} // DigitalInputImpl
