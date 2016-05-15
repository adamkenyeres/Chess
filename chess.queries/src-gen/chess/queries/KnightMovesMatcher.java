package chess.queries;

import chess.queries.KnightMovesMatch;
import chess.queries.util.KnightMovesQuerySpecification;
import chessdiagram.Chess;
import chessdiagram.Knight;
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
 * Generated pattern matcher API of the chess.queries.knightMoves pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
 * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link KnightMovesMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern knightMoves(knight : Knight, square : Square, chess : Chess) {
 * 	find square(knight, knightSquare);
 * 	find N(knightSquare, N1);
 * 	find N(N1, N2);
 * 	find W(N2, square);
 * 	Chess.square(chess, square);
 * } or {
 * 	find square(knight, knightSquare);
 * 	find N(knightSquare, N1);
 * 	find N(N1, N2);
 * 	find E(N2, square);
 * 	Chess.square(chess, square);
 * } or {
 * 	find square(knight, knightSquare);
 * 	find N(knightSquare, N1);
 * 	find W(N1, W1);
 * 	find W(W1, square);
 * 	Chess.square(chess, square);
 * } or {
 * 	find square(knight, knightSquare);
 * 	find N(knightSquare, N1);
 * 	find E(N1, E1);
 * 	find E(E1, square);
 * 	Chess.square(chess, square);
 * } or {
 * 	find square(knight, knightSquare);
 * 	find S(knightSquare, S1);
 * 	find S(S1, S2);
 * 	find W(S2, square);
 * 	Chess.square(chess, square);
 * 
 * } or {
 * 	find square(knight, knightSquare);
 * 	find S(knightSquare, S1);
 * 	find S(S1, S2);
 * 	find E(S2, square);
 * 	Chess.square(chess, square);
 * } or {
 * 	find square(knight, knightSquare);
 * 	find S(knightSquare, S1);
 * 	find W(S1, W1);
 * 	find W(W1, square);
 * 	Chess.square(chess, square);
 * } or {
 * 	find square(knight, knightSquare);
 * 	find S(knightSquare, S1);
 * 	find E(S1, E1);
 * 	find E(E1, square);
 * 	Chess.square(chess, square);
 * }
 * </pre></code>
 * 
 * @see KnightMovesMatch
 * @see KnightMovesProcessor
 * @see KnightMovesQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class KnightMovesMatcher extends BaseMatcher<KnightMovesMatch> {
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static KnightMovesMatcher on(final ViatraQueryEngine engine) throws ViatraQueryException {
    // check if matcher already exists
    KnightMovesMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new KnightMovesMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_KNIGHT = 0;
  
  private final static int POSITION_SQUARE = 1;
  
  private final static int POSITION_CHESS = 2;
  
  private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(KnightMovesMatcher.class);
  
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  private KnightMovesMatcher(final ViatraQueryEngine engine) throws ViatraQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pKnight the fixed value of pattern parameter knight, or null if not bound.
   * @param pSquare the fixed value of pattern parameter square, or null if not bound.
   * @param pChess the fixed value of pattern parameter chess, or null if not bound.
   * @return matches represented as a KnightMovesMatch object.
   * 
   */
  public Collection<KnightMovesMatch> getAllMatches(final Knight pKnight, final Square pSquare, final Chess pChess) {
    return rawGetAllMatches(new Object[]{pKnight, pSquare, pChess});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pKnight the fixed value of pattern parameter knight, or null if not bound.
   * @param pSquare the fixed value of pattern parameter square, or null if not bound.
   * @param pChess the fixed value of pattern parameter chess, or null if not bound.
   * @return a match represented as a KnightMovesMatch object, or null if no match is found.
   * 
   */
  public KnightMovesMatch getOneArbitraryMatch(final Knight pKnight, final Square pSquare, final Chess pChess) {
    return rawGetOneArbitraryMatch(new Object[]{pKnight, pSquare, pChess});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pKnight the fixed value of pattern parameter knight, or null if not bound.
   * @param pSquare the fixed value of pattern parameter square, or null if not bound.
   * @param pChess the fixed value of pattern parameter chess, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Knight pKnight, final Square pSquare, final Chess pChess) {
    return rawHasMatch(new Object[]{pKnight, pSquare, pChess});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pKnight the fixed value of pattern parameter knight, or null if not bound.
   * @param pSquare the fixed value of pattern parameter square, or null if not bound.
   * @param pChess the fixed value of pattern parameter chess, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Knight pKnight, final Square pSquare, final Chess pChess) {
    return rawCountMatches(new Object[]{pKnight, pSquare, pChess});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pKnight the fixed value of pattern parameter knight, or null if not bound.
   * @param pSquare the fixed value of pattern parameter square, or null if not bound.
   * @param pChess the fixed value of pattern parameter chess, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Knight pKnight, final Square pSquare, final Chess pChess, final IMatchProcessor<? super KnightMovesMatch> processor) {
    rawForEachMatch(new Object[]{pKnight, pSquare, pChess}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pKnight the fixed value of pattern parameter knight, or null if not bound.
   * @param pSquare the fixed value of pattern parameter square, or null if not bound.
   * @param pChess the fixed value of pattern parameter chess, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Knight pKnight, final Square pSquare, final Chess pChess, final IMatchProcessor<? super KnightMovesMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pKnight, pSquare, pChess}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pKnight the fixed value of pattern parameter knight, or null if not bound.
   * @param pSquare the fixed value of pattern parameter square, or null if not bound.
   * @param pChess the fixed value of pattern parameter chess, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public KnightMovesMatch newMatch(final Knight pKnight, final Square pSquare, final Chess pChess) {
    return KnightMovesMatch.newMatch(pKnight, pSquare, pChess);
  }
  
  /**
   * Retrieve the set of values that occur in matches for knight.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Knight> rawAccumulateAllValuesOfknight(final Object[] parameters) {
    Set<Knight> results = new HashSet<Knight>();
    rawAccumulateAllValues(POSITION_KNIGHT, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for knight.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Knight> getAllValuesOfknight() {
    return rawAccumulateAllValuesOfknight(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for knight.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Knight> getAllValuesOfknight(final KnightMovesMatch partialMatch) {
    return rawAccumulateAllValuesOfknight(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for knight.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Knight> getAllValuesOfknight(final Square pSquare, final Chess pChess) {
    return rawAccumulateAllValuesOfknight(new Object[]{
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
  public Set<Square> getAllValuesOfsquare(final KnightMovesMatch partialMatch) {
    return rawAccumulateAllValuesOfsquare(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for square.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Square> getAllValuesOfsquare(final Knight pKnight, final Chess pChess) {
    return rawAccumulateAllValuesOfsquare(new Object[]{
    pKnight, 
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
  public Set<Chess> getAllValuesOfchess(final KnightMovesMatch partialMatch) {
    return rawAccumulateAllValuesOfchess(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for chess.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Chess> getAllValuesOfchess(final Knight pKnight, final Square pSquare) {
    return rawAccumulateAllValuesOfchess(new Object[]{
    pKnight, 
    pSquare, 
    null
    });
  }
  
  @Override
  protected KnightMovesMatch tupleToMatch(final Tuple t) {
    try {
    	return KnightMovesMatch.newMatch((Knight) t.get(POSITION_KNIGHT), (Square) t.get(POSITION_SQUARE), (Chess) t.get(POSITION_CHESS));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected KnightMovesMatch arrayToMatch(final Object[] match) {
    try {
    	return KnightMovesMatch.newMatch((Knight) match[POSITION_KNIGHT], (Square) match[POSITION_SQUARE], (Chess) match[POSITION_CHESS]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected KnightMovesMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return KnightMovesMatch.newMutableMatch((Knight) match[POSITION_KNIGHT], (Square) match[POSITION_SQUARE], (Chess) match[POSITION_CHESS]);
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
  public static IQuerySpecification<KnightMovesMatcher> querySpecification() throws ViatraQueryException {
    return KnightMovesQuerySpecification.instance();
  }
}
