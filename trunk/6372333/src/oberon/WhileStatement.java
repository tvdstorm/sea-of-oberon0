package oberon;

import java.io.IOException;

public class WhileStatement extends AbstractStatement {
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
