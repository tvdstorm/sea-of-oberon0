package oberon0.ast.statements;

import oberon0.ast.expressions.IEvaluable;
import oberon0.environment.BooleanValue;
import oberon0.environment.Context;
import oberon0.environment.IValue;

public class WhileNode implements IExecutable {
	private final IEvaluable _condition;
	private final IExecutable _statements;

	public WhileNode(IEvaluable condition, IExecutable statements) {
		_condition = condition;
		_statements = statements;
	}

	@Override
	public void execute(Context context) {
		IValue condValue = _condition.eval(context);
		boolean condition = ((BooleanValue) condValue).getValue();
		while (condition) {
			_statements.execute(context);
			condition = ((BooleanValue) _condition.eval(context)).getValue();
		}
	}

}
