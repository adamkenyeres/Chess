package chess.queries.util;

import chess.queries.NorthWestTransitiveClouserMatch;
import chessdiagram.Square;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the chess.queries.northWestTransitiveClouser pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class NorthWestTransitiveClouserProcessor implements IMatchProcessor<NorthWestTransitiveClouserMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pS1 the value of pattern parameter s1 in the currently processed match
   * @param pS2 the value of pattern parameter s2 in the currently processed match
   * 
   */
  public abstract void process(final Square pS1, final Square pS2);
  
  @Override
  public void process(final NorthWestTransitiveClouserMatch match) {
    process(match.getS1(), match.getS2());
  }
}
