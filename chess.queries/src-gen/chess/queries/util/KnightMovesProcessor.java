package chess.queries.util;

import chess.queries.KnightMovesMatch;
import chessdiagram.Chess;
import chessdiagram.Knight;
import chessdiagram.Square;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the chess.queries.knightMoves pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class KnightMovesProcessor implements IMatchProcessor<KnightMovesMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pKnight the value of pattern parameter knight in the currently processed match
   * @param pSquare the value of pattern parameter square in the currently processed match
   * @param pChess the value of pattern parameter chess in the currently processed match
   * 
   */
  public abstract void process(final Knight pKnight, final Square pSquare, final Chess pChess);
  
  @Override
  public void process(final KnightMovesMatch match) {
    process(match.getKnight(), match.getSquare(), match.getChess());
  }
}
