package chess.queries;

import chess.queries.KingMovesMatcher;
import chess.queries.util.KingMovesQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;

/**
 * A pattern group formed of all patterns defined in kingmoves.vql.
 * 
 * <p>Use the static instance as any {@link org.eclipse.viatra.query.runtime.api.IPatternGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file kingmoves.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package chess.queries, the group contains the definition of the following patterns: <ul>
 * <li>kingMoves</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
public final class Kingmoves extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static Kingmoves instance() throws ViatraQueryException {
    if (INSTANCE == null) {
    	INSTANCE = new Kingmoves();
    }
    return INSTANCE;
  }
  
  private static Kingmoves INSTANCE;
  
  private Kingmoves() throws ViatraQueryException {
    querySpecifications.add(KingMovesQuerySpecification.instance());
  }
  
  public KingMovesQuerySpecification getKingMoves() throws ViatraQueryException {
    return KingMovesQuerySpecification.instance();
  }
  
  public KingMovesMatcher getKingMoves(final ViatraQueryEngine engine) throws ViatraQueryException {
    return KingMovesMatcher.on(engine);
  }
}
