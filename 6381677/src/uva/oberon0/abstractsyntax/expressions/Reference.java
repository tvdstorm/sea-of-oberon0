package uva.oberon0.abstractsyntax.expressions;

import uva.oberon0.abstractsyntax.types.ID;
import uva.oberon0.abstractsyntax.types.IIdentifiable;
import uva.oberon0.runtime.Scope;

public class Reference extends Expression implements IIdentifiable 
{
	private final ID _id;
	
	public Reference(ID id) 
	{
		_id = id;
	}

	@Override
	public int eval(Scope scope) 
	{
		return scope.getValue(_id);
	}

	@Override
	public ID getID() {
		return _id;
	}

}
