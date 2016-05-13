package chess.queries;

import chess.queries.util.InChessWhiteQuerySpecification;
import chessdiagram.Chess;
import chessdiagram.King;
import chessdiagram.Piece;
import java.util.Arrays;
import java.util.List;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;

/**
 * Pattern-specific match representation of the chess.queries.inChessWhite pattern,
 * to be used in conjunction with {@link InChessWhiteMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see InChessWhiteMatcher
 * @see InChessWhiteProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class InChessWhiteMatch extends BasePatternMatch {
  private King fKing;
  
  private Piece fPiece;
  
  private Chess fChess;
  
  private static List<String> parameterNames = makeImmutableList("king", "piece", "chess");
  
  private InChessWhiteMatch(final King pKing, final Piece pPiece, final Chess pChess) {
    this.fKing = pKing;
    this.fPiece = pPiece;
    this.fChess = pChess;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("king".equals(parameterName)) return this.fKing;
    if ("piece".equals(parameterName)) return this.fPiece;
    if ("chess".equals(parameterName)) return this.fChess;
    return null;
  }
  
  public King getKing() {
    return this.fKing;
  }
  
  public Piece getPiece() {
    return this.fPiece;
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
    if ("piece".equals(parameterName) ) {
    	this.fPiece = (Piece) newValue;
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
  
  public void setPiece(final Piece pPiece) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fPiece = pPiece;
  }
  
  public void setChess(final Chess pChess) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fChess = pChess;
  }
  
  @Override
  public String patternName() {
    return "chess.queries.inChessWhite";
  }
  
  @Override
  public List<String> parameterNames() {
    return InChessWhiteMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fKing, fPiece, fChess};
  }
  
  @Override
  public InChessWhiteMatch toImmutable() {
    return isMutable() ? newMatch(fKing, fPiece, fChess) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"king\"=" + prettyPrintValue(fKing) + ", ");
    
    result.append("\"piece\"=" + prettyPrintValue(fPiece) + ", ");
    
    result.append("\"chess\"=" + prettyPrintValue(fChess)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fKing == null) ? 0 : fKing.hashCode());
    result = prime * result + ((fPiece == null) ? 0 : fPiece.hashCode());
    result = prime * result + ((fChess == null) ? 0 : fChess.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof InChessWhiteMatch)) { // this should be infrequent
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
    InChessWhiteMatch other = (InChessWhiteMatch) obj;
    if (fKing == null) {if (other.fKing != null) return false;}
    else if (!fKing.equals(other.fKing)) return false;
    if (fPiece == null) {if (other.fPiece != null) return false;}
    else if (!fPiece.equals(other.fPiece)) return false;
    if (fChess == null) {if (other.fChess != null) return false;}
    else if (!fChess.equals(other.fChess)) return false;
    return true;
  }
  
  @Override
  public InChessWhiteQuerySpecification specification() {
    try {
    	return InChessWhiteQuerySpecification.instance();
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
  public static InChessWhiteMatch newEmptyMatch() {
    return new Mutable(null, null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pKing the fixed value of pattern parameter king, or null if not bound.
   * @param pPiece the fixed value of pattern parameter piece, or null if not bound.
   * @param pChess the fixed value of pattern parameter chess, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static InChessWhiteMatch newMutableMatch(final King pKing, final Piece pPiece, final Chess pChess) {
    return new Mutable(pKing, pPiece, pChess);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pKing the fixed value of pattern parameter king, or null if not bound.
   * @param pPiece the fixed value of pattern parameter piece, or null if not bound.
   * @param pChess the fixed value of pattern parameter chess, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static InChessWhiteMatch newMatch(final King pKing, final Piece pPiece, final Chess pChess) {
    return new Immutable(pKing, pPiece, pChess);
  }
  
  private static final class Mutable extends InChessWhiteMatch {
    Mutable(final King pKing, final Piece pPiece, final Chess pChess) {
      super(pKing, pPiece, pChess);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends InChessWhiteMatch {
    Immutable(final King pKing, final Piece pPiece, final Chess pChess) {
      super(pKing, pPiece, pChess);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
