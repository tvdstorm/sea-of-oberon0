package nl.bve.uva.oberon.ast;

import nl.bve.uva.oberon.env.Environment;
import nl.bve.uva.oberon.shared.SelectorValue;

public abstract class Selector {
	public abstract SelectorValue evaluate(Environment env);
}