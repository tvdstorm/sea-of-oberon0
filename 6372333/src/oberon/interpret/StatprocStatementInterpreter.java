package oberon.interpret;

import java.util.ArrayList;
import java.util.List;

import oberon.Expression;
import oberon.ProcedurecallStatement;
import oberon.Statement;
import oberon.node.AProcedurecall;
import oberon.node.AStatprocStatement;
import oberon.node.PExp;

public class StatprocStatementInterpreter extends BaseInterpreter<Statement> {
	private String _name;
	private List<Expression> _expressions = new ArrayList<Expression>();

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
