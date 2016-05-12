package chess.queries;

import chess.queries.WhitePawnMovesMatch;
import chess.queries.util.WhitePawnMovesQuerySpecification;
import chessdiagram.Pawn;
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
 * Generated pattern matcher API of the chess.queries.whitePawnMoves pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
 * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link WhitePawnMovesMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern whitePawnMoves(piece : Pawn, square : Square) {
 * 	Pawn.colour(piece, ::White);
 * 	find squareForPiece(piece, squarePiece);
 * 	find N(squarePiece, square);
 * 	neg find pieceOnSquaree(square);
 * } or {
 * 	Pawn.colour(piece, ::White); //Two steps
 * 	find squareForPiece(piece, squarePiece);
 * 	find N(squarePiece, squareNorth);
 * 	find N(squareNorth, square);
 * 	neg find pieceOnSquaree(squareNorth);
 * 	neg find pieceOnSquaree(square);
 * 	Pawn.firstMove(piece, bool);
 * 	check(bool == true);
 * } or {
 * 	Pawn.colour(piece, ::White);
 * 	find squareForPiece(piece, squarePiece);
 * 	find NW(squarePiece, square);
 * 	find squareContainsBlackPiece(square);
 * } or {
 * 	Pawn.colour(piece, ::White);
 * 	find squareForPiece(piece, squarePiece);
 * 	find NE(squarePiece, square);
 * 	find squareContainsBlackPiece(square);
 * } or {
 * 	Pawn.colour(piece, ::White);
 * 	find squareForPiece(piece, pieceSquare);
 * 	find W(pieceSquare, atackingSquare);
 * 	find pieceOnSquare(atackingSquare, atackingPawn);
 * 	find canAttack(piece, atackingPawn);
 * 	Pawn.enPassantEnabled(atackingPawn, bool);
 * 	check(bool == true);
 * 	find N(atackingSquare, square);
 * } or {
 * 	Pawn.colour(piece, ::White);
 * 	find squareForPiece(piece, pieceSquare);
 * 	find E(pieceSquare, atackingSquare);
 * 	find pieceOnSquare(atackingSquare, atackingPawn);
 * 	find canAttack(piece, atackingPawn);
 * 	Pawn.enPassantEnabled(atackingPawn, bool);
 * 	check(bool == true);
 * 	find N(atackingSquare, square);
 * }
 * </pre></code>
 * 
 * @see WhitePawnMovesMatch
 * @see WhitePawnMovesProcessor
 * @see WhitePawnMovesQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class WhitePawnMovesMatcher extends BaseMatcher<WhitePawnMovesMatch> {
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static WhitePawnMovesMatcher on(final ViatraQueryEngine engine) throws ViatraQueryException {
    // check if matcher already exists
    WhitePawnMovesMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new WhitePawnMovesMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_PIECE = 0;
  
  private final static int POSITION_SQUARE = 1;
  
  private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(WhitePawnMovesMatcher.class);
  
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  private WhitePawnMovesMatcher(final ViatraQueryEngine engine) throws ViatraQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pPiece the fixed value of pattern parameter piece, or null if not bound.
   * @param pSquare the fixed value of pattern parameter square, or null if not bound.
   * @return matches represented as a WhitePawnMovesMatch object.
   * 
   */
  public Collection<WhitePawnMovesMatch> getAllMatches(final Pawn pPiece, final Square pSquare) {
    return rawGetAllMatches(new Object[]{pPiece, pSquare});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pPiece the fixed value of pattern parameter piece, or null if not bound.
   * @param pSquare the fixed value of pattern parameter square, or null if not bound.
   * @return a match represented as a WhitePawnMovesMatch object, or null if no match is found.
   * 
   */
  public WhitePawnMovesMatch getOneArbitraryMatch(final Pawn pPiece, final Square pSquare) {
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
  public boolean hasMatch(final Pawn pPiece, final Square pSquare) {
    return rawHasMatch(new Object[]{pPiece, pSquare});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pPiece the fixed value of pattern parameter piece, or null if not bound.
   * @param pSquare the fixed value of pattern parameter square, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Pawn pPiece, final Square pSquare) {
    return rawCountMatches(new Object[]{pPiece, pSquare});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pPiece the fixed value of pattern parameter piece, or null if not bound.
   * @param pSquare the fixed value of pattern parameter square, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Pawn pPiece, final Square pSquare, final IMatchProcessor<? super WhitePawnMovesMatch> processor) {
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
  public boolean forOneArbitraryMatch(final Pawn pPiece, final Square pSquare, final IMatchProcessor<? super WhitePawnMovesMatch> processor) {
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
  public WhitePawnMovesMatch newMatch(final Pawn pPiece, final Square pSquare) {
    return WhitePawnMovesMatch.newMatch(pPiece, pSquare);
  }
  
  /**
   * Retrieve the set of values that occur in matches for piece.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Pawn> rawAccumulateAllValuesOfpiece(final Object[] parameters) {
    Set<Pawn> results = new HashSet<Pawn>();
    rawAccumulateAllValues(POSITION_PIECE, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for piece.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Pawn> getAllValuesOfpiece() {
    return rawAccumulateAllValuesOfpiece(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for piece.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Pawn> getAllValuesOfpiece(final WhitePawnMovesMatch partialMatch) {
    return rawAccumulateAllValuesOfpiece(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for piece.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Pawn> getAllValuesOfpiece(final Square pSquare) {
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
  public Set<Square> getAllValuesOfsquare(final WhitePawnMovesMatch partialMatch) {
    return rawAccumulateAllValuesOfsquare(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for square.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Square> getAllValuesOfsquare(final Pawn pPiece) {
    return rawAccumulateAllValuesOfsquare(new Object[]{
    pPiece, 
    null
    });
  }
  
  @Override
  protected WhitePawnMovesMatch tupleToMatch(final Tuple t) {
    try {
    	return WhitePawnMovesMatch.newMatch((Pawn) t.get(POSITION_PIECE), (Square) t.get(POSITION_SQUARE));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected WhitePawnMovesMatch arrayToMatch(final Object[] match) {
    try {
    	return WhitePawnMovesMatch.newMatch((Pawn) match[POSITION_PIECE], (Square) match[POSITION_SQUARE]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected WhitePawnMovesMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return WhitePawnMovesMatch.newMutableMatch((Pawn) match[POSITION_PIECE], (Square) match[POSITION_SQUARE]);
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
  public static IQuerySpecification<WhitePawnMovesMatcher> querySpecification() throws ViatraQueryException {
    return WhitePawnMovesQuerySpecification.instance();
  }
}
