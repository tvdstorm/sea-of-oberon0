/**
 * 
 */
package com.arievanderveek.soo.ast.statements;

import java.util.List;

import com.arievanderveek.soo.SeaOfOberonException;
import com.arievanderveek.soo.ast.ASTNode;
import com.arievanderveek.soo.symboltable.Scope;
import com.arievanderveek.soo.util.Constants;

/**
 * @author arieveek
 *
 */
public class WriteCallNode extends AbstractCallNode {

	/**
	 * @param identifier
	 */
	public WriteCallNode(ASTNode identifier) {
		super(identifier);
	}
	
	/**
	 * @param identifier
	 */
	public WriteCallNode(ASTNode identifier, List<ASTNode> parameters) {
		super(identifier,parameters);
	}

	/* (non-Javadoc)
	 * @see com.arievanderveek.soo.ast.ASTNode#interpret()
	 */
	@Override
	public Integer interpret(Scope scope) throws SeaOfOberonException {
		//TODO: Write and WriteLN are almoste the same, try to consolidate
		StringBuilder sb = new StringBuilder();
		sb.append(Constants.OUTPUT_TEXT);
		// For all parameters
		for (ASTNode node : super.parameters){
			// Add the interpreted value and a indentation to the string
			sb.append(node.interpret(scope));
			sb.append(Constants.INDENT);
		}
		System.out.println(sb.toString());
		return null;
	}

}
