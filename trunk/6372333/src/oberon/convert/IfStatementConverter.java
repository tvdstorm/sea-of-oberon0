package oberon.convert;

import java.util.ArrayList;

import oberon.IExpression;
import oberon.IStatement;
import oberon.StatementSequence;
import oberon.node.AIfstatement;
import oberon.node.AStatifStatement;
import oberon.node.PIfstatement;
import oberon.statement.IfStatement;

/**
 * The Class IfStatementConverter.
 */
class IfStatementConverter extends AbstractConverter<IStatement> {
	
	/** The condition. */
	private IExpression condition;
	
	/** The else if list. */
	private ArrayList<IfStatement> elseIfList;
	
	/** The if body. */
	private StatementSequence ifBody;
	
	/** The else body. */
	private StatementSequence elseBody;

	/* (non-Javadoc)
	 * @see oberon.analysis.DepthFirstAdapter#caseAStatifStatement(oberon.node.AStatifStatement)
	 */
	@Override
	public void caseAStatifStatement(final AStatifStatement node) {
		node.getIfstatement().apply(this);
	}

	/* (non-Javadoc)
	 * @see oberon.analysis.DepthFirstAdapter#caseAIfstatement(oberon.node.AIfstatement)
	 */
	@Override
	public void caseAIfstatement(final AIfstatement node) {
		condition = ExpConverterFactory.getExpression(node.getCondition());
		
		ifBody = StatementSequenceConverter.getStatementList(node.getBody());
		
		elseIfList = new ArrayList<IfStatement>();
		for (PIfstatement elseIf : node.getElseifs()) {
			final IfStatementConverter interpreter = new IfStatementConverter();
			elseIf.apply(interpreter);
			elseIfList.add(interpreter.buildInterpreterResult());
		}
		
		elseBody = StatementSequenceConverter.getStatementList(node.getElse());
	}

	/* (non-Javadoc)
	 * @see oberon.interpret.AbstractBaseInterpreter#buildInterpreterResult()
	 */
	@Override
	public IfStatement buildInterpreterResult() {
		return new IfStatement(condition, ifBody, elseIfList, elseBody);
	}

}
