package chess.queries.util;

import chess.queries.WhiteKnightsMatch;
import chessdiagram.Knight;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the chess.queries.whiteKnights pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class WhiteKnightsProcessor implements IMatchProcessor<WhiteKnightsMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pKnight the value of pattern parameter knight in the currently processed match
   * 
   */
  public abstract void process(final Knight pKnight);
  
  @Override
  public void process(final WhiteKnightsMatch match) {
    process(match.getKnight());
  }
}
