package org.elcid.oberon0.ast;

import java.util.List;
import org.elcid.oberon0.ast.env.Environment;
import org.elcid.oberon0.ast.visitors.DeclarationVisitor;

/**
 *
 * @author Pieter Brandwijk
 */
public class VarDeclNode extends DeclarationNode {

	private List<String> identifiers;
	private TypeNode type;

	public VarDeclNode(List<String> identifiers, TypeNode type) {
		this.identifiers = identifiers;
		this.type = type;
	}

	public List<String> getIdentifiers() {
		return identifiers;
	}

	public TypeNode getType() {
		return type;
	}

	@Override
	public void run(DeclarationVisitor visitor, Environment env) {
		visitor.run(this, env);
	}

}
