/**
 * generated by Xtext 2.11.0
 */
package dk.sdu.mdsd.ann.ann;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.mdsd.ann.ann.Output#getL_rule <em>Lrule</em>}</li>
 * </ul>
 *
 * @see dk.sdu.mdsd.ann.ann.AnnPackage#getOutput()
 * @model
 * @generated
 */
public interface Output extends Layer
{
  /**
   * Returns the value of the '<em><b>Lrule</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lrule</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lrule</em>' containment reference.
   * @see #setL_rule(LearningRule)
   * @see dk.sdu.mdsd.ann.ann.AnnPackage#getOutput_L_rule()
   * @model containment="true"
   * @generated
   */
  LearningRule getL_rule();

  /**
   * Sets the value of the '{@link dk.sdu.mdsd.ann.ann.Output#getL_rule <em>Lrule</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lrule</em>' containment reference.
   * @see #getL_rule()
   * @generated
   */
  void setL_rule(LearningRule value);

} // Output
