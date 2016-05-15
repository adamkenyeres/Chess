package chess.queries.util;

import chess.queries.BlackPawnMovesMatch;
import chess.queries.BlackPawnMovesMatcher;
import chess.queries.util.CanAttackQuerySpecification;
import chess.queries.util.EQuerySpecification;
import chess.queries.util.PieceOnSquareQuerySpecification;
import chess.queries.util.PieceOnSquareeQuerySpecification;
import chess.queries.util.SEQuerySpecification;
import chess.queries.util.SQuerySpecification;
import chess.queries.util.SWQuerySpecification;
import chess.queries.util.SquareContainsWhitePieceQuerySpecification;
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
 * A pattern-specific query specification that can instantiate BlackPawnMovesMatcher in a type-safe way.
 * 
 * @see BlackPawnMovesMatcher
 * @see BlackPawnMovesMatch
 * 
 */
@SuppressWarnings("all")
public final class BlackPawnMovesQuerySpecification extends BaseGeneratedEMFQuerySpecification<BlackPawnMovesMatcher> {
  private BlackPawnMovesQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryException if the pattern definition could not be loaded
   * 
   */
  public static BlackPawnMovesQuerySpecification instance() throws ViatraQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected BlackPawnMovesMatcher instantiate(final ViatraQueryEngine engine) throws ViatraQueryException {
    return BlackPawnMovesMatcher.on(engine);
  }
  
  @Override
  public BlackPawnMovesMatch newEmptyMatch() {
    return BlackPawnMovesMatch.newEmptyMatch();
  }
  
