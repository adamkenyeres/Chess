package chess.queries;

import chess.queries.util.PieceOnSquareeQuerySpecification;
import chessdiagram.Square;
import java.util.Arrays;
import java.util.List;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;

/**
 * Pattern-specific match representation of the chess.queries.pieceOnSquaree pattern,
 * to be used in conjunction with {@link PieceOnSquareeMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see PieceOnSquareeMatcher
 * @see PieceOnSquareeProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class PieceOnSquareeMatch extends BasePatternMatch {
  private Square fSquare;
  
  private static List<String> parameterNames = makeImmutableList("square");
  
  private PieceOnSquareeMatch(final Square pSquare) {
    this.fSquare = pSquare;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("square".equals(parameterName)) return this.fSquare;
    return null;
  }
  
  public Square getSquare() {
    return this.fSquare;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("square".equals(parameterName) ) {
    	this.fSquare = (Square) newValue;
    	return true;
    }
    return false;
  }
  
  public void setSquare(final Square pSquare) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fSquare = pSquare;
  }
  
  @Override
  public String patternName() {
    return "chess.queries.pieceOnSquaree";
  }
  
  @Override
  public List<String> parameterNames() {
    return PieceOnSquareeMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fSquare};
  }
  
  @Override
  public PieceOnSquareeMatch toImmutable() {
    return isMutable() ? newMatch(fSquare) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"square\"=" + prettyPrintValue(fSquare)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fSquare == null) ? 0 : fSquare.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof PieceOnSquareeMatch)) { // this should be infrequent
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
    PieceOnSquareeMatch other = (PieceOnSquareeMatch) obj;
    if (fSquare == null) {if (other.fSquare != null) return false;}
    else if (!fSquare.equals(other.fSquare)) return false;
    return true;
  }
  
  @Override
  public PieceOnSquareeQuerySpecification specification() {
    try {
    	return PieceOnSquareeQuerySpecification.instance();
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
  public static PieceOnSquareeMatch newEmptyMatch() {
    return new Mutable(null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pSquare the fixed value of pattern parameter square, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static PieceOnSquareeMatch newMutableMatch(final Square pSquare) {
    return new Mutable(pSquare);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pSquare the fixed value of pattern parameter square, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static PieceOnSquareeMatch newMatch(final Square pSquare) {
    return new Immutable(pSquare);
  }
  
  private static final class Mutable extends PieceOnSquareeMatch {
    Mutable(final Square pSquare) {
      super(pSquare);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends PieceOnSquareeMatch {
    Immutable(final Square pSquare) {
      super(pSquare);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
