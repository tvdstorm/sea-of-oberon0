package randy.oberon0.interpreter.typecheck.environment;

import randy.oberon0.interpreter.runtime.IInvokableProcedure;

public class TypeCheckClosure implements ITypeCheckBindable
{
	private final IInvokableProcedure procedure;
	private final TypeCheckEnvironment environment;
	
	public TypeCheckClosure(IInvokableProcedure _procedure, TypeCheckEnvironment _environment)
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
	public TypeCheckEnvironment getEnvironment()
	{
		return environment;
	}
}
