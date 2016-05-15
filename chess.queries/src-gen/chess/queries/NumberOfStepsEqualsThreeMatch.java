package chess.queries;

import chess.queries.util.NumberOfStepsEqualsThreeQuerySpecification;
import chessdiagram.Chess;
import java.util.Arrays;
import java.util.List;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;

/**
 * Pattern-specific match representation of the chess.queries.numberOfStepsEqualsThree pattern,
 * to be used in conjunction with {@link NumberOfStepsEqualsThreeMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see NumberOfStepsEqualsThreeMatcher
 * @see NumberOfStepsEqualsThreeProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class NumberOfStepsEqualsThreeMatch extends BasePatternMatch {
  private Chess fChess;
  
  private static List<String> parameterNames = makeImmutableList("chess");
  
  private NumberOfStepsEqualsThreeMatch(final Chess pChess) {
    this.fChess = pChess;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("chess".equals(parameterName)) return this.fChess;
    return null;
  }
  
  public Chess getChess() {
    return this.fChess;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("chess".equals(parameterName) ) {
    	this.fChess = (Chess) newValue;
    	return true;
    }
    return false;
  }
  
  public void setChess(final Chess pChess) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fChess = pChess;
  }
  
  @Override
  public String patternName() {
    return "chess.queries.numberOfStepsEqualsThree";
  }
  
  @Override
  public List<String> parameterNames() {
    return NumberOfStepsEqualsThreeMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fChess};
  }
  
  @Override
  public NumberOfStepsEqualsThreeMatch toImmutable() {
    return isMutable() ? newMatch(fChess) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"chess\"=" + prettyPrintValue(fChess)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fChess == null) ? 0 : fChess.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof NumberOfStepsEqualsThreeMatch)) { // this should be infrequent
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
    NumberOfStepsEqualsThreeMatch other = (NumberOfStepsEqualsThreeMatch) obj;
    if (fChess == null) {if (other.fChess != null) return false;}
    else if (!fChess.equals(other.fChess)) return false;
    return true;
  }
  
  @Override
  public NumberOfStepsEqualsThreeQuerySpecification specification() {
    try {
    	return NumberOfStepsEqualsThreeQuerySpecification.instance();
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
  public static NumberOfStepsEqualsThreeMatch newEmptyMatch() {
    return new Mutable(null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pChess the fixed value of pattern parameter chess, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static NumberOfStepsEqualsThreeMatch newMutableMatch(final Chess pChess) {
    return new Mutable(pChess);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pChess the fixed value of pattern parameter chess, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static NumberOfStepsEqualsThreeMatch newMatch(final Chess pChess) {
    return new Immutable(pChess);
  }
  
  private static final class Mutable extends NumberOfStepsEqualsThreeMatch {
    Mutable(final Chess pChess) {
      super(pChess);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends NumberOfStepsEqualsThreeMatch {
    Immutable(final Chess pChess) {
      super(pChess);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
