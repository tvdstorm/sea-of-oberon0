package org.elcid.oberon0.ast.visitor;

import org.elcid.oberon0.ast.*;
import org.elcid.oberon0.ast.env.Environment;
import org.elcid.oberon0.ast.values.*;

/**
 * Implements the methods for running statements of the Oberon-0 language.
 *
 * @author Pieter Brandwijk
 */
public class StatementVisitor extends BaseVisitor {

	@Override
	public void run(StatementSequenceNode node, Environment localEnv) {
		for (StatementNode statement : node.getStatements()) {
			statement.run(this, localEnv);
		}
	}

	@Override
	public void run(AssignmentNode node, Environment localEnv) {
		Value value = (Value) node.getExpression().eval(new ExpressionVisitor(), localEnv);
		localEnv.put(node.getIdentSelector().getIdentifier(), value);
	}

	@Override
	public void run(IfStmNode node, Environment localEnv) {
		Boolean condition = ((Bool) node.getCondition().eval(new ExpressionVisitor(), localEnv)).getValue();
		if (condition) {
			node.getStatementSequence().run(this, localEnv);
		}
		else if (node.getElseNode() != null) {
			node.getElseNode().run(this, localEnv);
		}
	}

	@Override
	public void run(ElseStmNode node, Environment localEnv) {
		node.getStatementSequence().run(this, localEnv);
	}

	@Override
	public void run(WhileStmNode node, Environment localEnv) {
		Boolean condition = ((Bool)node.getCondition().eval(new ExpressionVisitor(), localEnv)).getValue();
		if (condition) {
			node.getStatementSequence().run(this, localEnv);
			node.run(this, localEnv);
		}
	}

}
