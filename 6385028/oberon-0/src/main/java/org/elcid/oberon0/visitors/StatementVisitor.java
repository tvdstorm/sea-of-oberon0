package org.elcid.oberon0.visitors;

import org.elcid.oberon0.ast.*;
import org.elcid.oberon0.env.Environment;
import org.elcid.oberon0.env.Procedure;
import org.elcid.oberon0.values.*;

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
		Value leftVal = node.getIdentSelector().eval(new ExpressionVisitor(), localEnv);
		Value rightVal = node.getExpression().eval(new ExpressionVisitor(), localEnv);
		leftVal.set(rightVal);
	}

	public void run(IfStmNode node, Environment localEnv) {
		Boolean condition = ((Bool) node.getCondition().eval(new ExpressionVisitor(), localEnv)).getValue();
		if (condition) {
			node.getStatementSequence().run(this, localEnv);
		} else if (node.getElseNode() != null) {
			node.getElseNode().run(this, localEnv);
		}
	}

	public void run(ElseStmNode node, Environment localEnv) {
		node.getStatementSequence().run(this, localEnv);
	}

	public void run(WhileStmNode node, Environment localEnv) {
		boolean condition = ((Bool) node.getCondition().eval(new ExpressionVisitor(), localEnv)).getValue();
		while (condition) {
			node.getStatementSequence().run(this, localEnv);
			condition = ((Bool) node.getCondition().eval(new ExpressionVisitor(), localEnv)).getValue();
		}
	}

	public void run(ProcCallStmNode node, Environment localEnv) {
		Procedure proc = localEnv.getProcedure(node.getIdentifier());
		Environment subEnv = new Environment(localEnv);
		boolean actualParamsExist = node.getActualParameters() != null;
		boolean formalParamsExist = proc.getFormalParams() != null;
		// Bind actual params to formal params in subenv
		if (actualParamsExist && formalParamsExist && (node.getActualParameters().size() == proc.getFormalParams().size())) {
			for (int i = 0; i < node.getActualParameters().size(); i++) {
				Value value = (Value) node.getActualParameters().get(i).eval(new ExpressionVisitor(), localEnv);
				proc.getFormalParams().get(i).declare(subEnv, value);
			}
		}
		proc.execute(subEnv);
	}
}
