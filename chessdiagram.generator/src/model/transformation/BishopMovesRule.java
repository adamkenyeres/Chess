package model.transformation;

import org.eclipse.viatra.dse.api.DSETransformationRule;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;

import chess.queries.BishopMovesMatch;
import chess.queries.BishopMovesMatcher;
import chess.queries.BlackBishopMovesMatch;
import chess.queries.BlackBishopMovesMatcher;
import chess.queries.WhiteBishopMovesMatch;
import chess.queries.WhiteBishopMovesMatcher;
import chess.queries.util.BishopMovesProcessor;
import chess.queries.util.BishopMovesQuerySpecification;
import chess.queries.util.BlackBishopMovesProcessor;
import chess.queries.util.BlackBishopMovesQuerySpecification;
import chess.queries.util.WhiteBishopMovesProcessor;
import chess.queries.util.WhiteBishopMovesQuerySpecification;
import chessdiagram.Bishop;
import chessdiagram.Chess;
import chessdiagram.Colour;
import chessdiagram.Square;
import chessdiagram.generator.Generator;

public class BishopMovesRule {
	
	public static void bishopMoves(Bishop pPiece, Square pSquare, Chess pChess) {
		if (pSquare.getPiece() != null) {
			Generator.removePiece(pChess, pSquare.getPiece());
		}
		pPiece.setPos(pSquare.getId());
		Generator.setEnpassantFalse(pChess);
		pChess.setWhitePlayerTurn(!pChess.isWhitePlayerTurn());
		// This is only temporally
		pChess.setNumberOfSteps(pChess.getNumberOfSteps() + 1);
	}

	public static DSETransformationRule<BishopMovesMatch, BishopMovesMatcher> getBishopMovesColourRule()
			throws ViatraQueryException {
		DSETransformationRule<BishopMovesMatch, BishopMovesMatcher> rule = new DSETransformationRule<BishopMovesMatch, BishopMovesMatcher>(
				BishopMovesQuerySpecification.instance(), new BishopMovesProcessor() {

					@Override
					public void process(Bishop pPiece, Square pSquare, Chess pChess) {
						// TODO Auto-generated method stub
						pSquare.setColour(Colour.RED);
					}
				});
		return rule;
	}

	public static DSETransformationRule<BishopMovesMatch, BishopMovesMatcher> getBishopMovesRule()
			throws ViatraQueryException {
		DSETransformationRule<BishopMovesMatch, BishopMovesMatcher> rule = new DSETransformationRule<BishopMovesMatch, BishopMovesMatcher>(
				BishopMovesQuerySpecification.instance(), new BishopMovesProcessor() {

					@Override
					public void process(Bishop pPiece, Square pSquare, Chess pChess) {
						// TODO Auto-generated method stub
						bishopMoves(pPiece, pSquare, pChess);
					}
				});
		return rule;
	}

	/* Black bishop moves */
	public static DSETransformationRule<BlackBishopMovesMatch, BlackBishopMovesMatcher> getBlackBishopMovesRule()
			throws ViatraQueryException {
		DSETransformationRule<BlackBishopMovesMatch, BlackBishopMovesMatcher> rule = new DSETransformationRule<BlackBishopMovesMatch, BlackBishopMovesMatcher>(
				BlackBishopMovesQuerySpecification.instance(), new BlackBishopMovesProcessor() {

					@Override
					public void process(Bishop pPiece, Square pSquare, Chess pChess) {
						// TODO Auto-generated method stub
						bishopMoves(pPiece, pSquare, pChess);
					}
				});
		return rule;
	}

	public static DSETransformationRule<?, ?> getWhiteBishopMovesRule() throws ViatraQueryException {
		DSETransformationRule<?, ?> rule = new DSETransformationRule<WhiteBishopMovesMatch, WhiteBishopMovesMatcher>(
				WhiteBishopMovesQuerySpecification.instance(), new WhiteBishopMovesProcessor() {

					@Override
					public void process(Bishop pPiece, Square pSquare, Chess pChess) {
						// TODO Auto-generated method stub
						bishopMoves(pPiece, pSquare, pChess);
					}
				});
		return rule;
	}
}
