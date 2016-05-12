package chess.queries;

import chess.queries.PieceOnSquareMatch;
import chess.queries.util.PieceOnSquareQuerySpecification;
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
 * Generated pattern matcher API of the chess.queries.pieceOnSquare pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
 * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link PieceOnSquareMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern pieceOnSquare(square : Square, piece : Piece) {
 * 	Square.id(square, id);
 * 	Piece.pos(piece, id);
 * }
 * </pre></code>
 * 
 * @see PieceOnSquareMatch
 * @see PieceOnSquareProcessor
 * @see PieceOnSquareQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class PieceOnSquareMatcher extends BaseMatcher<PieceOnSquareMatch> {
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static PieceOnSquareMatcher on(final ViatraQueryEngine engine) throws ViatraQueryException {
    // check if matcher already exists
    PieceOnSquareMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new PieceOnSquareMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_SQUARE = 0;
  
  private final static int POSITION_PIECE = 1;
  
  private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(PieceOnSquareMatcher.class);
  
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  private PieceOnSquareMatcher(final ViatraQueryEngine engine) throws ViatraQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pSquare the fixed value of pattern parameter square, or null if not bound.
   * @param pPiece the fixed value of pattern parameter piece, or null if not bound.
   * @return matches represented as a PieceOnSquareMatch object.
   * 
   */
  public Collection<PieceOnSquareMatch> getAllMatches(final Square pSquare, final Piece pPiece) {
    return rawGetAllMatches(new Object[]{pSquare, pPiece});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pSquare the fixed value of pattern parameter square, or null if not bound.
   * @param pPiece the fixed value of pattern parameter piece, or null if not bound.
   * @return a match represented as a PieceOnSquareMatch object, or null if no match is found.
   * 
   */
  public PieceOnSquareMatch getOneArbitraryMatch(final Square pSquare, final Piece pPiece) {
    return rawGetOneArbitraryMatch(new Object[]{pSquare, pPiece});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pSquare the fixed value of pattern parameter square, or null if not bound.
   * @param pPiece the fixed value of pattern parameter piece, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Square pSquare, final Piece pPiece) {
    return rawHasMatch(new Object[]{pSquare, pPiece});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pSquare the fixed value of pattern parameter square, or null if not bound.
   * @param pPiece the fixed value of pattern parameter piece, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Square pSquare, final Piece pPiece) {
    return rawCountMatches(new Object[]{pSquare, pPiece});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pSquare the fixed value of pattern parameter square, or null if not bound.
   * @param pPiece the fixed value of pattern parameter piece, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Square pSquare, final Piece pPiece, final IMatchProcessor<? super PieceOnSquareMatch> processor) {
    rawForEachMatch(new Object[]{pSquare, pPiece}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pSquare the fixed value of pattern parameter square, or null if not bound.
   * @param pPiece the fixed value of pattern parameter piece, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Square pSquare, final Piece pPiece, final IMatchProcessor<? super PieceOnSquareMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pSquare, pPiece}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pSquare the fixed value of pattern parameter square, or null if not bound.
   * @param pPiece the fixed value of pattern parameter piece, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public PieceOnSquareMatch newMatch(final Square pSquare, final Piece pPiece) {
    return PieceOnSquareMatch.newMatch(pSquare, pPiece);
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
  public Set<Square> getAllValuesOfsquare(final PieceOnSquareMatch partialMatch) {
    return rawAccumulateAllValuesOfsquare(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for square.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Square> getAllValuesOfsquare(final Piece pPiece) {
    return rawAccumulateAllValuesOfsquare(new Object[]{
    null, 
    pPiece
    });
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
  public Set<Piece> getAllValuesOfpiece(final PieceOnSquareMatch partialMatch) {
    return rawAccumulateAllValuesOfpiece(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for piece.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Piece> getAllValuesOfpiece(final Square pSquare) {
    return rawAccumulateAllValuesOfpiece(new Object[]{
    pSquare, 
    null
    });
  }
  
  @Override
  protected PieceOnSquareMatch tupleToMatch(final Tuple t) {
    try {
    	return PieceOnSquareMatch.newMatch((Square) t.get(POSITION_SQUARE), (Piece) t.get(POSITION_PIECE));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected PieceOnSquareMatch arrayToMatch(final Object[] match) {
    try {
    	return PieceOnSquareMatch.newMatch((Square) match[POSITION_SQUARE], (Piece) match[POSITION_PIECE]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected PieceOnSquareMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return PieceOnSquareMatch.newMutableMatch((Square) match[POSITION_SQUARE], (Piece) match[POSITION_PIECE]);
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
  public static IQuerySpecification<PieceOnSquareMatcher> querySpecification() throws ViatraQueryException {
    return PieceOnSquareQuerySpecification.instance();
  }
}
