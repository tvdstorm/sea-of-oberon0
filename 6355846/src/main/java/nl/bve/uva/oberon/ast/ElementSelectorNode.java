package nl.bve.uva.oberon.ast;

import nl.bve.uva.oberon.env.Environment;
import nl.bve.uva.oberon.env.types.OberonType;
import nl.bve.uva.oberon.shared.SelectorValue;

public class ElementSelectorNode extends Selector {
	private IInterpretableNode expression;
	
	public ElementSelectorNode(IInterpretableNode expression) {
		this.expression = expression;
	}
	
	@Override
	public SelectorValue evaluate(Environment env) {
		return new SelectorValue((OberonType)expression.interpret(env));
	}
}
