package chess.queries;

import chess.queries.WhiteKingsMatch;
import chess.queries.util.WhiteKingsQuerySpecification;
import chessdiagram.King;
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
 * Generated pattern matcher API of the chess.queries.whiteKings pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
 * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link WhiteKingsMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern whiteKings(king : King) {
 * 	King.colour(king, ::White);
 * }
 * </pre></code>
 * 
 * @see WhiteKingsMatch
 * @see WhiteKingsProcessor
 * @see WhiteKingsQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class WhiteKingsMatcher extends BaseMatcher<WhiteKingsMatch> {
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static WhiteKingsMatcher on(final ViatraQueryEngine engine) throws ViatraQueryException {
    // check if matcher already exists
    WhiteKingsMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new WhiteKingsMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_KING = 0;
  
  private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(WhiteKingsMatcher.class);
  
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  private WhiteKingsMatcher(final ViatraQueryEngine engine) throws ViatraQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pKing the fixed value of pattern parameter king, or null if not bound.
   * @return matches represented as a WhiteKingsMatch object.
   * 
   */
  public Collection<WhiteKingsMatch> getAllMatches(final King pKing) {
    return rawGetAllMatches(new Object[]{pKing});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pKing the fixed value of pattern parameter king, or null if not bound.
   * @return a match represented as a WhiteKingsMatch object, or null if no match is found.
   * 
   */
  public WhiteKingsMatch getOneArbitraryMatch(final King pKing) {
    return rawGetOneArbitraryMatch(new Object[]{pKing});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pKing the fixed value of pattern parameter king, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final King pKing) {
    return rawHasMatch(new Object[]{pKing});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pKing the fixed value of pattern parameter king, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final King pKing) {
    return rawCountMatches(new Object[]{pKing});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pKing the fixed value of pattern parameter king, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final King pKing, final IMatchProcessor<? super WhiteKingsMatch> processor) {
    rawForEachMatch(new Object[]{pKing}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pKing the fixed value of pattern parameter king, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final King pKing, final IMatchProcessor<? super WhiteKingsMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pKing}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pKing the fixed value of pattern parameter king, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public WhiteKingsMatch newMatch(final King pKing) {
    return WhiteKingsMatch.newMatch(pKing);
  }
  
  /**
   * Retrieve the set of values that occur in matches for king.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<King> rawAccumulateAllValuesOfking(final Object[] parameters) {
    Set<King> results = new HashSet<King>();
    rawAccumulateAllValues(POSITION_KING, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for king.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<King> getAllValuesOfking() {
    return rawAccumulateAllValuesOfking(emptyArray());
  }
  
  @Override
  protected WhiteKingsMatch tupleToMatch(final Tuple t) {
    try {
    	return WhiteKingsMatch.newMatch((King) t.get(POSITION_KING));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected WhiteKingsMatch arrayToMatch(final Object[] match) {
    try {
    	return WhiteKingsMatch.newMatch((King) match[POSITION_KING]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected WhiteKingsMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return WhiteKingsMatch.newMutableMatch((King) match[POSITION_KING]);
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
  public static IQuerySpecification<WhiteKingsMatcher> querySpecification() throws ViatraQueryException {
    return WhiteKingsQuerySpecification.instance();
  }
}
