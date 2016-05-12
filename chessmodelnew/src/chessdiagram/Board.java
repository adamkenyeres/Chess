/**
 */
package chessdiagram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Board</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link chessdiagram.Board#getSquare <em>Square</em>}</li>
 * </ul>
 *
 * @see chessdiagram.ChessdiagramPackage#getBoard()
 * @model
 * @generated
 */
public interface Board extends EObject {
	/**
	 * Returns the value of the '<em><b>Square</b></em>' containment reference list.
	 * The list contents are of type {@link chessdiagram.Square}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Square</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Square</em>' containment reference list.
	 * @see chessdiagram.ChessdiagramPackage#getBoard_Square()
	 * @model containment="true" lower="64" upper="64"
	 * @generated
	 */
	EList<Square> getSquare();

} // Board
