package chess.queries.util;

import chess.queries.AllMovessMatch;
import chessdiagram.Chess;
import chessdiagram.Piece;
import chessdiagram.Square;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the chess.queries.allMovess pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class AllMovessProcessor implements IMatchProcessor<AllMovessMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pPiece the value of pattern parameter piece in the currently processed match
   * @param pSquare the value of pattern parameter square in the currently processed match
   * @param pChess the value of pattern parameter chess in the currently processed match
   * 
   */
  public abstract void process(final Piece pPiece, final Square pSquare, final Chess pChess);
  
  @Override
  public void process(final AllMovessMatch match) {
    process(match.getPiece(), match.getSquare(), match.getChess());
  }
}
