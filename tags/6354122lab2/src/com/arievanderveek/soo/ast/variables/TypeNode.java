package com.arievanderveek.soo.ast.variables;

import com.arievanderveek.soo.SeaOfOberonException;
import com.arievanderveek.soo.ast.ASTNode;
import com.arievanderveek.soo.runtime.Scope;
import com.arievanderveek.soo.runtime.Symbol;

/**
 * Abstract class representing a specific type in oberon0
 * 
 * @author Arie van der Veek
 * 
 */
public abstract class TypeNode implements ASTNode {

	/**
	 * Registers the TypeNode in the scope under the identifiers name
	 * 
	 * @param identifier
	 *            The identifier/name of the variable
	 * @param scope
	 *            The scope
	 * @throws SeaOfOberonException
	 */
	public abstract void registerVariable(String identifier, Scope scope)
			throws SeaOfOberonException;

	/**
	 * Creates a symbol from the TypeNode. A symbol is a runtime representation
	 * of the TypeNode.
	 * 
	 * @param scope
	 *            The current scope
	 * @return A symbol
	 * @throws SeaOfOberonException
	 */
	public abstract Symbol createSymbolFromType(Scope scope)
			throws SeaOfOberonException;

}