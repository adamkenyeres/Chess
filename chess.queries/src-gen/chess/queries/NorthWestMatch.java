package chess.queries;

import chess.queries.util.NorthWestQuerySpecification;
import chessdiagram.Square;
import java.util.Arrays;
import java.util.List;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;

/**
 * Pattern-specific match representation of the chess.queries.northWest pattern,
 * to be used in conjunction with {@link NorthWestMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see NorthWestMatcher
 * @see NorthWestProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class NorthWestMatch extends BasePatternMatch {
  private Square fSquareSE;
  
  private Square fSquareNW;
  
  private static List<String> parameterNames = makeImmutableList("squareSE", "squareNW");
  
  private NorthWestMatch(final Square pSquareSE, final Square pSquareNW) {
    this.fSquareSE = pSquareSE;
    this.fSquareNW = pSquareNW;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("squareSE".equals(parameterName)) return this.fSquareSE;
    if ("squareNW".equals(parameterName)) return this.fSquareNW;
    return null;
  }
  
  public Square getSquareSE() {
    return this.fSquareSE;
  }
  
  public Square getSquareNW() {
    return this.fSquareNW;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("squareSE".equals(parameterName) ) {
    	this.fSquareSE = (Square) newValue;
    	return true;
    }
    if ("squareNW".equals(parameterName) ) {
    	this.fSquareNW = (Square) newValue;
    	return true;
    }
    return false;
  }
  
  public void setSquareSE(final Square pSquareSE) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fSquareSE = pSquareSE;
  }
  
  public void setSquareNW(final Square pSquareNW) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fSquareNW = pSquareNW;
  }
  
  @Override
  public String patternName() {
    return "chess.queries.northWest";
  }
  
  @Override
  public List<String> parameterNames() {
    return NorthWestMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fSquareSE, fSquareNW};
  }
  
  @Override
  public NorthWestMatch toImmutable() {
    return isMutable() ? newMatch(fSquareSE, fSquareNW) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"squareSE\"=" + prettyPrintValue(fSquareSE) + ", ");
    
    result.append("\"squareNW\"=" + prettyPrintValue(fSquareNW)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fSquareSE == null) ? 0 : fSquareSE.hashCode());
    result = prime * result + ((fSquareNW == null) ? 0 : fSquareNW.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof NorthWestMatch)) { // this should be infrequent
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
    NorthWestMatch other = (NorthWestMatch) obj;
    if (fSquareSE == null) {if (other.fSquareSE != null) return false;}
    else if (!fSquareSE.equals(other.fSquareSE)) return false;
    if (fSquareNW == null) {if (other.fSquareNW != null) return false;}
    else if (!fSquareNW.equals(other.fSquareNW)) return false;
    return true;
  }
  
  @Override
  public NorthWestQuerySpecification specification() {
    try {
    	return NorthWestQuerySpecification.instance();
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
  public static NorthWestMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pSquareSE the fixed value of pattern parameter squareSE, or null if not bound.
   * @param pSquareNW the fixed value of pattern parameter squareNW, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static NorthWestMatch newMutableMatch(final Square pSquareSE, final Square pSquareNW) {
    return new Mutable(pSquareSE, pSquareNW);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pSquareSE the fixed value of pattern parameter squareSE, or null if not bound.
   * @param pSquareNW the fixed value of pattern parameter squareNW, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static NorthWestMatch newMatch(final Square pSquareSE, final Square pSquareNW) {
    return new Immutable(pSquareSE, pSquareNW);
  }
  
  private static final class Mutable extends NorthWestMatch {
    Mutable(final Square pSquareSE, final Square pSquareNW) {
      super(pSquareSE, pSquareNW);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends NorthWestMatch {
    Immutable(final Square pSquareSE, final Square pSquareNW) {
      super(pSquareSE, pSquareNW);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
