package eu.wietsevenema.lang.oberon.ast.declarations;

import java.util.List;

import eu.wietsevenema.lang.oberon.ast.expressions.Identifier;
import eu.wietsevenema.lang.oberon.ast.types.VarType;

public class VarDecl extends Declaration {

	List<Identifier> identifiers;
	VarType type;

	public List<Identifier> getIdentifiers() {
		return identifiers;
	}

	public VarType getType() {
		return type;
	}

	public VarDecl(List<Identifier> ids, VarType type) {
		this.identifiers = ids;
		this.type = type;
	}

}
