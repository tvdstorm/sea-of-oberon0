/**
 * 
 */
package com.arievanderveek.soo.ast.statements;

import java.util.List;

import com.arievanderveek.soo.SeaOfOberonException;
import com.arievanderveek.soo.ast.ASTNode;
import com.arievanderveek.soo.ast.expr.ExpressionNode;
import com.arievanderveek.soo.runtime.Scope;
import com.arievanderveek.soo.util.Constants;

/**
 * Represents a while loop
 * 
 * @author arieveek
 * 
 */
public class WhileLoopNode implements ASTNode, StatementNode {

	private final ExpressionNode condition;
	private final List<StatementNode> statementSequence;

	/**
	 * @param condition
	 *            The condition that should be true for the loop to continue
	 * @param statementSequence
	 *            A sequence of statements that should be executed while the
	 *            condition is true
	 */
	public WhileLoopNode(ExpressionNode condition, List<StatementNode> statementSequence) {
		this.condition = condition;
		this.statementSequence = statementSequence;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.arievanderveek.soo.ast.ASTNode#interpret()
	 */
	@Override
	public void interpret(Scope scope) throws SeaOfOberonException {
		while (conditionIsTrue(scope)) {
			for (StatementNode node : statementSequence) {
				node.interpret(scope);
			}
		}
	}

	/**
	 * Checks if the condition of the while loop evaluates to true
	 * 
	 * @param scope
	 *            the currents scope
	 * @return true if the condition evaluates to true, otherwise false
	 * @throws SeaOfOberonException
	 *             if the evaluation does not result in a boolean value.
	 */
	private boolean conditionIsTrue(Scope scope) throws SeaOfOberonException {
		// 0 = false and 1 = true and anything else is exception
		Integer resolvedCondition = condition.interpret(scope);
		if (resolvedCondition == 0) {
			return false;
		} else if (resolvedCondition == 1) {
			return true;
		} else {
			throw new SeaOfOberonException("Result of boolean expression not 1 or 0. "
					+ resolvedCondition);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.arievanderveek.soo.ast.ASTNode#toTreeString(java.lang.String)
	 */
	@Override
	public String toTreeString(String ident) throws SeaOfOberonException {
		StringBuilder sb = new StringBuilder();
		sb.append("WHILE" + ident);
		sb.append(Constants.LINE_SEPARATOR);
		sb.append(condition.toTreeString(ident));
		sb.append(Constants.LINE_SEPARATOR);
		sb.append("DO");
		sb.append(Constants.LINE_SEPARATOR);
		for (ASTNode node : statementSequence) {
			sb.append(ident + ident + node.toTreeString(ident));
			sb.append(Constants.LINE_SEPARATOR);
		}
		sb.append("END");
		sb.append(Constants.LINE_SEPARATOR);
		return sb.toString();
	}

}
