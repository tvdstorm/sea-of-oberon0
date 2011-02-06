package uva.oberon0.abstractsyntax.declarations;

import uva.oberon0.abstractsyntax.ID;
import uva.oberon0.runtime.Scope;

public class Type extends BaseDeclaration 
{
	private final Type _type;

	public Type(ID id, Type type) 
	{
		super(id);
		
		assert type != null : "No Type available for current Node!";
		
		_type = type;
	}

	@Override
	public int eval(Scope scope) 
	{
		return 0;
	}

}
