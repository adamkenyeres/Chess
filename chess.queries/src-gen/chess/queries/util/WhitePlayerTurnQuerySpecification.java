package chess.queries.util;

import chess.queries.WhitePlayerTurnMatch;
import chess.queries.WhitePlayerTurnMatcher;
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
 * A pattern-specific query specification that can instantiate WhitePlayerTurnMatcher in a type-safe way.
 * 
 * @see WhitePlayerTurnMatcher
 * @see WhitePlayerTurnMatch
 * 
 */
@SuppressWarnings("all")
public final class WhitePlayerTurnQuerySpecification extends BaseGeneratedEMFQuerySpecification<WhitePlayerTurnMatcher> {
  private WhitePlayerTurnQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryException if the pattern definition could not be loaded
   * 
   */
  public static WhitePlayerTurnQuerySpecification instance() throws ViatraQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected WhitePlayerTurnMatcher instantiate(final ViatraQueryEngine engine) throws ViatraQueryException {
    return WhitePlayerTurnMatcher.on(engine);
  }
  
  @Override
  public WhitePlayerTurnMatch newEmptyMatch() {
    return WhitePlayerTurnMatch.newEmptyMatch();
  }
  
  @Override
  public WhitePlayerTurnMatch newMatch(final Object... parameters) {
    return WhitePlayerTurnMatch.newMatch((chessdiagram.Chess) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link WhitePlayerTurnQuerySpecification} to be created 
   * 	<b>not</b> at the class load time of the outer class, 
   * 	but rather at the first call to {@link WhitePlayerTurnQuerySpecification#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static WhitePlayerTurnQuerySpecification INSTANCE = new WhitePlayerTurnQuerySpecification();
    
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
    private final static WhitePlayerTurnQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "chess.queries.whitePlayerTurn";
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
      		PVariable var_bool = body.getOrCreateVariableByName("bool");
      		new TypeConstraint(body, new FlatTuple(var_chess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Chess")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_chess, "chess")
      		));
      		// 	Chess.whitePlayerTurn(chess, bool)
      		new TypeConstraint(body, new FlatTuple(var_chess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Chess")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_chess, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/chessdiagram", "Chess", "whitePlayerTurn")));
      		new Equality(body, var__virtual_0_, var_bool);
      		// 	check(bool == true)
      		new ExpressionEvaluation(body, new IExpressionEvaluator() {
      		                            
      		                            @Override
      		                            public String getShortDescription() {
      		                                return "Expression evaluation from pattern whitePlayerTurn";
      		                            }
      		
      		                            @Override
      		                            public Iterable<String> getInputParameterNames() {
      		                                return Arrays.asList("bool");
      		                            }
      		
      		                            @Override
      		                            public Object evaluateExpression(IValueProvider provider) throws Exception {
      		                                    java.lang.Boolean bool = (java.lang.Boolean) provider.getValue("bool");
      		                                    return evaluateExpression_1_1(bool);
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
  
  private static boolean evaluateExpression_1_1(final Boolean bool) {
    return ((bool).booleanValue() == true);
  }
}
