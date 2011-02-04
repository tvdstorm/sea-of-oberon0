package oberon0.ast.variables;

import oberon0.environment.Context;
import oberon0.environment.IValue;
import oberon0.environment.RecordValue;
import oberon0.environment.Reference;

public class SelectorRecordNode implements ISelector{
	private String _fieldName;

	public SelectorRecordNode(String fieldName){
		_fieldName = fieldName;
	}

	@Override
	public IValue eval(Context context) {
		//shouldn't happen
		return null;
	}

	@Override
	public Reference refer(Context context, Reference previousRef) {
		RecordValue selectorValue = (RecordValue) previousRef.getValue();
		return selectorValue.getReference(_fieldName);
	}
}
