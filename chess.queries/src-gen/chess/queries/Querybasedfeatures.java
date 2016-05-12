package chess.queries;

import chess.queries.AsdasdMatcher;
import chess.queries.EMatcher;
import chess.queries.EastMatcher;
import chess.queries.NEMatcher;
import chess.queries.NMatcher;
import chess.queries.NWMatcher;
import chess.queries.NorthEastMatcher;
import chess.queries.NorthMatcher;
import chess.queries.NorthWestMatcher;
import chess.queries.PieceMatcher;
import chess.queries.PieceOnSquareMatcher;
import chess.queries.SEMatcher;
import chess.queries.SMatcher;
import chess.queries.SWMatcher;
import chess.queries.SquareMatcher;
import chess.queries.WMatcher;
import chess.queries.util.AsdasdQuerySpecification;
import chess.queries.util.EQuerySpecification;
import chess.queries.util.EastQuerySpecification;
import chess.queries.util.NEQuerySpecification;
import chess.queries.util.NQuerySpecification;
import chess.queries.util.NWQuerySpecification;
import chess.queries.util.NorthEastQuerySpecification;
import chess.queries.util.NorthQuerySpecification;
import chess.queries.util.NorthWestQuerySpecification;
import chess.queries.util.PieceOnSquareQuerySpecification;
import chess.queries.util.PieceQuerySpecification;
import chess.queries.util.SEQuerySpecification;
import chess.queries.util.SQuerySpecification;
import chess.queries.util.SWQuerySpecification;
import chess.queries.util.SquareQuerySpecification;
import chess.queries.util.WQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;

