package nl.bve.uva.oberon.ast;

import nl.bve.uva.oberon.env.Environment;

public class DotSelectorNode implements IInterpretableNode {
	private String selector;
	
	public DotSelectorNode(String selector) {
		this.selector = selector;
		System.out.println("DotSelectorNode(" +selector+ ")");
	}
	
	@Override
	public Object interpret(Environment env) {
		return selector;
	}

}
