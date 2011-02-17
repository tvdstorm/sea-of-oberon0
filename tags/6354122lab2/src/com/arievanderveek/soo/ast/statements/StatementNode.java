package com.arievanderveek.soo.ast.statements;

import com.arievanderveek.soo.SeaOfOberonException;
import com.arievanderveek.soo.ast.ASTNode;
import com.arievanderveek.soo.runtime.Scope;

/**
 * Interface for a Statement Node
 * 
 * @author Arie van der Veek
 * 
 */
public interface StatementNode extends ASTNode {

	/**
	 * Interpret the node, but will not return any value.
	 * 
	 * @param scope
	 * @throws SeaOfOberonException
	 */
	public void interpret(Scope scope) throws SeaOfOberonException;

}
