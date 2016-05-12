/**
 */
package chessdiagram.impl;

import chessdiagram.ChessdiagramPackage;
import chessdiagram.Colour;
import chessdiagram.Piece;

import chessdiagram.PieceType;
import chessdiagram.Square;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Piece</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link chessdiagram.impl.PieceImpl#getPos <em>Pos</em>}</li>
 *   <li>{@link chessdiagram.impl.PieceImpl#getSquare <em>Square</em>}</li>
 *   <li>{@link chessdiagram.impl.PieceImpl#getColour <em>Colour</em>}</li>
 *   <li>{@link chessdiagram.impl.PieceImpl#getPieceType <em>Piece Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PieceImpl extends MinimalEObjectImpl.Container implements Piece {
	/**
	 * The default value of the '{@link #getPos() <em>Pos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPos()
	 * @generated
	 * @ordered
	 */
	protected static final int POS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPos() <em>Pos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPos()
	 * @generated
	 * @ordered
	 */
	protected int pos = POS_EDEFAULT;

	/**
	 * The cached setting delegate for the '{@link #getSquare() <em>Square</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSquare()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate SQUARE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)ChessdiagramPackage.Literals.PIECE__SQUARE).getSettingDelegate();

	/**
	 * The default value of the '{@link #getColour() <em>Colour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColour()
	 * @generated
	 * @ordered
	 */
	protected static final Colour COLOUR_EDEFAULT = Colour.WHITE;

	/**
	 * The cached value of the '{@link #getColour() <em>Colour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColour()
	 * @generated
	 * @ordered
	 */
	protected Colour colour = COLOUR_EDEFAULT;

	/**
	 * The default value of the '{@link #getPieceType() <em>Piece Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPieceType()
	 * @generated
	 * @ordered
	 */
	protected static final PieceType PIECE_TYPE_EDEFAULT = PieceType.PAWN;

	/**
	 * The cached value of the '{@link #getPieceType() <em>Piece Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPieceType()
	 * @generated
	 * @ordered
	 */
	protected PieceType pieceType = PIECE_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PieceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChessdiagramPackage.Literals.PIECE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Colour getColour() {
		return colour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColour(Colour newColour) {
		Colour oldColour = colour;
		colour = newColour == null ? COLOUR_EDEFAULT : newColour;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChessdiagramPackage.PIECE__COLOUR, oldColour, colour));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PieceType getPieceType() {
		return pieceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPieceType(PieceType newPieceType) {
		PieceType oldPieceType = pieceType;
		pieceType = newPieceType == null ? PIECE_TYPE_EDEFAULT : newPieceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChessdiagramPackage.PIECE__PIECE_TYPE, oldPieceType, pieceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPos() {
		return pos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPos(int newPos) {
		int oldPos = pos;
		pos = newPos;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChessdiagramPackage.PIECE__POS, oldPos, pos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Square getSquare() {
		return (Square)SQUARE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Square basicGetSquare() {
		return (Square)SQUARE__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ChessdiagramPackage.PIECE__POS:
				return getPos();
			case ChessdiagramPackage.PIECE__SQUARE:
				if (resolve) return getSquare();
				return basicGetSquare();
			case ChessdiagramPackage.PIECE__COLOUR:
				return getColour();
			case ChessdiagramPackage.PIECE__PIECE_TYPE:
				return getPieceType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ChessdiagramPackage.PIECE__POS:
				setPos((Integer)newValue);
				return;
			case ChessdiagramPackage.PIECE__COLOUR:
				setColour((Colour)newValue);
				return;
			case ChessdiagramPackage.PIECE__PIECE_TYPE:
				setPieceType((PieceType)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ChessdiagramPackage.PIECE__POS:
				setPos(POS_EDEFAULT);
				return;
			case ChessdiagramPackage.PIECE__COLOUR:
				setColour(COLOUR_EDEFAULT);
				return;
			case ChessdiagramPackage.PIECE__PIECE_TYPE:
				setPieceType(PIECE_TYPE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ChessdiagramPackage.PIECE__POS:
				return pos != POS_EDEFAULT;
			case ChessdiagramPackage.PIECE__SQUARE:
				return SQUARE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case ChessdiagramPackage.PIECE__COLOUR:
				return colour != COLOUR_EDEFAULT;
			case ChessdiagramPackage.PIECE__PIECE_TYPE:
				return pieceType != PIECE_TYPE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (pos: ");
		result.append(pos);
		result.append(", colour: ");
		result.append(colour);
		result.append(", pieceType: ");
		result.append(pieceType);
		result.append(')');
		return result.toString();
	}

} //PieceImpl
