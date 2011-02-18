package randy.oberon0.interpreter.runtime.environment;

import randy.oberon0.interpreter.runtime.IInvokableFunction;
import randy.oberon0.interpreter.runtime.RuntimeEnvironment;

public class Closure implements IBindable
{
	// TODO: function OVERAL procedure noemen!
	private final IInvokableFunction function;
	private final RuntimeEnvironment environment;
	
	public Closure(IInvokableFunction _function, RuntimeEnvironment _environment)
	{
		assert(_function != null);
		assert(_environment != null);
		function = _function;
		environment = _environment;
	}
	public IInvokableFunction getFunction()
	{
		return function;
	}
	public RuntimeEnvironment getEnvironment()
	{
		return environment;
	}
}
