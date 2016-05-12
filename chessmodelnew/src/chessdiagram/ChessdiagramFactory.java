/**
 */
package chessdiagram;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see chessdiagram.ChessdiagramPackage
 * @generated
 */
public interface ChessdiagramFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ChessdiagramFactory eINSTANCE = chessdiagram.impl.ChessdiagramFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Chess</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Chess</em>'.
	 * @generated
	 */
	Chess createChess();

	/**
	 * Returns a new object of class '<em>Player</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Player</em>'.
	 * @generated
	 */
	Player createPlayer();

	/**
	 * Returns a new object of class '<em>Knight</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Knight</em>'.
	 * @generated
	 */
	Knight createKnight();

	/**
	 * Returns a new object of class '<em>Square</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Square</em>'.
	 * @generated
	 */
	Square createSquare();

	/**
	 * Returns a new object of class '<em>Piece</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Piece</em>'.
	 * @generated
	 */
	Piece createPiece();

	/**
	 * Returns a new object of class '<em>Bishop</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bishop</em>'.
	 * @generated
	 */
	Bishop createBishop();

	/**
	 * Returns a new object of class '<em>King</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>King</em>'.
	 * @generated
	 */
	King createKing();

	/**
	 * Returns a new object of class '<em>Queen</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Queen</em>'.
	 * @generated
	 */
	Queen createQueen();

	/**
	 * Returns a new object of class '<em>Rook</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rook</em>'.
	 * @generated
	 */
	Rook createRook();

	/**
	 * Returns a new object of class '<em>Pawn</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pawn</em>'.
	 * @generated
	 */
	Pawn createPawn();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ChessdiagramPackage getChessdiagramPackage();

} //ChessdiagramFactory
