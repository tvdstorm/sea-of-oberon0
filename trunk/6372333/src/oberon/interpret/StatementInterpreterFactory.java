package oberon.interpret;

import oberon.AbstractStatement;
import oberon.node.AStatassStatement;
import oberon.node.AStatifStatement;
import oberon.node.AStatprocStatement;
import oberon.node.AStatwhileStatement;
import oberon.node.PStatement;

final class StatementInterpreterFactory {
	
	//private constructor to prevent this type from being constructed
	private StatementInterpreterFactory(){
	}
	
	private static <TNode extends PStatement> AbstractBaseInterpreter<AbstractStatement> 
		getInterpreter(final TNode node)
	{	
		AbstractBaseInterpreter<AbstractStatement> returnStatement = null;
		if (node instanceof AStatifStatement) {
			returnStatement = new IfStatementInterpreter();
		}
		else if (node instanceof AStatassStatement) {
			returnStatement = new AssignmentInterpreter();
		}
		else if (node instanceof AStatwhileStatement) {
			returnStatement = new StatwithStatementInterpreter();
		}
		else if (node instanceof AStatprocStatement) {
			returnStatement = new StatprocStatementInterpreter();
		}
		
		return returnStatement;
	}
	
	public static <TNode extends PStatement> AbstractStatement getStatement(final TNode node)
	{
		final AbstractBaseInterpreter<AbstractStatement> interpreter = 
			StatementInterpreterFactory.getInterpreter(node);
		node.apply(interpreter);
		return interpreter.buildInterpreterResult();
	}

}
