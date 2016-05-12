package chess.queries.util;

import chess.queries.InChessMatch;
import chessdiagram.King;
import chessdiagram.Piece;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the chess.queries.inChess pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class InChessProcessor implements IMatchProcessor<InChessMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pKing the value of pattern parameter king in the currently processed match
   * @param pPiece the value of pattern parameter piece in the currently processed match
   * 
   */
  public abstract void process(final King pKing, final Piece pPiece);
  
  @Override
  public void process(final InChessMatch match) {
    process(match.getKing(), match.getPiece());
  }
}
