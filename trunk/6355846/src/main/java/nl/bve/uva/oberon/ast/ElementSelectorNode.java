package nl.bve.uva.oberon.ast;

import nl.bve.uva.oberon.env.Environment;

public class ElementSelectorNode implements Selector {
	private IInterpretableNode expression;
	
	public ElementSelectorNode(IInterpretableNode selector) {
		this.expression = selector;
	}
	
	@Override
	public String interpret(Environment env) {
		return expression.interpret(env).toString();
	}
}
