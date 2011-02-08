package oberon0.ast.variables.selectors;

import oberon0.environment.Context;
import oberon0.environment.RecordValue;
import oberon0.environment.Reference;

public class SelectorRecordNode implements ISelector {
	private final String _fieldName;

	public SelectorRecordNode(String fieldName) {
		_fieldName = fieldName;
	}

	@Override
	public Reference deref(Context context, Reference previousRef) {
		RecordValue selectorValue = (RecordValue) previousRef.getValue();
		return selectorValue.getReference(_fieldName);
	}
}
