package uva.oberon0.abstractsyntax.declarations;

import uva.oberon0.abstractsyntax.types.BaseType;
import uva.oberon0.abstractsyntax.types.ID;
import uva.oberon0.runtime.Scope;
import uva.oberon0.runtime.Value;


/**
 * @author Chiel Labee
 * This class represents a Variable Declaration that is passed by Value.
*/
public class Variable extends Declaration
{
	private final BaseType _type;
	private final boolean _isByReference;
	
	public Variable(ID id, BaseType type)
	{
		this(id, type, false);
	}
	public Variable(ID id, BaseType type, boolean isByReference)
	{
		super(id);

		assert type != null : "No Type available for the current Declaration!";
		
		_type = type;
		_isByReference = isByReference;
	}
	
		
	/**
	 * Gets data Type of this Variable Declaration Node.
	 */
	public BaseType getType()
	{
		return _type;
	}
	
	/**
	 * Gets an indication if this Variable should be passed By Reference or not (By Value).
	 */
	public boolean isByReference()
	{
		return _isByReference;
	}
		
	public Value instantiate(Scope scope) 
	{
		return _type.instantiate(scope);
	}
}
