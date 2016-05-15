package chess.queries;

import chess.queries.util.WhiteBishopsQuerySpecification;
import chessdiagram.Bishop;
import java.util.Arrays;
import java.util.List;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;

/**
 * Pattern-specific match representation of the chess.queries.whiteBishops pattern,
 * to be used in conjunction with {@link WhiteBishopsMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see WhiteBishopsMatcher
 * @see WhiteBishopsProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class WhiteBishopsMatch extends BasePatternMatch {
  private Bishop fBishop;
  
  private static List<String> parameterNames = makeImmutableList("bishop");
  
  private WhiteBishopsMatch(final Bishop pBishop) {
    this.fBishop = pBishop;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("bishop".equals(parameterName)) return this.fBishop;
    return null;
  }
  
  public Bishop getBishop() {
    return this.fBishop;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("bishop".equals(parameterName) ) {
    	this.fBishop = (Bishop) newValue;
    	return true;
    }
    return false;
  }
  
  public void setBishop(final Bishop pBishop) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fBishop = pBishop;
  }
  
  @Override
  public String patternName() {
    return "chess.queries.whiteBishops";
  }
  
  @Override
  public List<String> parameterNames() {
    return WhiteBishopsMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fBishop};
  }
  
  @Override
  public WhiteBishopsMatch toImmutable() {
    return isMutable() ? newMatch(fBishop) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"bishop\"=" + prettyPrintValue(fBishop)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fBishop == null) ? 0 : fBishop.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof WhiteBishopsMatch)) { // this should be infrequent
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
    WhiteBishopsMatch other = (WhiteBishopsMatch) obj;
    if (fBishop == null) {if (other.fBishop != null) return false;}
    else if (!fBishop.equals(other.fBishop)) return false;
    return true;
  }
  
  @Override
  public WhiteBishopsQuerySpecification specification() {
    try {
    	return WhiteBishopsQuerySpecification.instance();
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
  public static WhiteBishopsMatch newEmptyMatch() {
    return new Mutable(null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pBishop the fixed value of pattern parameter bishop, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static WhiteBishopsMatch newMutableMatch(final Bishop pBishop) {
    return new Mutable(pBishop);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pBishop the fixed value of pattern parameter bishop, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static WhiteBishopsMatch newMatch(final Bishop pBishop) {
    return new Immutable(pBishop);
  }
  
  private static final class Mutable extends WhiteBishopsMatch {
    Mutable(final Bishop pBishop) {
      super(pBishop);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends WhiteBishopsMatch {
    Immutable(final Bishop pBishop) {
      super(pBishop);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
