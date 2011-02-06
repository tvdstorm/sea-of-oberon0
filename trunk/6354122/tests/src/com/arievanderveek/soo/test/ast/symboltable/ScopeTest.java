/**
 * 
 */
package com.arievanderveek.soo.test.ast.symboltable;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.LinkedList;
import java.util.Queue;

import org.junit.Before;
import org.junit.Test;

import com.arievanderveek.soo.ast.ASTNode;
import com.arievanderveek.soo.ast.codeblocks.ModuleNode;
import com.arievanderveek.soo.ast.variables.IdentifierNode;
import com.arievanderveek.soo.ast.variables.IntegerNode;
import com.arievanderveek.soo.ast.variables.SelectorNode;
import com.arievanderveek.soo.symboltable.Scope;
import com.arievanderveek.soo.test.TestASTCreator;

/**
 * @author arieveek
 * 
 */
public class ScopeTest {

	ModuleNode simpleMaths = null;
	ModuleNode procsAndVariables = null;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() {
		try {
			simpleMaths = (ModuleNode) TestASTCreator.createSimpleMathAST();
			procsAndVariables = (ModuleNode) TestASTCreator
					.createProcAndVariablesAST();
		} catch (Exception e) {
			fail("Caught exceptions in test: " + e.getMessage());
		}
	}

	/**
	 * Test method for
	 * {@link com.arievanderveek.soo.symboltable.Scope#Scope(java.util.Map, java.util.Map, java.util.Map, java.util.Map)}
	 * {@link com.arievanderveek.soo.symboltable.Scope#getValue(com.arievanderveek.soo.ast.variables.IdentifierNode)}
	 * .
	 */
	@Test
	public void testRootScope() {
		Integer constI = new Integer(10);
		Integer constJ = new Integer(15);
		Integer result1stMathStatement = new Integer(-13);
		Integer updateValue1 = new Integer(56123);
		Integer updateValue2 = new Integer(2374);
		IdentifierNode identI = new IdentifierNode("i");
		IdentifierNode identJ = new IdentifierNode("j");
		IdentifierNode identTemp = new IdentifierNode("temp");
		try {
			Scope scope = new Scope(simpleMaths.getConstants(),
					simpleMaths.getTypes(), simpleMaths.getVariables(),
					simpleMaths.getProcedures());
			// Retrieving values to check if the scope contains the right
			// information
			assertEquals(constI, scope.getValue(identI));
			assertEquals(constJ, scope.getValue(identJ));
			// Get the first statements in the module node and interpret it
			simpleMaths.getStatementSequence().get(0).interpret(scope);
			assertEquals(result1stMathStatement, scope.getValue(identTemp));
			// Now test the update method
			scope.updateValue(identTemp, updateValue1);
			assertEquals(updateValue1, scope.getValue(identTemp));
			scope.updateValue(identTemp, updateValue2);
			assertEquals(updateValue2, scope.getValue(identTemp));
		} catch (Exception e) {
			fail("Caught exceptions in test: " + e.getMessage());
		}
	}

	/**
	 * Test method for
	 * {@link com.arievanderveek.soo.symboltable.Scope#Scope(com.arievanderveek.soo.symboltable.Scope, com.arievanderveek.soo.ast.codeblocks.ProcedureNode, java.util.List)}
	 * {@link com.arievanderveek.soo.symboltable.Scope#getValue(com.arievanderveek.soo.ast.variables.IdentifierNode)}
	 * .
	 */
	@Test
	public void testScopeScopeProcedureNodeListOfASTNode() {
		// Create expected values
		Integer expectedValueForPos0InArray = new Integer(1);
		Integer expectedValueForPos1InArray = new Integer(0);
		Integer expectedValueForPos3InArray = new Integer(4);
		Integer expectedValueForPos4InArray = new Integer(3);
		// Create selector lists
		Queue<ASTNode> selectorPos0 = new LinkedList<ASTNode>();
		selectorPos0.add(new IntegerNode(0));
		Queue<ASTNode> selectorPos1 = new LinkedList<ASTNode>();
		selectorPos1.add(new IntegerNode(1));
		Queue<ASTNode> selectorPos3 = new LinkedList<ASTNode>();
		selectorPos3.add(new IntegerNode(3));
		Queue<ASTNode> selectorPos4 = new LinkedList<ASTNode>();
		selectorPos4.add(new IntegerNode(4));
		// Create the identifiers for the array positions
		final String identifier = "input";
		IdentifierNode Pos0InArray = new IdentifierNode(identifier,
				new SelectorNode(selectorPos0));
		IdentifierNode Pos1InArray = new IdentifierNode(identifier,
				new SelectorNode(selectorPos1));
		IdentifierNode Pos3InArray = new IdentifierNode(identifier,
				new SelectorNode(selectorPos3));
		IdentifierNode Pos4InArray = new IdentifierNode(identifier,
				new SelectorNode(selectorPos4));
		try {
			Scope rootScope = new Scope(procsAndVariables.getConstants(),
					procsAndVariables.getTypes(),
					procsAndVariables.getVariables(),
					procsAndVariables.getProcedures());
			// Get and interpret the 2nd statement, because that's a while loop
			// populating an array needed
			ASTNode whileNode = procsAndVariables.getStatementSequence().get(1);
			whileNode.interpret(rootScope);
			// Get the 3rd statement, because that's a procedure call.
			ASTNode procCallNode = procsAndVariables.getStatementSequence()
					.get(2);
			// Interpret the procedure call with the currently created scope
			procCallNode.interpret(rootScope);
			// Now validate the variables. Pos 1 and 2 should be swapped
			assertEquals(expectedValueForPos0InArray,
					rootScope.getValue(Pos0InArray));
			assertEquals(expectedValueForPos1InArray,
					rootScope.getValue(Pos1InArray));
			// Redo the test but then with 4th statement. This is also a swap
			procCallNode = procsAndVariables.getStatementSequence().get(3);
			// Interpret the procedure call with the currently created scope
			procCallNode.interpret(rootScope);
			// Now validate the variables. Pos 3 and 4 should be swapped
			assertEquals(expectedValueForPos3InArray,
					rootScope.getValue(Pos3InArray));
			assertEquals(expectedValueForPos4InArray,
					rootScope.getValue(Pos4InArray));
		} catch (Exception e) {
			fail("Caught exceptions in test: " + e.getMessage());
		}
	}

