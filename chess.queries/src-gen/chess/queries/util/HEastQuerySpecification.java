package chess.queries.util;

import chess.queries.HEastMatch;
import chess.queries.HEastMatcher;
import chess.queries.util.EQuerySpecification;
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
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.BinaryTransitiveClosure;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.viatra.query.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate HEastMatcher in a type-safe way.
 * 
 * @see HEastMatcher
 * @see HEastMatch
 * 
 */
@SuppressWarnings("all")
public final class HEastQuerySpecification extends BaseGeneratedEMFQuerySpecification<HEastMatcher> {
  private HEastQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryException if the pattern definition could not be loaded
   * 
   */
  public static HEastQuerySpecification instance() throws ViatraQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected HEastMatcher instantiate(final ViatraQueryEngine engine) throws ViatraQueryException {
    return HEastMatcher.on(engine);
  }
  
  @Override
  public HEastMatch newEmptyMatch() {
    return HEastMatch.newEmptyMatch();
  }
  
  @Override
  public HEastMatch newMatch(final Object... parameters) {
    return HEastMatch.newMatch((chessdiagram.Square) parameters[0], (chessdiagram.Square) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link HEastQuerySpecification} to be created 
   * 	<b>not</b> at the class load time of the outer class, 
   * 	but rather at the first call to {@link HEastQuerySpecification#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static HEastQuerySpecification INSTANCE = new HEastQuerySpecification();
    
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
    private final static HEastQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "chess.queries.hEast";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("s1","s2");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(
      			 new PParameter("s1", "chessdiagram.Square", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://example.com/chessdiagram", "Square"))),
      			 new PParameter("s2", "chessdiagram.Square", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://example.com/chessdiagram", "Square")))
      			);
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_s1 = body.getOrCreateVariableByName("s1");
      		PVariable var_s2 = body.getOrCreateVariableByName("s2");
      		new TypeConstraint(body, new FlatTuple(var_s1), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Square")));
      		new TypeConstraint(body, new FlatTuple(var_s2), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/chessdiagram", "Square")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_s1, "s1"),
      		   new ExportedParameter(body, var_s2, "s2")
      		));
      		// 	find E +(s1, s2)
      		new BinaryTransitiveClosure(body, new FlatTuple(var_s1, var_s2), EQuerySpecification.instance().getInternalQueryRepresentation());
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
