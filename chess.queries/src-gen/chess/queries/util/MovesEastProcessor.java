package chess.queries.util;

import chess.queries.MovesEastMatch;
import chessdiagram.Square;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the chess.queries.movesEast pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class MovesEastProcessor implements IMatchProcessor<MovesEastMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pSquareStart the value of pattern parameter squareStart in the currently processed match
   * @param pSquareEnd the value of pattern parameter squareEnd in the currently processed match
   * @param pSquareMiddle the value of pattern parameter squareMiddle in the currently processed match
   * 
   */
  public abstract void process(final Square pSquareStart, final Square pSquareEnd, final Square pSquareMiddle);
  
  @Override
  public void process(final MovesEastMatch match) {
    process(match.getSquareStart(), match.getSquareEnd(), match.getSquareMiddle());
  }
}
