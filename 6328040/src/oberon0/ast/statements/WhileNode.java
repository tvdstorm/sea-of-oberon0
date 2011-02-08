package oberon0.ast.statements;

import oberon0.ast.expressions.IEvaluable;
import oberon0.environment.BooleanValue;
import oberon0.environment.Context;

public class WhileNode implements IExecutable {
	private IEvaluable _condition;
	private IExecutable _statements;

	public WhileNode(IEvaluable condition, IExecutable statements) {
		_condition = condition;
		_statements = statements;
	}

	@Override
	public void execute(Context context) {
		boolean condition = ((BooleanValue) _condition.eval(context))
				.getValue();
		while (condition) {
			_statements.execute(context);
			condition = ((BooleanValue) _condition.eval(context)).getValue();
		}
	}

}
