package oberon.interpret;

import java.util.LinkedList;
import java.util.Queue;

import oberon.IExpression;
import oberon.IStatement;
import oberon.StatementSequence;
import oberon.node.AIfstatement;
import oberon.node.AStatifStatement;
import oberon.node.PIfstatement;
import oberon.statement.IfStatement;

/**
 * The Class IfStatementInterpreter.
 */
class IfStatementInterpreter extends AbstractBaseInterpreter<IStatement> {
	
	/** The condition. */
	private IExpression condition;
	
	/** The else if list. */
	private Queue<IfStatement> elseIfList;
	
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
		condition = ExpInterpreterFactory.getExpression(node.getCondition());
		
		ifBody = StatementSequenceInterpreter.getStatementList(node.getBody());
		
		elseIfList = new LinkedList<IfStatement>();
		for (PIfstatement elseIf : node.getElseifs()) {
			final IfStatementInterpreter interpreter = new IfStatementInterpreter();
			elseIf.apply(interpreter);
			elseIfList.add(interpreter.buildInterpreterResult());
		}
		
		elseBody = StatementSequenceInterpreter.getStatementList(node.getElse());
	}

	/* (non-Javadoc)
	 * @see oberon.interpret.AbstractBaseInterpreter#buildInterpreterResult()
	 */
	@Override
	public IfStatement buildInterpreterResult() {
		return new IfStatement(condition, ifBody, elseIfList, elseBody);
	}

}
