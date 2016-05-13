package chess.queries.util;

import chess.queries.InChessBlackMatch;
import chessdiagram.Chess;
import chessdiagram.King;
import chessdiagram.Piece;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the chess.queries.inChessBlack pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class InChessBlackProcessor implements IMatchProcessor<InChessBlackMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pKing the value of pattern parameter king in the currently processed match
   * @param pPiece the value of pattern parameter piece in the currently processed match
   * @param pChess the value of pattern parameter chess in the currently processed match
   * 
   */
  public abstract void process(final King pKing, final Piece pPiece, final Chess pChess);
  
  @Override
  public void process(final InChessBlackMatch match) {
    process(match.getKing(), match.getPiece(), match.getChess());
  }
}
