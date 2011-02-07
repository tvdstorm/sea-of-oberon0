package uva.oberon0.abstractsyntax.declarations;

import uva.oberon0.abstractsyntax.types.ID;
import uva.oberon0.abstractsyntax.types.BaseType;

/**
 * @author Chiel Labee
 * This class represents a declarable Type Structure.
*/
public class CustomType extends Declaration
{
	private final BaseType _type;

	public CustomType(ID id, BaseType type) 
	{
		super(id);
		
		assert type != null : "No Type available for current Node!";
		
		_type = type;
	}

	public BaseType getType()
	{
		return _type;
	}
}