/**
 * A pattern group formed of all patterns defined in querybasedfeatures.vql.
 * 
 * <p>Use the static instance as any {@link org.eclipse.viatra.query.runtime.api.IPatternGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file querybasedfeatures.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package chess.queries, the group contains the definition of the following patterns: <ul>
 * <li>north</li>
 * <li>pieceOnSquare</li>
 * <li>east</li>
 * <li>asdasd</li>
 * <li>northWest</li>
 * <li>northEast</li>
 * <li>E</li>
 * <li>W</li>
 * <li>N</li>
 * <li>S</li>
 * <li>NW</li>
 * <li>SE</li>
 * <li>NE</li>
 * <li>SW</li>
 * <li>square</li>
 * <li>piece</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
public final class Querybasedfeatures extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static Querybasedfeatures instance() throws ViatraQueryException {
    if (INSTANCE == null) {
    	INSTANCE = new Querybasedfeatures();
    }
    return INSTANCE;
  }
  
  private static Querybasedfeatures INSTANCE;
  
  private Querybasedfeatures() throws ViatraQueryException {
    querySpecifications.add(NorthQuerySpecification.instance());
    querySpecifications.add(PieceOnSquareQuerySpecification.instance());
    querySpecifications.add(EastQuerySpecification.instance());
    querySpecifications.add(AsdasdQuerySpecification.instance());
    querySpecifications.add(NorthWestQuerySpecification.instance());
    querySpecifications.add(NorthEastQuerySpecification.instance());
    querySpecifications.add(EQuerySpecification.instance());
    querySpecifications.add(WQuerySpecification.instance());
    querySpecifications.add(NQuerySpecification.instance());
    querySpecifications.add(SQuerySpecification.instance());
    querySpecifications.add(NWQuerySpecification.instance());
    querySpecifications.add(SEQuerySpecification.instance());
    querySpecifications.add(NEQuerySpecification.instance());
    querySpecifications.add(SWQuerySpecification.instance());
    querySpecifications.add(SquareQuerySpecification.instance());
    querySpecifications.add(PieceQuerySpecification.instance());
  }
  
  public NorthQuerySpecification getNorth() throws ViatraQueryException {
    return NorthQuerySpecification.instance();
  }
  
  public NorthMatcher getNorth(final ViatraQueryEngine engine) throws ViatraQueryException {
    return NorthMatcher.on(engine);
  }
  
  public PieceOnSquareQuerySpecification getPieceOnSquare() throws ViatraQueryException {
    return PieceOnSquareQuerySpecification.instance();
  }
  
  public PieceOnSquareMatcher getPieceOnSquare(final ViatraQueryEngine engine) throws ViatraQueryException {
    return PieceOnSquareMatcher.on(engine);
  }
  
  public EastQuerySpecification getEast() throws ViatraQueryException {
    return EastQuerySpecification.instance();
  }
  
  public EastMatcher getEast(final ViatraQueryEngine engine) throws ViatraQueryException {
    return EastMatcher.on(engine);
  }
  
  public AsdasdQuerySpecification getAsdasd() throws ViatraQueryException {
    return AsdasdQuerySpecification.instance();
  }
  
  public AsdasdMatcher getAsdasd(final ViatraQueryEngine engine) throws ViatraQueryException {
    return AsdasdMatcher.on(engine);
  }
  
  public NorthWestQuerySpecification getNorthWest() throws ViatraQueryException {
    return NorthWestQuerySpecification.instance();
  }
  
  public NorthWestMatcher getNorthWest(final ViatraQueryEngine engine) throws ViatraQueryException {
    return NorthWestMatcher.on(engine);
  }
  
  public NorthEastQuerySpecification getNorthEast() throws ViatraQueryException {
    return NorthEastQuerySpecification.instance();
  }
  
  public NorthEastMatcher getNorthEast(final ViatraQueryEngine engine) throws ViatraQueryException {
    return NorthEastMatcher.on(engine);
  }
  
  public EQuerySpecification getE() throws ViatraQueryException {
    return EQuerySpecification.instance();
  }
  
  public EMatcher getE(final ViatraQueryEngine engine) throws ViatraQueryException {
    return EMatcher.on(engine);
  }
  
  public WQuerySpecification getW() throws ViatraQueryException {
    return WQuerySpecification.instance();
  }
  
  public WMatcher getW(final ViatraQueryEngine engine) throws ViatraQueryException {
    return WMatcher.on(engine);
  }
  
  public NQuerySpecification getN() throws ViatraQueryException {
    return NQuerySpecification.instance();
  }
  
  public NMatcher getN(final ViatraQueryEngine engine) throws ViatraQueryException {
    return NMatcher.on(engine);
  }
  
  public SQuerySpecification getS() throws ViatraQueryException {
    return SQuerySpecification.instance();
  }
  
  public SMatcher getS(final ViatraQueryEngine engine) throws ViatraQueryException {
    return SMatcher.on(engine);
  }
  
  public NWQuerySpecification getNW() throws ViatraQueryException {
    return NWQuerySpecification.instance();
  }
  
  public NWMatcher getNW(final ViatraQueryEngine engine) throws ViatraQueryException {
    return NWMatcher.on(engine);
  }
  
  public SEQuerySpecification getSE() throws ViatraQueryException {
    return SEQuerySpecification.instance();
  }
  
  public SEMatcher getSE(final ViatraQueryEngine engine) throws ViatraQueryException {
    return SEMatcher.on(engine);
  }
  
  public NEQuerySpecification getNE() throws ViatraQueryException {
    return NEQuerySpecification.instance();
  }
  
  public NEMatcher getNE(final ViatraQueryEngine engine) throws ViatraQueryException {
    return NEMatcher.on(engine);
  }
  
  public SWQuerySpecification getSW() throws ViatraQueryException {
    return SWQuerySpecification.instance();
  }
  
  public SWMatcher getSW(final ViatraQueryEngine engine) throws ViatraQueryException {
    return SWMatcher.on(engine);
  }
  
  public SquareQuerySpecification getSquare() throws ViatraQueryException {
    return SquareQuerySpecification.instance();
  }
  
  public SquareMatcher getSquare(final ViatraQueryEngine engine) throws ViatraQueryException {
    return SquareMatcher.on(engine);
  }
  
  public PieceQuerySpecification getPiece() throws ViatraQueryException {
    return PieceQuerySpecification.instance();
  }
  
  public PieceMatcher getPiece(final ViatraQueryEngine engine) throws ViatraQueryException {
    return PieceMatcher.on(engine);
  }
}
