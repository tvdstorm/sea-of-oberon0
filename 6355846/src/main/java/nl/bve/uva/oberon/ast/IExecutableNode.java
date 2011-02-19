package nl.bve.uva.oberon.ast;

import nl.bve.uva.oberon.env.Environment;

public interface IExecutableNode {
	public void execute(Environment env);
}
