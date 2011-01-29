/**
 * 
 */
package com.arievanderveek.soo.test.statements;

import com.arievanderveek.soo.ast.ASTNode;
import com.arievanderveek.soo.ast.variables.IdentifierNode;
import com.arievanderveek.soo.ast.statements.*;

/**
 * @author arieveek
 *
 */
public class ReadLineCallNodeTest {
	
	/**
	 * Parses the arguments and instantiates a instance of the oberon-0
	 * interpreter
	 * 
	 * @param args Command line arguments
	 */
	public static void main(String[] args) {
		try {
			ReadLineCallNode tmp = new ReadLineCallNode(new IdentifierNode("Bla"));
			System.out.println(tmp.interpret());
			System.exit(0);
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		}
	}

}
