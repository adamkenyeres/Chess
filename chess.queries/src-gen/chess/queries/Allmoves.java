package chess.queries;

import chess.queries.AllMovessMatcher;
import chess.queries.util.AllMovessQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;

/**
 * A pattern group formed of all patterns defined in allmoves.vql.
 * 
 * <p>Use the static instance as any {@link org.eclipse.viatra.query.runtime.api.IPatternGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file allmoves.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package chess.queries, the group contains the definition of the following patterns: <ul>
 * <li>allMovess</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
public final class Allmoves extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static Allmoves instance() throws ViatraQueryException {
    if (INSTANCE == null) {
    	INSTANCE = new Allmoves();
    }
    return INSTANCE;
  }
  
  private static Allmoves INSTANCE;
  
  private Allmoves() throws ViatraQueryException {
    querySpecifications.add(AllMovessQuerySpecification.instance());
  }
  
  public AllMovessQuerySpecification getAllMovess() throws ViatraQueryException {
    return AllMovessQuerySpecification.instance();
  }
  
  public AllMovessMatcher getAllMovess(final ViatraQueryEngine engine) throws ViatraQueryException {
    return AllMovessMatcher.on(engine);
  }
}
