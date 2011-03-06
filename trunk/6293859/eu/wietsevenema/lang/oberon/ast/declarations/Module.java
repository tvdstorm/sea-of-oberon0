package eu.wietsevenema.lang.oberon.ast.declarations;

import java.util.ArrayList;
import java.util.List;

import xtc.tree.Node;

import eu.wietsevenema.lang.oberon.ast.expressions.Identifier;
import eu.wietsevenema.lang.oberon.ast.statements.Statement;

public class Module extends Declaration {

	Identifier identifier;
	Declarations decls;
	List<Statement> stats;

	public Module(Node idstart, Declarations decls, List<Statement> stats) {
		this.identifier = (Identifier) idstart;
		this.decls = (decls != null) ? decls : new Declarations(null, null, null, null);
		this.stats = (stats != null) ? stats : new ArrayList<Statement>();

	}

	public Identifier getIdentifier() {
		return identifier;
	}

	public Declarations getDeclarations() {
		return decls;
	}

	public List<Statement> getStats() {
		return stats;
	}

}
