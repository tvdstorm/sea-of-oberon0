package oberon.interpret;

import oberon.IExpression;
import oberon.IStatement;
import oberon.data.AbstractIdentifier;
import oberon.node.AAssignment;
import oberon.node.AStatassStatement;
import oberon.statement.AssignmentStatement;

class AssignmentInterpreter extends AbstractBaseInterpreter<IStatement> {
	private IExpression expression;
	private AbstractIdentifier selectorToAssignTo;


	public void caseAStatassStatement(final AStatassStatement node)
	{
		node.getAssignment().apply(this);
	}
	
	public void caseAAssignment(final AAssignment node)
	{
		expression = ExpInterpreterFactory.getExpression(node.getExp());
		
		final SelectorInterpreter interpreter = new SelectorInterpreter();
		node.getSelector().apply(interpreter);
		selectorToAssignTo = interpreter.buildInterpreterResult();
	}	
	
	@Override
	public IStatement buildInterpreterResult() {
		return new AssignmentStatement(selectorToAssignTo, expression);
	}

}
