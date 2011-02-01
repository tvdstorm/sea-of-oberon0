package uva.oberon0.runtime;

import uva.oberon0.abstractsyntax.BaseNode;
import uva.oberon0.abstractsyntax.ID;

/**
 * @author Chiel Labee
 * This class represents an Integer based Execution Scope Value.
*/
public class ScopeValueInt extends ScopeValueBase 
{
	public ScopeValueInt(Scope scope, int value)
	{
		_value = value;
	}
	
	private int _value;
	
	@Override
	public int getValue(Scope scope, BaseNode index) 
	{
		return _value;
	}

	@Override
	public void setValue(Scope scope, BaseNode index, int valueNew) 
	{
		_value = valueNew;
	}

	@Override
	public ScopeValueBase getValueReference(Scope scope, ID id) 
	{
		return this;
	}
}
