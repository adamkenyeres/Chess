package chess.queries;

import chess.queries.util.WhiteKingsQuerySpecification;
import chessdiagram.King;
import java.util.Arrays;
import java.util.List;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;

/**
 * Pattern-specific match representation of the chess.queries.whiteKings pattern,
 * to be used in conjunction with {@link WhiteKingsMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see WhiteKingsMatcher
 * @see WhiteKingsProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class WhiteKingsMatch extends BasePatternMatch {
  private King fKing;
  
  private static List<String> parameterNames = makeImmutableList("king");
  
  private WhiteKingsMatch(final King pKing) {
    this.fKing = pKing;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("king".equals(parameterName)) return this.fKing;
    return null;
  }
  
  public King getKing() {
    return this.fKing;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("king".equals(parameterName) ) {
    	this.fKing = (King) newValue;
    	return true;
    }
    return false;
  }
  
  public void setKing(final King pKing) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fKing = pKing;
  }
  
  @Override
  public String patternName() {
    return "chess.queries.whiteKings";
  }
  
  @Override
  public List<String> parameterNames() {
    return WhiteKingsMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fKing};
  }
  
  @Override
  public WhiteKingsMatch toImmutable() {
    return isMutable() ? newMatch(fKing) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"king\"=" + prettyPrintValue(fKing)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fKing == null) ? 0 : fKing.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof WhiteKingsMatch)) { // this should be infrequent
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
    WhiteKingsMatch other = (WhiteKingsMatch) obj;
    if (fKing == null) {if (other.fKing != null) return false;}
    else if (!fKing.equals(other.fKing)) return false;
    return true;
  }
  
  @Override
  public WhiteKingsQuerySpecification specification() {
    try {
    	return WhiteKingsQuerySpecification.instance();
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
  public static WhiteKingsMatch newEmptyMatch() {
    return new Mutable(null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pKing the fixed value of pattern parameter king, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static WhiteKingsMatch newMutableMatch(final King pKing) {
    return new Mutable(pKing);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pKing the fixed value of pattern parameter king, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static WhiteKingsMatch newMatch(final King pKing) {
    return new Immutable(pKing);
  }
  
  private static final class Mutable extends WhiteKingsMatch {
    Mutable(final King pKing) {
      super(pKing);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends WhiteKingsMatch {
    Immutable(final King pKing) {
      super(pKing);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
