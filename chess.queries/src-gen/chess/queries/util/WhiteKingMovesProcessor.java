package chess.queries.util;

import chess.queries.WhiteKingMovesMatch;
import chessdiagram.Chess;
import chessdiagram.King;
import chessdiagram.Square;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the chess.queries.whiteKingMoves pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class WhiteKingMovesProcessor implements IMatchProcessor<WhiteKingMovesMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pKing the value of pattern parameter king in the currently processed match
   * @param pSquare the value of pattern parameter square in the currently processed match
   * @param pChess the value of pattern parameter chess in the currently processed match
   * 
   */
  public abstract void process(final King pKing, final Square pSquare, final Chess pChess);
  
  @Override
  public void process(final WhiteKingMovesMatch match) {
    process(match.getKing(), match.getSquare(), match.getChess());
  }
}
