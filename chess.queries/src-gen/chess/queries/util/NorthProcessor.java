package chess.queries.util;

import chess.queries.NorthMatch;
import chessdiagram.Square;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the chess.queries.north pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class NorthProcessor implements IMatchProcessor<NorthMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pSquareS the value of pattern parameter squareS in the currently processed match
   * @param pSquareN the value of pattern parameter squareN in the currently processed match
   * 
   */
  public abstract void process(final Square pSquareS, final Square pSquareN);
  
  @Override
  public void process(final NorthMatch match) {
    process(match.getSquareS(), match.getSquareN());
  }
}
