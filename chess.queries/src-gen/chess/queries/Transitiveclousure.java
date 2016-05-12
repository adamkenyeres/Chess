package chess.queries;

import chess.queries.HEastMatcher;
import chess.queries.HWestMatcher;
import chess.queries.MovesEastMatcher;
import chess.queries.MovesNorthEastMatcher;
import chess.queries.MovesNorthMatcher;
import chess.queries.MovesNorthWestMatcher;
import chess.queries.MovesSouthEastMatcher;
import chess.queries.MovesSouthMatcher;
import chess.queries.MovesSouthWestMatcher;
import chess.queries.MovesWestMatcher;
import chess.queries.NorthEastTransitiveClouserMatcher;
import chess.queries.NorthWestTransitiveClouserMatcher;
import chess.queries.SouthEastTransitiveClouserMatcher;
import chess.queries.SouthWestTransitiveClouserMatcher;
import chess.queries.TransitiveClosureEastWithPiecesMatcher;
import chess.queries.TransitiveClosureNorthEastWithPiecesMatcher;
import chess.queries.TransitiveClosureNorthWestWithPiecesMatcher;
import chess.queries.TransitiveClosureNorthWithPiecesMatcher;
import chess.queries.TransitiveClosureSouthEastWithPiecesMatcher;
import chess.queries.TransitiveClosureSouthWestWithPiecesMatcher;
import chess.queries.TransitiveClosureSouthWithPiecesMatcher;
import chess.queries.TransitiveClosureWestWithPiecesMatcher;
import chess.queries.VNorthMatcher;
import chess.queries.VSouthMatcher;
import chess.queries.util.HEastQuerySpecification;
import chess.queries.util.HWestQuerySpecification;
import chess.queries.util.MovesEastQuerySpecification;
import chess.queries.util.MovesNorthEastQuerySpecification;
import chess.queries.util.MovesNorthQuerySpecification;
import chess.queries.util.MovesNorthWestQuerySpecification;
import chess.queries.util.MovesSouthEastQuerySpecification;
import chess.queries.util.MovesSouthQuerySpecification;
import chess.queries.util.MovesSouthWestQuerySpecification;
import chess.queries.util.MovesWestQuerySpecification;
import chess.queries.util.NorthEastTransitiveClouserQuerySpecification;
import chess.queries.util.NorthWestTransitiveClouserQuerySpecification;
import chess.queries.util.SouthEastTransitiveClouserQuerySpecification;
import chess.queries.util.SouthWestTransitiveClouserQuerySpecification;
import chess.queries.util.TransitiveClosureEastWithPiecesQuerySpecification;
import chess.queries.util.TransitiveClosureNorthEastWithPiecesQuerySpecification;
import chess.queries.util.TransitiveClosureNorthWestWithPiecesQuerySpecification;
import chess.queries.util.TransitiveClosureNorthWithPiecesQuerySpecification;
import chess.queries.util.TransitiveClosureSouthEastWithPiecesQuerySpecification;
import chess.queries.util.TransitiveClosureSouthWestWithPiecesQuerySpecification;
import chess.queries.util.TransitiveClosureSouthWithPiecesQuerySpecification;
import chess.queries.util.TransitiveClosureWestWithPiecesQuerySpecification;
import chess.queries.util.VNorthQuerySpecification;
import chess.queries.util.VSouthQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;

