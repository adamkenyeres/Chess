package chess.queries.util;

import chess.queries.WhitePawnMovesMatch;
import chess.queries.WhitePawnMovesMatcher;
import chess.queries.util.CanAttackQuerySpecification;
import chess.queries.util.EQuerySpecification;
import chess.queries.util.NEQuerySpecification;
import chess.queries.util.NQuerySpecification;
import chess.queries.util.NWQuerySpecification;
import chess.queries.util.PieceOnSquareQuerySpecification;
import chess.queries.util.PieceOnSquareeQuerySpecification;
import chess.queries.util.SquareContainsBlackPieceQuerySpecification;
import chess.queries.util.SquareForPieceQuerySpecification;
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
 * A pattern-specific query specification that can instantiate WhitePawnMovesMatcher in a type-safe way.
 * 
 * @see WhitePawnMovesMatcher
 * @see WhitePawnMovesMatch
 * 
 */
@SuppressWarnings("all")
public final class WhitePawnMovesQuerySpecification extends BaseGeneratedEMFQuerySpecification<WhitePawnMovesMatcher> {
  private WhitePawnMovesQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryException if the pattern definition could not be loaded
   * 
   */
  public static WhitePawnMovesQuerySpecification instance() throws ViatraQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected WhitePawnMovesMatcher instantiate(final ViatraQueryEngine engine) throws ViatraQueryException {
    return WhitePawnMovesMatcher.on(engine);
  }
  
  @Override
  public WhitePawnMovesMatch newEmptyMatch() {
    return WhitePawnMovesMatch.newEmptyMatch();
  }
  
