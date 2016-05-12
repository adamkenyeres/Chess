package chess.queries.util;

import chess.queries.SouthDiagonalMovesMatch;
import chessdiagram.Piece;
import chessdiagram.Square;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the chess.queries.southDiagonalMoves pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class SouthDiagonalMovesProcessor implements IMatchProcessor<SouthDiagonalMovesMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pBishop the value of pattern parameter bishop in the currently processed match
   * @param pSquare the value of pattern parameter square in the currently processed match
   * 
   */
  public abstract void process(final Piece pBishop, final Square pSquare);
  
  @Override
  public void process(final SouthDiagonalMovesMatch match) {
    process(match.getBishop(), match.getSquare());
  }
}
