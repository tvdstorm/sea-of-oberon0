package org.elcid.oberon0.ast.visitor;

import org.elcid.oberon0.ast.*;
import org.elcid.oberon0.ast.env.Environment;
import org.elcid.oberon0.ast.env.Procedure;
import org.elcid.oberon0.ast.env.Reference;
import org.elcid.oberon0.ast.values.*;

/**
 * Implements the methods for running statements of the Oberon-0 language.
 *
 * @author Pieter Brandwijk
 */
public class StatementVisitor {

	public void run(StatementSequenceNode node, Environment localEnv) {
		for (StatementNode statement : node.getStatements()) {
			statement.run(this, localEnv);
		}
	}

	public void run(AssignmentNode node, Environment localEnv) {
		Value value = (Value) node.getExpression().eval(new ExpressionVisitor(), localEnv);
		Reference ref = localEnv.getReference(node.getIdentSelector().getIdentifier());
		ref.set(value, localEnv);
	}

	public void run(IfStmNode node, Environment localEnv) {
		Boolean condition = ((Bool) node.getCondition().eval(new ExpressionVisitor(), localEnv)).getValue();
		if (condition) {
			node.getStatementSequence().run(this, localEnv);
		}
		else if (node.getElseNode() != null) {
			node.getElseNode().run(this, localEnv);
		}
	}

	public void run(ElseStmNode node, Environment localEnv) {
		node.getStatementSequence().run(this, localEnv);
	}

	public void run(WhileStmNode node, Environment localEnv) {
		Boolean condition = ((Bool)node.getCondition().eval(new ExpressionVisitor(), localEnv)).getValue();
		if (condition) {
			node.getStatementSequence().run(this, localEnv);
			node.run(this, localEnv);
		}
	}

	public void run(ProcCallStmNode node, Environment localEnv) {
		// Fetch procedure from env
		Procedure proc = localEnv.getProcedure(node.getIdentifier());
		// Create new subenv
		Environment subEnv = new Environment(localEnv);
		// Bind actual params to formal params in subenv
		if (node.getActualParameters().size() == proc.getFormalParams().size()) {
			for (int i = 0; i < node.getActualParameters().size(); i++) {
				Value value = (Value) node.getActualParameters().get(i).eval(new ExpressionVisitor(), localEnv);
				proc.getFormalParams().get(i).declare(subEnv, value);
			}
		}
		// Run declarations of proc in subenv
		proc.getDeclarationSequence().run(new DeclarationVisitor(), subEnv);
		// Run statement sequence of proc with subenv
		proc.getStatementSequence().run(new StatementVisitor(), subEnv);
	}

}
