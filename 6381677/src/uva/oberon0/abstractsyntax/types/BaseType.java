package uva.oberon0.abstractsyntax.types;

import uva.oberon0.abstractsyntax.BaseNode;
import uva.oberon0.runtime.Scope;
import uva.oberon0.runtime.ScopeValueBase;

public abstract class BaseType extends BaseNode 
{
	@Override
	public int eval(Scope scope) 
	{
		return 0;
	}
	
	public abstract ScopeValueBase instantiate(Scope scope);
}
