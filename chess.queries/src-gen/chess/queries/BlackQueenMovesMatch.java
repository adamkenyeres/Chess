package chess.queries;

import chess.queries.util.BlackQueenMovesQuerySpecification;
import chessdiagram.Chess;
import chessdiagram.Queen;
import chessdiagram.Square;
import java.util.Arrays;
import java.util.List;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;

/**
 * Pattern-specific match representation of the chess.queries.blackQueenMoves pattern,
 * to be used in conjunction with {@link BlackQueenMovesMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see BlackQueenMovesMatcher
 * @see BlackQueenMovesProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class BlackQueenMovesMatch extends BasePatternMatch {
  private Queen fQueen;
  
  private Square fSquare;
  
  private Chess fChess;
  
  private static List<String> parameterNames = makeImmutableList("queen", "square", "chess");
  
  private BlackQueenMovesMatch(final Queen pQueen, final Square pSquare, final Chess pChess) {
    this.fQueen = pQueen;
    this.fSquare = pSquare;
    this.fChess = pChess;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("queen".equals(parameterName)) return this.fQueen;
    if ("square".equals(parameterName)) return this.fSquare;
    if ("chess".equals(parameterName)) return this.fChess;
    return null;
  }
  
  public Queen getQueen() {
    return this.fQueen;
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
    if ("queen".equals(parameterName) ) {
    	this.fQueen = (Queen) newValue;
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
  
  public void setQueen(final Queen pQueen) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fQueen = pQueen;
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
    return "chess.queries.blackQueenMoves";
  }
  
  @Override
  public List<String> parameterNames() {
    return BlackQueenMovesMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fQueen, fSquare, fChess};
  }
  
  @Override
  public BlackQueenMovesMatch toImmutable() {
    return isMutable() ? newMatch(fQueen, fSquare, fChess) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"queen\"=" + prettyPrintValue(fQueen) + ", ");
    
    result.append("\"square\"=" + prettyPrintValue(fSquare) + ", ");
    
    result.append("\"chess\"=" + prettyPrintValue(fChess)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fQueen == null) ? 0 : fQueen.hashCode());
    result = prime * result + ((fSquare == null) ? 0 : fSquare.hashCode());
    result = prime * result + ((fChess == null) ? 0 : fChess.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof BlackQueenMovesMatch)) { // this should be infrequent
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
    BlackQueenMovesMatch other = (BlackQueenMovesMatch) obj;
    if (fQueen == null) {if (other.fQueen != null) return false;}
    else if (!fQueen.equals(other.fQueen)) return false;
    if (fSquare == null) {if (other.fSquare != null) return false;}
    else if (!fSquare.equals(other.fSquare)) return false;
    if (fChess == null) {if (other.fChess != null) return false;}
    else if (!fChess.equals(other.fChess)) return false;
    return true;
  }
  
  @Override
  public BlackQueenMovesQuerySpecification specification() {
    try {
    	return BlackQueenMovesQuerySpecification.instance();
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
  public static BlackQueenMovesMatch newEmptyMatch() {
    return new Mutable(null, null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pQueen the fixed value of pattern parameter queen, or null if not bound.
   * @param pSquare the fixed value of pattern parameter square, or null if not bound.
   * @param pChess the fixed value of pattern parameter chess, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static BlackQueenMovesMatch newMutableMatch(final Queen pQueen, final Square pSquare, final Chess pChess) {
    return new Mutable(pQueen, pSquare, pChess);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pQueen the fixed value of pattern parameter queen, or null if not bound.
   * @param pSquare the fixed value of pattern parameter square, or null if not bound.
   * @param pChess the fixed value of pattern parameter chess, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static BlackQueenMovesMatch newMatch(final Queen pQueen, final Square pSquare, final Chess pChess) {
    return new Immutable(pQueen, pSquare, pChess);
  }
  
  private static final class Mutable extends BlackQueenMovesMatch {
    Mutable(final Queen pQueen, final Square pSquare, final Chess pChess) {
      super(pQueen, pSquare, pChess);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends BlackQueenMovesMatch {
    Immutable(final Queen pQueen, final Square pSquare, final Chess pChess) {
      super(pQueen, pSquare, pChess);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
