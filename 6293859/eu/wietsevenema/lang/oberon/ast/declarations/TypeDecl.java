package eu.wietsevenema.lang.oberon.ast.declarations;

import eu.wietsevenema.lang.oberon.ast.expressions.Identifier;
import eu.wietsevenema.lang.oberon.ast.types.VarType;

public class TypeDecl extends Declaration {

	private Identifier identifier;
	private VarType type;

	public TypeDecl(Identifier id, VarType type) {
		this.identifier = id;
		this.type = type;
	}

	public Identifier getIdentifier() {
		return identifier;
	}

	public VarType getType() {
		return type;
	}

}
