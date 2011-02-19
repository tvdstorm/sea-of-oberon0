package nl.bve.uva.oberon.ast.declarations;

import nl.bve.uva.oberon.env.Environment;

public interface IDeclarationNode {
	public void declare(Environment env);
}
