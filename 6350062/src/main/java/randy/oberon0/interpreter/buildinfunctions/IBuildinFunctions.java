package randy.oberon0.interpreter.buildinfunctions;

import randy.oberon0.exception.Exception;
import randy.oberon0.interpreter.runtime.FunctionRegistry;

public interface IBuildinFunctions
{
	public void register(FunctionRegistry functionRegistry) throws Exception;
}
