/**
 */
package org.eclipsesps.spsmodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipsesps.spsmodel.SpsmodelFactory
 * @model kind="package"
 * @generated
 */
public interface SpsmodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "spsmodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.eclispesps/spsmodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "spsmodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SpsmodelPackage eINSTANCE = org.eclipsesps.spsmodel.impl.SpsmodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipsesps.spsmodel.IIOField <em>IIO Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipsesps.spsmodel.IIOField
	 * @see org.eclipsesps.spsmodel.impl.SpsmodelPackageImpl#getIIOField()
	 * @generated
	 */
	int IIO_FIELD = 0;

	/**
	 * The number of structural features of the '<em>IIO Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IIO_FIELD_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IIO_FIELD___GET_ID = 0;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IIO_FIELD___GET_VALUE = 1;

	/**
	 * The number of operations of the '<em>IIO Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IIO_FIELD_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipsesps.spsmodel.WriteableIOField <em>Writeable IO Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipsesps.spsmodel.WriteableIOField
	 * @see org.eclipsesps.spsmodel.impl.SpsmodelPackageImpl#getWriteableIOField()
	 * @generated
	 */
	int WRITEABLE_IO_FIELD = 1;

	/**
	 * The number of structural features of the '<em>Writeable IO Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITEABLE_IO_FIELD_FEATURE_COUNT = IIO_FIELD_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITEABLE_IO_FIELD___GET_ID = IIO_FIELD___GET_ID;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITEABLE_IO_FIELD___GET_VALUE = IIO_FIELD___GET_VALUE;

	/**
	 * The operation id for the '<em>Write Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITEABLE_IO_FIELD___WRITE_VALUE__OBJECT = IIO_FIELD_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Write Value Sync</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITEABLE_IO_FIELD___WRITE_VALUE_SYNC__OBJECT = IIO_FIELD_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Writeable IO Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITEABLE_IO_FIELD_OPERATION_COUNT = IIO_FIELD_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipsesps.spsmodel.impl.AbstractIOFieldImpl <em>Abstract IO Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipsesps.spsmodel.impl.AbstractIOFieldImpl
	 * @see org.eclipsesps.spsmodel.impl.SpsmodelPackageImpl#getAbstractIOField()
	 * @generated
	 */
	int ABSTRACT_IO_FIELD = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_IO_FIELD__ID = IIO_FIELD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_IO_FIELD__VALUE = IIO_FIELD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Abstract IO Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_IO_FIELD_FEATURE_COUNT = IIO_FIELD_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_IO_FIELD___GET_ID = IIO_FIELD___GET_ID;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_IO_FIELD___GET_VALUE = IIO_FIELD___GET_VALUE;

	/**
	 * The number of operations of the '<em>Abstract IO Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_IO_FIELD_OPERATION_COUNT = IIO_FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipsesps.spsmodel.impl.AbstractWriteableIOFieldImpl <em>Abstract Writeable IO Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipsesps.spsmodel.impl.AbstractWriteableIOFieldImpl
	 * @see org.eclipsesps.spsmodel.impl.SpsmodelPackageImpl#getAbstractWriteableIOField()
	 * @generated
	 */
	int ABSTRACT_WRITEABLE_IO_FIELD = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_WRITEABLE_IO_FIELD__ID = ABSTRACT_IO_FIELD__ID;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_WRITEABLE_IO_FIELD__VALUE = ABSTRACT_IO_FIELD__VALUE;

	/**
	 * The number of structural features of the '<em>Abstract Writeable IO Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_WRITEABLE_IO_FIELD_FEATURE_COUNT = ABSTRACT_IO_FIELD_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_WRITEABLE_IO_FIELD___GET_ID = ABSTRACT_IO_FIELD___GET_ID;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_WRITEABLE_IO_FIELD___GET_VALUE = ABSTRACT_IO_FIELD___GET_VALUE;

	/**
	 * The operation id for the '<em>Write Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_WRITEABLE_IO_FIELD___WRITE_VALUE__OBJECT = ABSTRACT_IO_FIELD_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Write Value Sync</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_WRITEABLE_IO_FIELD___WRITE_VALUE_SYNC__OBJECT = ABSTRACT_IO_FIELD_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Abstract Writeable IO Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_WRITEABLE_IO_FIELD_OPERATION_COUNT = ABSTRACT_IO_FIELD_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipsesps.spsmodel.impl.AnalogInputImpl <em>Analog Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipsesps.spsmodel.impl.AnalogInputImpl
	 * @see org.eclipsesps.spsmodel.impl.SpsmodelPackageImpl#getAnalogInput()
	 * @generated
	 */
	int ANALOG_INPUT = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_INPUT__ID = ABSTRACT_IO_FIELD__ID;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_INPUT__VALUE = ABSTRACT_IO_FIELD__VALUE;

	/**
	 * The number of structural features of the '<em>Analog Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_INPUT_FEATURE_COUNT = ABSTRACT_IO_FIELD_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_INPUT___GET_ID = ABSTRACT_IO_FIELD___GET_ID;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_INPUT___GET_VALUE = ABSTRACT_IO_FIELD___GET_VALUE;

	/**
	 * The number of operations of the '<em>Analog Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_INPUT_OPERATION_COUNT = ABSTRACT_IO_FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipsesps.spsmodel.impl.DigitalInputImpl <em>Digital Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipsesps.spsmodel.impl.DigitalInputImpl
	 * @see org.eclipsesps.spsmodel.impl.SpsmodelPackageImpl#getDigitalInput()
	 * @generated
	 */
	int DIGITAL_INPUT = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_INPUT__ID = ABSTRACT_IO_FIELD__ID;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_INPUT__VALUE = ABSTRACT_IO_FIELD__VALUE;

	/**
	 * The number of structural features of the '<em>Digital Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_INPUT_FEATURE_COUNT = ABSTRACT_IO_FIELD_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_INPUT___GET_ID = ABSTRACT_IO_FIELD___GET_ID;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_INPUT___GET_VALUE = ABSTRACT_IO_FIELD___GET_VALUE;

	/**
	 * The number of operations of the '<em>Digital Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_INPUT_OPERATION_COUNT = ABSTRACT_IO_FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipsesps.spsmodel.impl.AnalogOutputImpl <em>Analog Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipsesps.spsmodel.impl.AnalogOutputImpl
	 * @see org.eclipsesps.spsmodel.impl.SpsmodelPackageImpl#getAnalogOutput()
	 * @generated
	 */
	int ANALOG_OUTPUT = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_OUTPUT__ID = ABSTRACT_WRITEABLE_IO_FIELD__ID;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_OUTPUT__VALUE = ABSTRACT_WRITEABLE_IO_FIELD__VALUE;

	/**
	 * The number of structural features of the '<em>Analog Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_OUTPUT_FEATURE_COUNT = ABSTRACT_WRITEABLE_IO_FIELD_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_OUTPUT___GET_ID = ABSTRACT_WRITEABLE_IO_FIELD___GET_ID;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_OUTPUT___GET_VALUE = ABSTRACT_WRITEABLE_IO_FIELD___GET_VALUE;

	/**
	 * The operation id for the '<em>Write Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_OUTPUT___WRITE_VALUE__OBJECT = ABSTRACT_WRITEABLE_IO_FIELD___WRITE_VALUE__OBJECT;

	/**
	 * The operation id for the '<em>Write Value Sync</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_OUTPUT___WRITE_VALUE_SYNC__OBJECT = ABSTRACT_WRITEABLE_IO_FIELD___WRITE_VALUE_SYNC__OBJECT;

	/**
	 * The number of operations of the '<em>Analog Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_OUTPUT_OPERATION_COUNT = ABSTRACT_WRITEABLE_IO_FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipsesps.spsmodel.impl.DigitalOutputImpl <em>Digital Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipsesps.spsmodel.impl.DigitalOutputImpl
	 * @see org.eclipsesps.spsmodel.impl.SpsmodelPackageImpl#getDigitalOutput()
	 * @generated
	 */
	int DIGITAL_OUTPUT = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_OUTPUT__ID = ABSTRACT_WRITEABLE_IO_FIELD__ID;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_OUTPUT__VALUE = ABSTRACT_WRITEABLE_IO_FIELD__VALUE;

	/**
	 * The number of structural features of the '<em>Digital Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_OUTPUT_FEATURE_COUNT = ABSTRACT_WRITEABLE_IO_FIELD_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_OUTPUT___GET_ID = ABSTRACT_WRITEABLE_IO_FIELD___GET_ID;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_OUTPUT___GET_VALUE = ABSTRACT_WRITEABLE_IO_FIELD___GET_VALUE;

	/**
	 * The operation id for the '<em>Write Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_OUTPUT___WRITE_VALUE__OBJECT = ABSTRACT_WRITEABLE_IO_FIELD___WRITE_VALUE__OBJECT;

	/**
	 * The operation id for the '<em>Write Value Sync</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_OUTPUT___WRITE_VALUE_SYNC__OBJECT = ABSTRACT_WRITEABLE_IO_FIELD___WRITE_VALUE_SYNC__OBJECT;

	/**
	 * The number of operations of the '<em>Digital Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_OUTPUT_OPERATION_COUNT = ABSTRACT_WRITEABLE_IO_FIELD_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link org.eclipsesps.spsmodel.IIOField <em>IIO Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IIO Field</em>'.
	 * @see org.eclipsesps.spsmodel.IIOField
	 * @generated
	 */
	EClass getIIOField();

	/**
	 * Returns the meta object for the '{@link org.eclipsesps.spsmodel.IIOField#getId() <em>Get Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Id</em>' operation.
	 * @see org.eclipsesps.spsmodel.IIOField#getId()
	 * @generated
	 */
	EOperation getIIOField__GetId();

	/**
	 * Returns the meta object for the '{@link org.eclipsesps.spsmodel.IIOField#getValue() <em>Get Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Value</em>' operation.
	 * @see org.eclipsesps.spsmodel.IIOField#getValue()
	 * @generated
	 */
	EOperation getIIOField__GetValue();

	/**
	 * Returns the meta object for class '{@link org.eclipsesps.spsmodel.WriteableIOField <em>Writeable IO Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Writeable IO Field</em>'.
	 * @see org.eclipsesps.spsmodel.WriteableIOField
	 * @generated
	 */
	EClass getWriteableIOField();

	/**
	 * Returns the meta object for the '{@link org.eclipsesps.spsmodel.WriteableIOField#writeValue(java.lang.Object) <em>Write Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Write Value</em>' operation.
	 * @see org.eclipsesps.spsmodel.WriteableIOField#writeValue(java.lang.Object)
	 * @generated
	 */
	EOperation getWriteableIOField__WriteValue__Object();

	/**
	 * Returns the meta object for the '{@link org.eclipsesps.spsmodel.WriteableIOField#writeValueSync(java.lang.Object) <em>Write Value Sync</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Write Value Sync</em>' operation.
	 * @see org.eclipsesps.spsmodel.WriteableIOField#writeValueSync(java.lang.Object)
	 * @generated
	 */
	EOperation getWriteableIOField__WriteValueSync__Object();

	/**
	 * Returns the meta object for class '{@link org.eclipsesps.spsmodel.AbstractIOField <em>Abstract IO Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract IO Field</em>'.
	 * @see org.eclipsesps.spsmodel.AbstractIOField
	 * @generated
	 */
	EClass getAbstractIOField();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipsesps.spsmodel.AbstractIOField#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipsesps.spsmodel.AbstractIOField#getId()
	 * @see #getAbstractIOField()
	 * @generated
	 */
	EAttribute getAbstractIOField_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipsesps.spsmodel.AbstractIOField#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipsesps.spsmodel.AbstractIOField#getValue()
	 * @see #getAbstractIOField()
	 * @generated
	 */
	EAttribute getAbstractIOField_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipsesps.spsmodel.AbstractWriteableIOField <em>Abstract Writeable IO Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Writeable IO Field</em>'.
	 * @see org.eclipsesps.spsmodel.AbstractWriteableIOField
	 * @generated
	 */
	EClass getAbstractWriteableIOField();

	/**
	 * Returns the meta object for class '{@link org.eclipsesps.spsmodel.AnalogInput <em>Analog Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Analog Input</em>'.
	 * @see org.eclipsesps.spsmodel.AnalogInput
	 * @generated
	 */
	EClass getAnalogInput();

	/**
	 * Returns the meta object for class '{@link org.eclipsesps.spsmodel.DigitalInput <em>Digital Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Digital Input</em>'.
	 * @see org.eclipsesps.spsmodel.DigitalInput
	 * @generated
	 */
	EClass getDigitalInput();

	/**
	 * Returns the meta object for class '{@link org.eclipsesps.spsmodel.AnalogOutput <em>Analog Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Analog Output</em>'.
	 * @see org.eclipsesps.spsmodel.AnalogOutput
	 * @generated
	 */
	EClass getAnalogOutput();

	/**
	 * Returns the meta object for class '{@link org.eclipsesps.spsmodel.DigitalOutput <em>Digital Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Digital Output</em>'.
	 * @see org.eclipsesps.spsmodel.DigitalOutput
	 * @generated
	 */
	EClass getDigitalOutput();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SpsmodelFactory getSpsmodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipsesps.spsmodel.IIOField <em>IIO Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipsesps.spsmodel.IIOField
		 * @see org.eclipsesps.spsmodel.impl.SpsmodelPackageImpl#getIIOField()
		 * @generated
		 */
		EClass IIO_FIELD = eINSTANCE.getIIOField();

		/**
		 * The meta object literal for the '<em><b>Get Id</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IIO_FIELD___GET_ID = eINSTANCE.getIIOField__GetId();

		/**
		 * The meta object literal for the '<em><b>Get Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IIO_FIELD___GET_VALUE = eINSTANCE.getIIOField__GetValue();

		/**
		 * The meta object literal for the '{@link org.eclipsesps.spsmodel.WriteableIOField <em>Writeable IO Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipsesps.spsmodel.WriteableIOField
		 * @see org.eclipsesps.spsmodel.impl.SpsmodelPackageImpl#getWriteableIOField()
		 * @generated
		 */
		EClass WRITEABLE_IO_FIELD = eINSTANCE.getWriteableIOField();

		/**
		 * The meta object literal for the '<em><b>Write Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation WRITEABLE_IO_FIELD___WRITE_VALUE__OBJECT = eINSTANCE.getWriteableIOField__WriteValue__Object();

		/**
		 * The meta object literal for the '<em><b>Write Value Sync</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation WRITEABLE_IO_FIELD___WRITE_VALUE_SYNC__OBJECT = eINSTANCE
				.getWriteableIOField__WriteValueSync__Object();

		/**
		 * The meta object literal for the '{@link org.eclipsesps.spsmodel.impl.AbstractIOFieldImpl <em>Abstract IO Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipsesps.spsmodel.impl.AbstractIOFieldImpl
		 * @see org.eclipsesps.spsmodel.impl.SpsmodelPackageImpl#getAbstractIOField()
		 * @generated
		 */
		EClass ABSTRACT_IO_FIELD = eINSTANCE.getAbstractIOField();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_IO_FIELD__ID = eINSTANCE.getAbstractIOField_Id();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_IO_FIELD__VALUE = eINSTANCE.getAbstractIOField_Value();

		/**
		 * The meta object literal for the '{@link org.eclipsesps.spsmodel.impl.AbstractWriteableIOFieldImpl <em>Abstract Writeable IO Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipsesps.spsmodel.impl.AbstractWriteableIOFieldImpl
		 * @see org.eclipsesps.spsmodel.impl.SpsmodelPackageImpl#getAbstractWriteableIOField()
		 * @generated
		 */
		EClass ABSTRACT_WRITEABLE_IO_FIELD = eINSTANCE.getAbstractWriteableIOField();

		/**
		 * The meta object literal for the '{@link org.eclipsesps.spsmodel.impl.AnalogInputImpl <em>Analog Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipsesps.spsmodel.impl.AnalogInputImpl
		 * @see org.eclipsesps.spsmodel.impl.SpsmodelPackageImpl#getAnalogInput()
		 * @generated
		 */
		EClass ANALOG_INPUT = eINSTANCE.getAnalogInput();

		/**
		 * The meta object literal for the '{@link org.eclipsesps.spsmodel.impl.DigitalInputImpl <em>Digital Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipsesps.spsmodel.impl.DigitalInputImpl
		 * @see org.eclipsesps.spsmodel.impl.SpsmodelPackageImpl#getDigitalInput()
		 * @generated
		 */
		EClass DIGITAL_INPUT = eINSTANCE.getDigitalInput();

		/**
		 * The meta object literal for the '{@link org.eclipsesps.spsmodel.impl.AnalogOutputImpl <em>Analog Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipsesps.spsmodel.impl.AnalogOutputImpl
		 * @see org.eclipsesps.spsmodel.impl.SpsmodelPackageImpl#getAnalogOutput()
		 * @generated
		 */
		EClass ANALOG_OUTPUT = eINSTANCE.getAnalogOutput();

		/**
		 * The meta object literal for the '{@link org.eclipsesps.spsmodel.impl.DigitalOutputImpl <em>Digital Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipsesps.spsmodel.impl.DigitalOutputImpl
		 * @see org.eclipsesps.spsmodel.impl.SpsmodelPackageImpl#getDigitalOutput()
		 * @generated
		 */
		EClass DIGITAL_OUTPUT = eINSTANCE.getDigitalOutput();

	}

} //SpsmodelPackage
