package chess.queries.util;

import chess.queries.KingMovesMatch;
import chess.queries.KingMovesMatcher;
import chess.queries.util.CanAttackQuerySpecification;
import chess.queries.util.EQuerySpecification;
import chess.queries.util.MovesEastQuerySpecification;
import chess.queries.util.MovesWestQuerySpecification;
import chess.queries.util.NEQuerySpecification;
import chess.queries.util.NQuerySpecification;
import chess.queries.util.NWQuerySpecification;
import chess.queries.util.PieceOnSquareQuerySpecification;
import chess.queries.util.PieceOnSquareeQuerySpecification;
import chess.queries.util.SEQuerySpecification;
import chess.queries.util.SQuerySpecification;
import chess.queries.util.SWQuerySpecification;
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
import org.eclipse.viatra.query.runtime.emf.types.EStructuralFeatureInstancesKey;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.eclipse.viatra.query.runtime.matchers.psystem.IExpressionEvaluator;
import org.eclipse.viatra.query.runtime.matchers.psystem.IValueProvider;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExpressionEvaluation;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.NegativePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.ConstantValue;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.viatra.query.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate KingMovesMatcher in a type-safe way.
 * 
 * @see KingMovesMatcher
 * @see KingMovesMatch
 * 
 */
@SuppressWarnings("all")
public final class KingMovesQuerySpecification extends BaseGeneratedEMFQuerySpecification<KingMovesMatcher> {
  private KingMovesQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryException if the pattern definition could not be loaded
   * 
   */
  public static KingMovesQuerySpecification instance() throws ViatraQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected KingMovesMatcher instantiate(final ViatraQueryEngine engine) throws ViatraQueryException {
    return KingMovesMatcher.on(engine);
  }
  
  @Override
  public KingMovesMatch newEmptyMatch() {
    return KingMovesMatch.newEmptyMatch();
  }
  
