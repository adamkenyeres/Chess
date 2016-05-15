package chess.queries;

import chess.queries.TransitiveClosureNorthWestWithPiecesMatch;
import chess.queries.util.TransitiveClosureNorthWestWithPiecesQuerySpecification;
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
 * Generated pattern matcher API of the chess.queries.transitiveClosureNorthWestWithPieces pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
 * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link TransitiveClosureNorthWestWithPiecesMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * {@literal @}QueryExplorer(checked = false)
 * pattern
 * transitiveClosureNorthWestWithPieces(start : Square, end : Square, square : Square) {
 * 	find NW +(start, square);
 * 	Square.id(start, startId);
 * 	Square.id(end, endId);
 * 	Square.id(square, squareId);
 * 	check(squareId {@literal <} startId);
 * 	check(squareId {@literal >} endId);
 * 	check(startId {@literal >} endId);
 * 	find pieceOnSquaree(square);
 * 	Chess.square(_,square);
 * 	Chess.square(_,end);
 * }
 * </pre></code>
 * 
 * @see TransitiveClosureNorthWestWithPiecesMatch
 * @see TransitiveClosureNorthWestWithPiecesProcessor
 * @see TransitiveClosureNorthWestWithPiecesQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class TransitiveClosureNorthWestWithPiecesMatcher extends BaseMatcher<TransitiveClosureNorthWestWithPiecesMatch> {
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static TransitiveClosureNorthWestWithPiecesMatcher on(final ViatraQueryEngine engine) throws ViatraQueryException {
    // check if matcher already exists
    TransitiveClosureNorthWestWithPiecesMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new TransitiveClosureNorthWestWithPiecesMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_START = 0;
  
  private final static int POSITION_END = 1;
  
  private final static int POSITION_SQUARE = 2;
  
  private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(TransitiveClosureNorthWestWithPiecesMatcher.class);
  
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  private TransitiveClosureNorthWestWithPiecesMatcher(final ViatraQueryEngine engine) throws ViatraQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pStart the fixed value of pattern parameter start, or null if not bound.
   * @param pEnd the fixed value of pattern parameter end, or null if not bound.
   * @param pSquare the fixed value of pattern parameter square, or null if not bound.
   * @return matches represented as a TransitiveClosureNorthWestWithPiecesMatch object.
   * 
   */
  public Collection<TransitiveClosureNorthWestWithPiecesMatch> getAllMatches(final Square pStart, final Square pEnd, final Square pSquare) {
    return rawGetAllMatches(new Object[]{pStart, pEnd, pSquare});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pStart the fixed value of pattern parameter start, or null if not bound.
   * @param pEnd the fixed value of pattern parameter end, or null if not bound.
   * @param pSquare the fixed value of pattern parameter square, or null if not bound.
   * @return a match represented as a TransitiveClosureNorthWestWithPiecesMatch object, or null if no match is found.
   * 
   */
  public TransitiveClosureNorthWestWithPiecesMatch getOneArbitraryMatch(final Square pStart, final Square pEnd, final Square pSquare) {
    return rawGetOneArbitraryMatch(new Object[]{pStart, pEnd, pSquare});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pStart the fixed value of pattern parameter start, or null if not bound.
   * @param pEnd the fixed value of pattern parameter end, or null if not bound.
   * @param pSquare the fixed value of pattern parameter square, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Square pStart, final Square pEnd, final Square pSquare) {
    return rawHasMatch(new Object[]{pStart, pEnd, pSquare});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pStart the fixed value of pattern parameter start, or null if not bound.
   * @param pEnd the fixed value of pattern parameter end, or null if not bound.
   * @param pSquare the fixed value of pattern parameter square, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Square pStart, final Square pEnd, final Square pSquare) {
    return rawCountMatches(new Object[]{pStart, pEnd, pSquare});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pStart the fixed value of pattern parameter start, or null if not bound.
   * @param pEnd the fixed value of pattern parameter end, or null if not bound.
   * @param pSquare the fixed value of pattern parameter square, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Square pStart, final Square pEnd, final Square pSquare, final IMatchProcessor<? super TransitiveClosureNorthWestWithPiecesMatch> processor) {
    rawForEachMatch(new Object[]{pStart, pEnd, pSquare}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pStart the fixed value of pattern parameter start, or null if not bound.
   * @param pEnd the fixed value of pattern parameter end, or null if not bound.
   * @param pSquare the fixed value of pattern parameter square, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Square pStart, final Square pEnd, final Square pSquare, final IMatchProcessor<? super TransitiveClosureNorthWestWithPiecesMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pStart, pEnd, pSquare}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pStart the fixed value of pattern parameter start, or null if not bound.
   * @param pEnd the fixed value of pattern parameter end, or null if not bound.
   * @param pSquare the fixed value of pattern parameter square, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public TransitiveClosureNorthWestWithPiecesMatch newMatch(final Square pStart, final Square pEnd, final Square pSquare) {
    return TransitiveClosureNorthWestWithPiecesMatch.newMatch(pStart, pEnd, pSquare);
  }
  
  /**
   * Retrieve the set of values that occur in matches for start.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Square> rawAccumulateAllValuesOfstart(final Object[] parameters) {
    Set<Square> results = new HashSet<Square>();
    rawAccumulateAllValues(POSITION_START, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for start.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Square> getAllValuesOfstart() {
    return rawAccumulateAllValuesOfstart(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for start.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Square> getAllValuesOfstart(final TransitiveClosureNorthWestWithPiecesMatch partialMatch) {
    return rawAccumulateAllValuesOfstart(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for start.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Square> getAllValuesOfstart(final Square pEnd, final Square pSquare) {
    return rawAccumulateAllValuesOfstart(new Object[]{
    null, 
    pEnd, 
    pSquare
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for end.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Square> rawAccumulateAllValuesOfend(final Object[] parameters) {
    Set<Square> results = new HashSet<Square>();
    rawAccumulateAllValues(POSITION_END, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for end.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Square> getAllValuesOfend() {
    return rawAccumulateAllValuesOfend(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for end.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Square> getAllValuesOfend(final TransitiveClosureNorthWestWithPiecesMatch partialMatch) {
    return rawAccumulateAllValuesOfend(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for end.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Square> getAllValuesOfend(final Square pStart, final Square pSquare) {
    return rawAccumulateAllValuesOfend(new Object[]{
    pStart, 
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
  public Set<Square> getAllValuesOfsquare(final TransitiveClosureNorthWestWithPiecesMatch partialMatch) {
    return rawAccumulateAllValuesOfsquare(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for square.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Square> getAllValuesOfsquare(final Square pStart, final Square pEnd) {
    return rawAccumulateAllValuesOfsquare(new Object[]{
    pStart, 
    pEnd, 
    null
    });
  }
  
  @Override
  protected TransitiveClosureNorthWestWithPiecesMatch tupleToMatch(final Tuple t) {
    try {
    	return TransitiveClosureNorthWestWithPiecesMatch.newMatch((Square) t.get(POSITION_START), (Square) t.get(POSITION_END), (Square) t.get(POSITION_SQUARE));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected TransitiveClosureNorthWestWithPiecesMatch arrayToMatch(final Object[] match) {
    try {
    	return TransitiveClosureNorthWestWithPiecesMatch.newMatch((Square) match[POSITION_START], (Square) match[POSITION_END], (Square) match[POSITION_SQUARE]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected TransitiveClosureNorthWestWithPiecesMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return TransitiveClosureNorthWestWithPiecesMatch.newMutableMatch((Square) match[POSITION_START], (Square) match[POSITION_END], (Square) match[POSITION_SQUARE]);
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
  public static IQuerySpecification<TransitiveClosureNorthWestWithPiecesMatcher> querySpecification() throws ViatraQueryException {
    return TransitiveClosureNorthWestWithPiecesQuerySpecification.instance();
  }
}
