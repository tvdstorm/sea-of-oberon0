package uva.oberon0.runtime;

import uva.oberon0.abstractsyntax.BaseNode;
import uva.oberon0.abstractsyntax.ID;
import uva.oberon0.abstractsyntax.types.ArrayType;

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
	public int getValue(Scope scope, BaseNode index) 
	{
		if (index instanceof ID)
			return _value[((ID)index).getSub(scope)].getValue(scope, ((ID)index).getSub());
		
		else
			return _value[index.eval(scope)].getValue(scope, null);
			
	}
	
	@Override
	public void setValue(Scope scope, BaseNode index, int valueNew)
	{
		if (index instanceof ID)
			_value[((ID)index).getSub(scope)].setValue(scope, ((ID)index).getSub(), valueNew);
		else
			_value[index.eval(scope)].setValue(scope, null, valueNew);
			
	}

	@Override
	public ScopeValueBase getValueReference(Scope scope, ID id)
	{
		if (id.getSub() == null)
			return this;
		
		return _value[id.getSub(scope)];
	}

}