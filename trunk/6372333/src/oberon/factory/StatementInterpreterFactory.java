package oberon.factory;

import oberon.Statement;
import oberon.node.AStatassStatement;
import oberon.node.AStatifStatement;
import oberon.node.AStatprocStatement;
import oberon.node.AStatwithStatement;
import oberon.node.PStatement;

class StatementInterpreterFactory {
	
	private static <TNode extends PStatement> BaseInterpreter<Statement> 
		getInterpreter(TNode node)// throws NoInterpreterDefinedException
	{	
		if (node instanceof AStatifStatement)
			return new IfStatementInterpreter();
		else if (node instanceof AStatassStatement)
			return new AssignmentInterpreter();
		else if (node instanceof AStatwithStatement)
			return new StatwithStatementInterpreter();
		else if (node instanceof AStatprocStatement)
			return new StatprocStatementInterpreter();
		return null;
		
		//throw new NoInterpreterDefinedException("No interpreter for type: " + node.getClass());
	}
	
	public static <TNode extends PStatement> Statement getStatement(TNode node)
	{
		BaseInterpreter<Statement> interpreter = StatementInterpreterFactory.getInterpreter(node);
		node.apply(interpreter);
		return interpreter.BuildInterpreterResult();
	}

}
