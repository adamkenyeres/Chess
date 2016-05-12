package chess.queries;

import chess.queries.BishopMovesMatcher;
import chess.queries.BlackBishopMovesMatcher;
import chess.queries.DiagonalMovesMatcher;
import chess.queries.NorthDiagonalMovesMatcher;
import chess.queries.SouthDiagonalMovesMatcher;
import chess.queries.WhiteBishopMovesMatcher;
import chess.queries.util.BishopMovesQuerySpecification;
import chess.queries.util.BlackBishopMovesQuerySpecification;
import chess.queries.util.DiagonalMovesQuerySpecification;
import chess.queries.util.NorthDiagonalMovesQuerySpecification;
import chess.queries.util.SouthDiagonalMovesQuerySpecification;
import chess.queries.util.WhiteBishopMovesQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;

/**
 * A pattern group formed of all patterns defined in bishopMoves.vql.
 * 
 * <p>Use the static instance as any {@link org.eclipse.viatra.query.runtime.api.IPatternGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file bishopMoves.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package chess.queries, the group contains the definition of the following patterns: <ul>
 * <li>southDiagonalMoves</li>
 * <li>northDiagonalMoves</li>
 * <li>diagonalMoves</li>
 * <li>bishopMoves</li>
 * <li>whiteBishopMoves</li>
 * <li>blackBishopMoves</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
public final class BishopMoves extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static BishopMoves instance() throws ViatraQueryException {
    if (INSTANCE == null) {
    	INSTANCE = new BishopMoves();
    }
    return INSTANCE;
  }
  
  private static BishopMoves INSTANCE;
  
  private BishopMoves() throws ViatraQueryException {
    querySpecifications.add(SouthDiagonalMovesQuerySpecification.instance());
    querySpecifications.add(NorthDiagonalMovesQuerySpecification.instance());
    querySpecifications.add(DiagonalMovesQuerySpecification.instance());
    querySpecifications.add(BishopMovesQuerySpecification.instance());
    querySpecifications.add(WhiteBishopMovesQuerySpecification.instance());
    querySpecifications.add(BlackBishopMovesQuerySpecification.instance());
  }
  
  public SouthDiagonalMovesQuerySpecification getSouthDiagonalMoves() throws ViatraQueryException {
    return SouthDiagonalMovesQuerySpecification.instance();
  }
  
  public SouthDiagonalMovesMatcher getSouthDiagonalMoves(final ViatraQueryEngine engine) throws ViatraQueryException {
    return SouthDiagonalMovesMatcher.on(engine);
  }
  
  public NorthDiagonalMovesQuerySpecification getNorthDiagonalMoves() throws ViatraQueryException {
    return NorthDiagonalMovesQuerySpecification.instance();
  }
  
  public NorthDiagonalMovesMatcher getNorthDiagonalMoves(final ViatraQueryEngine engine) throws ViatraQueryException {
    return NorthDiagonalMovesMatcher.on(engine);
  }
  
  public DiagonalMovesQuerySpecification getDiagonalMoves() throws ViatraQueryException {
    return DiagonalMovesQuerySpecification.instance();
  }
  
  public DiagonalMovesMatcher getDiagonalMoves(final ViatraQueryEngine engine) throws ViatraQueryException {
    return DiagonalMovesMatcher.on(engine);
  }
  
  public BishopMovesQuerySpecification getBishopMoves() throws ViatraQueryException {
    return BishopMovesQuerySpecification.instance();
  }
  
  public BishopMovesMatcher getBishopMoves(final ViatraQueryEngine engine) throws ViatraQueryException {
    return BishopMovesMatcher.on(engine);
  }
  
  public WhiteBishopMovesQuerySpecification getWhiteBishopMoves() throws ViatraQueryException {
    return WhiteBishopMovesQuerySpecification.instance();
  }
  
  public WhiteBishopMovesMatcher getWhiteBishopMoves(final ViatraQueryEngine engine) throws ViatraQueryException {
    return WhiteBishopMovesMatcher.on(engine);
  }
  
  public BlackBishopMovesQuerySpecification getBlackBishopMoves() throws ViatraQueryException {
    return BlackBishopMovesQuerySpecification.instance();
  }
  
  public BlackBishopMovesMatcher getBlackBishopMoves(final ViatraQueryEngine engine) throws ViatraQueryException {
    return BlackBishopMovesMatcher.on(engine);
  }
}
