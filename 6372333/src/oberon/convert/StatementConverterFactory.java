package oberon.convert;

import oberon.IStatement;
import oberon.node.AReadprocStatement;
import oberon.node.AStatassStatement;
import oberon.node.AStatifStatement;
import oberon.node.AStatprocStatement;
import oberon.node.AStatwhileStatement;
import oberon.node.AWritelnprocStatement;
import oberon.node.AWriteprocStatement;
import oberon.node.PStatement;

/**
 * A factory for creating StatementConvertor objects.
 */
final class StatementConverterFactory {
	
	//private constructor to prevent this type from being constructed
	/**
	 * Instantiates a new statement interpreter factory.
	 */
	private StatementConverterFactory(){
	}
	
	/**
	 * Gets the interpreter.
	 *
	 * @param <TNode> the generic type
	 * @param node the node
	 * @return the interpreter
	 */
	private static <TNode extends PStatement> AbstractConverter<IStatement> 
		getInterpreter(final TNode node)
	{	
		AbstractConverter<IStatement> returnStatement = null;
		if (node instanceof AStatifStatement) {
			returnStatement = new IfStatementConverter();
		}
		else if (node instanceof AStatassStatement) {
			returnStatement = new AssignmentConverter();
		}
		else if (node instanceof AStatwhileStatement) {
			returnStatement = new StatwithStatementConverter();
		}
		else if (node instanceof AStatprocStatement) {
			returnStatement = new StatprocStatementConverter();
		}
		else if (node instanceof AReadprocStatement) {
			returnStatement = new ReadProcConverter();
		}
		else if (node instanceof AWriteprocStatement) {
			returnStatement = new WriteProcConverter();
		}
		else if (node instanceof AWritelnprocStatement) {
			returnStatement = new WriteLnProcConverter();
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
		final AbstractConverter<IStatement> interpreter = 
			StatementConverterFactory.getInterpreter(node);
		node.apply(interpreter);
		return interpreter.buildInterpreterResult();
	}

}
