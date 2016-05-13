package chess.queries;

import chess.queries.KingMovesMatch;
import chess.queries.util.KingMovesQuerySpecification;
import chessdiagram.Chess;
import chessdiagram.King;
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
 * Generated pattern matcher API of the chess.queries.kingMoves pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
 * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link KingMovesMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern kingMoves(king : King, square : Square, chess : Chess){
 * 	find square(king, kingSquare);
 * 	find N(kingSquare, square);
 * 	neg find pieceOnSquaree(square);
 * 	Chess(chess);
 * }or{
 * 	find square(king, kingSquare);
 * 	find NE(kingSquare, square);
 * 	neg find pieceOnSquaree(square);
 * 	Chess(chess);
 * }or{
 * 	find square(king, kingSquare);
 * 	find E(kingSquare, square);
 * 	neg find pieceOnSquaree(square);
 * 	Chess(chess);
 * }or{
 * 	find square(king, kingSquare);
 * 	find SE(kingSquare, square);
 * 	neg find pieceOnSquaree(square);
 * 	Chess(chess);
 * }or{
 * 	find square(king, kingSquare);
 * 	find S(kingSquare, square);
 * 	neg find pieceOnSquaree(square);
 * 	Chess(chess);
 * }or{
 * 	find square(king, kingSquare);
 * 	find SW(kingSquare, square);
 * 	neg find pieceOnSquaree(square);
 * 	Chess(chess);
 * }or{
 * 	find square(king, kingSquare);
 * 	find W(kingSquare, square);
 * 	neg find pieceOnSquaree(square);
 * 	Chess(chess);
 * }or{
 * 	find square(king, kingSquare);
 * 	find NW(kingSquare, square);
 * 	neg find pieceOnSquaree(square);
 * 	Chess(chess);
 * }or{
 * 	find square(king, queenSquare); //South East moves atacking
 * 	find N(queenSquare, square);
 * 	find pieceOnSquare(square, piece);
 * 	find canAttack(king, piece);
 * 	Chess(chess);
 * }or{
 * 	find square(king, queenSquare); //South East moves atacking
 * 	find NE(queenSquare, square);
 * 	find pieceOnSquare(square, piece);
 * 	find canAttack(king, piece);
 * 	Chess(chess);
 * }or{
 * 	find square(king, queenSquare); //South East moves atacking
 * 	find E(queenSquare, square);
 * 	find pieceOnSquare(square, piece);
 * 	find canAttack(king, piece);
 * 	Chess(chess);
 * }or{
 * 	find square(king, queenSquare); //South East moves atacking
 * 	find SE(queenSquare, square);
 * 	find pieceOnSquare(square, piece);
 * 	find canAttack(king, piece);
 * 	Chess(chess);
 * }or{
 * 	find square(king, queenSquare); //South East moves atacking
 * 	find S(queenSquare, square);
 * 	find pieceOnSquare(square, piece);
 * 	find canAttack(king, piece);
 * 	Chess(chess);
 * }or{
 * 	find square(king, queenSquare); //South East moves atacking
 * 	find SW(queenSquare, square);
 * 	find pieceOnSquare(square, piece);
 * 	find canAttack(king, piece);
 * 	Chess(chess);
 * }or{
 * 	find square(king, queenSquare); //South East moves atacking
 * 	find W(queenSquare, square);
 * 	find pieceOnSquare(square, piece);
 * 	find canAttack(king, piece);
 * 	Chess(chess);
 * }or{
 * 	find square(king, queenSquare); //South East moves atacking
 * 	find NW(queenSquare, square);
 * 	find pieceOnSquare(square, piece);
 * 	find canAttack(king, piece);
 * 	Chess(chess);
 * }or{
 * 	King.firstMove(king, firsMoveKing);	//Casting All for possible ways
 * 	check(firsMoveKing == true);
 * 	find square(king, kingSquare);
 * 	Square.id(square,56);
 * 	find pieceOnSquare(square, rook);
 * 	find movesWest(kingSquare, _, square);
 * 	Rook.firstMove(rook, firstRookMove);
 * 	check(firstRookMove == true);
 * 	Chess(chess);
 * }or{
 * 	King.firstMove(king, firsMoveKing);
 * 	check(firsMoveKing == true);
 * 	find square(king, kingSquare);
 * 	Square.id(square,63);
 * 	find pieceOnSquare(square, rook);
 * 	find movesEast(kingSquare, _, square);
 * 	Rook.firstMove(rook, firstRookMove);
 * 	check(firstRookMove == true);
 * 	Chess(chess);
 * }or{
 * 	King.firstMove(king, firsMoveKing);	//Casting for black king
 * 	check(firsMoveKing == true);
 * 	find square(king, kingSquare);
 * 	Square.id(square,0);
 * 	find pieceOnSquare(square, rook);
 * 	find movesWest(kingSquare, _, square);
 * 	Rook.firstMove(rook, firstRookMove);
 * 	check(firstRookMove == true);
 * 	Chess(chess);
 * }or{
 * 	King.firstMove(king, firsMoveKing);	
 * 	check(firsMoveKing == true);
 * 	find square(king, kingSquare);
 * 	Square.id(square,7);
 * 	find pieceOnSquare(square, rook);
 * 	find movesEast(kingSquare, _, square);
 * 	Rook.firstMove(rook, firstRookMove);
 * 	check(firstRookMove == true);
 * 	Chess(chess);
 * }
 * </pre></code>
 * 
 * @see KingMovesMatch
 * @see KingMovesProcessor
 * @see KingMovesQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class KingMovesMatcher extends BaseMatcher<KingMovesMatch> {
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static KingMovesMatcher on(final ViatraQueryEngine engine) throws ViatraQueryException {
    // check if matcher already exists
    KingMovesMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new KingMovesMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_KING = 0;
  
  private final static int POSITION_SQUARE = 1;
  
  private final static int POSITION_CHESS = 2;
  
  private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(KingMovesMatcher.class);
  
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  private KingMovesMatcher(final ViatraQueryEngine engine) throws ViatraQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pKing the fixed value of pattern parameter king, or null if not bound.
   * @param pSquare the fixed value of pattern parameter square, or null if not bound.
   * @param pChess the fixed value of pattern parameter chess, or null if not bound.
   * @return matches represented as a KingMovesMatch object.
   * 
   */
  public Collection<KingMovesMatch> getAllMatches(final King pKing, final Square pSquare, final Chess pChess) {
    return rawGetAllMatches(new Object[]{pKing, pSquare, pChess});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pKing the fixed value of pattern parameter king, or null if not bound.
   * @param pSquare the fixed value of pattern parameter square, or null if not bound.
   * @param pChess the fixed value of pattern parameter chess, or null if not bound.
   * @return a match represented as a KingMovesMatch object, or null if no match is found.
   * 
   */
  public KingMovesMatch getOneArbitraryMatch(final King pKing, final Square pSquare, final Chess pChess) {
    return rawGetOneArbitraryMatch(new Object[]{pKing, pSquare, pChess});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pKing the fixed value of pattern parameter king, or null if not bound.
   * @param pSquare the fixed value of pattern parameter square, or null if not bound.
   * @param pChess the fixed value of pattern parameter chess, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final King pKing, final Square pSquare, final Chess pChess) {
    return rawHasMatch(new Object[]{pKing, pSquare, pChess});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pKing the fixed value of pattern parameter king, or null if not bound.
   * @param pSquare the fixed value of pattern parameter square, or null if not bound.
   * @param pChess the fixed value of pattern parameter chess, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final King pKing, final Square pSquare, final Chess pChess) {
    return rawCountMatches(new Object[]{pKing, pSquare, pChess});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pKing the fixed value of pattern parameter king, or null if not bound.
   * @param pSquare the fixed value of pattern parameter square, or null if not bound.
   * @param pChess the fixed value of pattern parameter chess, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final King pKing, final Square pSquare, final Chess pChess, final IMatchProcessor<? super KingMovesMatch> processor) {
    rawForEachMatch(new Object[]{pKing, pSquare, pChess}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pKing the fixed value of pattern parameter king, or null if not bound.
   * @param pSquare the fixed value of pattern parameter square, or null if not bound.
   * @param pChess the fixed value of pattern parameter chess, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final King pKing, final Square pSquare, final Chess pChess, final IMatchProcessor<? super KingMovesMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pKing, pSquare, pChess}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pKing the fixed value of pattern parameter king, or null if not bound.
   * @param pSquare the fixed value of pattern parameter square, or null if not bound.
   * @param pChess the fixed value of pattern parameter chess, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public KingMovesMatch newMatch(final King pKing, final Square pSquare, final Chess pChess) {
    return KingMovesMatch.newMatch(pKing, pSquare, pChess);
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
  
  /**
   * Retrieve the set of values that occur in matches for king.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<King> getAllValuesOfking(final KingMovesMatch partialMatch) {
    return rawAccumulateAllValuesOfking(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for king.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<King> getAllValuesOfking(final Square pSquare, final Chess pChess) {
    return rawAccumulateAllValuesOfking(new Object[]{
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
  public Set<Square> getAllValuesOfsquare(final KingMovesMatch partialMatch) {
    return rawAccumulateAllValuesOfsquare(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for square.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Square> getAllValuesOfsquare(final King pKing, final Chess pChess) {
    return rawAccumulateAllValuesOfsquare(new Object[]{
    pKing, 
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
  public Set<Chess> getAllValuesOfchess(final KingMovesMatch partialMatch) {
    return rawAccumulateAllValuesOfchess(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for chess.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Chess> getAllValuesOfchess(final King pKing, final Square pSquare) {
    return rawAccumulateAllValuesOfchess(new Object[]{
    pKing, 
    pSquare, 
    null
    });
  }
  
  @Override
  protected KingMovesMatch tupleToMatch(final Tuple t) {
    try {
    	return KingMovesMatch.newMatch((King) t.get(POSITION_KING), (Square) t.get(POSITION_SQUARE), (Chess) t.get(POSITION_CHESS));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected KingMovesMatch arrayToMatch(final Object[] match) {
    try {
    	return KingMovesMatch.newMatch((King) match[POSITION_KING], (Square) match[POSITION_SQUARE], (Chess) match[POSITION_CHESS]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected KingMovesMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return KingMovesMatch.newMutableMatch((King) match[POSITION_KING], (Square) match[POSITION_SQUARE], (Chess) match[POSITION_CHESS]);
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
  public static IQuerySpecification<KingMovesMatcher> querySpecification() throws ViatraQueryException {
    return KingMovesQuerySpecification.instance();
  }
}
