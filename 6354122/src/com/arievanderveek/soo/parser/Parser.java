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

	public ModuleNode parseFile(String fileName) throws SeaOfOberonException;

}
