package chess.queries.util;

import chess.queries.AsdasdMatch;
import chessdiagram.Square;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the chess.queries.asdasd pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class AsdasdProcessor implements IMatchProcessor<AsdasdMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pSquareE the value of pattern parameter squareE in the currently processed match
   * @param pSquareW the value of pattern parameter squareW in the currently processed match
   * 
   */
  public abstract void process(final Square pSquareE, final Square pSquareW);
  
  @Override
  public void process(final AsdasdMatch match) {
    process(match.getSquareE(), match.getSquareW());
  }
}
