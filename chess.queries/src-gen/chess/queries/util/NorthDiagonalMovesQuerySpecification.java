package chess.queries.util;

import chess.queries.NorthDiagonalMovesMatch;
import chess.queries.NorthDiagonalMovesMatcher;
import chess.queries.util.CanAttackQuerySpecification;
import chess.queries.util.MovesNorthEastQuerySpecification;
import chess.queries.util.MovesNorthWestQuerySpecification;
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
 * A pattern-specific query specification that can instantiate NorthDiagonalMovesMatcher in a type-safe way.
 * 
 * @see NorthDiagonalMovesMatcher
 * @see NorthDiagonalMovesMatch
 * 
 */
@SuppressWarnings("all")
public final class NorthDiagonalMovesQuerySpecification extends BaseGeneratedEMFQuerySpecification<NorthDiagonalMovesMatcher> {
  private NorthDiagonalMovesQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryException if the pattern definition could not be loaded
   * 
   */
  public static NorthDiagonalMovesQuerySpecification instance() throws ViatraQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected NorthDiagonalMovesMatcher instantiate(final ViatraQueryEngine engine) throws ViatraQueryException {
    return NorthDiagonalMovesMatcher.on(engine);
  }
  
  @Override
  public NorthDiagonalMovesMatch newEmptyMatch() {
    return NorthDiagonalMovesMatch.newEmptyMatch();
  }
  
