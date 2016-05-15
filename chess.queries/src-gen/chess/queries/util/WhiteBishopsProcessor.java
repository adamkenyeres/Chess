package chess.queries.util;

import chess.queries.WhiteBishopsMatch;
import chessdiagram.Bishop;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the chess.queries.whiteBishops pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class WhiteBishopsProcessor implements IMatchProcessor<WhiteBishopsMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pBishop the value of pattern parameter bishop in the currently processed match
   * 
   */
  public abstract void process(final Bishop pBishop);
  
  @Override
  public void process(final WhiteBishopsMatch match) {
    process(match.getBishop());
  }
}
