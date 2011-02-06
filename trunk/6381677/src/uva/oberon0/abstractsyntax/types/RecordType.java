package uva.oberon0.abstractsyntax.types;

import uva.oberon0.runtime.Scope;
import uva.oberon0.runtime.ScopeValue;
import uva.oberon0.runtime.ScopeValueRecord;

public class RecordType extends BaseType {

	private final RecordFieldList _fields;
	
	public RecordType(RecordFieldList fields) 
	{
		assert fields != null 	: "No Field List is available for the current Record!";

		_fields = fields;
	}

	@Override
	public ScopeValue instantiate(Scope scope) 
	{
		return new ScopeValueRecord(scope, this);
	}

	public RecordFieldList getFields() {
		return _fields;
	}

}
