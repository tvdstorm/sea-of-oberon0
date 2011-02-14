package uva.oberon0.abstractsyntax.expressions;

import uva.oberon0.abstractsyntax.BaseNode;
import uva.oberon0.abstractsyntax.types.BaseType;
import uva.oberon0.abstractsyntax.types.ITypeCheckable;

/**
 * @author Chiel Labee
 * This class represents a Expression.
 * This class is abstract.
*/
public abstract class Expression extends BaseNode implements ITypeCheckable
{
	protected Expression(BaseType type)
	{
		assert type != null;
		
		_type = type;
	}
	private BaseType _type;
	
	/**
	 * Gets data Type of this Expression Node.
	 */
	public BaseType getType()
	{
		return _type;
	}
}
