package chess.queries;

import chess.queries.InChessWhiteMatch;
import chess.queries.util.InChessWhiteQuerySpecification;
import chessdiagram.Chess;
import chessdiagram.King;
import chessdiagram.Piece;
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
 * Generated pattern matcher API of the chess.queries.inChessWhite pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
 * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link InChessWhiteMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern inChessWhite(king: King, piece : Piece, chess : Chess){
 * 	King.colour(king, ::White);
 * 	find square(king, kingSquare);
 * 	find blackMoves(piece, kingSquare, chess);
 * }
 * </pre></code>
 * 
 * @see InChessWhiteMatch
 * @see InChessWhiteProcessor
 * @see InChessWhiteQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class InChessWhiteMatcher extends BaseMatcher<InChessWhiteMatch> {
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static InChessWhiteMatcher on(final ViatraQueryEngine engine) throws ViatraQueryException {
    // check if matcher already exists
    InChessWhiteMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new InChessWhiteMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_KING = 0;
  
  private final static int POSITION_PIECE = 1;
  
  private final static int POSITION_CHESS = 2;
  
  private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(InChessWhiteMatcher.class);
  
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  private InChessWhiteMatcher(final ViatraQueryEngine engine) throws ViatraQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pKing the fixed value of pattern parameter king, or null if not bound.
   * @param pPiece the fixed value of pattern parameter piece, or null if not bound.
   * @param pChess the fixed value of pattern parameter chess, or null if not bound.
   * @return matches represented as a InChessWhiteMatch object.
   * 
   */
  public Collection<InChessWhiteMatch> getAllMatches(final King pKing, final Piece pPiece, final Chess pChess) {
    return rawGetAllMatches(new Object[]{pKing, pPiece, pChess});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pKing the fixed value of pattern parameter king, or null if not bound.
   * @param pPiece the fixed value of pattern parameter piece, or null if not bound.
   * @param pChess the fixed value of pattern parameter chess, or null if not bound.
   * @return a match represented as a InChessWhiteMatch object, or null if no match is found.
   * 
   */
  public InChessWhiteMatch getOneArbitraryMatch(final King pKing, final Piece pPiece, final Chess pChess) {
    return rawGetOneArbitraryMatch(new Object[]{pKing, pPiece, pChess});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pKing the fixed value of pattern parameter king, or null if not bound.
   * @param pPiece the fixed value of pattern parameter piece, or null if not bound.
   * @param pChess the fixed value of pattern parameter chess, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final King pKing, final Piece pPiece, final Chess pChess) {
    return rawHasMatch(new Object[]{pKing, pPiece, pChess});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pKing the fixed value of pattern parameter king, or null if not bound.
   * @param pPiece the fixed value of pattern parameter piece, or null if not bound.
   * @param pChess the fixed value of pattern parameter chess, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final King pKing, final Piece pPiece, final Chess pChess) {
    return rawCountMatches(new Object[]{pKing, pPiece, pChess});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pKing the fixed value of pattern parameter king, or null if not bound.
   * @param pPiece the fixed value of pattern parameter piece, or null if not bound.
   * @param pChess the fixed value of pattern parameter chess, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final King pKing, final Piece pPiece, final Chess pChess, final IMatchProcessor<? super InChessWhiteMatch> processor) {
    rawForEachMatch(new Object[]{pKing, pPiece, pChess}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pKing the fixed value of pattern parameter king, or null if not bound.
   * @param pPiece the fixed value of pattern parameter piece, or null if not bound.
   * @param pChess the fixed value of pattern parameter chess, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final King pKing, final Piece pPiece, final Chess pChess, final IMatchProcessor<? super InChessWhiteMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pKing, pPiece, pChess}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pKing the fixed value of pattern parameter king, or null if not bound.
   * @param pPiece the fixed value of pattern parameter piece, or null if not bound.
   * @param pChess the fixed value of pattern parameter chess, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public InChessWhiteMatch newMatch(final King pKing, final Piece pPiece, final Chess pChess) {
    return InChessWhiteMatch.newMatch(pKing, pPiece, pChess);
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
  public Set<King> getAllValuesOfking(final InChessWhiteMatch partialMatch) {
    return rawAccumulateAllValuesOfking(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for king.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<King> getAllValuesOfking(final Piece pPiece, final Chess pChess) {
    return rawAccumulateAllValuesOfking(new Object[]{
    null, 
    pPiece, 
    pChess
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
  public Set<Piece> getAllValuesOfpiece(final InChessWhiteMatch partialMatch) {
    return rawAccumulateAllValuesOfpiece(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for piece.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Piece> getAllValuesOfpiece(final King pKing, final Chess pChess) {
    return rawAccumulateAllValuesOfpiece(new Object[]{
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
  public Set<Chess> getAllValuesOfchess(final InChessWhiteMatch partialMatch) {
    return rawAccumulateAllValuesOfchess(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for chess.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Chess> getAllValuesOfchess(final King pKing, final Piece pPiece) {
    return rawAccumulateAllValuesOfchess(new Object[]{
    pKing, 
    pPiece, 
    null
    });
  }
  
  @Override
  protected InChessWhiteMatch tupleToMatch(final Tuple t) {
    try {
    	return InChessWhiteMatch.newMatch((King) t.get(POSITION_KING), (Piece) t.get(POSITION_PIECE), (Chess) t.get(POSITION_CHESS));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected InChessWhiteMatch arrayToMatch(final Object[] match) {
    try {
    	return InChessWhiteMatch.newMatch((King) match[POSITION_KING], (Piece) match[POSITION_PIECE], (Chess) match[POSITION_CHESS]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected InChessWhiteMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return InChessWhiteMatch.newMutableMatch((King) match[POSITION_KING], (Piece) match[POSITION_PIECE], (Chess) match[POSITION_CHESS]);
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
  public static IQuerySpecification<InChessWhiteMatcher> querySpecification() throws ViatraQueryException {
    return InChessWhiteQuerySpecification.instance();
  }
}
