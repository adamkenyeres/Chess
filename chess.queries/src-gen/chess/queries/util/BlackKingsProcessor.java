package chess.queries.util;

import chess.queries.BlackKingsMatch;
import chessdiagram.King;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the chess.queries.blackKings pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class BlackKingsProcessor implements IMatchProcessor<BlackKingsMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pKing the value of pattern parameter king in the currently processed match
   * 
   */
  public abstract void process(final King pKing);
  
  @Override
  public void process(final BlackKingsMatch match) {
    process(match.getKing());
  }
}
