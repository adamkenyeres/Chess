/**
 */
package chessdiagram.impl;

import chessdiagram.ChessdiagramPackage;
import chessdiagram.Colour;
import chessdiagram.Piece;
import chessdiagram.Square;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Square</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link chessdiagram.impl.SquareImpl#getId <em>Id</em>}</li>
 *   <li>{@link chessdiagram.impl.SquareImpl#getPiece <em>Piece</em>}</li>
 *   <li>{@link chessdiagram.impl.SquareImpl#getColour <em>Colour</em>}</li>
 *   <li>{@link chessdiagram.impl.SquareImpl#getW <em>W</em>}</li>
 *   <li>{@link chessdiagram.impl.SquareImpl#getN <em>N</em>}</li>
 *   <li>{@link chessdiagram.impl.SquareImpl#getS <em>S</em>}</li>
 *   <li>{@link chessdiagram.impl.SquareImpl#getNW <em>NW</em>}</li>
 *   <li>{@link chessdiagram.impl.SquareImpl#getNE <em>NE</em>}</li>
 *   <li>{@link chessdiagram.impl.SquareImpl#getSE <em>SE</em>}</li>
 *   <li>{@link chessdiagram.impl.SquareImpl#getSW <em>SW</em>}</li>
 *   <li>{@link chessdiagram.impl.SquareImpl#getE <em>E</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SquareImpl extends MinimalEObjectImpl.Container implements Square {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The cached setting delegate for the '{@link #getPiece() <em>Piece</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPiece()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate PIECE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)ChessdiagramPackage.Literals.SQUARE__PIECE).getSettingDelegate();

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
	 * The cached setting delegate for the '{@link #getW() <em>W</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getW()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate W__ESETTING_DELEGATE = ((EStructuralFeature.Internal)ChessdiagramPackage.Literals.SQUARE__W).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getN() <em>N</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getN()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate N__ESETTING_DELEGATE = ((EStructuralFeature.Internal)ChessdiagramPackage.Literals.SQUARE__N).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getS() <em>S</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getS()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate S__ESETTING_DELEGATE = ((EStructuralFeature.Internal)ChessdiagramPackage.Literals.SQUARE__S).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getNW() <em>NW</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNW()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate NW__ESETTING_DELEGATE = ((EStructuralFeature.Internal)ChessdiagramPackage.Literals.SQUARE__NW).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getNE() <em>NE</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNE()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate NE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)ChessdiagramPackage.Literals.SQUARE__NE).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getSE() <em>SE</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSE()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate SE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)ChessdiagramPackage.Literals.SQUARE__SE).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getSW() <em>SW</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSW()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate SW__ESETTING_DELEGATE = ((EStructuralFeature.Internal)ChessdiagramPackage.Literals.SQUARE__SW).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getE() <em>E</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getE()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate E__ESETTING_DELEGATE = ((EStructuralFeature.Internal)ChessdiagramPackage.Literals.SQUARE__E).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SquareImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChessdiagramPackage.Literals.SQUARE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Piece getPiece() {
		return (Piece)PIECE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Piece basicGetPiece() {
		return (Piece)PIECE__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChessdiagramPackage.SQUARE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ChessdiagramPackage.SQUARE__COLOUR, oldColour, colour));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Square getW() {
		return (Square)W__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Square basicGetW() {
		return (Square)W__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Square getN() {
		return (Square)N__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Square basicGetN() {
		return (Square)N__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Square getS() {
		return (Square)S__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Square basicGetS() {
		return (Square)S__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Square getNW() {
		return (Square)NW__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Square basicGetNW() {
		return (Square)NW__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Square getNE() {
		return (Square)NE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Square basicGetNE() {
		return (Square)NE__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Square getSE() {
		return (Square)SE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Square basicGetSE() {
		return (Square)SE__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Square getSW() {
		return (Square)SW__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Square basicGetSW() {
		return (Square)SW__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Square getE() {
		return (Square)E__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Square basicGetE() {
		return (Square)E__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ChessdiagramPackage.SQUARE__ID:
				return getId();
			case ChessdiagramPackage.SQUARE__PIECE:
				if (resolve) return getPiece();
				return basicGetPiece();
			case ChessdiagramPackage.SQUARE__COLOUR:
				return getColour();
			case ChessdiagramPackage.SQUARE__W:
				if (resolve) return getW();
				return basicGetW();
			case ChessdiagramPackage.SQUARE__N:
				if (resolve) return getN();
				return basicGetN();
			case ChessdiagramPackage.SQUARE__S:
				if (resolve) return getS();
				return basicGetS();
			case ChessdiagramPackage.SQUARE__NW:
				if (resolve) return getNW();
				return basicGetNW();
			case ChessdiagramPackage.SQUARE__NE:
				if (resolve) return getNE();
				return basicGetNE();
			case ChessdiagramPackage.SQUARE__SE:
				if (resolve) return getSE();
				return basicGetSE();
			case ChessdiagramPackage.SQUARE__SW:
				if (resolve) return getSW();
				return basicGetSW();
			case ChessdiagramPackage.SQUARE__E:
				if (resolve) return getE();
				return basicGetE();
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
			case ChessdiagramPackage.SQUARE__ID:
				setId((Integer)newValue);
				return;
			case ChessdiagramPackage.SQUARE__COLOUR:
				setColour((Colour)newValue);
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
			case ChessdiagramPackage.SQUARE__ID:
				setId(ID_EDEFAULT);
				return;
			case ChessdiagramPackage.SQUARE__COLOUR:
				setColour(COLOUR_EDEFAULT);
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
			case ChessdiagramPackage.SQUARE__ID:
				return id != ID_EDEFAULT;
			case ChessdiagramPackage.SQUARE__PIECE:
				return PIECE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case ChessdiagramPackage.SQUARE__COLOUR:
				return colour != COLOUR_EDEFAULT;
			case ChessdiagramPackage.SQUARE__W:
				return W__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case ChessdiagramPackage.SQUARE__N:
				return N__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case ChessdiagramPackage.SQUARE__S:
				return S__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case ChessdiagramPackage.SQUARE__NW:
				return NW__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case ChessdiagramPackage.SQUARE__NE:
				return NE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case ChessdiagramPackage.SQUARE__SE:
				return SE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case ChessdiagramPackage.SQUARE__SW:
				return SW__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case ChessdiagramPackage.SQUARE__E:
				return E__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
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
		result.append(" (id: ");
		result.append(id);
		result.append(", colour: ");
		result.append(colour);
		result.append(')');
		return result.toString();
	}

} //SquareImpl
