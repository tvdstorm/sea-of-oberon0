package oberon.factory;

import oberon.AssignmentStatement;
import oberon.Expression;
import oberon.Statement;
import oberon.node.AAssignment;
import oberon.node.AStatassStatement;

class AssignmentInterpreter extends BaseInterpreter<Statement> {
	private Expression _value;
	private String _name;


	public void caseAStatassStatement(AStatassStatement node)
	{
		node.getAssignment().apply(this);
	}
	
	public void caseAAssignment(AAssignment node)
	{
		_value = ExpInterpreterFactory.getExpression(node.getExp());
		_name = node.getIdentifier().toString().trim();
	}	
	
	@Override
	public Statement BuildInterpreterResult() {
		return new AssignmentStatement(_name, _value);
	}

}
