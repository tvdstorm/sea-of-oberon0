package ar.oberon0.interpreter;

import java.util.ArrayList;
import java.util.List;

import ar.oberon0.interpreter.Memory.Context;


public class StatementSequence implements Interpretable {

	private List<Interpretable> _statements;
	
	public StatementSequence(Interpretable statement) 
	{
		_statements = new ArrayList<Interpretable>();
		addStatement(statement);
	}

	@Override
	public Object Interpret(Context context) throws Exception 
	{
		for(Interpretable statement : _statements)
			statement.Interpret(context);
		return 0;
	}
	public void addStatement(Interpretable statement)
	{
		_statements.add(statement);
	}

}
