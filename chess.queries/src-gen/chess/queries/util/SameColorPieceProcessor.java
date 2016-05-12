package chess.queries.util;

import chess.queries.SameColorPieceMatch;
import chessdiagram.Piece;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the chess.queries.sameColorPiece pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class SameColorPieceProcessor implements IMatchProcessor<SameColorPieceMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pPiece1 the value of pattern parameter piece1 in the currently processed match
   * @param pPiece2 the value of pattern parameter piece2 in the currently processed match
   * 
   */
  public abstract void process(final Piece pPiece1, final Piece pPiece2);
  
  @Override
  public void process(final SameColorPieceMatch match) {
    process(match.getPiece1(), match.getPiece2());
  }
}
