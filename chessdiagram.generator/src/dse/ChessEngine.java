package dse;

import java.util.Collection;

import org.eclipse.viatra.dse.api.DesignSpaceExplorer;
import org.eclipse.viatra.dse.api.Solution;
import org.eclipse.viatra.dse.api.SolutionTrajectory;
import org.eclipse.viatra.dse.api.Strategies;
import org.eclipse.viatra.dse.objectives.impl.ConstraintsObjective;
import org.eclipse.viatra.dse.solutionstore.SolutionStore;
import org.eclipse.viatra.dse.statecoding.simple.SimpleStateCoderFactory;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;

import chess.queries.util.InChessWhiteQuerySpecification;
import chessdiagram.Chess;
import chessdiagram.ChessdiagramPackage;
import model.transformation.BishopMovesRule;
import model.transformation.BlackKnightRule;
import model.transformation.BlackPawnMovesRule;
import model.transformation.KingMovesRule;
import model.transformation.QueenMovesRule;
import model.transformation.RookMovesRule;

public class ChessEngine {
	private SolutionTrajectory tra;
	private Chess chess;
	private DesignSpaceExplorer dse;
	private Collection<Solution> solutions;

	public ChessEngine(Chess chess) throws ViatraQueryException {
		// TODO Auto-generated constructor stub
		this.chess = chess;
		tra = null;
		solutions = null;
		dse = new DesignSpaceExplorer();
		dse.setInitialModel(chess);
		dse.addTransformationRule(BlackPawnMovesRule.getBlackPawnMovesRule());
		dse.addTransformationRule(BlackKnightRule.getBlackKnightMovesRule());
		dse.addTransformationRule(RookMovesRule.getBlackRookMovesRule());
		dse.addTransformationRule(BishopMovesRule.getBlackBishopMovesRule());
		dse.addTransformationRule(QueenMovesRule.getBlackQueenMovesRule());
		dse.addTransformationRule(KingMovesRule.getBlackKingMovesRule());

		dse.addObjective(new ConstraintsObjective("MyHardObjective")
				.withHardConstraint(InChessWhiteQuerySpecification.instance()));
		dse.addMetaModelPackage(ChessdiagramPackage.eINSTANCE);
		dse.setStateCoderFactory(new SimpleStateCoderFactory(dse.getMetaModelPackages()));
		dse.setSolutionStore(new SolutionStore(1));
	}

	public void startExploaring() throws ViatraQueryException {

		dse.startExploration(Strategies.createBfsStrategy(3));
		solutions = dse.getSolutions();
		if (!solutions.isEmpty()) {
			tra = solutions.iterator().next().getArbitraryTrajectory();
			tra.setModel(chess);
		}
		System.out.println("Size: " + solutions.size());
		System.out.println(dse.toStringSolutions());
	}

	public void doNextStep() throws ViatraQueryException {
		if (tra != null && tra.getTrajectoryLength() != 0) {
			System.out.println(tra.getCurrentIndex());
			tra.doNextTransformation();
		}
	}

	public boolean solutionsIsEmpty() {
		if (solutions == null) {
			return true;
		}
		return solutions.isEmpty();
	}
}
