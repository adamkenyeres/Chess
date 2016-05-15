package chess.queries.util;

import chess.queries.RookMovesMatch;
import chess.queries.RookMovesMatcher;
import chess.queries.util.HorizontalRookMovesQuerySpecification;
import chess.queries.util.VerticalRookMovesQuerySpecification;
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
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.viatra.query.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate RookMovesMatcher in a type-safe way.
 * 
 * @see RookMovesMatcher
 * @see RookMovesMatch
 * 
 */
@SuppressWarnings("all")
public final class RookMovesQuerySpecification extends BaseGeneratedEMFQuerySpecification<RookMovesMatcher> {
  private RookMovesQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryException if the pattern definition could not be loaded
   * 
   */
  public static RookMovesQuerySpecification instance() throws ViatraQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected RookMovesMatcher instantiate(final ViatraQueryEngine engine) throws ViatraQueryException {
    return RookMovesMatcher.on(engine);
  }
  
  @Override
  public RookMovesMatch newEmptyMatch() {
    return RookMovesMatch.newEmptyMatch();
  }
  
  @Override
  public RookMovesMatch newMatch(final Object... parameters) {
    return RookMovesMatch.newMatch((chessdiagram.Rook) parameters[0], (chessdiagram.Square) parameters[1], (chessdiagram.Chess) parameters[2]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link RookMovesQuerySpecification} to be created 
   * 	<b>not</b> at the class load time of the outer class, 
   * 	but rather at the first call to {@link RookMovesQuerySpecification#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static RookMovesQuerySpecification INSTANCE = new RookMovesQuerySpecification();
    
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
    private final static RookMovesQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "chess.queries.rookMoves";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("rook","square","chess");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(
      			 new PParameter("rook", "chessdiagram.Rook", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://example.com/chessdiagram", "Rook"))),
      			 new PParameter("square", "chessdiagram.Square", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://example.com/chessdiagram", "Square"))),
      			 new PParameter("chess", "chessdiagram.Chess", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://example.com/chessdiagram", "Chess")))
      			);
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_rook = body.getOrCreateVariableByName("rook");
      		PVariable var_square = body.getOrCreateVariableByName("square");
      		PVariable var_chess = body.getOrCreateVariableByName("chess");
      		new TypeConstraint(body, new FlatTuple(var_rook), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Rook")));
      		new TypeConstraint(body, new FlatTuple(var_square), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Square")));
      		new TypeConstraint(body, new FlatTuple(var_chess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Chess")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_rook, "rook"),
      		   new ExportedParameter(body, var_square, "square"),
      		   new ExportedParameter(body, var_chess, "chess")
      		));
      		// 	find verticalRookMoves(rook, square)
      		new PositivePatternCall(body, new FlatTuple(var_rook, var_square), VerticalRookMovesQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	Chess.square(chess,square)
      		new TypeConstraint(body, new FlatTuple(var_chess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Chess")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_chess, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/chessdiagram", "Chess", "square")));
      		new Equality(body, var__virtual_0_, var_square);
      		bodies.add(body);
      	}
      	{
      		PBody body = new PBody(this);
      		PVariable var_rook = body.getOrCreateVariableByName("rook");
      		PVariable var_square = body.getOrCreateVariableByName("square");
      		PVariable var_chess = body.getOrCreateVariableByName("chess");
      		new TypeConstraint(body, new FlatTuple(var_rook), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Rook")));
      		new TypeConstraint(body, new FlatTuple(var_square), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Square")));
      		new TypeConstraint(body, new FlatTuple(var_chess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Chess")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_rook, "rook"),
      		   new ExportedParameter(body, var_square, "square"),
      		   new ExportedParameter(body, var_chess, "chess")
      		));
      		// 	find horizontalRookMoves(rook, square)
      		new PositivePatternCall(body, new FlatTuple(var_rook, var_square), HorizontalRookMovesQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	Chess.square(chess,square)
      		new TypeConstraint(body, new FlatTuple(var_chess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Chess")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_chess, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/chessdiagram", "Chess", "square")));
      		new Equality(body, var__virtual_0_, var_square);
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
