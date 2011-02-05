package oberon.interpret;

import oberon.IExpression;
import oberon.IStatement;
import oberon.StatementSequence;
import oberon.node.AStatwhileStatement;
import oberon.node.AWhilestatement;
import oberon.statement.WhileStatement;

/**
 * The Class StatwithStatementInterpreter.
 */
class StatwithStatementInterpreter extends AbstractBaseInterpreter<IStatement>{
	
	/** The condition. */
	private IExpression condition;
	
	/** The body. */
	private StatementSequence body;

	/* (non-Javadoc)
	 * @see oberon.analysis.DepthFirstAdapter#caseAStatwhileStatement(oberon.node.AStatwhileStatement)
	 */
	@Override
	public void caseAStatwhileStatement(final AStatwhileStatement node)
	{
		node.getWhilestatement().apply(this);		
	}

	/* (non-Javadoc)
	 * @see oberon.analysis.DepthFirstAdapter#caseAWhilestatement(oberon.node.AWhilestatement)
	 */
	@Override
	public void caseAWhilestatement(final AWhilestatement node)
	{
		condition = ExpInterpreterFactory.getExpression(node.getCondition());
		
		body = StatementSequenceInterpreter.getStatementList(node.getBody());
	}
	
	/* (non-Javadoc)
	 * @see oberon.interpret.AbstractBaseInterpreter#buildInterpreterResult()
	 */
	@Override
	public IStatement buildInterpreterResult() {
		return new WhileStatement(condition, body);
	}

}
