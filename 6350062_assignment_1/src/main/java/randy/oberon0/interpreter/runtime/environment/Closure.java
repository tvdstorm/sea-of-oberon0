package randy.oberon0.interpreter.runtime.environment;

import randy.oberon0.interpreter.runtime.IInvokableFunction;

public class Closure implements IBindable
{
	// TODO: function OVERAL procedure noemen!
	private final IInvokableFunction function;
	
	public Closure(IInvokableFunction _function)
	{
		assert(_function != null);
		function = _function;
	}
	public IInvokableFunction getFunction()
	{
		return function;
	}
}
