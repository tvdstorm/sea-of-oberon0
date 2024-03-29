package oberon.statement;

import java.io.IOException;

import oberon.IExpression;
import oberon.IStatement;
import oberon.Scope;
import oberon.StatementSequence;

/**
 * The Class WhileStatement, contains a while statement.
 */
public class WhileStatement implements IStatement {
	
	/** The body. */
	private final StatementSequence body;
	
	/** The condition. */
	private final IExpression condition;

	/**
	 * Instantiates a new while statement.
	 *
	 * @param whileCondition the while condition
	 * @param whileBody the while body
	 */
	public WhileStatement(final IExpression whileCondition, final StatementSequence whileBody) {
		condition = whileCondition;
		body = whileBody;
	}

	/* (non-Javadoc)
	 * @see oberon.IStatement#eval()
	 */
	@Override
	public void eval(Scope currentScope) throws IOException {
		while (condition.evalAsBoolean(currentScope)){
			body.eval(currentScope);
		}
	}

	/**
	 * Gets the condition.
	 *
	 * @return the condition
	 */
	public IExpression getCondition() {
		return condition;
	}

}
