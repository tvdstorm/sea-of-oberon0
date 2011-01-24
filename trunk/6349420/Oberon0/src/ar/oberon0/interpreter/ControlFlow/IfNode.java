package ar.oberon0.interpreter.ControlFlow;

import java.util.ArrayList;
import java.util.List;

import ar.oberon0.interpreter.Memory.*;
import ar.oberon0.interpreter.Interpretable;


public class IfNode implements Interpretable 
{
	private IfStatement _mainIf;
	private List<IfStatement> _elseIfs;
	private Interpretable _else;
	
	public void addElseIf(Interpretable expression, Interpretable statementsToExecute)
	{
		_elseIfs.add(new IfStatement(expression, statementsToExecute));
	}
	
	public void setElse(Interpretable statementsToExecute)
	{
		_else = statementsToExecute;
	}
	
	public IfNode(Interpretable expression, Interpretable statementsToExecute) {
		_mainIf = new IfStatement(expression, statementsToExecute);
		_elseIfs = new ArrayList<IfStatement>();
	}
	
	

	@Override
	public Object Interpret(Context context) throws Exception 
	{
		if(_mainIf.IsExpressionTrue(context))
		{
			_mainIf.Execute(context);
			return 0;
		}
		for(IfStatement elseIfStatement: _elseIfs)
		{
			if(elseIfStatement.IsExpressionTrue(context))
			{
				elseIfStatement.Execute(context);
				return 0;
			}
		}
		if(_else != null)
		{
			_else.Interpret(context);
			return 0;
		}
		return 0; // nothing to execute
	}
	
	private class IfStatement
	{
		private Interpretable _ifExpression;
		private Interpretable _statements;
		
		public IfStatement(Interpretable expression, Interpretable statements)
		{
			_ifExpression = expression;
			_statements = statements;
		}
		
		public boolean IsExpressionTrue(Context context) throws Exception
		{
			return (Boolean)_ifExpression.Interpret(context) == true;
		}
		
		public void Execute(Context context) throws Exception
		{
			_statements.Interpret(context);
		}
		
	}

}
