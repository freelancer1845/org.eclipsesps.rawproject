/**
 */
package org.eclipsesps.spsmodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipsesps.spsmodel.SpsmodelPackage
 * @generated
 */
public interface SpsmodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SpsmodelFactory eINSTANCE = org.eclipsesps.spsmodel.impl.SpsmodelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Analog Input</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Analog Input</em>'.
	 * @generated
	 */
	AnalogInput createAnalogInput();

	/**
	 * Returns a new object of class '<em>Digital Input</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Digital Input</em>'.
	 * @generated
	 */
	DigitalInput createDigitalInput();

	/**
	 * Returns a new object of class '<em>Analog Output</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Analog Output</em>'.
	 * @generated
	 */
	AnalogOutput createAnalogOutput();

	/**
	 * Returns a new object of class '<em>Digital Output</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Digital Output</em>'.
	 * @generated
	 */
	DigitalOutput createDigitalOutput();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SpsmodelPackage getSpsmodelPackage();

} //SpsmodelFactory
