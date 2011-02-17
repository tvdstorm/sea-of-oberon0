/**
 * 
 */
package com.arievanderveek.soo.parser;

import com.arievanderveek.soo.SeaOfOberonException;
import com.arievanderveek.soo.ast.codeblocks.ModuleNode;

/**
 * Interface for a parser implementation
 * 
 * @author arieveek
 * 
 */
public interface Parser {

	/**
	 * Parses a file and creates an AST ModuleNode from its content.
	 * 
	 * @param fileName The name of the file
	 * @return a AST Module node
	 * @throws SeaOfOberonException
	 */
	public ModuleNode parseFile(String fileName) throws SeaOfOberonException;
}