/**
 * 
 */
package com.arievanderveek.soo.ast.statements;

import com.arievanderveek.soo.SeaOfOberonException;
import com.arievanderveek.soo.ast.ASTNode;
import com.arievanderveek.soo.ast.variables.IdentifierNode;
import com.arievanderveek.soo.symboltable.Scope;

/**
 * @author arieveek
 *
 */
public class AssignmentNode implements ASTNode {
	
	private final ASTNode identifier, expression;

	public AssignmentNode(ASTNode identifier, ASTNode expression){
		this.identifier = identifier;
		this.expression = expression;
	}

	/* (non-Javadoc)
	 * @see com.arievanderveek.soo.ast.ASTNode#interpret()
	 */
	@Override
	public Integer interpret(Scope scope) throws SeaOfOberonException {
		Integer result = expression.interpret(scope);
		scope.updateValue((IdentifierNode) identifier, result);
		return null;
	}

	/* (non-Javadoc)
	 * @see com.arievanderveek.soo.ast.ASTNode#toTreeString(java.lang.String)
	 */
	@Override
	public String toTreeString(String ident) throws SeaOfOberonException {
		StringBuilder sb = new StringBuilder();
		sb.append(identifier.toTreeString(ident));
		sb.append(ident + ":=" + ident); 
		sb.append(expression.toTreeString(ident));
		return sb.toString();
	}
}
