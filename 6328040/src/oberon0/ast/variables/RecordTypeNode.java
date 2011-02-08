package oberon0.ast.variables;

import java.util.HashMap;
import java.util.Map;

import oberon0.ast.expressions.IEvaluable;
import oberon0.environment.Context;
import oberon0.environment.IValue;
import oberon0.environment.RecordValue;
import oberon0.environment.Reference;

public class RecordTypeNode implements IEvaluable {
	private final Map<String, IEvaluable> _fields;

	public RecordTypeNode(Map<String, IEvaluable> rec) {
		if (rec != null) {
			_fields = rec;
		} else {
			_fields = new HashMap<String, IEvaluable>();
		}
	}

	@Override
	public IValue eval(Context context) {
		Map<String, Reference> values = new HashMap<String, Reference>();
		for (String currentName : _fields.keySet()) {
			IValue currentField = _fields.get(currentName).eval(context);
			values.put(currentName, new Reference(currentField));
		}
		return new RecordValue(values);
	}
}
