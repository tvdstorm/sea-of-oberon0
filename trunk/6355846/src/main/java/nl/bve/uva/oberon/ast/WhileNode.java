package nl.bve.uva.oberon.ast;

import nl.bve.uva.oberon.env.Environment;
import nl.bve.uva.oberon.env.types.OberonInt;

public class WhileNode implements IInterpretableNode {
	private IInterpretableNode condition;
	private IInterpretableNode body;
	
	public WhileNode(IInterpretableNode condition, IInterpretableNode body) {
		this.condition = condition;
		this.body = body;
	}
	
	@Override
	public Object interpret(Environment env) {
		while ( ((OberonInt)condition.interpret(env)).getValue() == OberonInt.TRUE) {
			body.interpret(env);
		}
		
		return null;
	}
}
