package randy.oberon0.interpreter.buildinfunctions;

import randy.oberon0.exception.DuplicateFunctionException;
import randy.oberon0.interpreter.runtime.FunctionRegistry;
import randy.oberon0.interpreter.runtime.RuntimeEnvironment;

public interface IBuildinFunctions
{
	public void register(FunctionRegistry functionRegistry, RuntimeEnvironment environment) throws DuplicateFunctionException;
}
