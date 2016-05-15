package chess.queries;

import chess.queries.WhiteRooksMatch;
import chess.queries.util.WhiteRooksQuerySpecification;
import chessdiagram.Rook;
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
 * Generated pattern matcher API of the chess.queries.whiteRooks pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
 * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link WhiteRooksMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern whiteRooks(rook : Rook) {
 * 	Rook.colour(rook, ::White);
 * }
 * </pre></code>
 * 
 * @see WhiteRooksMatch
 * @see WhiteRooksProcessor
 * @see WhiteRooksQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class WhiteRooksMatcher extends BaseMatcher<WhiteRooksMatch> {
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static WhiteRooksMatcher on(final ViatraQueryEngine engine) throws ViatraQueryException {
    // check if matcher already exists
    WhiteRooksMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new WhiteRooksMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_ROOK = 0;
  
  private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(WhiteRooksMatcher.class);
  
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  private WhiteRooksMatcher(final ViatraQueryEngine engine) throws ViatraQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pRook the fixed value of pattern parameter rook, or null if not bound.
   * @return matches represented as a WhiteRooksMatch object.
   * 
   */
  public Collection<WhiteRooksMatch> getAllMatches(final Rook pRook) {
    return rawGetAllMatches(new Object[]{pRook});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pRook the fixed value of pattern parameter rook, or null if not bound.
   * @return a match represented as a WhiteRooksMatch object, or null if no match is found.
   * 
   */
  public WhiteRooksMatch getOneArbitraryMatch(final Rook pRook) {
    return rawGetOneArbitraryMatch(new Object[]{pRook});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pRook the fixed value of pattern parameter rook, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Rook pRook) {
    return rawHasMatch(new Object[]{pRook});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pRook the fixed value of pattern parameter rook, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Rook pRook) {
    return rawCountMatches(new Object[]{pRook});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pRook the fixed value of pattern parameter rook, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Rook pRook, final IMatchProcessor<? super WhiteRooksMatch> processor) {
    rawForEachMatch(new Object[]{pRook}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pRook the fixed value of pattern parameter rook, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Rook pRook, final IMatchProcessor<? super WhiteRooksMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pRook}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pRook the fixed value of pattern parameter rook, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public WhiteRooksMatch newMatch(final Rook pRook) {
    return WhiteRooksMatch.newMatch(pRook);
  }
  
  /**
   * Retrieve the set of values that occur in matches for rook.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Rook> rawAccumulateAllValuesOfrook(final Object[] parameters) {
    Set<Rook> results = new HashSet<Rook>();
    rawAccumulateAllValues(POSITION_ROOK, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for rook.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Rook> getAllValuesOfrook() {
    return rawAccumulateAllValuesOfrook(emptyArray());
  }
  
  @Override
  protected WhiteRooksMatch tupleToMatch(final Tuple t) {
    try {
    	return WhiteRooksMatch.newMatch((Rook) t.get(POSITION_ROOK));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected WhiteRooksMatch arrayToMatch(final Object[] match) {
    try {
    	return WhiteRooksMatch.newMatch((Rook) match[POSITION_ROOK]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected WhiteRooksMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return WhiteRooksMatch.newMutableMatch((Rook) match[POSITION_ROOK]);
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
  public static IQuerySpecification<WhiteRooksMatcher> querySpecification() throws ViatraQueryException {
    return WhiteRooksQuerySpecification.instance();
  }
}
