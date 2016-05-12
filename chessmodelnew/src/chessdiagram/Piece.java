/**
 */
package chessdiagram;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Piece</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link chessdiagram.Piece#getPos <em>Pos</em>}</li>
 *   <li>{@link chessdiagram.Piece#getSquare <em>Square</em>}</li>
 *   <li>{@link chessdiagram.Piece#getColour <em>Colour</em>}</li>
 *   <li>{@link chessdiagram.Piece#getPieceType <em>Piece Type</em>}</li>
 * </ul>
 *
 * @see chessdiagram.ChessdiagramPackage#getPiece()
 * @model
 * @generated
 */
public interface Piece extends EObject {
	/**
	 * Returns the value of the '<em><b>Colour</b></em>' attribute.
	 * The default value is <code>"White"</code>.
	 * The literals are from the enumeration {@link chessdiagram.Colour}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Colour</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Colour</em>' attribute.
	 * @see chessdiagram.Colour
	 * @see #setColour(Colour)
	 * @see chessdiagram.ChessdiagramPackage#getPiece_Colour()
	 * @model default="White"
	 * @generated
	 */
	Colour getColour();

	/**
	 * Sets the value of the '{@link chessdiagram.Piece#getColour <em>Colour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Colour</em>' attribute.
	 * @see chessdiagram.Colour
	 * @see #getColour()
	 * @generated
	 */
	void setColour(Colour value);

	/**
	 * Returns the value of the '<em><b>Piece Type</b></em>' attribute.
	 * The default value is <code>"Pawn"</code>.
	 * The literals are from the enumeration {@link chessdiagram.PieceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Piece Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Piece Type</em>' attribute.
	 * @see chessdiagram.PieceType
	 * @see #setPieceType(PieceType)
	 * @see chessdiagram.ChessdiagramPackage#getPiece_PieceType()
	 * @model default="Pawn"
	 * @generated
	 */
	PieceType getPieceType();

	/**
	 * Sets the value of the '{@link chessdiagram.Piece#getPieceType <em>Piece Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Piece Type</em>' attribute.
	 * @see chessdiagram.PieceType
	 * @see #getPieceType()
	 * @generated
	 */
	void setPieceType(PieceType value);

	/**
	 * Returns the value of the '<em><b>Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pos</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pos</em>' attribute.
	 * @see #setPos(int)
	 * @see chessdiagram.ChessdiagramPackage#getPiece_Pos()
	 * @model
	 * @generated
	 */
	int getPos();

	/**
	 * Sets the value of the '{@link chessdiagram.Piece#getPos <em>Pos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pos</em>' attribute.
	 * @see #getPos()
	 * @generated
	 */
	void setPos(int value);

	/**
	 * Returns the value of the '<em><b>Square</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link chessdiagram.Square#getPiece <em>Piece</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Square</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Square</em>' reference.
	 * @see chessdiagram.ChessdiagramPackage#getPiece_Square()
	 * @see chessdiagram.Square#getPiece
	 * @model opposite="piece" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="org.eclipse.viatra.query.querybasedfeature patternFQN='chess.queries.square'"
	 * @generated
	 */
	Square getSquare();

} // Piece
