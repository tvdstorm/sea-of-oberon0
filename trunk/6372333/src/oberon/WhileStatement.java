package oberon;

import java.io.IOException;

public class WhileStatement extends Statement {
	private StatementSequence _statements;
	private Expression _condition;

	public WhileStatement(Expression condition, StatementSequence statements)
	{
		_condition = condition;
		_statements = statements;
	}

	@Override
	public void Eval() throws IOException {
		while (_condition.EvalAsBoolean())
		{
			_statements.Eval();
		}
	}

}
