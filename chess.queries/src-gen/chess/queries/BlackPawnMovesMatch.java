package chess.queries;

import chess.queries.util.BlackPawnMovesQuerySpecification;
import chessdiagram.Chess;
import chessdiagram.Pawn;
import chessdiagram.Square;
import java.util.Arrays;
import java.util.List;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;

/**
 * Pattern-specific match representation of the chess.queries.blackPawnMoves pattern,
 * to be used in conjunction with {@link BlackPawnMovesMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see BlackPawnMovesMatcher
 * @see BlackPawnMovesProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class BlackPawnMovesMatch extends BasePatternMatch {
  private Pawn fPiece;
  
  private Square fSquare;
  
  private Chess fChess;
  
  private static List<String> parameterNames = makeImmutableList("piece", "square", "chess");
  
  private BlackPawnMovesMatch(final Pawn pPiece, final Square pSquare, final Chess pChess) {
    this.fPiece = pPiece;
    this.fSquare = pSquare;
    this.fChess = pChess;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("piece".equals(parameterName)) return this.fPiece;
    if ("square".equals(parameterName)) return this.fSquare;
    if ("chess".equals(parameterName)) return this.fChess;
    return null;
  }
  
  public Pawn getPiece() {
    return this.fPiece;
  }
  
  public Square getSquare() {
    return this.fSquare;
  }
  
  public Chess getChess() {
    return this.fChess;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("piece".equals(parameterName) ) {
    	this.fPiece = (Pawn) newValue;
    	return true;
    }
    if ("square".equals(parameterName) ) {
    	this.fSquare = (Square) newValue;
    	return true;
    }
    if ("chess".equals(parameterName) ) {
    	this.fChess = (Chess) newValue;
    	return true;
    }
    return false;
  }
  
  public void setPiece(final Pawn pPiece) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fPiece = pPiece;
  }
  
  public void setSquare(final Square pSquare) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fSquare = pSquare;
  }
  
  public void setChess(final Chess pChess) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fChess = pChess;
  }
  
  @Override
  public String patternName() {
    return "chess.queries.blackPawnMoves";
  }
  
  @Override
  public List<String> parameterNames() {
    return BlackPawnMovesMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fPiece, fSquare, fChess};
  }
  
  @Override
  public BlackPawnMovesMatch toImmutable() {
    return isMutable() ? newMatch(fPiece, fSquare, fChess) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"piece\"=" + prettyPrintValue(fPiece) + ", ");
    
    result.append("\"square\"=" + prettyPrintValue(fSquare) + ", ");
    
    result.append("\"chess\"=" + prettyPrintValue(fChess)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fPiece == null) ? 0 : fPiece.hashCode());
    result = prime * result + ((fSquare == null) ? 0 : fSquare.hashCode());
    result = prime * result + ((fChess == null) ? 0 : fChess.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof BlackPawnMovesMatch)) { // this should be infrequent
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
    BlackPawnMovesMatch other = (BlackPawnMovesMatch) obj;
    if (fPiece == null) {if (other.fPiece != null) return false;}
    else if (!fPiece.equals(other.fPiece)) return false;
    if (fSquare == null) {if (other.fSquare != null) return false;}
    else if (!fSquare.equals(other.fSquare)) return false;
    if (fChess == null) {if (other.fChess != null) return false;}
    else if (!fChess.equals(other.fChess)) return false;
    return true;
  }
  
  @Override
  public BlackPawnMovesQuerySpecification specification() {
    try {
    	return BlackPawnMovesQuerySpecification.instance();
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
  public static BlackPawnMovesMatch newEmptyMatch() {
    return new Mutable(null, null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pPiece the fixed value of pattern parameter piece, or null if not bound.
   * @param pSquare the fixed value of pattern parameter square, or null if not bound.
   * @param pChess the fixed value of pattern parameter chess, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static BlackPawnMovesMatch newMutableMatch(final Pawn pPiece, final Square pSquare, final Chess pChess) {
    return new Mutable(pPiece, pSquare, pChess);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pPiece the fixed value of pattern parameter piece, or null if not bound.
   * @param pSquare the fixed value of pattern parameter square, or null if not bound.
   * @param pChess the fixed value of pattern parameter chess, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static BlackPawnMovesMatch newMatch(final Pawn pPiece, final Square pSquare, final Chess pChess) {
    return new Immutable(pPiece, pSquare, pChess);
  }
  
  private static final class Mutable extends BlackPawnMovesMatch {
    Mutable(final Pawn pPiece, final Square pSquare, final Chess pChess) {
      super(pPiece, pSquare, pChess);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends BlackPawnMovesMatch {
    Immutable(final Pawn pPiece, final Square pSquare, final Chess pChess) {
      super(pPiece, pSquare, pChess);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
