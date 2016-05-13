package chess.queries.util;

import chess.queries.RookMovesMatch;
import chessdiagram.Chess;
import chessdiagram.Rook;
import chessdiagram.Square;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the chess.queries.rookMoves pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class RookMovesProcessor implements IMatchProcessor<RookMovesMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pRook the value of pattern parameter rook in the currently processed match
   * @param pSquare the value of pattern parameter square in the currently processed match
   * @param pChess the value of pattern parameter chess in the currently processed match
   * 
   */
  public abstract void process(final Rook pRook, final Square pSquare, final Chess pChess);
  
  @Override
  public void process(final RookMovesMatch match) {
    process(match.getRook(), match.getSquare(), match.getChess());
  }
}