/**
 * A pattern group formed of all patterns defined in transitiveclousure.vql.
 * 
 * <p>Use the static instance as any {@link org.eclipse.viatra.query.runtime.api.IPatternGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file transitiveclousure.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package chess.queries, the group contains the definition of the following patterns: <ul>
 * <li>vNorth</li>
 * <li>vSouth</li>
 * <li>hEast</li>
 * <li>hWest</li>
 * <li>northWestTransitiveClouser</li>
 * <li>southWestTransitiveClouser</li>
 * <li>northEastTransitiveClouser</li>
 * <li>southEastTransitiveClouser</li>
 * <li>transitiveClosureNorthWestWithPieces</li>
 * <li>transitiveClosureNorthEastWithPieces</li>
 * <li>transitiveClosureSouthWestWithPieces</li>
 * <li>transitiveClosureSouthEastWithPieces</li>
 * <li>transitiveClosureNorthWithPieces</li>
 * <li>transitiveClosureSouthWithPieces</li>
 * <li>transitiveClosureWestWithPieces</li>
 * <li>transitiveClosureEastWithPieces</li>
 * <li>movesSouthEast</li>
 * <li>movesNorthEast</li>
 * <li>movesNorthWest</li>
 * <li>movesSouthWest</li>
 * <li>movesSouth</li>
 * <li>movesNorth</li>
 * <li>movesEast</li>
 * <li>movesWest</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
public final class Transitiveclousure extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static Transitiveclousure instance() throws ViatraQueryException {
    if (INSTANCE == null) {
    	INSTANCE = new Transitiveclousure();
    }
    return INSTANCE;
  }
  
  private static Transitiveclousure INSTANCE;
  
  private Transitiveclousure() throws ViatraQueryException {
    querySpecifications.add(VNorthQuerySpecification.instance());
    querySpecifications.add(VSouthQuerySpecification.instance());
    querySpecifications.add(HEastQuerySpecification.instance());
    querySpecifications.add(HWestQuerySpecification.instance());
    querySpecifications.add(NorthWestTransitiveClouserQuerySpecification.instance());
    querySpecifications.add(SouthWestTransitiveClouserQuerySpecification.instance());
    querySpecifications.add(NorthEastTransitiveClouserQuerySpecification.instance());
    querySpecifications.add(SouthEastTransitiveClouserQuerySpecification.instance());
    querySpecifications.add(TransitiveClosureNorthWestWithPiecesQuerySpecification.instance());
    querySpecifications.add(TransitiveClosureNorthEastWithPiecesQuerySpecification.instance());
    querySpecifications.add(TransitiveClosureSouthWestWithPiecesQuerySpecification.instance());
    querySpecifications.add(TransitiveClosureSouthEastWithPiecesQuerySpecification.instance());
    querySpecifications.add(TransitiveClosureNorthWithPiecesQuerySpecification.instance());
    querySpecifications.add(TransitiveClosureSouthWithPiecesQuerySpecification.instance());
    querySpecifications.add(TransitiveClosureWestWithPiecesQuerySpecification.instance());
    querySpecifications.add(TransitiveClosureEastWithPiecesQuerySpecification.instance());
    querySpecifications.add(MovesSouthEastQuerySpecification.instance());
    querySpecifications.add(MovesNorthEastQuerySpecification.instance());
    querySpecifications.add(MovesNorthWestQuerySpecification.instance());
    querySpecifications.add(MovesSouthWestQuerySpecification.instance());
    querySpecifications.add(MovesSouthQuerySpecification.instance());
    querySpecifications.add(MovesNorthQuerySpecification.instance());
    querySpecifications.add(MovesEastQuerySpecification.instance());
    querySpecifications.add(MovesWestQuerySpecification.instance());
  }
  
  public VNorthQuerySpecification getVNorth() throws ViatraQueryException {
    return VNorthQuerySpecification.instance();
  }
  
  public VNorthMatcher getVNorth(final ViatraQueryEngine engine) throws ViatraQueryException {
    return VNorthMatcher.on(engine);
  }
  
  public VSouthQuerySpecification getVSouth() throws ViatraQueryException {
    return VSouthQuerySpecification.instance();
  }
  
  public VSouthMatcher getVSouth(final ViatraQueryEngine engine) throws ViatraQueryException {
    return VSouthMatcher.on(engine);
  }
  
  public HEastQuerySpecification getHEast() throws ViatraQueryException {
    return HEastQuerySpecification.instance();
  }
  
  public HEastMatcher getHEast(final ViatraQueryEngine engine) throws ViatraQueryException {
    return HEastMatcher.on(engine);
  }
  
  public HWestQuerySpecification getHWest() throws ViatraQueryException {
    return HWestQuerySpecification.instance();
  }
  
  public HWestMatcher getHWest(final ViatraQueryEngine engine) throws ViatraQueryException {
    return HWestMatcher.on(engine);
  }
  
  public NorthWestTransitiveClouserQuerySpecification getNorthWestTransitiveClouser() throws ViatraQueryException {
    return NorthWestTransitiveClouserQuerySpecification.instance();
  }
  
  public NorthWestTransitiveClouserMatcher getNorthWestTransitiveClouser(final ViatraQueryEngine engine) throws ViatraQueryException {
    return NorthWestTransitiveClouserMatcher.on(engine);
  }
  
  public SouthWestTransitiveClouserQuerySpecification getSouthWestTransitiveClouser() throws ViatraQueryException {
    return SouthWestTransitiveClouserQuerySpecification.instance();
  }
  
  public SouthWestTransitiveClouserMatcher getSouthWestTransitiveClouser(final ViatraQueryEngine engine) throws ViatraQueryException {
    return SouthWestTransitiveClouserMatcher.on(engine);
  }
  
  public NorthEastTransitiveClouserQuerySpecification getNorthEastTransitiveClouser() throws ViatraQueryException {
    return NorthEastTransitiveClouserQuerySpecification.instance();
  }
  
  public NorthEastTransitiveClouserMatcher getNorthEastTransitiveClouser(final ViatraQueryEngine engine) throws ViatraQueryException {
    return NorthEastTransitiveClouserMatcher.on(engine);
  }
  
  public SouthEastTransitiveClouserQuerySpecification getSouthEastTransitiveClouser() throws ViatraQueryException {
    return SouthEastTransitiveClouserQuerySpecification.instance();
  }
  
  public SouthEastTransitiveClouserMatcher getSouthEastTransitiveClouser(final ViatraQueryEngine engine) throws ViatraQueryException {
    return SouthEastTransitiveClouserMatcher.on(engine);
  }
  
  public TransitiveClosureNorthWestWithPiecesQuerySpecification getTransitiveClosureNorthWestWithPieces() throws ViatraQueryException {
    return TransitiveClosureNorthWestWithPiecesQuerySpecification.instance();
  }
  
  public TransitiveClosureNorthWestWithPiecesMatcher getTransitiveClosureNorthWestWithPieces(final ViatraQueryEngine engine) throws ViatraQueryException {
    return TransitiveClosureNorthWestWithPiecesMatcher.on(engine);
  }
  
  public TransitiveClosureNorthEastWithPiecesQuerySpecification getTransitiveClosureNorthEastWithPieces() throws ViatraQueryException {
    return TransitiveClosureNorthEastWithPiecesQuerySpecification.instance();
  }
  
  public TransitiveClosureNorthEastWithPiecesMatcher getTransitiveClosureNorthEastWithPieces(final ViatraQueryEngine engine) throws ViatraQueryException {
    return TransitiveClosureNorthEastWithPiecesMatcher.on(engine);
  }
  
  public TransitiveClosureSouthWestWithPiecesQuerySpecification getTransitiveClosureSouthWestWithPieces() throws ViatraQueryException {
    return TransitiveClosureSouthWestWithPiecesQuerySpecification.instance();
  }
  
  public TransitiveClosureSouthWestWithPiecesMatcher getTransitiveClosureSouthWestWithPieces(final ViatraQueryEngine engine) throws ViatraQueryException {
    return TransitiveClosureSouthWestWithPiecesMatcher.on(engine);
  }
  
  public TransitiveClosureSouthEastWithPiecesQuerySpecification getTransitiveClosureSouthEastWithPieces() throws ViatraQueryException {
    return TransitiveClosureSouthEastWithPiecesQuerySpecification.instance();
  }
  
  public TransitiveClosureSouthEastWithPiecesMatcher getTransitiveClosureSouthEastWithPieces(final ViatraQueryEngine engine) throws ViatraQueryException {
    return TransitiveClosureSouthEastWithPiecesMatcher.on(engine);
  }
  
  public TransitiveClosureNorthWithPiecesQuerySpecification getTransitiveClosureNorthWithPieces() throws ViatraQueryException {
    return TransitiveClosureNorthWithPiecesQuerySpecification.instance();
  }
  
  public TransitiveClosureNorthWithPiecesMatcher getTransitiveClosureNorthWithPieces(final ViatraQueryEngine engine) throws ViatraQueryException {
    return TransitiveClosureNorthWithPiecesMatcher.on(engine);
  }
  
  public TransitiveClosureSouthWithPiecesQuerySpecification getTransitiveClosureSouthWithPieces() throws ViatraQueryException {
    return TransitiveClosureSouthWithPiecesQuerySpecification.instance();
  }
  
  public TransitiveClosureSouthWithPiecesMatcher getTransitiveClosureSouthWithPieces(final ViatraQueryEngine engine) throws ViatraQueryException {
    return TransitiveClosureSouthWithPiecesMatcher.on(engine);
  }
  
  public TransitiveClosureWestWithPiecesQuerySpecification getTransitiveClosureWestWithPieces() throws ViatraQueryException {
    return TransitiveClosureWestWithPiecesQuerySpecification.instance();
  }
  
  public TransitiveClosureWestWithPiecesMatcher getTransitiveClosureWestWithPieces(final ViatraQueryEngine engine) throws ViatraQueryException {
    return TransitiveClosureWestWithPiecesMatcher.on(engine);
  }
  
  public TransitiveClosureEastWithPiecesQuerySpecification getTransitiveClosureEastWithPieces() throws ViatraQueryException {
    return TransitiveClosureEastWithPiecesQuerySpecification.instance();
  }
  
  public TransitiveClosureEastWithPiecesMatcher getTransitiveClosureEastWithPieces(final ViatraQueryEngine engine) throws ViatraQueryException {
    return TransitiveClosureEastWithPiecesMatcher.on(engine);
  }
  
  public MovesSouthEastQuerySpecification getMovesSouthEast() throws ViatraQueryException {
    return MovesSouthEastQuerySpecification.instance();
  }
  
  public MovesSouthEastMatcher getMovesSouthEast(final ViatraQueryEngine engine) throws ViatraQueryException {
    return MovesSouthEastMatcher.on(engine);
  }
  
  public MovesNorthEastQuerySpecification getMovesNorthEast() throws ViatraQueryException {
    return MovesNorthEastQuerySpecification.instance();
  }
  
  public MovesNorthEastMatcher getMovesNorthEast(final ViatraQueryEngine engine) throws ViatraQueryException {
    return MovesNorthEastMatcher.on(engine);
  }
  
  public MovesNorthWestQuerySpecification getMovesNorthWest() throws ViatraQueryException {
    return MovesNorthWestQuerySpecification.instance();
  }
  
  public MovesNorthWestMatcher getMovesNorthWest(final ViatraQueryEngine engine) throws ViatraQueryException {
    return MovesNorthWestMatcher.on(engine);
  }
  
  public MovesSouthWestQuerySpecification getMovesSouthWest() throws ViatraQueryException {
    return MovesSouthWestQuerySpecification.instance();
  }
  
  public MovesSouthWestMatcher getMovesSouthWest(final ViatraQueryEngine engine) throws ViatraQueryException {
    return MovesSouthWestMatcher.on(engine);
  }
  
  public MovesSouthQuerySpecification getMovesSouth() throws ViatraQueryException {
    return MovesSouthQuerySpecification.instance();
  }
  
  public MovesSouthMatcher getMovesSouth(final ViatraQueryEngine engine) throws ViatraQueryException {
    return MovesSouthMatcher.on(engine);
  }
  
  public MovesNorthQuerySpecification getMovesNorth() throws ViatraQueryException {
    return MovesNorthQuerySpecification.instance();
  }
  
  public MovesNorthMatcher getMovesNorth(final ViatraQueryEngine engine) throws ViatraQueryException {
    return MovesNorthMatcher.on(engine);
  }
  
  public MovesEastQuerySpecification getMovesEast() throws ViatraQueryException {
    return MovesEastQuerySpecification.instance();
  }
  
  public MovesEastMatcher getMovesEast(final ViatraQueryEngine engine) throws ViatraQueryException {
    return MovesEastMatcher.on(engine);
  }
  
  public MovesWestQuerySpecification getMovesWest() throws ViatraQueryException {
    return MovesWestQuerySpecification.instance();
  }
  
  public MovesWestMatcher getMovesWest(final ViatraQueryEngine engine) throws ViatraQueryException {
    return MovesWestMatcher.on(engine);
  }
}
