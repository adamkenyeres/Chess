package chess.queries;

import chess.queries.WhitePlayerTurnMatch;
import chess.queries.util.WhitePlayerTurnQuerySpecification;
import chessdiagram.Chess;
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
 * Generated pattern matcher API of the chess.queries.whitePlayerTurn pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
 * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link WhitePlayerTurnMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern whitePlayerTurn(chess : Chess) {
 * 	Chess.whitePlayerTurn(chess, bool);
 * 	check(bool == true);
 * }
 * </pre></code>
 * 
 * @see WhitePlayerTurnMatch
 * @see WhitePlayerTurnProcessor
 * @see WhitePlayerTurnQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class WhitePlayerTurnMatcher extends BaseMatcher<WhitePlayerTurnMatch> {
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static WhitePlayerTurnMatcher on(final ViatraQueryEngine engine) throws ViatraQueryException {
    // check if matcher already exists
    WhitePlayerTurnMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new WhitePlayerTurnMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_CHESS = 0;
  
  private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(WhitePlayerTurnMatcher.class);
  
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  private WhitePlayerTurnMatcher(final ViatraQueryEngine engine) throws ViatraQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pChess the fixed value of pattern parameter chess, or null if not bound.
   * @return matches represented as a WhitePlayerTurnMatch object.
   * 
   */
  public Collection<WhitePlayerTurnMatch> getAllMatches(final Chess pChess) {
    return rawGetAllMatches(new Object[]{pChess});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pChess the fixed value of pattern parameter chess, or null if not bound.
   * @return a match represented as a WhitePlayerTurnMatch object, or null if no match is found.
   * 
   */
  public WhitePlayerTurnMatch getOneArbitraryMatch(final Chess pChess) {
    return rawGetOneArbitraryMatch(new Object[]{pChess});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pChess the fixed value of pattern parameter chess, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Chess pChess) {
    return rawHasMatch(new Object[]{pChess});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pChess the fixed value of pattern parameter chess, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Chess pChess) {
    return rawCountMatches(new Object[]{pChess});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pChess the fixed value of pattern parameter chess, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Chess pChess, final IMatchProcessor<? super WhitePlayerTurnMatch> processor) {
    rawForEachMatch(new Object[]{pChess}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pChess the fixed value of pattern parameter chess, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Chess pChess, final IMatchProcessor<? super WhitePlayerTurnMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pChess}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pChess the fixed value of pattern parameter chess, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public WhitePlayerTurnMatch newMatch(final Chess pChess) {
    return WhitePlayerTurnMatch.newMatch(pChess);
  }
  
  /**
   * Retrieve the set of values that occur in matches for chess.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Chess> rawAccumulateAllValuesOfchess(final Object[] parameters) {
    Set<Chess> results = new HashSet<Chess>();
    rawAccumulateAllValues(POSITION_CHESS, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for chess.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Chess> getAllValuesOfchess() {
    return rawAccumulateAllValuesOfchess(emptyArray());
  }
  
  @Override
  protected WhitePlayerTurnMatch tupleToMatch(final Tuple t) {
    try {
    	return WhitePlayerTurnMatch.newMatch((Chess) t.get(POSITION_CHESS));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected WhitePlayerTurnMatch arrayToMatch(final Object[] match) {
    try {
    	return WhitePlayerTurnMatch.newMatch((Chess) match[POSITION_CHESS]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected WhitePlayerTurnMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return WhitePlayerTurnMatch.newMutableMatch((Chess) match[POSITION_CHESS]);
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
  public static IQuerySpecification<WhitePlayerTurnMatcher> querySpecification() throws ViatraQueryException {
    return WhitePlayerTurnQuerySpecification.instance();
  }
}
