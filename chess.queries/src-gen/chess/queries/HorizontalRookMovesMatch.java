package chess.queries;

import chess.queries.util.HorizontalRookMovesQuerySpecification;
import chessdiagram.Piece;
import chessdiagram.Square;
import java.util.Arrays;
import java.util.List;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;

/**
 * Pattern-specific match representation of the chess.queries.horizontalRookMoves pattern,
 * to be used in conjunction with {@link HorizontalRookMovesMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see HorizontalRookMovesMatcher
 * @see HorizontalRookMovesProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class HorizontalRookMovesMatch extends BasePatternMatch {
  private Piece fRook;
  
  private Square fSquare;
  
  private static List<String> parameterNames = makeImmutableList("rook", "square");
  
  private HorizontalRookMovesMatch(final Piece pRook, final Square pSquare) {
    this.fRook = pRook;
    this.fSquare = pSquare;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("rook".equals(parameterName)) return this.fRook;
    if ("square".equals(parameterName)) return this.fSquare;
    return null;
  }
  
  public Piece getRook() {
    return this.fRook;
  }
  
  public Square getSquare() {
    return this.fSquare;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("rook".equals(parameterName) ) {
    	this.fRook = (Piece) newValue;
    	return true;
    }
    if ("square".equals(parameterName) ) {
    	this.fSquare = (Square) newValue;
    	return true;
    }
    return false;
  }
  
  public void setRook(final Piece pRook) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fRook = pRook;
  }
  
  public void setSquare(final Square pSquare) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fSquare = pSquare;
  }
  
  @Override
  public String patternName() {
    return "chess.queries.horizontalRookMoves";
  }
  
  @Override
  public List<String> parameterNames() {
    return HorizontalRookMovesMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fRook, fSquare};
  }
  
  @Override
  public HorizontalRookMovesMatch toImmutable() {
    return isMutable() ? newMatch(fRook, fSquare) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"rook\"=" + prettyPrintValue(fRook) + ", ");
    
    result.append("\"square\"=" + prettyPrintValue(fSquare)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fRook == null) ? 0 : fRook.hashCode());
    result = prime * result + ((fSquare == null) ? 0 : fSquare.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof HorizontalRookMovesMatch)) { // this should be infrequent
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
    HorizontalRookMovesMatch other = (HorizontalRookMovesMatch) obj;
    if (fRook == null) {if (other.fRook != null) return false;}
    else if (!fRook.equals(other.fRook)) return false;
    if (fSquare == null) {if (other.fSquare != null) return false;}
    else if (!fSquare.equals(other.fSquare)) return false;
    return true;
  }
  
  @Override
  public HorizontalRookMovesQuerySpecification specification() {
    try {
    	return HorizontalRookMovesQuerySpecification.instance();
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
  public static HorizontalRookMovesMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pRook the fixed value of pattern parameter rook, or null if not bound.
   * @param pSquare the fixed value of pattern parameter square, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static HorizontalRookMovesMatch newMutableMatch(final Piece pRook, final Square pSquare) {
    return new Mutable(pRook, pSquare);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pRook the fixed value of pattern parameter rook, or null if not bound.
   * @param pSquare the fixed value of pattern parameter square, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static HorizontalRookMovesMatch newMatch(final Piece pRook, final Square pSquare) {
    return new Immutable(pRook, pSquare);
  }
  
  private static final class Mutable extends HorizontalRookMovesMatch {
    Mutable(final Piece pRook, final Square pSquare) {
      super(pRook, pSquare);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends HorizontalRookMovesMatch {
    Immutable(final Piece pRook, final Square pSquare) {
      super(pRook, pSquare);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
