package nl.bve.uva.oberon.ast;

import java.util.List;

import nl.bve.uva.oberon.ast.statements.IStatementNode;
import nl.bve.uva.oberon.env.Environment;

public class StatementSequenceNode implements IExecutableNode {
	private List<IStatementNode> sequence;
	
	public StatementSequenceNode(List<IStatementNode> sequence) {
		this.sequence = sequence;
	}
	
	@Override
	public void execute(Environment env) {
		for (IStatementNode statement : sequence) {
			statement.execute(env);
		}
	}
}