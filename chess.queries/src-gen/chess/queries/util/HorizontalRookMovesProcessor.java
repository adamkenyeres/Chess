package chess.queries.util;

import chess.queries.HorizontalRookMovesMatch;
import chessdiagram.Piece;
import chessdiagram.Square;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the chess.queries.horizontalRookMoves pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class HorizontalRookMovesProcessor implements IMatchProcessor<HorizontalRookMovesMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pRook the value of pattern parameter rook in the currently processed match
   * @param pSquare the value of pattern parameter square in the currently processed match
   * 
   */
  public abstract void process(final Piece pRook, final Square pSquare);
  
  @Override
  public void process(final HorizontalRookMovesMatch match) {
    process(match.getRook(), match.getSquare());
  }
}
