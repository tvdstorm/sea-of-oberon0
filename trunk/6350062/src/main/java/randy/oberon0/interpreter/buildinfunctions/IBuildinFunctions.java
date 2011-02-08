package randy.oberon0.interpreter.buildinfunctions;

import randy.oberon0.exception.DuplicateFunctionException;
import randy.oberon0.interpreter.runtime.RuntimeEnvironment;

public interface IBuildinFunctions
{
	public void register(RuntimeEnvironment environment) throws DuplicateFunctionException;
}
