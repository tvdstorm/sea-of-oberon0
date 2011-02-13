package org.elcid.oberon0.ast.visitor;

import org.elcid.oberon0.ast.ConstDeclNode;
import org.elcid.oberon0.ast.DeclarationSequenceNode;
import org.elcid.oberon0.ast.TypeDeclNode;
import org.elcid.oberon0.ast.VarDeclNode;
import org.elcid.oberon0.ast.env.Environment;
import org.elcid.oberon0.ast.values.Int;
import org.elcid.oberon0.ast.values.Value;

/**
 *
 * @author Pieter Brandwijk
 */
public class DeclarationVisitor {

	public void run(DeclarationSequenceNode node, Environment env) {
		for (ConstDeclNode constant: node.getConstants()) {
			constant.run(this, env);
		}
		for (TypeDeclNode typeDecl: node.getTypeDecls()) {
			typeDecl.run(this, env);
		}
		for (VarDeclNode varDecl: node.getVarDecls()) {
			varDecl.run(this, env);
		}
	}

	public void run(ConstDeclNode node, Environment env) {
		Int value = (Int) node.getExpression().eval(new ExpressionVisitor(), env);
		env.putValue(node.getName(), value);
	}

	public void run(TypeDeclNode node, Environment env) {
		env.putTypeAlias(node.getTypeAlias(), node.getType());
	}

	public void run(VarDeclNode node, Environment env) {
		Value nullValue = node.getType().init(new TypeVisitor(), env);
		for (String identifier: node.getIdentifiers()) {
			env.putValue(identifier, nullValue);
		}
	}

}
