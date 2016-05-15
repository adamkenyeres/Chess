package chess.queries;

import chess.queries.BlackBishopsMatcher;
import chess.queries.BlackKingsMatcher;
import chess.queries.BlackKnightsMatcher;
import chess.queries.BlackPawnsMatcher;
import chess.queries.BlackPlayerTurnMatcher;
import chess.queries.BlackQueensMatcher;
import chess.queries.BlackRooksMatcher;
import chess.queries.CanAttackMatcher;
import chess.queries.NumberOfStepsEqualsThreeMatcher;
import chess.queries.PieceOnSquareeMatcher;
import chess.queries.PiecesOfBlackPlayerMatcher;
import chess.queries.PiecesOfWhitePlayerMatcher;
import chess.queries.PiecesOnBoardMatcher;
import chess.queries.SameColorPieceMatcher;
import chess.queries.SquareContainsBlackPieceMatcher;
import chess.queries.SquareContainsWhitePieceMatcher;
import chess.queries.SquareForPieceMatcher;
import chess.queries.WhiteBishopsMatcher;
import chess.queries.WhiteKingsMatcher;
import chess.queries.WhiteKnightsMatcher;
import chess.queries.WhitePawnsMatcher;
import chess.queries.WhitePlayerTurnMatcher;
import chess.queries.WhiteQueensMatcher;
import chess.queries.WhiteRooksMatcher;
import chess.queries.util.BlackBishopsQuerySpecification;
import chess.queries.util.BlackKingsQuerySpecification;
import chess.queries.util.BlackKnightsQuerySpecification;
import chess.queries.util.BlackPawnsQuerySpecification;
import chess.queries.util.BlackPlayerTurnQuerySpecification;
import chess.queries.util.BlackQueensQuerySpecification;
import chess.queries.util.BlackRooksQuerySpecification;
import chess.queries.util.CanAttackQuerySpecification;
import chess.queries.util.NumberOfStepsEqualsThreeQuerySpecification;
import chess.queries.util.PieceOnSquareeQuerySpecification;
import chess.queries.util.PiecesOfBlackPlayerQuerySpecification;
import chess.queries.util.PiecesOfWhitePlayerQuerySpecification;
import chess.queries.util.PiecesOnBoardQuerySpecification;
import chess.queries.util.SameColorPieceQuerySpecification;
import chess.queries.util.SquareContainsBlackPieceQuerySpecification;
import chess.queries.util.SquareContainsWhitePieceQuerySpecification;
import chess.queries.util.SquareForPieceQuerySpecification;
import chess.queries.util.WhiteBishopsQuerySpecification;
import chess.queries.util.WhiteKingsQuerySpecification;
import chess.queries.util.WhiteKnightsQuerySpecification;
import chess.queries.util.WhitePawnsQuerySpecification;
import chess.queries.util.WhitePlayerTurnQuerySpecification;
import chess.queries.util.WhiteQueensQuerySpecification;
import chess.queries.util.WhiteRooksQuerySpecification;
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
 * <li>whitePlayerTurn</li>
 * <li>blackPlayerTurn</li>
 * <li>whitePawns</li>
 * <li>numberOfStepsEqualsThree</li>
 * <li>whiteRooks</li>
 * <li>whiteKnights</li>
 * <li>whiteBishops</li>
 * <li>whiteQueens</li>
 * <li>whiteKings</li>
 * <li>blackPawns</li>
 * <li>blackRooks</li>
 * <li>blackKnights</li>
 * <li>blackBishops</li>
 * <li>blackQueens</li>
 * <li>blackKings</li>
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
    querySpecifications.add(WhitePlayerTurnQuerySpecification.instance());
    querySpecifications.add(BlackPlayerTurnQuerySpecification.instance());
    querySpecifications.add(WhitePawnsQuerySpecification.instance());
    querySpecifications.add(NumberOfStepsEqualsThreeQuerySpecification.instance());
    querySpecifications.add(WhiteRooksQuerySpecification.instance());
    querySpecifications.add(WhiteKnightsQuerySpecification.instance());
    querySpecifications.add(WhiteBishopsQuerySpecification.instance());
    querySpecifications.add(WhiteQueensQuerySpecification.instance());
    querySpecifications.add(WhiteKingsQuerySpecification.instance());
    querySpecifications.add(BlackPawnsQuerySpecification.instance());
    querySpecifications.add(BlackRooksQuerySpecification.instance());
    querySpecifications.add(BlackKnightsQuerySpecification.instance());
    querySpecifications.add(BlackBishopsQuerySpecification.instance());
    querySpecifications.add(BlackQueensQuerySpecification.instance());
    querySpecifications.add(BlackKingsQuerySpecification.instance());
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
  
  public WhitePlayerTurnQuerySpecification getWhitePlayerTurn() throws ViatraQueryException {
    return WhitePlayerTurnQuerySpecification.instance();
  }
  
  public WhitePlayerTurnMatcher getWhitePlayerTurn(final ViatraQueryEngine engine) throws ViatraQueryException {
    return WhitePlayerTurnMatcher.on(engine);
  }
  
  public BlackPlayerTurnQuerySpecification getBlackPlayerTurn() throws ViatraQueryException {
    return BlackPlayerTurnQuerySpecification.instance();
  }
  
  public BlackPlayerTurnMatcher getBlackPlayerTurn(final ViatraQueryEngine engine) throws ViatraQueryException {
    return BlackPlayerTurnMatcher.on(engine);
  }
  
  public WhitePawnsQuerySpecification getWhitePawns() throws ViatraQueryException {
    return WhitePawnsQuerySpecification.instance();
  }
  
  public WhitePawnsMatcher getWhitePawns(final ViatraQueryEngine engine) throws ViatraQueryException {
    return WhitePawnsMatcher.on(engine);
  }
  
  public NumberOfStepsEqualsThreeQuerySpecification getNumberOfStepsEqualsThree() throws ViatraQueryException {
    return NumberOfStepsEqualsThreeQuerySpecification.instance();
  }
  
  public NumberOfStepsEqualsThreeMatcher getNumberOfStepsEqualsThree(final ViatraQueryEngine engine) throws ViatraQueryException {
    return NumberOfStepsEqualsThreeMatcher.on(engine);
  }
  
  public WhiteRooksQuerySpecification getWhiteRooks() throws ViatraQueryException {
    return WhiteRooksQuerySpecification.instance();
  }
  
  public WhiteRooksMatcher getWhiteRooks(final ViatraQueryEngine engine) throws ViatraQueryException {
    return WhiteRooksMatcher.on(engine);
  }
  
  public WhiteKnightsQuerySpecification getWhiteKnights() throws ViatraQueryException {
    return WhiteKnightsQuerySpecification.instance();
  }
  
  public WhiteKnightsMatcher getWhiteKnights(final ViatraQueryEngine engine) throws ViatraQueryException {
    return WhiteKnightsMatcher.on(engine);
  }
  
  public WhiteBishopsQuerySpecification getWhiteBishops() throws ViatraQueryException {
    return WhiteBishopsQuerySpecification.instance();
  }
  
  public WhiteBishopsMatcher getWhiteBishops(final ViatraQueryEngine engine) throws ViatraQueryException {
    return WhiteBishopsMatcher.on(engine);
  }
  
  public WhiteQueensQuerySpecification getWhiteQueens() throws ViatraQueryException {
    return WhiteQueensQuerySpecification.instance();
  }
  
  public WhiteQueensMatcher getWhiteQueens(final ViatraQueryEngine engine) throws ViatraQueryException {
    return WhiteQueensMatcher.on(engine);
  }
  
  public WhiteKingsQuerySpecification getWhiteKings() throws ViatraQueryException {
    return WhiteKingsQuerySpecification.instance();
  }
  
  public WhiteKingsMatcher getWhiteKings(final ViatraQueryEngine engine) throws ViatraQueryException {
    return WhiteKingsMatcher.on(engine);
  }
  
  public BlackPawnsQuerySpecification getBlackPawns() throws ViatraQueryException {
    return BlackPawnsQuerySpecification.instance();
  }
  
  public BlackPawnsMatcher getBlackPawns(final ViatraQueryEngine engine) throws ViatraQueryException {
    return BlackPawnsMatcher.on(engine);
  }
  
  public BlackRooksQuerySpecification getBlackRooks() throws ViatraQueryException {
    return BlackRooksQuerySpecification.instance();
  }
  
  public BlackRooksMatcher getBlackRooks(final ViatraQueryEngine engine) throws ViatraQueryException {
    return BlackRooksMatcher.on(engine);
  }
  
  public BlackKnightsQuerySpecification getBlackKnights() throws ViatraQueryException {
    return BlackKnightsQuerySpecification.instance();
  }
  
  public BlackKnightsMatcher getBlackKnights(final ViatraQueryEngine engine) throws ViatraQueryException {
    return BlackKnightsMatcher.on(engine);
  }
  
  public BlackBishopsQuerySpecification getBlackBishops() throws ViatraQueryException {
    return BlackBishopsQuerySpecification.instance();
  }
  
  public BlackBishopsMatcher getBlackBishops(final ViatraQueryEngine engine) throws ViatraQueryException {
    return BlackBishopsMatcher.on(engine);
  }
  
  public BlackQueensQuerySpecification getBlackQueens() throws ViatraQueryException {
    return BlackQueensQuerySpecification.instance();
  }
  
  public BlackQueensMatcher getBlackQueens(final ViatraQueryEngine engine) throws ViatraQueryException {
    return BlackQueensMatcher.on(engine);
  }
  
  public BlackKingsQuerySpecification getBlackKings() throws ViatraQueryException {
    return BlackKingsQuerySpecification.instance();
  }
  
  public BlackKingsMatcher getBlackKings(final ViatraQueryEngine engine) throws ViatraQueryException {
    return BlackKingsMatcher.on(engine);
  }
}
