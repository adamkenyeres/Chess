package chess.queries.util;

import chess.queries.PiecesOfWhitePlayerMatch;
import chessdiagram.Piece;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the chess.queries.piecesOfWhitePlayer pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class PiecesOfWhitePlayerProcessor implements IMatchProcessor<PiecesOfWhitePlayerMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pPiece the value of pattern parameter piece in the currently processed match
   * 
   */
  public abstract void process(final Piece pPiece);
  
  @Override
  public void process(final PiecesOfWhitePlayerMatch match) {
    process(match.getPiece());
  }
}
