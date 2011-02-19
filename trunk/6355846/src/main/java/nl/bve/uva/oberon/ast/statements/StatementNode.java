package nl.bve.uva.oberon.ast.statements;

import nl.bve.uva.oberon.env.Environment;

public abstract class StatementNode {
	public abstract void execute(Environment env);
}
