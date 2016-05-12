package dse;

import org.eclipse.viatra.dse.statecode.IStateCoder;
import org.eclipse.viatra.dse.statecode.IStateCoderFactory;

public class ChessStateCoderFactory implements IStateCoderFactory {

	@Override
	public IStateCoder createStateCoder() {
		// TODO Auto-generated method stub
		return new ChessStateCoder();
	}

}
