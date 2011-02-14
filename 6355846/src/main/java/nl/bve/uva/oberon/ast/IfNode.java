package nl.bve.uva.oberon.ast;

import nl.bve.uva.oberon.env.Environment;
import nl.bve.uva.oberon.env.types.OberonInt;
import nl.bve.uva.oberon.env.types.OberonType;

public class IfNode implements IInterpretableNode {
	private IInterpretableNode condition;
	private IInterpretableNode body;
	private IInterpretableNode ifelse;
	
	public IfNode(IInterpretableNode condition, IInterpretableNode body, IInterpretableNode ifelse) {
		this.condition = condition;
		this.body = body;
		this.ifelse = ifelse;
	}
	
	@Override
	public Object interpret(Environment env) {
		OberonType t = (OberonType)condition.interpret(env);
		
		if (t.getValue() == OberonInt.TRUE) {
			body.interpret(env);
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
