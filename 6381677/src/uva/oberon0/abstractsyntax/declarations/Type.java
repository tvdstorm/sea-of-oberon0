package uva.oberon0.abstractsyntax.declarations;

import uva.oberon0.abstractsyntax.types.ID;
import uva.oberon0.runtime.Scope;

public class Type extends Declaration 
{
	private final Type _type;

	public Type(ID id, Type type) 
	{
		super(id);
		
		assert type != null : "No Type available for current Node!";
		
		_type = type;
	}

	public Type getType()
	{
		return _type;
	}
	
	@Override
	public int eval(Scope scope) 
	{
		return 0;
	}

}
