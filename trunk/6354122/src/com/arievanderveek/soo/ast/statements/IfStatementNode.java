/**
 * 
 */
package com.arievanderveek.soo.ast.statements;

import java.util.List;

import com.arievanderveek.soo.SeaOfOberonException;
import com.arievanderveek.soo.ast.ASTNode;
import com.arievanderveek.soo.ast.variables.IntegerNode;
import com.arievanderveek.soo.symboltable.Scope;
import com.arievanderveek.soo.util.Constants;

/**
 * @author arieveek
 * 
 */
public class IfStatementNode implements ASTNode {

	private ASTNode ifExpression;
	private List<ASTNode> thenStatementSequenceNode;
	private IfStatementNode elseNode;

	/**
	 * IfStatement Node constructor with all fields
	 * 
	 * @param expression
	 * @param thenStatementSequenceNode
	 * @param thenNode
	 * @param elseNode
	 */
	public IfStatementNode(ASTNode expression,
			List<ASTNode> thenStatementSequenceNode) {
		this.ifExpression = expression;
		this.thenStatementSequenceNode = thenStatementSequenceNode;
	}

	/**
	 * IfStatement Node constructor with all fields
	 * 
	 * @param expression
	 *            The if expression
	 * @param thenStatementSequenceNode
	 *            The statement sequence that is executed if the if expression
	 *            evaluates to true.
	 * @return The else node that is the current node in the tree
	 */
	public void insertNode(ASTNode expression,
			List<ASTNode> thenStatementSequenceNode) {
		if (ifExpression == null && thenStatementSequenceNode == null) {
			this.ifExpression = expression;
			this.thenStatementSequenceNode = thenStatementSequenceNode;
		}
		if (elseNode != null) {
			elseNode.insertNode(expression, thenStatementSequenceNode);
		} else {
			elseNode = new IfStatementNode(expression,
					thenStatementSequenceNode);
		}
	}

	public void addFinalElseStatementNode(
			List<ASTNode> finalElseStatementSequenceNode) {
		// Add the final Else statement to the end of the sequence.
		// Set expression to True, so it always gets executed
		insertNode(new IntegerNode(1), finalElseStatementSequenceNode);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.arievanderveek.soo.ast.ASTNode#interpret()
	 */
	@Override
	public Integer interpret(Scope scope) throws SeaOfOberonException {
		// 0 = false and 1 = true and anything else is exception
		Integer ifResult = ifExpression.interpret(scope);
		if (ifResult == 1) {
			// result is true, loop over the then sequence node
			for (ASTNode node : thenStatementSequenceNode) {
				node.interpret(scope);
			}
		} else if (ifResult == 0) {
			if (elseNode != null) {
				elseNode.interpret(scope);
			} else {
				// do noting as there is no else node to the if
			}
		} else {
			throw new SeaOfOberonException(
					"Result of boolean expression not 1 or 0. " + ifResult);
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.arievanderveek.soo.ast.ASTNode#toTreeString(java.lang.String)
	 */
	@Override
	public String toTreeString(String ident) throws SeaOfOberonException {
		StringBuilder sb = new StringBuilder();
		sb.append(ident + "IF ( ");
		sb.append(ident + ifExpression.toTreeString(ident));
		sb.append(ident + " )");
		sb.append(Constants.LINE_SEPARATOR);
		if (thenStatementSequenceNode != null) {
			for (ASTNode node : thenStatementSequenceNode) {
				sb.append(ident + node.toTreeString(ident));
				sb.append(Constants.LINE_SEPARATOR);
			}
		}
		sb.append(Constants.LINE_SEPARATOR);
		if (elseNode != null) {
			sb.append(ident + elseNode.toTreeString(ident));
			sb.append(Constants.LINE_SEPARATOR);
		} else {
			sb.append(ident + ident + ident + "no else");
			sb.append(Constants.LINE_SEPARATOR);
		}
		sb.append("ENDIF");
		return sb.toString();
	}

}
