package oberon.statement;

import java.io.IOException;
import java.util.Queue;

import oberon.IExpression;
import oberon.IStatement;
import oberon.StatementSequence;
import oberon.exceptions.UnsupportedException;
import oberon.exceptions.VariableNotFoundInScopeException;

/**
 * The Class IfStatement, contains an if statement.
 */
public class IfStatement implements IStatement {
	
	/** The else body. */
	private final StatementSequence elseBody;
	
	/** The else if blocks. */
	private final Queue<IfStatement> elseIfBlocks;
	
	/** The if condition. */
	private final IExpression ifCondition;
	
	/** The if body. */
	private final StatementSequence ifBody;

	/**
	 * Instantiates a new if statement.
	 *
	 * @param condition the condition of the if statement
	 * @param ifBlock the if block body
	 * @param elseIfs the else ifs 
	 * @param elseBlock the else block body
	 */
	public IfStatement (final IExpression condition, final StatementSequence ifBlock, 
			final Queue<IfStatement> elseIfs, final StatementSequence elseBlock)
	{
		ifCondition = condition;
		ifBody = ifBlock;
		elseIfBlocks = elseIfs;
		elseBody = elseBlock;
	}
	
	/* (non-Javadoc)
	 * @see oberon.IStatement#eval()
	 */
	@Override
	public void eval() throws IOException, UnsupportedException, VariableNotFoundInScopeException {
		Boolean bodyIsExecuted = false;
		if (conditionIsTrue()) {
			evalStatements();
			bodyIsExecuted = true;
		}
		else {
			while (!elseIfBlocks.isEmpty()) {
				final IfStatement nextElseIf = elseIfBlocks.poll();
				if (nextElseIf.conditionIsTrue()) {
					nextElseIf.evalStatements();
					bodyIsExecuted = true;
				}
			}
		}
		
		if (!bodyIsExecuted) {
			elseBody.eval();
		}
	}

	/**
	 * Evaluates the statements.
	 *
	 * @throws IOException throws when an exception occurs when reading from the console
	 * @throws UnsupportedException 
	 * @throws VariableNotFoundInScopeException 
	 */
	protected void evalStatements() throws IOException, UnsupportedException, VariableNotFoundInScopeException {
		ifBody.eval();
	}

	/**
	 * Condition is true.
	 *
	 * @return true if the condition is true
	 * @throws UnsupportedException 
	 * @throws VariableNotFoundInScopeException 
	 */
	protected Boolean conditionIsTrue() throws UnsupportedException, VariableNotFoundInScopeException {
		return ifCondition.evalAsBoolean();
	}

}
