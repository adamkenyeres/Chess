package chess.queries.util;

import chess.queries.WhiteBishopMovesMatch;
import chessdiagram.Bishop;
import chessdiagram.Square;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the chess.queries.whiteBishopMoves pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class WhiteBishopMovesProcessor implements IMatchProcessor<WhiteBishopMovesMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pPiece the value of pattern parameter piece in the currently processed match
   * @param pSquare the value of pattern parameter square in the currently processed match
   * 
   */
  public abstract void process(final Bishop pPiece, final Square pSquare);
  
  @Override
  public void process(final WhiteBishopMovesMatch match) {
    process(match.getPiece(), match.getSquare());
  }
}
