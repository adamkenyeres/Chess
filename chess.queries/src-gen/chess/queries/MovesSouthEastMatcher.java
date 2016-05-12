package chess.queries;

import chess.queries.MovesSouthEastMatch;
import chess.queries.util.MovesSouthEastQuerySpecification;
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
 * Generated pattern matcher API of the chess.queries.movesSouthEast pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
 * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link MovesSouthEastMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * {@literal @}QueryExplorer(checked = false)
 * pattern
 * movesSouthEast(squareStart : Square, squareEnd : Square, squareMiddle : Square) {
 * 	Square.id(squareStart, startId);
 * 	Square.id(squareEnd, endId);
 * 	check(startId {@literal <} endId);
 * 	check((endId / 8 - startId / 8)
 * 	==(endId % 8 - startId % 8));
 * 	find southEastTransitiveClouser(squareStart, squareMiddle);
 * 	Square.id(squareMiddle, middleId);
 * 	check(middleId {@literal <}= endId);
 * 	C == count find
 * 	transitiveClosureNorthWestWithPieces(squareMiddle, squareStart, _);
 * 	check(C == 0);
 * }
 * </pre></code>
 * 
 * @see MovesSouthEastMatch
 * @see MovesSouthEastProcessor
 * @see MovesSouthEastQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class MovesSouthEastMatcher extends BaseMatcher<MovesSouthEastMatch> {
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static MovesSouthEastMatcher on(final ViatraQueryEngine engine) throws ViatraQueryException {
    // check if matcher already exists
    MovesSouthEastMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new MovesSouthEastMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_SQUARESTART = 0;
  
  private final static int POSITION_SQUAREEND = 1;
  
  private final static int POSITION_SQUAREMIDDLE = 2;
  
  private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(MovesSouthEastMatcher.class);
  
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  private MovesSouthEastMatcher(final ViatraQueryEngine engine) throws ViatraQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pSquareStart the fixed value of pattern parameter squareStart, or null if not bound.
   * @param pSquareEnd the fixed value of pattern parameter squareEnd, or null if not bound.
   * @param pSquareMiddle the fixed value of pattern parameter squareMiddle, or null if not bound.
   * @return matches represented as a MovesSouthEastMatch object.
   * 
   */
  public Collection<MovesSouthEastMatch> getAllMatches(final Square pSquareStart, final Square pSquareEnd, final Square pSquareMiddle) {
    return rawGetAllMatches(new Object[]{pSquareStart, pSquareEnd, pSquareMiddle});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pSquareStart the fixed value of pattern parameter squareStart, or null if not bound.
   * @param pSquareEnd the fixed value of pattern parameter squareEnd, or null if not bound.
   * @param pSquareMiddle the fixed value of pattern parameter squareMiddle, or null if not bound.
   * @return a match represented as a MovesSouthEastMatch object, or null if no match is found.
   * 
   */
  public MovesSouthEastMatch getOneArbitraryMatch(final Square pSquareStart, final Square pSquareEnd, final Square pSquareMiddle) {
    return rawGetOneArbitraryMatch(new Object[]{pSquareStart, pSquareEnd, pSquareMiddle});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pSquareStart the fixed value of pattern parameter squareStart, or null if not bound.
   * @param pSquareEnd the fixed value of pattern parameter squareEnd, or null if not bound.
   * @param pSquareMiddle the fixed value of pattern parameter squareMiddle, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Square pSquareStart, final Square pSquareEnd, final Square pSquareMiddle) {
    return rawHasMatch(new Object[]{pSquareStart, pSquareEnd, pSquareMiddle});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pSquareStart the fixed value of pattern parameter squareStart, or null if not bound.
   * @param pSquareEnd the fixed value of pattern parameter squareEnd, or null if not bound.
   * @param pSquareMiddle the fixed value of pattern parameter squareMiddle, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Square pSquareStart, final Square pSquareEnd, final Square pSquareMiddle) {
    return rawCountMatches(new Object[]{pSquareStart, pSquareEnd, pSquareMiddle});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pSquareStart the fixed value of pattern parameter squareStart, or null if not bound.
   * @param pSquareEnd the fixed value of pattern parameter squareEnd, or null if not bound.
   * @param pSquareMiddle the fixed value of pattern parameter squareMiddle, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Square pSquareStart, final Square pSquareEnd, final Square pSquareMiddle, final IMatchProcessor<? super MovesSouthEastMatch> processor) {
    rawForEachMatch(new Object[]{pSquareStart, pSquareEnd, pSquareMiddle}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pSquareStart the fixed value of pattern parameter squareStart, or null if not bound.
   * @param pSquareEnd the fixed value of pattern parameter squareEnd, or null if not bound.
   * @param pSquareMiddle the fixed value of pattern parameter squareMiddle, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Square pSquareStart, final Square pSquareEnd, final Square pSquareMiddle, final IMatchProcessor<? super MovesSouthEastMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pSquareStart, pSquareEnd, pSquareMiddle}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pSquareStart the fixed value of pattern parameter squareStart, or null if not bound.
   * @param pSquareEnd the fixed value of pattern parameter squareEnd, or null if not bound.
   * @param pSquareMiddle the fixed value of pattern parameter squareMiddle, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public MovesSouthEastMatch newMatch(final Square pSquareStart, final Square pSquareEnd, final Square pSquareMiddle) {
    return MovesSouthEastMatch.newMatch(pSquareStart, pSquareEnd, pSquareMiddle);
  }
  
  /**
   * Retrieve the set of values that occur in matches for squareStart.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Square> rawAccumulateAllValuesOfsquareStart(final Object[] parameters) {
    Set<Square> results = new HashSet<Square>();
    rawAccumulateAllValues(POSITION_SQUARESTART, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for squareStart.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Square> getAllValuesOfsquareStart() {
    return rawAccumulateAllValuesOfsquareStart(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for squareStart.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Square> getAllValuesOfsquareStart(final MovesSouthEastMatch partialMatch) {
    return rawAccumulateAllValuesOfsquareStart(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for squareStart.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Square> getAllValuesOfsquareStart(final Square pSquareEnd, final Square pSquareMiddle) {
    return rawAccumulateAllValuesOfsquareStart(new Object[]{
    null, 
    pSquareEnd, 
    pSquareMiddle
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for squareEnd.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Square> rawAccumulateAllValuesOfsquareEnd(final Object[] parameters) {
    Set<Square> results = new HashSet<Square>();
    rawAccumulateAllValues(POSITION_SQUAREEND, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for squareEnd.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Square> getAllValuesOfsquareEnd() {
    return rawAccumulateAllValuesOfsquareEnd(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for squareEnd.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Square> getAllValuesOfsquareEnd(final MovesSouthEastMatch partialMatch) {
    return rawAccumulateAllValuesOfsquareEnd(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for squareEnd.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Square> getAllValuesOfsquareEnd(final Square pSquareStart, final Square pSquareMiddle) {
    return rawAccumulateAllValuesOfsquareEnd(new Object[]{
    pSquareStart, 
    null, 
    pSquareMiddle
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for squareMiddle.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Square> rawAccumulateAllValuesOfsquareMiddle(final Object[] parameters) {
    Set<Square> results = new HashSet<Square>();
    rawAccumulateAllValues(POSITION_SQUAREMIDDLE, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for squareMiddle.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Square> getAllValuesOfsquareMiddle() {
    return rawAccumulateAllValuesOfsquareMiddle(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for squareMiddle.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Square> getAllValuesOfsquareMiddle(final MovesSouthEastMatch partialMatch) {
    return rawAccumulateAllValuesOfsquareMiddle(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for squareMiddle.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Square> getAllValuesOfsquareMiddle(final Square pSquareStart, final Square pSquareEnd) {
    return rawAccumulateAllValuesOfsquareMiddle(new Object[]{
    pSquareStart, 
    pSquareEnd, 
    null
    });
  }
  
  @Override
  protected MovesSouthEastMatch tupleToMatch(final Tuple t) {
    try {
    	return MovesSouthEastMatch.newMatch((Square) t.get(POSITION_SQUARESTART), (Square) t.get(POSITION_SQUAREEND), (Square) t.get(POSITION_SQUAREMIDDLE));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected MovesSouthEastMatch arrayToMatch(final Object[] match) {
    try {
    	return MovesSouthEastMatch.newMatch((Square) match[POSITION_SQUARESTART], (Square) match[POSITION_SQUAREEND], (Square) match[POSITION_SQUAREMIDDLE]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected MovesSouthEastMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return MovesSouthEastMatch.newMutableMatch((Square) match[POSITION_SQUARESTART], (Square) match[POSITION_SQUAREEND], (Square) match[POSITION_SQUAREMIDDLE]);
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
  public static IQuerySpecification<MovesSouthEastMatcher> querySpecification() throws ViatraQueryException {
    return MovesSouthEastQuerySpecification.instance();
  }
}
