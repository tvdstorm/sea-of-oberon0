package oberon.interpret;

import oberon.IStatement;
import oberon.node.AStatassStatement;
import oberon.node.AStatifStatement;
import oberon.node.AStatprocStatement;
import oberon.node.AStatwhileStatement;
import oberon.node.PStatement;

/**
 * A factory for creating StatementInterpreter objects.
 */
final class StatementInterpreterFactory {
	
	//private constructor to prevent this type from being constructed
	/**
	 * Instantiates a new statement interpreter factory.
	 */
	private StatementInterpreterFactory(){
	}
	
	/**
	 * Gets the interpreter.
	 *
	 * @param <TNode> the generic type
	 * @param node the node
	 * @return the interpreter
	 */
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
	
	/**
	 * Gets the statement.
	 *
	 * @param <TNode> the generic type
	 * @param node the node
	 * @return the statement
	 */
	public static <TNode extends PStatement> IStatement getStatement(final TNode node)
	{
		final AbstractBaseInterpreter<IStatement> interpreter = 
			StatementInterpreterFactory.getInterpreter(node);
		node.apply(interpreter);
		return interpreter.buildInterpreterResult();
	}

}
