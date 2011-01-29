/**
 * 
 */
package com.arievanderveek.soo.ast.statements;

import java.util.List;

import com.arievanderveek.soo.SeaOfOberonException;
import com.arievanderveek.soo.ast.ASTNode;
import com.arievanderveek.soo.visitors.ASTVisitor;

/**
 * @author arieveek
 *
 */
public class WhileLoopNode implements ASTNode {
	
	ASTNode condition;
	List<ASTNode> statementSequence; 

	
	/**
	 * @param condition The condition that should be true for the loop to continue
	 * @param statementSequence A sequence of statements that should be executed while
	 * 	the condition is true
	 */
	public WhileLoopNode(ASTNode condition, List<ASTNode> statementSequence) {
		this.condition = condition;
		this.statementSequence = statementSequence;
	}


	/* (non-Javadoc)
	 * @see com.arievanderveek.soo.ast.ASTNode#interpret()
	 */
	@Override
	public int interpret() throws SeaOfOberonException {
		// TODO Auto-generated method stub
		return 0;
	}


	/* (non-Javadoc)
	 * @see com.arievanderveek.soo.ast.ASTNode#toTreeString(java.lang.String)
	 */
	@Override
	public String toTreeString(String ident) throws SeaOfOberonException {
		StringBuilder sb = new StringBuilder();
		sb.append("WHILE" + ident);
		sb.append(LINE_SEPARATOR);
		sb.append(condition.toTreeString(ident));
		sb.append(LINE_SEPARATOR);
		sb.append("DO");
		sb.append(LINE_SEPARATOR);
		for (ASTNode node : statementSequence ){
			sb.append(ident + ident + node.toTreeString(ident));
			sb.append(LINE_SEPARATOR);
		}
		sb.append("END");
		sb.append(LINE_SEPARATOR);
		return sb.toString();
	}


}
