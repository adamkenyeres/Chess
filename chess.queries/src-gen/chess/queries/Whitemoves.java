package chess.queries;

import chess.queries.WhiteMovesMatcher;
import chess.queries.util.WhiteMovesQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;

/**
 * A pattern group formed of all patterns defined in whitemoves.vql.
 * 
 * <p>Use the static instance as any {@link org.eclipse.viatra.query.runtime.api.IPatternGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file whitemoves.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package chess.queries, the group contains the definition of the following patterns: <ul>
 * <li>whiteMoves</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
public final class Whitemoves extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static Whitemoves instance() throws ViatraQueryException {
    if (INSTANCE == null) {
    	INSTANCE = new Whitemoves();
    }
    return INSTANCE;
  }
  
  private static Whitemoves INSTANCE;
  
  private Whitemoves() throws ViatraQueryException {
    querySpecifications.add(WhiteMovesQuerySpecification.instance());
  }
  
  public WhiteMovesQuerySpecification getWhiteMoves() throws ViatraQueryException {
    return WhiteMovesQuerySpecification.instance();
  }
  
  public WhiteMovesMatcher getWhiteMoves(final ViatraQueryEngine engine) throws ViatraQueryException {
    return WhiteMovesMatcher.on(engine);
  }
}
