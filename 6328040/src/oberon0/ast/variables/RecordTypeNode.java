package oberon0.ast.variables;

import java.util.HashMap;

import oberon0.ast.expressions.IEvaluable;
import oberon0.environment.Context;
import oberon0.environment.IValue;
import oberon0.environment.RecordValue;
import oberon0.environment.Reference;

public class RecordTypeNode implements IEvaluable {
	private HashMap<String, IEvaluable> _fields;

	public RecordTypeNode(HashMap<String, IEvaluable> rec) {
		_fields = rec;
	}

	@Override
	public IValue eval(Context context) {
		HashMap<String, Reference> values = new HashMap<String, Reference>();
		for (String currentName : _fields.keySet()) {
			IValue currentField = _fields.get(currentName).eval(context);
			values.put(currentName, new Reference(currentField));
		}
		return new RecordValue(values);
	}
}
