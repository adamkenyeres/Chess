package chess.queries;

import chess.queries.BlackMovesMatch;
import chess.queries.util.BlackMovesQuerySpecification;
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
 * Generated pattern matcher API of the chess.queries.blackMoves pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
 * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link BlackMovesMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern blackMoves(piece : Piece, square : Square){
 * 	Piece.colour(piece, ::Black);
 * 	find blackPawnMoves(piece, square);
 * }or{
 * 	Piece.colour(piece, ::Black);
 * 	find blackKnightMoves(piece, square);
 * }or{
 * 	Piece.colour(piece, ::Black);
 * 	find rookMoves(piece, square);
 * }or{
 * 	Piece.colour(piece, ::Black);
 * 	find bishopMoves(piece, square);
 * }or{
 * 	Piece.colour(piece, ::Black);
 * 	find queenMoves(piece, square);
 * }or{
 * 	Piece.colour(piece, ::Black);
 * 	find kingMoves(piece, square);
 * }
 * </pre></code>
 * 
 * @see BlackMovesMatch
 * @see BlackMovesProcessor
 * @see BlackMovesQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class BlackMovesMatcher extends BaseMatcher<BlackMovesMatch> {
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static BlackMovesMatcher on(final ViatraQueryEngine engine) throws ViatraQueryException {
    // check if matcher already exists
    BlackMovesMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new BlackMovesMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_PIECE = 0;
  
  private final static int POSITION_SQUARE = 1;
  
  private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(BlackMovesMatcher.class);
  
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  private BlackMovesMatcher(final ViatraQueryEngine engine) throws ViatraQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pPiece the fixed value of pattern parameter piece, or null if not bound.
   * @param pSquare the fixed value of pattern parameter square, or null if not bound.
   * @return matches represented as a BlackMovesMatch object.
   * 
   */
  public Collection<BlackMovesMatch> getAllMatches(final Piece pPiece, final Square pSquare) {
    return rawGetAllMatches(new Object[]{pPiece, pSquare});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pPiece the fixed value of pattern parameter piece, or null if not bound.
   * @param pSquare the fixed value of pattern parameter square, or null if not bound.
   * @return a match represented as a BlackMovesMatch object, or null if no match is found.
   * 
   */
  public BlackMovesMatch getOneArbitraryMatch(final Piece pPiece, final Square pSquare) {
    return rawGetOneArbitraryMatch(new Object[]{pPiece, pSquare});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pPiece the fixed value of pattern parameter piece, or null if not bound.
   * @param pSquare the fixed value of pattern parameter square, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Piece pPiece, final Square pSquare) {
    return rawHasMatch(new Object[]{pPiece, pSquare});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pPiece the fixed value of pattern parameter piece, or null if not bound.
   * @param pSquare the fixed value of pattern parameter square, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Piece pPiece, final Square pSquare) {
    return rawCountMatches(new Object[]{pPiece, pSquare});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pPiece the fixed value of pattern parameter piece, or null if not bound.
   * @param pSquare the fixed value of pattern parameter square, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Piece pPiece, final Square pSquare, final IMatchProcessor<? super BlackMovesMatch> processor) {
    rawForEachMatch(new Object[]{pPiece, pSquare}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pPiece the fixed value of pattern parameter piece, or null if not bound.
   * @param pSquare the fixed value of pattern parameter square, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Piece pPiece, final Square pSquare, final IMatchProcessor<? super BlackMovesMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pPiece, pSquare}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pPiece the fixed value of pattern parameter piece, or null if not bound.
   * @param pSquare the fixed value of pattern parameter square, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public BlackMovesMatch newMatch(final Piece pPiece, final Square pSquare) {
    return BlackMovesMatch.newMatch(pPiece, pSquare);
  }
  
  /**
   * Retrieve the set of values that occur in matches for piece.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Piece> rawAccumulateAllValuesOfpiece(final Object[] parameters) {
    Set<Piece> results = new HashSet<Piece>();
    rawAccumulateAllValues(POSITION_PIECE, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for piece.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Piece> getAllValuesOfpiece() {
    return rawAccumulateAllValuesOfpiece(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for piece.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Piece> getAllValuesOfpiece(final BlackMovesMatch partialMatch) {
    return rawAccumulateAllValuesOfpiece(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for piece.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Piece> getAllValuesOfpiece(final Square pSquare) {
    return rawAccumulateAllValuesOfpiece(new Object[]{
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
  public Set<Square> getAllValuesOfsquare(final BlackMovesMatch partialMatch) {
    return rawAccumulateAllValuesOfsquare(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for square.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Square> getAllValuesOfsquare(final Piece pPiece) {
    return rawAccumulateAllValuesOfsquare(new Object[]{
    pPiece, 
    null
    });
  }
  
  @Override
  protected BlackMovesMatch tupleToMatch(final Tuple t) {
    try {
    	return BlackMovesMatch.newMatch((Piece) t.get(POSITION_PIECE), (Square) t.get(POSITION_SQUARE));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected BlackMovesMatch arrayToMatch(final Object[] match) {
    try {
    	return BlackMovesMatch.newMatch((Piece) match[POSITION_PIECE], (Square) match[POSITION_SQUARE]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected BlackMovesMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return BlackMovesMatch.newMutableMatch((Piece) match[POSITION_PIECE], (Square) match[POSITION_SQUARE]);
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
  public static IQuerySpecification<BlackMovesMatcher> querySpecification() throws ViatraQueryException {
    return BlackMovesQuerySpecification.instance();
  }
}
