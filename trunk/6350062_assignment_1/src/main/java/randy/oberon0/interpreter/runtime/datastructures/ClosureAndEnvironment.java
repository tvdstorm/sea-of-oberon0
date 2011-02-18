package randy.oberon0.interpreter.runtime.datastructures;

import randy.oberon0.interpreter.runtime.RuntimeEnvironment;
import randy.oberon0.interpreter.runtime.environment.Closure;

public class ClosureAndEnvironment
{
	private final Closure function;
	private final RuntimeEnvironment environment;
	
	public ClosureAndEnvironment(Closure _function, RuntimeEnvironment _environment)
	{
		assert(_function != null);
		assert(_environment != null);
		function = _function;
		environment = _environment;
	}
	public Closure getFunction()
	{
		return function;
	}
	public RuntimeEnvironment getEnvironment()
	{
		return environment;
	}
}