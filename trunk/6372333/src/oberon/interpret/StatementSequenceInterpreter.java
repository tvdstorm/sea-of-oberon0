package oberon.interpret;

import java.util.LinkedList;
import java.util.List;

import oberon.AbstractStatement;
import oberon.StatementSequence;
import oberon.node.PStatement;

final class StatementSequenceInterpreter {
	//private constructor to prevent this type from being instantiated
	private StatementSequenceInterpreter(){
	}
	
	public static StatementSequence getStatementList(final List<PStatement> statementList){
		final LinkedList<AbstractStatement> list = new LinkedList<AbstractStatement>();
		for (PStatement elseStatement : statementList) {
			list.add(StatementInterpreterFactory.getStatement(elseStatement));
		}
		return new StatementSequence(list);
	}
}
