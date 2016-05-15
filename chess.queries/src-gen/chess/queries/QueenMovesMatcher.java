package chess.queries;

import chess.queries.QueenMovesMatch;
import chess.queries.util.QueenMovesQuerySpecification;
import chessdiagram.Chess;
import chessdiagram.Queen;
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
 * Generated pattern matcher API of the chess.queries.queenMoves pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
 * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link QueenMovesMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern queenMoves(queen : Queen, square : Square, chess : Chess){
 * 	All the diagonal moves 
 * 	find diagonalMoves(queen, square);
 * 	Chess.square(chess,square);
 * }or{
 * 	All the horizontal moves 
 * 	find horizontalOrVerticalMoves(queen, square);
 * 	Chess.square(chess,square);
 * }
 * </pre></code>
 * 
 * @see QueenMovesMatch
 * @see QueenMovesProcessor
 * @see QueenMovesQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class QueenMovesMatcher extends BaseMatcher<QueenMovesMatch> {
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static QueenMovesMatcher on(final ViatraQueryEngine engine) throws ViatraQueryException {
    // check if matcher already exists
    QueenMovesMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new QueenMovesMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_QUEEN = 0;
  
  private final static int POSITION_SQUARE = 1;
  
  private final static int POSITION_CHESS = 2;
  
  private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(QueenMovesMatcher.class);
  
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  private QueenMovesMatcher(final ViatraQueryEngine engine) throws ViatraQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pQueen the fixed value of pattern parameter queen, or null if not bound.
   * @param pSquare the fixed value of pattern parameter square, or null if not bound.
   * @param pChess the fixed value of pattern parameter chess, or null if not bound.
   * @return matches represented as a QueenMovesMatch object.
   * 
   */
  public Collection<QueenMovesMatch> getAllMatches(final Queen pQueen, final Square pSquare, final Chess pChess) {
    return rawGetAllMatches(new Object[]{pQueen, pSquare, pChess});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pQueen the fixed value of pattern parameter queen, or null if not bound.
   * @param pSquare the fixed value of pattern parameter square, or null if not bound.
   * @param pChess the fixed value of pattern parameter chess, or null if not bound.
   * @return a match represented as a QueenMovesMatch object, or null if no match is found.
   * 
   */
  public QueenMovesMatch getOneArbitraryMatch(final Queen pQueen, final Square pSquare, final Chess pChess) {
    return rawGetOneArbitraryMatch(new Object[]{pQueen, pSquare, pChess});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pQueen the fixed value of pattern parameter queen, or null if not bound.
   * @param pSquare the fixed value of pattern parameter square, or null if not bound.
   * @param pChess the fixed value of pattern parameter chess, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Queen pQueen, final Square pSquare, final Chess pChess) {
    return rawHasMatch(new Object[]{pQueen, pSquare, pChess});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pQueen the fixed value of pattern parameter queen, or null if not bound.
   * @param pSquare the fixed value of pattern parameter square, or null if not bound.
   * @param pChess the fixed value of pattern parameter chess, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Queen pQueen, final Square pSquare, final Chess pChess) {
    return rawCountMatches(new Object[]{pQueen, pSquare, pChess});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pQueen the fixed value of pattern parameter queen, or null if not bound.
   * @param pSquare the fixed value of pattern parameter square, or null if not bound.
   * @param pChess the fixed value of pattern parameter chess, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Queen pQueen, final Square pSquare, final Chess pChess, final IMatchProcessor<? super QueenMovesMatch> processor) {
    rawForEachMatch(new Object[]{pQueen, pSquare, pChess}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pQueen the fixed value of pattern parameter queen, or null if not bound.
   * @param pSquare the fixed value of pattern parameter square, or null if not bound.
   * @param pChess the fixed value of pattern parameter chess, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Queen pQueen, final Square pSquare, final Chess pChess, final IMatchProcessor<? super QueenMovesMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pQueen, pSquare, pChess}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pQueen the fixed value of pattern parameter queen, or null if not bound.
   * @param pSquare the fixed value of pattern parameter square, or null if not bound.
   * @param pChess the fixed value of pattern parameter chess, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public QueenMovesMatch newMatch(final Queen pQueen, final Square pSquare, final Chess pChess) {
    return QueenMovesMatch.newMatch(pQueen, pSquare, pChess);
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
  
  /**
   * Retrieve the set of values that occur in matches for queen.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Queen> getAllValuesOfqueen(final QueenMovesMatch partialMatch) {
    return rawAccumulateAllValuesOfqueen(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for queen.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Queen> getAllValuesOfqueen(final Square pSquare, final Chess pChess) {
    return rawAccumulateAllValuesOfqueen(new Object[]{
    null, 
    pSquare, 
    pChess
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
  public Set<Square> getAllValuesOfsquare(final QueenMovesMatch partialMatch) {
    return rawAccumulateAllValuesOfsquare(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for square.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Square> getAllValuesOfsquare(final Queen pQueen, final Chess pChess) {
    return rawAccumulateAllValuesOfsquare(new Object[]{
    pQueen, 
    null, 
    pChess
    });
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
  
  /**
   * Retrieve the set of values that occur in matches for chess.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Chess> getAllValuesOfchess(final QueenMovesMatch partialMatch) {
    return rawAccumulateAllValuesOfchess(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for chess.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Chess> getAllValuesOfchess(final Queen pQueen, final Square pSquare) {
    return rawAccumulateAllValuesOfchess(new Object[]{
    pQueen, 
    pSquare, 
    null
    });
  }
  
  @Override
  protected QueenMovesMatch tupleToMatch(final Tuple t) {
    try {
    	return QueenMovesMatch.newMatch((Queen) t.get(POSITION_QUEEN), (Square) t.get(POSITION_SQUARE), (Chess) t.get(POSITION_CHESS));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected QueenMovesMatch arrayToMatch(final Object[] match) {
    try {
    	return QueenMovesMatch.newMatch((Queen) match[POSITION_QUEEN], (Square) match[POSITION_SQUARE], (Chess) match[POSITION_CHESS]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected QueenMovesMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return QueenMovesMatch.newMutableMatch((Queen) match[POSITION_QUEEN], (Square) match[POSITION_SQUARE], (Chess) match[POSITION_CHESS]);
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
  public static IQuerySpecification<QueenMovesMatcher> querySpecification() throws ViatraQueryException {
    return QueenMovesQuerySpecification.instance();
  }
}
