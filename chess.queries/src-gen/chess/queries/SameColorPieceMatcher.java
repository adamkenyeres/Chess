package chess.queries;

import chess.queries.SameColorPieceMatch;
import chess.queries.util.SameColorPieceQuerySpecification;
import chessdiagram.Piece;
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
 * Generated pattern matcher API of the chess.queries.sameColorPiece pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
 * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link SameColorPieceMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern sameColorPiece(piece1 : Piece, piece2 : Piece){
 * 	Piece.colour(piece1, colour);
 * 	Piece.colour(piece2, colour);
 * }
 * </pre></code>
 * 
 * @see SameColorPieceMatch
 * @see SameColorPieceProcessor
 * @see SameColorPieceQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class SameColorPieceMatcher extends BaseMatcher<SameColorPieceMatch> {
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static SameColorPieceMatcher on(final ViatraQueryEngine engine) throws ViatraQueryException {
    // check if matcher already exists
    SameColorPieceMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new SameColorPieceMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_PIECE1 = 0;
  
  private final static int POSITION_PIECE2 = 1;
  
  private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(SameColorPieceMatcher.class);
  
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  private SameColorPieceMatcher(final ViatraQueryEngine engine) throws ViatraQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pPiece1 the fixed value of pattern parameter piece1, or null if not bound.
   * @param pPiece2 the fixed value of pattern parameter piece2, or null if not bound.
   * @return matches represented as a SameColorPieceMatch object.
   * 
   */
  public Collection<SameColorPieceMatch> getAllMatches(final Piece pPiece1, final Piece pPiece2) {
    return rawGetAllMatches(new Object[]{pPiece1, pPiece2});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pPiece1 the fixed value of pattern parameter piece1, or null if not bound.
   * @param pPiece2 the fixed value of pattern parameter piece2, or null if not bound.
   * @return a match represented as a SameColorPieceMatch object, or null if no match is found.
   * 
   */
  public SameColorPieceMatch getOneArbitraryMatch(final Piece pPiece1, final Piece pPiece2) {
    return rawGetOneArbitraryMatch(new Object[]{pPiece1, pPiece2});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pPiece1 the fixed value of pattern parameter piece1, or null if not bound.
   * @param pPiece2 the fixed value of pattern parameter piece2, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Piece pPiece1, final Piece pPiece2) {
    return rawHasMatch(new Object[]{pPiece1, pPiece2});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pPiece1 the fixed value of pattern parameter piece1, or null if not bound.
   * @param pPiece2 the fixed value of pattern parameter piece2, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Piece pPiece1, final Piece pPiece2) {
    return rawCountMatches(new Object[]{pPiece1, pPiece2});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pPiece1 the fixed value of pattern parameter piece1, or null if not bound.
   * @param pPiece2 the fixed value of pattern parameter piece2, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Piece pPiece1, final Piece pPiece2, final IMatchProcessor<? super SameColorPieceMatch> processor) {
    rawForEachMatch(new Object[]{pPiece1, pPiece2}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pPiece1 the fixed value of pattern parameter piece1, or null if not bound.
   * @param pPiece2 the fixed value of pattern parameter piece2, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Piece pPiece1, final Piece pPiece2, final IMatchProcessor<? super SameColorPieceMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pPiece1, pPiece2}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pPiece1 the fixed value of pattern parameter piece1, or null if not bound.
   * @param pPiece2 the fixed value of pattern parameter piece2, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public SameColorPieceMatch newMatch(final Piece pPiece1, final Piece pPiece2) {
    return SameColorPieceMatch.newMatch(pPiece1, pPiece2);
  }
  
  /**
   * Retrieve the set of values that occur in matches for piece1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Piece> rawAccumulateAllValuesOfpiece1(final Object[] parameters) {
    Set<Piece> results = new HashSet<Piece>();
    rawAccumulateAllValues(POSITION_PIECE1, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for piece1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Piece> getAllValuesOfpiece1() {
    return rawAccumulateAllValuesOfpiece1(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for piece1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Piece> getAllValuesOfpiece1(final SameColorPieceMatch partialMatch) {
    return rawAccumulateAllValuesOfpiece1(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for piece1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Piece> getAllValuesOfpiece1(final Piece pPiece2) {
    return rawAccumulateAllValuesOfpiece1(new Object[]{
    null, 
    pPiece2
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for piece2.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Piece> rawAccumulateAllValuesOfpiece2(final Object[] parameters) {
    Set<Piece> results = new HashSet<Piece>();
    rawAccumulateAllValues(POSITION_PIECE2, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for piece2.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Piece> getAllValuesOfpiece2() {
    return rawAccumulateAllValuesOfpiece2(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for piece2.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Piece> getAllValuesOfpiece2(final SameColorPieceMatch partialMatch) {
    return rawAccumulateAllValuesOfpiece2(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for piece2.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Piece> getAllValuesOfpiece2(final Piece pPiece1) {
    return rawAccumulateAllValuesOfpiece2(new Object[]{
    pPiece1, 
    null
    });
  }
  
  @Override
  protected SameColorPieceMatch tupleToMatch(final Tuple t) {
    try {
    	return SameColorPieceMatch.newMatch((Piece) t.get(POSITION_PIECE1), (Piece) t.get(POSITION_PIECE2));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected SameColorPieceMatch arrayToMatch(final Object[] match) {
    try {
    	return SameColorPieceMatch.newMatch((Piece) match[POSITION_PIECE1], (Piece) match[POSITION_PIECE2]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected SameColorPieceMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return SameColorPieceMatch.newMutableMatch((Piece) match[POSITION_PIECE1], (Piece) match[POSITION_PIECE2]);
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
  public static IQuerySpecification<SameColorPieceMatcher> querySpecification() throws ViatraQueryException {
    return SameColorPieceQuerySpecification.instance();
  }
}
