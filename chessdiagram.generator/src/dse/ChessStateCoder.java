package dse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.viatra.dse.api.DSEException;
import org.eclipse.viatra.dse.statecode.IStateCoder;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;

import chess.queries.BishopMovesMatch;
import chess.queries.BlackBishopMovesMatch;
import chess.queries.BlackKingMovesMatch;
import chess.queries.BlackKnightMovesMatch;
import chess.queries.BlackPawnMovesMatch;
import chess.queries.BlackQueenMovesMatch;
import chess.queries.BlackRookMovesMatch;
import chess.queries.InChessBlackMatch;
import chess.queries.InChessWhiteMatch;
import chess.queries.KingMovesMatch;
import chess.queries.QueenMovesMatch;
import chess.queries.RookMovesMatch;
import chess.queries.WhiteKnightMovesMatch;
import chess.queries.WhitePawnMovesMatch;
import chessdiagram.Chess;
import chessdiagram.King;
import chessdiagram.Pawn;
import chessdiagram.Piece;
import chessdiagram.Rook;

public class ChessStateCoder implements IStateCoder {
	Chess model;
	private ArrayList<Piece> sortedPieces;

	@Override
	public void init(Notifier notifier) {
		// TODO Auto-generated method stub
		model = (Chess) notifier;
		sortedPieces = new ArrayList<Piece>();
		sortedPieces.addAll(model.getBlackPlayer().getPiece());
		sortedPieces.addAll(model.getWhitePlayer().getPiece());
		Collections.sort(sortedPieces, new Comparator<Piece>() {

			@Override
			public int compare(Piece o1, Piece o2) {
				// TODO Auto-generated method stub

				return o1.getPos() - o2.getPos();
			}

		});
	}

	public static StringBuilder getPieceStateCode(Piece piece) {
		StringBuilder sb = new StringBuilder();
		sb.append(piece.getPieceType());
		sb.append(":");
		sb.append(piece.getColour());
		sb.append(",");
		sb.append(piece.getPos());

		switch (piece.getPieceType()) {
		case PAWN:
			Pawn pawn = (Pawn) piece;
			sb.append(",");
			sb.append(pawn.isEnPassantEnabled());
			sb.append(",");
			sb.append(pawn.isFirstMove());
			sb.append(";");
			break;
		case ROOK:
			Rook rook = (Rook) piece;
			sb.append(",");
			sb.append(rook.isFirstMove());
			sb.append(";");
			break;
		case KNIGHT:
			sb.append(";");
			break;
		case BISHOP:
			sb.append(";");
			break;
		case QUEEN:
			sb.append(";");
			break;
		case KING:
			King king = (King) piece;
			sb.append(",");
			sb.append(king.isFirstMove());
			sb.append(";");
			break;
		default:
			break;
		}
		return sb;
	}

	@Override
	public Object createStateCode() {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		for (Piece piece : sortedPieces) {
			sb.append(getPieceStateCode(piece));
		}
		return sb.toString();
	}

	@Override
	public Object createActivationCode(IPatternMatch match) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		String[] tokens = match.specification().getFullyQualifiedName().split("\\.");
		sb.append(tokens[tokens.length - 1]);
		if (match instanceof WhitePawnMovesMatch) {
			WhitePawnMovesMatch m = (WhitePawnMovesMatch) match;
			return (sb + ":{" + getPieceStateCode(m.getPiece()).toString() + "}").intern();

		} else if (match instanceof WhiteKnightMovesMatch) {
			WhiteKnightMovesMatch m = (WhiteKnightMovesMatch) match;
			return (sb + ":" + getPieceStateCode(m.getPiece()).toString()).intern();

		} else if (match instanceof BlackRookMovesMatch) {
			BlackRookMovesMatch m = (BlackRookMovesMatch) match;
			return (sb + ":" + getPieceStateCode(m.getRook()).toString()).intern();

		} else if (match instanceof BlackBishopMovesMatch) {
			BlackBishopMovesMatch m = (BlackBishopMovesMatch) match;
			return (sb + ":" + getPieceStateCode(m.getPiece()).toString()).intern();

		} else if (match instanceof BlackQueenMovesMatch) {
			BlackQueenMovesMatch m = (BlackQueenMovesMatch) match;
			return (sb + ":" + getPieceStateCode(m.getQueen()).toString()).intern();

		} else if (match instanceof BlackKingMovesMatch) {
			BlackKingMovesMatch m = (BlackKingMovesMatch) match;
			return (sb + ":" + getPieceStateCode(m.getKing()).toString()).intern();

		} else if (match instanceof BlackPawnMovesMatch) {
			BlackPawnMovesMatch m = (BlackPawnMovesMatch) match;
			return (sb + ":" + getPieceStateCode(m.getPiece()).toString()).intern();

		} else if (match instanceof BlackKnightMovesMatch) {
			BlackKnightMovesMatch m = (BlackKnightMovesMatch) match;
			return (sb + ":" + getPieceStateCode(m.getPiece()).toString()).intern();

		} else if (match instanceof RookMovesMatch) {
			RookMovesMatch m = (RookMovesMatch) match;
			return (sb + ":" + getPieceStateCode(m.getRook()).toString()).intern();

		} else if (match instanceof BishopMovesMatch) {
			BishopMovesMatch m = (BishopMovesMatch) match;
			return (sb + ":" + getPieceStateCode(m.getPiece()).toString()).intern();

		} else if (match instanceof QueenMovesMatch) {
			QueenMovesMatch m = (QueenMovesMatch) match;
			return (sb + ":" + getPieceStateCode(m.getQueen()).toString()).intern();

		} else if (match instanceof KingMovesMatch) {
			KingMovesMatch m = (KingMovesMatch) match;
			return (sb + ":" + getPieceStateCode(m.getKing()).toString()).intern();

		} else if (match instanceof InChessWhiteMatch) {
			InChessWhiteMatch m = (InChessWhiteMatch) match;
			return (sb + ":" + getPieceStateCode(m.getKing()).toString() + getPieceStateCode(m.getPiece()).toString())
					.intern();

		} else if (match instanceof InChessBlackMatch) {
			InChessBlackMatch m = (InChessBlackMatch) match;
			return (sb + ":" + getPieceStateCode(m.getKing()).toString() + getPieceStateCode(m.getPiece()).toString())
					.intern();

		} else {
			throw new DSEException("Unsupported rule.");
		}

	}

}
