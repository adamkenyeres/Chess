/**
 */
package chessdiagram;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see chessdiagram.ChessdiagramFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore settingDelegates='org.eclipse.viatra.query.querybasedfeature'"
 * @generated
 */
public interface ChessdiagramPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "chessdiagram";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://example.com/chessdiagram";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "chessdiagram";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ChessdiagramPackage eINSTANCE = chessdiagram.impl.ChessdiagramPackageImpl.init();

	/**
	 * The meta object id for the '{@link chessdiagram.impl.ChessImpl <em>Chess</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see chessdiagram.impl.ChessImpl
	 * @see chessdiagram.impl.ChessdiagramPackageImpl#getChess()
	 * @generated
	 */
	int CHESS = 0;

	/**
	 * The feature id for the '<em><b>White Player</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHESS__WHITE_PLAYER = 0;

	/**
	 * The feature id for the '<em><b>Black Player</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHESS__BLACK_PLAYER = 1;

	/**
	 * The feature id for the '<em><b>Square</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHESS__SQUARE = 2;

	/**
	 * The feature id for the '<em><b>White Player Turn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHESS__WHITE_PLAYER_TURN = 3;

	/**
	 * The feature id for the '<em><b>Number Of Steps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHESS__NUMBER_OF_STEPS = 4;

	/**
	 * The feature id for the '<em><b>Steps Before Exlpoaring</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHESS__STEPS_BEFORE_EXLPOARING = 5;

	/**
	 * The number of structural features of the '<em>Chess</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHESS_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Chess</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHESS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link chessdiagram.impl.PlayerImpl <em>Player</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see chessdiagram.impl.PlayerImpl
	 * @see chessdiagram.impl.ChessdiagramPackageImpl#getPlayer()
	 * @generated
	 */
	int PLAYER = 1;

	/**
	 * The feature id for the '<em><b>Piece</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__PIECE = 0;

	/**
	 * The feature id for the '<em><b>Colour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__COLOUR = 1;

	/**
	 * The number of structural features of the '<em>Player</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Player</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link chessdiagram.impl.PieceImpl <em>Piece</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see chessdiagram.impl.PieceImpl
	 * @see chessdiagram.impl.ChessdiagramPackageImpl#getPiece()
	 * @generated
	 */
	int PIECE = 4;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIECE__POS = 0;

	/**
	 * The feature id for the '<em><b>Square</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIECE__SQUARE = 1;

	/**
	 * The feature id for the '<em><b>Colour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIECE__COLOUR = 2;

	/**
	 * The feature id for the '<em><b>Piece Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIECE__PIECE_TYPE = 3;

	/**
	 * The number of structural features of the '<em>Piece</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIECE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Piece</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIECE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link chessdiagram.impl.KnightImpl <em>Knight</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see chessdiagram.impl.KnightImpl
	 * @see chessdiagram.impl.ChessdiagramPackageImpl#getKnight()
	 * @generated
	 */
	int KNIGHT = 2;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNIGHT__POS = PIECE__POS;

	/**
	 * The feature id for the '<em><b>Square</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNIGHT__SQUARE = PIECE__SQUARE;

	/**
	 * The feature id for the '<em><b>Colour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNIGHT__COLOUR = PIECE__COLOUR;

	/**
	 * The feature id for the '<em><b>Piece Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNIGHT__PIECE_TYPE = PIECE__PIECE_TYPE;

	/**
	 * The number of structural features of the '<em>Knight</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNIGHT_FEATURE_COUNT = PIECE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Knight</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNIGHT_OPERATION_COUNT = PIECE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link chessdiagram.impl.SquareImpl <em>Square</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see chessdiagram.impl.SquareImpl
	 * @see chessdiagram.impl.ChessdiagramPackageImpl#getSquare()
	 * @generated
	 */
	int SQUARE = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE__ID = 0;

	/**
	 * The feature id for the '<em><b>Piece</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE__PIECE = 1;

	/**
	 * The feature id for the '<em><b>Colour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE__COLOUR = 2;

	/**
	 * The feature id for the '<em><b>W</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE__W = 3;

	/**
	 * The feature id for the '<em><b>N</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE__N = 4;

	/**
	 * The feature id for the '<em><b>S</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE__S = 5;

	/**
	 * The feature id for the '<em><b>NW</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE__NW = 6;

	/**
	 * The feature id for the '<em><b>NE</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE__NE = 7;

	/**
	 * The feature id for the '<em><b>SE</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE__SE = 8;

	/**
	 * The feature id for the '<em><b>SW</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE__SW = 9;

	/**
	 * The feature id for the '<em><b>E</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE__E = 10;

	/**
	 * The number of structural features of the '<em>Square</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Square</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link chessdiagram.impl.BishopImpl <em>Bishop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see chessdiagram.impl.BishopImpl
	 * @see chessdiagram.impl.ChessdiagramPackageImpl#getBishop()
	 * @generated
	 */
	int BISHOP = 5;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BISHOP__POS = PIECE__POS;

	/**
	 * The feature id for the '<em><b>Square</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BISHOP__SQUARE = PIECE__SQUARE;

	/**
	 * The feature id for the '<em><b>Colour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BISHOP__COLOUR = PIECE__COLOUR;

	/**
	 * The feature id for the '<em><b>Piece Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BISHOP__PIECE_TYPE = PIECE__PIECE_TYPE;

	/**
	 * The number of structural features of the '<em>Bishop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BISHOP_FEATURE_COUNT = PIECE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Bishop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BISHOP_OPERATION_COUNT = PIECE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link chessdiagram.impl.KingImpl <em>King</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see chessdiagram.impl.KingImpl
	 * @see chessdiagram.impl.ChessdiagramPackageImpl#getKing()
	 * @generated
	 */
	int KING = 6;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KING__POS = PIECE__POS;

	/**
	 * The feature id for the '<em><b>Square</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KING__SQUARE = PIECE__SQUARE;

	/**
	 * The feature id for the '<em><b>Colour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KING__COLOUR = PIECE__COLOUR;

	/**
	 * The feature id for the '<em><b>Piece Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KING__PIECE_TYPE = PIECE__PIECE_TYPE;

	/**
	 * The feature id for the '<em><b>First Move</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KING__FIRST_MOVE = PIECE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>King</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KING_FEATURE_COUNT = PIECE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>King</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KING_OPERATION_COUNT = PIECE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link chessdiagram.impl.QueenImpl <em>Queen</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see chessdiagram.impl.QueenImpl
	 * @see chessdiagram.impl.ChessdiagramPackageImpl#getQueen()
	 * @generated
	 */
	int QUEEN = 7;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEEN__POS = PIECE__POS;

	/**
	 * The feature id for the '<em><b>Square</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEEN__SQUARE = PIECE__SQUARE;

	/**
	 * The feature id for the '<em><b>Colour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEEN__COLOUR = PIECE__COLOUR;

	/**
	 * The feature id for the '<em><b>Piece Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEEN__PIECE_TYPE = PIECE__PIECE_TYPE;

	/**
	 * The number of structural features of the '<em>Queen</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEEN_FEATURE_COUNT = PIECE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Queen</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEEN_OPERATION_COUNT = PIECE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link chessdiagram.impl.RookImpl <em>Rook</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see chessdiagram.impl.RookImpl
	 * @see chessdiagram.impl.ChessdiagramPackageImpl#getRook()
	 * @generated
	 */
	int ROOK = 8;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOK__POS = PIECE__POS;

	/**
	 * The feature id for the '<em><b>Square</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOK__SQUARE = PIECE__SQUARE;

	/**
	 * The feature id for the '<em><b>Colour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOK__COLOUR = PIECE__COLOUR;

	/**
	 * The feature id for the '<em><b>Piece Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOK__PIECE_TYPE = PIECE__PIECE_TYPE;

	/**
	 * The feature id for the '<em><b>First Move</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOK__FIRST_MOVE = PIECE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rook</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOK_FEATURE_COUNT = PIECE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Rook</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOK_OPERATION_COUNT = PIECE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link chessdiagram.impl.PawnImpl <em>Pawn</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see chessdiagram.impl.PawnImpl
	 * @see chessdiagram.impl.ChessdiagramPackageImpl#getPawn()
	 * @generated
	 */
	int PAWN = 9;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAWN__POS = PIECE__POS;

	/**
	 * The feature id for the '<em><b>Square</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAWN__SQUARE = PIECE__SQUARE;

	/**
	 * The feature id for the '<em><b>Colour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAWN__COLOUR = PIECE__COLOUR;

	/**
	 * The feature id for the '<em><b>Piece Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAWN__PIECE_TYPE = PIECE__PIECE_TYPE;

	/**
	 * The feature id for the '<em><b>First Move</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAWN__FIRST_MOVE = PIECE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>En Passant Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAWN__EN_PASSANT_ENABLED = PIECE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pawn</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAWN_FEATURE_COUNT = PIECE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pawn</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAWN_OPERATION_COUNT = PIECE_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link chessdiagram.Colour <em>Colour</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see chessdiagram.Colour
	 * @see chessdiagram.impl.ChessdiagramPackageImpl#getColour()
	 * @generated
	 */
	int COLOUR = 10;


	/**
	 * The meta object id for the '{@link chessdiagram.PieceType <em>Piece Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see chessdiagram.PieceType
	 * @see chessdiagram.impl.ChessdiagramPackageImpl#getPieceType()
	 * @generated
	 */
	int PIECE_TYPE = 11;


	/**
	 * Returns the meta object for class '{@link chessdiagram.Chess <em>Chess</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chess</em>'.
	 * @see chessdiagram.Chess
	 * @generated
	 */
	EClass getChess();

	/**
	 * Returns the meta object for the containment reference '{@link chessdiagram.Chess#getWhitePlayer <em>White Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>White Player</em>'.
	 * @see chessdiagram.Chess#getWhitePlayer()
	 * @see #getChess()
	 * @generated
	 */
	EReference getChess_WhitePlayer();

	/**
	 * Returns the meta object for the containment reference '{@link chessdiagram.Chess#getBlackPlayer <em>Black Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Black Player</em>'.
	 * @see chessdiagram.Chess#getBlackPlayer()
	 * @see #getChess()
	 * @generated
	 */
	EReference getChess_BlackPlayer();

	/**
	 * Returns the meta object for the containment reference list '{@link chessdiagram.Chess#getSquare <em>Square</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Square</em>'.
	 * @see chessdiagram.Chess#getSquare()
	 * @see #getChess()
	 * @generated
	 */
	EReference getChess_Square();

	/**
	 * Returns the meta object for the attribute '{@link chessdiagram.Chess#isWhitePlayerTurn <em>White Player Turn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>White Player Turn</em>'.
	 * @see chessdiagram.Chess#isWhitePlayerTurn()
	 * @see #getChess()
	 * @generated
	 */
	EAttribute getChess_WhitePlayerTurn();

	/**
	 * Returns the meta object for the attribute '{@link chessdiagram.Chess#getNumberOfSteps <em>Number Of Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Steps</em>'.
	 * @see chessdiagram.Chess#getNumberOfSteps()
	 * @see #getChess()
	 * @generated
	 */
	EAttribute getChess_NumberOfSteps();

	/**
	 * Returns the meta object for the attribute '{@link chessdiagram.Chess#getStepsBeforeExlpoaring <em>Steps Before Exlpoaring</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Steps Before Exlpoaring</em>'.
	 * @see chessdiagram.Chess#getStepsBeforeExlpoaring()
	 * @see #getChess()
	 * @generated
	 */
	EAttribute getChess_StepsBeforeExlpoaring();

	/**
	 * Returns the meta object for class '{@link chessdiagram.Player <em>Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Player</em>'.
	 * @see chessdiagram.Player
	 * @generated
	 */
	EClass getPlayer();

	/**
	 * Returns the meta object for the containment reference list '{@link chessdiagram.Player#getPiece <em>Piece</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Piece</em>'.
	 * @see chessdiagram.Player#getPiece()
	 * @see #getPlayer()
	 * @generated
	 */
	EReference getPlayer_Piece();

	/**
	 * Returns the meta object for the attribute '{@link chessdiagram.Player#getColour <em>Colour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Colour</em>'.
	 * @see chessdiagram.Player#getColour()
	 * @see #getPlayer()
	 * @generated
	 */
	EAttribute getPlayer_Colour();

	/**
	 * Returns the meta object for class '{@link chessdiagram.Knight <em>Knight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Knight</em>'.
	 * @see chessdiagram.Knight
	 * @generated
	 */
	EClass getKnight();

	/**
	 * Returns the meta object for class '{@link chessdiagram.Square <em>Square</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Square</em>'.
	 * @see chessdiagram.Square
	 * @generated
	 */
	EClass getSquare();

	/**
	 * Returns the meta object for the reference '{@link chessdiagram.Square#getPiece <em>Piece</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Piece</em>'.
	 * @see chessdiagram.Square#getPiece()
	 * @see #getSquare()
	 * @generated
	 */
	EReference getSquare_Piece();

	/**
	 * Returns the meta object for the attribute '{@link chessdiagram.Square#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see chessdiagram.Square#getId()
	 * @see #getSquare()
	 * @generated
	 */
	EAttribute getSquare_Id();

	/**
	 * Returns the meta object for the attribute '{@link chessdiagram.Square#getColour <em>Colour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Colour</em>'.
	 * @see chessdiagram.Square#getColour()
	 * @see #getSquare()
	 * @generated
	 */
	EAttribute getSquare_Colour();

	/**
	 * Returns the meta object for the reference '{@link chessdiagram.Square#getW <em>W</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>W</em>'.
	 * @see chessdiagram.Square#getW()
	 * @see #getSquare()
	 * @generated
	 */
	EReference getSquare_W();

	/**
	 * Returns the meta object for the reference '{@link chessdiagram.Square#getN <em>N</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>N</em>'.
	 * @see chessdiagram.Square#getN()
	 * @see #getSquare()
	 * @generated
	 */
	EReference getSquare_N();

	/**
	 * Returns the meta object for the reference '{@link chessdiagram.Square#getS <em>S</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>S</em>'.
	 * @see chessdiagram.Square#getS()
	 * @see #getSquare()
	 * @generated
	 */
	EReference getSquare_S();

	/**
	 * Returns the meta object for the reference '{@link chessdiagram.Square#getNW <em>NW</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>NW</em>'.
	 * @see chessdiagram.Square#getNW()
	 * @see #getSquare()
	 * @generated
	 */
	EReference getSquare_NW();

	/**
	 * Returns the meta object for the reference '{@link chessdiagram.Square#getNE <em>NE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>NE</em>'.
	 * @see chessdiagram.Square#getNE()
	 * @see #getSquare()
	 * @generated
	 */
	EReference getSquare_NE();

	/**
	 * Returns the meta object for the reference '{@link chessdiagram.Square#getSE <em>SE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>SE</em>'.
	 * @see chessdiagram.Square#getSE()
	 * @see #getSquare()
	 * @generated
	 */
	EReference getSquare_SE();

	/**
	 * Returns the meta object for the reference '{@link chessdiagram.Square#getSW <em>SW</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>SW</em>'.
	 * @see chessdiagram.Square#getSW()
	 * @see #getSquare()
	 * @generated
	 */
	EReference getSquare_SW();

	/**
	 * Returns the meta object for the reference '{@link chessdiagram.Square#getE <em>E</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>E</em>'.
	 * @see chessdiagram.Square#getE()
	 * @see #getSquare()
	 * @generated
	 */
	EReference getSquare_E();

	/**
	 * Returns the meta object for class '{@link chessdiagram.Piece <em>Piece</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Piece</em>'.
	 * @see chessdiagram.Piece
	 * @generated
	 */
	EClass getPiece();

	/**
	 * Returns the meta object for the attribute '{@link chessdiagram.Piece#getColour <em>Colour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Colour</em>'.
	 * @see chessdiagram.Piece#getColour()
	 * @see #getPiece()
	 * @generated
	 */
	EAttribute getPiece_Colour();

	/**
	 * Returns the meta object for the attribute '{@link chessdiagram.Piece#getPieceType <em>Piece Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Piece Type</em>'.
	 * @see chessdiagram.Piece#getPieceType()
	 * @see #getPiece()
	 * @generated
	 */
	EAttribute getPiece_PieceType();

	/**
	 * Returns the meta object for the attribute '{@link chessdiagram.Piece#getPos <em>Pos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pos</em>'.
	 * @see chessdiagram.Piece#getPos()
	 * @see #getPiece()
	 * @generated
	 */
	EAttribute getPiece_Pos();

	/**
	 * Returns the meta object for the reference '{@link chessdiagram.Piece#getSquare <em>Square</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Square</em>'.
	 * @see chessdiagram.Piece#getSquare()
	 * @see #getPiece()
	 * @generated
	 */
	EReference getPiece_Square();

	/**
	 * Returns the meta object for class '{@link chessdiagram.Bishop <em>Bishop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bishop</em>'.
	 * @see chessdiagram.Bishop
	 * @generated
	 */
	EClass getBishop();

	/**
	 * Returns the meta object for class '{@link chessdiagram.King <em>King</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>King</em>'.
	 * @see chessdiagram.King
	 * @generated
	 */
	EClass getKing();

	/**
	 * Returns the meta object for the attribute '{@link chessdiagram.King#isFirstMove <em>First Move</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Move</em>'.
	 * @see chessdiagram.King#isFirstMove()
	 * @see #getKing()
	 * @generated
	 */
	EAttribute getKing_FirstMove();

	/**
	 * Returns the meta object for class '{@link chessdiagram.Queen <em>Queen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Queen</em>'.
	 * @see chessdiagram.Queen
	 * @generated
	 */
	EClass getQueen();

	/**
	 * Returns the meta object for class '{@link chessdiagram.Rook <em>Rook</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rook</em>'.
	 * @see chessdiagram.Rook
	 * @generated
	 */
	EClass getRook();

	/**
	 * Returns the meta object for the attribute '{@link chessdiagram.Rook#isFirstMove <em>First Move</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Move</em>'.
	 * @see chessdiagram.Rook#isFirstMove()
	 * @see #getRook()
	 * @generated
	 */
	EAttribute getRook_FirstMove();

	/**
	 * Returns the meta object for class '{@link chessdiagram.Pawn <em>Pawn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pawn</em>'.
	 * @see chessdiagram.Pawn
	 * @generated
	 */
	EClass getPawn();

	/**
	 * Returns the meta object for the attribute '{@link chessdiagram.Pawn#isFirstMove <em>First Move</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Move</em>'.
	 * @see chessdiagram.Pawn#isFirstMove()
	 * @see #getPawn()
	 * @generated
	 */
	EAttribute getPawn_FirstMove();

	/**
	 * Returns the meta object for the attribute '{@link chessdiagram.Pawn#isEnPassantEnabled <em>En Passant Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>En Passant Enabled</em>'.
	 * @see chessdiagram.Pawn#isEnPassantEnabled()
	 * @see #getPawn()
	 * @generated
	 */
	EAttribute getPawn_EnPassantEnabled();

	/**
	 * Returns the meta object for enum '{@link chessdiagram.Colour <em>Colour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Colour</em>'.
	 * @see chessdiagram.Colour
	 * @generated
	 */
	EEnum getColour();

	/**
	 * Returns the meta object for enum '{@link chessdiagram.PieceType <em>Piece Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Piece Type</em>'.
	 * @see chessdiagram.PieceType
	 * @generated
	 */
	EEnum getPieceType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ChessdiagramFactory getChessdiagramFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link chessdiagram.impl.ChessImpl <em>Chess</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see chessdiagram.impl.ChessImpl
		 * @see chessdiagram.impl.ChessdiagramPackageImpl#getChess()
		 * @generated
		 */
		EClass CHESS = eINSTANCE.getChess();

		/**
		 * The meta object literal for the '<em><b>White Player</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHESS__WHITE_PLAYER = eINSTANCE.getChess_WhitePlayer();

		/**
		 * The meta object literal for the '<em><b>Black Player</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHESS__BLACK_PLAYER = eINSTANCE.getChess_BlackPlayer();

		/**
		 * The meta object literal for the '<em><b>Square</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHESS__SQUARE = eINSTANCE.getChess_Square();

		/**
		 * The meta object literal for the '<em><b>White Player Turn</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHESS__WHITE_PLAYER_TURN = eINSTANCE.getChess_WhitePlayerTurn();

		/**
		 * The meta object literal for the '<em><b>Number Of Steps</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHESS__NUMBER_OF_STEPS = eINSTANCE.getChess_NumberOfSteps();

		/**
		 * The meta object literal for the '<em><b>Steps Before Exlpoaring</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHESS__STEPS_BEFORE_EXLPOARING = eINSTANCE.getChess_StepsBeforeExlpoaring();

		/**
		 * The meta object literal for the '{@link chessdiagram.impl.PlayerImpl <em>Player</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see chessdiagram.impl.PlayerImpl
		 * @see chessdiagram.impl.ChessdiagramPackageImpl#getPlayer()
		 * @generated
		 */
		EClass PLAYER = eINSTANCE.getPlayer();

		/**
		 * The meta object literal for the '<em><b>Piece</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAYER__PIECE = eINSTANCE.getPlayer_Piece();

		/**
		 * The meta object literal for the '<em><b>Colour</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER__COLOUR = eINSTANCE.getPlayer_Colour();

		/**
		 * The meta object literal for the '{@link chessdiagram.impl.KnightImpl <em>Knight</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see chessdiagram.impl.KnightImpl
		 * @see chessdiagram.impl.ChessdiagramPackageImpl#getKnight()
		 * @generated
		 */
		EClass KNIGHT = eINSTANCE.getKnight();

		/**
		 * The meta object literal for the '{@link chessdiagram.impl.SquareImpl <em>Square</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see chessdiagram.impl.SquareImpl
		 * @see chessdiagram.impl.ChessdiagramPackageImpl#getSquare()
		 * @generated
		 */
		EClass SQUARE = eINSTANCE.getSquare();

		/**
		 * The meta object literal for the '<em><b>Piece</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQUARE__PIECE = eINSTANCE.getSquare_Piece();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQUARE__ID = eINSTANCE.getSquare_Id();

		/**
		 * The meta object literal for the '<em><b>Colour</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQUARE__COLOUR = eINSTANCE.getSquare_Colour();

		/**
		 * The meta object literal for the '<em><b>W</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQUARE__W = eINSTANCE.getSquare_W();

		/**
		 * The meta object literal for the '<em><b>N</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQUARE__N = eINSTANCE.getSquare_N();

		/**
		 * The meta object literal for the '<em><b>S</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQUARE__S = eINSTANCE.getSquare_S();

		/**
		 * The meta object literal for the '<em><b>NW</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQUARE__NW = eINSTANCE.getSquare_NW();

		/**
		 * The meta object literal for the '<em><b>NE</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQUARE__NE = eINSTANCE.getSquare_NE();

		/**
		 * The meta object literal for the '<em><b>SE</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQUARE__SE = eINSTANCE.getSquare_SE();

		/**
		 * The meta object literal for the '<em><b>SW</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQUARE__SW = eINSTANCE.getSquare_SW();

		/**
		 * The meta object literal for the '<em><b>E</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQUARE__E = eINSTANCE.getSquare_E();

		/**
		 * The meta object literal for the '{@link chessdiagram.impl.PieceImpl <em>Piece</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see chessdiagram.impl.PieceImpl
		 * @see chessdiagram.impl.ChessdiagramPackageImpl#getPiece()
		 * @generated
		 */
		EClass PIECE = eINSTANCE.getPiece();

		/**
		 * The meta object literal for the '<em><b>Colour</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIECE__COLOUR = eINSTANCE.getPiece_Colour();

		/**
		 * The meta object literal for the '<em><b>Piece Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIECE__PIECE_TYPE = eINSTANCE.getPiece_PieceType();

		/**
		 * The meta object literal for the '<em><b>Pos</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIECE__POS = eINSTANCE.getPiece_Pos();

		/**
		 * The meta object literal for the '<em><b>Square</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIECE__SQUARE = eINSTANCE.getPiece_Square();

		/**
		 * The meta object literal for the '{@link chessdiagram.impl.BishopImpl <em>Bishop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see chessdiagram.impl.BishopImpl
		 * @see chessdiagram.impl.ChessdiagramPackageImpl#getBishop()
		 * @generated
		 */
		EClass BISHOP = eINSTANCE.getBishop();

		/**
		 * The meta object literal for the '{@link chessdiagram.impl.KingImpl <em>King</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see chessdiagram.impl.KingImpl
		 * @see chessdiagram.impl.ChessdiagramPackageImpl#getKing()
		 * @generated
		 */
		EClass KING = eINSTANCE.getKing();

		/**
		 * The meta object literal for the '<em><b>First Move</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KING__FIRST_MOVE = eINSTANCE.getKing_FirstMove();

		/**
		 * The meta object literal for the '{@link chessdiagram.impl.QueenImpl <em>Queen</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see chessdiagram.impl.QueenImpl
		 * @see chessdiagram.impl.ChessdiagramPackageImpl#getQueen()
		 * @generated
		 */
		EClass QUEEN = eINSTANCE.getQueen();

		/**
		 * The meta object literal for the '{@link chessdiagram.impl.RookImpl <em>Rook</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see chessdiagram.impl.RookImpl
		 * @see chessdiagram.impl.ChessdiagramPackageImpl#getRook()
		 * @generated
		 */
		EClass ROOK = eINSTANCE.getRook();

		/**
		 * The meta object literal for the '<em><b>First Move</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOK__FIRST_MOVE = eINSTANCE.getRook_FirstMove();

		/**
		 * The meta object literal for the '{@link chessdiagram.impl.PawnImpl <em>Pawn</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see chessdiagram.impl.PawnImpl
		 * @see chessdiagram.impl.ChessdiagramPackageImpl#getPawn()
		 * @generated
		 */
		EClass PAWN = eINSTANCE.getPawn();

		/**
		 * The meta object literal for the '<em><b>First Move</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAWN__FIRST_MOVE = eINSTANCE.getPawn_FirstMove();

		/**
		 * The meta object literal for the '<em><b>En Passant Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAWN__EN_PASSANT_ENABLED = eINSTANCE.getPawn_EnPassantEnabled();

		/**
		 * The meta object literal for the '{@link chessdiagram.Colour <em>Colour</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see chessdiagram.Colour
		 * @see chessdiagram.impl.ChessdiagramPackageImpl#getColour()
		 * @generated
		 */
		EEnum COLOUR = eINSTANCE.getColour();

		/**
		 * The meta object literal for the '{@link chessdiagram.PieceType <em>Piece Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see chessdiagram.PieceType
		 * @see chessdiagram.impl.ChessdiagramPackageImpl#getPieceType()
		 * @generated
		 */
		EEnum PIECE_TYPE = eINSTANCE.getPieceType();

	}

} //ChessdiagramPackage
