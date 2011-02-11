package nl.bve.uva.oberon.ast;

import nl.bve.uva.oberon.env.Environment;

public interface IInterpretableNode {
	public Object interpret(Environment env);
}
