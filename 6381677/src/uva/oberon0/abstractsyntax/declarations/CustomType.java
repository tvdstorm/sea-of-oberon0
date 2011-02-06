package uva.oberon0.abstractsyntax.declarations;

import uva.oberon0.abstractsyntax.types.ID;
import uva.oberon0.abstractsyntax.types.Type;
import uva.oberon0.runtime.Scope;

/**
 * @author Chiel Labee
 * This class represents a declarable Type Structure.
*/
public class CustomType extends Declaration 
{
	private final Type _type;

	public CustomType(ID id, Type type) 
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
