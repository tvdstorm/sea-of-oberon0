package oberon.factory;

import oberon.analysis.DepthFirstAdapter;

public abstract class BaseInterpreter<TResult> extends DepthFirstAdapter {
	TResult getInterpreterResult()
	{
		return BuildInterpreterResult();
	}

	public abstract TResult BuildInterpreterResult();
}
