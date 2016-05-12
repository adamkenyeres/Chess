package chess.queries;

import chess.queries.HorizontalRookMovesMatch;
import chess.queries.util.HorizontalRookMovesQuerySpecification;
import chessdiagram.Piece;
import chessdiagram.Square;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.apache.log4j.Logger;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseMatcher;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;

/**
 * Generated pattern matcher API of the chess.queries.horizontalRookMoves pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
 * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link HorizontalRookMovesMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * //comment added
 * 
 * pattern horizontalRookMoves(rook : Piece, square :Square){
 * 	find square(rook, rookSquare);
 * 	find movesEast(rookSquare,_sq, square);
 * 	neg find pieceOnSquaree(square);
 * }or{
 * 	find square(rook, rookSquare);
 * 	find movesEast(rookSquare,_sq, square);
 * 	find pieceOnSquare(square, piece);
 * 	find canAttack(rook, piece);
 * }or{
 * 	find square(rook, rookSquare);
 * 	find movesWest(rookSquare,_sq, square);
 * 	neg find pieceOnSquaree(square);
 * }or{
 * 	find square(rook, rookSquare);
 * 	find movesWest(rookSquare,_sq, square);
 * 	find pieceOnSquare(square, piece);
 * 	find canAttack(rook, piece);
 * }
 * </pre></code>
 * 
 * @see HorizontalRookMovesMatch
 * @see HorizontalRookMovesProcessor
 * @see HorizontalRookMovesQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class HorizontalRookMovesMatcher extends BaseMatcher<HorizontalRookMovesMatch> {
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static HorizontalRookMovesMatcher on(final ViatraQueryEngine engine) throws ViatraQueryException {
    // check if matcher already exists
    HorizontalRookMovesMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new HorizontalRookMovesMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_ROOK = 0;
  
  private final static int POSITION_SQUARE = 1;
  
  private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(HorizontalRookMovesMatcher.class);
  
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  private HorizontalRookMovesMatcher(final ViatraQueryEngine engine) throws ViatraQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pRook the fixed value of pattern parameter rook, or null if not bound.
   * @param pSquare the fixed value of pattern parameter square, or null if not bound.
   * @return matches represented as a HorizontalRookMovesMatch object.
   * 
   */
  public Collection<HorizontalRookMovesMatch> getAllMatches(final Piece pRook, final Square pSquare) {
    return rawGetAllMatches(new Object[]{pRook, pSquare});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pRook the fixed value of pattern parameter rook, or null if not bound.
   * @param pSquare the fixed value of pattern parameter square, or null if not bound.
   * @return a match represented as a HorizontalRookMovesMatch object, or null if no match is found.
   * 
   */
  public HorizontalRookMovesMatch getOneArbitraryMatch(final Piece pRook, final Square pSquare) {
    return rawGetOneArbitraryMatch(new Object[]{pRook, pSquare});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pRook the fixed value of pattern parameter rook, or null if not bound.
   * @param pSquare the fixed value of pattern parameter square, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Piece pRook, final Square pSquare) {
    return rawHasMatch(new Object[]{pRook, pSquare});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pRook the fixed value of pattern parameter rook, or null if not bound.
   * @param pSquare the fixed value of pattern parameter square, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Piece pRook, final Square pSquare) {
    return rawCountMatches(new Object[]{pRook, pSquare});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pRook the fixed value of pattern parameter rook, or null if not bound.
   * @param pSquare the fixed value of pattern parameter square, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Piece pRook, final Square pSquare, final IMatchProcessor<? super HorizontalRookMovesMatch> processor) {
    rawForEachMatch(new Object[]{pRook, pSquare}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pRook the fixed value of pattern parameter rook, or null if not bound.
   * @param pSquare the fixed value of pattern parameter square, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Piece pRook, final Square pSquare, final IMatchProcessor<? super HorizontalRookMovesMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pRook, pSquare}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pRook the fixed value of pattern parameter rook, or null if not bound.
   * @param pSquare the fixed value of pattern parameter square, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public HorizontalRookMovesMatch newMatch(final Piece pRook, final Square pSquare) {
    return HorizontalRookMovesMatch.newMatch(pRook, pSquare);
  }
  
  /**
   * Retrieve the set of values that occur in matches for rook.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Piece> rawAccumulateAllValuesOfrook(final Object[] parameters) {
    Set<Piece> results = new HashSet<Piece>();
    rawAccumulateAllValues(POSITION_ROOK, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for rook.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Piece> getAllValuesOfrook() {
    return rawAccumulateAllValuesOfrook(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for rook.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Piece> getAllValuesOfrook(final HorizontalRookMovesMatch partialMatch) {
    return rawAccumulateAllValuesOfrook(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for rook.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Piece> getAllValuesOfrook(final Square pSquare) {
    return rawAccumulateAllValuesOfrook(new Object[]{
    null, 
    pSquare
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for square.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Square> rawAccumulateAllValuesOfsquare(final Object[] parameters) {
    Set<Square> results = new HashSet<Square>();
    rawAccumulateAllValues(POSITION_SQUARE, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for square.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Square> getAllValuesOfsquare() {
    return rawAccumulateAllValuesOfsquare(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for square.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Square> getAllValuesOfsquare(final HorizontalRookMovesMatch partialMatch) {
    return rawAccumulateAllValuesOfsquare(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for square.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Square> getAllValuesOfsquare(final Piece pRook) {
    return rawAccumulateAllValuesOfsquare(new Object[]{
    pRook, 
    null
    });
  }
  
  @Override
  protected HorizontalRookMovesMatch tupleToMatch(final Tuple t) {
    try {
    	return HorizontalRookMovesMatch.newMatch((Piece) t.get(POSITION_ROOK), (Square) t.get(POSITION_SQUARE));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected HorizontalRookMovesMatch arrayToMatch(final Object[] match) {
    try {
    	return HorizontalRookMovesMatch.newMatch((Piece) match[POSITION_ROOK], (Square) match[POSITION_SQUARE]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected HorizontalRookMovesMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return HorizontalRookMovesMatch.newMutableMatch((Piece) match[POSITION_ROOK], (Square) match[POSITION_SQUARE]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  /**
   * @return the singleton instance of the query specification of this pattern
   * @throws ViatraQueryException if the pattern definition could not be loaded
   * 
   */
  public static IQuerySpecification<HorizontalRookMovesMatcher> querySpecification() throws ViatraQueryException {
    return HorizontalRookMovesQuerySpecification.instance();
  }
}
