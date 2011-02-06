package uva.oberon0.abstractsyntax.types;

import uva.oberon0.runtime.Scope;
import uva.oberon0.runtime.ScopeValue;

public class Record extends Type {

	private final RecordFieldList _fields;
	
	public Record(RecordFieldList fields) 
	{
		assert fields != null 	: "No Field List is available for the current Record!";

		_fields = fields;
	}

	@Override
	public ScopeValue instantiate(Scope scope) {
		return null;
	}

}
