package nl.bve.uva.oberon.ast.selectors;

import nl.bve.uva.oberon.env.Environment;
import nl.bve.uva.oberon.shared.SelectorValue;

public class DotSelectorNode extends Selector {
	private String selector;
	
	public DotSelectorNode(String selector) {
		this.selector = selector;
	}
	
	public SelectorValue evaluate(Environment env) {
		return new SelectorValue(selector);
	}
}