  @Override
  public BlackPawnMovesMatch newMatch(final Object... parameters) {
    return BlackPawnMovesMatch.newMatch((chessdiagram.Pawn) parameters[0], (chessdiagram.Square) parameters[1], (chessdiagram.Chess) parameters[2]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link BlackPawnMovesQuerySpecification} to be created 
   * 	<b>not</b> at the class load time of the outer class, 
   * 	but rather at the first call to {@link BlackPawnMovesQuerySpecification#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static BlackPawnMovesQuerySpecification INSTANCE = new BlackPawnMovesQuerySpecification();
    
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
    private final static BlackPawnMovesQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "chess.queries.blackPawnMoves";
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
      		PVariable var_boolTurn = body.getOrCreateVariableByName("boolTurn");
      		PVariable var_squarePiece = body.getOrCreateVariableByName("squarePiece");
      		new TypeConstraint(body, new FlatTuple(var_piece), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Pawn")));
      		new TypeConstraint(body, new FlatTuple(var_square), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Square")));
      		new TypeConstraint(body, new FlatTuple(var_chess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Chess")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_piece, "piece"),
      		   new ExportedParameter(body, var_square, "square"),
      		   new ExportedParameter(body, var_chess, "chess")
      		));
      		// //Stepping one ahead	Chess.whitePlayerTurn(chess, boolTurn)
      		new TypeConstraint(body, new FlatTuple(var_chess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Chess")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_chess, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/chessdiagram", "Chess", "whitePlayerTurn")));
      		new Equality(body, var__virtual_0_, var_boolTurn);
      		// 	check(boolTurn == false)
      		new ExpressionEvaluation(body, new IExpressionEvaluator() {
      		                            
      		                            @Override
      		                            public String getShortDescription() {
      		                                return "Expression evaluation from pattern blackPawnMoves";
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
      		
      		                        },  null); // 	Pawn.colour(piece, ::Black)
      		PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      		new ConstantValue(body, var__virtual_1_, getEnumLiteral("http://example.com/chessdiagram", "Colour", "Black").getInstance());
      		new TypeConstraint(body, new FlatTuple(var_piece), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Pawn")));
      		PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
      		new TypeConstraint(body, new FlatTuple(var_piece, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/chessdiagram", "Piece", "colour")));
      		new Equality(body, var__virtual_2_, var__virtual_1_);
      		// 	find squareForPiece(piece, squarePiece)
      		new PositivePatternCall(body, new FlatTuple(var_piece, var_squarePiece), SquareForPieceQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	find S(squarePiece, square)
      		new PositivePatternCall(body, new FlatTuple(var_squarePiece, var_square), SQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	neg find pieceOnSquaree(square)
      		new NegativePatternCall(body, new FlatTuple(var_square), PieceOnSquareeQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	//This is needed so there wont be isolated constraints	Chess.blackPlayer.piece(chess, piece)
      		new TypeConstraint(body, new FlatTuple(var_chess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Chess")));
      		PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
      		new TypeConstraint(body, new FlatTuple(var_chess, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/chessdiagram", "Chess", "blackPlayer")));
      		PVariable var__virtual_4_ = body.getOrCreateVariableByName(".virtual{4}");
      		new TypeConstraint(body, new FlatTuple(var__virtual_3_, var__virtual_4_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/chessdiagram", "Player", "piece")));
      		new Equality(body, var__virtual_4_, var_piece);
      		bodies.add(body);
      	}
      	{
      		PBody body = new PBody(this);
      		PVariable var_piece = body.getOrCreateVariableByName("piece");
      		PVariable var_square = body.getOrCreateVariableByName("square");
      		PVariable var_chess = body.getOrCreateVariableByName("chess");
      		PVariable var_boolTurn = body.getOrCreateVariableByName("boolTurn");
      		PVariable var_squarePiece = body.getOrCreateVariableByName("squarePiece");
      		PVariable var_squareNorth = body.getOrCreateVariableByName("squareNorth");
      		PVariable var_bool = body.getOrCreateVariableByName("bool");
      		new TypeConstraint(body, new FlatTuple(var_piece), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Pawn")));
      		new TypeConstraint(body, new FlatTuple(var_square), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Square")));
      		new TypeConstraint(body, new FlatTuple(var_chess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Chess")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_piece, "piece"),
      		   new ExportedParameter(body, var_square, "square"),
      		   new ExportedParameter(body, var_chess, "chess")
      		));
      		// 	Chess.whitePlayerTurn(chess, boolTurn)
      		new TypeConstraint(body, new FlatTuple(var_chess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Chess")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_chess, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/chessdiagram", "Chess", "whitePlayerTurn")));
      		new Equality(body, var__virtual_0_, var_boolTurn);
      		// 	check(boolTurn == false)
      		new ExpressionEvaluation(body, new IExpressionEvaluator() {
      		                            
      		                            @Override
      		                            public String getShortDescription() {
      		                                return "Expression evaluation from pattern blackPawnMoves";
      		                            }
      		
      		                            @Override
      		                            public Iterable<String> getInputParameterNames() {
      		                                return Arrays.asList("boolTurn");
      		                            }
      		
      		                            @Override
      		                            public Object evaluateExpression(IValueProvider provider) throws Exception {
      		                                    java.lang.Boolean boolTurn = (java.lang.Boolean) provider.getValue("boolTurn");
      		                                    return evaluateExpression_2_1(boolTurn);
      		                                }
      		
      		                        },  null); // 	Pawn.colour(piece, ::Black)
      		PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      		new ConstantValue(body, var__virtual_1_, getEnumLiteral("http://example.com/chessdiagram", "Colour", "Black").getInstance());
      		new TypeConstraint(body, new FlatTuple(var_piece), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Pawn")));
      		PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
      		new TypeConstraint(body, new FlatTuple(var_piece, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/chessdiagram", "Piece", "colour")));
      		new Equality(body, var__virtual_2_, var__virtual_1_);
      		//  //Two steps 	find squareForPiece(piece, squarePiece)
      		new PositivePatternCall(body, new FlatTuple(var_piece, var_squarePiece), SquareForPieceQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	find S(squarePiece, squareNorth)
      		new PositivePatternCall(body, new FlatTuple(var_squarePiece, var_squareNorth), SQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	find S(squareNorth, square)
      		new PositivePatternCall(body, new FlatTuple(var_squareNorth, var_square), SQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	neg find pieceOnSquaree(squareNorth)
      		new NegativePatternCall(body, new FlatTuple(var_squareNorth), PieceOnSquareeQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	neg find pieceOnSquaree(square)
      		new NegativePatternCall(body, new FlatTuple(var_square), PieceOnSquareeQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	Pawn.firstMove(piece, bool)
      		new TypeConstraint(body, new FlatTuple(var_piece), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Pawn")));
      		PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
      		new TypeConstraint(body, new FlatTuple(var_piece, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/chessdiagram", "Pawn", "firstMove")));
      		new Equality(body, var__virtual_3_, var_bool);
      		// 	check(bool == true)
      		new ExpressionEvaluation(body, new IExpressionEvaluator() {
      		                            
      		                            @Override
      		                            public String getShortDescription() {
      		                                return "Expression evaluation from pattern blackPawnMoves";
      		                            }
      		
      		                            @Override
      		                            public Iterable<String> getInputParameterNames() {
      		                                return Arrays.asList("bool");
      		                            }
      		
      		                            @Override
      		                            public Object evaluateExpression(IValueProvider provider) throws Exception {
      		                                    java.lang.Boolean bool = (java.lang.Boolean) provider.getValue("bool");
      		                                    return evaluateExpression_2_2(bool);
      		                                }
      		
      		                        },  null); // 	Chess.blackPlayer.piece(chess, piece)
      		new TypeConstraint(body, new FlatTuple(var_chess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Chess")));
      		PVariable var__virtual_4_ = body.getOrCreateVariableByName(".virtual{4}");
      		new TypeConstraint(body, new FlatTuple(var_chess, var__virtual_4_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/chessdiagram", "Chess", "blackPlayer")));
      		PVariable var__virtual_5_ = body.getOrCreateVariableByName(".virtual{5}");
      		new TypeConstraint(body, new FlatTuple(var__virtual_4_, var__virtual_5_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/chessdiagram", "Player", "piece")));
      		new Equality(body, var__virtual_5_, var_piece);
      		bodies.add(body);
      	}
      	{
      		PBody body = new PBody(this);
      		PVariable var_piece = body.getOrCreateVariableByName("piece");
      		PVariable var_square = body.getOrCreateVariableByName("square");
      		PVariable var_chess = body.getOrCreateVariableByName("chess");
      		PVariable var_boolTurn = body.getOrCreateVariableByName("boolTurn");
      		PVariable var_squarePiece = body.getOrCreateVariableByName("squarePiece");
      		new TypeConstraint(body, new FlatTuple(var_piece), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Pawn")));
      		new TypeConstraint(body, new FlatTuple(var_square), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Square")));
      		new TypeConstraint(body, new FlatTuple(var_chess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Chess")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_piece, "piece"),
      		   new ExportedParameter(body, var_square, "square"),
      		   new ExportedParameter(body, var_chess, "chess")
      		));
      		// 	Chess.whitePlayerTurn(chess, boolTurn)
      		new TypeConstraint(body, new FlatTuple(var_chess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Chess")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_chess, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/chessdiagram", "Chess", "whitePlayerTurn")));
      		new Equality(body, var__virtual_0_, var_boolTurn);
      		// 	check(boolTurn == false)
      		new ExpressionEvaluation(body, new IExpressionEvaluator() {
      		                            
      		                            @Override
      		                            public String getShortDescription() {
      		                                return "Expression evaluation from pattern blackPawnMoves";
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
      		
      		                        },  null); // 	Pawn.colour(piece, ::Black)
      		PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      		new ConstantValue(body, var__virtual_1_, getEnumLiteral("http://example.com/chessdiagram", "Colour", "Black").getInstance());
      		new TypeConstraint(body, new FlatTuple(var_piece), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Pawn")));
      		PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
      		new TypeConstraint(body, new FlatTuple(var_piece, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/chessdiagram", "Piece", "colour")));
      		new Equality(body, var__virtual_2_, var__virtual_1_);
      		// 	find squareForPiece(piece, squarePiece)
      		new PositivePatternCall(body, new FlatTuple(var_piece, var_squarePiece), SquareForPieceQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	find SW(squarePiece, square)
      		new PositivePatternCall(body, new FlatTuple(var_squarePiece, var_square), SWQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	find squareContainsWhitePiece(square)
      		new PositivePatternCall(body, new FlatTuple(var_square), SquareContainsWhitePieceQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	Chess.blackPlayer.piece(chess, piece)
      		new TypeConstraint(body, new FlatTuple(var_chess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Chess")));
      		PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
      		new TypeConstraint(body, new FlatTuple(var_chess, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/chessdiagram", "Chess", "blackPlayer")));
      		PVariable var__virtual_4_ = body.getOrCreateVariableByName(".virtual{4}");
      		new TypeConstraint(body, new FlatTuple(var__virtual_3_, var__virtual_4_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/chessdiagram", "Player", "piece")));
      		new Equality(body, var__virtual_4_, var_piece);
      		bodies.add(body);
      	}
      	{
      		PBody body = new PBody(this);
      		PVariable var_piece = body.getOrCreateVariableByName("piece");
      		PVariable var_square = body.getOrCreateVariableByName("square");
      		PVariable var_chess = body.getOrCreateVariableByName("chess");
      		PVariable var_boolTurn = body.getOrCreateVariableByName("boolTurn");
      		PVariable var_squarePiece = body.getOrCreateVariableByName("squarePiece");
      		new TypeConstraint(body, new FlatTuple(var_piece), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Pawn")));
      		new TypeConstraint(body, new FlatTuple(var_square), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Square")));
      		new TypeConstraint(body, new FlatTuple(var_chess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Chess")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_piece, "piece"),
      		   new ExportedParameter(body, var_square, "square"),
      		   new ExportedParameter(body, var_chess, "chess")
      		));
      		// 	Chess.whitePlayerTurn(chess, boolTurn)
      		new TypeConstraint(body, new FlatTuple(var_chess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Chess")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_chess, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/chessdiagram", "Chess", "whitePlayerTurn")));
      		new Equality(body, var__virtual_0_, var_boolTurn);
      		// 	check(boolTurn == false)
      		new ExpressionEvaluation(body, new IExpressionEvaluator() {
      		                            
      		                            @Override
      		                            public String getShortDescription() {
      		                                return "Expression evaluation from pattern blackPawnMoves";
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
      		
      		                        },  null); // 	Pawn.colour(piece, ::Black)
      		PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      		new ConstantValue(body, var__virtual_1_, getEnumLiteral("http://example.com/chessdiagram", "Colour", "Black").getInstance());
      		new TypeConstraint(body, new FlatTuple(var_piece), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Pawn")));
      		PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
      		new TypeConstraint(body, new FlatTuple(var_piece, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/chessdiagram", "Piece", "colour")));
      		new Equality(body, var__virtual_2_, var__virtual_1_);
      		// 	find squareForPiece(piece, squarePiece)
      		new PositivePatternCall(body, new FlatTuple(var_piece, var_squarePiece), SquareForPieceQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	find SE(squarePiece, square)
      		new PositivePatternCall(body, new FlatTuple(var_squarePiece, var_square), SEQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	find squareContainsWhitePiece(square)
      		new PositivePatternCall(body, new FlatTuple(var_square), SquareContainsWhitePieceQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	Chess.blackPlayer.piece(chess, piece)
      		new TypeConstraint(body, new FlatTuple(var_chess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Chess")));
      		PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
      		new TypeConstraint(body, new FlatTuple(var_chess, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/chessdiagram", "Chess", "blackPlayer")));
      		PVariable var__virtual_4_ = body.getOrCreateVariableByName(".virtual{4}");
      		new TypeConstraint(body, new FlatTuple(var__virtual_3_, var__virtual_4_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/chessdiagram", "Player", "piece")));
      		new Equality(body, var__virtual_4_, var_piece);
      		bodies.add(body);
      	}
      	{
      		PBody body = new PBody(this);
      		PVariable var_piece = body.getOrCreateVariableByName("piece");
      		PVariable var_square = body.getOrCreateVariableByName("square");
      		PVariable var_chess = body.getOrCreateVariableByName("chess");
      		PVariable var_boolTurn = body.getOrCreateVariableByName("boolTurn");
      		PVariable var_pieceSquare = body.getOrCreateVariableByName("pieceSquare");
      		PVariable var_atackingSquare = body.getOrCreateVariableByName("atackingSquare");
      		PVariable var_atackingPawn = body.getOrCreateVariableByName("atackingPawn");
      		PVariable var_bool = body.getOrCreateVariableByName("bool");
      		new TypeConstraint(body, new FlatTuple(var_piece), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Pawn")));
      		new TypeConstraint(body, new FlatTuple(var_square), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Square")));
      		new TypeConstraint(body, new FlatTuple(var_chess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Chess")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_piece, "piece"),
      		   new ExportedParameter(body, var_square, "square"),
      		   new ExportedParameter(body, var_chess, "chess")
      		));
      		// /*En passant if there is a pawn on the left to be hit */	Chess.whitePlayerTurn(chess, boolTurn)
      		new TypeConstraint(body, new FlatTuple(var_chess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Chess")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_chess, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/chessdiagram", "Chess", "whitePlayerTurn")));
      		new Equality(body, var__virtual_0_, var_boolTurn);
      		// 	check(boolTurn == false)
      		new ExpressionEvaluation(body, new IExpressionEvaluator() {
      		                            
      		                            @Override
      		                            public String getShortDescription() {
      		                                return "Expression evaluation from pattern blackPawnMoves";
      		                            }
      		
      		                            @Override
      		                            public Iterable<String> getInputParameterNames() {
      		                                return Arrays.asList("boolTurn");
      		                            }
      		
      		                            @Override
      		                            public Object evaluateExpression(IValueProvider provider) throws Exception {
      		                                    java.lang.Boolean boolTurn = (java.lang.Boolean) provider.getValue("boolTurn");
      		                                    return evaluateExpression_5_1(boolTurn);
      		                                }
      		
      		                        },  null); // 	Pawn.colour(piece, ::Black)
      		PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      		new ConstantValue(body, var__virtual_1_, getEnumLiteral("http://example.com/chessdiagram", "Colour", "Black").getInstance());
      		new TypeConstraint(body, new FlatTuple(var_piece), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Pawn")));
      		PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
      		new TypeConstraint(body, new FlatTuple(var_piece, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/chessdiagram", "Piece", "colour")));
      		new Equality(body, var__virtual_2_, var__virtual_1_);
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
      		PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
      		new TypeConstraint(body, new FlatTuple(var_atackingPawn, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/chessdiagram", "Pawn", "enPassantEnabled")));
      		new Equality(body, var__virtual_3_, var_bool);
      		// 	check(bool == true)
      		new ExpressionEvaluation(body, new IExpressionEvaluator() {
      		                            
      		                            @Override
      		                            public String getShortDescription() {
      		                                return "Expression evaluation from pattern blackPawnMoves";
      		                            }
      		
      		                            @Override
      		                            public Iterable<String> getInputParameterNames() {
      		                                return Arrays.asList("bool");
      		                            }
      		
      		                            @Override
      		                            public Object evaluateExpression(IValueProvider provider) throws Exception {
      		                                    java.lang.Boolean bool = (java.lang.Boolean) provider.getValue("bool");
      		                                    return evaluateExpression_5_2(bool);
      		                                }
      		
      		                        },  null); // 	find S(atackingSquare, square)
      		new PositivePatternCall(body, new FlatTuple(var_atackingSquare, var_square), SQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	Chess.blackPlayer.piece(chess, piece)
      		new TypeConstraint(body, new FlatTuple(var_chess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Chess")));
      		PVariable var__virtual_4_ = body.getOrCreateVariableByName(".virtual{4}");
      		new TypeConstraint(body, new FlatTuple(var_chess, var__virtual_4_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/chessdiagram", "Chess", "blackPlayer")));
      		PVariable var__virtual_5_ = body.getOrCreateVariableByName(".virtual{5}");
      		new TypeConstraint(body, new FlatTuple(var__virtual_4_, var__virtual_5_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/chessdiagram", "Player", "piece")));
      		new Equality(body, var__virtual_5_, var_piece);
      		bodies.add(body);
      	}
      	{
      		PBody body = new PBody(this);
      		PVariable var_piece = body.getOrCreateVariableByName("piece");
      		PVariable var_square = body.getOrCreateVariableByName("square");
      		PVariable var_chess = body.getOrCreateVariableByName("chess");
      		PVariable var_boolTurn = body.getOrCreateVariableByName("boolTurn");
      		PVariable var_pieceSquare = body.getOrCreateVariableByName("pieceSquare");
      		PVariable var_atackingSquare = body.getOrCreateVariableByName("atackingSquare");
      		PVariable var_atackingPawn = body.getOrCreateVariableByName("atackingPawn");
      		PVariable var_bool = body.getOrCreateVariableByName("bool");
      		new TypeConstraint(body, new FlatTuple(var_piece), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Pawn")));
      		new TypeConstraint(body, new FlatTuple(var_square), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Square")));
      		new TypeConstraint(body, new FlatTuple(var_chess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Chess")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_piece, "piece"),
      		   new ExportedParameter(body, var_square, "square"),
      		   new ExportedParameter(body, var_chess, "chess")
      		));
      		// /*En passant if there is a pawn on the right to be hit */	Chess.whitePlayerTurn(chess, boolTurn)
      		new TypeConstraint(body, new FlatTuple(var_chess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Chess")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_chess, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/chessdiagram", "Chess", "whitePlayerTurn")));
      		new Equality(body, var__virtual_0_, var_boolTurn);
      		// 	check(boolTurn == false)
      		new ExpressionEvaluation(body, new IExpressionEvaluator() {
      		                            
      		                            @Override
      		                            public String getShortDescription() {
      		                                return "Expression evaluation from pattern blackPawnMoves";
      		                            }
      		
      		                            @Override
      		                            public Iterable<String> getInputParameterNames() {
      		                                return Arrays.asList("boolTurn");
      		                            }
      		
      		                            @Override
      		                            public Object evaluateExpression(IValueProvider provider) throws Exception {
      		                                    java.lang.Boolean boolTurn = (java.lang.Boolean) provider.getValue("boolTurn");
      		                                    return evaluateExpression_6_1(boolTurn);
      		                                }
      		
      		                        },  null); // 	Pawn.colour(piece, ::Black)
      		PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      		new ConstantValue(body, var__virtual_1_, getEnumLiteral("http://example.com/chessdiagram", "Colour", "Black").getInstance());
      		new TypeConstraint(body, new FlatTuple(var_piece), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Pawn")));
      		PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
      		new TypeConstraint(body, new FlatTuple(var_piece, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/chessdiagram", "Piece", "colour")));
      		new Equality(body, var__virtual_2_, var__virtual_1_);
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
      		PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
      		new TypeConstraint(body, new FlatTuple(var_atackingPawn, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/chessdiagram", "Pawn", "enPassantEnabled")));
      		new Equality(body, var__virtual_3_, var_bool);
      		// 	check(bool == true)
      		new ExpressionEvaluation(body, new IExpressionEvaluator() {
      		                            
      		                            @Override
      		                            public String getShortDescription() {
      		                                return "Expression evaluation from pattern blackPawnMoves";
      		                            }
      		
      		                            @Override
      		                            public Iterable<String> getInputParameterNames() {
      		                                return Arrays.asList("bool");
      		                            }
      		
      		                            @Override
      		                            public Object evaluateExpression(IValueProvider provider) throws Exception {
      		                                    java.lang.Boolean bool = (java.lang.Boolean) provider.getValue("bool");
      		                                    return evaluateExpression_6_2(bool);
      		                                }
      		
      		                        },  null); // 	find S(atackingSquare, square)
      		new PositivePatternCall(body, new FlatTuple(var_atackingSquare, var_square), SQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	Chess.blackPlayer.piece(chess, piece)
      		new TypeConstraint(body, new FlatTuple(var_chess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Chess")));
      		PVariable var__virtual_4_ = body.getOrCreateVariableByName(".virtual{4}");
      		new TypeConstraint(body, new FlatTuple(var_chess, var__virtual_4_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/chessdiagram", "Chess", "blackPlayer")));
      		PVariable var__virtual_5_ = body.getOrCreateVariableByName(".virtual{5}");
      		new TypeConstraint(body, new FlatTuple(var__virtual_4_, var__virtual_5_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/chessdiagram", "Player", "piece")));
      		new Equality(body, var__virtual_5_, var_piece);
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
    return ((boolTurn).booleanValue() == false);
  }
  
  private static boolean evaluateExpression_2_1(final Boolean boolTurn) {
    return ((boolTurn).booleanValue() == false);
  }
  
  private static boolean evaluateExpression_2_2(final Boolean bool) {
    return ((bool).booleanValue() == true);
  }
  
  private static boolean evaluateExpression_3_1(final Boolean boolTurn) {
    return ((boolTurn).booleanValue() == false);
  }
  
  private static boolean evaluateExpression_4_1(final Boolean boolTurn) {
    return ((boolTurn).booleanValue() == false);
  }
  
  private static boolean evaluateExpression_5_1(final Boolean boolTurn) {
    return ((boolTurn).booleanValue() == false);
  }
  
  private static boolean evaluateExpression_5_2(final Boolean bool) {
    return ((bool).booleanValue() == true);
  }
  
  private static boolean evaluateExpression_6_1(final Boolean boolTurn) {
    return ((boolTurn).booleanValue() == false);
  }
  
  private static boolean evaluateExpression_6_2(final Boolean bool) {
    return ((bool).booleanValue() == true);
  }
}
