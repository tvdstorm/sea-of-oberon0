package nl.bve.uva.oberon.ast.declarations;

import nl.bve.uva.oberon.env.Environment;

public abstract class DeclarationNode {
	public abstract void declare(Environment env);
}
