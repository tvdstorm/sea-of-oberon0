package oberon.statement;

import java.io.IOException;
import java.util.Queue;

import oberon.IExpression;
import oberon.IStatement;
import oberon.StatementSequence;

public class IfStatement implements IStatement {
	private final StatementSequence elseBody;
	private final Queue<IfStatement> elseIfBlocks;
	private final IExpression ifCondition;
	private final StatementSequence ifBody;

	public IfStatement (final IExpression condition, final StatementSequence ifBlock, 
			final Queue<IfStatement> elseIfs, final StatementSequence elseBlock)
	{
		ifCondition = condition;
		ifBody = ifBlock;
		elseIfBlocks = elseIfs;
		elseBody = elseBlock;
	}
	
	@Override
	public void eval() throws IOException {
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

	protected void evalStatements() throws IOException {
		ifBody.eval();
	}

	protected Boolean conditionIsTrue() {
		return ifCondition.evalAsBoolean();
	}

}
