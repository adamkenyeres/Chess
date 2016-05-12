package chess.queries;

import chess.queries.EastMatch;
import chess.queries.util.EastQuerySpecification;
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
 * Generated pattern matcher API of the chess.queries.east pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
 * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link EastMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern east(squareE : Square, squareW : Square){
 * 	Square.id(squareW, id);
 * 	otherId == eval(id-1);
 * 	check(otherId/8 == id/8);
 * 	Square.id(squareE, otherId);
 * }
 * </pre></code>
 * 
 * @see EastMatch
 * @see EastProcessor
 * @see EastQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class EastMatcher extends BaseMatcher<EastMatch> {
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static EastMatcher on(final ViatraQueryEngine engine) throws ViatraQueryException {
    // check if matcher already exists
    EastMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new EastMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_SQUAREE = 0;
  
  private final static int POSITION_SQUAREW = 1;
  
  private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(EastMatcher.class);
  
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  private EastMatcher(final ViatraQueryEngine engine) throws ViatraQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pSquareE the fixed value of pattern parameter squareE, or null if not bound.
   * @param pSquareW the fixed value of pattern parameter squareW, or null if not bound.
   * @return matches represented as a EastMatch object.
   * 
   */
  public Collection<EastMatch> getAllMatches(final Square pSquareE, final Square pSquareW) {
    return rawGetAllMatches(new Object[]{pSquareE, pSquareW});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pSquareE the fixed value of pattern parameter squareE, or null if not bound.
   * @param pSquareW the fixed value of pattern parameter squareW, or null if not bound.
   * @return a match represented as a EastMatch object, or null if no match is found.
   * 
   */
  public EastMatch getOneArbitraryMatch(final Square pSquareE, final Square pSquareW) {
    return rawGetOneArbitraryMatch(new Object[]{pSquareE, pSquareW});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pSquareE the fixed value of pattern parameter squareE, or null if not bound.
   * @param pSquareW the fixed value of pattern parameter squareW, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Square pSquareE, final Square pSquareW) {
    return rawHasMatch(new Object[]{pSquareE, pSquareW});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pSquareE the fixed value of pattern parameter squareE, or null if not bound.
   * @param pSquareW the fixed value of pattern parameter squareW, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Square pSquareE, final Square pSquareW) {
    return rawCountMatches(new Object[]{pSquareE, pSquareW});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pSquareE the fixed value of pattern parameter squareE, or null if not bound.
   * @param pSquareW the fixed value of pattern parameter squareW, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Square pSquareE, final Square pSquareW, final IMatchProcessor<? super EastMatch> processor) {
    rawForEachMatch(new Object[]{pSquareE, pSquareW}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pSquareE the fixed value of pattern parameter squareE, or null if not bound.
   * @param pSquareW the fixed value of pattern parameter squareW, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Square pSquareE, final Square pSquareW, final IMatchProcessor<? super EastMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pSquareE, pSquareW}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pSquareE the fixed value of pattern parameter squareE, or null if not bound.
   * @param pSquareW the fixed value of pattern parameter squareW, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public EastMatch newMatch(final Square pSquareE, final Square pSquareW) {
    return EastMatch.newMatch(pSquareE, pSquareW);
  }
  
  /**
   * Retrieve the set of values that occur in matches for squareE.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Square> rawAccumulateAllValuesOfsquareE(final Object[] parameters) {
    Set<Square> results = new HashSet<Square>();
    rawAccumulateAllValues(POSITION_SQUAREE, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for squareE.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Square> getAllValuesOfsquareE() {
    return rawAccumulateAllValuesOfsquareE(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for squareE.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Square> getAllValuesOfsquareE(final EastMatch partialMatch) {
    return rawAccumulateAllValuesOfsquareE(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for squareE.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Square> getAllValuesOfsquareE(final Square pSquareW) {
    return rawAccumulateAllValuesOfsquareE(new Object[]{
    null, 
    pSquareW
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for squareW.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Square> rawAccumulateAllValuesOfsquareW(final Object[] parameters) {
    Set<Square> results = new HashSet<Square>();
    rawAccumulateAllValues(POSITION_SQUAREW, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for squareW.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Square> getAllValuesOfsquareW() {
    return rawAccumulateAllValuesOfsquareW(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for squareW.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Square> getAllValuesOfsquareW(final EastMatch partialMatch) {
    return rawAccumulateAllValuesOfsquareW(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for squareW.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Square> getAllValuesOfsquareW(final Square pSquareE) {
    return rawAccumulateAllValuesOfsquareW(new Object[]{
    pSquareE, 
    null
    });
  }
  
  @Override
  protected EastMatch tupleToMatch(final Tuple t) {
    try {
    	return EastMatch.newMatch((Square) t.get(POSITION_SQUAREE), (Square) t.get(POSITION_SQUAREW));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected EastMatch arrayToMatch(final Object[] match) {
    try {
    	return EastMatch.newMatch((Square) match[POSITION_SQUAREE], (Square) match[POSITION_SQUAREW]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected EastMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return EastMatch.newMutableMatch((Square) match[POSITION_SQUAREE], (Square) match[POSITION_SQUAREW]);
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
  public static IQuerySpecification<EastMatcher> querySpecification() throws ViatraQueryException {
    return EastQuerySpecification.instance();
  }
}
