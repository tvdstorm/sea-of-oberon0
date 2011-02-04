package eu.wietsevenema.lang.oberon.ast.declarations;

import xtc.tree.Node;
import eu.wietsevenema.lang.oberon.ast.expressions.Identifier;
import eu.wietsevenema.lang.oberon.ast.types.VarType;

public class TypeDecl extends Declaration {

	private Identifier identifier;
	private VarType type;

	//FIXME i'm wrong. 
	public TypeDecl(Node id, VarType type) {
		this.identifier = (Identifier)id;
		this.type = type;
	}

	public Identifier getIdentifier() {
		return identifier;
	}

	public VarType getType() {
		return type;
	}

}
