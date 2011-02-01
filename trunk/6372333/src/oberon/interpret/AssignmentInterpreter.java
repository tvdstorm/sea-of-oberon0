package oberon.interpret;

import oberon.AssignmentStatement;
import oberon.Expression;
import oberon.Statement;
import oberon.data.Selector;
import oberon.node.AAssignment;
import oberon.node.AStatassStatement;

class AssignmentInterpreter extends BaseInterpreter<Statement> {
	private Expression _value;
	private Selector _selectorToAssignTo;


	public void caseAStatassStatement(AStatassStatement node)
	{
		node.getAssignment().apply(this);
	}
	
	public void caseAAssignment(AAssignment node)
	{
		_value = ExpInterpreterFactory.getExpression(node.getExp());
		
		SelectorInterpreter interpreter = new SelectorInterpreter();
		node.getSelector().apply(interpreter);
		_selectorToAssignTo = interpreter.BuildInterpreterResult();
	}	
	
	@Override
	public Statement BuildInterpreterResult() {
		return new AssignmentStatement(_selectorToAssignTo, _value);
	}

}
