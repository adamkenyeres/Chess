package chess.queries.util;

import chess.queries.QueenMovesMatch;
import chessdiagram.Queen;
import chessdiagram.Square;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the chess.queries.queenMoves pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class QueenMovesProcessor implements IMatchProcessor<QueenMovesMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pQueen the value of pattern parameter queen in the currently processed match
   * @param pSquare the value of pattern parameter square in the currently processed match
   * 
   */
  public abstract void process(final Queen pQueen, final Square pSquare);
  
  @Override
  public void process(final QueenMovesMatch match) {
    process(match.getQueen(), match.getSquare());
  }
}
