package chess.queries.util;

import chess.queries.SquareMatch;
import chessdiagram.Piece;
import chessdiagram.Square;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the chess.queries.square pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class SquareProcessor implements IMatchProcessor<SquareMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pSource the value of pattern parameter source in the currently processed match
   * @param pTarget the value of pattern parameter target in the currently processed match
   * 
   */
  public abstract void process(final Piece pSource, final Square pTarget);
  
  @Override
  public void process(final SquareMatch match) {
    process(match.getSource(), match.getTarget());
  }
}
