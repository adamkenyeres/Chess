package chess.queries.util;

import chess.queries.WhiteQueensMatch;
import chessdiagram.Queen;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the chess.queries.whiteQueens pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class WhiteQueensProcessor implements IMatchProcessor<WhiteQueensMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pQueen the value of pattern parameter queen in the currently processed match
   * 
   */
  public abstract void process(final Queen pQueen);
  
  @Override
  public void process(final WhiteQueensMatch match) {
    process(match.getQueen());
  }
}
