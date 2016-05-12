/**
 */
package chessdiagram;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rook</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link chessdiagram.Rook#isFirstMove <em>First Move</em>}</li>
 * </ul>
 *
 * @see chessdiagram.ChessdiagramPackage#getRook()
 * @model
 * @generated
 */
public interface Rook extends Piece {

	/**
	 * Returns the value of the '<em><b>First Move</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Move</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Move</em>' attribute.
	 * @see #setFirstMove(boolean)
	 * @see chessdiagram.ChessdiagramPackage#getRook_FirstMove()
	 * @model default="true"
	 * @generated
	 */
	boolean isFirstMove();

	/**
	 * Sets the value of the '{@link chessdiagram.Rook#isFirstMove <em>First Move</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Move</em>' attribute.
	 * @see #isFirstMove()
	 * @generated
	 */
	void setFirstMove(boolean value);
} // Rook
