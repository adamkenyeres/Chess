package chessdiagram.generator;

import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.viatra.dse.api.SolutionTrajectory;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.junit.Test;

import chessdiagram.Chess;

public class TestingClass {
	SolutionTrajectory tra;
	BoardVisualizer board;
	Generator chessdiagram;
	Chess chess;
	Timer timerTrajereo;

	public TestingClass() {
		tra = null;
	}

	private class DoTransformationTimer extends TimerTask {

		public void run() {
			try {
				if (tra != null && tra.getTrajectoryLength() != 0) {
					System.out.println(tra.getCurrentIndex());
					tra.doNextTransformation();
					board.refresh();
					System.out.println("pos: " + chess.getWhitePlayer().getPiece().get(0).getPos());
					if (tra.getCurrentIndex() == tra.getTrajectoryLength())
						stopTimer();
				}
			} catch (ViatraQueryException | ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void startTimer() {
		timerTrajereo = new Timer();
		timerTrajereo.schedule(new DoTransformationTimer(), 0, 800);

	}

	public void stopTimer() {
		timerTrajereo.cancel();
	}

	public void initialize() throws ViatraQueryException {
		chessdiagram = new Generator();
		chessdiagram.init();
		chess = chessdiagram.createChess();
		URI uri = URI.createFileURI("C:/Users/Adam/chessInit.chess");
		Resource resource = chessdiagram.createResource(uri);
		resource.getContents().add(chess);
		chessdiagram.saveResource(resource);

		board = new BoardVisualizer(chess, resource);
	}

	@Test
	public void test() throws ViatraQueryException, IOException, ExecutionException {
		initialize();
		board.refresh();
//		ChessEngine engine = new ChessEngine(chess);
//		engine.startExploaring();
//		if(!engine.solutionsIsEmpty()){
//			engine.doNextStep();
//			board.refresh();
//		}
		/*
		DesignSpaceExplorer dse = new DesignSpaceExplorer();
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
//		dse.setStateCoderFactory(new ChessStateCoderFactory());
		dse.setSolutionStore(new SolutionStore(1));
		dse.startExploration(Strategies.createBfsStrategy(3));
		Collection<Solution> solutions = dse.getSolutions();
		System.out.println("size: "+solutions.size());
		if (!solutions.isEmpty()) {
			System.out.println(dse.toStringSolutions());
			Solution sol = solutions.iterator().next();
			tra = sol.getArbitraryTrajectory();
			tra.setModel(chess);
			startTimer();
		}
		
		*/
		System.in.read();
	}

}
