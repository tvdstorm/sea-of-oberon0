package nl.bve.uva.oberon.ast;

import java.util.List;

import nl.bve.uva.oberon.ast.statements.StatementNode;
import nl.bve.uva.oberon.env.Environment;

public class StatementSequenceNode implements IExecutableNode {
	private List<StatementNode> sequence;
	
	public StatementSequenceNode(List<StatementNode> sequence) {
		this.sequence = sequence;
	}
	
	@Override
	public void execute(Environment env) {
		for (StatementNode statement : sequence) {
			statement.execute(env);
		}
	}
}