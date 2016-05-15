package chess.queries.util;

import chess.queries.WhitePlayerTurnMatch;
import chessdiagram.Chess;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the chess.queries.whitePlayerTurn pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class WhitePlayerTurnProcessor implements IMatchProcessor<WhitePlayerTurnMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pChess the value of pattern parameter chess in the currently processed match
   * 
   */
  public abstract void process(final Chess pChess);
  
  @Override
  public void process(final WhitePlayerTurnMatch match) {
    process(match.getChess());
  }
}
