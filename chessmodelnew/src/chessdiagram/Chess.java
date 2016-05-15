/**
 */
package chessdiagram;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chess</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link chessdiagram.Chess#getWhitePlayer <em>White Player</em>}</li>
 *   <li>{@link chessdiagram.Chess#getBlackPlayer <em>Black Player</em>}</li>
 *   <li>{@link chessdiagram.Chess#getSquare <em>Square</em>}</li>
 *   <li>{@link chessdiagram.Chess#isWhitePlayerTurn <em>White Player Turn</em>}</li>
 *   <li>{@link chessdiagram.Chess#getNumberOfSteps <em>Number Of Steps</em>}</li>
 *   <li>{@link chessdiagram.Chess#getStepsBeforeExlpoaring <em>Steps Before Exlpoaring</em>}</li>
 * </ul>
 *
 * @see chessdiagram.ChessdiagramPackage#getChess()
 * @model
 * @generated
 */
public interface Chess extends EObject {
	/**
	 * Returns the value of the '<em><b>White Player</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>White Player</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>White Player</em>' containment reference.
	 * @see #setWhitePlayer(Player)
	 * @see chessdiagram.ChessdiagramPackage#getChess_WhitePlayer()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Player getWhitePlayer();

	/**
	 * Sets the value of the '{@link chessdiagram.Chess#getWhitePlayer <em>White Player</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>White Player</em>' containment reference.
	 * @see #getWhitePlayer()
	 * @generated
	 */
	void setWhitePlayer(Player value);

	/**
	 * Returns the value of the '<em><b>Black Player</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Black Player</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Black Player</em>' containment reference.
	 * @see #setBlackPlayer(Player)
	 * @see chessdiagram.ChessdiagramPackage#getChess_BlackPlayer()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Player getBlackPlayer();

	/**
	 * Sets the value of the '{@link chessdiagram.Chess#getBlackPlayer <em>Black Player</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Black Player</em>' containment reference.
	 * @see #getBlackPlayer()
	 * @generated
	 */
	void setBlackPlayer(Player value);

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
	 * @see chessdiagram.ChessdiagramPackage#getChess_Square()
	 * @model containment="true" lower="64" upper="64"
	 * @generated
	 */
	EList<Square> getSquare();

	/**
	 * Returns the value of the '<em><b>White Player Turn</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>White Player Turn</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>White Player Turn</em>' attribute.
	 * @see #setWhitePlayerTurn(boolean)
	 * @see chessdiagram.ChessdiagramPackage#getChess_WhitePlayerTurn()
	 * @model default="true"
	 * @generated
	 */
	boolean isWhitePlayerTurn();

	/**
	 * Sets the value of the '{@link chessdiagram.Chess#isWhitePlayerTurn <em>White Player Turn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>White Player Turn</em>' attribute.
	 * @see #isWhitePlayerTurn()
	 * @generated
	 */
	void setWhitePlayerTurn(boolean value);

	/**
	 * Returns the value of the '<em><b>Number Of Steps</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Steps</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Steps</em>' attribute.
	 * @see #setNumberOfSteps(int)
	 * @see chessdiagram.ChessdiagramPackage#getChess_NumberOfSteps()
	 * @model default="0"
	 * @generated
	 */
	int getNumberOfSteps();

	/**
	 * Sets the value of the '{@link chessdiagram.Chess#getNumberOfSteps <em>Number Of Steps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Steps</em>' attribute.
	 * @see #getNumberOfSteps()
	 * @generated
	 */
	void setNumberOfSteps(int value);

	/**
	 * Returns the value of the '<em><b>Steps Before Exlpoaring</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Steps Before Exlpoaring</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Steps Before Exlpoaring</em>' attribute.
	 * @see #setStepsBeforeExlpoaring(int)
	 * @see chessdiagram.ChessdiagramPackage#getChess_StepsBeforeExlpoaring()
	 * @model default="0"
	 * @generated
	 */
	int getStepsBeforeExlpoaring();

	/**
	 * Sets the value of the '{@link chessdiagram.Chess#getStepsBeforeExlpoaring <em>Steps Before Exlpoaring</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Steps Before Exlpoaring</em>' attribute.
	 * @see #getStepsBeforeExlpoaring()
	 * @generated
	 */
	void setStepsBeforeExlpoaring(int value);

} // Chess
