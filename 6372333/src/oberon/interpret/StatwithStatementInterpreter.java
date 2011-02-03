package oberon.interpret;

import oberon.AbstractExpression;
import oberon.AbstractStatement;
import oberon.StatementSequence;
import oberon.WhileStatement;
import oberon.node.AStatwhileStatement;
import oberon.node.AWhilestatement;

class StatwithStatementInterpreter extends AbstractBaseInterpreter<AbstractStatement>{
	private AbstractExpression condition;
	private StatementSequence body;

	@Override
	public void caseAStatwhileStatement(final AStatwhileStatement node)
	{
		node.getWhilestatement().apply(this);		
	}
	
	public void caseAWhilestatement(final AWhilestatement node)
	{
		condition = ExpInterpreterFactory.getExpression(node.getCondition());
		
		body = StatementSequenceInterpreter.getStatementList(node.getBody());
	}
	
	@Override
	public AbstractStatement buildInterpreterResult() {
		return new WhileStatement(condition, body);
	}

}
