package nl.bve.uva.oberon.ast;

import nl.bve.uva.oberon.env.Environment;
import nl.bve.uva.oberon.env.types.OberonInt;
import nl.bve.uva.oberon.env.types.OberonType;

public class ElseIfNode implements IInterpretableNode {
	private IInterpretableNode condition;
	private IInterpretableNode body;
	private IInterpretableNode nextElse;
	
	public ElseIfNode(IInterpretableNode condition, IInterpretableNode body, IInterpretableNode nextElse) {
		this.condition = condition;
		this.body = body;
		this.nextElse = nextElse;
	}
	
	@Override
	public Object interpret(Environment env) {
		OberonType t = (OberonType)condition.interpret(env);
		
		if (t.getValue() == OberonInt.TRUE) {
			Environment subEnv = env.getNewSubSpace();
			return body.interpret(subEnv);
		} else if (nextElse != null) {
			nextElse.interpret(env);
		}
		
		return null;
	}
	
	@Override
	public String toString() {
		return "ElseIfNode, condition: " +condition+ ", body: " +body+ ", nextElse: " +nextElse;
	}
}
