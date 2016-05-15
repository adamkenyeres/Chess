package dse;

import org.eclipse.viatra.dse.base.ThreadContext;
import org.eclipse.viatra.dse.objectives.IObjective;
import org.eclipse.viatra.dse.objectives.impl.BaseObjective;

import chessdiagram.Chess;

public class SimpleObjective extends BaseObjective{

	Chess chess;
	int wK,wQ,wR,wB,wN,wP = 0;
	int bK,bQ,bR,bB,bN,bP = 0;
	public SimpleObjective(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Double getFitness(ThreadContext context) {
		// TODO Auto-generated method stub
			
		return null;
	}

	@Override
	public void init(ThreadContext context) {
		// TODO Auto-generated method stub
		chess = (Chess) context.getModel();
	}

	@Override
	public IObjective createNew() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isHardObjective() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean satisifiesHardObjective(Double fitness) {
		// TODO Auto-generated method stub
		return false;
	}

}
