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

class IfStatementInterpreter extends AbstractBaseInterpreter<IStatement> {
	private IExpression condition;
	private Queue<IfStatement> elseIfList;
	private StatementSequence ifBody;
	private StatementSequence elseBody;

	@Override
	public void caseAStatifStatement(final AStatifStatement node) {
		node.getIfstatement().apply(this);
	}

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

	@Override
	public IfStatement buildInterpreterResult() {
		return new IfStatement(condition, ifBody, elseIfList, elseBody);
	}

}
