package uva.oberon0.abstractsyntax.declarations;

import uva.oberon0.abstractsyntax.ID;
import uva.oberon0.abstractsyntax.types.BaseType;
import uva.oberon0.runtime.Scope;
import uva.oberon0.runtime.ScopeValueBase;


/**
 * @author Chiel Labee
 * This class represents a Variable Declaration that is passed by Value.
*/
public class ProcedureParameter extends BaseDeclaration
{
	private final BaseType _type;

	public ProcedureParameter(ID id, BaseType type)
	{
		super(id);

		assert type != null : "No Type available for the current Declaration!";
		
		_type = type;
	}
	
		
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
	
	public ScopeValueBase instantiate(Scope scope) 
	{
		return _type.instantiate(scope);
	}
}
