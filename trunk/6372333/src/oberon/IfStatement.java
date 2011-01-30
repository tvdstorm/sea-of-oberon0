package oberon;

import java.io.IOException;
import java.util.Queue;

public class IfStatement extends Statement {
	private StatementSequence _elseBlock;
	private Queue<IfStatement> _elseIfs;
	private Expression _condition;
	private StatementSequence _ifBlock;

	public IfStatement (Expression condition, StatementSequence ifBlock, Queue<IfStatement> elseIfs, StatementSequence elseBlock)
	{
		_condition = condition;
		_ifBlock = ifBlock;
		_elseIfs = elseIfs;
		_elseBlock = elseBlock;
	}
	
	@Override
	public void Eval() throws IOException {
		Expression condition = _condition;
		if (condition.EvalAsBoolean())
		{
			_ifBlock.Eval();
			return;
		}
		
		while (!_elseIfs.isEmpty())
		{
			IfStatement nextElseIf = _elseIfs.poll();
			if (nextElseIf._condition.EvalAsBoolean())
			{
				nextElseIf._ifBlock.Eval();
				return;
			}
		}
		
		_elseBlock.Eval();
	}

}
