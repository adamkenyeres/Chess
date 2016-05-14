package model.transformation;

import org.eclipse.viatra.dse.api.DSETransformationRule;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;

import chess.queries.BlackRookMovesMatch;
import chess.queries.BlackRookMovesMatcher;
import chess.queries.RookMovesMatch;
import chess.queries.RookMovesMatcher;
import chess.queries.util.BlackRookMovesProcessor;
import chess.queries.util.BlackRookMovesQuerySpecification;
import chess.queries.util.RookMovesProcessor;
import chess.queries.util.RookMovesQuerySpecification;
import chessdiagram.Chess;
import chessdiagram.Colour;
import chessdiagram.Rook;
import chessdiagram.Square;
import chessdiagram.generator.Generator;

public class RookMovesRule {
	public static DSETransformationRule<RookMovesMatch, RookMovesMatcher> getRookMovesColourRule()
			throws ViatraQueryException {
		DSETransformationRule<RookMovesMatch, RookMovesMatcher> rule = new DSETransformationRule<RookMovesMatch, RookMovesMatcher>(
				RookMovesQuerySpecification.instance(), new RookMovesProcessor() {

					@Override
					public void process(Rook pRook, Square pSquare, Chess pChess) {
						// TODO Auto-generated method stub
						pSquare.setColour(Colour.RED);
					}

				});
		return rule;
	}

	public static DSETransformationRule<RookMovesMatch, RookMovesMatcher> getRookMovesRule()
			throws ViatraQueryException {
		DSETransformationRule<RookMovesMatch, RookMovesMatcher> rule = new DSETransformationRule<RookMovesMatch, RookMovesMatcher>(
				RookMovesQuerySpecification.instance(), new RookMovesProcessor() {

					@Override
					public void process(Rook pRook, Square pSquare, Chess pChess) {
						// TODO Auto-generated method stub
						if (pSquare.getPiece() != null) {
							Generator.removePiece(pChess, pSquare.getPiece());
						}
						pRook.setPos(pSquare.getId());
						if (pRook.isFirstMove())
							pRook.setFirstMove(false);
						Generator.setEnpassantFalse(pChess);
						pChess.setWhitePlayerTurn(!pChess.isWhitePlayerTurn());
					}

				});
		return rule;
	}
	
	public static DSETransformationRule<?, ?> getBlackRookMovesRule()
			throws ViatraQueryException {
		DSETransformationRule<BlackRookMovesMatch, BlackRookMovesMatcher> rule = new DSETransformationRule<BlackRookMovesMatch, BlackRookMovesMatcher>(
				BlackRookMovesQuerySpecification.instance(), new BlackRookMovesProcessor() {

					@Override
					public void process(Rook pRook, Square pSquare, Chess pChess) {
						// TODO Auto-generated method stub
						if (pSquare.getPiece() != null) {
							Generator.removePiece(pChess, pSquare.getPiece());
						}
						pRook.setPos(pSquare.getId());
						if (pRook.isFirstMove())
							pRook.setFirstMove(false);
						Generator.setEnpassantFalse(pChess);
						pChess.setWhitePlayerTurn(!pChess.isWhitePlayerTurn());
					}

				});
		return rule;
	}
}
