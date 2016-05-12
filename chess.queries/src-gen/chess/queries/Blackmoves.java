package chess.queries;

import chess.queries.BlackMovesMatcher;
import chess.queries.util.BlackMovesQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;

/**
 * A pattern group formed of all patterns defined in blackmoves.vql.
 * 
 * <p>Use the static instance as any {@link org.eclipse.viatra.query.runtime.api.IPatternGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file blackmoves.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package chess.queries, the group contains the definition of the following patterns: <ul>
 * <li>blackMoves</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
public final class Blackmoves extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static Blackmoves instance() throws ViatraQueryException {
    if (INSTANCE == null) {
    	INSTANCE = new Blackmoves();
    }
    return INSTANCE;
  }
  
  private static Blackmoves INSTANCE;
  
  private Blackmoves() throws ViatraQueryException {
    querySpecifications.add(BlackMovesQuerySpecification.instance());
  }
  
  public BlackMovesQuerySpecification getBlackMoves() throws ViatraQueryException {
    return BlackMovesQuerySpecification.instance();
  }
  
  public BlackMovesMatcher getBlackMoves(final ViatraQueryEngine engine) throws ViatraQueryException {
    return BlackMovesMatcher.on(engine);
  }
}
