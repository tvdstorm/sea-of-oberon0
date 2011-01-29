package randy.ast;

import randy.exception.Oberon0RuntimeException;
import randy.interpreter.preprocess.TypeRegistry;
import randy.value.OValue;

public interface OInstantiateableVariable
{
	public abstract OValue instantiate(TypeRegistry _typeRegistry) throws Oberon0RuntimeException;
}
