package chess.queries;

import chess.queries.NorthWestMatch;
import chess.queries.util.NorthWestQuerySpecification;
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
 * Generated pattern matcher API of the chess.queries.northWest pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
 * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link NorthWestMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern northWest(squareSE : Square, squareNW : Square){
 * 	Square.id(squareSE, id);
 * 	//otherId == eval(id-9);
 * 	//check( ( (otherId/8)+1) == (id/8) );
 * 	otherId == eval(id-9);
 * 	otherIdRow == eval(((id-9)/8)+1);
 * 	check( otherIdRow == (id/8) );
 * 	Square.id(squareNW,otherId);
 * }
 * </pre></code>
 * 
 * @see NorthWestMatch
 * @see NorthWestProcessor
 * @see NorthWestQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class NorthWestMatcher extends BaseMatcher<NorthWestMatch> {
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static NorthWestMatcher on(final ViatraQueryEngine engine) throws ViatraQueryException {
    // check if matcher already exists
    NorthWestMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new NorthWestMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_SQUARESE = 0;
  
  private final static int POSITION_SQUARENW = 1;
  
  private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(NorthWestMatcher.class);
  
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  private NorthWestMatcher(final ViatraQueryEngine engine) throws ViatraQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pSquareSE the fixed value of pattern parameter squareSE, or null if not bound.
   * @param pSquareNW the fixed value of pattern parameter squareNW, or null if not bound.
   * @return matches represented as a NorthWestMatch object.
   * 
   */
  public Collection<NorthWestMatch> getAllMatches(final Square pSquareSE, final Square pSquareNW) {
    return rawGetAllMatches(new Object[]{pSquareSE, pSquareNW});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pSquareSE the fixed value of pattern parameter squareSE, or null if not bound.
   * @param pSquareNW the fixed value of pattern parameter squareNW, or null if not bound.
   * @return a match represented as a NorthWestMatch object, or null if no match is found.
   * 
   */
  public NorthWestMatch getOneArbitraryMatch(final Square pSquareSE, final Square pSquareNW) {
    return rawGetOneArbitraryMatch(new Object[]{pSquareSE, pSquareNW});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pSquareSE the fixed value of pattern parameter squareSE, or null if not bound.
   * @param pSquareNW the fixed value of pattern parameter squareNW, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Square pSquareSE, final Square pSquareNW) {
    return rawHasMatch(new Object[]{pSquareSE, pSquareNW});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pSquareSE the fixed value of pattern parameter squareSE, or null if not bound.
   * @param pSquareNW the fixed value of pattern parameter squareNW, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Square pSquareSE, final Square pSquareNW) {
    return rawCountMatches(new Object[]{pSquareSE, pSquareNW});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pSquareSE the fixed value of pattern parameter squareSE, or null if not bound.
   * @param pSquareNW the fixed value of pattern parameter squareNW, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Square pSquareSE, final Square pSquareNW, final IMatchProcessor<? super NorthWestMatch> processor) {
    rawForEachMatch(new Object[]{pSquareSE, pSquareNW}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pSquareSE the fixed value of pattern parameter squareSE, or null if not bound.
   * @param pSquareNW the fixed value of pattern parameter squareNW, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Square pSquareSE, final Square pSquareNW, final IMatchProcessor<? super NorthWestMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pSquareSE, pSquareNW}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pSquareSE the fixed value of pattern parameter squareSE, or null if not bound.
   * @param pSquareNW the fixed value of pattern parameter squareNW, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public NorthWestMatch newMatch(final Square pSquareSE, final Square pSquareNW) {
    return NorthWestMatch.newMatch(pSquareSE, pSquareNW);
  }
  
  /**
   * Retrieve the set of values that occur in matches for squareSE.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Square> rawAccumulateAllValuesOfsquareSE(final Object[] parameters) {
    Set<Square> results = new HashSet<Square>();
    rawAccumulateAllValues(POSITION_SQUARESE, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for squareSE.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Square> getAllValuesOfsquareSE() {
    return rawAccumulateAllValuesOfsquareSE(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for squareSE.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Square> getAllValuesOfsquareSE(final NorthWestMatch partialMatch) {
    return rawAccumulateAllValuesOfsquareSE(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for squareSE.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Square> getAllValuesOfsquareSE(final Square pSquareNW) {
    return rawAccumulateAllValuesOfsquareSE(new Object[]{
    null, 
    pSquareNW
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for squareNW.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Square> rawAccumulateAllValuesOfsquareNW(final Object[] parameters) {
    Set<Square> results = new HashSet<Square>();
    rawAccumulateAllValues(POSITION_SQUARENW, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for squareNW.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Square> getAllValuesOfsquareNW() {
    return rawAccumulateAllValuesOfsquareNW(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for squareNW.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Square> getAllValuesOfsquareNW(final NorthWestMatch partialMatch) {
    return rawAccumulateAllValuesOfsquareNW(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for squareNW.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Square> getAllValuesOfsquareNW(final Square pSquareSE) {
    return rawAccumulateAllValuesOfsquareNW(new Object[]{
    pSquareSE, 
    null
    });
  }
  
  @Override
  protected NorthWestMatch tupleToMatch(final Tuple t) {
    try {
    	return NorthWestMatch.newMatch((Square) t.get(POSITION_SQUARESE), (Square) t.get(POSITION_SQUARENW));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected NorthWestMatch arrayToMatch(final Object[] match) {
    try {
    	return NorthWestMatch.newMatch((Square) match[POSITION_SQUARESE], (Square) match[POSITION_SQUARENW]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected NorthWestMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return NorthWestMatch.newMutableMatch((Square) match[POSITION_SQUARESE], (Square) match[POSITION_SQUARENW]);
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
  public static IQuerySpecification<NorthWestMatcher> querySpecification() throws ViatraQueryException {
    return NorthWestQuerySpecification.instance();
  }
}
