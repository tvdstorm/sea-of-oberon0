package uva.oberon0.runtime.values;

import java.util.HashMap;
import java.util.Map;
import uva.oberon0.abstractsyntax.BaseNode;
import uva.oberon0.abstractsyntax.types.BaseType;
import uva.oberon0.abstractsyntax.types.ID;
import uva.oberon0.abstractsyntax.types.RecordField;
import uva.oberon0.abstractsyntax.types.RecordType;
import uva.oberon0.runtime.Scope;

public class RecordValue extends Value 
{
	private final Map<ID, Value> _values;

	public RecordValue(Scope scope, RecordType type) {
		_values = new HashMap<ID, Value>(type.getFields().size());

		for (RecordField field : type.getFields()) {
			_values.put(field.getID(), field.getType().instantiate(scope));
		}
	}

	@Override
	public Value getValueBySelector(Scope scope, BaseNode selector) {
		ID selectorID = (ID) selector;

		Value value = _values.get(selectorID);

		if (selectorID.getSelector() != null) {
			value = value.getValueBySelector(scope, selectorID.getSelector());
		}

		return value;
	}

	public Scope createScopeForWith(Scope parentScope)
	{
		Scope resultScope = new Scope(parentScope);
		
		for (Map.Entry<ID, Value> mapEntry : _values.entrySet())
		{
			resultScope.putBindable(mapEntry.getKey(), mapEntry.getValue());
		}
		
		return resultScope;
	}
}
