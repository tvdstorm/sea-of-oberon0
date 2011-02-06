package uva.oberon0.runtime;

import uva.oberon0.abstractsyntax.types.ID;

/**
 * @author Chiel Labee
 * This class represents an Integer based Execution Scope Value.
*/
public class ScopeValueInt extends ScopeValueBase 
{
	private int _value;
	
	public ScopeValueInt(Scope scope)
	{
		_value = 0;
	}
	public ScopeValueInt(Scope scope, int value)
	{
		_value = value;
	}
	
	@Override
	public int getValue(Scope scope) 
	{
		return _value;
	}

	@Override
	public void setValue(Scope scope, int valueNew) 
	{
		_value = valueNew;
	}

	@Override
	public ScopeValueBase getValueReference(Scope scope, ID id) 
	{
		return this;
	}
}
