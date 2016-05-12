package chess.queries.util;

import chess.queries.BlackPawnMovesMatch;
import chessdiagram.Pawn;
import chessdiagram.Square;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the chess.queries.blackPawnMoves pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class BlackPawnMovesProcessor implements IMatchProcessor<BlackPawnMovesMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pPiece the value of pattern parameter piece in the currently processed match
   * @param pSquare the value of pattern parameter square in the currently processed match
   * 
   */
  public abstract void process(final Pawn pPiece, final Square pSquare);
  
  @Override
  public void process(final BlackPawnMovesMatch match) {
    process(match.getPiece(), match.getSquare());
  }
}
