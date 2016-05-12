package chess.queries;

import chess.queries.util.PieceOnSquareQuerySpecification;
import chessdiagram.Piece;
import chessdiagram.Square;
import java.util.Arrays;
import java.util.List;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;

/**
 * Pattern-specific match representation of the chess.queries.pieceOnSquare pattern,
 * to be used in conjunction with {@link PieceOnSquareMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see PieceOnSquareMatcher
 * @see PieceOnSquareProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class PieceOnSquareMatch extends BasePatternMatch {
  private Square fSquare;
  
  private Piece fPiece;
  
  private static List<String> parameterNames = makeImmutableList("square", "piece");
  
  private PieceOnSquareMatch(final Square pSquare, final Piece pPiece) {
    this.fSquare = pSquare;
    this.fPiece = pPiece;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("square".equals(parameterName)) return this.fSquare;
    if ("piece".equals(parameterName)) return this.fPiece;
    return null;
  }
  
  public Square getSquare() {
    return this.fSquare;
  }
  
  public Piece getPiece() {
    return this.fPiece;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("square".equals(parameterName) ) {
    	this.fSquare = (Square) newValue;
    	return true;
    }
    if ("piece".equals(parameterName) ) {
    	this.fPiece = (Piece) newValue;
    	return true;
    }
    return false;
  }
  
  public void setSquare(final Square pSquare) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fSquare = pSquare;
  }
  
  public void setPiece(final Piece pPiece) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fPiece = pPiece;
  }
  
  @Override
  public String patternName() {
    return "chess.queries.pieceOnSquare";
  }
  
  @Override
  public List<String> parameterNames() {
    return PieceOnSquareMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fSquare, fPiece};
  }
  
  @Override
  public PieceOnSquareMatch toImmutable() {
    return isMutable() ? newMatch(fSquare, fPiece) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"square\"=" + prettyPrintValue(fSquare) + ", ");
    
    result.append("\"piece\"=" + prettyPrintValue(fPiece)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fSquare == null) ? 0 : fSquare.hashCode());
    result = prime * result + ((fPiece == null) ? 0 : fPiece.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof PieceOnSquareMatch)) { // this should be infrequent
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
    PieceOnSquareMatch other = (PieceOnSquareMatch) obj;
    if (fSquare == null) {if (other.fSquare != null) return false;}
    else if (!fSquare.equals(other.fSquare)) return false;
    if (fPiece == null) {if (other.fPiece != null) return false;}
    else if (!fPiece.equals(other.fPiece)) return false;
    return true;
  }
  
  @Override
  public PieceOnSquareQuerySpecification specification() {
    try {
    	return PieceOnSquareQuerySpecification.instance();
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
  public static PieceOnSquareMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pSquare the fixed value of pattern parameter square, or null if not bound.
   * @param pPiece the fixed value of pattern parameter piece, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static PieceOnSquareMatch newMutableMatch(final Square pSquare, final Piece pPiece) {
    return new Mutable(pSquare, pPiece);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pSquare the fixed value of pattern parameter square, or null if not bound.
   * @param pPiece the fixed value of pattern parameter piece, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static PieceOnSquareMatch newMatch(final Square pSquare, final Piece pPiece) {
    return new Immutable(pSquare, pPiece);
  }
  
  private static final class Mutable extends PieceOnSquareMatch {
    Mutable(final Square pSquare, final Piece pPiece) {
      super(pSquare, pPiece);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends PieceOnSquareMatch {
    Immutable(final Square pSquare, final Piece pPiece) {
      super(pSquare, pPiece);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
