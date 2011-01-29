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
public class IfStatementNode implements ASTNode {

	private ASTNode ifExpression;
	private List<ASTNode> thenStatementSequenceNode;
	private IfStatementNode elseNode;
	private List<ASTNode> finalElseStatementSequenceNode;

	/**
	 * IfStatement Node constructor with all fields
	 * 
	 * @param expression
	 * @param thenStatementSequenceNode 
	 * @param thenNode
	 * @param elseNode
	 */
	public IfStatementNode(ASTNode expression, List<ASTNode> thenStatementSequenceNode) {
		this.ifExpression = expression;
		this.thenStatementSequenceNode = thenStatementSequenceNode;
	}
	
	/**
	 * IfStatement Node constructor with all fields
	 * 
	 * @param expression The if expression
	 * @param thenStatementSequenceNode The statement sequence that is executed if the 
	 * 			if expression evaluates to true.
	 * @return The else node that is the current node in the tree
	 */	
	public void insertNode(ASTNode expression, List<ASTNode> thenStatementSequenceNode){
		if (ifExpression ==null && thenStatementSequenceNode ==null){
			this.ifExpression = expression;
			this.thenStatementSequenceNode = thenStatementSequenceNode;
		}
		if (elseNode !=null){
				elseNode.insertNode( expression, thenStatementSequenceNode);
		}else {
			elseNode = new IfStatementNode(expression, thenStatementSequenceNode);
		}
	}
	public void addFinalElseStatementNode(List<ASTNode> finalElseStatementSequenceNode){
		this.finalElseStatementSequenceNode = finalElseStatementSequenceNode;
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
		sb.append(ident + "IF ( ");
		sb.append(ident + ifExpression.toTreeString(ident));
		sb.append(ident + " )");
		sb.append(LINE_SEPARATOR);
		for (ASTNode node : thenStatementSequenceNode){
			sb.append(ident + node.toTreeString(ident));
			sb.append(LINE_SEPARATOR);
		}
		sb.append(LINE_SEPARATOR);
		if (elseNode!=null){
			sb.append(ident + elseNode.toTreeString(ident));
			sb.append(LINE_SEPARATOR);
		} else {
			sb.append(ident + ident + ident +"no else");
			sb.append(LINE_SEPARATOR);
		}
		if (finalElseStatementSequenceNode!=null){
			for (ASTNode node : finalElseStatementSequenceNode){
				sb.append(ident + ident + ident + node.toTreeString(ident));
				sb.append(LINE_SEPARATOR);
			}
		}else {
			sb.append(ident + ident +"no final else");
			sb.append(LINE_SEPARATOR);
		}
		sb.append("ENDIF");
		return sb.toString();
	}


}
