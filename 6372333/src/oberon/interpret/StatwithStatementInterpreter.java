package oberon.interpret;

import oberon.IExpression;
import oberon.IStatement;
import oberon.StatementSequence;
import oberon.node.AStatwhileStatement;
import oberon.node.AWhilestatement;
import oberon.statement.WhileStatement;

class StatwithStatementInterpreter extends AbstractBaseInterpreter<IStatement>{
	private IExpression condition;
	private StatementSequence body;

	@Override
	public void caseAStatwhileStatement(final AStatwhileStatement node)
	{
		node.getWhilestatement().apply(this);		
	}

	@Override
	public void caseAWhilestatement(final AWhilestatement node)
	{
		condition = ExpInterpreterFactory.getExpression(node.getCondition());
		
		body = StatementSequenceInterpreter.getStatementList(node.getBody());
	}
	
	@Override
	public IStatement buildInterpreterResult() {
		return new WhileStatement(condition, body);
	}

}
