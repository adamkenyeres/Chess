package chess.queries;

import chess.queries.util.AllMovessQuerySpecification;
import chessdiagram.Piece;
import chessdiagram.Square;
import java.util.Arrays;
import java.util.List;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;

/**
 * Pattern-specific match representation of the chess.queries.allMovess pattern,
 * to be used in conjunction with {@link AllMovessMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see AllMovessMatcher
 * @see AllMovessProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class AllMovessMatch extends BasePatternMatch {
  private Piece fPiece;
  
  private Square fSquare;
  
  private static List<String> parameterNames = makeImmutableList("piece", "square");
  
  private AllMovessMatch(final Piece pPiece, final Square pSquare) {
    this.fPiece = pPiece;
    this.fSquare = pSquare;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("piece".equals(parameterName)) return this.fPiece;
    if ("square".equals(parameterName)) return this.fSquare;
    return null;
  }
  
  public Piece getPiece() {
    return this.fPiece;
  }
  
  public Square getSquare() {
    return this.fSquare;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("piece".equals(parameterName) ) {
    	this.fPiece = (Piece) newValue;
    	return true;
    }
    if ("square".equals(parameterName) ) {
    	this.fSquare = (Square) newValue;
    	return true;
    }
    return false;
  }
  
  public void setPiece(final Piece pPiece) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fPiece = pPiece;
  }
  
  public void setSquare(final Square pSquare) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fSquare = pSquare;
  }
  
  @Override
  public String patternName() {
    return "chess.queries.allMovess";
  }
  
  @Override
  public List<String> parameterNames() {
    return AllMovessMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fPiece, fSquare};
  }
  
  @Override
  public AllMovessMatch toImmutable() {
    return isMutable() ? newMatch(fPiece, fSquare) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"piece\"=" + prettyPrintValue(fPiece) + ", ");
    
    result.append("\"square\"=" + prettyPrintValue(fSquare)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fPiece == null) ? 0 : fPiece.hashCode());
    result = prime * result + ((fSquare == null) ? 0 : fSquare.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof AllMovessMatch)) { // this should be infrequent
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
    AllMovessMatch other = (AllMovessMatch) obj;
    if (fPiece == null) {if (other.fPiece != null) return false;}
    else if (!fPiece.equals(other.fPiece)) return false;
    if (fSquare == null) {if (other.fSquare != null) return false;}
    else if (!fSquare.equals(other.fSquare)) return false;
    return true;
  }
  
  @Override
  public AllMovessQuerySpecification specification() {
    try {
    	return AllMovessQuerySpecification.instance();
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
  public static AllMovessMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pPiece the fixed value of pattern parameter piece, or null if not bound.
   * @param pSquare the fixed value of pattern parameter square, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static AllMovessMatch newMutableMatch(final Piece pPiece, final Square pSquare) {
    return new Mutable(pPiece, pSquare);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pPiece the fixed value of pattern parameter piece, or null if not bound.
   * @param pSquare the fixed value of pattern parameter square, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static AllMovessMatch newMatch(final Piece pPiece, final Square pSquare) {
    return new Immutable(pPiece, pSquare);
  }
  
  private static final class Mutable extends AllMovessMatch {
    Mutable(final Piece pPiece, final Square pSquare) {
      super(pPiece, pSquare);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends AllMovessMatch {
    Immutable(final Piece pPiece, final Square pSquare) {
      super(pPiece, pSquare);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
