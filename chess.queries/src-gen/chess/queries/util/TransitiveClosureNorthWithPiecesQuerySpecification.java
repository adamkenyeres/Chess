package chess.queries.util;

import chess.queries.TransitiveClosureNorthWithPiecesMatch;
import chess.queries.TransitiveClosureNorthWithPiecesMatcher;
import chess.queries.util.NQuerySpecification;
import chess.queries.util.PieceOnSquareeQuerySpecification;
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
import org.eclipse.viatra.query.runtime.matchers.psystem.annotations.PAnnotation;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExpressionEvaluation;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.BinaryTransitiveClosure;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.viatra.query.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate TransitiveClosureNorthWithPiecesMatcher in a type-safe way.
 * 
 * @see TransitiveClosureNorthWithPiecesMatcher
 * @see TransitiveClosureNorthWithPiecesMatch
 * 
 */
@SuppressWarnings("all")
public final class TransitiveClosureNorthWithPiecesQuerySpecification extends BaseGeneratedEMFQuerySpecification<TransitiveClosureNorthWithPiecesMatcher> {
  private TransitiveClosureNorthWithPiecesQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryException if the pattern definition could not be loaded
   * 
   */
  public static TransitiveClosureNorthWithPiecesQuerySpecification instance() throws ViatraQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected TransitiveClosureNorthWithPiecesMatcher instantiate(final ViatraQueryEngine engine) throws ViatraQueryException {
    return TransitiveClosureNorthWithPiecesMatcher.on(engine);
  }
  
  @Override
  public TransitiveClosureNorthWithPiecesMatch newEmptyMatch() {
    return TransitiveClosureNorthWithPiecesMatch.newEmptyMatch();
  }
  
