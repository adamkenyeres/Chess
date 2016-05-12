package chess.queries;

import chess.queries.BlackKnightMovesMatcher;
import chess.queries.KnightMovesMatcher;
import chess.queries.WhiteKnightMovesMatcher;
import chess.queries.util.BlackKnightMovesQuerySpecification;
import chess.queries.util.KnightMovesQuerySpecification;
import chess.queries.util.WhiteKnightMovesQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;

/**
 * A pattern group formed of all patterns defined in knightmoves.vql.
 * 
 * <p>Use the static instance as any {@link org.eclipse.viatra.query.runtime.api.IPatternGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file knightmoves.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package chess.queries, the group contains the definition of the following patterns: <ul>
 * <li>knightMoves</li>
 * <li>whiteKnightMoves</li>
 * <li>blackKnightMoves</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
public final class Knightmoves extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static Knightmoves instance() throws ViatraQueryException {
    if (INSTANCE == null) {
    	INSTANCE = new Knightmoves();
    }
    return INSTANCE;
  }
  
  private static Knightmoves INSTANCE;
  
  private Knightmoves() throws ViatraQueryException {
    querySpecifications.add(KnightMovesQuerySpecification.instance());
    querySpecifications.add(WhiteKnightMovesQuerySpecification.instance());
    querySpecifications.add(BlackKnightMovesQuerySpecification.instance());
  }
  
  public KnightMovesQuerySpecification getKnightMoves() throws ViatraQueryException {
    return KnightMovesQuerySpecification.instance();
  }
  
  public KnightMovesMatcher getKnightMoves(final ViatraQueryEngine engine) throws ViatraQueryException {
    return KnightMovesMatcher.on(engine);
  }
  
  public WhiteKnightMovesQuerySpecification getWhiteKnightMoves() throws ViatraQueryException {
    return WhiteKnightMovesQuerySpecification.instance();
  }
  
  public WhiteKnightMovesMatcher getWhiteKnightMoves(final ViatraQueryEngine engine) throws ViatraQueryException {
    return WhiteKnightMovesMatcher.on(engine);
  }
  
  public BlackKnightMovesQuerySpecification getBlackKnightMoves() throws ViatraQueryException {
    return BlackKnightMovesQuerySpecification.instance();
  }
  
  public BlackKnightMovesMatcher getBlackKnightMoves(final ViatraQueryEngine engine) throws ViatraQueryException {
    return BlackKnightMovesMatcher.on(engine);
  }
}
