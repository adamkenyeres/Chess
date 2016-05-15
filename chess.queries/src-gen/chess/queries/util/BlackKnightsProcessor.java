package chess.queries.util;

import chess.queries.BlackKnightsMatch;
import chessdiagram.Knight;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the chess.queries.blackKnights pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class BlackKnightsProcessor implements IMatchProcessor<BlackKnightsMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pKnight the value of pattern parameter knight in the currently processed match
   * 
   */
  public abstract void process(final Knight pKnight);
  
  @Override
  public void process(final BlackKnightsMatch match) {
    process(match.getKnight());
  }
}
