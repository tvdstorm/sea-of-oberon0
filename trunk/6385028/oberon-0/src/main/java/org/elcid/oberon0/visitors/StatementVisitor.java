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

	public void run(StatementSequenceNode node, Environment env) {
		for (StatementNode statement : node.getStatements()) {
			statement.run(this, env);
		}
	}

	public void run(AssignmentNode node, Environment env) {
		Value leftVal = node.getIdentSelector().eval(new ExpressionVisitor(), env);
		Value rightVal = node.getExpression().eval(new ExpressionVisitor(), env);
		leftVal.set(rightVal);
	}

	public void run(IfStmNode node, Environment env) {
		Boolean condition = ((Bool) node.getCondition().eval(new ExpressionVisitor(), env)).getValue();
		if (condition) {
			node.getStatementSequence().run(this, env);
		} else if (node.getElseNode() != null) {
			node.getElseNode().run(this, env);
		}
	}

	public void run(ElseStmNode node, Environment env) {
		node.getStatementSequence().run(this, env);
	}

	public void run(WhileStmNode node, Environment env) {
		boolean condition = ((Bool) node.getCondition().eval(new ExpressionVisitor(), env)).getValue();
		while (condition) {
			node.getStatementSequence().run(this, env);
			condition = ((Bool) node.getCondition().eval(new ExpressionVisitor(), env)).getValue();
		}
	}

	public void run(ProcCallStmNode node, Environment env) {
		Procedure proc = env.getProcedure(node.getIdentifier());
		Environment subEnv = new Environment(env);
		boolean actualParamsExist = node.getActualParameters() != null;
		boolean formalParamsExist = proc.getFormalParams() != null;
		
		// Bind actual params to formal params in subenv
		if (actualParamsExist && formalParamsExist && (node.getActualParameters().size() == proc.getFormalParams().size())) {
			for (int i = 0; i < node.getActualParameters().size(); i++) {
				Value value = (Value) node.getActualParameters().get(i).eval(new ExpressionVisitor(), env);
				proc.getFormalParams().get(i).declare(subEnv, value);
			}
		}
		proc.execute(subEnv);
	}
}
