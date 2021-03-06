package chess.queries.util;

import chess.queries.InChessBlackMatch;
import chess.queries.InChessBlackMatcher;
import chess.queries.util.SquareQuerySpecification;
import chess.queries.util.WhiteMovesQuerySpecification;
import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.viatra.query.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.emf.types.EStructuralFeatureInstancesKey;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.ConstantValue;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.viatra.query.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate InChessBlackMatcher in a type-safe way.
 * 
 * @see InChessBlackMatcher
 * @see InChessBlackMatch
 * 
 */
@SuppressWarnings("all")
public final class InChessBlackQuerySpecification extends BaseGeneratedEMFQuerySpecification<InChessBlackMatcher> {
  private InChessBlackQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryException if the pattern definition could not be loaded
   * 
   */
  public static InChessBlackQuerySpecification instance() throws ViatraQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected InChessBlackMatcher instantiate(final ViatraQueryEngine engine) throws ViatraQueryException {
    return InChessBlackMatcher.on(engine);
  }
  
  @Override
  public InChessBlackMatch newEmptyMatch() {
    return InChessBlackMatch.newEmptyMatch();
  }
  
  @Override
  public InChessBlackMatch newMatch(final Object... parameters) {
    return InChessBlackMatch.newMatch((chessdiagram.King) parameters[0], (chessdiagram.Piece) parameters[1], (chessdiagram.Chess) parameters[2]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link InChessBlackQuerySpecification} to be created 
   * 	<b>not</b> at the class load time of the outer class, 
   * 	but rather at the first call to {@link InChessBlackQuerySpecification#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static InChessBlackQuerySpecification INSTANCE = new InChessBlackQuerySpecification();
    
    /**
     * Statically initializes the query specification <b>after</b> the field {@link #INSTANCE} is assigned.
     * This initialization order is required to support indirect recursion.
     * 
     * <p> The static initializer is defined using a helper field to work around limitations of the code generator.
     * 
     */
    private final static Object STATIC_INITIALIZER = ensureInitialized();
    
    public static Object ensureInitialized() {
      INSTANCE.ensureInitializedInternalSneaky();
      return null;					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static InChessBlackQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "chess.queries.inChessBlack";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("king","piece","chess");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(
      			 new PParameter("king", "chessdiagram.King", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://example.com/chessdiagram", "King"))),
      			 new PParameter("piece", "chessdiagram.Piece", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://example.com/chessdiagram", "Piece"))),
      			 new PParameter("chess", "chessdiagram.Chess", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://example.com/chessdiagram", "Chess")))
      			);
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_king = body.getOrCreateVariableByName("king");
      		PVariable var_piece = body.getOrCreateVariableByName("piece");
      		PVariable var_chess = body.getOrCreateVariableByName("chess");
      		PVariable var_kingSquare = body.getOrCreateVariableByName("kingSquare");
      		new TypeConstraint(body, new FlatTuple(var_king), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "King")));
      		new TypeConstraint(body, new FlatTuple(var_piece), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Piece")));
      		new TypeConstraint(body, new FlatTuple(var_chess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Chess")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_king, "king"),
      		   new ExportedParameter(body, var_piece, "piece"),
      		   new ExportedParameter(body, var_chess, "chess")
      		));
      		// 	King.colour(king, ::Black)
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new ConstantValue(body, var__virtual_0_, getEnumLiteral("http://example.com/chessdiagram", "Colour", "Black").getInstance());
      		new TypeConstraint(body, new FlatTuple(var_king), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "King")));
      		PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      		new TypeConstraint(body, new FlatTuple(var_king, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/chessdiagram", "Piece", "colour")));
      		new Equality(body, var__virtual_1_, var__virtual_0_);
      		// 	find square(king, kingSquare)
      		new PositivePatternCall(body, new FlatTuple(var_king, var_kingSquare), SquareQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	find whiteMoves(piece, kingSquare, chess)
      		new PositivePatternCall(body, new FlatTuple(var_piece, var_kingSquare, var_chess), WhiteMovesQuerySpecification.instance().getInternalQueryRepresentation());
      		bodies.add(body);
      	}
      	// to silence compiler error
      	if (false) throw new ViatraQueryException("Never", "happens");
      } catch (ViatraQueryException ex) {
      	throw processDependencyException(ex);
      }
      return bodies;
    }
  }
}
