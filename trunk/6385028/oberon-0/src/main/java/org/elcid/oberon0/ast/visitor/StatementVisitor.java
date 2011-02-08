package org.elcid.oberon0.ast.visitor;

import org.elcid.oberon0.ast.AssignmentNode;
import org.elcid.oberon0.ast.env.Environment;

/**
 * Implements the methods for running statements of the Oberon-0 language.
 *
 * @author Pieter Brandwijk
 */
public class StatementVisitor {

	public void run(AssignmentNode node, Environment localEnv) {
		Integer value = (Integer) node.getExpression().eval(new ExpressionVisitor(), localEnv);
		localEnv.put(node.getVariableName(), value);
	}

}