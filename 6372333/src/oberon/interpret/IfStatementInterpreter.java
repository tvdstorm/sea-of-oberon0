package oberon.interpret;

import java.util.LinkedList;
import java.util.Queue;

import oberon.AbstractExpression;
import oberon.IfStatement;
import oberon.AbstractStatement;
import oberon.StatementSequence;
import oberon.node.AIfstatement;
import oberon.node.AStatifStatement;
import oberon.node.PIfstatement;

class IfStatementInterpreter extends AbstractBaseInterpreter<AbstractStatement> {
	private AbstractExpression condition;
	private Queue<IfStatement> elseIfList;
	private StatementSequence ifBody;
	private StatementSequence elseBody;

	public void caseAStatifStatement(final AStatifStatement node) {
		node.getIfstatement().apply(this);
	}
	
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
