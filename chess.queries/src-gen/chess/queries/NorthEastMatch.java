package chess.queries;

import chess.queries.util.NorthEastQuerySpecification;
import chessdiagram.Square;
import java.util.Arrays;
import java.util.List;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;

/**
 * Pattern-specific match representation of the chess.queries.northEast pattern,
 * to be used in conjunction with {@link NorthEastMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see NorthEastMatcher
 * @see NorthEastProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class NorthEastMatch extends BasePatternMatch {
  private Square fSquareSW;
  
  private Square fSquareNE;
  
  private static List<String> parameterNames = makeImmutableList("squareSW", "squareNE");
  
  private NorthEastMatch(final Square pSquareSW, final Square pSquareNE) {
    this.fSquareSW = pSquareSW;
    this.fSquareNE = pSquareNE;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("squareSW".equals(parameterName)) return this.fSquareSW;
    if ("squareNE".equals(parameterName)) return this.fSquareNE;
    return null;
  }
  
  public Square getSquareSW() {
    return this.fSquareSW;
  }
  
  public Square getSquareNE() {
    return this.fSquareNE;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("squareSW".equals(parameterName) ) {
    	this.fSquareSW = (Square) newValue;
    	return true;
    }
    if ("squareNE".equals(parameterName) ) {
    	this.fSquareNE = (Square) newValue;
    	return true;
    }
    return false;
  }
  
  public void setSquareSW(final Square pSquareSW) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fSquareSW = pSquareSW;
  }
  
  public void setSquareNE(final Square pSquareNE) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fSquareNE = pSquareNE;
  }
  
  @Override
  public String patternName() {
    return "chess.queries.northEast";
  }
  
  @Override
  public List<String> parameterNames() {
    return NorthEastMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fSquareSW, fSquareNE};
  }
  
  @Override
  public NorthEastMatch toImmutable() {
    return isMutable() ? newMatch(fSquareSW, fSquareNE) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"squareSW\"=" + prettyPrintValue(fSquareSW) + ", ");
    
    result.append("\"squareNE\"=" + prettyPrintValue(fSquareNE)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fSquareSW == null) ? 0 : fSquareSW.hashCode());
    result = prime * result + ((fSquareNE == null) ? 0 : fSquareNE.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof NorthEastMatch)) { // this should be infrequent
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
    NorthEastMatch other = (NorthEastMatch) obj;
    if (fSquareSW == null) {if (other.fSquareSW != null) return false;}
    else if (!fSquareSW.equals(other.fSquareSW)) return false;
    if (fSquareNE == null) {if (other.fSquareNE != null) return false;}
    else if (!fSquareNE.equals(other.fSquareNE)) return false;
    return true;
  }
  
  @Override
  public NorthEastQuerySpecification specification() {
    try {
    	return NorthEastQuerySpecification.instance();
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
  public static NorthEastMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pSquareSW the fixed value of pattern parameter squareSW, or null if not bound.
   * @param pSquareNE the fixed value of pattern parameter squareNE, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static NorthEastMatch newMutableMatch(final Square pSquareSW, final Square pSquareNE) {
    return new Mutable(pSquareSW, pSquareNE);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pSquareSW the fixed value of pattern parameter squareSW, or null if not bound.
   * @param pSquareNE the fixed value of pattern parameter squareNE, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static NorthEastMatch newMatch(final Square pSquareSW, final Square pSquareNE) {
    return new Immutable(pSquareSW, pSquareNE);
  }
  
  private static final class Mutable extends NorthEastMatch {
    Mutable(final Square pSquareSW, final Square pSquareNE) {
      super(pSquareSW, pSquareNE);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends NorthEastMatch {
    Immutable(final Square pSquareSW, final Square pSquareNE) {
      super(pSquareSW, pSquareNE);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
