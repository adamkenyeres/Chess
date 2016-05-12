/**
 */
package chessdiagram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Player</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link chessdiagram.Player#getPiece <em>Piece</em>}</li>
 *   <li>{@link chessdiagram.Player#getColour <em>Colour</em>}</li>
 * </ul>
 *
 * @see chessdiagram.ChessdiagramPackage#getPlayer()
 * @model
 * @generated
 */
public interface Player extends EObject {
	/**
	 * Returns the value of the '<em><b>Piece</b></em>' containment reference list.
	 * The list contents are of type {@link chessdiagram.Piece}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Piece</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Piece</em>' containment reference list.
	 * @see chessdiagram.ChessdiagramPackage#getPlayer_Piece()
	 * @model containment="true" upper="16"
	 * @generated
	 */
	EList<Piece> getPiece();

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
	 * @see chessdiagram.ChessdiagramPackage#getPlayer_Colour()
	 * @model default="White"
	 * @generated
	 */
	Colour getColour();

	/**
	 * Sets the value of the '{@link chessdiagram.Player#getColour <em>Colour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Colour</em>' attribute.
	 * @see chessdiagram.Colour
	 * @see #getColour()
	 * @generated
	 */
	void setColour(Colour value);

} // Player
