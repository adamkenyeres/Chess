package chess.queries;

import chess.queries.util.BlackPawnsQuerySpecification;
import chessdiagram.Pawn;
import java.util.Arrays;
import java.util.List;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;

/**
 * Pattern-specific match representation of the chess.queries.blackPawns pattern,
 * to be used in conjunction with {@link BlackPawnsMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see BlackPawnsMatcher
 * @see BlackPawnsProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class BlackPawnsMatch extends BasePatternMatch {
  private Pawn fPawn;
  
  private static List<String> parameterNames = makeImmutableList("pawn");
  
  private BlackPawnsMatch(final Pawn pPawn) {
    this.fPawn = pPawn;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("pawn".equals(parameterName)) return this.fPawn;
    return null;
  }
  
  public Pawn getPawn() {
    return this.fPawn;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("pawn".equals(parameterName) ) {
    	this.fPawn = (Pawn) newValue;
    	return true;
    }
    return false;
  }
  
  public void setPawn(final Pawn pPawn) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fPawn = pPawn;
  }
  
  @Override
  public String patternName() {
    return "chess.queries.blackPawns";
  }
  
  @Override
  public List<String> parameterNames() {
    return BlackPawnsMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fPawn};
  }
  
  @Override
  public BlackPawnsMatch toImmutable() {
    return isMutable() ? newMatch(fPawn) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"pawn\"=" + prettyPrintValue(fPawn)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fPawn == null) ? 0 : fPawn.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof BlackPawnsMatch)) { // this should be infrequent
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
    BlackPawnsMatch other = (BlackPawnsMatch) obj;
    if (fPawn == null) {if (other.fPawn != null) return false;}
    else if (!fPawn.equals(other.fPawn)) return false;
    return true;
  }
  
  @Override
  public BlackPawnsQuerySpecification specification() {
    try {
    	return BlackPawnsQuerySpecification.instance();
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
  public static BlackPawnsMatch newEmptyMatch() {
    return new Mutable(null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pPawn the fixed value of pattern parameter pawn, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static BlackPawnsMatch newMutableMatch(final Pawn pPawn) {
    return new Mutable(pPawn);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pPawn the fixed value of pattern parameter pawn, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static BlackPawnsMatch newMatch(final Pawn pPawn) {
    return new Immutable(pPawn);
  }
  
  private static final class Mutable extends BlackPawnsMatch {
    Mutable(final Pawn pPawn) {
      super(pPawn);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends BlackPawnsMatch {
    Immutable(final Pawn pPawn) {
      super(pPawn);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
