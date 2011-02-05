package oberon.statement;

import java.io.IOException;

import oberon.IExpression;
import oberon.IStatement;
import oberon.StatementSequence;

public class WhileStatement implements IStatement {
	private final StatementSequence body;
	private final IExpression condition;

	public WhileStatement(final IExpression whileCondition, final StatementSequence whileBody) {
		condition = whileCondition;
		body = whileBody;
	}

	@Override
	public void eval() throws IOException {
		while (condition.evalAsBoolean()){
			body.eval();
		}
	}

}
