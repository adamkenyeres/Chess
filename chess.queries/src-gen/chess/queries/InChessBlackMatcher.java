package chess.queries;

import chess.queries.InChessBlackMatch;
import chess.queries.util.InChessBlackQuerySpecification;
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
 * Generated pattern matcher API of the chess.queries.inChessBlack pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
 * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link InChessBlackMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern inChessBlack(king : King, piece : Piece, chess : Chess){
 * 	King.colour(king, ::Black);
 * 	find square(king, kingSquare);
 * 	find whiteMoves(piece, kingSquare, chess);
 * }
 * </pre></code>
 * 
 * @see InChessBlackMatch
 * @see InChessBlackProcessor
 * @see InChessBlackQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class InChessBlackMatcher extends BaseMatcher<InChessBlackMatch> {
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static InChessBlackMatcher on(final ViatraQueryEngine engine) throws ViatraQueryException {
    // check if matcher already exists
    InChessBlackMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new InChessBlackMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_KING = 0;
  
  private final static int POSITION_PIECE = 1;
  
  private final static int POSITION_CHESS = 2;
  
  private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(InChessBlackMatcher.class);
  
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  private InChessBlackMatcher(final ViatraQueryEngine engine) throws ViatraQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pKing the fixed value of pattern parameter king, or null if not bound.
   * @param pPiece the fixed value of pattern parameter piece, or null if not bound.
   * @param pChess the fixed value of pattern parameter chess, or null if not bound.
   * @return matches represented as a InChessBlackMatch object.
   * 
   */
  public Collection<InChessBlackMatch> getAllMatches(final King pKing, final Piece pPiece, final Chess pChess) {
    return rawGetAllMatches(new Object[]{pKing, pPiece, pChess});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pKing the fixed value of pattern parameter king, or null if not bound.
   * @param pPiece the fixed value of pattern parameter piece, or null if not bound.
   * @param pChess the fixed value of pattern parameter chess, or null if not bound.
   * @return a match represented as a InChessBlackMatch object, or null if no match is found.
   * 
   */
  public InChessBlackMatch getOneArbitraryMatch(final King pKing, final Piece pPiece, final Chess pChess) {
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
  public void forEachMatch(final King pKing, final Piece pPiece, final Chess pChess, final IMatchProcessor<? super InChessBlackMatch> processor) {
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
  public boolean forOneArbitraryMatch(final King pKing, final Piece pPiece, final Chess pChess, final IMatchProcessor<? super InChessBlackMatch> processor) {
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
  public InChessBlackMatch newMatch(final King pKing, final Piece pPiece, final Chess pChess) {
    return InChessBlackMatch.newMatch(pKing, pPiece, pChess);
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
  public Set<King> getAllValuesOfking(final InChessBlackMatch partialMatch) {
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
  public Set<Piece> getAllValuesOfpiece(final InChessBlackMatch partialMatch) {
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
  public Set<Chess> getAllValuesOfchess(final InChessBlackMatch partialMatch) {
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
  protected InChessBlackMatch tupleToMatch(final Tuple t) {
    try {
    	return InChessBlackMatch.newMatch((King) t.get(POSITION_KING), (Piece) t.get(POSITION_PIECE), (Chess) t.get(POSITION_CHESS));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected InChessBlackMatch arrayToMatch(final Object[] match) {
    try {
    	return InChessBlackMatch.newMatch((King) match[POSITION_KING], (Piece) match[POSITION_PIECE], (Chess) match[POSITION_CHESS]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected InChessBlackMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return InChessBlackMatch.newMutableMatch((King) match[POSITION_KING], (Piece) match[POSITION_PIECE], (Chess) match[POSITION_CHESS]);
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
  public static IQuerySpecification<InChessBlackMatcher> querySpecification() throws ViatraQueryException {
    return InChessBlackQuerySpecification.instance();
  }
}
