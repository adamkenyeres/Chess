package chess.queries;

import chess.queries.util.WhiteQueensQuerySpecification;
import chessdiagram.Queen;
import java.util.Arrays;
import java.util.List;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;

/**
 * Pattern-specific match representation of the chess.queries.whiteQueens pattern,
 * to be used in conjunction with {@link WhiteQueensMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see WhiteQueensMatcher
 * @see WhiteQueensProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class WhiteQueensMatch extends BasePatternMatch {
  private Queen fQueen;
  
  private static List<String> parameterNames = makeImmutableList("queen");
  
  private WhiteQueensMatch(final Queen pQueen) {
    this.fQueen = pQueen;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("queen".equals(parameterName)) return this.fQueen;
    return null;
  }
  
  public Queen getQueen() {
    return this.fQueen;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("queen".equals(parameterName) ) {
    	this.fQueen = (Queen) newValue;
    	return true;
    }
    return false;
  }
  
  public void setQueen(final Queen pQueen) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fQueen = pQueen;
  }
  
  @Override
  public String patternName() {
    return "chess.queries.whiteQueens";
  }
  
  @Override
  public List<String> parameterNames() {
    return WhiteQueensMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fQueen};
  }
  
  @Override
  public WhiteQueensMatch toImmutable() {
    return isMutable() ? newMatch(fQueen) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"queen\"=" + prettyPrintValue(fQueen)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fQueen == null) ? 0 : fQueen.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof WhiteQueensMatch)) { // this should be infrequent
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
    WhiteQueensMatch other = (WhiteQueensMatch) obj;
    if (fQueen == null) {if (other.fQueen != null) return false;}
    else if (!fQueen.equals(other.fQueen)) return false;
    return true;
  }
  
  @Override
  public WhiteQueensQuerySpecification specification() {
    try {
    	return WhiteQueensQuerySpecification.instance();
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
  public static WhiteQueensMatch newEmptyMatch() {
    return new Mutable(null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pQueen the fixed value of pattern parameter queen, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static WhiteQueensMatch newMutableMatch(final Queen pQueen) {
    return new Mutable(pQueen);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pQueen the fixed value of pattern parameter queen, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static WhiteQueensMatch newMatch(final Queen pQueen) {
    return new Immutable(pQueen);
  }
  
  private static final class Mutable extends WhiteQueensMatch {
    Mutable(final Queen pQueen) {
      super(pQueen);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends WhiteQueensMatch {
    Immutable(final Queen pQueen) {
      super(pQueen);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
