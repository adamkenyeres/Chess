package chess.queries;

import chess.queries.BlackPawnMovesMatcher;
import chess.queries.WhitePawnMovesMatcher;
import chess.queries.util.BlackPawnMovesQuerySpecification;
import chess.queries.util.WhitePawnMovesQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;

/**
 * A pattern group formed of all patterns defined in pawnmoves.vql.
 * 
 * <p>Use the static instance as any {@link org.eclipse.viatra.query.runtime.api.IPatternGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file pawnmoves.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package chess.queries, the group contains the definition of the following patterns: <ul>
 * <li>blackPawnMoves</li>
 * <li>whitePawnMoves</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
public final class Pawnmoves extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static Pawnmoves instance() throws ViatraQueryException {
    if (INSTANCE == null) {
    	INSTANCE = new Pawnmoves();
    }
    return INSTANCE;
  }
  
  private static Pawnmoves INSTANCE;
  
  private Pawnmoves() throws ViatraQueryException {
    querySpecifications.add(BlackPawnMovesQuerySpecification.instance());
    querySpecifications.add(WhitePawnMovesQuerySpecification.instance());
  }
  
  public BlackPawnMovesQuerySpecification getBlackPawnMoves() throws ViatraQueryException {
    return BlackPawnMovesQuerySpecification.instance();
  }
  
  public BlackPawnMovesMatcher getBlackPawnMoves(final ViatraQueryEngine engine) throws ViatraQueryException {
    return BlackPawnMovesMatcher.on(engine);
  }
  
  public WhitePawnMovesQuerySpecification getWhitePawnMoves() throws ViatraQueryException {
    return WhitePawnMovesQuerySpecification.instance();
  }
  
  public WhitePawnMovesMatcher getWhitePawnMoves(final ViatraQueryEngine engine) throws ViatraQueryException {
    return WhitePawnMovesMatcher.on(engine);
  }
}