  @Override
  public TransitiveClosureNorthWithPiecesMatch newMatch(final Object... parameters) {
    return TransitiveClosureNorthWithPiecesMatch.newMatch((chessdiagram.Square) parameters[0], (chessdiagram.Square) parameters[1], (chessdiagram.Square) parameters[2]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link TransitiveClosureNorthWithPiecesQuerySpecification} to be created 
   * 	<b>not</b> at the class load time of the outer class, 
   * 	but rather at the first call to {@link TransitiveClosureNorthWithPiecesQuerySpecification#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static TransitiveClosureNorthWithPiecesQuerySpecification INSTANCE = new TransitiveClosureNorthWithPiecesQuerySpecification();
    
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
    private final static TransitiveClosureNorthWithPiecesQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "chess.queries.transitiveClosureNorthWithPieces";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("start","end","square");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(
      			 new PParameter("start", "chessdiagram.Square", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://example.com/chessdiagram", "Square"))),
      			 new PParameter("end", "chessdiagram.Square", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://example.com/chessdiagram", "Square"))),
      			 new PParameter("square", "chessdiagram.Square", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://example.com/chessdiagram", "Square")))
      			);
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_start = body.getOrCreateVariableByName("start");
      		PVariable var_end = body.getOrCreateVariableByName("end");
      		PVariable var_square = body.getOrCreateVariableByName("square");
      		PVariable var_startId = body.getOrCreateVariableByName("startId");
      		PVariable var_endId = body.getOrCreateVariableByName("endId");
      		PVariable var_squareId = body.getOrCreateVariableByName("squareId");
      		new TypeConstraint(body, new FlatTuple(var_start), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Square")));
      		new TypeConstraint(body, new FlatTuple(var_end), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Square")));
      		new TypeConstraint(body, new FlatTuple(var_square), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Square")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_start, "start"),
      		   new ExportedParameter(body, var_end, "end"),
      		   new ExportedParameter(body, var_square, "square")
      		));
      		// 	find N +(start, square)
      		new BinaryTransitiveClosure(body, new FlatTuple(var_start, var_square), NQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	Square.id(start, startId)
      		new TypeConstraint(body, new FlatTuple(var_start), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Square")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_start, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/chessdiagram", "Square", "id")));
      		new Equality(body, var__virtual_0_, var_startId);
      		// 	Square.id(end, endId)
      		new TypeConstraint(body, new FlatTuple(var_end), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Square")));
      		PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      		new TypeConstraint(body, new FlatTuple(var_end, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/chessdiagram", "Square", "id")));
      		new Equality(body, var__virtual_1_, var_endId);
      		// 	Square.id(square, squareId)
      		new TypeConstraint(body, new FlatTuple(var_square), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Square")));
      		PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
      		new TypeConstraint(body, new FlatTuple(var_square, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/chessdiagram", "Square", "id")));
      		new Equality(body, var__virtual_2_, var_squareId);
      		// 	check(squareId < startId)
      		new ExpressionEvaluation(body, new IExpressionEvaluator() {
      		                            
      		                            @Override
      		                            public String getShortDescription() {
      		                                return "Expression evaluation from pattern transitiveClosureNorthWithPieces";
      		                            }
      		
      		                            @Override
      		                            public Iterable<String> getInputParameterNames() {
      		                                return Arrays.asList("squareId", "startId");
      		                            }
      		
      		                            @Override
      		                            public Object evaluateExpression(IValueProvider provider) throws Exception {
      		                                    java.lang.Integer squareId = (java.lang.Integer) provider.getValue("squareId");
      		                                    java.lang.Integer startId = (java.lang.Integer) provider.getValue("startId");
      		                                    return evaluateExpression_1_1(squareId, startId);
      		                                }
      		
      		                        },  null); // 	check(squareId > endId)
      		new ExpressionEvaluation(body, new IExpressionEvaluator() {
      		                            
      		                            @Override
      		                            public String getShortDescription() {
      		                                return "Expression evaluation from pattern transitiveClosureNorthWithPieces";
      		                            }
      		
      		                            @Override
      		                            public Iterable<String> getInputParameterNames() {
      		                                return Arrays.asList("endId", "squareId");
      		                            }
      		
      		                            @Override
      		                            public Object evaluateExpression(IValueProvider provider) throws Exception {
      		                                    java.lang.Integer endId = (java.lang.Integer) provider.getValue("endId");
      		                                    java.lang.Integer squareId = (java.lang.Integer) provider.getValue("squareId");
      		                                    return evaluateExpression_1_2(endId, squareId);
      		                                }
      		
      		                        },  null); // 	check(startId > endId)
      		new ExpressionEvaluation(body, new IExpressionEvaluator() {
      		                            
      		                            @Override
      		                            public String getShortDescription() {
      		                                return "Expression evaluation from pattern transitiveClosureNorthWithPieces";
      		                            }
      		
      		                            @Override
      		                            public Iterable<String> getInputParameterNames() {
      		                                return Arrays.asList("endId", "startId");
      		                            }
      		
      		                            @Override
      		                            public Object evaluateExpression(IValueProvider provider) throws Exception {
      		                                    java.lang.Integer endId = (java.lang.Integer) provider.getValue("endId");
      		                                    java.lang.Integer startId = (java.lang.Integer) provider.getValue("startId");
      		                                    return evaluateExpression_1_3(endId, startId);
      		                                }
      		
      		                        },  null); // 	find pieceOnSquaree(square)
      		new PositivePatternCall(body, new FlatTuple(var_square), PieceOnSquareeQuerySpecification.instance().getInternalQueryRepresentation());
      		bodies.add(body);
      	}
      	                {
      		PAnnotation annotation = new PAnnotation("QueryExplorer");
      		annotation.addAttribute("checked", false);
      		addAnnotation(annotation);
      	}
      	// to silence compiler error
      	if (false) throw new ViatraQueryException("Never", "happens");
      } catch (ViatraQueryException ex) {
      	throw processDependencyException(ex);
      }
      return bodies;
    }
  }
  
  private static boolean evaluateExpression_1_1(final Integer squareId, final Integer startId) {
    boolean _lessThan = (squareId.compareTo(startId) < 0);
    return _lessThan;
  }
  
  private static boolean evaluateExpression_1_2(final Integer endId, final Integer squareId) {
    boolean _greaterThan = (squareId.compareTo(endId) > 0);
    return _greaterThan;
  }
  
  private static boolean evaluateExpression_1_3(final Integer endId, final Integer startId) {
    boolean _greaterThan = (startId.compareTo(endId) > 0);
    return _greaterThan;
  }
}
