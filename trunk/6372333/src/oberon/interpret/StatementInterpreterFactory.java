package oberon.interpret;

import oberon.IStatement;
import oberon.node.AStatassStatement;
import oberon.node.AStatifStatement;
import oberon.node.AStatprocStatement;
import oberon.node.AStatwhileStatement;
import oberon.node.PStatement;

final class StatementInterpreterFactory {
	
	//private constructor to prevent this type from being constructed
	private StatementInterpreterFactory(){
	}
	
	private static <TNode extends PStatement> AbstractBaseInterpreter<IStatement> 
		getInterpreter(final TNode node)
	{	
		AbstractBaseInterpreter<IStatement> returnStatement = null;
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
	
	public static <TNode extends PStatement> IStatement getStatement(final TNode node)
	{
		final AbstractBaseInterpreter<IStatement> interpreter = 
			StatementInterpreterFactory.getInterpreter(node);
		node.apply(interpreter);
		return interpreter.buildInterpreterResult();
	}

}
