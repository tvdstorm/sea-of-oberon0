package oberon.factory;

import java.util.LinkedList;

import oberon.Statement;
import oberon.StatementSequence;
import oberon.node.PStatement;

class StatementSequenceInterpreter {
	public static StatementSequence getStatementList(LinkedList<PStatement> statementList){
		LinkedList<Statement> list = new LinkedList<Statement>();
		for (PStatement elseStatement : statementList)
		{
			list.add(StatementInterpreterFactory.getStatement(elseStatement));
		}
		return new StatementSequence(list);
	}
}
