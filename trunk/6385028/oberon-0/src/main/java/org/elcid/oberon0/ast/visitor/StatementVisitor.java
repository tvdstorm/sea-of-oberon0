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
		boolean condition = ((Bool)node.getCondition().eval(new ExpressionVisitor(), localEnv)).getValue();
		while (condition) {
			System.out.println("Performing while");
			node.getStatementSequence().run(this, localEnv);
			condition = ((Bool)node.getCondition().eval(new ExpressionVisitor(), localEnv)).getValue();
	//		System.out.println("\n\nENVIRONMENT:");
	//		System.out.println(localEnv.toString());
	//		System.out.println("\n\nEND ENVIRONMENT:");
		}
	}

	public void run(ProcCallStmNode node, Environment localEnv) {
		// Fetch procedure from env
		Procedure proc = localEnv.getProcedure(node.getIdentifier());
		// Create new subenv
		Environment subEnv = new Environment(localEnv);
		// Bind actual params to formal params in subenv
		if ((node.getActualParameters() != null) && (proc.getFormalParams() != null) && (node.getActualParameters().size() == proc.getFormalParams().size())) {
			for (int i = 0; i < node.getActualParameters().size(); i++) {
				Value value = (Value) node.getActualParameters().get(i).eval(new ExpressionVisitor(), localEnv);
				proc.getFormalParams().get(i).declare(subEnv, value);
			}
		}
		// Execute procedure
		proc.execute(subEnv);
	}

}
