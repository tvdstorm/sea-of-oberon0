package oberon.statement;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import oberon.IExpression;
import oberon.IStatement;
import oberon.Scope;
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
	private final List<IfStatement> elseIfBlocks;
	
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
			final ArrayList<IfStatement> elseIfs, final StatementSequence elseBlock)
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
	public void eval(Scope currentScope) throws IOException, UnsupportedException, VariableNotFoundInScopeException {
		if (conditionIsTrue(currentScope)) {
			evalStatements(currentScope);
			return;
		}
		
		for (IfStatement nextElseIf : elseIfBlocks){
			if (nextElseIf.conditionIsTrue(currentScope)) {
				nextElseIf.evalStatements(currentScope);
				return;
			}
		}
		
		elseBody.eval(currentScope);
	}

	/**
	 * Evaluates the statements.
	 *
	 * @throws IOException throws when an exception occurs when reading from the console
	 * @throws UnsupportedException 
	 * @throws VariableNotFoundInScopeException 
	 */
	protected void evalStatements(final Scope currentScope) throws IOException, UnsupportedException, VariableNotFoundInScopeException {
		ifBody.eval(currentScope);
	}

	/**
	 * Condition is true.
	 *
	 * @return true if the condition is true
	 * @throws UnsupportedException 
	 * @throws VariableNotFoundInScopeException 
	 */
	protected Boolean conditionIsTrue(Scope currentScope) throws UnsupportedException, VariableNotFoundInScopeException {
		return ifCondition.evalAsBoolean(currentScope);
	}

}
