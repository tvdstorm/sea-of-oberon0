package randy.ast;

import randy.exception.Oberon0RuntimeException;
import randy.value.OValue;

public interface OInstantiateableVariable
{
	public abstract OValue instantiate() throws Oberon0RuntimeException;
}
