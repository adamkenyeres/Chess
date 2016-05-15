package model.transformation;

import org.eclipse.viatra.dse.api.DSETransformationRule;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;

import chess.queries.WhitePawnMovesMatch;
import chess.queries.WhitePawnMovesMatcher;
import chess.queries.util.WhitePawnMovesProcessor;
import chess.queries.util.WhitePawnMovesQuerySpecification;
import chessdiagram.Chess;
import chessdiagram.ChessdiagramFactory;
import chessdiagram.Colour;
import chessdiagram.Pawn;
import chessdiagram.PieceType;
import chessdiagram.Queen;
import chessdiagram.Square;
import chessdiagram.generator.Generator;

public class WhitePawnMovesRule {

	public static DSETransformationRule<WhitePawnMovesMatch, WhitePawnMovesMatcher> getWhitePawnMovesColourRule(
			Chess chess) throws ViatraQueryException {
		DSETransformationRule<WhitePawnMovesMatch, WhitePawnMovesMatcher> rule = new DSETransformationRule<WhitePawnMovesMatch, WhitePawnMovesMatcher>(
				WhitePawnMovesQuerySpecification.instance(), new WhitePawnMovesProcessor() {

					@Override
					public void process(Pawn pPiece, Square pSquare, Chess pChess) {
						// TODO Auto-generated method stub
						pSquare.setColour(Colour.RED);
					}

				});
		return rule;
	}

	public static DSETransformationRule<WhitePawnMovesMatch, WhitePawnMovesMatcher> getWhitePawnMovesRule()
			throws ViatraQueryException {

		DSETransformationRule<WhitePawnMovesMatch, WhitePawnMovesMatcher> rule = new DSETransformationRule<WhitePawnMovesMatch, WhitePawnMovesMatcher>(
				WhitePawnMovesQuerySpecification.instance(), new WhitePawnMovesProcessor() {

					@Override
					public void process(Pawn pPiece, Square pSquare, Chess pChess) {
						// TODO Auto-generated method stub
						// If we are hitting a piece
						if (pSquare.getPiece() != null) {
							Generator.removePiece(pChess, pSquare.getPiece());
						}

						// //Checking if we want to hit a pawn with enpassant
						if (pPiece.getSquare().getNE() == pSquare || pPiece.getSquare().getNW() == pSquare) {
							Pawn attackingPawn = (Pawn) pSquare.getS().getPiece();
							if (attackingPawn != null && attackingPawn.getPieceType() == PieceType.PAWN
									&& attackingPawn.isEnPassantEnabled())
								Generator.removePiece(pChess, pSquare.getS().getPiece());
						}
						// We moved so all enpassants are false
						Generator.setEnpassantFalse(pChess);
						// if we moved 2 en passant is true
						if (Math.abs(pPiece.getPos() / 8 - pSquare.getId() / 8) == 2) {

							pPiece.setEnPassantEnabled(true);
						}
						pPiece.setPos(pSquare.getId());
						if (pPiece.isFirstMove())
							pPiece.setFirstMove(false);

						if (pPiece.getPos() / 8 == 0) {
							ChessdiagramFactory factory = ChessdiagramFactory.eINSTANCE;
							Queen q = factory.createQueen();
							q.setPos(pPiece.getPos());
							q.setColour(Colour.WHITE);
							q.setPieceType(PieceType.QUEEN);
							pChess.getWhitePlayer().getPiece().remove(pPiece);
							pChess.getWhitePlayer().getPiece().add(q);

						}
						pChess.setWhitePlayerTurn(!pChess.isWhitePlayerTurn());
						// This is only temporally
						pChess.setNumberOfSteps(pChess.getNumberOfSteps() + 1);
					}

				});
		return rule;
	}
}
