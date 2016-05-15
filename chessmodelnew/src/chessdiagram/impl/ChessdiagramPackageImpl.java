/**
 */
package chessdiagram.impl;

import chessdiagram.Bishop;
import chessdiagram.Chess;
import chessdiagram.ChessdiagramFactory;
import chessdiagram.ChessdiagramPackage;
import chessdiagram.Colour;
import chessdiagram.King;
import chessdiagram.Knight;
import chessdiagram.Pawn;
import chessdiagram.Piece;
import chessdiagram.PieceType;
import chessdiagram.Player;
import chessdiagram.Queen;
import chessdiagram.Rook;
import chessdiagram.Square;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ChessdiagramPackageImpl extends EPackageImpl implements ChessdiagramPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass playerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass knightEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass squareEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pieceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bishopEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rookEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pawnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum colourEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum pieceTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see chessdiagram.ChessdiagramPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ChessdiagramPackageImpl() {
		super(eNS_URI, ChessdiagramFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ChessdiagramPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ChessdiagramPackage init() {
		if (isInited) return (ChessdiagramPackage)EPackage.Registry.INSTANCE.getEPackage(ChessdiagramPackage.eNS_URI);

		// Obtain or create and register package
		ChessdiagramPackageImpl theChessdiagramPackage = (ChessdiagramPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ChessdiagramPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ChessdiagramPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theChessdiagramPackage.createPackageContents();

		// Initialize created meta-data
		theChessdiagramPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theChessdiagramPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ChessdiagramPackage.eNS_URI, theChessdiagramPackage);
		return theChessdiagramPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChess() {
		return chessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChess_WhitePlayer() {
		return (EReference)chessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChess_BlackPlayer() {
		return (EReference)chessEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChess_Square() {
		return (EReference)chessEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChess_WhitePlayerTurn() {
		return (EAttribute)chessEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChess_NumberOfSteps() {
		return (EAttribute)chessEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChess_StepsBeforeExlpoaring() {
		return (EAttribute)chessEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlayer() {
		return playerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlayer_Piece() {
		return (EReference)playerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlayer_Colour() {
		return (EAttribute)playerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKnight() {
		return knightEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSquare() {
		return squareEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSquare_Piece() {
		return (EReference)squareEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSquare_Id() {
		return (EAttribute)squareEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSquare_Colour() {
		return (EAttribute)squareEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSquare_W() {
		return (EReference)squareEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSquare_N() {
		return (EReference)squareEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSquare_S() {
		return (EReference)squareEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSquare_NW() {
		return (EReference)squareEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSquare_NE() {
		return (EReference)squareEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSquare_SE() {
		return (EReference)squareEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSquare_SW() {
		return (EReference)squareEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSquare_E() {
		return (EReference)squareEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPiece() {
		return pieceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPiece_Colour() {
		return (EAttribute)pieceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPiece_PieceType() {
		return (EAttribute)pieceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPiece_Pos() {
		return (EAttribute)pieceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPiece_Square() {
		return (EReference)pieceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBishop() {
		return bishopEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKing() {
		return kingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKing_FirstMove() {
		return (EAttribute)kingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQueen() {
		return queenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRook() {
		return rookEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRook_FirstMove() {
		return (EAttribute)rookEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPawn() {
		return pawnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPawn_FirstMove() {
		return (EAttribute)pawnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPawn_EnPassantEnabled() {
		return (EAttribute)pawnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getColour() {
		return colourEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPieceType() {
		return pieceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChessdiagramFactory getChessdiagramFactory() {
		return (ChessdiagramFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		chessEClass = createEClass(CHESS);
		createEReference(chessEClass, CHESS__WHITE_PLAYER);
		createEReference(chessEClass, CHESS__BLACK_PLAYER);
		createEReference(chessEClass, CHESS__SQUARE);
		createEAttribute(chessEClass, CHESS__WHITE_PLAYER_TURN);
		createEAttribute(chessEClass, CHESS__NUMBER_OF_STEPS);
		createEAttribute(chessEClass, CHESS__STEPS_BEFORE_EXLPOARING);

		playerEClass = createEClass(PLAYER);
		createEReference(playerEClass, PLAYER__PIECE);
		createEAttribute(playerEClass, PLAYER__COLOUR);

		knightEClass = createEClass(KNIGHT);

		squareEClass = createEClass(SQUARE);
		createEAttribute(squareEClass, SQUARE__ID);
		createEReference(squareEClass, SQUARE__PIECE);
		createEAttribute(squareEClass, SQUARE__COLOUR);
		createEReference(squareEClass, SQUARE__W);
		createEReference(squareEClass, SQUARE__N);
		createEReference(squareEClass, SQUARE__S);
		createEReference(squareEClass, SQUARE__NW);
		createEReference(squareEClass, SQUARE__NE);
		createEReference(squareEClass, SQUARE__SE);
		createEReference(squareEClass, SQUARE__SW);
		createEReference(squareEClass, SQUARE__E);

		pieceEClass = createEClass(PIECE);
		createEAttribute(pieceEClass, PIECE__POS);
		createEReference(pieceEClass, PIECE__SQUARE);
		createEAttribute(pieceEClass, PIECE__COLOUR);
		createEAttribute(pieceEClass, PIECE__PIECE_TYPE);

		bishopEClass = createEClass(BISHOP);

		kingEClass = createEClass(KING);
		createEAttribute(kingEClass, KING__FIRST_MOVE);

		queenEClass = createEClass(QUEEN);

		rookEClass = createEClass(ROOK);
		createEAttribute(rookEClass, ROOK__FIRST_MOVE);

		pawnEClass = createEClass(PAWN);
		createEAttribute(pawnEClass, PAWN__FIRST_MOVE);
		createEAttribute(pawnEClass, PAWN__EN_PASSANT_ENABLED);

		// Create enums
		colourEEnum = createEEnum(COLOUR);
		pieceTypeEEnum = createEEnum(PIECE_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		knightEClass.getESuperTypes().add(this.getPiece());
		bishopEClass.getESuperTypes().add(this.getPiece());
		kingEClass.getESuperTypes().add(this.getPiece());
		queenEClass.getESuperTypes().add(this.getPiece());
		rookEClass.getESuperTypes().add(this.getPiece());
		pawnEClass.getESuperTypes().add(this.getPiece());

		// Initialize classes, features, and operations; add parameters
		initEClass(chessEClass, Chess.class, "Chess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChess_WhitePlayer(), this.getPlayer(), null, "whitePlayer", null, 1, 1, Chess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChess_BlackPlayer(), this.getPlayer(), null, "blackPlayer", null, 1, 1, Chess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChess_Square(), this.getSquare(), null, "square", null, 64, 64, Chess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChess_WhitePlayerTurn(), ecorePackage.getEBoolean(), "whitePlayerTurn", "true", 0, 1, Chess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChess_NumberOfSteps(), ecorePackage.getEInt(), "numberOfSteps", "0", 0, 1, Chess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChess_StepsBeforeExlpoaring(), ecorePackage.getEInt(), "stepsBeforeExlpoaring", "0", 0, 1, Chess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(playerEClass, Player.class, "Player", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlayer_Piece(), this.getPiece(), null, "piece", null, 0, 16, Player.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlayer_Colour(), this.getColour(), "colour", "White", 0, 1, Player.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(knightEClass, Knight.class, "Knight", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(squareEClass, Square.class, "Square", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSquare_Id(), ecorePackage.getEInt(), "id", null, 0, 1, Square.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSquare_Piece(), this.getPiece(), this.getPiece_Square(), "piece", null, 0, 1, Square.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getSquare_Colour(), this.getColour(), "colour", "White", 0, 1, Square.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSquare_W(), this.getSquare(), null, "W", null, 0, 1, Square.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSquare_N(), this.getSquare(), null, "N", null, 0, 1, Square.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSquare_S(), this.getSquare(), null, "S", null, 0, 1, Square.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSquare_NW(), this.getSquare(), null, "NW", null, 0, 1, Square.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSquare_NE(), this.getSquare(), null, "NE", null, 0, 1, Square.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSquare_SE(), this.getSquare(), null, "SE", null, 0, 1, Square.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSquare_SW(), this.getSquare(), null, "SW", null, 0, 1, Square.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSquare_E(), this.getSquare(), null, "E", null, 0, 1, Square.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(pieceEClass, Piece.class, "Piece", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPiece_Pos(), ecorePackage.getEInt(), "pos", null, 0, 1, Piece.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPiece_Square(), this.getSquare(), this.getSquare_Piece(), "square", null, 1, 1, Piece.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getPiece_Colour(), this.getColour(), "colour", "White", 0, 1, Piece.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPiece_PieceType(), this.getPieceType(), "pieceType", "Pawn", 0, 1, Piece.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bishopEClass, Bishop.class, "Bishop", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(kingEClass, King.class, "King", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKing_FirstMove(), ecorePackage.getEBoolean(), "firstMove", "True", 0, 1, King.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(queenEClass, Queen.class, "Queen", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rookEClass, Rook.class, "Rook", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRook_FirstMove(), ecorePackage.getEBoolean(), "firstMove", "true", 0, 1, Rook.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pawnEClass, Pawn.class, "Pawn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPawn_FirstMove(), ecorePackage.getEBoolean(), "firstMove", "True", 0, 1, Pawn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPawn_EnPassantEnabled(), ecorePackage.getEBoolean(), "enPassantEnabled", "false", 0, 1, Pawn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(colourEEnum, Colour.class, "Colour");
		addEEnumLiteral(colourEEnum, Colour.WHITE);
		addEEnumLiteral(colourEEnum, Colour.BLACK);
		addEEnumLiteral(colourEEnum, Colour.RED);

		initEEnum(pieceTypeEEnum, PieceType.class, "PieceType");
		addEEnumLiteral(pieceTypeEEnum, PieceType.QUEEN);
		addEEnumLiteral(pieceTypeEEnum, PieceType.KING);
		addEEnumLiteral(pieceTypeEEnum, PieceType.ROOK);
		addEEnumLiteral(pieceTypeEEnum, PieceType.KNIGHT);
		addEEnumLiteral(pieceTypeEEnum, PieceType.BISHOP);
		addEEnumLiteral(pieceTypeEEnum, PieceType.PAWN);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// org.eclipse.viatra.query.querybasedfeature
		createOrgAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "settingDelegates", "org.eclipse.viatra.query.querybasedfeature"
		   });
	}

	/**
	 * Initializes the annotations for <b>org.eclipse.viatra.query.querybasedfeature</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOrgAnnotations() {
		String source = "org.eclipse.viatra.query.querybasedfeature";	
		addAnnotation
		  (getSquare_Piece(), 
		   source, 
		   new String[] {
			 "patternFQN", "chess.queries.piece"
		   });	
		addAnnotation
		  (getSquare_W(), 
		   source, 
		   new String[] {
			 "patternFQN", "chess.queries.W"
		   });	
		addAnnotation
		  (getSquare_N(), 
		   source, 
		   new String[] {
			 "patternFQN", "chess.queries.N"
		   });	
		addAnnotation
		  (getSquare_S(), 
		   source, 
		   new String[] {
			 "patternFQN", "chess.queries.S"
		   });	
		addAnnotation
		  (getSquare_NW(), 
		   source, 
		   new String[] {
			 "patternFQN", "chess.queries.NW"
		   });	
		addAnnotation
		  (getSquare_NE(), 
		   source, 
		   new String[] {
			 "patternFQN", "chess.queries.NE"
		   });	
		addAnnotation
		  (getSquare_SE(), 
		   source, 
		   new String[] {
			 "patternFQN", "chess.queries.SE"
		   });	
		addAnnotation
		  (getSquare_SW(), 
		   source, 
		   new String[] {
			 "patternFQN", "chess.queries.SW"
		   });	
		addAnnotation
		  (getSquare_E(), 
		   source, 
		   new String[] {
			 "patternFQN", "chess.queries.E"
		   });	
		addAnnotation
		  (getPiece_Square(), 
		   source, 
		   new String[] {
			 "patternFQN", "chess.queries.square"
		   });
	}

} //ChessdiagramPackageImpl
