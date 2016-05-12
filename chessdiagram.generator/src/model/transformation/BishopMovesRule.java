package model.transformation;

import org.eclipse.viatra.dse.api.DSETransformationRule;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;

import chess.queries.BishopMovesMatch;
import chess.queries.BishopMovesMatcher;
import chess.queries.BlackBishopMovesMatch;
import chess.queries.BlackBishopMovesMatcher;
import chess.queries.util.BishopMovesProcessor;
import chess.queries.util.BishopMovesQuerySpecification;
import chess.queries.util.BlackBishopMovesProcessor;
import chess.queries.util.BlackBishopMovesQuerySpecification;
import chessdiagram.Bishop;
import chessdiagram.Chess;
import chessdiagram.Colour;
import chessdiagram.Square;
import chessdiagram.generator.Generator;

public class BishopMovesRule {

	public static DSETransformationRule<BishopMovesMatch, BishopMovesMatcher> getBishopMovesColourRule()
			throws ViatraQueryException {
		DSETransformationRule<BishopMovesMatch, BishopMovesMatcher> rule = new DSETransformationRule<BishopMovesMatch, BishopMovesMatcher>(
				BishopMovesQuerySpecification.instance(), new BishopMovesProcessor() {

					@Override
					public void process(Bishop pBishop, Square pSquare) {
						// TODO Auto-generated method stub
						pSquare.setColour(Colour.RED);
					}
				});
		return rule;
	}

	public static DSETransformationRule<BishopMovesMatch, BishopMovesMatcher> getBishopMovesRule(Chess chess)
			throws ViatraQueryException {
		DSETransformationRule<BishopMovesMatch, BishopMovesMatcher> rule = new DSETransformationRule<BishopMovesMatch, BishopMovesMatcher>(
				BishopMovesQuerySpecification.instance(), new BishopMovesProcessor() {

					@Override
					public void process(Bishop pBishop, Square pSquare) {
						// TODO Auto-generated method stub
						if (pSquare.getPiece() != null) {
							Generator.removePiece(chess, pSquare.getPiece());
						}
						pBishop.setPos(pSquare.getId());
						Generator.setEnpassantFalse(chess);

					}
				});
		return rule;
	}
	
	/* Black bishop moves */
	public static DSETransformationRule<BlackBishopMovesMatch, BlackBishopMovesMatcher> getBlackBishopMovesRule(Chess chess)
			throws ViatraQueryException {
		DSETransformationRule<BlackBishopMovesMatch, BlackBishopMovesMatcher> rule = new DSETransformationRule<BlackBishopMovesMatch, BlackBishopMovesMatcher>(
				BlackBishopMovesQuerySpecification.instance(), new BlackBishopMovesProcessor() {

					@Override
					public void process(Bishop pBishop, Square pSquare) {
						// TODO Auto-generated method stub
						if (pSquare.getPiece() != null) {
							Generator.removePiece(chess, pSquare.getPiece());
						}
						pBishop.setPos(pSquare.getId());
						Generator.setEnpassantFalse(chess);

					}
				});
		return rule;
	}
}
