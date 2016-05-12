package chess.queries.util;

import chess.queries.NorthEastMatch;
import chessdiagram.Square;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the chess.queries.northEast pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class NorthEastProcessor implements IMatchProcessor<NorthEastMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pSquareSW the value of pattern parameter squareSW in the currently processed match
   * @param pSquareNE the value of pattern parameter squareNE in the currently processed match
   * 
   */
  public abstract void process(final Square pSquareSW, final Square pSquareNE);
  
  @Override
  public void process(final NorthEastMatch match) {
    process(match.getSquareSW(), match.getSquareNE());
  }
}
