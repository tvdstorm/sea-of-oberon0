package oberon.interpret;

import java.util.LinkedList;
import java.util.Queue;

import oberon.Expression;
import oberon.ProcedurecallStatement;
import oberon.Statement;
import oberon.node.AProcedurecall;
import oberon.node.AStatprocStatement;
import oberon.node.PExp;

public class StatprocStatementInterpreter extends BaseInterpreter<Statement> {
	private String _name;
	private Queue<Expression> _expressions = new LinkedList<Expression>();

	public void caseAStatprocStatement(AStatprocStatement node)
	{
		node.getProcedurecall().apply(this);
	}
	
	public void caseAProcedurecall(AProcedurecall node)
	{
		_name = node.getIdentifier().toString().trim();
		
		for (PExp exp : node.getExp())
		{
			_expressions.add(ExpInterpreterFactory.getExpression(exp));
		}
	}

	@Override
	public Statement BuildInterpreterResult() {
		return new ProcedurecallStatement(_name, _expressions);
	}

}
