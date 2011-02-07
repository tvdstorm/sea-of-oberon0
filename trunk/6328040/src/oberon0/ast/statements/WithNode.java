package oberon0.ast.statements;

import java.util.HashMap;

import oberon0.ast.variables.selectors.ISelector;
import oberon0.environment.Context;
import oberon0.environment.RecordValue;
import oberon0.environment.Reference;
import oberon0.environment.builtinroutines.BuiltInRoutines;

public class WithNode implements IExecutable {
	private String _name;
	private ISelector _selector;
	private IExecutable _body;

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
		
		Reference ref = _selector.refer(context, context.getReference(_name));
		HashMap<String, Reference> fields = ((RecordValue)ref.getValue()).getFields();
		for (String name: fields.keySet()){
			withContext.declareReferenceVariable(name, fields.get(name));
		}
		_body.execute(withContext);
	}

}
