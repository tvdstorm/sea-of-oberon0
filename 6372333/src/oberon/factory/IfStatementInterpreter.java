package oberon.factory;

import java.util.LinkedList;
import java.util.Queue;

import oberon.Expression;
import oberon.IfStatement;
import oberon.Statement;
import oberon.StatementSequence;
import oberon.node.AIfstatement;
import oberon.node.AStatifStatement;
import oberon.node.PIfstatement;

class IfStatementInterpreter extends BaseInterpreter<Statement> {
	private Expression _condition;
	private Queue<IfStatement> _elseIfList;
	private StatementSequence _ifBody;
	private StatementSequence _elseBody;

	public void caseAStatifStatement(AStatifStatement node)
	{
		node.getIfstatement().apply(this);
	}
	
	public void caseAIfstatement(AIfstatement node)
	{
		_condition = ExpInterpreterFactory.getExpression(node.getCondition());
		
		_ifBody = StatementSequenceInterpreter.getStatementList(node.getBody());
		
		_elseIfList = new LinkedList<IfStatement>();
		for (PIfstatement elseIf : node.getElseifs())
		{
			IfStatementInterpreter interpreter = new IfStatementInterpreter();
			elseIf.apply(interpreter);
			_elseIfList.add(interpreter.BuildInterpreterResult());
		}
		
		_elseBody = StatementSequenceInterpreter.getStatementList(node.getElse());
	}

	@Override
	public IfStatement BuildInterpreterResult() {
		return new IfStatement(_condition, _ifBody, _elseIfList, _elseBody);
	}

}
