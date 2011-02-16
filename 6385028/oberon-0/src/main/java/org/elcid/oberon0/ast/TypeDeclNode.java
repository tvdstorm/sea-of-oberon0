package org.elcid.oberon0.ast;

import org.elcid.oberon0.ast.env.Environment;
import org.elcid.oberon0.ast.visitors.DeclarationVisitor;

/**
 *
 * @author Pieter Brandwijk
 */
public class TypeDeclNode extends DeclarationNode {

	private String typeAlias;
	private TypeNode type;

	public TypeDeclNode(String typeAlias, TypeNode type) {
		this.typeAlias = typeAlias;
		this.type = type;
	}

	public TypeNode getType() {
		return type;
	}

	public String getTypeAlias() {
		return typeAlias;
	}

	@Override
	public void run(DeclarationVisitor visitor, Environment env) {
		visitor.run(this, env);
	}

}
