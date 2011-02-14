package uva.oberon0.abstractsyntax.declarations;

import uva.oberon0.abstractsyntax.types.ID;
import uva.oberon0.abstractsyntax.types.BaseType;
import uva.oberon0.abstractsyntax.types.ITypeCheckable;

/**
 * @author Chiel Labee
 * This class represents a declarable Type Structure.
*/
public class CustomType extends Declaration implements ITypeCheckable
{
	private final BaseType _type;

	public CustomType(ID id, BaseType type) 
	{
		super(id);
		
		assert type != null : "No Type available for current Node!";
		
		_type = type;
	}

	/**
	 * Gets data Type declared within this Node.
	 */
	public BaseType getType()
	{
		return _type;
	}
}
