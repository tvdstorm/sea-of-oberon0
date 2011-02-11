package nl.bve.uva.oberon.ast;

import nl.bve.uva.oberon.env.Environment;

public class ElementSelectorNode implements IInterpretableNode {
	private IInterpretableNode selector;
	
	public ElementSelectorNode(IInterpretableNode selector) {
		this.selector = selector;
		System.out.println("ElementSelectorNode(" +selector+ ")");
	}
	
	@Override
	public Object interpret(Environment env) {
		return selector.interpret(env);
	}

}
