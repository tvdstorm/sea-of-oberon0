package eu.wietsevenema.lang.oberon.ast.declarations;

import java.util.List;

import xtc.tree.Node;

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
	
	public VarDecl(List<Node> ids, VarType type) {
		this.identifiers = castIds(ids);
		this.type = type;
	}

}
