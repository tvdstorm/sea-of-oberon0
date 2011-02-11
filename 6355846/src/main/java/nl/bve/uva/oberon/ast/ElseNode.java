package nl.bve.uva.oberon.ast;

import nl.bve.uva.oberon.env.Environment;

public class ElseNode implements IInterpretableNode {
	private IInterpretableNode body;
	
	public ElseNode(IInterpretableNode body) {
		this.body = body;
	}
	
	@Override
	public Object interpret(Environment env) {
		Environment subEnv = env.getNewSubSpace();
		return body.interpret(subEnv);
	}
	
	@Override
	public String toString() {
		return "ElseNode, body: " +body;
	}
}
