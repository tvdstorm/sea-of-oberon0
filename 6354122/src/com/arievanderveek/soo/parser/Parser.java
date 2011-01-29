/**
 * 
 */
package com.arievanderveek.soo.parser;

import com.arievanderveek.soo.SeaOfOberonException;
import com.arievanderveek.soo.ast.ASTNode;

/**
 * Interface for a parser implementation
 * 
 * @author arieveek
 *
 */
public interface Parser {
	
	
	public ASTNode parseFile(String fileName) throws SeaOfOberonException;

}
