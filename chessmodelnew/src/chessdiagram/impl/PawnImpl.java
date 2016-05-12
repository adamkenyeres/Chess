/**
 */
package chessdiagram.impl;

import chessdiagram.ChessdiagramPackage;
import chessdiagram.Pawn;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pawn</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link chessdiagram.impl.PawnImpl#isFirstMove <em>First Move</em>}</li>
 *   <li>{@link chessdiagram.impl.PawnImpl#isEnPassantEnabled <em>En Passant Enabled</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PawnImpl extends PieceImpl implements Pawn {
	/**
	 * The default value of the '{@link #isFirstMove() <em>First Move</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFirstMove()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FIRST_MOVE_EDEFAULT = true;
	/**
	 * The cached value of the '{@link #isFirstMove() <em>First Move</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFirstMove()
	 * @generated
	 * @ordered
	 */
	protected boolean firstMove = FIRST_MOVE_EDEFAULT;

	/**
	 * The default value of the '{@link #isEnPassantEnabled() <em>En Passant Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnPassantEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EN_PASSANT_ENABLED_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isEnPassantEnabled() <em>En Passant Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnPassantEnabled()
	 * @generated
	 * @ordered
	 */
	protected boolean enPassantEnabled = EN_PASSANT_ENABLED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PawnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChessdiagramPackage.Literals.PAWN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFirstMove() {
		return firstMove;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstMove(boolean newFirstMove) {
		boolean oldFirstMove = firstMove;
		firstMove = newFirstMove;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChessdiagramPackage.PAWN__FIRST_MOVE, oldFirstMove, firstMove));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEnPassantEnabled() {
		return enPassantEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnPassantEnabled(boolean newEnPassantEnabled) {
		boolean oldEnPassantEnabled = enPassantEnabled;
		enPassantEnabled = newEnPassantEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChessdiagramPackage.PAWN__EN_PASSANT_ENABLED, oldEnPassantEnabled, enPassantEnabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ChessdiagramPackage.PAWN__FIRST_MOVE:
				return isFirstMove();
			case ChessdiagramPackage.PAWN__EN_PASSANT_ENABLED:
				return isEnPassantEnabled();
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
			case ChessdiagramPackage.PAWN__FIRST_MOVE:
				setFirstMove((Boolean)newValue);
				return;
			case ChessdiagramPackage.PAWN__EN_PASSANT_ENABLED:
				setEnPassantEnabled((Boolean)newValue);
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
			case ChessdiagramPackage.PAWN__FIRST_MOVE:
				setFirstMove(FIRST_MOVE_EDEFAULT);
				return;
			case ChessdiagramPackage.PAWN__EN_PASSANT_ENABLED:
				setEnPassantEnabled(EN_PASSANT_ENABLED_EDEFAULT);
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
			case ChessdiagramPackage.PAWN__FIRST_MOVE:
				return firstMove != FIRST_MOVE_EDEFAULT;
			case ChessdiagramPackage.PAWN__EN_PASSANT_ENABLED:
				return enPassantEnabled != EN_PASSANT_ENABLED_EDEFAULT;
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
		result.append(" (firstMove: ");
		result.append(firstMove);
		result.append(", enPassantEnabled: ");
		result.append(enPassantEnabled);
		result.append(')');
		return result.toString();
	}

} //PawnImpl
