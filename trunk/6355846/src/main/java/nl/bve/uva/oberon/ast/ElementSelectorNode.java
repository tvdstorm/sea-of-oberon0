package nl.bve.uva.oberon.ast;

import nl.bve.uva.oberon.env.Environment;
import nl.bve.uva.oberon.env.types.OberonType;

public class ElementSelectorNode implements Selector {
	private IInterpretableNode expression;
	
	public ElementSelectorNode(IInterpretableNode selector) {
		this.expression = selector;
	}
	
	@Override
	public String interpret(Environment env) {
		return ((OberonType)expression.interpret(env)).getValue().toString();
	}
}
