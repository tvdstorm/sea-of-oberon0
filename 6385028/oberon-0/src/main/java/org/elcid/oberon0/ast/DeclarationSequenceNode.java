package org.elcid.oberon0.ast;

import java.util.ArrayList;
import java.util.List;
import org.elcid.oberon0.ast.env.Environment;
import org.elcid.oberon0.ast.visitor.DeclarationVisitor;

/**
 *
 * @author Pieter Brandwijk
 */
public class DeclarationSequenceNode extends DeclarationNode {
	
	private List<ConstDeclNode> constants;
	private List<TypeDeclNode> typeDecls;
	private List<VarDeclNode> varDecls;

	public DeclarationSequenceNode() {
		constants = new ArrayList<ConstDeclNode>();
		typeDecls = new ArrayList<TypeDeclNode>();
		varDecls = new ArrayList<VarDeclNode>();
	}

	public List<ConstDeclNode> getConstants() {
		return constants;
	}

	public List<TypeDeclNode> getTypeDecls() {
		return typeDecls;
	}

	public List<VarDeclNode> getVarDecls() {
		return varDecls;
	}

	public void addConstDecls(List<ConstDeclNode> list) {
		if (!list.isEmpty())
			constants.addAll(list);
	}

	public void addTypeDecls(List<TypeDeclNode> list) {
		if (!list.isEmpty())
			typeDecls.addAll(list);
	}

	public void addVarDecls(List<VarDeclNode> list) {
		if (!list.isEmpty())
			varDecls.addAll(list);
	}

	@Override
	public void run(DeclarationVisitor visitor, Environment env) {
		visitor.run(this, env);
	}
}
