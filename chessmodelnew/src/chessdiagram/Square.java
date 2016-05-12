/**
 */
package chessdiagram;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Square</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link chessdiagram.Square#getId <em>Id</em>}</li>
 *   <li>{@link chessdiagram.Square#getPiece <em>Piece</em>}</li>
 *   <li>{@link chessdiagram.Square#getColour <em>Colour</em>}</li>
 *   <li>{@link chessdiagram.Square#getW <em>W</em>}</li>
 *   <li>{@link chessdiagram.Square#getN <em>N</em>}</li>
 *   <li>{@link chessdiagram.Square#getS <em>S</em>}</li>
 *   <li>{@link chessdiagram.Square#getNW <em>NW</em>}</li>
 *   <li>{@link chessdiagram.Square#getNE <em>NE</em>}</li>
 *   <li>{@link chessdiagram.Square#getSE <em>SE</em>}</li>
 *   <li>{@link chessdiagram.Square#getSW <em>SW</em>}</li>
 *   <li>{@link chessdiagram.Square#getE <em>E</em>}</li>
 * </ul>
 *
 * @see chessdiagram.ChessdiagramPackage#getSquare()
 * @model
 * @generated
 */
public interface Square extends EObject {
	/**
	 * Returns the value of the '<em><b>Piece</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link chessdiagram.Piece#getSquare <em>Square</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Piece</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Piece</em>' reference.
	 * @see chessdiagram.ChessdiagramPackage#getSquare_Piece()
	 * @see chessdiagram.Piece#getSquare
	 * @model opposite="square" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="org.eclipse.viatra.query.querybasedfeature patternFQN='chess.queries.piece'"
	 * @generated
	 */
	Piece getPiece();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see chessdiagram.ChessdiagramPackage#getSquare_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link chessdiagram.Square#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

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
	 * @see chessdiagram.ChessdiagramPackage#getSquare_Colour()
	 * @model default="White"
	 * @generated
	 */
	Colour getColour();

	/**
	 * Sets the value of the '{@link chessdiagram.Square#getColour <em>Colour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Colour</em>' attribute.
	 * @see chessdiagram.Colour
	 * @see #getColour()
	 * @generated
	 */
	void setColour(Colour value);

	/**
	 * Returns the value of the '<em><b>W</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>W</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>W</em>' reference.
	 * @see chessdiagram.ChessdiagramPackage#getSquare_W()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="org.eclipse.viatra.query.querybasedfeature patternFQN='chess.queries.W'"
	 * @generated
	 */
	Square getW();

	/**
	 * Returns the value of the '<em><b>N</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>N</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>N</em>' reference.
	 * @see chessdiagram.ChessdiagramPackage#getSquare_N()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="org.eclipse.viatra.query.querybasedfeature patternFQN='chess.queries.N'"
	 * @generated
	 */
	Square getN();

	/**
	 * Returns the value of the '<em><b>S</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>S</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>S</em>' reference.
	 * @see chessdiagram.ChessdiagramPackage#getSquare_S()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="org.eclipse.viatra.query.querybasedfeature patternFQN='chess.queries.S'"
	 * @generated
	 */
	Square getS();

	/**
	 * Returns the value of the '<em><b>NW</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>NW</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>NW</em>' reference.
	 * @see chessdiagram.ChessdiagramPackage#getSquare_NW()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="org.eclipse.viatra.query.querybasedfeature patternFQN='chess.queries.NW'"
	 * @generated
	 */
	Square getNW();

	/**
	 * Returns the value of the '<em><b>NE</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>NE</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>NE</em>' reference.
	 * @see chessdiagram.ChessdiagramPackage#getSquare_NE()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="org.eclipse.viatra.query.querybasedfeature patternFQN='chess.queries.NE'"
	 * @generated
	 */
	Square getNE();

	/**
	 * Returns the value of the '<em><b>SE</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SE</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SE</em>' reference.
	 * @see chessdiagram.ChessdiagramPackage#getSquare_SE()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="org.eclipse.viatra.query.querybasedfeature patternFQN='chess.queries.SE'"
	 * @generated
	 */
	Square getSE();

	/**
	 * Returns the value of the '<em><b>SW</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SW</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SW</em>' reference.
	 * @see chessdiagram.ChessdiagramPackage#getSquare_SW()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="org.eclipse.viatra.query.querybasedfeature patternFQN='chess.queries.SW'"
	 * @generated
	 */
	Square getSW();

	/**
	 * Returns the value of the '<em><b>E</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>E</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>E</em>' reference.
	 * @see chessdiagram.ChessdiagramPackage#getSquare_E()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="org.eclipse.viatra.query.querybasedfeature patternFQN='chess.queries.E'"
	 * @generated
	 */
	Square getE();

} // Square
