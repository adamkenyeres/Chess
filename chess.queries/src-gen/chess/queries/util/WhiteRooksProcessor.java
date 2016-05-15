package chess.queries.util;

import chess.queries.WhiteRooksMatch;
import chessdiagram.Rook;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the chess.queries.whiteRooks pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class WhiteRooksProcessor implements IMatchProcessor<WhiteRooksMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pRook the value of pattern parameter rook in the currently processed match
   * 
   */
  public abstract void process(final Rook pRook);
  
  @Override
  public void process(final WhiteRooksMatch match) {
    process(match.getRook());
  }
}
