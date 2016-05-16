package dse;

import java.util.Collection;
import java.util.Random;

import org.eclipse.viatra.dse.api.DSETransformationRule;
import org.eclipse.viatra.dse.api.DesignSpaceExplorer;
import org.eclipse.viatra.dse.api.Solution;
import org.eclipse.viatra.dse.api.SolutionTrajectory;
import org.eclipse.viatra.dse.objectives.Comparators;
import org.eclipse.viatra.dse.objectives.impl.ConstraintsObjective;
import org.eclipse.viatra.dse.statecoding.simple.SimpleStateCoderFactory;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;

import chess.queries.util.BlackBishopsQuerySpecification;
import chess.queries.util.BlackKingsQuerySpecification;
import chess.queries.util.BlackKnightsQuerySpecification;
import chess.queries.util.BlackPawnsQuerySpecification;
import chess.queries.util.BlackPlayerTurnQuerySpecification;
import chess.queries.util.BlackQueensQuerySpecification;
import chess.queries.util.BlackRooksQuerySpecification;
import chess.queries.util.NumberOfStepsEqualsThreeQuerySpecification;
import chess.queries.util.WhiteBishopsQuerySpecification;
import chess.queries.util.WhiteKingsQuerySpecification;
import chess.queries.util.WhiteKnightsQuerySpecification;
import chess.queries.util.WhitePawnsQuerySpecification;
import chess.queries.util.WhitePlayerTurnQuerySpecification;
import chess.queries.util.WhiteQueensQuerySpecification;
import chess.queries.util.WhiteRooksQuerySpecification;
import chessdiagram.Chess;
import chessdiagram.ChessdiagramPackage;
import chessdiagram.Piece;
import model.transformation.BishopMovesRule;
import model.transformation.BlackKnightRule;
import model.transformation.BlackPawnMovesRule;
import model.transformation.KingMovesRule;
import model.transformation.ModelTransformation;
import model.transformation.QueenMovesRule;
import model.transformation.RookMovesRule;
import model.transformation.WhiteKnightRule;
import model.transformation.WhitePawnMovesRule;

public class ChessEngine extends Thread {
	private SolutionTrajectory tra;
	private Chess chess;
	private DesignSpaceExplorer dse;
	private Collection<Solution> solutions;
	/*---------Rules-----------*/
	/* Black moves Rules */
	DSETransformationRule<?, ?> blackPawnMovesRule;
	DSETransformationRule<?, ?> blackRookMovesRule;
	DSETransformationRule<?, ?> blackKnightMovesRule;
	DSETransformationRule<?, ?> blackBishopMovesRule;
	DSETransformationRule<?, ?> blackQueenMovesRule;
	DSETransformationRule<?, ?> blackKingMovesRule;
	/* White moves Rules */
	DSETransformationRule<?, ?> whitePawnMovesRule;
	DSETransformationRule<?, ?> whiteRookMovesRule;
	DSETransformationRule<?, ?> whiteKnightMovesRule;
	DSETransformationRule<?, ?> whiteBishopMovesRule;
	DSETransformationRule<?, ?> whiteQueenMovesRule;
	DSETransformationRule<?, ?> whiteKingMovesRule;
	ModelTransformation transformation;

