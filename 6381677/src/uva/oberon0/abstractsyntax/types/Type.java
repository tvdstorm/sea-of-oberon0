package uva.oberon0.abstractsyntax.types;

import uva.oberon0.runtime.Scope;
import uva.oberon0.runtime.ScopeValue;

public abstract class Type
{
	public abstract ScopeValue instantiate(Scope scope);
}
