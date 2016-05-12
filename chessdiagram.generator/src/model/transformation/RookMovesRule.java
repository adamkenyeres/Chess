package model.transformation;

import org.eclipse.viatra.dse.api.DSETransformationRule;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;

import chess.queries.RookMovesMatch;
import chess.queries.RookMovesMatcher;
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
					public void process(Rook pRook, Square pSquare) {
						// TODO Auto-generated method stub
						pSquare.setColour(Colour.RED);
					}

				});
		return rule;
	}

	public static DSETransformationRule<RookMovesMatch, RookMovesMatcher> getRookMovesRule(Chess chess)
			throws ViatraQueryException {
		DSETransformationRule<RookMovesMatch, RookMovesMatcher> rule = new DSETransformationRule<RookMovesMatch, RookMovesMatcher>(
				RookMovesQuerySpecification.instance(), new RookMovesProcessor() {

					@Override
					public void process(Rook pRook, Square pSquare) {
						// TODO Auto-generated method stub
						if(pSquare.getPiece() != null) {
							Generator.removePiece(chess,pSquare.getPiece());
						}
						pRook.setPos(pSquare.getId());  
						if (pRook.isFirstMove())
							pRook.setFirstMove(false);
						Generator.setEnpassantFalse(chess);
					}

				});
		return rule;
	}
}
