package chess.queries.util;

import chess.queries.NumberOfStepsEqualsThreeMatch;
import chess.queries.NumberOfStepsEqualsThreeMatcher;
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
 * A pattern-specific query specification that can instantiate NumberOfStepsEqualsThreeMatcher in a type-safe way.
 * 
 * @see NumberOfStepsEqualsThreeMatcher
 * @see NumberOfStepsEqualsThreeMatch
 * 
 */
@SuppressWarnings("all")
public final class NumberOfStepsEqualsThreeQuerySpecification extends BaseGeneratedEMFQuerySpecification<NumberOfStepsEqualsThreeMatcher> {
  private NumberOfStepsEqualsThreeQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryException if the pattern definition could not be loaded
   * 
   */
  public static NumberOfStepsEqualsThreeQuerySpecification instance() throws ViatraQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected NumberOfStepsEqualsThreeMatcher instantiate(final ViatraQueryEngine engine) throws ViatraQueryException {
    return NumberOfStepsEqualsThreeMatcher.on(engine);
  }
  
  @Override
  public NumberOfStepsEqualsThreeMatch newEmptyMatch() {
    return NumberOfStepsEqualsThreeMatch.newEmptyMatch();
  }
  
  @Override
  public NumberOfStepsEqualsThreeMatch newMatch(final Object... parameters) {
    return NumberOfStepsEqualsThreeMatch.newMatch((chessdiagram.Chess) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link NumberOfStepsEqualsThreeQuerySpecification} to be created 
   * 	<b>not</b> at the class load time of the outer class, 
   * 	but rather at the first call to {@link NumberOfStepsEqualsThreeQuerySpecification#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static NumberOfStepsEqualsThreeQuerySpecification INSTANCE = new NumberOfStepsEqualsThreeQuerySpecification();
    
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
    private final static NumberOfStepsEqualsThreeQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "chess.queries.numberOfStepsEqualsThree";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("chess");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(
      			 new PParameter("chess", "chessdiagram.Chess", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://example.com/chessdiagram", "Chess")))
      			);
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_chess = body.getOrCreateVariableByName("chess");
      		PVariable var_stepsBefore = body.getOrCreateVariableByName("stepsBefore");
      		PVariable var_numberOfSteps = body.getOrCreateVariableByName("numberOfSteps");
      		new TypeConstraint(body, new FlatTuple(var_chess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Chess")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_chess, "chess")
      		));
      		// 	Chess.stepsBeforeExlpoaring(chess,stepsBefore)
      		new TypeConstraint(body, new FlatTuple(var_chess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Chess")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_chess, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/chessdiagram", "Chess", "stepsBeforeExlpoaring")));
      		new Equality(body, var__virtual_0_, var_stepsBefore);
      		// 	Chess.numberOfSteps(chess, numberOfSteps)
      		new TypeConstraint(body, new FlatTuple(var_chess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Chess")));
      		PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      		new TypeConstraint(body, new FlatTuple(var_chess, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/chessdiagram", "Chess", "numberOfSteps")));
      		new Equality(body, var__virtual_1_, var_numberOfSteps);
      		// 	check(numberOfSteps % 2 != 0 && numberOfSteps != stepsBefore)
      		new ExpressionEvaluation(body, new IExpressionEvaluator() {
      		                            
      		                            @Override
      		                            public String getShortDescription() {
      		                                return "Expression evaluation from pattern numberOfStepsEqualsThree";
      		                            }
      		
      		                            @Override
      		                            public Iterable<String> getInputParameterNames() {
      		                                return Arrays.asList("numberOfSteps", "stepsBefore");
      		                            }
      		
      		                            @Override
      		                            public Object evaluateExpression(IValueProvider provider) throws Exception {
      		                                    java.lang.Integer numberOfSteps = (java.lang.Integer) provider.getValue("numberOfSteps");
      		                                    java.lang.Integer stepsBefore = (java.lang.Integer) provider.getValue("stepsBefore");
      		                                    return evaluateExpression_1_1(numberOfSteps, stepsBefore);
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
  
  private static boolean evaluateExpression_1_1(final Integer numberOfSteps, final Integer stepsBefore) {
    boolean _and = false;
    if (!(((numberOfSteps).intValue() % 2) != 0)) {
      _and = false;
    } else {
      boolean _notEquals = (!Objects.equal(numberOfSteps, stepsBefore));
      _and = _notEquals;
    }
    return _and;
  }
}
