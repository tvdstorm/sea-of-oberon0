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
		Environment subEnv = env.getNewSubSpace();
		
		while ( ((OberonInt)condition.interpret(subEnv)).getValue() == OberonInt.TRUE) {
			body.interpret(subEnv);
		}
		
		return null;
	}
}