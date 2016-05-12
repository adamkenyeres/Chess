package chess.queries.util;

import chess.queries.NorthWestMatch;
import chessdiagram.Square;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the chess.queries.northWest pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class NorthWestProcessor implements IMatchProcessor<NorthWestMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pSquareSE the value of pattern parameter squareSE in the currently processed match
   * @param pSquareNW the value of pattern parameter squareNW in the currently processed match
   * 
   */
  public abstract void process(final Square pSquareSE, final Square pSquareNW);
  
  @Override
  public void process(final NorthWestMatch match) {
    process(match.getSquareSE(), match.getSquareNW());
  }
}
