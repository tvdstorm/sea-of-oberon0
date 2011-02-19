package randy.oberon0.interpreter.runtime.environment;

import randy.oberon0.exception.RuntimeException;
import randy.oberon0.value.Value;

public class AliasInstantiation implements IInstantiateableVariable
{
	private final String resolvesTo;
	
	public AliasInstantiation(String _resolvesTo)
	{
		assert(_resolvesTo != null);
		assert(_resolvesTo.length() > 0);
		resolvesTo = _resolvesTo;
	}
	public Value instantiate(RuntimeEnvironment environment) throws RuntimeException
	{
		IInstantiateableVariable type = (IInstantiateableVariable)environment.lookup(resolvesTo);
		return type.instantiate(environment);
	}
}
