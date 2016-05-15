package model.transformation;

import org.eclipse.viatra.dse.api.DSETransformationRule;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;

import chess.queries.BlackQueenMovesMatch;
import chess.queries.BlackQueenMovesMatcher;
import chess.queries.QueenMovesMatch;
import chess.queries.QueenMovesMatcher;
import chess.queries.WhiteQueenMovesMatch;
import chess.queries.WhiteQueenMovesMatcher;
import chess.queries.util.BlackQueenMovesProcessor;
import chess.queries.util.BlackQueenMovesQuerySpecification;
import chess.queries.util.QueenMovesProcessor;
import chess.queries.util.QueenMovesQuerySpecification;
import chess.queries.util.WhiteQueenMovesProcessor;
import chess.queries.util.WhiteQueenMovesQuerySpecification;
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
					public void process(Queen pQueen, Square pSquare, Chess pChess) {
						// TODO Auto-generated method stub
						pSquare.setColour(Colour.RED);
					}
				});
		return rule;
	}

	public static DSETransformationRule<QueenMovesMatch, QueenMovesMatcher> getQueenMovesRule()
			throws ViatraQueryException {
		DSETransformationRule<QueenMovesMatch, QueenMovesMatcher> rule = new DSETransformationRule<QueenMovesMatch, QueenMovesMatcher>(
				QueenMovesQuerySpecification.instance(), new QueenMovesProcessor() {

					@Override
					public void process(Queen pQueen, Square pSquare, Chess pChess) {
						// TODO Auto-generated method stub
						if (pSquare.getPiece() != null) {
							Generator.removePiece(pChess, pSquare.getPiece());
						}
						pQueen.setPos(pSquare.getId());
						Generator.setEnpassantFalse(pChess);
						pChess.setWhitePlayerTurn(!pChess.isWhitePlayerTurn());
						//This is only temporally
						pChess.setNumberOfSteps(pChess.getNumberOfSteps()+1);
					}
				});
		return rule;
	}
	
	public static DSETransformationRule<?, ?> getBlackQueenMovesRule()
			throws ViatraQueryException {
		DSETransformationRule<BlackQueenMovesMatch, BlackQueenMovesMatcher> rule = new DSETransformationRule<BlackQueenMovesMatch, BlackQueenMovesMatcher>(
				BlackQueenMovesQuerySpecification.instance(), new BlackQueenMovesProcessor() {

					@Override
					public void process(Queen pQueen, Square pSquare, Chess pChess) {
						// TODO Auto-generated method stub
						if (pSquare.getPiece() != null) {
							Generator.removePiece(pChess, pSquare.getPiece());
						}
						pQueen.setPos(pSquare.getId());
						Generator.setEnpassantFalse(pChess);
						pChess.setWhitePlayerTurn(!pChess.isWhitePlayerTurn());
						//This is only temporally
						pChess.setNumberOfSteps(pChess.getNumberOfSteps()+1);
					}
				});
		return rule;
	}
	
	public static DSETransformationRule<?, ?> getWhiteQueenMovesRule()
			throws ViatraQueryException {
		DSETransformationRule<WhiteQueenMovesMatch, WhiteQueenMovesMatcher> rule = new DSETransformationRule<WhiteQueenMovesMatch, WhiteQueenMovesMatcher>(
				WhiteQueenMovesQuerySpecification.instance(), new WhiteQueenMovesProcessor() {

					@Override
					public void process(Queen pQueen, Square pSquare, Chess pChess) {
						// TODO Auto-generated method stub
						if (pSquare.getPiece() != null) {
							Generator.removePiece(pChess, pSquare.getPiece());
						}
						pQueen.setPos(pSquare.getId());
						Generator.setEnpassantFalse(pChess);
						pChess.setWhitePlayerTurn(!pChess.isWhitePlayerTurn());
						//This is only temporally
						pChess.setNumberOfSteps(pChess.getNumberOfSteps()+1);
					}
				});
		return rule;
	}
}
