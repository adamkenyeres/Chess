package chess.queries.util;

import chess.queries.HorizontalRookMovesMatch;
import chess.queries.HorizontalRookMovesMatcher;
import chess.queries.util.CanAttackQuerySpecification;
import chess.queries.util.MovesEastQuerySpecification;
import chess.queries.util.MovesWestQuerySpecification;
import chess.queries.util.PieceOnSquareQuerySpecification;
import chess.queries.util.PieceOnSquareeQuerySpecification;
import chess.queries.util.SquareQuerySpecification;
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
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.NegativePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.viatra.query.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate HorizontalRookMovesMatcher in a type-safe way.
 * 
 * @see HorizontalRookMovesMatcher
 * @see HorizontalRookMovesMatch
 * 
 */
@SuppressWarnings("all")
public final class HorizontalRookMovesQuerySpecification extends BaseGeneratedEMFQuerySpecification<HorizontalRookMovesMatcher> {
  private HorizontalRookMovesQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryException if the pattern definition could not be loaded
   * 
   */
  public static HorizontalRookMovesQuerySpecification instance() throws ViatraQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected HorizontalRookMovesMatcher instantiate(final ViatraQueryEngine engine) throws ViatraQueryException {
    return HorizontalRookMovesMatcher.on(engine);
  }
  
  @Override
  public HorizontalRookMovesMatch newEmptyMatch() {
    return HorizontalRookMovesMatch.newEmptyMatch();
  }
  
  @Override
  public HorizontalRookMovesMatch newMatch(final Object... parameters) {
    return HorizontalRookMovesMatch.newMatch((chessdiagram.Piece) parameters[0], (chessdiagram.Square) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link HorizontalRookMovesQuerySpecification} to be created 
   * 	<b>not</b> at the class load time of the outer class, 
   * 	but rather at the first call to {@link HorizontalRookMovesQuerySpecification#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static HorizontalRookMovesQuerySpecification INSTANCE = new HorizontalRookMovesQuerySpecification();
    
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
    private final static HorizontalRookMovesQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "chess.queries.horizontalRookMoves";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("rook","square");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(
      			 new PParameter("rook", "chessdiagram.Piece", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://example.com/chessdiagram", "Piece"))),
      			 new PParameter("square", "chessdiagram.Square", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://example.com/chessdiagram", "Square")))
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
      		PVariable var_rookSquare = body.getOrCreateVariableByName("rookSquare");
      		PVariable var__sq = body.getOrCreateVariableByName("_sq");
      		new TypeConstraint(body, new FlatTuple(var_rook), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Piece")));
      		new TypeConstraint(body, new FlatTuple(var_square), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Square")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_rook, "rook"),
      		   new ExportedParameter(body, var_square, "square")
      		));
      		// 	find square(rook, rookSquare)
      		new PositivePatternCall(body, new FlatTuple(var_rook, var_rookSquare), SquareQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	find movesEast(rookSquare,_sq, square)
      		new PositivePatternCall(body, new FlatTuple(var_rookSquare, var__sq, var_square), MovesEastQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	neg find pieceOnSquaree(square)
      		new NegativePatternCall(body, new FlatTuple(var_square), PieceOnSquareeQuerySpecification.instance().getInternalQueryRepresentation());
      		bodies.add(body);
      	}
      	{
      		PBody body = new PBody(this);
      		PVariable var_rook = body.getOrCreateVariableByName("rook");
      		PVariable var_square = body.getOrCreateVariableByName("square");
      		PVariable var_rookSquare = body.getOrCreateVariableByName("rookSquare");
      		PVariable var__sq = body.getOrCreateVariableByName("_sq");
      		PVariable var_piece = body.getOrCreateVariableByName("piece");
      		new TypeConstraint(body, new FlatTuple(var_rook), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Piece")));
      		new TypeConstraint(body, new FlatTuple(var_square), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Square")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_rook, "rook"),
      		   new ExportedParameter(body, var_square, "square")
      		));
      		// 	find square(rook, rookSquare)
      		new PositivePatternCall(body, new FlatTuple(var_rook, var_rookSquare), SquareQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	find movesEast(rookSquare,_sq, square)
      		new PositivePatternCall(body, new FlatTuple(var_rookSquare, var__sq, var_square), MovesEastQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	find pieceOnSquare(square, piece)
      		new PositivePatternCall(body, new FlatTuple(var_square, var_piece), PieceOnSquareQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	find canAttack(rook, piece)
      		new PositivePatternCall(body, new FlatTuple(var_rook, var_piece), CanAttackQuerySpecification.instance().getInternalQueryRepresentation());
      		bodies.add(body);
      	}
      	{
      		PBody body = new PBody(this);
      		PVariable var_rook = body.getOrCreateVariableByName("rook");
      		PVariable var_square = body.getOrCreateVariableByName("square");
      		PVariable var_rookSquare = body.getOrCreateVariableByName("rookSquare");
      		PVariable var__sq = body.getOrCreateVariableByName("_sq");
      		new TypeConstraint(body, new FlatTuple(var_rook), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Piece")));
      		new TypeConstraint(body, new FlatTuple(var_square), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Square")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_rook, "rook"),
      		   new ExportedParameter(body, var_square, "square")
      		));
      		// 	find square(rook, rookSquare)
      		new PositivePatternCall(body, new FlatTuple(var_rook, var_rookSquare), SquareQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	find movesWest(rookSquare,_sq, square)
      		new PositivePatternCall(body, new FlatTuple(var_rookSquare, var__sq, var_square), MovesWestQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	neg find pieceOnSquaree(square)
      		new NegativePatternCall(body, new FlatTuple(var_square), PieceOnSquareeQuerySpecification.instance().getInternalQueryRepresentation());
      		bodies.add(body);
      	}
      	{
      		PBody body = new PBody(this);
      		PVariable var_rook = body.getOrCreateVariableByName("rook");
      		PVariable var_square = body.getOrCreateVariableByName("square");
      		PVariable var_rookSquare = body.getOrCreateVariableByName("rookSquare");
      		PVariable var__sq = body.getOrCreateVariableByName("_sq");
      		PVariable var_piece = body.getOrCreateVariableByName("piece");
      		new TypeConstraint(body, new FlatTuple(var_rook), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Piece")));
      		new TypeConstraint(body, new FlatTuple(var_square), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Square")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_rook, "rook"),
      		   new ExportedParameter(body, var_square, "square")
      		));
      		// 	find square(rook, rookSquare)
      		new PositivePatternCall(body, new FlatTuple(var_rook, var_rookSquare), SquareQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	find movesWest(rookSquare,_sq, square)
      		new PositivePatternCall(body, new FlatTuple(var_rookSquare, var__sq, var_square), MovesWestQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	find pieceOnSquare(square, piece)
      		new PositivePatternCall(body, new FlatTuple(var_square, var_piece), PieceOnSquareQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	find canAttack(rook, piece)
      		new PositivePatternCall(body, new FlatTuple(var_rook, var_piece), CanAttackQuerySpecification.instance().getInternalQueryRepresentation());
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
