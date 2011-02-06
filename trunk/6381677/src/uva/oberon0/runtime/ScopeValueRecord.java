package uva.oberon0.runtime;

import java.util.HashMap;
import java.util.Map;

import uva.oberon0.abstractsyntax.BaseNode;
import uva.oberon0.abstractsyntax.types.ID;
import uva.oberon0.abstractsyntax.types.RecordField;
import uva.oberon0.abstractsyntax.types.RecordType;

public class ScopeValueRecord extends ScopeValue {

	private final Map<ID, ScopeValue> _values;

	public ScopeValueRecord(Scope scope, RecordType type)
	{
		_values = new HashMap<ID, ScopeValue>(type.getFields().size());
		
		for (RecordField field : type.getFields())
		{
			_values.put(field.getID(), field.getType().instantiate(scope));
		}
	}
	
	@Override
	public ScopeValue getValue(Scope scope, BaseNode selector) {
		ID selectorID = (ID)selector;
		
		ScopeValue value = _values.get(selectorID);
		
		if (selectorID.getSelector() != null){
			value = value.getValue(scope, selectorID.getSelector());
		}
		
		return value;
	}
	
}
