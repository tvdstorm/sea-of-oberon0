package oberon;

import java.io.IOException;
import java.util.LinkedList;

public class StatementSequence{
	private LinkedList<Statement> _statementList;

	public StatementSequence(LinkedList<Statement> statementList)
	{
		_statementList = statementList;
	}

	public void Eval() throws IOException
	{
		if (_statementList != null)
		{
			for(Statement statement : _statementList)
			{
				statement.Eval();
			}
		}
	}
}
