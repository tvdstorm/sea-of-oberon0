package oberon.interpret;

import oberon.IExpression;
import oberon.IIdentifier;
import oberon.IStatement;
import oberon.node.AAssignment;
import oberon.node.AStatassStatement;
import oberon.statement.AssignmentStatement;

/**
 * The Class AssignmentInterpreter.
 */
class AssignmentInterpreter extends AbstractBaseInterpreter<IStatement> {
	
	/** The expression. */
	private IExpression expression;
	
	/** The selector to assign to. */
	private IIdentifier selectorToAssignTo;

	/* (non-Javadoc)
	 * @see oberon.analysis.DepthFirstAdapter#caseAStatassStatement(oberon.node.AStatassStatement)
	 */
	@Override
	public void caseAStatassStatement(final AStatassStatement node)
	{
		node.getAssignment().apply(this);
	}
	
	/* (non-Javadoc)
	 * @see oberon.analysis.DepthFirstAdapter#caseAAssignment(oberon.node.AAssignment)
	 */
	@Override
	public void caseAAssignment(final AAssignment node)
	{
		expression = ExpInterpreterFactory.getExpression(node.getExp());
		
		final SelectorInterpreter interpreter = new SelectorInterpreter();
		node.getSelector().apply(interpreter);
		selectorToAssignTo = interpreter.buildInterpreterResult();
	}	
	
	/* (non-Javadoc)
	 * @see oberon.interpret.AbstractBaseInterpreter#buildInterpreterResult()
	 */
	@Override
	public IStatement buildInterpreterResult() {
		return new AssignmentStatement(selectorToAssignTo, expression);
	}

}
