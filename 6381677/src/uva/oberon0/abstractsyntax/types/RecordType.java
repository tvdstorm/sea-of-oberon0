package uva.oberon0.abstractsyntax.types;

import uva.oberon0.runtime.Scope;
import uva.oberon0.runtime.values.Value;
import uva.oberon0.runtime.values.RecordValue;

public class RecordType extends BaseType {

	private final RecordFieldList _fields;
	
	public RecordType(RecordFieldList fields) 
	{
		assert fields != null 	: "No Field List is available for the current Record!";

		_fields = fields;
	}

	@Override
	public Value instantiate(Scope scope) 
	{
		return new RecordValue(scope, this);
	}

	public RecordFieldList getFields() {
		return _fields;
	}

}
