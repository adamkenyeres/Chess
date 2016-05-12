package chess.queries;

import chess.queries.PiecesOfBlackPlayerMatch;
import chess.queries.util.PiecesOfBlackPlayerQuerySpecification;
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
 * Generated pattern matcher API of the chess.queries.piecesOfBlackPlayer pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
 * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link PiecesOfBlackPlayerMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern piecesOfBlackPlayer(piece : Piece) {
 * 	Piece.colour(piece, ::Black);
 * }
 * </pre></code>
 * 
 * @see PiecesOfBlackPlayerMatch
 * @see PiecesOfBlackPlayerProcessor
 * @see PiecesOfBlackPlayerQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class PiecesOfBlackPlayerMatcher extends BaseMatcher<PiecesOfBlackPlayerMatch> {
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static PiecesOfBlackPlayerMatcher on(final ViatraQueryEngine engine) throws ViatraQueryException {
    // check if matcher already exists
    PiecesOfBlackPlayerMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new PiecesOfBlackPlayerMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_PIECE = 0;
  
  private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(PiecesOfBlackPlayerMatcher.class);
  
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  private PiecesOfBlackPlayerMatcher(final ViatraQueryEngine engine) throws ViatraQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pPiece the fixed value of pattern parameter piece, or null if not bound.
   * @return matches represented as a PiecesOfBlackPlayerMatch object.
   * 
   */
  public Collection<PiecesOfBlackPlayerMatch> getAllMatches(final Piece pPiece) {
    return rawGetAllMatches(new Object[]{pPiece});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pPiece the fixed value of pattern parameter piece, or null if not bound.
   * @return a match represented as a PiecesOfBlackPlayerMatch object, or null if no match is found.
   * 
   */
  public PiecesOfBlackPlayerMatch getOneArbitraryMatch(final Piece pPiece) {
    return rawGetOneArbitraryMatch(new Object[]{pPiece});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pPiece the fixed value of pattern parameter piece, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Piece pPiece) {
    return rawHasMatch(new Object[]{pPiece});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pPiece the fixed value of pattern parameter piece, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Piece pPiece) {
    return rawCountMatches(new Object[]{pPiece});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pPiece the fixed value of pattern parameter piece, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Piece pPiece, final IMatchProcessor<? super PiecesOfBlackPlayerMatch> processor) {
    rawForEachMatch(new Object[]{pPiece}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pPiece the fixed value of pattern parameter piece, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Piece pPiece, final IMatchProcessor<? super PiecesOfBlackPlayerMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pPiece}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pPiece the fixed value of pattern parameter piece, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public PiecesOfBlackPlayerMatch newMatch(final Piece pPiece) {
    return PiecesOfBlackPlayerMatch.newMatch(pPiece);
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
  
  @Override
  protected PiecesOfBlackPlayerMatch tupleToMatch(final Tuple t) {
    try {
    	return PiecesOfBlackPlayerMatch.newMatch((Piece) t.get(POSITION_PIECE));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected PiecesOfBlackPlayerMatch arrayToMatch(final Object[] match) {
    try {
    	return PiecesOfBlackPlayerMatch.newMatch((Piece) match[POSITION_PIECE]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected PiecesOfBlackPlayerMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return PiecesOfBlackPlayerMatch.newMutableMatch((Piece) match[POSITION_PIECE]);
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
  public static IQuerySpecification<PiecesOfBlackPlayerMatcher> querySpecification() throws ViatraQueryException {
    return PiecesOfBlackPlayerQuerySpecification.instance();
  }
}
