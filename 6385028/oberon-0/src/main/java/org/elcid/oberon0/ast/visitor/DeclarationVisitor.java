package org.elcid.oberon0.ast.visitor;

import org.elcid.oberon0.ast.ConstDeclNode;
import org.elcid.oberon0.ast.DeclarationSequenceNode;
import org.elcid.oberon0.ast.env.Environment;
import org.elcid.oberon0.ast.values.Int;

/**
 *
 * @author Pieter Brandwijk
 */
public class DeclarationVisitor {

	public void run(ConstDeclNode node, Environment env) {
		Int value = (Int) node.getExpression().eval(new ExpressionVisitor(), env);
		env.put(node.getName(), value);
	}

	public void run(DeclarationSequenceNode node, Environment env) {
		for (ConstDeclNode constant: node.getConstants()) {
			constant.run(this, env);
		}
	}

}
