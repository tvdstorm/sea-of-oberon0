package uva.oberon0.abstractsyntax.types;

import uva.oberon0.runtime.IBindable;
import uva.oberon0.runtime.Scope;
import uva.oberon0.runtime.Value;

public abstract class BaseType implements IBindable
{
	public abstract Value instantiate(Scope scope);
}
