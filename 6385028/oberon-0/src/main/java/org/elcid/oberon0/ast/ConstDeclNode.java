package org.elcid.oberon0.ast;

import org.elcid.oberon0.ast.env.Environment;
import org.elcid.oberon0.ast.visitors.DeclarationVisitor;

/**
 *
 * @author Pieter Brandwijk
 */
public class ConstDeclNode extends DeclarationNode {

	private String name;
	private ExpressionNode expression;

	public ConstDeclNode(String name, ExpressionNode expression) {
		this.name = name;
		this.expression = expression;
	}

	public ExpressionNode getExpression() {
		return expression;
	}

	public String getName() {
		return name;
	}
	
	@Override
	public void run(DeclarationVisitor visitor, Environment env) {
		visitor.run(this, env);
	}
}
