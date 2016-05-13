package chess.queries.util;

import chess.queries.KnightMovesMatch;
import chess.queries.KnightMovesMatcher;
import chess.queries.util.EQuerySpecification;
import chess.queries.util.NQuerySpecification;
import chess.queries.util.SQuerySpecification;
import chess.queries.util.SquareQuerySpecification;
import chess.queries.util.WQuerySpecification;
import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.viatra.query.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.viatra.query.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate KnightMovesMatcher in a type-safe way.
 * 
 * @see KnightMovesMatcher
 * @see KnightMovesMatch
 * 
 */
@SuppressWarnings("all")
public final class KnightMovesQuerySpecification extends BaseGeneratedEMFQuerySpecification<KnightMovesMatcher> {
  private KnightMovesQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryException if the pattern definition could not be loaded
   * 
   */
  public static KnightMovesQuerySpecification instance() throws ViatraQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected KnightMovesMatcher instantiate(final ViatraQueryEngine engine) throws ViatraQueryException {
    return KnightMovesMatcher.on(engine);
  }
  
  @Override
  public KnightMovesMatch newEmptyMatch() {
    return KnightMovesMatch.newEmptyMatch();
  }
  
  @Override
  public KnightMovesMatch newMatch(final Object... parameters) {
    return KnightMovesMatch.newMatch((chessdiagram.Knight) parameters[0], (chessdiagram.Square) parameters[1], (chessdiagram.Chess) parameters[2]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link KnightMovesQuerySpecification} to be created 
   * 	<b>not</b> at the class load time of the outer class, 
   * 	but rather at the first call to {@link KnightMovesQuerySpecification#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static KnightMovesQuerySpecification INSTANCE = new KnightMovesQuerySpecification();
    
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
    private final static KnightMovesQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "chess.queries.knightMoves";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("knight","square","chess");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(
      			 new PParameter("knight", "chessdiagram.Knight", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://example.com/chessdiagram", "Knight"))),
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
      		PVariable var_knight = body.getOrCreateVariableByName("knight");
      		PVariable var_square = body.getOrCreateVariableByName("square");
      		PVariable var_chess = body.getOrCreateVariableByName("chess");
      		PVariable var_knightSquare = body.getOrCreateVariableByName("knightSquare");
      		PVariable var_N1 = body.getOrCreateVariableByName("N1");
      		PVariable var_N2 = body.getOrCreateVariableByName("N2");
      		new TypeConstraint(body, new FlatTuple(var_knight), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Knight")));
      		new TypeConstraint(body, new FlatTuple(var_square), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Square")));
      		new TypeConstraint(body, new FlatTuple(var_chess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Chess")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_knight, "knight"),
      		   new ExportedParameter(body, var_square, "square"),
      		   new ExportedParameter(body, var_chess, "chess")
      		));
      		// 	find square(knight, knightSquare)
      		new PositivePatternCall(body, new FlatTuple(var_knight, var_knightSquare), SquareQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	find N(knightSquare, N1)
      		new PositivePatternCall(body, new FlatTuple(var_knightSquare, var_N1), NQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	find N(N1, N2)
      		new PositivePatternCall(body, new FlatTuple(var_N1, var_N2), NQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	find W(N2, square)
      		new PositivePatternCall(body, new FlatTuple(var_N2, var_square), WQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	Chess(chess)
      		new TypeConstraint(body, new FlatTuple(var_chess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Chess")));
      		bodies.add(body);
      	}
      	{
      		PBody body = new PBody(this);
      		PVariable var_knight = body.getOrCreateVariableByName("knight");
      		PVariable var_square = body.getOrCreateVariableByName("square");
      		PVariable var_chess = body.getOrCreateVariableByName("chess");
      		PVariable var_knightSquare = body.getOrCreateVariableByName("knightSquare");
      		PVariable var_N1 = body.getOrCreateVariableByName("N1");
      		PVariable var_N2 = body.getOrCreateVariableByName("N2");
      		new TypeConstraint(body, new FlatTuple(var_knight), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Knight")));
      		new TypeConstraint(body, new FlatTuple(var_square), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Square")));
      		new TypeConstraint(body, new FlatTuple(var_chess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Chess")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_knight, "knight"),
      		   new ExportedParameter(body, var_square, "square"),
      		   new ExportedParameter(body, var_chess, "chess")
      		));
      		// 	find square(knight, knightSquare)
      		new PositivePatternCall(body, new FlatTuple(var_knight, var_knightSquare), SquareQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	find N(knightSquare, N1)
      		new PositivePatternCall(body, new FlatTuple(var_knightSquare, var_N1), NQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	find N(N1, N2)
      		new PositivePatternCall(body, new FlatTuple(var_N1, var_N2), NQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	find E(N2, square)
      		new PositivePatternCall(body, new FlatTuple(var_N2, var_square), EQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	Chess(chess)
      		new TypeConstraint(body, new FlatTuple(var_chess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Chess")));
      		bodies.add(body);
      	}
      	{
      		PBody body = new PBody(this);
      		PVariable var_knight = body.getOrCreateVariableByName("knight");
      		PVariable var_square = body.getOrCreateVariableByName("square");
      		PVariable var_chess = body.getOrCreateVariableByName("chess");
      		PVariable var_knightSquare = body.getOrCreateVariableByName("knightSquare");
      		PVariable var_N1 = body.getOrCreateVariableByName("N1");
      		PVariable var_W1 = body.getOrCreateVariableByName("W1");
      		new TypeConstraint(body, new FlatTuple(var_knight), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Knight")));
      		new TypeConstraint(body, new FlatTuple(var_square), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Square")));
      		new TypeConstraint(body, new FlatTuple(var_chess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Chess")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_knight, "knight"),
      		   new ExportedParameter(body, var_square, "square"),
      		   new ExportedParameter(body, var_chess, "chess")
      		));
      		// 	find square(knight, knightSquare)
      		new PositivePatternCall(body, new FlatTuple(var_knight, var_knightSquare), SquareQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	find N(knightSquare, N1)
      		new PositivePatternCall(body, new FlatTuple(var_knightSquare, var_N1), NQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	find W(N1, W1)
      		new PositivePatternCall(body, new FlatTuple(var_N1, var_W1), WQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	find W(W1, square)
      		new PositivePatternCall(body, new FlatTuple(var_W1, var_square), WQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	Chess(chess)
      		new TypeConstraint(body, new FlatTuple(var_chess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Chess")));
      		bodies.add(body);
      	}
      	{
      		PBody body = new PBody(this);
      		PVariable var_knight = body.getOrCreateVariableByName("knight");
      		PVariable var_square = body.getOrCreateVariableByName("square");
      		PVariable var_chess = body.getOrCreateVariableByName("chess");
      		PVariable var_knightSquare = body.getOrCreateVariableByName("knightSquare");
      		PVariable var_N1 = body.getOrCreateVariableByName("N1");
      		PVariable var_E1 = body.getOrCreateVariableByName("E1");
      		new TypeConstraint(body, new FlatTuple(var_knight), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Knight")));
      		new TypeConstraint(body, new FlatTuple(var_square), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Square")));
      		new TypeConstraint(body, new FlatTuple(var_chess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Chess")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_knight, "knight"),
      		   new ExportedParameter(body, var_square, "square"),
      		   new ExportedParameter(body, var_chess, "chess")
      		));
      		// 	find square(knight, knightSquare)
      		new PositivePatternCall(body, new FlatTuple(var_knight, var_knightSquare), SquareQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	find N(knightSquare, N1)
      		new PositivePatternCall(body, new FlatTuple(var_knightSquare, var_N1), NQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	find E(N1, E1)
      		new PositivePatternCall(body, new FlatTuple(var_N1, var_E1), EQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	find E(E1, square)
      		new PositivePatternCall(body, new FlatTuple(var_E1, var_square), EQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	Chess(chess)
      		new TypeConstraint(body, new FlatTuple(var_chess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Chess")));
      		bodies.add(body);
      	}
      	{
      		PBody body = new PBody(this);
      		PVariable var_knight = body.getOrCreateVariableByName("knight");
      		PVariable var_square = body.getOrCreateVariableByName("square");
      		PVariable var_chess = body.getOrCreateVariableByName("chess");
      		PVariable var_knightSquare = body.getOrCreateVariableByName("knightSquare");
      		PVariable var_S1 = body.getOrCreateVariableByName("S1");
      		PVariable var_S2 = body.getOrCreateVariableByName("S2");
      		new TypeConstraint(body, new FlatTuple(var_knight), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Knight")));
      		new TypeConstraint(body, new FlatTuple(var_square), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Square")));
      		new TypeConstraint(body, new FlatTuple(var_chess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Chess")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_knight, "knight"),
      		   new ExportedParameter(body, var_square, "square"),
      		   new ExportedParameter(body, var_chess, "chess")
      		));
      		// 	find square(knight, knightSquare)
      		new PositivePatternCall(body, new FlatTuple(var_knight, var_knightSquare), SquareQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	find S(knightSquare, S1)
      		new PositivePatternCall(body, new FlatTuple(var_knightSquare, var_S1), SQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	find S(S1, S2)
      		new PositivePatternCall(body, new FlatTuple(var_S1, var_S2), SQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	find W(S2, square)
      		new PositivePatternCall(body, new FlatTuple(var_S2, var_square), WQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	Chess(chess)
      		new TypeConstraint(body, new FlatTuple(var_chess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Chess")));
      		bodies.add(body);
      	}
      	{
      		PBody body = new PBody(this);
      		PVariable var_knight = body.getOrCreateVariableByName("knight");
      		PVariable var_square = body.getOrCreateVariableByName("square");
      		PVariable var_chess = body.getOrCreateVariableByName("chess");
      		PVariable var_knightSquare = body.getOrCreateVariableByName("knightSquare");
      		PVariable var_S1 = body.getOrCreateVariableByName("S1");
      		PVariable var_S2 = body.getOrCreateVariableByName("S2");
      		new TypeConstraint(body, new FlatTuple(var_knight), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Knight")));
      		new TypeConstraint(body, new FlatTuple(var_square), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Square")));
      		new TypeConstraint(body, new FlatTuple(var_chess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Chess")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_knight, "knight"),
      		   new ExportedParameter(body, var_square, "square"),
      		   new ExportedParameter(body, var_chess, "chess")
      		));
      		// 	find square(knight, knightSquare)
      		new PositivePatternCall(body, new FlatTuple(var_knight, var_knightSquare), SquareQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	find S(knightSquare, S1)
      		new PositivePatternCall(body, new FlatTuple(var_knightSquare, var_S1), SQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	find S(S1, S2)
      		new PositivePatternCall(body, new FlatTuple(var_S1, var_S2), SQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	find E(S2, square)
      		new PositivePatternCall(body, new FlatTuple(var_S2, var_square), EQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	Chess(chess)
      		new TypeConstraint(body, new FlatTuple(var_chess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Chess")));
      		bodies.add(body);
      	}
      	{
      		PBody body = new PBody(this);
      		PVariable var_knight = body.getOrCreateVariableByName("knight");
      		PVariable var_square = body.getOrCreateVariableByName("square");
      		PVariable var_chess = body.getOrCreateVariableByName("chess");
      		PVariable var_knightSquare = body.getOrCreateVariableByName("knightSquare");
      		PVariable var_S1 = body.getOrCreateVariableByName("S1");
      		PVariable var_W1 = body.getOrCreateVariableByName("W1");
      		new TypeConstraint(body, new FlatTuple(var_knight), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Knight")));
      		new TypeConstraint(body, new FlatTuple(var_square), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Square")));
      		new TypeConstraint(body, new FlatTuple(var_chess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Chess")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_knight, "knight"),
      		   new ExportedParameter(body, var_square, "square"),
      		   new ExportedParameter(body, var_chess, "chess")
      		));
      		// 	find square(knight, knightSquare)
      		new PositivePatternCall(body, new FlatTuple(var_knight, var_knightSquare), SquareQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	find S(knightSquare, S1)
      		new PositivePatternCall(body, new FlatTuple(var_knightSquare, var_S1), SQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	find W(S1, W1)
      		new PositivePatternCall(body, new FlatTuple(var_S1, var_W1), WQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	find W(W1, square)
      		new PositivePatternCall(body, new FlatTuple(var_W1, var_square), WQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	Chess(chess)
      		new TypeConstraint(body, new FlatTuple(var_chess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Chess")));
      		bodies.add(body);
      	}
      	{
      		PBody body = new PBody(this);
      		PVariable var_knight = body.getOrCreateVariableByName("knight");
      		PVariable var_square = body.getOrCreateVariableByName("square");
      		PVariable var_chess = body.getOrCreateVariableByName("chess");
      		PVariable var_knightSquare = body.getOrCreateVariableByName("knightSquare");
      		PVariable var_S1 = body.getOrCreateVariableByName("S1");
      		PVariable var_E1 = body.getOrCreateVariableByName("E1");
      		new TypeConstraint(body, new FlatTuple(var_knight), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Knight")));
      		new TypeConstraint(body, new FlatTuple(var_square), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Square")));
      		new TypeConstraint(body, new FlatTuple(var_chess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Chess")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_knight, "knight"),
      		   new ExportedParameter(body, var_square, "square"),
      		   new ExportedParameter(body, var_chess, "chess")
      		));
      		// 	find square(knight, knightSquare)
      		new PositivePatternCall(body, new FlatTuple(var_knight, var_knightSquare), SquareQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	find S(knightSquare, S1)
      		new PositivePatternCall(body, new FlatTuple(var_knightSquare, var_S1), SQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	find E(S1, E1)
      		new PositivePatternCall(body, new FlatTuple(var_S1, var_E1), EQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	find E(E1, square)
      		new PositivePatternCall(body, new FlatTuple(var_E1, var_square), EQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	Chess(chess)
      		new TypeConstraint(body, new FlatTuple(var_chess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Chess")));
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
