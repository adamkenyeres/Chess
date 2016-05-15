package chess.queries.util;

import chess.queries.BlackKingsMatch;
import chess.queries.BlackKingsMatcher;
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
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.ConstantValue;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.viatra.query.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate BlackKingsMatcher in a type-safe way.
 * 
 * @see BlackKingsMatcher
 * @see BlackKingsMatch
 * 
 */
@SuppressWarnings("all")
public final class BlackKingsQuerySpecification extends BaseGeneratedEMFQuerySpecification<BlackKingsMatcher> {
  private BlackKingsQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryException if the pattern definition could not be loaded
   * 
   */
  public static BlackKingsQuerySpecification instance() throws ViatraQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected BlackKingsMatcher instantiate(final ViatraQueryEngine engine) throws ViatraQueryException {
    return BlackKingsMatcher.on(engine);
  }
  
  @Override
  public BlackKingsMatch newEmptyMatch() {
    return BlackKingsMatch.newEmptyMatch();
  }
  
  @Override
  public BlackKingsMatch newMatch(final Object... parameters) {
    return BlackKingsMatch.newMatch((chessdiagram.King) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link BlackKingsQuerySpecification} to be created 
   * 	<b>not</b> at the class load time of the outer class, 
   * 	but rather at the first call to {@link BlackKingsQuerySpecification#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static BlackKingsQuerySpecification INSTANCE = new BlackKingsQuerySpecification();
    
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
    private final static BlackKingsQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "chess.queries.blackKings";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("king");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(
      			 new PParameter("king", "chessdiagram.King", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://example.com/chessdiagram", "King")))
      			);
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_king = body.getOrCreateVariableByName("king");
      		new TypeConstraint(body, new FlatTuple(var_king), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "King")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_king, "king")
      		));
      		// 	King.colour(king, ::Black)
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new ConstantValue(body, var__virtual_0_, getEnumLiteral("http://example.com/chessdiagram", "Colour", "Black").getInstance());
      		new TypeConstraint(body, new FlatTuple(var_king), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "King")));
      		PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      		new TypeConstraint(body, new FlatTuple(var_king, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/chessdiagram", "Piece", "colour")));
      		new Equality(body, var__virtual_1_, var__virtual_0_);
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
