package chess.queries;

import chess.queries.util.WhiteKnightsQuerySpecification;
import chessdiagram.Knight;
import java.util.Arrays;
import java.util.List;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;

/**
 * Pattern-specific match representation of the chess.queries.whiteKnights pattern,
 * to be used in conjunction with {@link WhiteKnightsMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see WhiteKnightsMatcher
 * @see WhiteKnightsProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class WhiteKnightsMatch extends BasePatternMatch {
  private Knight fKnight;
  
  private static List<String> parameterNames = makeImmutableList("knight");
  
  private WhiteKnightsMatch(final Knight pKnight) {
    this.fKnight = pKnight;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("knight".equals(parameterName)) return this.fKnight;
    return null;
  }
  
  public Knight getKnight() {
    return this.fKnight;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("knight".equals(parameterName) ) {
    	this.fKnight = (Knight) newValue;
    	return true;
    }
    return false;
  }
  
  public void setKnight(final Knight pKnight) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fKnight = pKnight;
  }
  
  @Override
  public String patternName() {
    return "chess.queries.whiteKnights";
  }
  
  @Override
  public List<String> parameterNames() {
    return WhiteKnightsMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fKnight};
  }
  
  @Override
  public WhiteKnightsMatch toImmutable() {
    return isMutable() ? newMatch(fKnight) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"knight\"=" + prettyPrintValue(fKnight)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fKnight == null) ? 0 : fKnight.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof WhiteKnightsMatch)) { // this should be infrequent
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
    WhiteKnightsMatch other = (WhiteKnightsMatch) obj;
    if (fKnight == null) {if (other.fKnight != null) return false;}
    else if (!fKnight.equals(other.fKnight)) return false;
    return true;
  }
  
  @Override
  public WhiteKnightsQuerySpecification specification() {
    try {
    	return WhiteKnightsQuerySpecification.instance();
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
  public static WhiteKnightsMatch newEmptyMatch() {
    return new Mutable(null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pKnight the fixed value of pattern parameter knight, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static WhiteKnightsMatch newMutableMatch(final Knight pKnight) {
    return new Mutable(pKnight);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pKnight the fixed value of pattern parameter knight, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static WhiteKnightsMatch newMatch(final Knight pKnight) {
    return new Immutable(pKnight);
  }
  
  private static final class Mutable extends WhiteKnightsMatch {
    Mutable(final Knight pKnight) {
      super(pKnight);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends WhiteKnightsMatch {
    Immutable(final Knight pKnight) {
      super(pKnight);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
