package chess.queries;

import chess.queries.BlackQueenMovesMatcher;
import chess.queries.QueenMovesMatcher;
import chess.queries.WhiteQueenMovesMatcher;
import chess.queries.util.BlackQueenMovesQuerySpecification;
import chess.queries.util.QueenMovesQuerySpecification;
import chess.queries.util.WhiteQueenMovesQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;

/**
 * A pattern group formed of all patterns defined in queenmoves.vql.
 * 
 * <p>Use the static instance as any {@link org.eclipse.viatra.query.runtime.api.IPatternGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file queenmoves.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package chess.queries, the group contains the definition of the following patterns: <ul>
 * <li>queenMoves</li>
 * <li>blackQueenMoves</li>
 * <li>whiteQueenMoves</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
public final class Queenmoves extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static Queenmoves instance() throws ViatraQueryException {
    if (INSTANCE == null) {
    	INSTANCE = new Queenmoves();
    }
    return INSTANCE;
  }
  
  private static Queenmoves INSTANCE;
  
  private Queenmoves() throws ViatraQueryException {
    querySpecifications.add(QueenMovesQuerySpecification.instance());
    querySpecifications.add(BlackQueenMovesQuerySpecification.instance());
    querySpecifications.add(WhiteQueenMovesQuerySpecification.instance());
  }
  
  public QueenMovesQuerySpecification getQueenMoves() throws ViatraQueryException {
    return QueenMovesQuerySpecification.instance();
  }
  
  public QueenMovesMatcher getQueenMoves(final ViatraQueryEngine engine) throws ViatraQueryException {
    return QueenMovesMatcher.on(engine);
  }
  
  public BlackQueenMovesQuerySpecification getBlackQueenMoves() throws ViatraQueryException {
    return BlackQueenMovesQuerySpecification.instance();
  }
  
  public BlackQueenMovesMatcher getBlackQueenMoves(final ViatraQueryEngine engine) throws ViatraQueryException {
    return BlackQueenMovesMatcher.on(engine);
  }
  
  public WhiteQueenMovesQuerySpecification getWhiteQueenMoves() throws ViatraQueryException {
    return WhiteQueenMovesQuerySpecification.instance();
  }
  
  public WhiteQueenMovesMatcher getWhiteQueenMoves(final ViatraQueryEngine engine) throws ViatraQueryException {
    return WhiteQueenMovesMatcher.on(engine);
  }
}
