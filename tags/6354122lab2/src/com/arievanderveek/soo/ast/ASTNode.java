/**
 * 
 */
package com.arievanderveek.soo.ast;

import com.arievanderveek.soo.SeaOfOberonException;

/**
 * Interface for AST nodes.
 * 
 * @author arieveek
 * 
 */
public interface ASTNode {

	/**
	 * Walks the node and all its children to print it as a tree.
	 * 
	 * @param ident
	 *            The identation used for printing.
	 * @return String representation of the tree
	 * @throws SeaOfOberonException
	 *             If any exceptions are encountered while printing the node
	 * 
	 */
	public String toTreeString(String ident) throws SeaOfOberonException;

}
