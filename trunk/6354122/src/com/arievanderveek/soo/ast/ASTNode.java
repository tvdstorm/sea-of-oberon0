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

	// TODO: All nodes should throw a SeaOfOberonException, but haven't figured
	// out yet how it should work with antlr. For now all subclasses throw
	// runtime
	// exceptions which is not pretty.

	/**
	 * Walks the node and all its children to interpret the nodes
	 * 
	 * @param scope
	 *            A scope object containing context for the node
	 * 
	 * @return An integer as result the interpretation. Boolean values are
	 *         represented as 0 = false and 1 = true.
	 * 
	 * @throws SeaOfOberonException
	 *             If any exceptions are encountered while printing the node
	 * 
	 */
	// TODO: Not happy with the 1 and 0 for booleans, need to discuss what a
	// good solution
	// could be
	//public Integer interpret(Scope scope) throws SeaOfOberonException;

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
	// Decided for a string return, so this method can be used for unit testing
	public String toTreeString(String ident) throws SeaOfOberonException;

}
