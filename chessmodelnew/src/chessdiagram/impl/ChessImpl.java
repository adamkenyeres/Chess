/**
 */
package chessdiagram.impl;

import chessdiagram.Chess;
import chessdiagram.ChessdiagramPackage;
import chessdiagram.Player;

import chessdiagram.Square;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chess</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link chessdiagram.impl.ChessImpl#getWhitePlayer <em>White Player</em>}</li>
 *   <li>{@link chessdiagram.impl.ChessImpl#getBlackPlayer <em>Black Player</em>}</li>
 *   <li>{@link chessdiagram.impl.ChessImpl#getSquare <em>Square</em>}</li>
 *   <li>{@link chessdiagram.impl.ChessImpl#isWhitePlayerTurn <em>White Player Turn</em>}</li>
 *   <li>{@link chessdiagram.impl.ChessImpl#getNumberOfSteps <em>Number Of Steps</em>}</li>
 *   <li>{@link chessdiagram.impl.ChessImpl#getStepsBeforeExlpoaring <em>Steps Before Exlpoaring</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChessImpl extends MinimalEObjectImpl.Container implements Chess {
	/**
	 * The cached value of the '{@link #getWhitePlayer() <em>White Player</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhitePlayer()
	 * @generated
	 * @ordered
	 */
	protected Player whitePlayer;

	/**
	 * The cached value of the '{@link #getBlackPlayer() <em>Black Player</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlackPlayer()
	 * @generated
	 * @ordered
	 */
	protected Player blackPlayer;

	/**
	 * The cached value of the '{@link #getSquare() <em>Square</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSquare()
	 * @generated
	 * @ordered
	 */
	protected EList<Square> square;

	/**
	 * The default value of the '{@link #isWhitePlayerTurn() <em>White Player Turn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWhitePlayerTurn()
	 * @generated
	 * @ordered
	 */
	protected static final boolean WHITE_PLAYER_TURN_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isWhitePlayerTurn() <em>White Player Turn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWhitePlayerTurn()
	 * @generated
	 * @ordered
	 */
	protected boolean whitePlayerTurn = WHITE_PLAYER_TURN_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfSteps() <em>Number Of Steps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfSteps()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_STEPS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberOfSteps() <em>Number Of Steps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfSteps()
	 * @generated
	 * @ordered
	 */
	protected int numberOfSteps = NUMBER_OF_STEPS_EDEFAULT;

	/**
	 * The default value of the '{@link #getStepsBeforeExlpoaring() <em>Steps Before Exlpoaring</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepsBeforeExlpoaring()
	 * @generated
	 * @ordered
	 */
	protected static final int STEPS_BEFORE_EXLPOARING_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStepsBeforeExlpoaring() <em>Steps Before Exlpoaring</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepsBeforeExlpoaring()
	 * @generated
	 * @ordered
	 */
	protected int stepsBeforeExlpoaring = STEPS_BEFORE_EXLPOARING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChessdiagramPackage.Literals.CHESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Player getWhitePlayer() {
		return whitePlayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhitePlayer(Player newWhitePlayer, NotificationChain msgs) {
		Player oldWhitePlayer = whitePlayer;
		whitePlayer = newWhitePlayer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ChessdiagramPackage.CHESS__WHITE_PLAYER, oldWhitePlayer, newWhitePlayer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhitePlayer(Player newWhitePlayer) {
		if (newWhitePlayer != whitePlayer) {
			NotificationChain msgs = null;
			if (whitePlayer != null)
				msgs = ((InternalEObject)whitePlayer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ChessdiagramPackage.CHESS__WHITE_PLAYER, null, msgs);
			if (newWhitePlayer != null)
				msgs = ((InternalEObject)newWhitePlayer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ChessdiagramPackage.CHESS__WHITE_PLAYER, null, msgs);
			msgs = basicSetWhitePlayer(newWhitePlayer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChessdiagramPackage.CHESS__WHITE_PLAYER, newWhitePlayer, newWhitePlayer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Player getBlackPlayer() {
		return blackPlayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBlackPlayer(Player newBlackPlayer, NotificationChain msgs) {
		Player oldBlackPlayer = blackPlayer;
		blackPlayer = newBlackPlayer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ChessdiagramPackage.CHESS__BLACK_PLAYER, oldBlackPlayer, newBlackPlayer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlackPlayer(Player newBlackPlayer) {
		if (newBlackPlayer != blackPlayer) {
			NotificationChain msgs = null;
			if (blackPlayer != null)
				msgs = ((InternalEObject)blackPlayer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ChessdiagramPackage.CHESS__BLACK_PLAYER, null, msgs);
			if (newBlackPlayer != null)
				msgs = ((InternalEObject)newBlackPlayer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ChessdiagramPackage.CHESS__BLACK_PLAYER, null, msgs);
			msgs = basicSetBlackPlayer(newBlackPlayer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChessdiagramPackage.CHESS__BLACK_PLAYER, newBlackPlayer, newBlackPlayer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Square> getSquare() {
		if (square == null) {
			square = new EObjectContainmentEList<Square>(Square.class, this, ChessdiagramPackage.CHESS__SQUARE);
		}
		return square;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isWhitePlayerTurn() {
		return whitePlayerTurn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhitePlayerTurn(boolean newWhitePlayerTurn) {
		boolean oldWhitePlayerTurn = whitePlayerTurn;
		whitePlayerTurn = newWhitePlayerTurn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChessdiagramPackage.CHESS__WHITE_PLAYER_TURN, oldWhitePlayerTurn, whitePlayerTurn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberOfSteps() {
		return numberOfSteps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfSteps(int newNumberOfSteps) {
		int oldNumberOfSteps = numberOfSteps;
		numberOfSteps = newNumberOfSteps;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChessdiagramPackage.CHESS__NUMBER_OF_STEPS, oldNumberOfSteps, numberOfSteps));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getStepsBeforeExlpoaring() {
		return stepsBeforeExlpoaring;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStepsBeforeExlpoaring(int newStepsBeforeExlpoaring) {
		int oldStepsBeforeExlpoaring = stepsBeforeExlpoaring;
		stepsBeforeExlpoaring = newStepsBeforeExlpoaring;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChessdiagramPackage.CHESS__STEPS_BEFORE_EXLPOARING, oldStepsBeforeExlpoaring, stepsBeforeExlpoaring));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ChessdiagramPackage.CHESS__WHITE_PLAYER:
				return basicSetWhitePlayer(null, msgs);
			case ChessdiagramPackage.CHESS__BLACK_PLAYER:
				return basicSetBlackPlayer(null, msgs);
			case ChessdiagramPackage.CHESS__SQUARE:
				return ((InternalEList<?>)getSquare()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ChessdiagramPackage.CHESS__WHITE_PLAYER:
				return getWhitePlayer();
			case ChessdiagramPackage.CHESS__BLACK_PLAYER:
				return getBlackPlayer();
			case ChessdiagramPackage.CHESS__SQUARE:
				return getSquare();
			case ChessdiagramPackage.CHESS__WHITE_PLAYER_TURN:
				return isWhitePlayerTurn();
			case ChessdiagramPackage.CHESS__NUMBER_OF_STEPS:
				return getNumberOfSteps();
			case ChessdiagramPackage.CHESS__STEPS_BEFORE_EXLPOARING:
				return getStepsBeforeExlpoaring();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ChessdiagramPackage.CHESS__WHITE_PLAYER:
				setWhitePlayer((Player)newValue);
				return;
			case ChessdiagramPackage.CHESS__BLACK_PLAYER:
				setBlackPlayer((Player)newValue);
				return;
			case ChessdiagramPackage.CHESS__SQUARE:
				getSquare().clear();
				getSquare().addAll((Collection<? extends Square>)newValue);
				return;
			case ChessdiagramPackage.CHESS__WHITE_PLAYER_TURN:
				setWhitePlayerTurn((Boolean)newValue);
				return;
			case ChessdiagramPackage.CHESS__NUMBER_OF_STEPS:
				setNumberOfSteps((Integer)newValue);
				return;
			case ChessdiagramPackage.CHESS__STEPS_BEFORE_EXLPOARING:
				setStepsBeforeExlpoaring((Integer)newValue);
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
			case ChessdiagramPackage.CHESS__WHITE_PLAYER:
				setWhitePlayer((Player)null);
				return;
			case ChessdiagramPackage.CHESS__BLACK_PLAYER:
				setBlackPlayer((Player)null);
				return;
			case ChessdiagramPackage.CHESS__SQUARE:
				getSquare().clear();
				return;
			case ChessdiagramPackage.CHESS__WHITE_PLAYER_TURN:
				setWhitePlayerTurn(WHITE_PLAYER_TURN_EDEFAULT);
				return;
			case ChessdiagramPackage.CHESS__NUMBER_OF_STEPS:
				setNumberOfSteps(NUMBER_OF_STEPS_EDEFAULT);
				return;
			case ChessdiagramPackage.CHESS__STEPS_BEFORE_EXLPOARING:
				setStepsBeforeExlpoaring(STEPS_BEFORE_EXLPOARING_EDEFAULT);
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
			case ChessdiagramPackage.CHESS__WHITE_PLAYER:
				return whitePlayer != null;
			case ChessdiagramPackage.CHESS__BLACK_PLAYER:
				return blackPlayer != null;
			case ChessdiagramPackage.CHESS__SQUARE:
				return square != null && !square.isEmpty();
			case ChessdiagramPackage.CHESS__WHITE_PLAYER_TURN:
				return whitePlayerTurn != WHITE_PLAYER_TURN_EDEFAULT;
			case ChessdiagramPackage.CHESS__NUMBER_OF_STEPS:
				return numberOfSteps != NUMBER_OF_STEPS_EDEFAULT;
			case ChessdiagramPackage.CHESS__STEPS_BEFORE_EXLPOARING:
				return stepsBeforeExlpoaring != STEPS_BEFORE_EXLPOARING_EDEFAULT;
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
		result.append(" (whitePlayerTurn: ");
		result.append(whitePlayerTurn);
		result.append(", numberOfSteps: ");
		result.append(numberOfSteps);
		result.append(", stepsBeforeExlpoaring: ");
		result.append(stepsBeforeExlpoaring);
		result.append(')');
		return result.toString();
	}

} //ChessImpl
