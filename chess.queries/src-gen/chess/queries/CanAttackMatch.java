package chess.queries;

import chess.queries.util.CanAttackQuerySpecification;
import chessdiagram.Piece;
import java.util.Arrays;
import java.util.List;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;

/**
 * Pattern-specific match representation of the chess.queries.canAttack pattern,
 * to be used in conjunction with {@link CanAttackMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see CanAttackMatcher
 * @see CanAttackProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class CanAttackMatch extends BasePatternMatch {
  private Piece fPiece1;
  
  private Piece fPiece2;
  
  private static List<String> parameterNames = makeImmutableList("piece1", "piece2");
  
  private CanAttackMatch(final Piece pPiece1, final Piece pPiece2) {
    this.fPiece1 = pPiece1;
    this.fPiece2 = pPiece2;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("piece1".equals(parameterName)) return this.fPiece1;
    if ("piece2".equals(parameterName)) return this.fPiece2;
    return null;
  }
  
  public Piece getPiece1() {
    return this.fPiece1;
  }
  
  public Piece getPiece2() {
    return this.fPiece2;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("piece1".equals(parameterName) ) {
    	this.fPiece1 = (Piece) newValue;
    	return true;
    }
    if ("piece2".equals(parameterName) ) {
    	this.fPiece2 = (Piece) newValue;
    	return true;
    }
    return false;
  }
  
  public void setPiece1(final Piece pPiece1) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fPiece1 = pPiece1;
  }
  
  public void setPiece2(final Piece pPiece2) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fPiece2 = pPiece2;
  }
  
  @Override
  public String patternName() {
    return "chess.queries.canAttack";
  }
  
  @Override
  public List<String> parameterNames() {
    return CanAttackMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fPiece1, fPiece2};
  }
  
  @Override
  public CanAttackMatch toImmutable() {
    return isMutable() ? newMatch(fPiece1, fPiece2) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"piece1\"=" + prettyPrintValue(fPiece1) + ", ");
    
    result.append("\"piece2\"=" + prettyPrintValue(fPiece2)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fPiece1 == null) ? 0 : fPiece1.hashCode());
    result = prime * result + ((fPiece2 == null) ? 0 : fPiece2.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof CanAttackMatch)) { // this should be infrequent
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
    CanAttackMatch other = (CanAttackMatch) obj;
    if (fPiece1 == null) {if (other.fPiece1 != null) return false;}
    else if (!fPiece1.equals(other.fPiece1)) return false;
    if (fPiece2 == null) {if (other.fPiece2 != null) return false;}
    else if (!fPiece2.equals(other.fPiece2)) return false;
    return true;
  }
  
  @Override
  public CanAttackQuerySpecification specification() {
    try {
    	return CanAttackQuerySpecification.instance();
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
  public static CanAttackMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pPiece1 the fixed value of pattern parameter piece1, or null if not bound.
   * @param pPiece2 the fixed value of pattern parameter piece2, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static CanAttackMatch newMutableMatch(final Piece pPiece1, final Piece pPiece2) {
    return new Mutable(pPiece1, pPiece2);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pPiece1 the fixed value of pattern parameter piece1, or null if not bound.
   * @param pPiece2 the fixed value of pattern parameter piece2, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static CanAttackMatch newMatch(final Piece pPiece1, final Piece pPiece2) {
    return new Immutable(pPiece1, pPiece2);
  }
  
  private static final class Mutable extends CanAttackMatch {
    Mutable(final Piece pPiece1, final Piece pPiece2) {
      super(pPiece1, pPiece2);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends CanAttackMatch {
    Immutable(final Piece pPiece1, final Piece pPiece2) {
      super(pPiece1, pPiece2);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
