package model.transformation;

import org.eclipse.viatra.dse.api.DSETransformationRule;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;

import chess.queries.WhiteKnightMovesMatch;
import chess.queries.WhiteKnightMovesMatcher;
import chess.queries.util.WhiteKnightMovesProcessor;
import chess.queries.util.WhiteKnightMovesQuerySpecification;
import chessdiagram.Chess;
import chessdiagram.Colour;
import chessdiagram.Knight;
import chessdiagram.Square;
import chessdiagram.generator.Generator;

public class WhiteKnightRule {
	public static DSETransformationRule<WhiteKnightMovesMatch, WhiteKnightMovesMatcher> getWhiteKnightsColourRule()
			throws ViatraQueryException {
		DSETransformationRule<WhiteKnightMovesMatch, WhiteKnightMovesMatcher> rule = new DSETransformationRule<WhiteKnightMovesMatch, WhiteKnightMovesMatcher>(
				WhiteKnightMovesQuerySpecification.instance(), new WhiteKnightMovesProcessor() {

					@Override
					public void process(Knight pPiece, Square pSquare) {
						// TODO Auto-generated method stub
						pSquare.setColour(Colour.RED);
					}

				});
		return rule;
	}

	public static DSETransformationRule<WhiteKnightMovesMatch, WhiteKnightMovesMatcher> getWhiteKnightMovesRule(
			Chess chess) throws ViatraQueryException {
		DSETransformationRule<WhiteKnightMovesMatch, WhiteKnightMovesMatcher> rule = new DSETransformationRule<WhiteKnightMovesMatch, WhiteKnightMovesMatcher>(
				WhiteKnightMovesQuerySpecification.instance(), new WhiteKnightMovesProcessor() {

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
