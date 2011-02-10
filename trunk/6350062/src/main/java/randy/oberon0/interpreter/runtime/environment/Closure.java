package randy.oberon0.interpreter.runtime.environment;

import randy.oberon0.interpreter.runtime.IInvokableProcedure;

public class Closure implements IBindable
{
	private final IInvokableProcedure procedure;
	private final RuntimeEnvironment environment;
	
	public Closure(IInvokableProcedure _procedure, RuntimeEnvironment _environment)
	{
		assert(_procedure != null);
		assert(_environment != null);
		procedure = _procedure;
		environment = _environment;
	}
	public IInvokableProcedure getProcedure()
	{
		return procedure;
	}
	public RuntimeEnvironment getEnvironment()
	{
		return environment;
	}
}
