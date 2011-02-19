package nl.bve.uva.oberon.ast.statements;

import nl.bve.uva.oberon.ast.IExecutableNode;
import nl.bve.uva.oberon.env.Environment;

public class ElseNode extends StatementNode {
	private IExecutableNode body;
	
	public ElseNode(IExecutableNode body) {
		this.body = body;
	}
	
	@Override
	public void execute(Environment env) {
		body.execute(env);
	}
}
