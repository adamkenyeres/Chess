package chess.queries.util;

import chess.queries.VerticalRookMovesMatch;
import chessdiagram.Piece;
import chessdiagram.Square;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the chess.queries.verticalRookMoves pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class VerticalRookMovesProcessor implements IMatchProcessor<VerticalRookMovesMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pRook the value of pattern parameter rook in the currently processed match
   * @param pSquare the value of pattern parameter square in the currently processed match
   * 
   */
  public abstract void process(final Piece pRook, final Square pSquare);
  
  @Override
  public void process(final VerticalRookMovesMatch match) {
    process(match.getRook(), match.getSquare());
  }
}
