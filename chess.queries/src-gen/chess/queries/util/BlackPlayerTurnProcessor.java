package chess.queries.util;

import chess.queries.BlackPlayerTurnMatch;
import chessdiagram.Chess;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the chess.queries.blackPlayerTurn pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class BlackPlayerTurnProcessor implements IMatchProcessor<BlackPlayerTurnMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pChess the value of pattern parameter chess in the currently processed match
   * 
   */
  public abstract void process(final Chess pChess);
  
  @Override
  public void process(final BlackPlayerTurnMatch match) {
    process(match.getChess());
  }
}