  @Override
  public WhitePawnMovesMatch newMatch(final Object... parameters) {
    return WhitePawnMovesMatch.newMatch((chessdiagram.Pawn) parameters[0], (chessdiagram.Square) parameters[1], (chessdiagram.Chess) parameters[2]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link WhitePawnMovesQuerySpecification} to be created 
   * 	<b>not</b> at the class load time of the outer class, 
   * 	but rather at the first call to {@link WhitePawnMovesQuerySpecification#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static WhitePawnMovesQuerySpecification INSTANCE = new WhitePawnMovesQuerySpecification();
    
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
    private final static WhitePawnMovesQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "chess.queries.whitePawnMoves";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("piece","square","chess");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(
      			 new PParameter("piece", "chessdiagram.Pawn", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://example.com/chessdiagram", "Pawn"))),
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
      		PVariable var_piece = body.getOrCreateVariableByName("piece");
      		PVariable var_square = body.getOrCreateVariableByName("square");
      		PVariable var_chess = body.getOrCreateVariableByName("chess");
      		PVariable var_squarePiece = body.getOrCreateVariableByName("squarePiece");
      		PVariable var_boolTurn = body.getOrCreateVariableByName("boolTurn");
      		new TypeConstraint(body, new FlatTuple(var_piece), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Pawn")));
      		new TypeConstraint(body, new FlatTuple(var_square), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Square")));
      		new TypeConstraint(body, new FlatTuple(var_chess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Chess")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_piece, "piece"),
      		   new ExportedParameter(body, var_square, "square"),
      		   new ExportedParameter(body, var_chess, "chess")
      		));
      		// 	Pawn.colour(piece, ::White)
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new ConstantValue(body, var__virtual_0_, getEnumLiteral("http://example.com/chessdiagram", "Colour", "White").getInstance());
      		new TypeConstraint(body, new FlatTuple(var_piece), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Pawn")));
      		PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      		new TypeConstraint(body, new FlatTuple(var_piece, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/chessdiagram", "Piece", "colour")));
      		new Equality(body, var__virtual_1_, var__virtual_0_);
      		// 	find squareForPiece(piece, squarePiece)
      		new PositivePatternCall(body, new FlatTuple(var_piece, var_squarePiece), SquareForPieceQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	find N(squarePiece, square)
      		new PositivePatternCall(body, new FlatTuple(var_squarePiece, var_square), NQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	neg find pieceOnSquaree(square)
      		new NegativePatternCall(body, new FlatTuple(var_square), PieceOnSquareeQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	Chess.whitePlayerTurn(chess, boolTurn)
      		new TypeConstraint(body, new FlatTuple(var_chess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Chess")));
      		PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
      		new TypeConstraint(body, new FlatTuple(var_chess, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/chessdiagram", "Chess", "whitePlayerTurn")));
      		new Equality(body, var__virtual_2_, var_boolTurn);
      		// 	check(boolTurn == true)
      		new ExpressionEvaluation(body, new IExpressionEvaluator() {
      		                            
      		                            @Override
      		                            public String getShortDescription() {
      		                                return "Expression evaluation from pattern whitePawnMoves";
      		                            }
      		
      		                            @Override
      		                            public Iterable<String> getInputParameterNames() {
      		                                return Arrays.asList("boolTurn");
      		                            }
      		
      		                            @Override
      		                            public Object evaluateExpression(IValueProvider provider) throws Exception {
      		                                    java.lang.Boolean boolTurn = (java.lang.Boolean) provider.getValue("boolTurn");
      		                                    return evaluateExpression_1_1(boolTurn);
      		                                }
      		
      		                        },  null); 
      		bodies.add(body);
      	}
      	{
      		PBody body = new PBody(this);
      		PVariable var_piece = body.getOrCreateVariableByName("piece");
      		PVariable var_square = body.getOrCreateVariableByName("square");
      		PVariable var_chess = body.getOrCreateVariableByName("chess");
      		PVariable var_squarePiece = body.getOrCreateVariableByName("squarePiece");
      		PVariable var_squareNorth = body.getOrCreateVariableByName("squareNorth");
      		PVariable var_bool = body.getOrCreateVariableByName("bool");
      		PVariable var_boolTurn = body.getOrCreateVariableByName("boolTurn");
      		new TypeConstraint(body, new FlatTuple(var_piece), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Pawn")));
      		new TypeConstraint(body, new FlatTuple(var_square), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Square")));
      		new TypeConstraint(body, new FlatTuple(var_chess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Chess")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_piece, "piece"),
      		   new ExportedParameter(body, var_square, "square"),
      		   new ExportedParameter(body, var_chess, "chess")
      		));
      		// 	Pawn.colour(piece, ::White)
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new ConstantValue(body, var__virtual_0_, getEnumLiteral("http://example.com/chessdiagram", "Colour", "White").getInstance());
      		new TypeConstraint(body, new FlatTuple(var_piece), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Pawn")));
      		PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      		new TypeConstraint(body, new FlatTuple(var_piece, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/chessdiagram", "Piece", "colour")));
      		new Equality(body, var__virtual_1_, var__virtual_0_);
      		//  //Two steps	find squareForPiece(piece, squarePiece)
      		new PositivePatternCall(body, new FlatTuple(var_piece, var_squarePiece), SquareForPieceQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	find N(squarePiece, squareNorth)
      		new PositivePatternCall(body, new FlatTuple(var_squarePiece, var_squareNorth), NQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	find N(squareNorth, square)
      		new PositivePatternCall(body, new FlatTuple(var_squareNorth, var_square), NQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	neg find pieceOnSquaree(squareNorth)
      		new NegativePatternCall(body, new FlatTuple(var_squareNorth), PieceOnSquareeQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	neg find pieceOnSquaree(square)
      		new NegativePatternCall(body, new FlatTuple(var_square), PieceOnSquareeQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	Pawn.firstMove(piece, bool)
      		new TypeConstraint(body, new FlatTuple(var_piece), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Pawn")));
      		PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
      		new TypeConstraint(body, new FlatTuple(var_piece, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/chessdiagram", "Pawn", "firstMove")));
      		new Equality(body, var__virtual_2_, var_bool);
      		// 	check(bool == true)
      		new ExpressionEvaluation(body, new IExpressionEvaluator() {
      		                            
      		                            @Override
      		                            public String getShortDescription() {
      		                                return "Expression evaluation from pattern whitePawnMoves";
      		                            }
      		
      		                            @Override
      		                            public Iterable<String> getInputParameterNames() {
      		                                return Arrays.asList("bool");
      		                            }
      		
      		                            @Override
      		                            public Object evaluateExpression(IValueProvider provider) throws Exception {
      		                                    java.lang.Boolean bool = (java.lang.Boolean) provider.getValue("bool");
      		                                    return evaluateExpression_2_1(bool);
      		                                }
      		
      		                        },  null); // 	Chess.whitePlayerTurn(chess, boolTurn)
      		new TypeConstraint(body, new FlatTuple(var_chess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Chess")));
      		PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
      		new TypeConstraint(body, new FlatTuple(var_chess, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/chessdiagram", "Chess", "whitePlayerTurn")));
      		new Equality(body, var__virtual_3_, var_boolTurn);
      		// 	check(boolTurn == true)
      		new ExpressionEvaluation(body, new IExpressionEvaluator() {
      		                            
      		                            @Override
      		                            public String getShortDescription() {
      		                                return "Expression evaluation from pattern whitePawnMoves";
      		                            }
      		
      		                            @Override
      		                            public Iterable<String> getInputParameterNames() {
      		                                return Arrays.asList("boolTurn");
      		                            }
      		
      		                            @Override
      		                            public Object evaluateExpression(IValueProvider provider) throws Exception {
      		                                    java.lang.Boolean boolTurn = (java.lang.Boolean) provider.getValue("boolTurn");
      		                                    return evaluateExpression_2_2(boolTurn);
      		                                }
      		
      		                        },  null); 
      		bodies.add(body);
      	}
      	{
      		PBody body = new PBody(this);
      		PVariable var_piece = body.getOrCreateVariableByName("piece");
      		PVariable var_square = body.getOrCreateVariableByName("square");
      		PVariable var_chess = body.getOrCreateVariableByName("chess");
      		PVariable var_squarePiece = body.getOrCreateVariableByName("squarePiece");
      		PVariable var_boolTurn = body.getOrCreateVariableByName("boolTurn");
      		new TypeConstraint(body, new FlatTuple(var_piece), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Pawn")));
      		new TypeConstraint(body, new FlatTuple(var_square), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Square")));
      		new TypeConstraint(body, new FlatTuple(var_chess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Chess")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_piece, "piece"),
      		   new ExportedParameter(body, var_square, "square"),
      		   new ExportedParameter(body, var_chess, "chess")
      		));
      		// 	Pawn.colour(piece, ::White)
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new ConstantValue(body, var__virtual_0_, getEnumLiteral("http://example.com/chessdiagram", "Colour", "White").getInstance());
      		new TypeConstraint(body, new FlatTuple(var_piece), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Pawn")));
      		PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      		new TypeConstraint(body, new FlatTuple(var_piece, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/chessdiagram", "Piece", "colour")));
      		new Equality(body, var__virtual_1_, var__virtual_0_);
      		// 	find squareForPiece(piece, squarePiece)
      		new PositivePatternCall(body, new FlatTuple(var_piece, var_squarePiece), SquareForPieceQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	find NW(squarePiece, square)
      		new PositivePatternCall(body, new FlatTuple(var_squarePiece, var_square), NWQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	find squareContainsBlackPiece(square)
      		new PositivePatternCall(body, new FlatTuple(var_square), SquareContainsBlackPieceQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	Chess.whitePlayerTurn(chess, boolTurn)
      		new TypeConstraint(body, new FlatTuple(var_chess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Chess")));
      		PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
      		new TypeConstraint(body, new FlatTuple(var_chess, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/chessdiagram", "Chess", "whitePlayerTurn")));
      		new Equality(body, var__virtual_2_, var_boolTurn);
      		// 	check(boolTurn == true)
      		new ExpressionEvaluation(body, new IExpressionEvaluator() {
      		                            
      		                            @Override
      		                            public String getShortDescription() {
      		                                return "Expression evaluation from pattern whitePawnMoves";
      		                            }
      		
      		                            @Override
      		                            public Iterable<String> getInputParameterNames() {
      		                                return Arrays.asList("boolTurn");
      		                            }
      		
      		                            @Override
      		                            public Object evaluateExpression(IValueProvider provider) throws Exception {
      		                                    java.lang.Boolean boolTurn = (java.lang.Boolean) provider.getValue("boolTurn");
      		                                    return evaluateExpression_3_1(boolTurn);
      		                                }
      		
      		                        },  null); 
      		bodies.add(body);
      	}
      	{
      		PBody body = new PBody(this);
      		PVariable var_piece = body.getOrCreateVariableByName("piece");
      		PVariable var_square = body.getOrCreateVariableByName("square");
      		PVariable var_chess = body.getOrCreateVariableByName("chess");
      		PVariable var_squarePiece = body.getOrCreateVariableByName("squarePiece");
      		PVariable var_boolTurn = body.getOrCreateVariableByName("boolTurn");
      		new TypeConstraint(body, new FlatTuple(var_piece), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Pawn")));
      		new TypeConstraint(body, new FlatTuple(var_square), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Square")));
      		new TypeConstraint(body, new FlatTuple(var_chess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Chess")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_piece, "piece"),
      		   new ExportedParameter(body, var_square, "square"),
      		   new ExportedParameter(body, var_chess, "chess")
      		));
      		// 	Pawn.colour(piece, ::White)
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new ConstantValue(body, var__virtual_0_, getEnumLiteral("http://example.com/chessdiagram", "Colour", "White").getInstance());
      		new TypeConstraint(body, new FlatTuple(var_piece), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Pawn")));
      		PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      		new TypeConstraint(body, new FlatTuple(var_piece, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/chessdiagram", "Piece", "colour")));
      		new Equality(body, var__virtual_1_, var__virtual_0_);
      		// 	find squareForPiece(piece, squarePiece)
      		new PositivePatternCall(body, new FlatTuple(var_piece, var_squarePiece), SquareForPieceQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	find NE(squarePiece, square)
      		new PositivePatternCall(body, new FlatTuple(var_squarePiece, var_square), NEQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	find squareContainsBlackPiece(square)
      		new PositivePatternCall(body, new FlatTuple(var_square), SquareContainsBlackPieceQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	Chess.whitePlayerTurn(chess, boolTurn)
      		new TypeConstraint(body, new FlatTuple(var_chess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Chess")));
      		PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
      		new TypeConstraint(body, new FlatTuple(var_chess, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/chessdiagram", "Chess", "whitePlayerTurn")));
      		new Equality(body, var__virtual_2_, var_boolTurn);
      		// 	check(boolTurn == true)
      		new ExpressionEvaluation(body, new IExpressionEvaluator() {
      		                            
      		                            @Override
      		                            public String getShortDescription() {
      		                                return "Expression evaluation from pattern whitePawnMoves";
      		                            }
      		
      		                            @Override
      		                            public Iterable<String> getInputParameterNames() {
      		                                return Arrays.asList("boolTurn");
      		                            }
      		
      		                            @Override
      		                            public Object evaluateExpression(IValueProvider provider) throws Exception {
      		                                    java.lang.Boolean boolTurn = (java.lang.Boolean) provider.getValue("boolTurn");
      		                                    return evaluateExpression_4_1(boolTurn);
      		                                }
      		
      		                        },  null); 
      		bodies.add(body);
      	}
      	{
      		PBody body = new PBody(this);
      		PVariable var_piece = body.getOrCreateVariableByName("piece");
      		PVariable var_square = body.getOrCreateVariableByName("square");
      		PVariable var_chess = body.getOrCreateVariableByName("chess");
      		PVariable var_pieceSquare = body.getOrCreateVariableByName("pieceSquare");
      		PVariable var_atackingSquare = body.getOrCreateVariableByName("atackingSquare");
      		PVariable var_atackingPawn = body.getOrCreateVariableByName("atackingPawn");
      		PVariable var_bool = body.getOrCreateVariableByName("bool");
      		PVariable var_boolTurn = body.getOrCreateVariableByName("boolTurn");
      		new TypeConstraint(body, new FlatTuple(var_piece), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Pawn")));
      		new TypeConstraint(body, new FlatTuple(var_square), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Square")));
      		new TypeConstraint(body, new FlatTuple(var_chess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Chess")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_piece, "piece"),
      		   new ExportedParameter(body, var_square, "square"),
      		   new ExportedParameter(body, var_chess, "chess")
      		));
      		// 	Pawn.colour(piece, ::White)
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new ConstantValue(body, var__virtual_0_, getEnumLiteral("http://example.com/chessdiagram", "Colour", "White").getInstance());
      		new TypeConstraint(body, new FlatTuple(var_piece), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Pawn")));
      		PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      		new TypeConstraint(body, new FlatTuple(var_piece, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/chessdiagram", "Piece", "colour")));
      		new Equality(body, var__virtual_1_, var__virtual_0_);
      		// 	find squareForPiece(piece, pieceSquare)
      		new PositivePatternCall(body, new FlatTuple(var_piece, var_pieceSquare), SquareForPieceQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	find W(pieceSquare, atackingSquare)
      		new PositivePatternCall(body, new FlatTuple(var_pieceSquare, var_atackingSquare), WQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	find pieceOnSquare(atackingSquare, atackingPawn)
      		new PositivePatternCall(body, new FlatTuple(var_atackingSquare, var_atackingPawn), PieceOnSquareQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	find canAttack(piece, atackingPawn)
      		new PositivePatternCall(body, new FlatTuple(var_piece, var_atackingPawn), CanAttackQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	Pawn.enPassantEnabled(atackingPawn, bool)
      		new TypeConstraint(body, new FlatTuple(var_atackingPawn), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Pawn")));
      		PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
      		new TypeConstraint(body, new FlatTuple(var_atackingPawn, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/chessdiagram", "Pawn", "enPassantEnabled")));
      		new Equality(body, var__virtual_2_, var_bool);
      		// 	check(bool == true)
      		new ExpressionEvaluation(body, new IExpressionEvaluator() {
      		                            
      		                            @Override
      		                            public String getShortDescription() {
      		                                return "Expression evaluation from pattern whitePawnMoves";
      		                            }
      		
      		                            @Override
      		                            public Iterable<String> getInputParameterNames() {
      		                                return Arrays.asList("bool");
      		                            }
      		
      		                            @Override
      		                            public Object evaluateExpression(IValueProvider provider) throws Exception {
      		                                    java.lang.Boolean bool = (java.lang.Boolean) provider.getValue("bool");
      		                                    return evaluateExpression_5_1(bool);
      		                                }
      		
      		                        },  null); // 	find N(atackingSquare, square)
      		new PositivePatternCall(body, new FlatTuple(var_atackingSquare, var_square), NQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	Chess.whitePlayerTurn(chess, boolTurn)
      		new TypeConstraint(body, new FlatTuple(var_chess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Chess")));
      		PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
      		new TypeConstraint(body, new FlatTuple(var_chess, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/chessdiagram", "Chess", "whitePlayerTurn")));
      		new Equality(body, var__virtual_3_, var_boolTurn);
      		// 	check(boolTurn == true)
      		new ExpressionEvaluation(body, new IExpressionEvaluator() {
      		                            
      		                            @Override
      		                            public String getShortDescription() {
      		                                return "Expression evaluation from pattern whitePawnMoves";
      		                            }
      		
      		                            @Override
      		                            public Iterable<String> getInputParameterNames() {
      		                                return Arrays.asList("boolTurn");
      		                            }
      		
      		                            @Override
      		                            public Object evaluateExpression(IValueProvider provider) throws Exception {
      		                                    java.lang.Boolean boolTurn = (java.lang.Boolean) provider.getValue("boolTurn");
      		                                    return evaluateExpression_5_2(boolTurn);
      		                                }
      		
      		                        },  null); 
      		bodies.add(body);
      	}
      	{
      		PBody body = new PBody(this);
      		PVariable var_piece = body.getOrCreateVariableByName("piece");
      		PVariable var_square = body.getOrCreateVariableByName("square");
      		PVariable var_chess = body.getOrCreateVariableByName("chess");
      		PVariable var_pieceSquare = body.getOrCreateVariableByName("pieceSquare");
      		PVariable var_atackingSquare = body.getOrCreateVariableByName("atackingSquare");
      		PVariable var_atackingPawn = body.getOrCreateVariableByName("atackingPawn");
      		PVariable var_bool = body.getOrCreateVariableByName("bool");
      		PVariable var_boolTurn = body.getOrCreateVariableByName("boolTurn");
      		new TypeConstraint(body, new FlatTuple(var_piece), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Pawn")));
      		new TypeConstraint(body, new FlatTuple(var_square), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Square")));
      		new TypeConstraint(body, new FlatTuple(var_chess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Chess")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_piece, "piece"),
      		   new ExportedParameter(body, var_square, "square"),
      		   new ExportedParameter(body, var_chess, "chess")
      		));
      		// 	Pawn.colour(piece, ::White)
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new ConstantValue(body, var__virtual_0_, getEnumLiteral("http://example.com/chessdiagram", "Colour", "White").getInstance());
      		new TypeConstraint(body, new FlatTuple(var_piece), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Pawn")));
      		PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      		new TypeConstraint(body, new FlatTuple(var_piece, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/chessdiagram", "Piece", "colour")));
      		new Equality(body, var__virtual_1_, var__virtual_0_);
      		// 	find squareForPiece(piece, pieceSquare)
      		new PositivePatternCall(body, new FlatTuple(var_piece, var_pieceSquare), SquareForPieceQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	find E(pieceSquare, atackingSquare)
      		new PositivePatternCall(body, new FlatTuple(var_pieceSquare, var_atackingSquare), EQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	find pieceOnSquare(atackingSquare, atackingPawn)
      		new PositivePatternCall(body, new FlatTuple(var_atackingSquare, var_atackingPawn), PieceOnSquareQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	find canAttack(piece, atackingPawn)
      		new PositivePatternCall(body, new FlatTuple(var_piece, var_atackingPawn), CanAttackQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	Pawn.enPassantEnabled(atackingPawn, bool)
      		new TypeConstraint(body, new FlatTuple(var_atackingPawn), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Pawn")));
      		PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
      		new TypeConstraint(body, new FlatTuple(var_atackingPawn, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/chessdiagram", "Pawn", "enPassantEnabled")));
      		new Equality(body, var__virtual_2_, var_bool);
      		// 	check(bool == true)
      		new ExpressionEvaluation(body, new IExpressionEvaluator() {
      		                            
      		                            @Override
      		                            public String getShortDescription() {
      		                                return "Expression evaluation from pattern whitePawnMoves";
      		                            }
      		
      		                            @Override
      		                            public Iterable<String> getInputParameterNames() {
      		                                return Arrays.asList("bool");
      		                            }
      		
      		                            @Override
      		                            public Object evaluateExpression(IValueProvider provider) throws Exception {
      		                                    java.lang.Boolean bool = (java.lang.Boolean) provider.getValue("bool");
      		                                    return evaluateExpression_6_1(bool);
      		                                }
      		
      		                        },  null); // 	find N(atackingSquare, square)
      		new PositivePatternCall(body, new FlatTuple(var_atackingSquare, var_square), NQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	Chess.whitePlayerTurn(chess, boolTurn)
      		new TypeConstraint(body, new FlatTuple(var_chess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Chess")));
      		PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
      		new TypeConstraint(body, new FlatTuple(var_chess, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/chessdiagram", "Chess", "whitePlayerTurn")));
      		new Equality(body, var__virtual_3_, var_boolTurn);
      		// 	check(boolTurn == true)
      		new ExpressionEvaluation(body, new IExpressionEvaluator() {
      		                            
      		                            @Override
      		                            public String getShortDescription() {
      		                                return "Expression evaluation from pattern whitePawnMoves";
      		                            }
      		
      		                            @Override
      		                            public Iterable<String> getInputParameterNames() {
      		                                return Arrays.asList("boolTurn");
      		                            }
      		
      		                            @Override
      		                            public Object evaluateExpression(IValueProvider provider) throws Exception {
      		                                    java.lang.Boolean boolTurn = (java.lang.Boolean) provider.getValue("boolTurn");
      		                                    return evaluateExpression_6_2(boolTurn);
      		                                }
      		
      		                        },  null); 
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
  
  private static boolean evaluateExpression_1_1(final Boolean boolTurn) {
    return ((boolTurn).booleanValue() == true);
  }
  
  private static boolean evaluateExpression_2_1(final Boolean bool) {
    return ((bool).booleanValue() == true);
  }
  
  private static boolean evaluateExpression_2_2(final Boolean boolTurn) {
    return ((boolTurn).booleanValue() == true);
  }
  
  private static boolean evaluateExpression_3_1(final Boolean boolTurn) {
    return ((boolTurn).booleanValue() == true);
  }
  
  private static boolean evaluateExpression_4_1(final Boolean boolTurn) {
    return ((boolTurn).booleanValue() == true);
  }
  
  private static boolean evaluateExpression_5_1(final Boolean bool) {
    return ((bool).booleanValue() == true);
  }
  
  private static boolean evaluateExpression_5_2(final Boolean boolTurn) {
    return ((boolTurn).booleanValue() == true);
  }
  
  private static boolean evaluateExpression_6_1(final Boolean bool) {
    return ((bool).booleanValue() == true);
  }
  
  private static boolean evaluateExpression_6_2(final Boolean boolTurn) {
    return ((boolTurn).booleanValue() == true);
  }
}
