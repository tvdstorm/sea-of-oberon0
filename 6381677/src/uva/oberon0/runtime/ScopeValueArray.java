package uva.oberon0.runtime;

import uva.oberon0.abstractsyntax.types.ArrayType;
import uva.oberon0.abstractsyntax.types.ID;

/**
 * @author Chiel Labee
 * This class represents an Array based Execution Scope Value.
*/
public class ScopeValueArray extends ScopeValueBase 
{
	public ScopeValueArray(Scope scope, ArrayType type)
	{
		int arrayLength = type.getLength().eval(scope);
		
		_value = new ScopeValueBase[arrayLength];
		
		for (int i = 0; i<arrayLength; i++)
			_value[i] = type.getType().instantiate(scope);
	}
	
	private ScopeValueBase[] _value;

	@Override
	public int getValue(Scope scope) 
	{
		return 0;
	}
	
	@Override
	public void setValue(Scope scope, int valueNew)
	{		
	}

	@Override
	public ScopeValueBase getValueReference(Scope scope, ID id)
	{
		if (id.getSub() == null)
			return this;
		
		return _value[id.getSub(scope)];
	}

}
