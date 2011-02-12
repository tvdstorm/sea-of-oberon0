package nl.bve.uva.oberon.ast;

import nl.bve.uva.oberon.env.Environment;

public class DotSelectorNode implements Selector {
	private String selector;
	
	public DotSelectorNode(String selector) {
		this.selector = selector;
	}
	
	@Override
	public String interpret(Environment env) {
		return selector;
	}
}