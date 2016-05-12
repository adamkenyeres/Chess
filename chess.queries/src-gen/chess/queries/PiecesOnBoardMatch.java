package chess.queries;

import chess.queries.util.PiecesOnBoardQuerySpecification;
import chessdiagram.Piece;
import java.util.Arrays;
import java.util.List;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;

/**
 * Pattern-specific match representation of the chess.queries.piecesOnBoard pattern,
 * to be used in conjunction with {@link PiecesOnBoardMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see PiecesOnBoardMatcher
 * @see PiecesOnBoardProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class PiecesOnBoardMatch extends BasePatternMatch {
  private Piece fPiece;
  
  private static List<String> parameterNames = makeImmutableList("piece");
  
  private PiecesOnBoardMatch(final Piece pPiece) {
    this.fPiece = pPiece;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("piece".equals(parameterName)) return this.fPiece;
    return null;
  }
  
  public Piece getPiece() {
    return this.fPiece;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("piece".equals(parameterName) ) {
    	this.fPiece = (Piece) newValue;
    	return true;
    }
    return false;
  }
  
  public void setPiece(final Piece pPiece) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fPiece = pPiece;
  }
  
  @Override
  public String patternName() {
    return "chess.queries.piecesOnBoard";
  }
  
  @Override
  public List<String> parameterNames() {
    return PiecesOnBoardMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fPiece};
  }
  
  @Override
  public PiecesOnBoardMatch toImmutable() {
    return isMutable() ? newMatch(fPiece) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"piece\"=" + prettyPrintValue(fPiece)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fPiece == null) ? 0 : fPiece.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof PiecesOnBoardMatch)) { // this should be infrequent
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
    PiecesOnBoardMatch other = (PiecesOnBoardMatch) obj;
    if (fPiece == null) {if (other.fPiece != null) return false;}
    else if (!fPiece.equals(other.fPiece)) return false;
    return true;
  }
  
  @Override
  public PiecesOnBoardQuerySpecification specification() {
    try {
    	return PiecesOnBoardQuerySpecification.instance();
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
  public static PiecesOnBoardMatch newEmptyMatch() {
    return new Mutable(null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pPiece the fixed value of pattern parameter piece, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static PiecesOnBoardMatch newMutableMatch(final Piece pPiece) {
    return new Mutable(pPiece);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pPiece the fixed value of pattern parameter piece, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static PiecesOnBoardMatch newMatch(final Piece pPiece) {
    return new Immutable(pPiece);
  }
  
  private static final class Mutable extends PiecesOnBoardMatch {
    Mutable(final Piece pPiece) {
      super(pPiece);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends PiecesOnBoardMatch {
    Immutable(final Piece pPiece) {
      super(pPiece);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
