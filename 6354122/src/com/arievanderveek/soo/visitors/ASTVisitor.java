/**
 * 
 */
package com.arievanderveek.soo.visitors;

import com.arievanderveek.soo.SeaOfOberonException;
import com.arievanderveek.soo.ast.*;
import com.arievanderveek.soo.ast.binaryoperators.AbstractBinaryOperatorNode;
import com.arievanderveek.soo.ast.unaryoperators.UnaryOperatorNode;

/**
 * @author arieveek
 *
 */
public interface ASTVisitor {
	
	/* Decision for a Visitor:
	 * + Nice clean AST code (versus interpreter pattern).
	 * + All code for a specific action in one class.
	 * + Very easy to create new tree manipulation actions using a new visitor
	 * 
	 * - Classes can become big when the amount of classes to visit
	 * - if exceptions are thrown in one class all classes (Visitor + AST should define 
	 *   the exception.
	 * - Double Dispatch can be confusing while debugging.
	 * - Traversal logic must be in the visitor if traversal are influenced by 
	 * 	 results of operations. Consequence is that a lot of getter should be added, which
	 * 	 exposes internal structure and compromises information hiding.
	 * 
	 * In the end i've chosen for the interpreter pattern as i think is easier to implement
	 * and more flexible for executing code.
	 * Down side is that AST is not "clean" anymore and contains execution logic. The
	 * AST cannot be packaged as a separate module and be reused by other application
	 * 
	 * Also at first glance the interpreter pattern looks easier to write unit tests for,
	 * but did not validate it.
	 *  
	 * This class still exists to explain reasoning, as there is no real documentation 
	 * page for the project.
	 */
	
}
