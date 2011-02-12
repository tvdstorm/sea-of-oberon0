package nl.bve.uva.oberon.ast;

import nl.bve.uva.oberon.env.Environment;

public interface Selector extends IInterpretableNode {
	@Override
	public String interpret(Environment env);
}
