/**
 */
package chessdiagram;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Piece Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see chessdiagram.ChessdiagramPackage#getPieceType()
 * @model
 * @generated
 */
public enum PieceType implements Enumerator {
	/**
	 * The '<em><b>Queen</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QUEEN_VALUE
	 * @generated
	 * @ordered
	 */
	QUEEN(0, "Queen", "Queen"),

	/**
	 * The '<em><b>King</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KING_VALUE
	 * @generated
	 * @ordered
	 */
	KING(1, "King", "King"),

	/**
	 * The '<em><b>Rook</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROOK_VALUE
	 * @generated
	 * @ordered
	 */
	ROOK(2, "Rook", "Rook"),

	/**
	 * The '<em><b>Knight</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KNIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	KNIGHT(3, "Knight", "Knight"),

	/**
	 * The '<em><b>Bishop</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BISHOP_VALUE
	 * @generated
	 * @ordered
	 */
	BISHOP(4, "Bishop", "Bishop"),

	/**
	 * The '<em><b>Pawn</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PAWN_VALUE
	 * @generated
	 * @ordered
	 */
	PAWN(5, "Pawn", "Pawn");

	/**
	 * The '<em><b>Queen</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Queen</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #QUEEN
	 * @model name="Queen"
	 * @generated
	 * @ordered
	 */
	public static final int QUEEN_VALUE = 0;

	/**
	 * The '<em><b>King</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>King</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KING
	 * @model name="King"
	 * @generated
	 * @ordered
	 */
	public static final int KING_VALUE = 1;

	/**
	 * The '<em><b>Rook</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Rook</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ROOK
	 * @model name="Rook"
	 * @generated
	 * @ordered
	 */
	public static final int ROOK_VALUE = 2;

	/**
	 * The '<em><b>Knight</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Knight</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KNIGHT
	 * @model name="Knight"
	 * @generated
	 * @ordered
	 */
	public static final int KNIGHT_VALUE = 3;

	/**
	 * The '<em><b>Bishop</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Bishop</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BISHOP
	 * @model name="Bishop"
	 * @generated
	 * @ordered
	 */
	public static final int BISHOP_VALUE = 4;

	/**
	 * The '<em><b>Pawn</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pawn</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PAWN
	 * @model name="Pawn"
	 * @generated
	 * @ordered
	 */
	public static final int PAWN_VALUE = 5;

	/**
	 * An array of all the '<em><b>Piece Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PieceType[] VALUES_ARRAY =
		new PieceType[] {
			QUEEN,
			KING,
			ROOK,
			KNIGHT,
			BISHOP,
			PAWN,
		};

	/**
	 * A public read-only list of all the '<em><b>Piece Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PieceType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Piece Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PieceType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PieceType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Piece Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PieceType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PieceType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Piece Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PieceType get(int value) {
		switch (value) {
			case QUEEN_VALUE: return QUEEN;
			case KING_VALUE: return KING;
			case ROOK_VALUE: return ROOK;
			case KNIGHT_VALUE: return KNIGHT;
			case BISHOP_VALUE: return BISHOP;
			case PAWN_VALUE: return PAWN;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private PieceType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //PieceType
