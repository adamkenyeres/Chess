package chessdiagram.generator;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Timer;
import java.util.TimerTask;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.viatra.dse.api.DSETransformationRule;
import org.eclipse.viatra.dse.api.DesignSpaceExplorer;
import org.eclipse.viatra.dse.api.Solution;
import org.eclipse.viatra.dse.api.SolutionTrajectory;
import org.eclipse.viatra.dse.api.Strategies;
import org.eclipse.viatra.dse.base.DesignSpaceManager;
import org.eclipse.viatra.dse.objectives.impl.ConstraintsObjective;
import org.eclipse.viatra.dse.statecoding.simple.SimpleStateCoderFactory;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.junit.Test;

import chess.queries.WhitePawnMovesMatch;
import chess.queries.WhitePawnMovesMatcher;
import chess.queries.util.InChessBlackQuerySpecification;
import chess.queries.util.InChessWhiteQuerySpecification;
import chess.queries.util.WhitePawnMovesProcessor;
import chess.queries.util.WhitePawnMovesQuerySpecification;
import chessdiagram.Chess;
import chessdiagram.ChessdiagramFactory;
import chessdiagram.ChessdiagramPackage;
import chessdiagram.Colour;
import chessdiagram.Pawn;
import chessdiagram.PieceType;
import chessdiagram.Queen;
import chessdiagram.Square;
import dse.ChessStateCoderFactory;
import model.transformation.BlackPawnMovesRule;
import model.transformation.QueenMovesRule;
import model.transformation.WhitePawnMovesRule;

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
		DSETransformationRule<?, ?> blackPawnRule = BlackPawnMovesRule.getBlackPawnMovesRule(chess);
		DesignSpaceExplorer dse = new DesignSpaceExplorer();
		dse.setInitialModel(chess);
		dse.addTransformationRule(blackPawnRule);
		dse.addObjective(new ConstraintsObjective("MyHardObjective")
				.withHardConstraint(InChessWhiteQuerySpecification.instance())
				.withSoftConstraint(InChessWhiteQuerySpecification.instance(), 0.2));
		dse.addMetaModelPackage(ChessdiagramPackage.eINSTANCE);
//		dse.setStateCoderFactory(new SimpleStateCoderFactory(dse.getMetaModelPackages()));
		dse.setStateCoderFactory(new ChessStateCoderFactory());
		dse.startExploration(Strategies.createBfsStrategy(4));
		Collection<Solution> solutions = dse.getSolutions();
		if (!solutions.isEmpty()) {
			System.out.println(dse.toStringSolutions());
//			Solution sol = solutions.iterator().next();
//			tra = sol.getArbitraryTrajectory();
//			tra.setModel(chess);
//			startTimer();
		}
		System.in.read();
	}

}
