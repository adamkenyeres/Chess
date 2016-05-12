package chess.queries;

import chess.queries.SouthDiagonalMovesMatch;
import chess.queries.util.SouthDiagonalMovesQuerySpecification;
import chessdiagram.Piece;
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
 * Generated pattern matcher API of the chess.queries.southDiagonalMoves pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
 * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link SouthDiagonalMovesMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern southDiagonalMoves(bishop : Piece, square : Square) {
 * 	find square(bishop, bishopSquare); //SouthEast moves
 * 	find movesSouthEast(bishopSquare, _sq, square);
 * 	neg find pieceOnSquaree(square);
 * } or {
 * 	find square(bishop, bishopSquare); //South East moves atacking
 * 	find movesSouthEast(bishopSquare, _sq, square);
 * 	find pieceOnSquare(square, piece);
 * 	find canAttack(bishop, piece);
 * } or {
 * 	find square(bishop, bishopSquare); //SouthEast moves
 * 	find movesSouthWest(bishopSquare, _sq, square);
 * 	neg find pieceOnSquaree(square);
 * } or {
 * 	find square(bishop, bishopSquare); //South East moves atacking
 * 	find movesSouthWest(bishopSquare, _sq, square);
 * 	find pieceOnSquare(square, piece);
 * 	find canAttack(bishop, piece);
 * }
 * </pre></code>
 * 
 * @see SouthDiagonalMovesMatch
 * @see SouthDiagonalMovesProcessor
 * @see SouthDiagonalMovesQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class SouthDiagonalMovesMatcher extends BaseMatcher<SouthDiagonalMovesMatch> {
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static SouthDiagonalMovesMatcher on(final ViatraQueryEngine engine) throws ViatraQueryException {
    // check if matcher already exists
    SouthDiagonalMovesMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new SouthDiagonalMovesMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_BISHOP = 0;
  
  private final static int POSITION_SQUARE = 1;
  
  private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(SouthDiagonalMovesMatcher.class);
  
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  private SouthDiagonalMovesMatcher(final ViatraQueryEngine engine) throws ViatraQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pBishop the fixed value of pattern parameter bishop, or null if not bound.
   * @param pSquare the fixed value of pattern parameter square, or null if not bound.
   * @return matches represented as a SouthDiagonalMovesMatch object.
   * 
   */
  public Collection<SouthDiagonalMovesMatch> getAllMatches(final Piece pBishop, final Square pSquare) {
    return rawGetAllMatches(new Object[]{pBishop, pSquare});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pBishop the fixed value of pattern parameter bishop, or null if not bound.
   * @param pSquare the fixed value of pattern parameter square, or null if not bound.
   * @return a match represented as a SouthDiagonalMovesMatch object, or null if no match is found.
   * 
   */
  public SouthDiagonalMovesMatch getOneArbitraryMatch(final Piece pBishop, final Square pSquare) {
    return rawGetOneArbitraryMatch(new Object[]{pBishop, pSquare});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pBishop the fixed value of pattern parameter bishop, or null if not bound.
   * @param pSquare the fixed value of pattern parameter square, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Piece pBishop, final Square pSquare) {
    return rawHasMatch(new Object[]{pBishop, pSquare});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pBishop the fixed value of pattern parameter bishop, or null if not bound.
   * @param pSquare the fixed value of pattern parameter square, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Piece pBishop, final Square pSquare) {
    return rawCountMatches(new Object[]{pBishop, pSquare});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pBishop the fixed value of pattern parameter bishop, or null if not bound.
   * @param pSquare the fixed value of pattern parameter square, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Piece pBishop, final Square pSquare, final IMatchProcessor<? super SouthDiagonalMovesMatch> processor) {
    rawForEachMatch(new Object[]{pBishop, pSquare}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pBishop the fixed value of pattern parameter bishop, or null if not bound.
   * @param pSquare the fixed value of pattern parameter square, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Piece pBishop, final Square pSquare, final IMatchProcessor<? super SouthDiagonalMovesMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pBishop, pSquare}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pBishop the fixed value of pattern parameter bishop, or null if not bound.
   * @param pSquare the fixed value of pattern parameter square, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public SouthDiagonalMovesMatch newMatch(final Piece pBishop, final Square pSquare) {
    return SouthDiagonalMovesMatch.newMatch(pBishop, pSquare);
  }
  
  /**
   * Retrieve the set of values that occur in matches for bishop.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Piece> rawAccumulateAllValuesOfbishop(final Object[] parameters) {
    Set<Piece> results = new HashSet<Piece>();
    rawAccumulateAllValues(POSITION_BISHOP, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for bishop.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Piece> getAllValuesOfbishop() {
    return rawAccumulateAllValuesOfbishop(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for bishop.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Piece> getAllValuesOfbishop(final SouthDiagonalMovesMatch partialMatch) {
    return rawAccumulateAllValuesOfbishop(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for bishop.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Piece> getAllValuesOfbishop(final Square pSquare) {
    return rawAccumulateAllValuesOfbishop(new Object[]{
    null, 
    pSquare
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
  public Set<Square> getAllValuesOfsquare(final SouthDiagonalMovesMatch partialMatch) {
    return rawAccumulateAllValuesOfsquare(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for square.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Square> getAllValuesOfsquare(final Piece pBishop) {
    return rawAccumulateAllValuesOfsquare(new Object[]{
    pBishop, 
    null
    });
  }
  
  @Override
  protected SouthDiagonalMovesMatch tupleToMatch(final Tuple t) {
    try {
    	return SouthDiagonalMovesMatch.newMatch((Piece) t.get(POSITION_BISHOP), (Square) t.get(POSITION_SQUARE));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected SouthDiagonalMovesMatch arrayToMatch(final Object[] match) {
    try {
    	return SouthDiagonalMovesMatch.newMatch((Piece) match[POSITION_BISHOP], (Square) match[POSITION_SQUARE]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected SouthDiagonalMovesMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return SouthDiagonalMovesMatch.newMutableMatch((Piece) match[POSITION_BISHOP], (Square) match[POSITION_SQUARE]);
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
  public static IQuerySpecification<SouthDiagonalMovesMatcher> querySpecification() throws ViatraQueryException {
    return SouthDiagonalMovesQuerySpecification.instance();
  }
}
