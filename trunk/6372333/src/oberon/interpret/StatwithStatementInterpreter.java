package oberon.interpret;

import oberon.Expression;
import oberon.Statement;
import oberon.StatementSequence;
import oberon.WhileStatement;
import oberon.node.AStatwhileStatement;
import oberon.node.AWhilestatement;

class StatwithStatementInterpreter extends BaseInterpreter<Statement>{
	private Expression _condition;
	private StatementSequence _body;

	@Override
	public void caseAStatwhileStatement(AStatwhileStatement node)
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
