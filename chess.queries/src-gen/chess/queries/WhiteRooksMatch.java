package chess.queries;

import chess.queries.util.WhiteRooksQuerySpecification;
import chessdiagram.Rook;
import java.util.Arrays;
import java.util.List;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;

/**
 * Pattern-specific match representation of the chess.queries.whiteRooks pattern,
 * to be used in conjunction with {@link WhiteRooksMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see WhiteRooksMatcher
 * @see WhiteRooksProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class WhiteRooksMatch extends BasePatternMatch {
  private Rook fRook;
  
  private static List<String> parameterNames = makeImmutableList("rook");
  
  private WhiteRooksMatch(final Rook pRook) {
    this.fRook = pRook;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("rook".equals(parameterName)) return this.fRook;
    return null;
  }
  
  public Rook getRook() {
    return this.fRook;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("rook".equals(parameterName) ) {
    	this.fRook = (Rook) newValue;
    	return true;
    }
    return false;
  }
  
  public void setRook(final Rook pRook) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fRook = pRook;
  }
  
  @Override
  public String patternName() {
    return "chess.queries.whiteRooks";
  }
  
  @Override
  public List<String> parameterNames() {
    return WhiteRooksMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fRook};
  }
  
  @Override
  public WhiteRooksMatch toImmutable() {
    return isMutable() ? newMatch(fRook) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"rook\"=" + prettyPrintValue(fRook)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fRook == null) ? 0 : fRook.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof WhiteRooksMatch)) { // this should be infrequent
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
    WhiteRooksMatch other = (WhiteRooksMatch) obj;
    if (fRook == null) {if (other.fRook != null) return false;}
    else if (!fRook.equals(other.fRook)) return false;
    return true;
  }
  
  @Override
  public WhiteRooksQuerySpecification specification() {
    try {
    	return WhiteRooksQuerySpecification.instance();
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
  public static WhiteRooksMatch newEmptyMatch() {
    return new Mutable(null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pRook the fixed value of pattern parameter rook, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static WhiteRooksMatch newMutableMatch(final Rook pRook) {
    return new Mutable(pRook);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pRook the fixed value of pattern parameter rook, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static WhiteRooksMatch newMatch(final Rook pRook) {
    return new Immutable(pRook);
  }
  
  private static final class Mutable extends WhiteRooksMatch {
    Mutable(final Rook pRook) {
      super(pRook);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends WhiteRooksMatch {
    Immutable(final Rook pRook) {
      super(pRook);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
