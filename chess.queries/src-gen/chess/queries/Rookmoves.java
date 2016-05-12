package chess.queries;

import chess.queries.HorizontalOrVerticalMovesMatcher;
import chess.queries.HorizontalRookMovesMatcher;
import chess.queries.RookMovesMatcher;
import chess.queries.VerticalRookMovesMatcher;
import chess.queries.util.HorizontalOrVerticalMovesQuerySpecification;
import chess.queries.util.HorizontalRookMovesQuerySpecification;
import chess.queries.util.RookMovesQuerySpecification;
import chess.queries.util.VerticalRookMovesQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;

/**
 * A pattern group formed of all patterns defined in rookmoves.vql.
 * 
 * <p>Use the static instance as any {@link org.eclipse.viatra.query.runtime.api.IPatternGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file rookmoves.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package chess.queries, the group contains the definition of the following patterns: <ul>
 * <li>verticalRookMoves</li>
 * <li>horizontalRookMoves</li>
 * <li>horizontalOrVerticalMoves</li>
 * <li>rookMoves</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
public final class Rookmoves extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static Rookmoves instance() throws ViatraQueryException {
    if (INSTANCE == null) {
    	INSTANCE = new Rookmoves();
    }
    return INSTANCE;
  }
  
  private static Rookmoves INSTANCE;
  
  private Rookmoves() throws ViatraQueryException {
    querySpecifications.add(VerticalRookMovesQuerySpecification.instance());
    querySpecifications.add(HorizontalRookMovesQuerySpecification.instance());
    querySpecifications.add(HorizontalOrVerticalMovesQuerySpecification.instance());
    querySpecifications.add(RookMovesQuerySpecification.instance());
  }
  
  public VerticalRookMovesQuerySpecification getVerticalRookMoves() throws ViatraQueryException {
    return VerticalRookMovesQuerySpecification.instance();
  }
  
  public VerticalRookMovesMatcher getVerticalRookMoves(final ViatraQueryEngine engine) throws ViatraQueryException {
    return VerticalRookMovesMatcher.on(engine);
  }
  
  public HorizontalRookMovesQuerySpecification getHorizontalRookMoves() throws ViatraQueryException {
    return HorizontalRookMovesQuerySpecification.instance();
  }
  
  public HorizontalRookMovesMatcher getHorizontalRookMoves(final ViatraQueryEngine engine) throws ViatraQueryException {
    return HorizontalRookMovesMatcher.on(engine);
  }
  
  public HorizontalOrVerticalMovesQuerySpecification getHorizontalOrVerticalMoves() throws ViatraQueryException {
    return HorizontalOrVerticalMovesQuerySpecification.instance();
  }
  
  public HorizontalOrVerticalMovesMatcher getHorizontalOrVerticalMoves(final ViatraQueryEngine engine) throws ViatraQueryException {
    return HorizontalOrVerticalMovesMatcher.on(engine);
  }
  
  public RookMovesQuerySpecification getRookMoves() throws ViatraQueryException {
    return RookMovesQuerySpecification.instance();
  }
  
  public RookMovesMatcher getRookMoves(final ViatraQueryEngine engine) throws ViatraQueryException {
    return RookMovesMatcher.on(engine);
  }
}
