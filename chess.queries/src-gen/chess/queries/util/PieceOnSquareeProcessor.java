package chess.queries.util;

import chess.queries.PieceOnSquareeMatch;
import chessdiagram.Square;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the chess.queries.pieceOnSquaree pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class PieceOnSquareeProcessor implements IMatchProcessor<PieceOnSquareeMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pSquare the value of pattern parameter square in the currently processed match
   * 
   */
  public abstract void process(final Square pSquare);
  
  @Override
  public void process(final PieceOnSquareeMatch match) {
    process(match.getSquare());
  }
}
