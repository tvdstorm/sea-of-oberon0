/**
 * 
 */
package com.arievanderveek.soo.ast.variables;

import java.util.Queue;

import com.arievanderveek.soo.SeaOfOberonException;
import com.arievanderveek.soo.ast.ASTNode;
import com.arievanderveek.soo.symboltable.Scope;

/**
 * ASTNode representing a Selector
 * 
 * @author arieveek
 *
 */
public class SelectorNode implements ASTNode {
	
	final Queue<ASTNode> selectors;

	public SelectorNode(Queue<ASTNode> selectors){
		assert selectors!=null;
		this.selectors = selectors;
	}

	/* (non-Javadoc)
	 * @see com.arievanderveek.soo.ast.ASTNode#interpret()
	 */
	@Override
	public Integer interpret(Scope scope) throws SeaOfOberonException {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.arievanderveek.soo.ast.ASTNode#toTreeString(java.lang.String)
	 */
	@Override
	public String toTreeString(String ident) throws SeaOfOberonException {
		StringBuilder sb = new StringBuilder();
		for (Object node : selectors.toArray() ){
			sb.append(((ASTNode) node).toTreeString(ident));
		}
		return sb.toString();
	}

	/**
	 * @return the selectors
	 */
	public Queue<ASTNode> getSelectors() {
		return selectors;
	}
}
