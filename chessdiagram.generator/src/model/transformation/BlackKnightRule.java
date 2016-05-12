package model.transformation;

import org.eclipse.viatra.dse.api.DSETransformationRule;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;

import chess.queries.BlackKnightMovesMatch;
import chess.queries.BlackKnightMovesMatcher;
import chess.queries.util.BlackKnightMovesProcessor;
import chess.queries.util.BlackKnightMovesQuerySpecification;
import chessdiagram.Chess;
import chessdiagram.Colour;
import chessdiagram.Knight;
import chessdiagram.Square;
import chessdiagram.generator.Generator;

public class BlackKnightRule {
	public static DSETransformationRule<BlackKnightMovesMatch, BlackKnightMovesMatcher> getBlackKnightsColourRule()
			throws ViatraQueryException {
		DSETransformationRule<BlackKnightMovesMatch, BlackKnightMovesMatcher> rule = new DSETransformationRule<BlackKnightMovesMatch, BlackKnightMovesMatcher>(
				BlackKnightMovesQuerySpecification.instance(), new BlackKnightMovesProcessor() {

					@Override
					public void process(Knight pPiece, Square pSquare) {
						// TODO Auto-generated method stub
						pSquare.setColour(Colour.RED);
					}
				});
		return rule;
	}

	public static DSETransformationRule<BlackKnightMovesMatch, BlackKnightMovesMatcher> getBlackKnightMovesRule(
			Chess chess) throws ViatraQueryException {
		DSETransformationRule<BlackKnightMovesMatch, BlackKnightMovesMatcher> rule = new DSETransformationRule<BlackKnightMovesMatch, BlackKnightMovesMatcher>(
				BlackKnightMovesQuerySpecification.instance(), new BlackKnightMovesProcessor() {

					@Override
					public void process(Knight pPiece, Square pSquare) {
						// TODO Auto-generated method stub
						if (pSquare.getPiece() != null) {
							Generator.removePiece(chess, pSquare.getPiece());
						}
						pPiece.setPos(pSquare.getId());
						Generator.setEnpassantFalse(chess);
					}
				});
		return rule;
	}

}
