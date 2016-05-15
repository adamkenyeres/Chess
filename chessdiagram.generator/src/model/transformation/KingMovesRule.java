package model.transformation;

import org.eclipse.viatra.dse.api.DSETransformationRule;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;

import chess.queries.BlackKingMovesMatch;
import chess.queries.BlackKingMovesMatcher;
import chess.queries.KingMovesMatch;
import chess.queries.KingMovesMatcher;
import chess.queries.WhiteKingMovesMatch;
import chess.queries.WhiteKingMovesMatcher;
import chess.queries.util.BlackKingMovesProcessor;
import chess.queries.util.BlackKingMovesQuerySpecification;
import chess.queries.util.KingMovesProcessor;
import chess.queries.util.KingMovesQuerySpecification;
import chess.queries.util.WhiteKingMovesProcessor;
import chess.queries.util.WhiteKingMovesQuerySpecification;
import chessdiagram.Chess;
import chessdiagram.Colour;
import chessdiagram.King;
import chessdiagram.Rook;
import chessdiagram.Square;
import chessdiagram.generator.Generator;

public class KingMovesRule {
	public static DSETransformationRule<KingMovesMatch, KingMovesMatcher> getKingMovesColourRule()
			throws ViatraQueryException {
		DSETransformationRule<KingMovesMatch, KingMovesMatcher> rule = new DSETransformationRule<KingMovesMatch, KingMovesMatcher>(
				KingMovesQuerySpecification.instance(), new KingMovesProcessor() {

					@Override
					public void process(King pKing, Square pSquare, Chess pChess) {
						// TODO Auto-generated method stub
						pSquare.setColour(Colour.RED);
					}
				});
		return rule;
	}

	public static DSETransformationRule<KingMovesMatch, KingMovesMatcher> getKingMovesRule()
			throws ViatraQueryException {
		DSETransformationRule<KingMovesMatch, KingMovesMatcher> rule = new DSETransformationRule<KingMovesMatch, KingMovesMatcher>(
				KingMovesQuerySpecification.instance(), new KingMovesProcessor() {

					@Override
					public void process(King pKing, Square pSquare, Chess pChess) {
						// TODO Auto-generated method stub
						if (pSquare.getPiece() != null) {
							/* Castling */
							if (pSquare.getPiece().getColour() == pKing.getColour()) {
								Rook rook = (Rook) pSquare.getPiece();
								if (rook.getPos() > pKing.getPos()) {
									rook.setPos(pKing.getSquare().getE().getId());
									pKing.setPos(rook.getSquare().getE().getId());
								} else {
									rook.setPos(pKing.getSquare().getW().getId());
									pKing.setPos(rook.getSquare().getW().getId());
								}

							} /* Hitting a piece */ else {
								Generator.removePiece(pChess, pSquare.getPiece());
								pKing.setPos(pSquare.getId());

							}
						} else {
							pKing.setPos(pSquare.getId());
						}
						if (pKing.isFirstMove())
							pKing.setFirstMove(false);
						Generator.setEnpassantFalse(pChess);
						pChess.setWhitePlayerTurn(!pChess.isWhitePlayerTurn());
						//This is only temporally
						pChess.setNumberOfSteps(pChess.getNumberOfSteps()+1);
					}
				});
		return rule;
	}
	
	public static DSETransformationRule<?, ?> getBlackKingMovesRule()
			throws ViatraQueryException {
		DSETransformationRule<BlackKingMovesMatch, BlackKingMovesMatcher> rule = new DSETransformationRule<BlackKingMovesMatch, BlackKingMovesMatcher>(
				BlackKingMovesQuerySpecification.instance(), new BlackKingMovesProcessor() {

					@Override
					public void process(King pKing, Square pSquare, Chess pChess) {
						// TODO Auto-generated method stub
						if (pSquare.getPiece() != null) {
							/* Castling */
							if (pSquare.getPiece().getColour() == pKing.getColour()) {
								Rook rook = (Rook) pSquare.getPiece();
								if (rook.getPos() > pKing.getPos()) {
									rook.setPos(pKing.getSquare().getE().getId());
									pKing.setPos(rook.getSquare().getE().getId());
								} else {
									rook.setPos(pKing.getSquare().getW().getId());
									pKing.setPos(rook.getSquare().getW().getId());
								}

							} /* Hitting a piece */ else {
								Generator.removePiece(pChess, pSquare.getPiece());
								pKing.setPos(pSquare.getId());

							}
						} else {
							pKing.setPos(pSquare.getId());
						}
						if (pKing.isFirstMove())
							pKing.setFirstMove(false);
						Generator.setEnpassantFalse(pChess);
						pChess.setWhitePlayerTurn(!pChess.isWhitePlayerTurn());
						//This is only temporally
						pChess.setNumberOfSteps(pChess.getNumberOfSteps()+1);
					}
				});
		return rule;
	}
	
	public static DSETransformationRule<?, ?> getWhiteKingMovesRule()
			throws ViatraQueryException {
		DSETransformationRule<?, ?> rule = new DSETransformationRule<WhiteKingMovesMatch, WhiteKingMovesMatcher>(
				WhiteKingMovesQuerySpecification.instance(), new WhiteKingMovesProcessor() {

					@Override
					public void process(King pKing, Square pSquare, Chess pChess) {
						// TODO Auto-generated method stub
						if (pSquare.getPiece() != null) {
							/* Castling */
							if (pSquare.getPiece().getColour() == pKing.getColour()) {
								Rook rook = (Rook) pSquare.getPiece();
								if (rook.getPos() > pKing.getPos()) {
									rook.setPos(pKing.getSquare().getE().getId());
									pKing.setPos(rook.getSquare().getE().getId());
								} else {
									rook.setPos(pKing.getSquare().getW().getId());
									pKing.setPos(rook.getSquare().getW().getId());
								}

							} /* Hitting a piece */ else {
								Generator.removePiece(pChess, pSquare.getPiece());
								pKing.setPos(pSquare.getId());

							}
						} else {
							pKing.setPos(pSquare.getId());
						}
						if (pKing.isFirstMove())
							pKing.setFirstMove(false);
						Generator.setEnpassantFalse(pChess);
						pChess.setWhitePlayerTurn(!pChess.isWhitePlayerTurn());
						//This is only temporally
						pChess.setNumberOfSteps(pChess.getNumberOfSteps()+1);
					}
				});
		return rule;
	}
}
