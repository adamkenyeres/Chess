package chess.queries.util;

import chess.queries.MovesSouthEastMatch;
import chess.queries.MovesSouthEastMatcher;
import chess.queries.util.SouthEastTransitiveClouserQuerySpecification;
import chess.queries.util.TransitiveClosureNorthWestWithPiecesQuerySpecification;
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
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.PatternMatchCounter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.viatra.query.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate MovesSouthEastMatcher in a type-safe way.
 * 
 * @see MovesSouthEastMatcher
 * @see MovesSouthEastMatch
 * 
 */
@SuppressWarnings("all")
public final class MovesSouthEastQuerySpecification extends BaseGeneratedEMFQuerySpecification<MovesSouthEastMatcher> {
  private MovesSouthEastQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryException if the pattern definition could not be loaded
   * 
   */
  public static MovesSouthEastQuerySpecification instance() throws ViatraQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected MovesSouthEastMatcher instantiate(final ViatraQueryEngine engine) throws ViatraQueryException {
    return MovesSouthEastMatcher.on(engine);
  }
  
  @Override
  public MovesSouthEastMatch newEmptyMatch() {
    return MovesSouthEastMatch.newEmptyMatch();
  }
  
  @Override
  public MovesSouthEastMatch newMatch(final Object... parameters) {
    return MovesSouthEastMatch.newMatch((chessdiagram.Square) parameters[0], (chessdiagram.Square) parameters[1], (chessdiagram.Square) parameters[2]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link MovesSouthEastQuerySpecification} to be created 
   * 	<b>not</b> at the class load time of the outer class, 
   * 	but rather at the first call to {@link MovesSouthEastQuerySpecification#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static MovesSouthEastQuerySpecification INSTANCE = new MovesSouthEastQuerySpecification();
    
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
    private final static MovesSouthEastQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "chess.queries.movesSouthEast";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("squareStart","squareEnd","squareMiddle");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(
      			 new PParameter("squareStart", "chessdiagram.Square", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://example.com/chessdiagram", "Square"))),
      			 new PParameter("squareEnd", "chessdiagram.Square", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://example.com/chessdiagram", "Square"))),
      			 new PParameter("squareMiddle", "chessdiagram.Square", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://example.com/chessdiagram", "Square")))
      			);
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_squareStart = body.getOrCreateVariableByName("squareStart");
      		PVariable var_squareEnd = body.getOrCreateVariableByName("squareEnd");
      		PVariable var_squareMiddle = body.getOrCreateVariableByName("squareMiddle");
      		PVariable var_startId = body.getOrCreateVariableByName("startId");
      		PVariable var_endId = body.getOrCreateVariableByName("endId");
      		PVariable var_middleId = body.getOrCreateVariableByName("middleId");
      		PVariable var_C = body.getOrCreateVariableByName("C");
      		PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
      		new TypeConstraint(body, new FlatTuple(var_squareStart), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Square")));
      		new TypeConstraint(body, new FlatTuple(var_squareEnd), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Square")));
      		new TypeConstraint(body, new FlatTuple(var_squareMiddle), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Square")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_squareStart, "squareStart"),
      		   new ExportedParameter(body, var_squareEnd, "squareEnd"),
      		   new ExportedParameter(body, var_squareMiddle, "squareMiddle")
      		));
      		// 	Square.id(squareStart, startId)
      		new TypeConstraint(body, new FlatTuple(var_squareStart), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Square")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_squareStart, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/chessdiagram", "Square", "id")));
      		new Equality(body, var__virtual_0_, var_startId);
      		// 	Square.id(squareEnd, endId)
      		new TypeConstraint(body, new FlatTuple(var_squareEnd), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Square")));
      		PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      		new TypeConstraint(body, new FlatTuple(var_squareEnd, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/chessdiagram", "Square", "id")));
      		new Equality(body, var__virtual_1_, var_endId);
      		// 	check(startId < endId)
      		new ExpressionEvaluation(body, new IExpressionEvaluator() {
      		                            
      		                            @Override
      		                            public String getShortDescription() {
      		                                return "Expression evaluation from pattern movesSouthEast";
      		                            }
      		
      		                            @Override
      		                            public Iterable<String> getInputParameterNames() {
      		                                return Arrays.asList("endId", "startId");
      		                            }
      		
      		                            @Override
      		                            public Object evaluateExpression(IValueProvider provider) throws Exception {
      		                                    java.lang.Integer endId = (java.lang.Integer) provider.getValue("endId");
      		                                    java.lang.Integer startId = (java.lang.Integer) provider.getValue("startId");
      		                                    return evaluateExpression_1_1(endId, startId);
      		                                }
      		
      		                        },  null); // 	check((endId / 8 - startId / 8)	==(endId % 8 - startId % 8))
      		new ExpressionEvaluation(body, new IExpressionEvaluator() {
      		                            
      		                            @Override
      		                            public String getShortDescription() {
      		                                return "Expression evaluation from pattern movesSouthEast";
      		                            }
      		
      		                            @Override
      		                            public Iterable<String> getInputParameterNames() {
      		                                return Arrays.asList("endId", "startId");
      		                            }
      		
      		                            @Override
      		                            public Object evaluateExpression(IValueProvider provider) throws Exception {
      		                                    java.lang.Integer endId = (java.lang.Integer) provider.getValue("endId");
      		                                    java.lang.Integer startId = (java.lang.Integer) provider.getValue("startId");
      		                                    return evaluateExpression_1_2(endId, startId);
      		                                }
      		
      		                        },  null); // 	find southEastTransitiveClouser(squareStart, squareMiddle)
      		new PositivePatternCall(body, new FlatTuple(var_squareStart, var_squareMiddle), SouthEastTransitiveClouserQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	Square.id(squareMiddle, middleId)
      		new TypeConstraint(body, new FlatTuple(var_squareMiddle), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Square")));
      		PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
      		new TypeConstraint(body, new FlatTuple(var_squareMiddle, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/chessdiagram", "Square", "id")));
      		new Equality(body, var__virtual_2_, var_middleId);
      		// 	check(middleId <= endId)
      		new ExpressionEvaluation(body, new IExpressionEvaluator() {
      		                            
      		                            @Override
      		                            public String getShortDescription() {
      		                                return "Expression evaluation from pattern movesSouthEast";
      		                            }
      		
      		                            @Override
      		                            public Iterable<String> getInputParameterNames() {
      		                                return Arrays.asList("endId", "middleId");
      		                            }
      		
      		                            @Override
      		                            public Object evaluateExpression(IValueProvider provider) throws Exception {
      		                                    java.lang.Integer endId = (java.lang.Integer) provider.getValue("endId");
      		                                    java.lang.Integer middleId = (java.lang.Integer) provider.getValue("middleId");
      		                                    return evaluateExpression_1_3(endId, middleId);
      		                                }
      		
      		                        },  null); // 	C == count find	transitiveClosureNorthWestWithPieces(squareMiddle, squareStart, _)
      		PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
      		new PatternMatchCounter(body, new FlatTuple(var_squareMiddle, var_squareStart, var___0_), TransitiveClosureNorthWestWithPiecesQuerySpecification.instance().getInternalQueryRepresentation(), var__virtual_3_);
      		new Equality(body, var_C, var__virtual_3_);
      		// 	check(C == 0)
      		new ExpressionEvaluation(body, new IExpressionEvaluator() {
      		                            
      		                            @Override
      		                            public String getShortDescription() {
      		                                return "Expression evaluation from pattern movesSouthEast";
      		                            }
      		
      		                            @Override
      		                            public Iterable<String> getInputParameterNames() {
      		                                return Arrays.asList("C");
      		                            }
      		
      		                            @Override
      		                            public Object evaluateExpression(IValueProvider provider) throws Exception {
      		                                    java.lang.Integer C = (java.lang.Integer) provider.getValue("C");
      		                                    return evaluateExpression_1_4(C);
      		                                }
      		
      		                        },  null); 
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
  
  private static boolean evaluateExpression_1_1(final Integer endId, final Integer startId) {
    boolean _lessThan = (startId.compareTo(endId) < 0);
    return _lessThan;
  }
  
  private static boolean evaluateExpression_1_2(final Integer endId, final Integer startId) {
    return ((((endId).intValue() / 8) - ((startId).intValue() / 8)) == (((endId).intValue() % 8) - ((startId).intValue() % 8)));
  }
  
  private static boolean evaluateExpression_1_3(final Integer endId, final Integer middleId) {
    boolean _lessEqualsThan = (middleId.compareTo(endId) <= 0);
    return _lessEqualsThan;
  }
  
  private static boolean evaluateExpression_1_4(final Integer C) {
    return ((C).intValue() == 0);
  }
}
