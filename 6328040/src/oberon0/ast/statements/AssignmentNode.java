package oberon0.ast.statements;

import oberon0.ast.expressions.IEvaluable;
import oberon0.environment.Context;
import oberon0.environment.IValue;
import oberon0.environment.Reference;

public class AssignmentNode implements IExecutable {
	String _name;
	IEvaluable _selector;
	IEvaluable _expression;
	
	
	public AssignmentNode(String name, IEvaluable selector, IEvaluable expression) {
		_name = name;
		_selector = selector;
		_expression = expression;
	}

	@Override
	public void execute(Context context) {
		IValue value = _expression.eval(context);
		Reference ref= context.get(_name);
		ref.setValue(value);
	}

}
