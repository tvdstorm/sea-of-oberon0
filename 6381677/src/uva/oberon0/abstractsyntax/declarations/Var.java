package uva.oberon0.abstractsyntax.declarations;

import uva.oberon0.abstractsyntax.ID;
import uva.oberon0.abstractsyntax.types.BaseType;
import uva.oberon0.runtime.Scope;


/**
 * @author Chiel Labee
 * This class represents a Variable Declaration Node that is passed by Value.
*/
public class Var extends BaseDeclaration
{
	public Var(ID id, BaseType type)
	{
		super(id);

		_type = type;
	}
	
	
	private BaseType _type = null;
	
	/**
	 * Gets data Type of this Variable Declaration Node.
	 */
	public BaseType getType()
	{
		return _type;
	}
	
	@Override
	public int eval(Scope scope) 
	{
		return 0;
	}
}
