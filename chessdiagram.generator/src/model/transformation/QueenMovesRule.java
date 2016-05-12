package model.transformation;

import org.eclipse.viatra.dse.api.DSETransformationRule;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;

import chess.queries.QueenMovesMatch;
import chess.queries.QueenMovesMatcher;
import chess.queries.util.QueenMovesProcessor;
import chess.queries.util.QueenMovesQuerySpecification;
import chessdiagram.Chess;
import chessdiagram.Colour;
import chessdiagram.Queen;
import chessdiagram.Square;
import chessdiagram.generator.Generator;

public class QueenMovesRule {

	public static DSETransformationRule<QueenMovesMatch, QueenMovesMatcher> getQueenMovesColourRule()
			throws ViatraQueryException {
		DSETransformationRule<QueenMovesMatch, QueenMovesMatcher> rule = new DSETransformationRule<QueenMovesMatch, QueenMovesMatcher>(
				QueenMovesQuerySpecification.instance(), new QueenMovesProcessor() {

					@Override
					public void process(Queen pQueen, Square pSquare) {
						// TODO Auto-generated method stub
						pSquare.setColour(Colour.RED);
					}
				});
		return rule;
	}

	public static DSETransformationRule<QueenMovesMatch, QueenMovesMatcher> getQueenMovesRule(Chess chess)
			throws ViatraQueryException {
		DSETransformationRule<QueenMovesMatch, QueenMovesMatcher> rule = new DSETransformationRule<QueenMovesMatch, QueenMovesMatcher>(
				QueenMovesQuerySpecification.instance(), new QueenMovesProcessor() {

					@Override
					public void process(Queen pQueen, Square pSquare) {
						// TODO Auto-generated method stub
						if (pSquare.getPiece() != null) {
							Generator.removePiece(chess, pSquare.getPiece());
						}
						pQueen.setPos(pSquare.getId());
						Generator.setEnpassantFalse(chess);
					}
				});
		return rule;
	}
}
