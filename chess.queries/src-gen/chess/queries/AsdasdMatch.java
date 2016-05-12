package chess.queries;

import chess.queries.util.AsdasdQuerySpecification;
import chessdiagram.Square;
import java.util.Arrays;
import java.util.List;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;

/**
 * Pattern-specific match representation of the chess.queries.asdasd pattern,
 * to be used in conjunction with {@link AsdasdMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see AsdasdMatcher
 * @see AsdasdProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class AsdasdMatch extends BasePatternMatch {
  private Square fSquareE;
  
  private Square fSquareW;
  
  private static List<String> parameterNames = makeImmutableList("squareE", "squareW");
  
  private AsdasdMatch(final Square pSquareE, final Square pSquareW) {
    this.fSquareE = pSquareE;
    this.fSquareW = pSquareW;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("squareE".equals(parameterName)) return this.fSquareE;
    if ("squareW".equals(parameterName)) return this.fSquareW;
    return null;
  }
  
  public Square getSquareE() {
    return this.fSquareE;
  }
  
  public Square getSquareW() {
    return this.fSquareW;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("squareE".equals(parameterName) ) {
    	this.fSquareE = (Square) newValue;
    	return true;
    }
    if ("squareW".equals(parameterName) ) {
    	this.fSquareW = (Square) newValue;
    	return true;
    }
    return false;
  }
  
  public void setSquareE(final Square pSquareE) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fSquareE = pSquareE;
  }
  
  public void setSquareW(final Square pSquareW) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fSquareW = pSquareW;
  }
  
  @Override
  public String patternName() {
    return "chess.queries.asdasd";
  }
  
  @Override
  public List<String> parameterNames() {
    return AsdasdMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fSquareE, fSquareW};
  }
  
  @Override
  public AsdasdMatch toImmutable() {
    return isMutable() ? newMatch(fSquareE, fSquareW) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"squareE\"=" + prettyPrintValue(fSquareE) + ", ");
    
    result.append("\"squareW\"=" + prettyPrintValue(fSquareW)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fSquareE == null) ? 0 : fSquareE.hashCode());
    result = prime * result + ((fSquareW == null) ? 0 : fSquareW.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof AsdasdMatch)) { // this should be infrequent
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
    AsdasdMatch other = (AsdasdMatch) obj;
    if (fSquareE == null) {if (other.fSquareE != null) return false;}
    else if (!fSquareE.equals(other.fSquareE)) return false;
    if (fSquareW == null) {if (other.fSquareW != null) return false;}
    else if (!fSquareW.equals(other.fSquareW)) return false;
    return true;
  }
  
  @Override
  public AsdasdQuerySpecification specification() {
    try {
    	return AsdasdQuerySpecification.instance();
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
  public static AsdasdMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pSquareE the fixed value of pattern parameter squareE, or null if not bound.
   * @param pSquareW the fixed value of pattern parameter squareW, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static AsdasdMatch newMutableMatch(final Square pSquareE, final Square pSquareW) {
    return new Mutable(pSquareE, pSquareW);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pSquareE the fixed value of pattern parameter squareE, or null if not bound.
   * @param pSquareW the fixed value of pattern parameter squareW, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static AsdasdMatch newMatch(final Square pSquareE, final Square pSquareW) {
    return new Immutable(pSquareE, pSquareW);
  }
  
  private static final class Mutable extends AsdasdMatch {
    Mutable(final Square pSquareE, final Square pSquareW) {
      super(pSquareE, pSquareW);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends AsdasdMatch {
    Immutable(final Square pSquareE, final Square pSquareW) {
      super(pSquareE, pSquareW);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
