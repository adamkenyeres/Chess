package chess.queries.util;

import chess.queries.WhiteQueenMovesMatch;
import chessdiagram.Chess;
import chessdiagram.Queen;
import chessdiagram.Square;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the chess.queries.whiteQueenMoves pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class WhiteQueenMovesProcessor implements IMatchProcessor<WhiteQueenMovesMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pQueen the value of pattern parameter queen in the currently processed match
   * @param pSquare the value of pattern parameter square in the currently processed match
   * @param pChess the value of pattern parameter chess in the currently processed match
   * 
   */
  public abstract void process(final Queen pQueen, final Square pSquare, final Chess pChess);
  
  @Override
  public void process(final WhiteQueenMovesMatch match) {
    process(match.getQueen(), match.getSquare(), match.getChess());
  }
}
