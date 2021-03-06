package chess.queries.util;

import chess.queries.WMatch;
import chessdiagram.Square;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the chess.queries.W pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class WProcessor implements IMatchProcessor<WMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pSource the value of pattern parameter source in the currently processed match
   * @param pTarget the value of pattern parameter target in the currently processed match
   * 
   */
  public abstract void process(final Square pSource, final Square pTarget);
  
  @Override
  public void process(final WMatch match) {
    process(match.getSource(), match.getTarget());
  }
}
