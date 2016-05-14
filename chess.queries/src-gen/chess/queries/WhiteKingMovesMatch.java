package chess.queries;

import chess.queries.util.WhiteKingMovesQuerySpecification;
import chessdiagram.Chess;
import chessdiagram.King;
import chessdiagram.Square;
import java.util.Arrays;
import java.util.List;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;

/**
 * Pattern-specific match representation of the chess.queries.whiteKingMoves pattern,
 * to be used in conjunction with {@link WhiteKingMovesMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see WhiteKingMovesMatcher
 * @see WhiteKingMovesProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class WhiteKingMovesMatch extends BasePatternMatch {
  private King fKing;
  
  private Square fSquare;
  
  private Chess fChess;
  
  private static List<String> parameterNames = makeImmutableList("king", "square", "chess");
  
  private WhiteKingMovesMatch(final King pKing, final Square pSquare, final Chess pChess) {
    this.fKing = pKing;
    this.fSquare = pSquare;
    this.fChess = pChess;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("king".equals(parameterName)) return this.fKing;
    if ("square".equals(parameterName)) return this.fSquare;
    if ("chess".equals(parameterName)) return this.fChess;
    return null;
  }
  
  public King getKing() {
    return this.fKing;
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
    if ("king".equals(parameterName) ) {
    	this.fKing = (King) newValue;
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
  
  public void setKing(final King pKing) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fKing = pKing;
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
    return "chess.queries.whiteKingMoves";
  }
  
  @Override
  public List<String> parameterNames() {
    return WhiteKingMovesMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fKing, fSquare, fChess};
  }
  
  @Override
  public WhiteKingMovesMatch toImmutable() {
    return isMutable() ? newMatch(fKing, fSquare, fChess) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"king\"=" + prettyPrintValue(fKing) + ", ");
    
    result.append("\"square\"=" + prettyPrintValue(fSquare) + ", ");
    
    result.append("\"chess\"=" + prettyPrintValue(fChess)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fKing == null) ? 0 : fKing.hashCode());
    result = prime * result + ((fSquare == null) ? 0 : fSquare.hashCode());
    result = prime * result + ((fChess == null) ? 0 : fChess.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof WhiteKingMovesMatch)) { // this should be infrequent
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
    WhiteKingMovesMatch other = (WhiteKingMovesMatch) obj;
    if (fKing == null) {if (other.fKing != null) return false;}
    else if (!fKing.equals(other.fKing)) return false;
    if (fSquare == null) {if (other.fSquare != null) return false;}
    else if (!fSquare.equals(other.fSquare)) return false;
    if (fChess == null) {if (other.fChess != null) return false;}
    else if (!fChess.equals(other.fChess)) return false;
    return true;
  }
  
  @Override
  public WhiteKingMovesQuerySpecification specification() {
    try {
    	return WhiteKingMovesQuerySpecification.instance();
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
  public static WhiteKingMovesMatch newEmptyMatch() {
    return new Mutable(null, null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pKing the fixed value of pattern parameter king, or null if not bound.
   * @param pSquare the fixed value of pattern parameter square, or null if not bound.
   * @param pChess the fixed value of pattern parameter chess, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static WhiteKingMovesMatch newMutableMatch(final King pKing, final Square pSquare, final Chess pChess) {
    return new Mutable(pKing, pSquare, pChess);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pKing the fixed value of pattern parameter king, or null if not bound.
   * @param pSquare the fixed value of pattern parameter square, or null if not bound.
   * @param pChess the fixed value of pattern parameter chess, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static WhiteKingMovesMatch newMatch(final King pKing, final Square pSquare, final Chess pChess) {
    return new Immutable(pKing, pSquare, pChess);
  }
  
  private static final class Mutable extends WhiteKingMovesMatch {
    Mutable(final King pKing, final Square pSquare, final Chess pChess) {
      super(pKing, pSquare, pChess);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends WhiteKingMovesMatch {
    Immutable(final King pKing, final Square pSquare, final Chess pChess) {
      super(pKing, pSquare, pChess);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
