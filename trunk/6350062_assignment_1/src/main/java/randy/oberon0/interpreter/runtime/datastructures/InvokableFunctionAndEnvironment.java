package randy.oberon0.interpreter.runtime.datastructures;

import randy.oberon0.interpreter.runtime.IInvokableFunction;
import randy.oberon0.interpreter.runtime.RuntimeEnvironment;

public class InvokableFunctionAndEnvironment
{
	private final IInvokableFunction function;
	private final RuntimeEnvironment environment;
	
	public InvokableFunctionAndEnvironment(IInvokableFunction _function, RuntimeEnvironment _environment)
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
