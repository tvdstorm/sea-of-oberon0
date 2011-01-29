package randy.oberon0.interpreter.buildinfunctions;

import randy.oberon0.exception.Oberon0Exception;
import randy.oberon0.interpreter.runtime.FunctionRegistry;

public interface IOberon0BuildinFunctions
{
	public void register(FunctionRegistry functionRegistry) throws Oberon0Exception;
}
