package chess.queries.util;

import chess.queries.TransitiveClosureSouthWestWithPiecesMatch;
import chessdiagram.Square;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the chess.queries.transitiveClosureSouthWestWithPieces pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class TransitiveClosureSouthWestWithPiecesProcessor implements IMatchProcessor<TransitiveClosureSouthWestWithPiecesMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pStart the value of pattern parameter start in the currently processed match
   * @param pEnd the value of pattern parameter end in the currently processed match
   * @param pSquare the value of pattern parameter square in the currently processed match
   * 
   */
  public abstract void process(final Square pStart, final Square pEnd, final Square pSquare);
  
  @Override
  public void process(final TransitiveClosureSouthWestWithPiecesMatch match) {
    process(match.getStart(), match.getEnd(), match.getSquare());
  }
}
