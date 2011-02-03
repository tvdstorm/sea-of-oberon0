package oberon.interpret;

import oberon.AssignmentStatement;
import oberon.AbstractExpression;
import oberon.AbstractStatement;
import oberon.data.AbstractSelector;
import oberon.node.AAssignment;
import oberon.node.AStatassStatement;

class AssignmentInterpreter extends AbstractBaseInterpreter<AbstractStatement> {
	private AbstractExpression expression;
	private AbstractSelector selectorToAssignTo;


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
	public AbstractStatement buildInterpreterResult() {
		return new AssignmentStatement(selectorToAssignTo, expression);
	}

}
