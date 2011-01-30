package oberon.factory;

import oberon.Expression;
import oberon.Statement;
import oberon.StatementSequence;
import oberon.WhileStatement;
import oberon.node.AStatwithStatement;
import oberon.node.AWhilestatement;

class StatwithStatementInterpreter extends BaseInterpreter<Statement>{
	private Expression _condition;
	private StatementSequence _body;

	public void caseAStatwithStatement(AStatwithStatement node)
	{
		node.getWhilestatement().apply(this);		
	}
	
	public void caseAWhilestatement(AWhilestatement node)
	{
		_condition = ExpInterpreterFactory.getExpression(node.getCondition());
		
		_body = StatementSequenceInterpreter.getStatementList(node.getBody());
	}
	
	@Override
	public Statement BuildInterpreterResult() {
		return new WhileStatement(_condition, _body);
	}

}
