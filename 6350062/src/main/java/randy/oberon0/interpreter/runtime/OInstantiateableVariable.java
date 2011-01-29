package randy.oberon0.interpreter.runtime;

import randy.oberon0.exception.Oberon0RuntimeException;
import randy.oberon0.value.OValue;

public interface OInstantiateableVariable
{
	public abstract OValue instantiate(TypeRegistry _typeRegistry) throws Oberon0RuntimeException;
}