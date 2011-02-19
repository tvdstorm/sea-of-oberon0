package nl.bve.uva.oberon.ast.selectors;

import nl.bve.uva.oberon.env.Environment;
import nl.bve.uva.oberon.shared.SelectorValue;

public interface ISelectorNode {
	public SelectorValue evaluate(Environment env);
}