  @Override
  public NorthDiagonalMovesMatch newMatch(final Object... parameters) {
    return NorthDiagonalMovesMatch.newMatch((chessdiagram.Piece) parameters[0], (chessdiagram.Square) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link NorthDiagonalMovesQuerySpecification} to be created 
   * 	<b>not</b> at the class load time of the outer class, 
   * 	but rather at the first call to {@link NorthDiagonalMovesQuerySpecification#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static NorthDiagonalMovesQuerySpecification INSTANCE = new NorthDiagonalMovesQuerySpecification();
    
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
    private final static NorthDiagonalMovesQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "chess.queries.northDiagonalMoves";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("bishop","square");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(
      			 new PParameter("bishop", "chessdiagram.Piece", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://example.com/chessdiagram", "Piece"))),
      			 new PParameter("square", "chessdiagram.Square", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://example.com/chessdiagram", "Square")))
      			);
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_bishop = body.getOrCreateVariableByName("bishop");
      		PVariable var_square = body.getOrCreateVariableByName("square");
      		PVariable var_bishopSquare = body.getOrCreateVariableByName("bishopSquare");
      		PVariable var__sq = body.getOrCreateVariableByName("_sq");
      		new TypeConstraint(body, new FlatTuple(var_bishop), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Piece")));
      		new TypeConstraint(body, new FlatTuple(var_square), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Square")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_bishop, "bishop"),
      		   new ExportedParameter(body, var_square, "square")
      		));
      		// 	find square(bishop, bishopSquare)
      		new PositivePatternCall(body, new FlatTuple(var_bishop, var_bishopSquare), SquareQuerySpecification.instance().getInternalQueryRepresentation());
      		//  //NorthEst moves	find movesNorthEast(bishopSquare, _sq, square)
      		new PositivePatternCall(body, new FlatTuple(var_bishopSquare, var__sq, var_square), MovesNorthEastQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	neg find pieceOnSquaree(square)
      		new NegativePatternCall(body, new FlatTuple(var_square), PieceOnSquareeQuerySpecification.instance().getInternalQueryRepresentation());
      		bodies.add(body);
      	}
      	{
      		PBody body = new PBody(this);
      		PVariable var_bishop = body.getOrCreateVariableByName("bishop");
      		PVariable var_square = body.getOrCreateVariableByName("square");
      		PVariable var_bishopSquare = body.getOrCreateVariableByName("bishopSquare");
      		PVariable var__sq = body.getOrCreateVariableByName("_sq");
      		PVariable var_piece = body.getOrCreateVariableByName("piece");
      		new TypeConstraint(body, new FlatTuple(var_bishop), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Piece")));
      		new TypeConstraint(body, new FlatTuple(var_square), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Square")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_bishop, "bishop"),
      		   new ExportedParameter(body, var_square, "square")
      		));
      		// 	find square(bishop, bishopSquare)
      		new PositivePatternCall(body, new FlatTuple(var_bishop, var_bishopSquare), SquareQuerySpecification.instance().getInternalQueryRepresentation());
      		//  //NorthEst moves	find movesNorthEast(bishopSquare, _sq, square)
      		new PositivePatternCall(body, new FlatTuple(var_bishopSquare, var__sq, var_square), MovesNorthEastQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	find pieceOnSquaree(square)
      		new PositivePatternCall(body, new FlatTuple(var_square), PieceOnSquareeQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	find pieceOnSquare(square, piece)
      		new PositivePatternCall(body, new FlatTuple(var_square, var_piece), PieceOnSquareQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	find canAttack(bishop, piece)
      		new PositivePatternCall(body, new FlatTuple(var_bishop, var_piece), CanAttackQuerySpecification.instance().getInternalQueryRepresentation());
      		bodies.add(body);
      	}
      	{
      		PBody body = new PBody(this);
      		PVariable var_bishop = body.getOrCreateVariableByName("bishop");
      		PVariable var_square = body.getOrCreateVariableByName("square");
      		PVariable var_bishopSquare = body.getOrCreateVariableByName("bishopSquare");
      		PVariable var__sq = body.getOrCreateVariableByName("_sq");
      		new TypeConstraint(body, new FlatTuple(var_bishop), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Piece")));
      		new TypeConstraint(body, new FlatTuple(var_square), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Square")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_bishop, "bishop"),
      		   new ExportedParameter(body, var_square, "square")
      		));
      		// 	find square(bishop, bishopSquare)
      		new PositivePatternCall(body, new FlatTuple(var_bishop, var_bishopSquare), SquareQuerySpecification.instance().getInternalQueryRepresentation());
      		//  //NorthWest moves	find movesNorthWest(bishopSquare, _sq, square)
      		new PositivePatternCall(body, new FlatTuple(var_bishopSquare, var__sq, var_square), MovesNorthWestQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	neg find pieceOnSquaree(square)
      		new NegativePatternCall(body, new FlatTuple(var_square), PieceOnSquareeQuerySpecification.instance().getInternalQueryRepresentation());
      		bodies.add(body);
      	}
      	{
      		PBody body = new PBody(this);
      		PVariable var_bishop = body.getOrCreateVariableByName("bishop");
      		PVariable var_square = body.getOrCreateVariableByName("square");
      		PVariable var_bishopSquare = body.getOrCreateVariableByName("bishopSquare");
      		PVariable var__sq = body.getOrCreateVariableByName("_sq");
      		PVariable var_piece = body.getOrCreateVariableByName("piece");
      		new TypeConstraint(body, new FlatTuple(var_bishop), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Piece")));
      		new TypeConstraint(body, new FlatTuple(var_square), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Square")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_bishop, "bishop"),
      		   new ExportedParameter(body, var_square, "square")
      		));
      		// 	find square(bishop, bishopSquare)
      		new PositivePatternCall(body, new FlatTuple(var_bishop, var_bishopSquare), SquareQuerySpecification.instance().getInternalQueryRepresentation());
      		//  //NorthEst moves	find movesNorthWest(bishopSquare, _sq, square)
      		new PositivePatternCall(body, new FlatTuple(var_bishopSquare, var__sq, var_square), MovesNorthWestQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	find pieceOnSquaree(square)
      		new PositivePatternCall(body, new FlatTuple(var_square), PieceOnSquareeQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	find pieceOnSquare(square, piece)
      		new PositivePatternCall(body, new FlatTuple(var_square, var_piece), PieceOnSquareQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	find canAttack(bishop, piece)
      		new PositivePatternCall(body, new FlatTuple(var_bishop, var_piece), CanAttackQuerySpecification.instance().getInternalQueryRepresentation());
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
