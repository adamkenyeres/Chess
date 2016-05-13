package chess.queries;

import chess.queries.util.KnightMovesQuerySpecification;
import chessdiagram.Chess;
import chessdiagram.Knight;
import chessdiagram.Square;
import java.util.Arrays;
import java.util.List;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;

/**
 * Pattern-specific match representation of the chess.queries.knightMoves pattern,
 * to be used in conjunction with {@link KnightMovesMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see KnightMovesMatcher
 * @see KnightMovesProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class KnightMovesMatch extends BasePatternMatch {
  private Knight fKnight;
  
  private Square fSquare;
  
  private Chess fChess;
  
  private static List<String> parameterNames = makeImmutableList("knight", "square", "chess");
  
  private KnightMovesMatch(final Knight pKnight, final Square pSquare, final Chess pChess) {
    this.fKnight = pKnight;
    this.fSquare = pSquare;
    this.fChess = pChess;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("knight".equals(parameterName)) return this.fKnight;
    if ("square".equals(parameterName)) return this.fSquare;
    if ("chess".equals(parameterName)) return this.fChess;
    return null;
  }
  
  public Knight getKnight() {
    return this.fKnight;
  }
  
  public Square getSquare() {
    return this.fSquare;
  }
  
  public Chess getChess() {
    return this.fChess;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("knight".equals(parameterName) ) {
    	this.fKnight = (Knight) newValue;
    	return true;
    }
    if ("square".equals(parameterName) ) {
    	this.fSquare = (Square) newValue;
    	return true;
    }
    if ("chess".equals(parameterName) ) {
    	this.fChess = (Chess) newValue;
    	return true;
    }
    return false;
  }
  
  public void setKnight(final Knight pKnight) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fKnight = pKnight;
  }
  
  public void setSquare(final Square pSquare) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fSquare = pSquare;
  }
  
  public void setChess(final Chess pChess) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fChess = pChess;
  }
  
  @Override
  public String patternName() {
    return "chess.queries.knightMoves";
  }
  
  @Override
  public List<String> parameterNames() {
    return KnightMovesMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fKnight, fSquare, fChess};
  }
  
  @Override
  public KnightMovesMatch toImmutable() {
    return isMutable() ? newMatch(fKnight, fSquare, fChess) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"knight\"=" + prettyPrintValue(fKnight) + ", ");
    
    result.append("\"square\"=" + prettyPrintValue(fSquare) + ", ");
    
    result.append("\"chess\"=" + prettyPrintValue(fChess)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fKnight == null) ? 0 : fKnight.hashCode());
    result = prime * result + ((fSquare == null) ? 0 : fSquare.hashCode());
    result = prime * result + ((fChess == null) ? 0 : fChess.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof KnightMovesMatch)) { // this should be infrequent
    	if (obj == null) {
    		return false;
    	}
    	if (!(obj instanceof IPatternMatch)) {
    		return false;
    	}
    	IPatternMatch otherSig  = (IPatternMatch) obj;
    	if (!specification().equals(otherSig.specification()))
    		return false;
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    }
    KnightMovesMatch other = (KnightMovesMatch) obj;
    if (fKnight == null) {if (other.fKnight != null) return false;}
    else if (!fKnight.equals(other.fKnight)) return false;
    if (fSquare == null) {if (other.fSquare != null) return false;}
    else if (!fSquare.equals(other.fSquare)) return false;
    if (fChess == null) {if (other.fChess != null) return false;}
    else if (!fChess.equals(other.fChess)) return false;
    return true;
  }
  
  @Override
  public KnightMovesQuerySpecification specification() {
    try {
    	return KnightMovesQuerySpecification.instance();
    } catch (ViatraQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the query specification exists
     	throw new IllegalStateException (ex);
    }
  }
  
  /**
   * Returns an empty, mutable match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @return the empty match.
   * 
   */
  public static KnightMovesMatch newEmptyMatch() {
    return new Mutable(null, null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pKnight the fixed value of pattern parameter knight, or null if not bound.
   * @param pSquare the fixed value of pattern parameter square, or null if not bound.
   * @param pChess the fixed value of pattern parameter chess, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static KnightMovesMatch newMutableMatch(final Knight pKnight, final Square pSquare, final Chess pChess) {
    return new Mutable(pKnight, pSquare, pChess);
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
  public static KnightMovesMatch newMatch(final Knight pKnight, final Square pSquare, final Chess pChess) {
    return new Immutable(pKnight, pSquare, pChess);
  }
  
  private static final class Mutable extends KnightMovesMatch {
    Mutable(final Knight pKnight, final Square pSquare, final Chess pChess) {
      super(pKnight, pSquare, pChess);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends KnightMovesMatch {
    Immutable(final Knight pKnight, final Square pSquare, final Chess pChess) {
      super(pKnight, pSquare, pChess);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
