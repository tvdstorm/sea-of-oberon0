package org.elcid.oberon0.ast.visitor;

import org.elcid.oberon0.ast.*;
import org.elcid.oberon0.ast.env.Environment;
import org.elcid.oberon0.ast.values.Variable;
import org.elcid.oberon0.ast.values.Int;
import org.elcid.oberon0.exceptions.DivideByZeroException;
import org.elcid.oberon0.exceptions.ModuloZeroException;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Implements test cases for the {@link ExpressionVisitor}.
 *
 * @author Pieter Brandwijk
 */
public class ExpressionVisitorTest {

	private ExpressionVisitor instance;
	private Environment env;

	public ExpressionVisitorTest() { }

	@Before
	public void setUp() {
		instance = new ExpressionVisitor();
		env = new Environment();
	}

	@Test
	public void testVisitValueExpNode() {

		// Test with an integer value
		ValueExpNode intNode = new ValueExpNode(new Int(2));
		Integer resultInt = instance.eval(intNode, null);
		Integer expResultInt = 2;
		assertEquals(expResultInt, resultInt);

		// Test with an integer variable value
		env.put("varName", 25);
		ValueExpNode varNode = new ValueExpNode(new Variable("varName"));
		Integer resultIntVar = instance.eval(varNode, env);
		Integer expResultIntVar = 25;
		assertEquals(expResultIntVar, resultIntVar);
	}

	@Test
	public void testVisitPlusExpNode() {

		// Test with two integer values
		PlusExpNode nodeInt = new PlusExpNode(new ValueExpNode(new Int(2)), new ValueExpNode(new Int(3)));
		Integer resultInt = instance.eval(nodeInt, null);
		Integer expResultInt = 5;
		assertEquals(expResultInt, resultInt);

		// Test with two integer variable values
		env.put("left", 4);
		env.put("right", 5);
		Variable left = new Variable("left");
		Variable right = new Variable("right");
		PlusExpNode nodeIntVar = new PlusExpNode(new ValueExpNode(left), new ValueExpNode(right));
		Integer resultIntVar = instance.eval(nodeIntVar, env);
		Integer expResultIntVar = 9;
		assertEquals(expResultIntVar, resultIntVar);
	}

	@Test
	public void testVisitMinusExpNode() {

		// Test with two integer values
		MinusExpNode nodeInt = new MinusExpNode(new ValueExpNode(new Int(8)), new ValueExpNode(new Int(3)));
		Integer resultInt = instance.eval(nodeInt, null);
		Integer expResultInt = 5;
		assertEquals(expResultInt, resultInt);
	}

	@Test
	public void testVisitMultiplyExpNode() {

		// Test with two integer values
		MultiplyExpNode nodeInt = new MultiplyExpNode(new ValueExpNode(new Int(3)), new ValueExpNode(new Int(3)));
		Integer resultInt = instance.eval(nodeInt, null);
		Integer expResultInt = 9;
		assertEquals(expResultInt, resultInt);
	}

	@Test
	public void testVisitDivideExpNode() {

		// Test with two integer values
		DivideExpNode nodeInt = new DivideExpNode(new ValueExpNode(new Int(9)), new ValueExpNode(new Int(3)));
		Integer resultInt = instance.eval(nodeInt, null);
		Integer expResultInt = 3;
		assertEquals(expResultInt, resultInt);
	}

	@Test(expected= DivideByZeroException.class)
	public void testVisitDivideExpNodeWithZero() {

		// Test with two integer values
		DivideExpNode nodeInt = new DivideExpNode(new ValueExpNode(new Int(9)), new ValueExpNode(new Int(0)));
		instance.eval(nodeInt, null);
	}

	@Test
	public void testVisitModuloExpNode() {

		// Test with two integer values
		ModuloExpNode nodeInt = new ModuloExpNode(new ValueExpNode(new Int(9)), new ValueExpNode(new Int(7)));
		Integer resultInt = instance.eval(nodeInt, null);
		Integer expResultInt = 2;
		assertEquals(expResultInt, resultInt);
	}

	@Test(expected= ModuloZeroException.class)
	public void testVisitModuloExpNodeWithZero() {

		// Test with two integer values
		ModuloExpNode nodeInt = new ModuloExpNode(new ValueExpNode(new Int(9)), new ValueExpNode(new Int(0)));
		instance.eval(nodeInt, null);
	}

