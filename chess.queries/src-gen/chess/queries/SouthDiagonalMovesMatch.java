package chess.queries;

import chess.queries.util.SouthDiagonalMovesQuerySpecification;
import chessdiagram.Piece;
import chessdiagram.Square;
import java.util.Arrays;
import java.util.List;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;

/**
 * Pattern-specific match representation of the chess.queries.southDiagonalMoves pattern,
 * to be used in conjunction with {@link SouthDiagonalMovesMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see SouthDiagonalMovesMatcher
 * @see SouthDiagonalMovesProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class SouthDiagonalMovesMatch extends BasePatternMatch {
  private Piece fBishop;
  
  private Square fSquare;
  
  private static List<String> parameterNames = makeImmutableList("bishop", "square");
  
  private SouthDiagonalMovesMatch(final Piece pBishop, final Square pSquare) {
    this.fBishop = pBishop;
    this.fSquare = pSquare;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("bishop".equals(parameterName)) return this.fBishop;
    if ("square".equals(parameterName)) return this.fSquare;
    return null;
  }
  
  public Piece getBishop() {
    return this.fBishop;
  }
  
  public Square getSquare() {
    return this.fSquare;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("bishop".equals(parameterName) ) {
    	this.fBishop = (Piece) newValue;
    	return true;
    }
    if ("square".equals(parameterName) ) {
    	this.fSquare = (Square) newValue;
    	return true;
    }
    return false;
  }
  
  public void setBishop(final Piece pBishop) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fBishop = pBishop;
  }
  
  public void setSquare(final Square pSquare) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fSquare = pSquare;
  }
  
  @Override
  public String patternName() {
    return "chess.queries.southDiagonalMoves";
  }
  
  @Override
  public List<String> parameterNames() {
    return SouthDiagonalMovesMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fBishop, fSquare};
  }
  
  @Override
  public SouthDiagonalMovesMatch toImmutable() {
    return isMutable() ? newMatch(fBishop, fSquare) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"bishop\"=" + prettyPrintValue(fBishop) + ", ");
    
    result.append("\"square\"=" + prettyPrintValue(fSquare)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fBishop == null) ? 0 : fBishop.hashCode());
    result = prime * result + ((fSquare == null) ? 0 : fSquare.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof SouthDiagonalMovesMatch)) { // this should be infrequent
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
    SouthDiagonalMovesMatch other = (SouthDiagonalMovesMatch) obj;
    if (fBishop == null) {if (other.fBishop != null) return false;}
    else if (!fBishop.equals(other.fBishop)) return false;
    if (fSquare == null) {if (other.fSquare != null) return false;}
    else if (!fSquare.equals(other.fSquare)) return false;
    return true;
  }
  
  @Override
  public SouthDiagonalMovesQuerySpecification specification() {
    try {
    	return SouthDiagonalMovesQuerySpecification.instance();
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
  public static SouthDiagonalMovesMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pBishop the fixed value of pattern parameter bishop, or null if not bound.
   * @param pSquare the fixed value of pattern parameter square, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static SouthDiagonalMovesMatch newMutableMatch(final Piece pBishop, final Square pSquare) {
    return new Mutable(pBishop, pSquare);
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
  public static SouthDiagonalMovesMatch newMatch(final Piece pBishop, final Square pSquare) {
    return new Immutable(pBishop, pSquare);
  }
  
  private static final class Mutable extends SouthDiagonalMovesMatch {
    Mutable(final Piece pBishop, final Square pSquare) {
      super(pBishop, pSquare);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends SouthDiagonalMovesMatch {
    Immutable(final Piece pBishop, final Square pSquare) {
      super(pBishop, pSquare);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
