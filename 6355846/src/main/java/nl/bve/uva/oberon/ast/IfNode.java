package nl.bve.uva.oberon.ast;

import nl.bve.uva.oberon.env.Environment;
import nl.bve.uva.oberon.env.types.OberonInt;
import nl.bve.uva.oberon.env.types.Type;

public class IfNode implements IInterpretableNode {
	private IInterpretableNode condition;
	private IInterpretableNode body;
	private IInterpretableNode ifelse;
	
	public IfNode(IInterpretableNode condition, IInterpretableNode body, IInterpretableNode ifelse) {
		System.out.println("IF-node");
		this.condition = condition;
		this.body = body;
		this.ifelse = ifelse;
	}
	
	@Override
	public Object interpret(Environment env) {
		Type t = (Type)condition.interpret(env);
		
		if (t.interpret(env) == OberonInt.TRUE) {
			Environment subEnv = env.getNewSubSpace();
			body.interpret(subEnv);
		} else if (ifelse != null) {
			ifelse.interpret(env);
		}
		
		return null;
	}

	
	@Override
	public String toString() {
		return "IfNode, condition: " +condition+ ", body: " +body+ ", else: " +ifelse;
	}
}
