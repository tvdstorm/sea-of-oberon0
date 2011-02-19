package nl.bve.uva.oberon.ast.statements;

import nl.bve.uva.oberon.ast.IInterpretableNode;
import nl.bve.uva.oberon.env.Environment;

public class ElseNode extends StatementNode {
	private IInterpretableNode body;
	
	public ElseNode(IInterpretableNode body) {
		this.body = body;
	}
	
	@Override
	public void execute(Environment env) {
		body.interpret(env);
	}
}
