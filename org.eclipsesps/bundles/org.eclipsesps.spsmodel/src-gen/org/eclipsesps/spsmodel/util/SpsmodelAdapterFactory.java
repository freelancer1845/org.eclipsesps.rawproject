/**
 */
package org.eclipsesps.spsmodel.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipsesps.spsmodel.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipsesps.spsmodel.SpsmodelPackage
 * @generated
 */
public class SpsmodelAdapterFactory extends AdapterFactoryImpl {
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static SpsmodelPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SpsmodelAdapterFactory() {
    if (modelPackage == null) {
      modelPackage = SpsmodelPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object) {
    if (object == modelPackage) {
      return true;
    }
    if (object instanceof EObject) {
      return ((EObject) object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SpsmodelSwitch<Adapter> modelSwitch = new SpsmodelSwitch<Adapter>() {
    @Override
    public <T> Adapter caseIIOField(IIOField<T> object) {
      return createIIOFieldAdapter();
    }

    @Override
    public <T> Adapter caseWriteableIOField(WriteableIOField<T> object) {
      return createWriteableIOFieldAdapter();
    }

    @Override
    public <T> Adapter caseAbstractIOField(AbstractIOField<T> object) {
      return createAbstractIOFieldAdapter();
    }

    @Override
    public <T> Adapter caseAbstractWriteableIOField(AbstractWriteableIOField<T> object) {
      return createAbstractWriteableIOFieldAdapter();
    }

    @Override
    public Adapter caseAnalogInput(AnalogInput object) {
      return createAnalogInputAdapter();
    }

    @Override
    public Adapter caseDigitalInput(DigitalInput object) {
      return createDigitalInputAdapter();
    }

    @Override
    public Adapter caseAnalogOutput(AnalogOutput object) {
      return createAnalogOutputAdapter();
    }

    @Override
    public Adapter caseDigitalOutput(DigitalOutput object) {
      return createDigitalOutputAdapter();
    }

    @Override
    public Adapter defaultCase(EObject object) {
      return createEObjectAdapter();
    }
  };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target) {
    return modelSwitch.doSwitch((EObject) target);
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipsesps.spsmodel.IIOField <em>IIO Field</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipsesps.spsmodel.IIOField
   * @generated
   */
  public Adapter createIIOFieldAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipsesps.spsmodel.WriteableIOField <em>Writeable IO Field</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipsesps.spsmodel.WriteableIOField
   * @generated
   */
  public Adapter createWriteableIOFieldAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipsesps.spsmodel.AbstractIOField <em>Abstract IO Field</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipsesps.spsmodel.AbstractIOField
   * @generated
   */
  public Adapter createAbstractIOFieldAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipsesps.spsmodel.AbstractWriteableIOField <em>Abstract Writeable IO Field</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipsesps.spsmodel.AbstractWriteableIOField
   * @generated
   */
  public Adapter createAbstractWriteableIOFieldAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipsesps.spsmodel.AnalogInput <em>Analog Input</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipsesps.spsmodel.AnalogInput
   * @generated
   */
  public Adapter createAnalogInputAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipsesps.spsmodel.DigitalInput <em>Digital Input</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipsesps.spsmodel.DigitalInput
   * @generated
   */
  public Adapter createDigitalInputAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipsesps.spsmodel.AnalogOutput <em>Analog Output</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipsesps.spsmodel.AnalogOutput
   * @generated
   */
  public Adapter createAnalogOutputAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipsesps.spsmodel.DigitalOutput <em>Digital Output</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipsesps.spsmodel.DigitalOutput
   * @generated
   */
  public Adapter createDigitalOutputAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter() {
    return null;
  }

} //SpsmodelAdapterFactory
