package oberon0.ast.statements;

import java.util.Map;

import oberon0.ast.variables.selectors.ISelector;
import oberon0.environment.Context;
import oberon0.environment.RecordValue;
import oberon0.environment.Reference;
import oberon0.environment.builtinroutines.BuiltInRoutines;

public class WithNode implements IExecutable {
	private final String _name;
	private final ISelector _selector;
	private final IExecutable _body;

	public WithNode(String name, ISelector selector, IExecutable body) {
		_name = name;
		_selector = selector;
		_body = body;
	}

	@Override
	public void execute(Context context) {
		Context withContext = context;

		BuiltInRoutines builtin = new BuiltInRoutines();
		builtin.declare(withContext);

		Reference ref = _selector.deref(context, context.getReference(_name));
		RecordValue record = (RecordValue) ref.getValue();
		Map<String, Reference> fields = record.getFields();
		for (String name : fields.keySet()) {
			withContext.declareVar(name, fields.get(name));
		}
		_body.execute(withContext);
	}

}