  @Override
  public KingMovesMatch newMatch(final Object... parameters) {
    return KingMovesMatch.newMatch((chessdiagram.King) parameters[0], (chessdiagram.Square) parameters[1], (chessdiagram.Chess) parameters[2]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link KingMovesQuerySpecification} to be created 
   * 	<b>not</b> at the class load time of the outer class, 
   * 	but rather at the first call to {@link KingMovesQuerySpecification#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static KingMovesQuerySpecification INSTANCE = new KingMovesQuerySpecification();
    
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
    private final static KingMovesQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "chess.queries.kingMoves";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("king","square","chess");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(
      			 new PParameter("king", "chessdiagram.King", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://example.com/chessdiagram", "King"))),
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
      		PVariable var_king = body.getOrCreateVariableByName("king");
      		PVariable var_square = body.getOrCreateVariableByName("square");
      		PVariable var_chess = body.getOrCreateVariableByName("chess");
      		PVariable var_kingSquare = body.getOrCreateVariableByName("kingSquare");
      		new TypeConstraint(body, new FlatTuple(var_king), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "King")));
      		new TypeConstraint(body, new FlatTuple(var_square), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Square")));
      		new TypeConstraint(body, new FlatTuple(var_chess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Chess")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_king, "king"),
      		   new ExportedParameter(body, var_square, "square"),
      		   new ExportedParameter(body, var_chess, "chess")
      		));
      		// 	find square(king, kingSquare)
      		new PositivePatternCall(body, new FlatTuple(var_king, var_kingSquare), SquareQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	find N(kingSquare, square)
      		new PositivePatternCall(body, new FlatTuple(var_kingSquare, var_square), NQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	neg find pieceOnSquaree(square)
      		new NegativePatternCall(body, new FlatTuple(var_square), PieceOnSquareeQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	Chess.square(chess,square)
      		new TypeConstraint(body, new FlatTuple(var_chess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Chess")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_chess, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/chessdiagram", "Chess", "square")));
      		new Equality(body, var__virtual_0_, var_square);
      		bodies.add(body);
      	}
      	{
      		PBody body = new PBody(this);
      		PVariable var_king = body.getOrCreateVariableByName("king");
      		PVariable var_square = body.getOrCreateVariableByName("square");
      		PVariable var_chess = body.getOrCreateVariableByName("chess");
      		PVariable var_kingSquare = body.getOrCreateVariableByName("kingSquare");
      		new TypeConstraint(body, new FlatTuple(var_king), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "King")));
      		new TypeConstraint(body, new FlatTuple(var_square), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Square")));
      		new TypeConstraint(body, new FlatTuple(var_chess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Chess")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_king, "king"),
      		   new ExportedParameter(body, var_square, "square"),
      		   new ExportedParameter(body, var_chess, "chess")
      		));
      		// 	find square(king, kingSquare)
      		new PositivePatternCall(body, new FlatTuple(var_king, var_kingSquare), SquareQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	find NE(kingSquare, square)
      		new PositivePatternCall(body, new FlatTuple(var_kingSquare, var_square), NEQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	neg find pieceOnSquaree(square)
      		new NegativePatternCall(body, new FlatTuple(var_square), PieceOnSquareeQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	Chess.square(chess,square)
      		new TypeConstraint(body, new FlatTuple(var_chess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Chess")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_chess, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/chessdiagram", "Chess", "square")));
      		new Equality(body, var__virtual_0_, var_square);
      		bodies.add(body);
      	}
      	{
      		PBody body = new PBody(this);
      		PVariable var_king = body.getOrCreateVariableByName("king");
      		PVariable var_square = body.getOrCreateVariableByName("square");
      		PVariable var_chess = body.getOrCreateVariableByName("chess");
      		PVariable var_kingSquare = body.getOrCreateVariableByName("kingSquare");
      		new TypeConstraint(body, new FlatTuple(var_king), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "King")));
      		new TypeConstraint(body, new FlatTuple(var_square), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Square")));
      		new TypeConstraint(body, new FlatTuple(var_chess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Chess")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_king, "king"),
      		   new ExportedParameter(body, var_square, "square"),
      		   new ExportedParameter(body, var_chess, "chess")
      		));
      		// 	find square(king, kingSquare)
      		new PositivePatternCall(body, new FlatTuple(var_king, var_kingSquare), SquareQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	find E(kingSquare, square)
      		new PositivePatternCall(body, new FlatTuple(var_kingSquare, var_square), EQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	neg find pieceOnSquaree(square)
      		new NegativePatternCall(body, new FlatTuple(var_square), PieceOnSquareeQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	Chess.square(chess,square)
      		new TypeConstraint(body, new FlatTuple(var_chess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Chess")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_chess, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/chessdiagram", "Chess", "square")));
      		new Equality(body, var__virtual_0_, var_square);
      		bodies.add(body);
      	}
      	{
      		PBody body = new PBody(this);
      		PVariable var_king = body.getOrCreateVariableByName("king");
      		PVariable var_square = body.getOrCreateVariableByName("square");
      		PVariable var_chess = body.getOrCreateVariableByName("chess");
      		PVariable var_kingSquare = body.getOrCreateVariableByName("kingSquare");
      		new TypeConstraint(body, new FlatTuple(var_king), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "King")));
      		new TypeConstraint(body, new FlatTuple(var_square), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Square")));
      		new TypeConstraint(body, new FlatTuple(var_chess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Chess")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_king, "king"),
      		   new ExportedParameter(body, var_square, "square"),
      		   new ExportedParameter(body, var_chess, "chess")
      		));
      		// 	find square(king, kingSquare)
      		new PositivePatternCall(body, new FlatTuple(var_king, var_kingSquare), SquareQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	find SE(kingSquare, square)
      		new PositivePatternCall(body, new FlatTuple(var_kingSquare, var_square), SEQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	neg find pieceOnSquaree(square)
      		new NegativePatternCall(body, new FlatTuple(var_square), PieceOnSquareeQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	Chess.square(chess,square)
      		new TypeConstraint(body, new FlatTuple(var_chess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Chess")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_chess, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/chessdiagram", "Chess", "square")));
      		new Equality(body, var__virtual_0_, var_square);
      		bodies.add(body);
      	}
      	{
      		PBody body = new PBody(this);
      		PVariable var_king = body.getOrCreateVariableByName("king");
      		PVariable var_square = body.getOrCreateVariableByName("square");
      		PVariable var_chess = body.getOrCreateVariableByName("chess");
      		PVariable var_kingSquare = body.getOrCreateVariableByName("kingSquare");
      		new TypeConstraint(body, new FlatTuple(var_king), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "King")));
      		new TypeConstraint(body, new FlatTuple(var_square), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Square")));
      		new TypeConstraint(body, new FlatTuple(var_chess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Chess")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_king, "king"),
      		   new ExportedParameter(body, var_square, "square"),
      		   new ExportedParameter(body, var_chess, "chess")
      		));
      		// 	find square(king, kingSquare)
      		new PositivePatternCall(body, new FlatTuple(var_king, var_kingSquare), SquareQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	find S(kingSquare, square)
      		new PositivePatternCall(body, new FlatTuple(var_kingSquare, var_square), SQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	neg find pieceOnSquaree(square)
      		new NegativePatternCall(body, new FlatTuple(var_square), PieceOnSquareeQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	Chess.square(chess,square)
      		new TypeConstraint(body, new FlatTuple(var_chess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Chess")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_chess, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/chessdiagram", "Chess", "square")));
      		new Equality(body, var__virtual_0_, var_square);
      		bodies.add(body);
      	}
      	{
      		PBody body = new PBody(this);
      		PVariable var_king = body.getOrCreateVariableByName("king");
      		PVariable var_square = body.getOrCreateVariableByName("square");
      		PVariable var_chess = body.getOrCreateVariableByName("chess");
      		PVariable var_kingSquare = body.getOrCreateVariableByName("kingSquare");
      		new TypeConstraint(body, new FlatTuple(var_king), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "King")));
      		new TypeConstraint(body, new FlatTuple(var_square), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Square")));
      		new TypeConstraint(body, new FlatTuple(var_chess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Chess")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_king, "king"),
      		   new ExportedParameter(body, var_square, "square"),
      		   new ExportedParameter(body, var_chess, "chess")
      		));
      		// 	find square(king, kingSquare)
      		new PositivePatternCall(body, new FlatTuple(var_king, var_kingSquare), SquareQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	find SW(kingSquare, square)
      		new PositivePatternCall(body, new FlatTuple(var_kingSquare, var_square), SWQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	neg find pieceOnSquaree(square)
      		new NegativePatternCall(body, new FlatTuple(var_square), PieceOnSquareeQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	Chess.square(chess,square)
      		new TypeConstraint(body, new FlatTuple(var_chess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Chess")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_chess, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/chessdiagram", "Chess", "square")));
      		new Equality(body, var__virtual_0_, var_square);
      		bodies.add(body);
      	}
      	{
      		PBody body = new PBody(this);
      		PVariable var_king = body.getOrCreateVariableByName("king");
      		PVariable var_square = body.getOrCreateVariableByName("square");
      		PVariable var_chess = body.getOrCreateVariableByName("chess");
      		PVariable var_kingSquare = body.getOrCreateVariableByName("kingSquare");
      		new TypeConstraint(body, new FlatTuple(var_king), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "King")));
      		new TypeConstraint(body, new FlatTuple(var_square), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Square")));
      		new TypeConstraint(body, new FlatTuple(var_chess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Chess")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_king, "king"),
      		   new ExportedParameter(body, var_square, "square"),
      		   new ExportedParameter(body, var_chess, "chess")
      		));
      		// 	find square(king, kingSquare)
      		new PositivePatternCall(body, new FlatTuple(var_king, var_kingSquare), SquareQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	find W(kingSquare, square)
      		new PositivePatternCall(body, new FlatTuple(var_kingSquare, var_square), WQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	neg find pieceOnSquaree(square)
      		new NegativePatternCall(body, new FlatTuple(var_square), PieceOnSquareeQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	Chess.square(chess,square)
      		new TypeConstraint(body, new FlatTuple(var_chess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Chess")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_chess, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/chessdiagram", "Chess", "square")));
      		new Equality(body, var__virtual_0_, var_square);
      		bodies.add(body);
      	}
      	{
      		PBody body = new PBody(this);
      		PVariable var_king = body.getOrCreateVariableByName("king");
      		PVariable var_square = body.getOrCreateVariableByName("square");
      		PVariable var_chess = body.getOrCreateVariableByName("chess");
      		PVariable var_kingSquare = body.getOrCreateVariableByName("kingSquare");
      		new TypeConstraint(body, new FlatTuple(var_king), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "King")));
      		new TypeConstraint(body, new FlatTuple(var_square), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Square")));
      		new TypeConstraint(body, new FlatTuple(var_chess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Chess")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_king, "king"),
      		   new ExportedParameter(body, var_square, "square"),
      		   new ExportedParameter(body, var_chess, "chess")
      		));
      		// 	find square(king, kingSquare)
      		new PositivePatternCall(body, new FlatTuple(var_king, var_kingSquare), SquareQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	find NW(kingSquare, square)
      		new PositivePatternCall(body, new FlatTuple(var_kingSquare, var_square), NWQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	neg find pieceOnSquaree(square)
      		new NegativePatternCall(body, new FlatTuple(var_square), PieceOnSquareeQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	Chess.square(chess,square)
      		new TypeConstraint(body, new FlatTuple(var_chess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Chess")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_chess, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/chessdiagram", "Chess", "square")));
      		new Equality(body, var__virtual_0_, var_square);
      		bodies.add(body);
      	}
      	{
      		PBody body = new PBody(this);
      		PVariable var_king = body.getOrCreateVariableByName("king");
      		PVariable var_square = body.getOrCreateVariableByName("square");
      		PVariable var_chess = body.getOrCreateVariableByName("chess");
      		PVariable var_queenSquare = body.getOrCreateVariableByName("queenSquare");
      		PVariable var_piece = body.getOrCreateVariableByName("piece");
      		new TypeConstraint(body, new FlatTuple(var_king), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "King")));
      		new TypeConstraint(body, new FlatTuple(var_square), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Square")));
      		new TypeConstraint(body, new FlatTuple(var_chess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Chess")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_king, "king"),
      		   new ExportedParameter(body, var_square, "square"),
      		   new ExportedParameter(body, var_chess, "chess")
      		));
      		// 	find square(king, queenSquare)
      		new PositivePatternCall(body, new FlatTuple(var_king, var_queenSquare), SquareQuerySpecification.instance().getInternalQueryRepresentation());
      		//  //South East moves atacking	find N(queenSquare, square)
      		new PositivePatternCall(body, new FlatTuple(var_queenSquare, var_square), NQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	find pieceOnSquare(square, piece)
      		new PositivePatternCall(body, new FlatTuple(var_square, var_piece), PieceOnSquareQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	find canAttack(king, piece)
      		new PositivePatternCall(body, new FlatTuple(var_king, var_piece), CanAttackQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	Chess.square(chess,square)
      		new TypeConstraint(body, new FlatTuple(var_chess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Chess")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_chess, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/chessdiagram", "Chess", "square")));
      		new Equality(body, var__virtual_0_, var_square);
      		bodies.add(body);
      	}
      	{
      		PBody body = new PBody(this);
      		PVariable var_king = body.getOrCreateVariableByName("king");
      		PVariable var_square = body.getOrCreateVariableByName("square");
      		PVariable var_chess = body.getOrCreateVariableByName("chess");
      		PVariable var_queenSquare = body.getOrCreateVariableByName("queenSquare");
      		PVariable var_piece = body.getOrCreateVariableByName("piece");
      		new TypeConstraint(body, new FlatTuple(var_king), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "King")));
      		new TypeConstraint(body, new FlatTuple(var_square), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Square")));
      		new TypeConstraint(body, new FlatTuple(var_chess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Chess")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_king, "king"),
      		   new ExportedParameter(body, var_square, "square"),
      		   new ExportedParameter(body, var_chess, "chess")
      		));
      		// 	find square(king, queenSquare)
      		new PositivePatternCall(body, new FlatTuple(var_king, var_queenSquare), SquareQuerySpecification.instance().getInternalQueryRepresentation());
      		//  //South East moves atacking	find NE(queenSquare, square)
      		new PositivePatternCall(body, new FlatTuple(var_queenSquare, var_square), NEQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	find pieceOnSquare(square, piece)
      		new PositivePatternCall(body, new FlatTuple(var_square, var_piece), PieceOnSquareQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	find canAttack(king, piece)
      		new PositivePatternCall(body, new FlatTuple(var_king, var_piece), CanAttackQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	Chess.square(chess,square)
      		new TypeConstraint(body, new FlatTuple(var_chess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Chess")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_chess, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/chessdiagram", "Chess", "square")));
      		new Equality(body, var__virtual_0_, var_square);
      		bodies.add(body);
      	}
      	{
      		PBody body = new PBody(this);
      		PVariable var_king = body.getOrCreateVariableByName("king");
      		PVariable var_square = body.getOrCreateVariableByName("square");
      		PVariable var_chess = body.getOrCreateVariableByName("chess");
      		PVariable var_queenSquare = body.getOrCreateVariableByName("queenSquare");
      		PVariable var_piece = body.getOrCreateVariableByName("piece");
      		new TypeConstraint(body, new FlatTuple(var_king), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "King")));
      		new TypeConstraint(body, new FlatTuple(var_square), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Square")));
      		new TypeConstraint(body, new FlatTuple(var_chess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Chess")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_king, "king"),
      		   new ExportedParameter(body, var_square, "square"),
      		   new ExportedParameter(body, var_chess, "chess")
      		));
      		// 	find square(king, queenSquare)
      		new PositivePatternCall(body, new FlatTuple(var_king, var_queenSquare), SquareQuerySpecification.instance().getInternalQueryRepresentation());
      		//  //South East moves atacking	find E(queenSquare, square)
      		new PositivePatternCall(body, new FlatTuple(var_queenSquare, var_square), EQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	find pieceOnSquare(square, piece)
      		new PositivePatternCall(body, new FlatTuple(var_square, var_piece), PieceOnSquareQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	find canAttack(king, piece)
      		new PositivePatternCall(body, new FlatTuple(var_king, var_piece), CanAttackQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	Chess.square(chess,square)
      		new TypeConstraint(body, new FlatTuple(var_chess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Chess")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_chess, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/chessdiagram", "Chess", "square")));
      		new Equality(body, var__virtual_0_, var_square);
      		bodies.add(body);
      	}
      	{
      		PBody body = new PBody(this);
      		PVariable var_king = body.getOrCreateVariableByName("king");
      		PVariable var_square = body.getOrCreateVariableByName("square");
      		PVariable var_chess = body.getOrCreateVariableByName("chess");
      		PVariable var_queenSquare = body.getOrCreateVariableByName("queenSquare");
      		PVariable var_piece = body.getOrCreateVariableByName("piece");
      		new TypeConstraint(body, new FlatTuple(var_king), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "King")));
      		new TypeConstraint(body, new FlatTuple(var_square), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Square")));
      		new TypeConstraint(body, new FlatTuple(var_chess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Chess")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_king, "king"),
      		   new ExportedParameter(body, var_square, "square"),
      		   new ExportedParameter(body, var_chess, "chess")
      		));
      		// 	find square(king, queenSquare)
      		new PositivePatternCall(body, new FlatTuple(var_king, var_queenSquare), SquareQuerySpecification.instance().getInternalQueryRepresentation());
      		//  //South East moves atacking	find SE(queenSquare, square)
      		new PositivePatternCall(body, new FlatTuple(var_queenSquare, var_square), SEQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	find pieceOnSquare(square, piece)
      		new PositivePatternCall(body, new FlatTuple(var_square, var_piece), PieceOnSquareQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	find canAttack(king, piece)
      		new PositivePatternCall(body, new FlatTuple(var_king, var_piece), CanAttackQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	Chess.square(chess,square)
      		new TypeConstraint(body, new FlatTuple(var_chess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Chess")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_chess, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/chessdiagram", "Chess", "square")));
      		new Equality(body, var__virtual_0_, var_square);
      		bodies.add(body);
      	}
      	{
      		PBody body = new PBody(this);
      		PVariable var_king = body.getOrCreateVariableByName("king");
      		PVariable var_square = body.getOrCreateVariableByName("square");
      		PVariable var_chess = body.getOrCreateVariableByName("chess");
      		PVariable var_queenSquare = body.getOrCreateVariableByName("queenSquare");
      		PVariable var_piece = body.getOrCreateVariableByName("piece");
      		new TypeConstraint(body, new FlatTuple(var_king), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "King")));
      		new TypeConstraint(body, new FlatTuple(var_square), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Square")));
      		new TypeConstraint(body, new FlatTuple(var_chess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Chess")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_king, "king"),
      		   new ExportedParameter(body, var_square, "square"),
      		   new ExportedParameter(body, var_chess, "chess")
      		));
      		// 	find square(king, queenSquare)
      		new PositivePatternCall(body, new FlatTuple(var_king, var_queenSquare), SquareQuerySpecification.instance().getInternalQueryRepresentation());
      		//  //South East moves atacking	find S(queenSquare, square)
      		new PositivePatternCall(body, new FlatTuple(var_queenSquare, var_square), SQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	find pieceOnSquare(square, piece)
      		new PositivePatternCall(body, new FlatTuple(var_square, var_piece), PieceOnSquareQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	find canAttack(king, piece)
      		new PositivePatternCall(body, new FlatTuple(var_king, var_piece), CanAttackQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	Chess.square(chess,square)
      		new TypeConstraint(body, new FlatTuple(var_chess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Chess")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_chess, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/chessdiagram", "Chess", "square")));
      		new Equality(body, var__virtual_0_, var_square);
      		bodies.add(body);
      	}
      	{
      		PBody body = new PBody(this);
      		PVariable var_king = body.getOrCreateVariableByName("king");
      		PVariable var_square = body.getOrCreateVariableByName("square");
      		PVariable var_chess = body.getOrCreateVariableByName("chess");
      		PVariable var_queenSquare = body.getOrCreateVariableByName("queenSquare");
      		PVariable var_piece = body.getOrCreateVariableByName("piece");
      		new TypeConstraint(body, new FlatTuple(var_king), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "King")));
      		new TypeConstraint(body, new FlatTuple(var_square), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Square")));
      		new TypeConstraint(body, new FlatTuple(var_chess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Chess")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_king, "king"),
      		   new ExportedParameter(body, var_square, "square"),
      		   new ExportedParameter(body, var_chess, "chess")
      		));
      		// 	find square(king, queenSquare)
      		new PositivePatternCall(body, new FlatTuple(var_king, var_queenSquare), SquareQuerySpecification.instance().getInternalQueryRepresentation());
      		//  //South East moves atacking	find SW(queenSquare, square)
      		new PositivePatternCall(body, new FlatTuple(var_queenSquare, var_square), SWQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	find pieceOnSquare(square, piece)
      		new PositivePatternCall(body, new FlatTuple(var_square, var_piece), PieceOnSquareQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	find canAttack(king, piece)
      		new PositivePatternCall(body, new FlatTuple(var_king, var_piece), CanAttackQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	Chess.square(chess,square)
      		new TypeConstraint(body, new FlatTuple(var_chess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Chess")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_chess, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/chessdiagram", "Chess", "square")));
      		new Equality(body, var__virtual_0_, var_square);
      		bodies.add(body);
      	}
      	{
      		PBody body = new PBody(this);
      		PVariable var_king = body.getOrCreateVariableByName("king");
      		PVariable var_square = body.getOrCreateVariableByName("square");
      		PVariable var_chess = body.getOrCreateVariableByName("chess");
      		PVariable var_queenSquare = body.getOrCreateVariableByName("queenSquare");
      		PVariable var_piece = body.getOrCreateVariableByName("piece");
      		new TypeConstraint(body, new FlatTuple(var_king), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "King")));
      		new TypeConstraint(body, new FlatTuple(var_square), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Square")));
      		new TypeConstraint(body, new FlatTuple(var_chess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Chess")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_king, "king"),
      		   new ExportedParameter(body, var_square, "square"),
      		   new ExportedParameter(body, var_chess, "chess")
      		));
      		// 	find square(king, queenSquare)
      		new PositivePatternCall(body, new FlatTuple(var_king, var_queenSquare), SquareQuerySpecification.instance().getInternalQueryRepresentation());
      		//  //South East moves atacking	find W(queenSquare, square)
      		new PositivePatternCall(body, new FlatTuple(var_queenSquare, var_square), WQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	find pieceOnSquare(square, piece)
      		new PositivePatternCall(body, new FlatTuple(var_square, var_piece), PieceOnSquareQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	find canAttack(king, piece)
      		new PositivePatternCall(body, new FlatTuple(var_king, var_piece), CanAttackQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	Chess.square(chess,square)
      		new TypeConstraint(body, new FlatTuple(var_chess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Chess")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_chess, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/chessdiagram", "Chess", "square")));
      		new Equality(body, var__virtual_0_, var_square);
      		bodies.add(body);
      	}
      	{
      		PBody body = new PBody(this);
      		PVariable var_king = body.getOrCreateVariableByName("king");
      		PVariable var_square = body.getOrCreateVariableByName("square");
      		PVariable var_chess = body.getOrCreateVariableByName("chess");
      		PVariable var_queenSquare = body.getOrCreateVariableByName("queenSquare");
      		PVariable var_piece = body.getOrCreateVariableByName("piece");
      		new TypeConstraint(body, new FlatTuple(var_king), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "King")));
      		new TypeConstraint(body, new FlatTuple(var_square), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Square")));
      		new TypeConstraint(body, new FlatTuple(var_chess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Chess")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_king, "king"),
      		   new ExportedParameter(body, var_square, "square"),
      		   new ExportedParameter(body, var_chess, "chess")
      		));
      		// 	find square(king, queenSquare)
      		new PositivePatternCall(body, new FlatTuple(var_king, var_queenSquare), SquareQuerySpecification.instance().getInternalQueryRepresentation());
      		//  //South East moves atacking	find NW(queenSquare, square)
      		new PositivePatternCall(body, new FlatTuple(var_queenSquare, var_square), NWQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	find pieceOnSquare(square, piece)
      		new PositivePatternCall(body, new FlatTuple(var_square, var_piece), PieceOnSquareQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	find canAttack(king, piece)
      		new PositivePatternCall(body, new FlatTuple(var_king, var_piece), CanAttackQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	Chess.square(chess,square)
      		new TypeConstraint(body, new FlatTuple(var_chess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Chess")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_chess, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/chessdiagram", "Chess", "square")));
      		new Equality(body, var__virtual_0_, var_square);
      		bodies.add(body);
      	}
      	{
      		PBody body = new PBody(this);
      		PVariable var_king = body.getOrCreateVariableByName("king");
      		PVariable var_square = body.getOrCreateVariableByName("square");
      		PVariable var_chess = body.getOrCreateVariableByName("chess");
      		PVariable var_firsMoveKing = body.getOrCreateVariableByName("firsMoveKing");
      		PVariable var_kingSquare = body.getOrCreateVariableByName("kingSquare");
      		PVariable var_rook = body.getOrCreateVariableByName("rook");
      		PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
      		PVariable var_firstRookMove = body.getOrCreateVariableByName("firstRookMove");
      		new TypeConstraint(body, new FlatTuple(var_king), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "King")));
      		new TypeConstraint(body, new FlatTuple(var_square), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Square")));
      		new TypeConstraint(body, new FlatTuple(var_chess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Chess")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_king, "king"),
      		   new ExportedParameter(body, var_square, "square"),
      		   new ExportedParameter(body, var_chess, "chess")
      		));
      		// 	King.firstMove(king, firsMoveKing)
      		new TypeConstraint(body, new FlatTuple(var_king), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "King")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_king, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/chessdiagram", "King", "firstMove")));
      		new Equality(body, var__virtual_0_, var_firsMoveKing);
      		// 	//Casting All for possible ways	check(firsMoveKing == true)
      		new ExpressionEvaluation(body, new IExpressionEvaluator() {
      		                            
      		                            @Override
      		                            public String getShortDescription() {
      		                                return "Expression evaluation from pattern kingMoves";
      		                            }
      		
      		                            @Override
      		                            public Iterable<String> getInputParameterNames() {
      		                                return Arrays.asList("firsMoveKing");
      		                            }
      		
      		                            @Override
      		                            public Object evaluateExpression(IValueProvider provider) throws Exception {
      		                                    java.lang.Boolean firsMoveKing = (java.lang.Boolean) provider.getValue("firsMoveKing");
      		                                    return evaluateExpression_17_1(firsMoveKing);
      		                                }
      		
      		                        },  null); // 	find square(king, kingSquare)
      		new PositivePatternCall(body, new FlatTuple(var_king, var_kingSquare), SquareQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	Square.id(square,56)
      		PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      		new ConstantValue(body, var__virtual_1_, 56);
      		new TypeConstraint(body, new FlatTuple(var_square), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Square")));
      		PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
      		new TypeConstraint(body, new FlatTuple(var_square, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/chessdiagram", "Square", "id")));
      		new Equality(body, var__virtual_2_, var__virtual_1_);
      		// 	find pieceOnSquare(square, rook)
      		new PositivePatternCall(body, new FlatTuple(var_square, var_rook), PieceOnSquareQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	find movesWest(kingSquare, _, square)
      		new PositivePatternCall(body, new FlatTuple(var_kingSquare, var___0_, var_square), MovesWestQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	Rook.firstMove(rook, firstRookMove)
      		new TypeConstraint(body, new FlatTuple(var_rook), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Rook")));
      		PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
      		new TypeConstraint(body, new FlatTuple(var_rook, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/chessdiagram", "Rook", "firstMove")));
      		new Equality(body, var__virtual_3_, var_firstRookMove);
      		// 	check(firstRookMove == true)
      		new ExpressionEvaluation(body, new IExpressionEvaluator() {
      		                            
      		                            @Override
      		                            public String getShortDescription() {
      		                                return "Expression evaluation from pattern kingMoves";
      		                            }
      		
      		                            @Override
      		                            public Iterable<String> getInputParameterNames() {
      		                                return Arrays.asList("firstRookMove");
      		                            }
      		
      		                            @Override
      		                            public Object evaluateExpression(IValueProvider provider) throws Exception {
      		                                    java.lang.Boolean firstRookMove = (java.lang.Boolean) provider.getValue("firstRookMove");
      		                                    return evaluateExpression_17_2(firstRookMove);
      		                                }
      		
      		                        },  null); // 	Chess.square(chess,square)
      		new TypeConstraint(body, new FlatTuple(var_chess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Chess")));
      		PVariable var__virtual_4_ = body.getOrCreateVariableByName(".virtual{4}");
      		new TypeConstraint(body, new FlatTuple(var_chess, var__virtual_4_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/chessdiagram", "Chess", "square")));
      		new Equality(body, var__virtual_4_, var_square);
      		bodies.add(body);
      	}
      	{
      		PBody body = new PBody(this);
      		PVariable var_king = body.getOrCreateVariableByName("king");
      		PVariable var_square = body.getOrCreateVariableByName("square");
      		PVariable var_chess = body.getOrCreateVariableByName("chess");
      		PVariable var_firsMoveKing = body.getOrCreateVariableByName("firsMoveKing");
      		PVariable var_kingSquare = body.getOrCreateVariableByName("kingSquare");
      		PVariable var_rook = body.getOrCreateVariableByName("rook");
      		PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
      		PVariable var_firstRookMove = body.getOrCreateVariableByName("firstRookMove");
      		new TypeConstraint(body, new FlatTuple(var_king), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "King")));
      		new TypeConstraint(body, new FlatTuple(var_square), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Square")));
      		new TypeConstraint(body, new FlatTuple(var_chess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Chess")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_king, "king"),
      		   new ExportedParameter(body, var_square, "square"),
      		   new ExportedParameter(body, var_chess, "chess")
      		));
      		// 	King.firstMove(king, firsMoveKing)
      		new TypeConstraint(body, new FlatTuple(var_king), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "King")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_king, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/chessdiagram", "King", "firstMove")));
      		new Equality(body, var__virtual_0_, var_firsMoveKing);
      		// 	check(firsMoveKing == true)
      		new ExpressionEvaluation(body, new IExpressionEvaluator() {
      		                            
      		                            @Override
      		                            public String getShortDescription() {
      		                                return "Expression evaluation from pattern kingMoves";
      		                            }
      		
      		                            @Override
      		                            public Iterable<String> getInputParameterNames() {
      		                                return Arrays.asList("firsMoveKing");
      		                            }
      		
      		                            @Override
      		                            public Object evaluateExpression(IValueProvider provider) throws Exception {
      		                                    java.lang.Boolean firsMoveKing = (java.lang.Boolean) provider.getValue("firsMoveKing");
      		                                    return evaluateExpression_18_1(firsMoveKing);
      		                                }
      		
      		                        },  null); // 	find square(king, kingSquare)
      		new PositivePatternCall(body, new FlatTuple(var_king, var_kingSquare), SquareQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	Square.id(square,63)
      		PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      		new ConstantValue(body, var__virtual_1_, 63);
      		new TypeConstraint(body, new FlatTuple(var_square), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Square")));
      		PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
      		new TypeConstraint(body, new FlatTuple(var_square, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/chessdiagram", "Square", "id")));
      		new Equality(body, var__virtual_2_, var__virtual_1_);
      		// 	find pieceOnSquare(square, rook)
      		new PositivePatternCall(body, new FlatTuple(var_square, var_rook), PieceOnSquareQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	find movesEast(kingSquare, _, square)
      		new PositivePatternCall(body, new FlatTuple(var_kingSquare, var___0_, var_square), MovesEastQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	Rook.firstMove(rook, firstRookMove)
      		new TypeConstraint(body, new FlatTuple(var_rook), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Rook")));
      		PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
      		new TypeConstraint(body, new FlatTuple(var_rook, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/chessdiagram", "Rook", "firstMove")));
      		new Equality(body, var__virtual_3_, var_firstRookMove);
      		// 	check(firstRookMove == true)
      		new ExpressionEvaluation(body, new IExpressionEvaluator() {
      		                            
      		                            @Override
      		                            public String getShortDescription() {
      		                                return "Expression evaluation from pattern kingMoves";
      		                            }
      		
      		                            @Override
      		                            public Iterable<String> getInputParameterNames() {
      		                                return Arrays.asList("firstRookMove");
      		                            }
      		
      		                            @Override
      		                            public Object evaluateExpression(IValueProvider provider) throws Exception {
      		                                    java.lang.Boolean firstRookMove = (java.lang.Boolean) provider.getValue("firstRookMove");
      		                                    return evaluateExpression_18_2(firstRookMove);
      		                                }
      		
      		                        },  null); // 	Chess.square(chess,square)
      		new TypeConstraint(body, new FlatTuple(var_chess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Chess")));
      		PVariable var__virtual_4_ = body.getOrCreateVariableByName(".virtual{4}");
      		new TypeConstraint(body, new FlatTuple(var_chess, var__virtual_4_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/chessdiagram", "Chess", "square")));
      		new Equality(body, var__virtual_4_, var_square);
      		bodies.add(body);
      	}
      	{
      		PBody body = new PBody(this);
      		PVariable var_king = body.getOrCreateVariableByName("king");
      		PVariable var_square = body.getOrCreateVariableByName("square");
      		PVariable var_chess = body.getOrCreateVariableByName("chess");
      		PVariable var_firsMoveKing = body.getOrCreateVariableByName("firsMoveKing");
      		PVariable var_kingSquare = body.getOrCreateVariableByName("kingSquare");
      		PVariable var_rook = body.getOrCreateVariableByName("rook");
      		PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
      		PVariable var_firstRookMove = body.getOrCreateVariableByName("firstRookMove");
      		new TypeConstraint(body, new FlatTuple(var_king), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "King")));
      		new TypeConstraint(body, new FlatTuple(var_square), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Square")));
      		new TypeConstraint(body, new FlatTuple(var_chess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Chess")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_king, "king"),
      		   new ExportedParameter(body, var_square, "square"),
      		   new ExportedParameter(body, var_chess, "chess")
      		));
      		// 	King.firstMove(king, firsMoveKing)
      		new TypeConstraint(body, new FlatTuple(var_king), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "King")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_king, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/chessdiagram", "King", "firstMove")));
      		new Equality(body, var__virtual_0_, var_firsMoveKing);
      		// 	//Casting for black king	check(firsMoveKing == true)
      		new ExpressionEvaluation(body, new IExpressionEvaluator() {
      		                            
      		                            @Override
      		                            public String getShortDescription() {
      		                                return "Expression evaluation from pattern kingMoves";
      		                            }
      		
      		                            @Override
      		                            public Iterable<String> getInputParameterNames() {
      		                                return Arrays.asList("firsMoveKing");
      		                            }
      		
      		                            @Override
      		                            public Object evaluateExpression(IValueProvider provider) throws Exception {
      		                                    java.lang.Boolean firsMoveKing = (java.lang.Boolean) provider.getValue("firsMoveKing");
      		                                    return evaluateExpression_19_1(firsMoveKing);
      		                                }
      		
      		                        },  null); // 	find square(king, kingSquare)
      		new PositivePatternCall(body, new FlatTuple(var_king, var_kingSquare), SquareQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	Square.id(square,0)
      		PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      		new ConstantValue(body, var__virtual_1_, 0);
      		new TypeConstraint(body, new FlatTuple(var_square), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Square")));
      		PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
      		new TypeConstraint(body, new FlatTuple(var_square, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/chessdiagram", "Square", "id")));
      		new Equality(body, var__virtual_2_, var__virtual_1_);
      		// 	find pieceOnSquare(square, rook)
      		new PositivePatternCall(body, new FlatTuple(var_square, var_rook), PieceOnSquareQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	find movesWest(kingSquare, _, square)
      		new PositivePatternCall(body, new FlatTuple(var_kingSquare, var___0_, var_square), MovesWestQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	Rook.firstMove(rook, firstRookMove)
      		new TypeConstraint(body, new FlatTuple(var_rook), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Rook")));
      		PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
      		new TypeConstraint(body, new FlatTuple(var_rook, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/chessdiagram", "Rook", "firstMove")));
      		new Equality(body, var__virtual_3_, var_firstRookMove);
      		// 	check(firstRookMove == true)
      		new ExpressionEvaluation(body, new IExpressionEvaluator() {
      		                            
      		                            @Override
      		                            public String getShortDescription() {
      		                                return "Expression evaluation from pattern kingMoves";
      		                            }
      		
      		                            @Override
      		                            public Iterable<String> getInputParameterNames() {
      		                                return Arrays.asList("firstRookMove");
      		                            }
      		
      		                            @Override
      		                            public Object evaluateExpression(IValueProvider provider) throws Exception {
      		                                    java.lang.Boolean firstRookMove = (java.lang.Boolean) provider.getValue("firstRookMove");
      		                                    return evaluateExpression_19_2(firstRookMove);
      		                                }
      		
      		                        },  null); // 	Chess.square(chess,square)
      		new TypeConstraint(body, new FlatTuple(var_chess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Chess")));
      		PVariable var__virtual_4_ = body.getOrCreateVariableByName(".virtual{4}");
      		new TypeConstraint(body, new FlatTuple(var_chess, var__virtual_4_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/chessdiagram", "Chess", "square")));
      		new Equality(body, var__virtual_4_, var_square);
      		bodies.add(body);
      	}
      	{
      		PBody body = new PBody(this);
      		PVariable var_king = body.getOrCreateVariableByName("king");
      		PVariable var_square = body.getOrCreateVariableByName("square");
      		PVariable var_chess = body.getOrCreateVariableByName("chess");
      		PVariable var_firsMoveKing = body.getOrCreateVariableByName("firsMoveKing");
      		PVariable var_kingSquare = body.getOrCreateVariableByName("kingSquare");
      		PVariable var_rook = body.getOrCreateVariableByName("rook");
      		PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
      		PVariable var_firstRookMove = body.getOrCreateVariableByName("firstRookMove");
      		new TypeConstraint(body, new FlatTuple(var_king), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "King")));
      		new TypeConstraint(body, new FlatTuple(var_square), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Square")));
      		new TypeConstraint(body, new FlatTuple(var_chess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Chess")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_king, "king"),
      		   new ExportedParameter(body, var_square, "square"),
      		   new ExportedParameter(body, var_chess, "chess")
      		));
      		// 	King.firstMove(king, firsMoveKing)
      		new TypeConstraint(body, new FlatTuple(var_king), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "King")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_king, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/chessdiagram", "King", "firstMove")));
      		new Equality(body, var__virtual_0_, var_firsMoveKing);
      		// 		check(firsMoveKing == true)
      		new ExpressionEvaluation(body, new IExpressionEvaluator() {
      		                            
      		                            @Override
      		                            public String getShortDescription() {
      		                                return "Expression evaluation from pattern kingMoves";
      		                            }
      		
      		                            @Override
      		                            public Iterable<String> getInputParameterNames() {
      		                                return Arrays.asList("firsMoveKing");
      		                            }
      		
      		                            @Override
      		                            public Object evaluateExpression(IValueProvider provider) throws Exception {
      		                                    java.lang.Boolean firsMoveKing = (java.lang.Boolean) provider.getValue("firsMoveKing");
      		                                    return evaluateExpression_20_1(firsMoveKing);
      		                                }
      		
      		                        },  null); // 	find square(king, kingSquare)
      		new PositivePatternCall(body, new FlatTuple(var_king, var_kingSquare), SquareQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	Square.id(square,7)
      		PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      		new ConstantValue(body, var__virtual_1_, 7);
      		new TypeConstraint(body, new FlatTuple(var_square), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Square")));
      		PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
      		new TypeConstraint(body, new FlatTuple(var_square, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/chessdiagram", "Square", "id")));
      		new Equality(body, var__virtual_2_, var__virtual_1_);
      		// 	find pieceOnSquare(square, rook)
      		new PositivePatternCall(body, new FlatTuple(var_square, var_rook), PieceOnSquareQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	find movesEast(kingSquare, _, square)
      		new PositivePatternCall(body, new FlatTuple(var_kingSquare, var___0_, var_square), MovesEastQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	Rook.firstMove(rook, firstRookMove)
      		new TypeConstraint(body, new FlatTuple(var_rook), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Rook")));
      		PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
      		new TypeConstraint(body, new FlatTuple(var_rook, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/chessdiagram", "Rook", "firstMove")));
      		new Equality(body, var__virtual_3_, var_firstRookMove);
      		// 	check(firstRookMove == true)
      		new ExpressionEvaluation(body, new IExpressionEvaluator() {
      		                            
      		                            @Override
      		                            public String getShortDescription() {
      		                                return "Expression evaluation from pattern kingMoves";
      		                            }
      		
      		                            @Override
      		                            public Iterable<String> getInputParameterNames() {
      		                                return Arrays.asList("firstRookMove");
      		                            }
      		
      		                            @Override
      		                            public Object evaluateExpression(IValueProvider provider) throws Exception {
      		                                    java.lang.Boolean firstRookMove = (java.lang.Boolean) provider.getValue("firstRookMove");
      		                                    return evaluateExpression_20_2(firstRookMove);
      		                                }
      		
      		                        },  null); // 	Chess.square(chess,square)
      		new TypeConstraint(body, new FlatTuple(var_chess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Chess")));
      		PVariable var__virtual_4_ = body.getOrCreateVariableByName(".virtual{4}");
      		new TypeConstraint(body, new FlatTuple(var_chess, var__virtual_4_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/chessdiagram", "Chess", "square")));
      		new Equality(body, var__virtual_4_, var_square);
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
  
  private static boolean evaluateExpression_17_1(final Boolean firsMoveKing) {
    return ((firsMoveKing).booleanValue() == true);
  }
  
  private static boolean evaluateExpression_17_2(final Boolean firstRookMove) {
    return ((firstRookMove).booleanValue() == true);
  }
  
  private static boolean evaluateExpression_18_1(final Boolean firsMoveKing) {
    return ((firsMoveKing).booleanValue() == true);
  }
  
  private static boolean evaluateExpression_18_2(final Boolean firstRookMove) {
    return ((firstRookMove).booleanValue() == true);
  }
  
  private static boolean evaluateExpression_19_1(final Boolean firsMoveKing) {
    return ((firsMoveKing).booleanValue() == true);
  }
  
  private static boolean evaluateExpression_19_2(final Boolean firstRookMove) {
    return ((firstRookMove).booleanValue() == true);
  }
  
  private static boolean evaluateExpression_20_1(final Boolean firsMoveKing) {
    return ((firsMoveKing).booleanValue() == true);
  }
  
  private static boolean evaluateExpression_20_2(final Boolean firstRookMove) {
    return ((firstRookMove).booleanValue() == true);
  }
}
