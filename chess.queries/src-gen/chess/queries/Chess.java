package chess.queries;

import chess.queries.AllMovesNoChessMatcher;
import chess.queries.InChessBlackMatcher;
import chess.queries.InChessMatcher;
import chess.queries.InChessWhiteMatcher;
import chess.queries.WhiteCheckmateMatcher;
import chess.queries.util.AllMovesNoChessQuerySpecification;
import chess.queries.util.InChessBlackQuerySpecification;
import chess.queries.util.InChessQuerySpecification;
import chess.queries.util.InChessWhiteQuerySpecification;
import chess.queries.util.WhiteCheckmateQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;

/**
 * A pattern group formed of all patterns defined in chess.vql.
 * 
 * <p>Use the static instance as any {@link org.eclipse.viatra.query.runtime.api.IPatternGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file chess.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package chess.queries, the group contains the definition of the following patterns: <ul>
 * <li>allMovesNoChess</li>
 * <li>inChess</li>
 * <li>inChessWhite</li>
 * <li>inChessBlack</li>
 * <li>whiteCheckmate</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
public final class Chess extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static Chess instance() throws ViatraQueryException {
    if (INSTANCE == null) {
    	INSTANCE = new Chess();
    }
    return INSTANCE;
  }
  
  private static Chess INSTANCE;
  
  private Chess() throws ViatraQueryException {
    querySpecifications.add(AllMovesNoChessQuerySpecification.instance());
    querySpecifications.add(InChessQuerySpecification.instance());
    querySpecifications.add(InChessWhiteQuerySpecification.instance());
    querySpecifications.add(InChessBlackQuerySpecification.instance());
    querySpecifications.add(WhiteCheckmateQuerySpecification.instance());
  }
  
  public AllMovesNoChessQuerySpecification getAllMovesNoChess() throws ViatraQueryException {
    return AllMovesNoChessQuerySpecification.instance();
  }
  
  public AllMovesNoChessMatcher getAllMovesNoChess(final ViatraQueryEngine engine) throws ViatraQueryException {
    return AllMovesNoChessMatcher.on(engine);
  }
  
  public InChessQuerySpecification getInChess() throws ViatraQueryException {
    return InChessQuerySpecification.instance();
  }
  
  public InChessMatcher getInChess(final ViatraQueryEngine engine) throws ViatraQueryException {
    return InChessMatcher.on(engine);
  }
  
  public InChessWhiteQuerySpecification getInChessWhite() throws ViatraQueryException {
    return InChessWhiteQuerySpecification.instance();
  }
  
  public InChessWhiteMatcher getInChessWhite(final ViatraQueryEngine engine) throws ViatraQueryException {
    return InChessWhiteMatcher.on(engine);
  }
  
  public InChessBlackQuerySpecification getInChessBlack() throws ViatraQueryException {
    return InChessBlackQuerySpecification.instance();
  }
  
  public InChessBlackMatcher getInChessBlack(final ViatraQueryEngine engine) throws ViatraQueryException {
    return InChessBlackMatcher.on(engine);
  }
  
  public WhiteCheckmateQuerySpecification getWhiteCheckmate() throws ViatraQueryException {
    return WhiteCheckmateQuerySpecification.instance();
  }
  
  public WhiteCheckmateMatcher getWhiteCheckmate(final ViatraQueryEngine engine) throws ViatraQueryException {
    return WhiteCheckmateMatcher.on(engine);
  }
}
