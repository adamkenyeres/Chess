package chess.queries.util;

import chess.queries.PieceOnSquareMatch;
import chessdiagram.Piece;
import chessdiagram.Square;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the chess.queries.pieceOnSquare pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class PieceOnSquareProcessor implements IMatchProcessor<PieceOnSquareMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pSquare the value of pattern parameter square in the currently processed match
   * @param pPiece the value of pattern parameter piece in the currently processed match
   * 
   */
  public abstract void process(final Square pSquare, final Piece pPiece);
  
  @Override
  public void process(final PieceOnSquareMatch match) {
    process(match.getSquare(), match.getPiece());
  }
}
