/**
 */
package chessdiagram;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pawn</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link chessdiagram.Pawn#isFirstMove <em>First Move</em>}</li>
 *   <li>{@link chessdiagram.Pawn#isEnPassantEnabled <em>En Passant Enabled</em>}</li>
 * </ul>
 *
 * @see chessdiagram.ChessdiagramPackage#getPawn()
 * @model
 * @generated
 */
public interface Pawn extends Piece {

	/**
	 * Returns the value of the '<em><b>First Move</b></em>' attribute.
	 * The default value is <code>"True"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Move</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Move</em>' attribute.
	 * @see #setFirstMove(boolean)
	 * @see chessdiagram.ChessdiagramPackage#getPawn_FirstMove()
	 * @model default="True"
	 * @generated
	 */
	boolean isFirstMove();

	/**
	 * Sets the value of the '{@link chessdiagram.Pawn#isFirstMove <em>First Move</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Move</em>' attribute.
	 * @see #isFirstMove()
	 * @generated
	 */
	void setFirstMove(boolean value);

	/**
	 * Returns the value of the '<em><b>En Passant Enabled</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>En Passant Enabled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>En Passant Enabled</em>' attribute.
	 * @see #setEnPassantEnabled(boolean)
	 * @see chessdiagram.ChessdiagramPackage#getPawn_EnPassantEnabled()
	 * @model default="false"
	 * @generated
	 */
	boolean isEnPassantEnabled();

	/**
	 * Sets the value of the '{@link chessdiagram.Pawn#isEnPassantEnabled <em>En Passant Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>En Passant Enabled</em>' attribute.
	 * @see #isEnPassantEnabled()
	 * @generated
	 */
	void setEnPassantEnabled(boolean value);
} // Pawn
