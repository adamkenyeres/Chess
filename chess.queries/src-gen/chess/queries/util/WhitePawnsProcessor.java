package chess.queries.util;

import chess.queries.WhitePawnsMatch;
import chessdiagram.Pawn;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the chess.queries.whitePawns pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class WhitePawnsProcessor implements IMatchProcessor<WhitePawnsMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pPawn the value of pattern parameter pawn in the currently processed match
   * 
   */
  public abstract void process(final Pawn pPawn);
  
  @Override
  public void process(final WhitePawnsMatch match) {
    process(match.getPawn());
  }
}
