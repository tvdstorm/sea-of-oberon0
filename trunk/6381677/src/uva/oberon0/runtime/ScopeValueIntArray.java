package uva.oberon0.runtime;

import uva.oberon0.abstractsyntax.BaseNode;
import uva.oberon0.abstractsyntax.ID;
import uva.oberon0.abstractsyntax.declarations.Var;
import uva.oberon0.abstractsyntax.types.ArrayType;

/**
 * @author Chiel Labee
 * This class represents an Integer Array based Execution Scope Value.
*/
public class ScopeValueIntArray extends ScopeValueBase 
{
	public ScopeValueIntArray(Scope scope, ArrayType type)
	{
		int arrayLength = type.getLength().eval(scope);
		_value = new ScopeValueInt[arrayLength];
		for (int i = 0; i<arrayLength; i++)
			_value[i] = new ScopeValueInt(scope, 0);
	}
	
	private ScopeValueInt[] _value;

	@Override
	public int getValue(Scope scope, BaseNode index) 
	{
		if (index instanceof ID)
			return _value[((ID)index).getIndex(scope)].getValue(scope, ((ID)index).getIndex());
		
		else
			return _value[index.eval(scope)].getValue(scope, null);
			
	}
	
	@Override
	public void setValue(Scope scope, BaseNode index, int valueNew)
	{
		if (index instanceof ID)
			_value[((ID)index).getIndex(scope)].setValue(scope, ((ID)index).getIndex(), valueNew);
		else
			_value[index.eval(scope)].setValue(scope, null, valueNew);
			
	}

	@Override
	public ScopeValueBase getValueReference(Scope scope, ID id)
	{
		if (id.getIndex() == null)
			return this;
		
		return _value[id.getIndex(scope)];
	}

}
