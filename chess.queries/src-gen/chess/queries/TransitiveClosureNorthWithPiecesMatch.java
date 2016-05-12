package chess.queries;

import chess.queries.util.TransitiveClosureNorthWithPiecesQuerySpecification;
import chessdiagram.Square;
import java.util.Arrays;
import java.util.List;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;

/**
 * Pattern-specific match representation of the chess.queries.transitiveClosureNorthWithPieces pattern,
 * to be used in conjunction with {@link TransitiveClosureNorthWithPiecesMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see TransitiveClosureNorthWithPiecesMatcher
 * @see TransitiveClosureNorthWithPiecesProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class TransitiveClosureNorthWithPiecesMatch extends BasePatternMatch {
  private Square fStart;
  
  private Square fEnd;
  
  private Square fSquare;
  
  private static List<String> parameterNames = makeImmutableList("start", "end", "square");
  
  private TransitiveClosureNorthWithPiecesMatch(final Square pStart, final Square pEnd, final Square pSquare) {
    this.fStart = pStart;
    this.fEnd = pEnd;
    this.fSquare = pSquare;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("start".equals(parameterName)) return this.fStart;
    if ("end".equals(parameterName)) return this.fEnd;
    if ("square".equals(parameterName)) return this.fSquare;
    return null;
  }
  
  public Square getStart() {
    return this.fStart;
  }
  
  public Square getEnd() {
    return this.fEnd;
  }
  
  public Square getSquare() {
    return this.fSquare;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("start".equals(parameterName) ) {
    	this.fStart = (Square) newValue;
    	return true;
    }
    if ("end".equals(parameterName) ) {
    	this.fEnd = (Square) newValue;
    	return true;
    }
    if ("square".equals(parameterName) ) {
    	this.fSquare = (Square) newValue;
    	return true;
    }
    return false;
  }
  
  public void setStart(final Square pStart) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fStart = pStart;
  }
  
  public void setEnd(final Square pEnd) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fEnd = pEnd;
  }
  
  public void setSquare(final Square pSquare) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fSquare = pSquare;
  }
  
  @Override
  public String patternName() {
    return "chess.queries.transitiveClosureNorthWithPieces";
  }
  
  @Override
  public List<String> parameterNames() {
    return TransitiveClosureNorthWithPiecesMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fStart, fEnd, fSquare};
  }
  
  @Override
  public TransitiveClosureNorthWithPiecesMatch toImmutable() {
    return isMutable() ? newMatch(fStart, fEnd, fSquare) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"start\"=" + prettyPrintValue(fStart) + ", ");
    
    result.append("\"end\"=" + prettyPrintValue(fEnd) + ", ");
    
    result.append("\"square\"=" + prettyPrintValue(fSquare)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fStart == null) ? 0 : fStart.hashCode());
    result = prime * result + ((fEnd == null) ? 0 : fEnd.hashCode());
    result = prime * result + ((fSquare == null) ? 0 : fSquare.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof TransitiveClosureNorthWithPiecesMatch)) { // this should be infrequent
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
    TransitiveClosureNorthWithPiecesMatch other = (TransitiveClosureNorthWithPiecesMatch) obj;
    if (fStart == null) {if (other.fStart != null) return false;}
    else if (!fStart.equals(other.fStart)) return false;
    if (fEnd == null) {if (other.fEnd != null) return false;}
    else if (!fEnd.equals(other.fEnd)) return false;
    if (fSquare == null) {if (other.fSquare != null) return false;}
    else if (!fSquare.equals(other.fSquare)) return false;
    return true;
  }
  
  @Override
  public TransitiveClosureNorthWithPiecesQuerySpecification specification() {
    try {
    	return TransitiveClosureNorthWithPiecesQuerySpecification.instance();
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
  public static TransitiveClosureNorthWithPiecesMatch newEmptyMatch() {
    return new Mutable(null, null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pStart the fixed value of pattern parameter start, or null if not bound.
   * @param pEnd the fixed value of pattern parameter end, or null if not bound.
   * @param pSquare the fixed value of pattern parameter square, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static TransitiveClosureNorthWithPiecesMatch newMutableMatch(final Square pStart, final Square pEnd, final Square pSquare) {
    return new Mutable(pStart, pEnd, pSquare);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pStart the fixed value of pattern parameter start, or null if not bound.
   * @param pEnd the fixed value of pattern parameter end, or null if not bound.
   * @param pSquare the fixed value of pattern parameter square, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static TransitiveClosureNorthWithPiecesMatch newMatch(final Square pStart, final Square pEnd, final Square pSquare) {
    return new Immutable(pStart, pEnd, pSquare);
  }
  
  private static final class Mutable extends TransitiveClosureNorthWithPiecesMatch {
    Mutable(final Square pStart, final Square pEnd, final Square pSquare) {
      super(pStart, pEnd, pSquare);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends TransitiveClosureNorthWithPiecesMatch {
    Immutable(final Square pStart, final Square pEnd, final Square pSquare) {
      super(pStart, pEnd, pSquare);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
