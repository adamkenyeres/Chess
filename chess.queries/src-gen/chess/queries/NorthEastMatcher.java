package chess.queries;

import chess.queries.NorthEastMatch;
import chess.queries.util.NorthEastQuerySpecification;
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
 * Generated pattern matcher API of the chess.queries.northEast pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
 * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link NorthEastMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern northEast(squareSW : Square, squareNE : Square){
 * 	Square.id(squareSW, id);
 * 	otherId == eval(id-7);
 * 	otherIdRow == eval(((id-7)/8)+1);
 * 	check( otherIdRow == (id/8) );
 * 	Square.id(squareNE, otherId);
 * }
 * </pre></code>
 * 
 * @see NorthEastMatch
 * @see NorthEastProcessor
 * @see NorthEastQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class NorthEastMatcher extends BaseMatcher<NorthEastMatch> {
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static NorthEastMatcher on(final ViatraQueryEngine engine) throws ViatraQueryException {
    // check if matcher already exists
    NorthEastMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new NorthEastMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_SQUARESW = 0;
  
  private final static int POSITION_SQUARENE = 1;
  
  private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(NorthEastMatcher.class);
  
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  private NorthEastMatcher(final ViatraQueryEngine engine) throws ViatraQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pSquareSW the fixed value of pattern parameter squareSW, or null if not bound.
   * @param pSquareNE the fixed value of pattern parameter squareNE, or null if not bound.
   * @return matches represented as a NorthEastMatch object.
   * 
   */
  public Collection<NorthEastMatch> getAllMatches(final Square pSquareSW, final Square pSquareNE) {
    return rawGetAllMatches(new Object[]{pSquareSW, pSquareNE});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pSquareSW the fixed value of pattern parameter squareSW, or null if not bound.
   * @param pSquareNE the fixed value of pattern parameter squareNE, or null if not bound.
   * @return a match represented as a NorthEastMatch object, or null if no match is found.
   * 
   */
  public NorthEastMatch getOneArbitraryMatch(final Square pSquareSW, final Square pSquareNE) {
    return rawGetOneArbitraryMatch(new Object[]{pSquareSW, pSquareNE});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pSquareSW the fixed value of pattern parameter squareSW, or null if not bound.
   * @param pSquareNE the fixed value of pattern parameter squareNE, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Square pSquareSW, final Square pSquareNE) {
    return rawHasMatch(new Object[]{pSquareSW, pSquareNE});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pSquareSW the fixed value of pattern parameter squareSW, or null if not bound.
   * @param pSquareNE the fixed value of pattern parameter squareNE, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Square pSquareSW, final Square pSquareNE) {
    return rawCountMatches(new Object[]{pSquareSW, pSquareNE});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pSquareSW the fixed value of pattern parameter squareSW, or null if not bound.
   * @param pSquareNE the fixed value of pattern parameter squareNE, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Square pSquareSW, final Square pSquareNE, final IMatchProcessor<? super NorthEastMatch> processor) {
    rawForEachMatch(new Object[]{pSquareSW, pSquareNE}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pSquareSW the fixed value of pattern parameter squareSW, or null if not bound.
   * @param pSquareNE the fixed value of pattern parameter squareNE, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Square pSquareSW, final Square pSquareNE, final IMatchProcessor<? super NorthEastMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pSquareSW, pSquareNE}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pSquareSW the fixed value of pattern parameter squareSW, or null if not bound.
   * @param pSquareNE the fixed value of pattern parameter squareNE, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public NorthEastMatch newMatch(final Square pSquareSW, final Square pSquareNE) {
    return NorthEastMatch.newMatch(pSquareSW, pSquareNE);
  }
  
  /**
   * Retrieve the set of values that occur in matches for squareSW.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Square> rawAccumulateAllValuesOfsquareSW(final Object[] parameters) {
    Set<Square> results = new HashSet<Square>();
    rawAccumulateAllValues(POSITION_SQUARESW, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for squareSW.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Square> getAllValuesOfsquareSW() {
    return rawAccumulateAllValuesOfsquareSW(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for squareSW.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Square> getAllValuesOfsquareSW(final NorthEastMatch partialMatch) {
    return rawAccumulateAllValuesOfsquareSW(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for squareSW.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Square> getAllValuesOfsquareSW(final Square pSquareNE) {
    return rawAccumulateAllValuesOfsquareSW(new Object[]{
    null, 
    pSquareNE
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for squareNE.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Square> rawAccumulateAllValuesOfsquareNE(final Object[] parameters) {
    Set<Square> results = new HashSet<Square>();
    rawAccumulateAllValues(POSITION_SQUARENE, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for squareNE.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Square> getAllValuesOfsquareNE() {
    return rawAccumulateAllValuesOfsquareNE(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for squareNE.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Square> getAllValuesOfsquareNE(final NorthEastMatch partialMatch) {
    return rawAccumulateAllValuesOfsquareNE(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for squareNE.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Square> getAllValuesOfsquareNE(final Square pSquareSW) {
    return rawAccumulateAllValuesOfsquareNE(new Object[]{
    pSquareSW, 
    null
    });
  }
  
  @Override
  protected NorthEastMatch tupleToMatch(final Tuple t) {
    try {
    	return NorthEastMatch.newMatch((Square) t.get(POSITION_SQUARESW), (Square) t.get(POSITION_SQUARENE));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected NorthEastMatch arrayToMatch(final Object[] match) {
    try {
    	return NorthEastMatch.newMatch((Square) match[POSITION_SQUARESW], (Square) match[POSITION_SQUARENE]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected NorthEastMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return NorthEastMatch.newMutableMatch((Square) match[POSITION_SQUARESW], (Square) match[POSITION_SQUARENE]);
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
  public static IQuerySpecification<NorthEastMatcher> querySpecification() throws ViatraQueryException {
    return NorthEastQuerySpecification.instance();
  }
}
