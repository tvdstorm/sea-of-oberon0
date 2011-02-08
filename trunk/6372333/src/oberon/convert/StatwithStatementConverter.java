package oberon.convert;

import oberon.IExpression;
import oberon.IStatement;
import oberon.StatementSequence;
import oberon.node.AStatwhileStatement;
import oberon.node.AWhilestatement;
import oberon.statement.WhileStatement;

/**
 * The Class StatwithStatementConverter.
 */
class StatwithStatementConverter extends AbstractConverter<IStatement>{
	
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
		condition = ExpConverterFactory.getExpression(node.getCondition());
		
		body = StatementSequenceConverter.getStatementList(node.getBody());
	}
	
	/* (non-Javadoc)
	 * @see oberon.interpret.AbstractBaseInterpreter#buildInterpreterResult()
	 */
	@Override
	public IStatement buildInterpreterResult() {
		return new WhileStatement(condition, body);
	}

}
