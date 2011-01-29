/**
 * 
 */
package com.arievanderveek.soo.test.ast.statement;

import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;

import com.arievanderveek.soo.SeaOfOberonController;
import com.arievanderveek.soo.SeaOfOberonException;
import com.arievanderveek.soo.ast.ASTNode;
import com.arievanderveek.soo.ast.statements.IfStatementNode;
import com.arievanderveek.soo.ast.variables.IntegerNode;
import com.arievanderveek.soo.util.ConfigurationFactory;
import com.arievanderveek.soo.util.SeaOfOberonConfiguration;

/**
 * @author arieveek
 *
 */
public class IfStatementTest {
	
	/**
	 * Parses the arguments and instantiates a instance of the oberon-0
	 * interpreter
	 * 
	 * @param args Command line arguments
	 */
	public static void main(String[] args) {
		try {
			System.out.println(testIfStatement());
			System.exit(0);
		} catch (Exception e) {
			System.exit(1);
		}
	}
	
	public static String testIfStatement() throws SeaOfOberonException{
		ASTNode expression = new IntegerNode(new Integer(1));
		List<ASTNode> thenStatementSequenceNode = new LinkedList<ASTNode>();
		thenStatementSequenceNode.add(expression);
		thenStatementSequenceNode.add(expression);
		thenStatementSequenceNode.add(expression);
		IfStatementNode rootNode = new IfStatementNode(expression, thenStatementSequenceNode);
		ASTNode expression2 = new IntegerNode(new Integer(2));
		List<ASTNode> thenStatementSequenceNode2 = new LinkedList<ASTNode>();
		thenStatementSequenceNode2.add(expression2);
		thenStatementSequenceNode2.add(expression2);
		thenStatementSequenceNode2.add(expression2);
		rootNode.insertNode( expression2, thenStatementSequenceNode2);
		ASTNode expression3 = new IntegerNode(new Integer(3));
		List<ASTNode> thenStatementSequenceNode3 = new LinkedList<ASTNode>();
		thenStatementSequenceNode3.add(expression3);
		thenStatementSequenceNode3.add(expression3);
		thenStatementSequenceNode3.add(expression3);
		rootNode.insertNode( expression3, thenStatementSequenceNode3);
		rootNode.addFinalElseStatementNode(thenStatementSequenceNode);
		return rootNode.toTreeString(" ");
	}

}
