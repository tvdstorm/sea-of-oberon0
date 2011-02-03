package oberon.interpret;

import oberon.analysis.DepthFirstAdapter;

public abstract class AbstractBaseInterpreter<TResult> extends DepthFirstAdapter {
	protected TResult getInterpreterResult() {
		return buildInterpreterResult();
	}

	public abstract TResult buildInterpreterResult();
}
