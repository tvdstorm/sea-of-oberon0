package nl.bve.uva.oberon.ast;

import nl.bve.uva.oberon.env.Environment;
import nl.bve.uva.oberon.env.types.OberonInt;

public class NegativeNumberNode implements IInterpretableNode {
	private IInterpretableNode expression;
	
	public NegativeNumberNode(IInterpretableNode expression) {
		this.expression = expression;
	}
	
	@Override
	public OberonInt interpret(Environment env) {
		OberonInt type = (OberonInt)expression.interpret(env);
		type.setValue(new OberonInt(type.getValue() * -1));
		
		return type;
	}
}