	public ChessEngine(Chess chess, ModelTransformation trans) throws ViatraQueryException {
		// TODO Auto-generated constructor stub
		this.chess = chess;
		tra = null;
		solutions = null;
		this.transformation = trans;
		initializeRules(); // Initializing the rules
		dse = new DesignSpaceExplorer();
		chess.setStepsBeforeExlpoaring(chess.getNumberOfSteps());
		dse.setInitialModel(chess);

		dse.addTransformationRule(blackPawnMovesRule);
		dse.addTransformationRule(blackRookMovesRule);
		dse.addTransformationRule(blackKnightMovesRule);
		dse.addTransformationRule(blackBishopMovesRule);
		dse.addTransformationRule(blackQueenMovesRule);
		dse.addTransformationRule(blackKingMovesRule);

		dse.addTransformationRule(whitePawnMovesRule);
		dse.addTransformationRule(whiteRookMovesRule);
		dse.addTransformationRule(whiteKnightMovesRule);
		dse.addTransformationRule(whiteBishopMovesRule);
		dse.addTransformationRule(whiteQueenMovesRule);
		dse.addTransformationRule(whiteKingMovesRule);
		// dse.addObjective(new ConstraintsObjective("MyHardObjective")
		// .withHardConstraint(InChessWhiteQuerySpecification.instance()));

		dse.addObjective(new ConstraintsObjective("White Hitting pieces")
				.withHardConstraint(WhitePlayerTurnQuerySpecification.instance())
				.withSoftConstraint(WhitePawnsQuerySpecification.instance(), -1)
				.withSoftConstraint(BlackPawnsQuerySpecification.instance(), 1)
				.withSoftConstraint(WhiteRooksQuerySpecification.instance(), -5)
				.withSoftConstraint(BlackRooksQuerySpecification.instance(), 5)
				.withSoftConstraint(WhiteKnightsQuerySpecification.instance(), -3)
				.withSoftConstraint(BlackKnightsQuerySpecification.instance(), 3)
				.withSoftConstraint(WhiteBishopsQuerySpecification.instance(), -3)
				.withSoftConstraint(BlackBishopsQuerySpecification.instance(), 3)
				.withSoftConstraint(WhiteQueensQuerySpecification.instance(), -9)
				.withSoftConstraint(BlackQueensQuerySpecification.instance(), 9)
				.withSoftConstraint(WhiteKingsQuerySpecification.instance(), -200)
				.withSoftConstraint(BlackKingsQuerySpecification.instance(), 200)
				.withComparator(Comparators.LOWER_IS_BETTER));
		
		dse.addObjective(new ConstraintsObjective("Black Hitting pieces")
				.withHardConstraint(BlackPlayerTurnQuerySpecification.instance())
				.withHardConstraint(NumberOfStepsEqualsThreeQuerySpecification.instance())
				.withSoftConstraint(WhitePawnsQuerySpecification.instance(), -1)
				.withSoftConstraint(BlackPawnsQuerySpecification.instance(), 1)
				.withSoftConstraint(WhiteRooksQuerySpecification.instance(), -5)
				.withSoftConstraint(BlackRooksQuerySpecification.instance(), 5)
				.withSoftConstraint(WhiteKnightsQuerySpecification.instance(), -3)
				.withSoftConstraint(BlackKnightsQuerySpecification.instance(), 3)
				.withSoftConstraint(WhiteBishopsQuerySpecification.instance(), -3)
				.withSoftConstraint(BlackBishopsQuerySpecification.instance(), 3)
				.withSoftConstraint(WhiteQueensQuerySpecification.instance(), -9)
				.withSoftConstraint(BlackQueensQuerySpecification.instance(), 9)
				.withSoftConstraint(WhiteKingsQuerySpecification.instance(), -200)
				.withSoftConstraint(BlackKingsQuerySpecification.instance(), 200)
				.withComparator(Comparators.HIGHER_IS_BETTER));

		dse.addMetaModelPackage(ChessdiagramPackage.eINSTANCE);
		dse.setStateCoderFactory(new SimpleStateCoderFactory(dse.getMetaModelPackages()));
		// dse.setStateCoderFactory(new ChessStateCoderFactory());
		// dse.setSolutionStore(new SolutionStore(100));
		// dse.setSolutionStore(new SolutionStore(1));
		dse.setMaxNumberOfThreads(1);
	}

	public void initializeRules() throws ViatraQueryException {
		blackPawnMovesRule = BlackPawnMovesRule.getBlackPawnMovesRule();
		blackRookMovesRule = RookMovesRule.getBlackRookMovesRule();
		blackKnightMovesRule = BlackKnightRule.getBlackKnightMovesRule();
		blackBishopMovesRule = BishopMovesRule.getBlackBishopMovesRule();
		blackQueenMovesRule = QueenMovesRule.getBlackQueenMovesRule();
		blackKingMovesRule = KingMovesRule.getBlackKingMovesRule();

		whitePawnMovesRule = WhitePawnMovesRule.getWhitePawnMovesRule();
		whiteKnightMovesRule = WhiteKnightRule.getWhiteKnightMovesRule();
		whiteRookMovesRule = RookMovesRule.getWhiteRookMovesRule();
		whiteBishopMovesRule = BishopMovesRule.getWhiteBishopMovesRule();
		whiteQueenMovesRule = QueenMovesRule.getWhiteQueenMovesRule();
		whiteKingMovesRule = KingMovesRule.getWhiteKingMovesRule();
	}

	public void startExploaring() throws ViatraQueryException {

//		dse.startExploration(Strategies.createDFSStrategy(2));
		solutions = dse.getSolutions();
		if (!solutions.isEmpty()) {
			SolutionTrajectory bestTra = null;
			for (Solution sol : solutions) {
				System.out.println("length " + sol.getArbitraryTrajectory().getTrajectoryLength());
				if (sol.getArbitraryTrajectory().getFitness().get("Hitting pieces") >= 0) {
					if (bestTra == null) {
						bestTra = sol.getShortestTrajectory();
					} else if (bestTra.getFitness().get("Hitting pieces") < sol.getArbitraryTrajectory().getFitness()
							.get("Hitting pieces")) {
						System.out.println("Best before: " + bestTra.getFitness());
						bestTra = sol.getShortestTrajectory();
						System.out.println("Best after: " + bestTra.getFitness());
					}
				}
			}
			if (bestTra != null) {
				tra = bestTra;
				System.out.println(tra.toPrettyString());
			} else {
				tra = solutions.iterator().next().getArbitraryTrajectory();
			}
			tra.setModel(chess);
		}
	}

	public void doNextStep() throws ViatraQueryException {
		if (tra != null && tra.getTrajectoryLength() != 0) {
			tra.doNextTransformation();
		}
	}

	public boolean solutionsIsEmpty() {
		if (solutions == null) {
			return true;
		}
		return solutions.isEmpty();
	}

	public void run() {

		if (solutionsIsEmpty()) {
			try {
				startExploaring();
				doNextStep();
			} catch (ViatraQueryException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			while (!chess.isWhitePlayerTurn() && chess.getBlackPlayer().getPiece() != null) {
				Random rand = new Random();
				int index = rand.nextInt(chess.getBlackPlayer().getPiece().size());
				Piece piece = chess.getBlackPlayer().getPiece().get(index);
				transformation.moveBlackPieceRandomly(piece);
			}

		}
	}
}
