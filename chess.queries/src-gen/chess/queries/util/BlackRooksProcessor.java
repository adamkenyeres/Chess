package chess.queries.util;

import chess.queries.BlackRooksMatch;
import chessdiagram.Rook;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the chess.queries.blackRooks pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class BlackRooksProcessor implements IMatchProcessor<BlackRooksMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pRook the value of pattern parameter rook in the currently processed match
   * 
   */
  public abstract void process(final Rook pRook);
  
  @Override
  public void process(final BlackRooksMatch match) {
    process(match.getRook());
  }
}
