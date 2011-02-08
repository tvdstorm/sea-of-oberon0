package oberon.convert;

import java.util.LinkedList;
import java.util.List;

import oberon.IStatement;
import oberon.StatementSequence;
import oberon.node.PStatement;

/**
 * The Class StatementSequenceConverter.
 */
final class StatementSequenceConverter {
	//private constructor to prevent this type from being instantiated
	/**
	 * Instantiates a new statement sequence interpreter.
	 */
	private StatementSequenceConverter(){
	}
	
	/**
	 * Gets the statement list.
	 *
	 * @param statementList the statement list
	 * @return the statement list
	 */
	public static StatementSequence getStatementList(final List<PStatement> statementList){
		final LinkedList<IStatement> list = new LinkedList<IStatement>();
		for (PStatement elseStatement : statementList) {
			list.add(StatementConverterFactory.getStatement(elseStatement));
		}
		return new StatementSequence(list);
	}
}
