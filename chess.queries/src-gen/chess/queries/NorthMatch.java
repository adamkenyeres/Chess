package chess.queries;

import chess.queries.util.NorthQuerySpecification;
import chessdiagram.Square;
import java.util.Arrays;
import java.util.List;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;

/**
 * Pattern-specific match representation of the chess.queries.north pattern,
 * to be used in conjunction with {@link NorthMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see NorthMatcher
 * @see NorthProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class NorthMatch extends BasePatternMatch {
  private Square fSquareS;
  
  private Square fSquareN;
  
  private static List<String> parameterNames = makeImmutableList("squareS", "squareN");
  
  private NorthMatch(final Square pSquareS, final Square pSquareN) {
    this.fSquareS = pSquareS;
    this.fSquareN = pSquareN;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("squareS".equals(parameterName)) return this.fSquareS;
    if ("squareN".equals(parameterName)) return this.fSquareN;
    return null;
  }
  
  public Square getSquareS() {
    return this.fSquareS;
  }
  
  public Square getSquareN() {
    return this.fSquareN;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("squareS".equals(parameterName) ) {
    	this.fSquareS = (Square) newValue;
    	return true;
    }
    if ("squareN".equals(parameterName) ) {
    	this.fSquareN = (Square) newValue;
    	return true;
    }
    return false;
  }
  
  public void setSquareS(final Square pSquareS) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fSquareS = pSquareS;
  }
  
  public void setSquareN(final Square pSquareN) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fSquareN = pSquareN;
  }
  
  @Override
  public String patternName() {
    return "chess.queries.north";
  }
  
  @Override
  public List<String> parameterNames() {
    return NorthMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fSquareS, fSquareN};
  }
  
  @Override
  public NorthMatch toImmutable() {
    return isMutable() ? newMatch(fSquareS, fSquareN) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"squareS\"=" + prettyPrintValue(fSquareS) + ", ");
    
    result.append("\"squareN\"=" + prettyPrintValue(fSquareN)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fSquareS == null) ? 0 : fSquareS.hashCode());
    result = prime * result + ((fSquareN == null) ? 0 : fSquareN.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof NorthMatch)) { // this should be infrequent
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
    NorthMatch other = (NorthMatch) obj;
    if (fSquareS == null) {if (other.fSquareS != null) return false;}
    else if (!fSquareS.equals(other.fSquareS)) return false;
    if (fSquareN == null) {if (other.fSquareN != null) return false;}
    else if (!fSquareN.equals(other.fSquareN)) return false;
    return true;
  }
  
  @Override
  public NorthQuerySpecification specification() {
    try {
    	return NorthQuerySpecification.instance();
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
  public static NorthMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pSquareS the fixed value of pattern parameter squareS, or null if not bound.
   * @param pSquareN the fixed value of pattern parameter squareN, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static NorthMatch newMutableMatch(final Square pSquareS, final Square pSquareN) {
    return new Mutable(pSquareS, pSquareN);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pSquareS the fixed value of pattern parameter squareS, or null if not bound.
   * @param pSquareN the fixed value of pattern parameter squareN, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static NorthMatch newMatch(final Square pSquareS, final Square pSquareN) {
    return new Immutable(pSquareS, pSquareN);
  }
  
  private static final class Mutable extends NorthMatch {
    Mutable(final Square pSquareS, final Square pSquareN) {
      super(pSquareS, pSquareN);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends NorthMatch {
    Immutable(final Square pSquareS, final Square pSquareN) {
      super(pSquareS, pSquareN);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