	@Test
	public void testVisitEqualsExpNode() {

		// Test with two integer values that are equal
		EqualsExpNode nodeTrue = new EqualsExpNode(new ValueExpNode(new Int(3)), new ValueExpNode(new Int(3)));
		Boolean resultTrue = instance.eval(nodeTrue, null);
		assertEquals(true, resultTrue);

		// Test with two integer values that are not equal
		EqualsExpNode nodeFalse = new EqualsExpNode(new ValueExpNode(new Int(4)), new ValueExpNode(new Int(3)));
		Boolean resultFalse = instance.eval(nodeFalse, null);
		assertEquals(false, resultFalse);

		// Test with two integer variable values that are equal
		env.put("left", 4);
		env.put("right", 4);
		Variable leftTrue = new Variable("left");
		Variable rightTrue = new Variable("right");
		EqualsExpNode nodeTrueVar = new EqualsExpNode(new ValueExpNode(leftTrue), new ValueExpNode(rightTrue));
		Boolean resultTrueVar = instance.eval(nodeTrueVar, env);
		assertEquals(true, resultTrueVar);

		// Test with two integer variable values that are not equal
		env.put("left", 4);
		env.put("right", 5);
		Variable leftFalse = new Variable("left");
		Variable rightFalse = new Variable("right");
		EqualsExpNode nodeFalseVar = new EqualsExpNode(new ValueExpNode(leftFalse), new ValueExpNode(rightFalse));
		Boolean resultFalseVar = instance.eval(nodeFalseVar, env);
		assertEquals(false, resultFalseVar);
	}

	@Test
	public void testVisitGreaterExpNode() {

		// Test with two integer values where the left is greater
		GreaterExpNode nodeTrue = new GreaterExpNode(new ValueExpNode(new Int(4)), new ValueExpNode(new Int(3)));
		Boolean resultTrue = instance.eval(nodeTrue, null);
		assertEquals(true, resultTrue);

		// Test with two integer values where the left is not greater
		GreaterExpNode nodeFalse = new GreaterExpNode(new ValueExpNode(new Int(2)), new ValueExpNode(new Int(3)));
		Boolean resultFalse = instance.eval(nodeFalse, null);
		assertEquals(false, resultFalse);

		// Test with two integer values that are equal
		GreaterExpNode nodeEqual = new GreaterExpNode(new ValueExpNode(new Int(3)), new ValueExpNode(new Int(3)));
		Boolean resultEqual = instance.eval(nodeEqual, null);
		assertEquals(false, resultEqual);
	}

	@Test
	public void testVisitGreaterOrEqualsExpNode() {

		// Test with two integer values where the left is greater
		GreaterOrEqualsExpNode nodeTrue = new GreaterOrEqualsExpNode(new ValueExpNode(new Int(4)), new ValueExpNode(new Int(3)));
		Boolean resultTrue = instance.eval(nodeTrue, null);
		assertEquals(true, resultTrue);

		// Test with two integer values where the left is not greater
		GreaterOrEqualsExpNode nodeFalse = new GreaterOrEqualsExpNode(new ValueExpNode(new Int(2)), new ValueExpNode(new Int(3)));
		Boolean resultFalse = instance.eval(nodeFalse, null);
		assertEquals(false, resultFalse);

		// Test with two integer values that are equal
		GreaterOrEqualsExpNode nodeEqual = new GreaterOrEqualsExpNode(new ValueExpNode(new Int(3)), new ValueExpNode(new Int(3)));
		Boolean resultEqual = instance.eval(nodeEqual, null);
		assertEquals(true, resultEqual);
	}

	@Test
	public void testVisitLesserExpNode() {

		// Test with two integer values where the left is lesser
		LesserExpNode nodeTrue = new LesserExpNode(new ValueExpNode(new Int(3)), new ValueExpNode(new Int(4)));
		Boolean resultTrue = instance.eval(nodeTrue, null);
		assertEquals(true, resultTrue);

		// Test with two integer values where the left is not lesser
		LesserExpNode nodeFalse = new LesserExpNode(new ValueExpNode(new Int(3)), new ValueExpNode(new Int(2)));
		Boolean resultFalse = instance.eval(nodeFalse, null);
		assertEquals(false, resultFalse);

		// Test with two integer values that are equal
		LesserExpNode nodeEqual = new LesserExpNode(new ValueExpNode(new Int(3)), new ValueExpNode(new Int(3)));
		Boolean resultEqual = instance.eval(nodeEqual, null);
		assertEquals(false, resultEqual);
	}

	@Test
	public void testVisitLesserOrEqualsExpNode() {

		// Test with two integer values where the left is lesser
		LesserOrEqualsExpNode nodeTrue = new LesserOrEqualsExpNode(new ValueExpNode(new Int(3)), new ValueExpNode(new Int(4)));
		Boolean resultTrue = instance.eval(nodeTrue, null);
		assertEquals(true, resultTrue);

		// Test with two integer values where the left is not lesser
		LesserOrEqualsExpNode nodeFalse = new LesserOrEqualsExpNode(new ValueExpNode(new Int(3)), new ValueExpNode(new Int(2)));
		Boolean resultFalse = instance.eval(nodeFalse, null);
		assertEquals(false, resultFalse);

		// Test with two integer values that are equal
		LesserOrEqualsExpNode nodeEqual = new LesserOrEqualsExpNode(new ValueExpNode(new Int(3)), new ValueExpNode(new Int(3)));
		Boolean resultEqual = instance.eval(nodeEqual, null);
		assertEquals(true, resultEqual);
	}

	@Test
	public void testVisitAndExpNode() {

	}

	@Test
	public void testVisitOrExpNode() {

	}
}
