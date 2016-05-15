package model.transformation;

import org.eclipse.viatra.dse.api.DSETransformationRule;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;

import chess.queries.BlackPawnMovesMatch;
import chess.queries.BlackPawnMovesMatcher;
import chess.queries.util.BlackPawnMovesProcessor;
import chess.queries.util.BlackPawnMovesQuerySpecification;
import chessdiagram.Chess;
import chessdiagram.ChessdiagramFactory;
import chessdiagram.Colour;
import chessdiagram.Pawn;
import chessdiagram.PieceType;
import chessdiagram.Queen;
import chessdiagram.Square;
import chessdiagram.generator.Generator;

public class BlackPawnMovesRule {
	public static DSETransformationRule<BlackPawnMovesMatch, BlackPawnMovesMatcher> getBlackPawnMovesColourRule()
			throws ViatraQueryException {
		DSETransformationRule<BlackPawnMovesMatch, BlackPawnMovesMatcher> rule = new DSETransformationRule<BlackPawnMovesMatch, BlackPawnMovesMatcher>(
				BlackPawnMovesQuerySpecification.instance(), new BlackPawnMovesProcessor() {

					@Override
					public void process(Pawn pPiece, Square pSquare, Chess pChess) {
						// TODO Auto-generated method stub
						pSquare.setColour(Colour.RED);
					}

				});
		return rule;
	}

	public static DSETransformationRule<BlackPawnMovesMatch, BlackPawnMovesMatcher> getBlackPawnMovesRule()
			throws ViatraQueryException {

		DSETransformationRule<BlackPawnMovesMatch, BlackPawnMovesMatcher> rule = new DSETransformationRule<BlackPawnMovesMatch, BlackPawnMovesMatcher>(
				BlackPawnMovesQuerySpecification.instance(), new BlackPawnMovesProcessor() {

					@Override
					public void process(Pawn pPiece, Square pSquare, Chess pChess) {
						// TODO Auto-generated method stub
						if (pSquare.getPiece() != null) {
							Generator.removePiece(pChess, pSquare.getPiece());
						}

						// If we moved 2 rows en passant is enabled
						if (pPiece.getSquare().getSE() == pSquare || pPiece.getSquare().getSW() == pSquare) {
							Pawn attackingPawn = (Pawn) pSquare.getN().getPiece();
							if (attackingPawn != null && attackingPawn.getPieceType() == PieceType.PAWN
									&& attackingPawn.isEnPassantEnabled())
								Generator.removePiece(pChess, pSquare.getN().getPiece());
						}
						Generator.setEnpassantFalse(pChess);
						if ((Math.abs(pPiece.getPos() / 8 - pSquare.getId() / 8) == 2)) {
							pPiece.setEnPassantEnabled(true);
						}
						pPiece.setPos(pSquare.getId());
						pPiece.setFirstMove(false);
						if (pPiece.getPos() / 8 == 7) {
							ChessdiagramFactory factory = ChessdiagramFactory.eINSTANCE;
							Queen q = factory.createQueen();
							q.setPos(pPiece.getPos());
							q.setColour(Colour.BLACK);
							q.setPieceType(PieceType.QUEEN);
							pChess.getBlackPlayer().getPiece().remove(pPiece);
							pChess.getBlackPlayer().getPiece().add(q);

						}
						pChess.setWhitePlayerTurn(!pChess.isWhitePlayerTurn());
						//This is only temporally
						pChess.setNumberOfSteps(pChess.getNumberOfSteps()+1);
					}

				});
		return rule;
	}

}
