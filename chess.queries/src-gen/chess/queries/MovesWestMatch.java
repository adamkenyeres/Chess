package chess.queries;

import chess.queries.util.MovesWestQuerySpecification;
import chessdiagram.Square;
import java.util.Arrays;
import java.util.List;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;

/**
 * Pattern-specific match representation of the chess.queries.movesWest pattern,
 * to be used in conjunction with {@link MovesWestMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see MovesWestMatcher
 * @see MovesWestProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class MovesWestMatch extends BasePatternMatch {
  private Square fSquareStart;
  
  private Square fSquareEnd;
  
  private Square fSquareMiddle;
  
  private static List<String> parameterNames = makeImmutableList("squareStart", "squareEnd", "squareMiddle");
  
  private MovesWestMatch(final Square pSquareStart, final Square pSquareEnd, final Square pSquareMiddle) {
    this.fSquareStart = pSquareStart;
    this.fSquareEnd = pSquareEnd;
    this.fSquareMiddle = pSquareMiddle;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("squareStart".equals(parameterName)) return this.fSquareStart;
    if ("squareEnd".equals(parameterName)) return this.fSquareEnd;
    if ("squareMiddle".equals(parameterName)) return this.fSquareMiddle;
    return null;
  }
  
  public Square getSquareStart() {
    return this.fSquareStart;
  }
  
  public Square getSquareEnd() {
    return this.fSquareEnd;
  }
  
  public Square getSquareMiddle() {
    return this.fSquareMiddle;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("squareStart".equals(parameterName) ) {
    	this.fSquareStart = (Square) newValue;
    	return true;
    }
    if ("squareEnd".equals(parameterName) ) {
    	this.fSquareEnd = (Square) newValue;
    	return true;
    }
    if ("squareMiddle".equals(parameterName) ) {
    	this.fSquareMiddle = (Square) newValue;
    	return true;
    }
    return false;
  }
  
  public void setSquareStart(final Square pSquareStart) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fSquareStart = pSquareStart;
  }
  
  public void setSquareEnd(final Square pSquareEnd) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fSquareEnd = pSquareEnd;
  }
  
  public void setSquareMiddle(final Square pSquareMiddle) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fSquareMiddle = pSquareMiddle;
  }
  
  @Override
  public String patternName() {
    return "chess.queries.movesWest";
  }
  
  @Override
  public List<String> parameterNames() {
    return MovesWestMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fSquareStart, fSquareEnd, fSquareMiddle};
  }
  
  @Override
  public MovesWestMatch toImmutable() {
    return isMutable() ? newMatch(fSquareStart, fSquareEnd, fSquareMiddle) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"squareStart\"=" + prettyPrintValue(fSquareStart) + ", ");
    
    result.append("\"squareEnd\"=" + prettyPrintValue(fSquareEnd) + ", ");
    
    result.append("\"squareMiddle\"=" + prettyPrintValue(fSquareMiddle)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fSquareStart == null) ? 0 : fSquareStart.hashCode());
    result = prime * result + ((fSquareEnd == null) ? 0 : fSquareEnd.hashCode());
    result = prime * result + ((fSquareMiddle == null) ? 0 : fSquareMiddle.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof MovesWestMatch)) { // this should be infrequent
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
    MovesWestMatch other = (MovesWestMatch) obj;
    if (fSquareStart == null) {if (other.fSquareStart != null) return false;}
    else if (!fSquareStart.equals(other.fSquareStart)) return false;
    if (fSquareEnd == null) {if (other.fSquareEnd != null) return false;}
    else if (!fSquareEnd.equals(other.fSquareEnd)) return false;
    if (fSquareMiddle == null) {if (other.fSquareMiddle != null) return false;}
    else if (!fSquareMiddle.equals(other.fSquareMiddle)) return false;
    return true;
  }
  
  @Override
  public MovesWestQuerySpecification specification() {
    try {
    	return MovesWestQuerySpecification.instance();
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
  public static MovesWestMatch newEmptyMatch() {
    return new Mutable(null, null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pSquareStart the fixed value of pattern parameter squareStart, or null if not bound.
   * @param pSquareEnd the fixed value of pattern parameter squareEnd, or null if not bound.
   * @param pSquareMiddle the fixed value of pattern parameter squareMiddle, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static MovesWestMatch newMutableMatch(final Square pSquareStart, final Square pSquareEnd, final Square pSquareMiddle) {
    return new Mutable(pSquareStart, pSquareEnd, pSquareMiddle);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pSquareStart the fixed value of pattern parameter squareStart, or null if not bound.
   * @param pSquareEnd the fixed value of pattern parameter squareEnd, or null if not bound.
   * @param pSquareMiddle the fixed value of pattern parameter squareMiddle, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static MovesWestMatch newMatch(final Square pSquareStart, final Square pSquareEnd, final Square pSquareMiddle) {
    return new Immutable(pSquareStart, pSquareEnd, pSquareMiddle);
  }
  
  private static final class Mutable extends MovesWestMatch {
    Mutable(final Square pSquareStart, final Square pSquareEnd, final Square pSquareMiddle) {
      super(pSquareStart, pSquareEnd, pSquareMiddle);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends MovesWestMatch {
    Immutable(final Square pSquareStart, final Square pSquareEnd, final Square pSquareMiddle) {
      super(pSquareStart, pSquareEnd, pSquareMiddle);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
