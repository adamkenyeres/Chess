package chess.queries;

import chess.queries.CanAttackMatcher;
import chess.queries.PieceOnSquareeMatcher;
import chess.queries.PiecesOfBlackPlayerMatcher;
import chess.queries.PiecesOfWhitePlayerMatcher;
import chess.queries.PiecesOnBoardMatcher;
import chess.queries.SameColorPieceMatcher;
import chess.queries.SquareContainsBlackPieceMatcher;
import chess.queries.SquareContainsWhitePieceMatcher;
import chess.queries.SquareForPieceMatcher;
import chess.queries.util.CanAttackQuerySpecification;
import chess.queries.util.PieceOnSquareeQuerySpecification;
import chess.queries.util.PiecesOfBlackPlayerQuerySpecification;
import chess.queries.util.PiecesOfWhitePlayerQuerySpecification;
import chess.queries.util.PiecesOnBoardQuerySpecification;
import chess.queries.util.SameColorPieceQuerySpecification;
import chess.queries.util.SquareContainsBlackPieceQuerySpecification;
import chess.queries.util.SquareContainsWhitePieceQuerySpecification;
import chess.queries.util.SquareForPieceQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;

/**
 * A pattern group formed of all patterns defined in queries.vql.
 * 
 * <p>Use the static instance as any {@link org.eclipse.viatra.query.runtime.api.IPatternGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file queries.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package chess.queries, the group contains the definition of the following patterns: <ul>
 * <li>pieceOnSquaree</li>
 * <li>sameColorPiece</li>
 * <li>canAttack</li>
 * <li>piecesOnBoard</li>
 * <li>piecesOfBlackPlayer</li>
 * <li>piecesOfWhitePlayer</li>
 * <li>squareContainsWhitePiece</li>
 * <li>squareContainsBlackPiece</li>
 * <li>squareForPiece</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
public final class Queries extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static Queries instance() throws ViatraQueryException {
    if (INSTANCE == null) {
    	INSTANCE = new Queries();
    }
    return INSTANCE;
  }
  
  private static Queries INSTANCE;
  
  private Queries() throws ViatraQueryException {
    querySpecifications.add(PieceOnSquareeQuerySpecification.instance());
    querySpecifications.add(SameColorPieceQuerySpecification.instance());
    querySpecifications.add(CanAttackQuerySpecification.instance());
    querySpecifications.add(PiecesOnBoardQuerySpecification.instance());
    querySpecifications.add(PiecesOfBlackPlayerQuerySpecification.instance());
    querySpecifications.add(PiecesOfWhitePlayerQuerySpecification.instance());
    querySpecifications.add(SquareContainsWhitePieceQuerySpecification.instance());
    querySpecifications.add(SquareContainsBlackPieceQuerySpecification.instance());
    querySpecifications.add(SquareForPieceQuerySpecification.instance());
  }
  
  public PieceOnSquareeQuerySpecification getPieceOnSquaree() throws ViatraQueryException {
    return PieceOnSquareeQuerySpecification.instance();
  }
  
  public PieceOnSquareeMatcher getPieceOnSquaree(final ViatraQueryEngine engine) throws ViatraQueryException {
    return PieceOnSquareeMatcher.on(engine);
  }
  
  public SameColorPieceQuerySpecification getSameColorPiece() throws ViatraQueryException {
    return SameColorPieceQuerySpecification.instance();
  }
  
  public SameColorPieceMatcher getSameColorPiece(final ViatraQueryEngine engine) throws ViatraQueryException {
    return SameColorPieceMatcher.on(engine);
  }
  
  public CanAttackQuerySpecification getCanAttack() throws ViatraQueryException {
    return CanAttackQuerySpecification.instance();
  }
  
  public CanAttackMatcher getCanAttack(final ViatraQueryEngine engine) throws ViatraQueryException {
    return CanAttackMatcher.on(engine);
  }
  
  public PiecesOnBoardQuerySpecification getPiecesOnBoard() throws ViatraQueryException {
    return PiecesOnBoardQuerySpecification.instance();
  }
  
  public PiecesOnBoardMatcher getPiecesOnBoard(final ViatraQueryEngine engine) throws ViatraQueryException {
    return PiecesOnBoardMatcher.on(engine);
  }
  
  public PiecesOfBlackPlayerQuerySpecification getPiecesOfBlackPlayer() throws ViatraQueryException {
    return PiecesOfBlackPlayerQuerySpecification.instance();
  }
  
  public PiecesOfBlackPlayerMatcher getPiecesOfBlackPlayer(final ViatraQueryEngine engine) throws ViatraQueryException {
    return PiecesOfBlackPlayerMatcher.on(engine);
  }
  
  public PiecesOfWhitePlayerQuerySpecification getPiecesOfWhitePlayer() throws ViatraQueryException {
    return PiecesOfWhitePlayerQuerySpecification.instance();
  }
  
  public PiecesOfWhitePlayerMatcher getPiecesOfWhitePlayer(final ViatraQueryEngine engine) throws ViatraQueryException {
    return PiecesOfWhitePlayerMatcher.on(engine);
  }
  
  public SquareContainsWhitePieceQuerySpecification getSquareContainsWhitePiece() throws ViatraQueryException {
    return SquareContainsWhitePieceQuerySpecification.instance();
  }
  
  public SquareContainsWhitePieceMatcher getSquareContainsWhitePiece(final ViatraQueryEngine engine) throws ViatraQueryException {
    return SquareContainsWhitePieceMatcher.on(engine);
  }
  
  public SquareContainsBlackPieceQuerySpecification getSquareContainsBlackPiece() throws ViatraQueryException {
    return SquareContainsBlackPieceQuerySpecification.instance();
  }
  
  public SquareContainsBlackPieceMatcher getSquareContainsBlackPiece(final ViatraQueryEngine engine) throws ViatraQueryException {
    return SquareContainsBlackPieceMatcher.on(engine);
  }
  
  public SquareForPieceQuerySpecification getSquareForPiece() throws ViatraQueryException {
    return SquareForPieceQuerySpecification.instance();
  }
  
  public SquareForPieceMatcher getSquareForPiece(final ViatraQueryEngine engine) throws ViatraQueryException {
    return SquareForPieceMatcher.on(engine);
  }
}
