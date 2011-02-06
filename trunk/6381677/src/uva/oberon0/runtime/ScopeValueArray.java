package uva.oberon0.runtime;

import uva.oberon0.abstractsyntax.BaseNode;
import uva.oberon0.abstractsyntax.types.ArrayType;
import uva.oberon0.abstractsyntax.types.ID;

/**
 * @author Chiel Labee
 * This class represents an Array based Execution Scope Value.
*/
public class ScopeValueArray extends ScopeValue 
{
	private final ScopeValue[] _values;

	public ScopeValueArray(Scope scope, ArrayType type)
	{
		int arrayLength = type.getLength().eval(scope);
		
		_values = new ScopeValue[arrayLength];
		
		for (int i = 0; i<arrayLength; i++) {
			_values[i] = type.getType().instantiate(scope);
		}
	}
	
	@Override
	public ScopeValue getValue(Scope scope, BaseNode selector)
	{
		ScopeValue value = _values[selector.eval(scope)];
		
		if (selector instanceof ID && ((ID)selector).getSelector() != null){
			value = value.getValue(scope, ((ID)selector).getSelector());
		}
		
		return value;
	}

}
