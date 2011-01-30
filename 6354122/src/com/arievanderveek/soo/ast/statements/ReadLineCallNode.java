/**
 * 
 */
package com.arievanderveek.soo.ast.statements;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import com.arievanderveek.soo.SeaOfOberonException;
import com.arievanderveek.soo.ast.ASTNode;
import com.arievanderveek.soo.ast.variables.CallByRefParameterNode;
import com.arievanderveek.soo.ast.variables.CallByValParameterNode;
import com.arievanderveek.soo.symboltable.Scope;

/**
 * @author arieveek
 * 
 */
public class ReadLineCallNode extends AbstractCallNode {

	/**
	 * @param identifier
	 */
	public ReadLineCallNode(ASTNode identifier) {
		super(identifier);
	}

	/**
	 * @param identifier
	 */
	public ReadLineCallNode(ASTNode identifier, List<ASTNode> parameters) {
		super(identifier, parameters);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.arievanderveek.soo.ast.ASTNode#interpret()
	 */
	@Override
	public Integer interpret(Scope scope) throws SeaOfOberonException {
		try {
			System.out.println("Enter a number and press enter");
			int consoleInput = 0;
			InputStreamReader converter = new InputStreamReader(System.in);
			BufferedReader in = new BufferedReader(converter);
			consoleInput = Integer.parseInt(in.readLine());
			System.out.println(consoleInput);
			for (ASTNode node : parameters){
				if ( node instanceof CallByRefParameterNode){
					
				}else if ( node instanceof CallByValParameterNode){
					
				}else{
					throw new SeaOfOberonException("Wrong argument type class.");
				}
			}
			return consoleInput;
		} catch (Exception e) {
			throw new SeaOfOberonException(
					"Exception while reading from console", e);
		}

	}
}