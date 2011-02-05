package oberon.statement;

import java.io.IOException;

import oberon.AbstractExpression;
import oberon.IStatement;
import oberon.StatementSequence;

public class WhileStatement implements IStatement {
	private final StatementSequence body;
	private final AbstractExpression condition;

	public WhileStatement(final AbstractExpression whileCondition, final StatementSequence whileBody) {
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
