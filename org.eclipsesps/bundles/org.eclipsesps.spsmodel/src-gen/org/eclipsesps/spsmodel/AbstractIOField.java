/**
 */
package org.eclipsesps.spsmodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract IO Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipsesps.spsmodel.AbstractIOField#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipsesps.spsmodel.AbstractIOField#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.eclipsesps.spsmodel.SpsmodelPackage#getAbstractIOField()
 * @model abstract="true"
 * @generated
 */
public interface AbstractIOField<T> extends IIOField<T> {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.eclipsesps.spsmodel.SpsmodelPackage#getAbstractIOField_Id()
	 * @model id="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipsesps.spsmodel.AbstractIOField#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Object)
	 * @see org.eclipsesps.spsmodel.SpsmodelPackage#getAbstractIOField_Value()
	 * @model
	 * @generated
	 */
	T getValue();

	/**
	 * Sets the value of the '{@link org.eclipsesps.spsmodel.AbstractIOField#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(T value);

} // AbstractIOField
