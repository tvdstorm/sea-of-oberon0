package randy.oberon0.interpreter.typecheck;

import randy.oberon0.ast.IInvokableFunction;

public class TypeCheckClosure implements ITypeCheckBindable
{
	private final IInvokableFunction procedure;
	private final TypeCheckEnvironment environment;
	
	public TypeCheckClosure(IInvokableFunction _procedure, TypeCheckEnvironment _environment)
	{
		assert(_procedure != null);
		assert(_environment != null);
		procedure = _procedure;
		environment = _environment;
	}
	public IInvokableFunction getProcedure()
	{
		return procedure;
	}
	public TypeCheckEnvironment getEnvironment()
	{
		return environment;
	}
}
