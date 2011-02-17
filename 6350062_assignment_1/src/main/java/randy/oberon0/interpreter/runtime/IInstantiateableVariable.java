package randy.oberon0.interpreter.runtime;

import randy.oberon0.exception.RuntimeException;
import randy.oberon0.value.Value;

public interface IInstantiateableVariable
{
	public abstract Value instantiate(RuntimeEnvironment environment) throws RuntimeException;
}
