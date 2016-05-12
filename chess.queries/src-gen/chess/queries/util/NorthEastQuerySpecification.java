package chess.queries.util;

import chess.queries.NorthEastMatch;
import chess.queries.NorthEastMatcher;
import com.google.common.base.Objects;
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
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.viatra.query.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate NorthEastMatcher in a type-safe way.
 * 
 * @see NorthEastMatcher
 * @see NorthEastMatch
 * 
 */
@SuppressWarnings("all")
public final class NorthEastQuerySpecification extends BaseGeneratedEMFQuerySpecification<NorthEastMatcher> {
  private NorthEastQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryException if the pattern definition could not be loaded
   * 
   */
  public static NorthEastQuerySpecification instance() throws ViatraQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected NorthEastMatcher instantiate(final ViatraQueryEngine engine) throws ViatraQueryException {
    return NorthEastMatcher.on(engine);
  }
  
  @Override
  public NorthEastMatch newEmptyMatch() {
    return NorthEastMatch.newEmptyMatch();
  }
  
  @Override
  public NorthEastMatch newMatch(final Object... parameters) {
    return NorthEastMatch.newMatch((chessdiagram.Square) parameters[0], (chessdiagram.Square) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link NorthEastQuerySpecification} to be created 
   * 	<b>not</b> at the class load time of the outer class, 
   * 	but rather at the first call to {@link NorthEastQuerySpecification#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static NorthEastQuerySpecification INSTANCE = new NorthEastQuerySpecification();
    
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
    private final static NorthEastQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "chess.queries.northEast";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("squareSW","squareNE");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(
      			 new PParameter("squareSW", "chessdiagram.Square", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://example.com/chessdiagram", "Square"))),
      			 new PParameter("squareNE", "chessdiagram.Square", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://example.com/chessdiagram", "Square")))
      			);
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_squareSW = body.getOrCreateVariableByName("squareSW");
      		PVariable var_squareNE = body.getOrCreateVariableByName("squareNE");
      		PVariable var_id = body.getOrCreateVariableByName("id");
      		PVariable var_otherId = body.getOrCreateVariableByName("otherId");
      		PVariable var_otherIdRow = body.getOrCreateVariableByName("otherIdRow");
      		new TypeConstraint(body, new FlatTuple(var_squareSW), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Square")));
      		new TypeConstraint(body, new FlatTuple(var_squareNE), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Square")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_squareSW, "squareSW"),
      		   new ExportedParameter(body, var_squareNE, "squareNE")
      		));
      		// 	Square.id(squareSW, id)
      		new TypeConstraint(body, new FlatTuple(var_squareSW), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Square")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_squareSW, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/chessdiagram", "Square", "id")));
      		new Equality(body, var__virtual_0_, var_id);
      		// 	otherId == eval(id-7)
      		PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      		new ExpressionEvaluation(body, new IExpressionEvaluator() {
      		                            
      		                            @Override
      		                            public String getShortDescription() {
      		                                return "Expression evaluation from pattern northEast";
      		                            }
      		
      		                            @Override
      		                            public Iterable<String> getInputParameterNames() {
      		                                return Arrays.asList("id");
      		                            }
      		
      		                            @Override
      		                            public Object evaluateExpression(IValueProvider provider) throws Exception {
      		                                    java.lang.Integer id = (java.lang.Integer) provider.getValue("id");
      		                                    return evaluateExpression_1_1(id);
      		                                }
      		
      		                        },  var__virtual_1_ ); new Equality(body, var_otherId, var__virtual_1_);
      		// 	otherIdRow == eval(((id-7)/8)+1)
      		PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
      		new ExpressionEvaluation(body, new IExpressionEvaluator() {
      		                            
      		                            @Override
      		                            public String getShortDescription() {
      		                                return "Expression evaluation from pattern northEast";
      		                            }
      		
      		                            @Override
      		                            public Iterable<String> getInputParameterNames() {
      		                                return Arrays.asList("id");
      		                            }
      		
      		                            @Override
      		                            public Object evaluateExpression(IValueProvider provider) throws Exception {
      		                                    java.lang.Integer id = (java.lang.Integer) provider.getValue("id");
      		                                    return evaluateExpression_1_2(id);
      		                                }
      		
      		                        },  var__virtual_2_ ); new Equality(body, var_otherIdRow, var__virtual_2_);
      		// 	check( otherIdRow == (id/8) )
      		new ExpressionEvaluation(body, new IExpressionEvaluator() {
      		                            
      		                            @Override
      		                            public String getShortDescription() {
      		                                return "Expression evaluation from pattern northEast";
      		                            }
      		
      		                            @Override
      		                            public Iterable<String> getInputParameterNames() {
      		                                return Arrays.asList("id", "otherIdRow");
      		                            }
      		
      		                            @Override
      		                            public Object evaluateExpression(IValueProvider provider) throws Exception {
      		                                    java.lang.Integer id = (java.lang.Integer) provider.getValue("id");
      		                                    java.lang.Integer otherIdRow = (java.lang.Integer) provider.getValue("otherIdRow");
      		                                    return evaluateExpression_1_3(id, otherIdRow);
      		                                }
      		
      		                        },  null); // 	Square.id(squareNE, otherId)
      		new TypeConstraint(body, new FlatTuple(var_squareNE), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Square")));
      		PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
      		new TypeConstraint(body, new FlatTuple(var_squareNE, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/chessdiagram", "Square", "id")));
      		new Equality(body, var__virtual_3_, var_otherId);
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
  
  private static int evaluateExpression_1_1(final Integer id) {
    return ((id).intValue() - 7);
  }
  
  private static int evaluateExpression_1_2(final Integer id) {
    return ((((id).intValue() - 7) / 8) + 1);
  }
  
  private static boolean evaluateExpression_1_3(final Integer id, final Object otherIdRow) {
    boolean _equals = Objects.equal(otherIdRow, Integer.valueOf(((id).intValue() / 8)));
    return _equals;
  }
}
