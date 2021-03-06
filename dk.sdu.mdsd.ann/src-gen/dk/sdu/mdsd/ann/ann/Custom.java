/**
 * generated by Xtext 2.11.0
 */
package dk.sdu.mdsd.ann.ann;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Custom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.mdsd.ann.ann.Custom#getInput <em>Input</em>}</li>
 *   <li>{@link dk.sdu.mdsd.ann.ann.Custom#getExp <em>Exp</em>}</li>
 *   <li>{@link dk.sdu.mdsd.ann.ann.Custom#getDer <em>Der</em>}</li>
 * </ul>
 *
 * @see dk.sdu.mdsd.ann.ann.AnnPackage#getCustom()
 * @model
 * @generated
 */
public interface Custom extends Activation
{
  /**
   * Returns the value of the '<em><b>Input</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Input</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Input</em>' containment reference.
   * @see #setInput(Letter)
   * @see dk.sdu.mdsd.ann.ann.AnnPackage#getCustom_Input()
   * @model containment="true"
   * @generated
   */
  Letter getInput();

  /**
   * Sets the value of the '{@link dk.sdu.mdsd.ann.ann.Custom#getInput <em>Input</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Input</em>' containment reference.
   * @see #getInput()
   * @generated
   */
  void setInput(Letter value);

  /**
   * Returns the value of the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp</em>' containment reference.
   * @see #setExp(Expression)
   * @see dk.sdu.mdsd.ann.ann.AnnPackage#getCustom_Exp()
   * @model containment="true"
   * @generated
   */
  Expression getExp();

  /**
   * Sets the value of the '{@link dk.sdu.mdsd.ann.ann.Custom#getExp <em>Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp</em>' containment reference.
   * @see #getExp()
   * @generated
   */
  void setExp(Expression value);

  /**
   * Returns the value of the '<em><b>Der</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Der</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Der</em>' containment reference.
   * @see #setDer(Expression)
   * @see dk.sdu.mdsd.ann.ann.AnnPackage#getCustom_Der()
   * @model containment="true"
   * @generated
   */
  Expression getDer();

  /**
   * Sets the value of the '{@link dk.sdu.mdsd.ann.ann.Custom#getDer <em>Der</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Der</em>' containment reference.
   * @see #getDer()
   * @generated
   */
  void setDer(Expression value);

} // Custom
