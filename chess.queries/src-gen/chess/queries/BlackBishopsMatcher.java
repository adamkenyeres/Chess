package chess.queries;

import chess.queries.BlackBishopsMatch;
import chess.queries.util.BlackBishopsQuerySpecification;
import chessdiagram.Bishop;
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
 * Generated pattern matcher API of the chess.queries.blackBishops pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
 * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link BlackBishopsMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern blackBishops(bishop : Bishop) {
 * 	Bishop.colour(bishop, ::Black);
 * }
 * </pre></code>
 * 
 * @see BlackBishopsMatch
 * @see BlackBishopsProcessor
 * @see BlackBishopsQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class BlackBishopsMatcher extends BaseMatcher<BlackBishopsMatch> {
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static BlackBishopsMatcher on(final ViatraQueryEngine engine) throws ViatraQueryException {
    // check if matcher already exists
    BlackBishopsMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new BlackBishopsMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_BISHOP = 0;
  
  private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(BlackBishopsMatcher.class);
  
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  private BlackBishopsMatcher(final ViatraQueryEngine engine) throws ViatraQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pBishop the fixed value of pattern parameter bishop, or null if not bound.
   * @return matches represented as a BlackBishopsMatch object.
   * 
   */
  public Collection<BlackBishopsMatch> getAllMatches(final Bishop pBishop) {
    return rawGetAllMatches(new Object[]{pBishop});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pBishop the fixed value of pattern parameter bishop, or null if not bound.
   * @return a match represented as a BlackBishopsMatch object, or null if no match is found.
   * 
   */
  public BlackBishopsMatch getOneArbitraryMatch(final Bishop pBishop) {
    return rawGetOneArbitraryMatch(new Object[]{pBishop});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pBishop the fixed value of pattern parameter bishop, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Bishop pBishop) {
    return rawHasMatch(new Object[]{pBishop});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pBishop the fixed value of pattern parameter bishop, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Bishop pBishop) {
    return rawCountMatches(new Object[]{pBishop});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pBishop the fixed value of pattern parameter bishop, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Bishop pBishop, final IMatchProcessor<? super BlackBishopsMatch> processor) {
    rawForEachMatch(new Object[]{pBishop}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pBishop the fixed value of pattern parameter bishop, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Bishop pBishop, final IMatchProcessor<? super BlackBishopsMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pBishop}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pBishop the fixed value of pattern parameter bishop, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public BlackBishopsMatch newMatch(final Bishop pBishop) {
    return BlackBishopsMatch.newMatch(pBishop);
  }
  
  /**
   * Retrieve the set of values that occur in matches for bishop.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Bishop> rawAccumulateAllValuesOfbishop(final Object[] parameters) {
    Set<Bishop> results = new HashSet<Bishop>();
    rawAccumulateAllValues(POSITION_BISHOP, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for bishop.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Bishop> getAllValuesOfbishop() {
    return rawAccumulateAllValuesOfbishop(emptyArray());
  }
  
  @Override
  protected BlackBishopsMatch tupleToMatch(final Tuple t) {
    try {
    	return BlackBishopsMatch.newMatch((Bishop) t.get(POSITION_BISHOP));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected BlackBishopsMatch arrayToMatch(final Object[] match) {
    try {
    	return BlackBishopsMatch.newMatch((Bishop) match[POSITION_BISHOP]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected BlackBishopsMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return BlackBishopsMatch.newMutableMatch((Bishop) match[POSITION_BISHOP]);
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
  public static IQuerySpecification<BlackBishopsMatcher> querySpecification() throws ViatraQueryException {
    return BlackBishopsQuerySpecification.instance();
  }
}
