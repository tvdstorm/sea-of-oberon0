package oberon0.ast.statements;

import oberon0.ast.expressions.IEvaluable;
import oberon0.ast.variables.selectors.ISelector;
import oberon0.environment.Context;
import oberon0.environment.IValue;
import oberon0.environment.Reference;

public class AssignmentNode implements IExecutable {
	String _name;
	ISelector _selector;
	IEvaluable _expression;
	
	
	public AssignmentNode(String name, ISelector selec, IEvaluable expression) {
		_name = name;
		_selector = selec;
		_expression = expression;
	}

	@Override
	public void execute(Context context) {
		IValue value = _expression.eval(context);
		Reference ref= context.getReference(_name);
		ref = _selector.refer(context, ref);
		ref.setValue(value);
	}

}
