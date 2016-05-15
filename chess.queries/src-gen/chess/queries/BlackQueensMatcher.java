package chess.queries;

import chess.queries.BlackQueensMatch;
import chess.queries.util.BlackQueensQuerySpecification;
import chessdiagram.Queen;
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
 * Generated pattern matcher API of the chess.queries.blackQueens pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
 * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link BlackQueensMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern blackQueens(queen : Queen) {
 * 	Queen.colour(queen, ::Black);
 * }
 * </pre></code>
 * 
 * @see BlackQueensMatch
 * @see BlackQueensProcessor
 * @see BlackQueensQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class BlackQueensMatcher extends BaseMatcher<BlackQueensMatch> {
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static BlackQueensMatcher on(final ViatraQueryEngine engine) throws ViatraQueryException {
    // check if matcher already exists
    BlackQueensMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new BlackQueensMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_QUEEN = 0;
  
  private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(BlackQueensMatcher.class);
  
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  private BlackQueensMatcher(final ViatraQueryEngine engine) throws ViatraQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pQueen the fixed value of pattern parameter queen, or null if not bound.
   * @return matches represented as a BlackQueensMatch object.
   * 
   */
  public Collection<BlackQueensMatch> getAllMatches(final Queen pQueen) {
    return rawGetAllMatches(new Object[]{pQueen});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pQueen the fixed value of pattern parameter queen, or null if not bound.
   * @return a match represented as a BlackQueensMatch object, or null if no match is found.
   * 
   */
  public BlackQueensMatch getOneArbitraryMatch(final Queen pQueen) {
    return rawGetOneArbitraryMatch(new Object[]{pQueen});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pQueen the fixed value of pattern parameter queen, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Queen pQueen) {
    return rawHasMatch(new Object[]{pQueen});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pQueen the fixed value of pattern parameter queen, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Queen pQueen) {
    return rawCountMatches(new Object[]{pQueen});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pQueen the fixed value of pattern parameter queen, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Queen pQueen, final IMatchProcessor<? super BlackQueensMatch> processor) {
    rawForEachMatch(new Object[]{pQueen}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pQueen the fixed value of pattern parameter queen, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Queen pQueen, final IMatchProcessor<? super BlackQueensMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pQueen}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pQueen the fixed value of pattern parameter queen, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public BlackQueensMatch newMatch(final Queen pQueen) {
    return BlackQueensMatch.newMatch(pQueen);
  }
  
  /**
   * Retrieve the set of values that occur in matches for queen.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Queen> rawAccumulateAllValuesOfqueen(final Object[] parameters) {
    Set<Queen> results = new HashSet<Queen>();
    rawAccumulateAllValues(POSITION_QUEEN, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for queen.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Queen> getAllValuesOfqueen() {
    return rawAccumulateAllValuesOfqueen(emptyArray());
  }
  
  @Override
  protected BlackQueensMatch tupleToMatch(final Tuple t) {
    try {
    	return BlackQueensMatch.newMatch((Queen) t.get(POSITION_QUEEN));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected BlackQueensMatch arrayToMatch(final Object[] match) {
    try {
    	return BlackQueensMatch.newMatch((Queen) match[POSITION_QUEEN]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected BlackQueensMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return BlackQueensMatch.newMutableMatch((Queen) match[POSITION_QUEEN]);
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
  public static IQuerySpecification<BlackQueensMatcher> querySpecification() throws ViatraQueryException {
    return BlackQueensQuerySpecification.instance();
  }
}
