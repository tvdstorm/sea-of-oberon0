package randy.oberon0.ast.selector;

import randy.oberon0.exception.RuntimeException;
import randy.oberon0.interpreter.runtime.RuntimeEnvironment;
import randy.oberon0.interpreter.runtime.environment.Reference;
import randy.oberon0.interpreter.typecheck.*;

public class VariableSelector extends Selector
{
	private final String variableName;
	
	public VariableSelector(String _variableName)
	{
		assert(_variableName != null);
		variableName = _variableName;
	}
	@Override
	public Reference evaluate(RuntimeEnvironment environment) throws RuntimeException
	{
		assert(environment != null);
		// Retrieve the value of the variable and return it
		return (Reference)environment.lookup(variableName);
	}
	@Override
	public TypeCheckReference typeCheck(TypeCheckEnvironment environment) throws RuntimeException
	{
		assert(environment != null);
		// Retrieve the value of the variable and return it
		return (TypeCheckReference)environment.lookup(variableName);
	}
}