	/**
	 * Test method for
	 * {@link com.arievanderveek.soo.symboltable.Scope#getProcedure(java.lang.String)}.
	 */
	@Test
	public void testGetProcedure() {
		Scope rootScope = null;
		try {
			rootScope = new Scope(procsAndVariables.getConstants(),
					procsAndVariables.getTypes(),
					procsAndVariables.getVariables(),
					procsAndVariables.getProcedures());
		} catch (Exception e) {
			fail("Caught exceptions in test: " + e.getMessage());
		}
		// Test all registered procedures
		String[] registerdProcedures = { "Read", "Write", "WriteLn", "Swap" };
		try {
			for (String procName : registerdProcedures) {
				rootScope.getProcedure(procName);
			}
		} catch (Exception e) {
			fail("Caught exceptions in test: " + e.getMessage());
		}
		// test a not registrered procedure
		String notRegisteredProcedure = "GoFish";
		boolean exceptionThrown = false;
		try {
			rootScope.getProcedure(notRegisteredProcedure);
		} catch (Exception e) {
			// This should result in a message stating that proc is not found.
			exceptionThrown = true;
			assertTrue(
					"Exception is thrown, but procedure "
							+ notRegisteredProcedure
							+ " is not in the exception message",
					e.getMessage().contains(
							"Procedure " + notRegisteredProcedure
									+ " not found"));
		} finally {
			if (!exceptionThrown) {
				fail("No exception is thrown, thus proc "
						+ notRegisteredProcedure
						+ " is found. That is incorrect.");
			}
		}

	}

	/**
	 * Test method for
	 * {@link com.arievanderveek.soo.symboltable.Scope#updateValue(com.arievanderveek.soo.ast.variables.IdentifierNode, java.lang.Integer)}.
	 * 
	 */
	@Test
	public void testUpdateIntegerValue() {
		// Data for Integer values
		Integer updateValue1 = new Integer(56123);
		Integer updateValue2 = new Integer(2374);
		IdentifierNode identTemp = new IdentifierNode("temp");
		// Data for array values
		Queue<ASTNode> selectorPos0 = new LinkedList<ASTNode>();
		selectorPos0.add(new IntegerNode(0));
		Queue<ASTNode> selectorPos1 = new LinkedList<ASTNode>();
		selectorPos1.add(new IntegerNode(1));
		// Do the test
		try {
			Scope scope = new Scope(simpleMaths.getConstants(),
					simpleMaths.getTypes(), simpleMaths.getVariables(),
					simpleMaths.getProcedures());
			// Test the update method for Integers
			scope.updateValue(identTemp, updateValue1);
			assertEquals(updateValue1, scope.getValue(identTemp));
			scope.updateValue(identTemp, updateValue2);
			assertEquals(updateValue2, scope.getValue(identTemp));
			// Test the update method for Arrays
		} catch (Exception e) {
			fail("Caught exceptions in test: " + e.getMessage());
		}
	}
	
	/**
	 * Test method for
	 * {@link com.arievanderveek.soo.symboltable.Scope#updateValue(com.arievanderveek.soo.ast.variables.IdentifierNode, java.lang.Integer)}.
	 * 
	 */
	@Test
	public void testUpdateArrayValue() {
		// Data for array values
		Integer expectedValueForPos0InArray = new Integer(178456);
		Integer expectedValueForPos1InArray = new Integer(478615);
		Queue<ASTNode> selectorPos0 = new LinkedList<ASTNode>();
		selectorPos0.add(new IntegerNode(0));
		Queue<ASTNode> selectorPos1 = new LinkedList<ASTNode>();
		selectorPos1.add(new IntegerNode(1));
		final String identifier = "input";
		IdentifierNode Pos0InArray = new IdentifierNode(identifier,
				new SelectorNode(selectorPos0));
		IdentifierNode Pos1InArray = new IdentifierNode(identifier,
				new SelectorNode(selectorPos1));
		// Do the test
		try {
			Scope scope = new Scope(simpleMaths.getConstants(),
					simpleMaths.getTypes(), simpleMaths.getVariables(),
					simpleMaths.getProcedures());
			// Test the update method for Integers
			scope.updateValue(Pos0InArray, expectedValueForPos0InArray);
			assertEquals(expectedValueForPos0InArray, scope.getValue(Pos0InArray));
			scope.updateValue(Pos1InArray, expectedValueForPos1InArray);
			assertEquals(expectedValueForPos1InArray, scope.getValue(Pos1InArray));
			// Test the update method for Arrays
		} catch (Exception e) {
			fail("Caught exceptions in test: " + e.getMessage());
		}
	}	
}
