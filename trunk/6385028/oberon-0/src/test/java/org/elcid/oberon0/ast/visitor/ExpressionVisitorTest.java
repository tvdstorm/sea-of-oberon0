package org.elcid.oberon0.ast.visitor;

import org.elcid.oberon0.ast.values.Bool;
import org.elcid.oberon0.ast.*;
import org.elcid.oberon0.ast.env.Environment;
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
/*
	@Test
	public void testVisitValueExpNode() {

		// Test with an integer value
		IntExpNode intNode = new IntExpNode(2);
		Int resultValue = (Int) instance.eval(intNode, null);
		int expResultInt = 2;
		assertEquals(expResultInt, resultValue.getValue());

		// Test with an integer variable value
		env.declareValue("varName", new Int(25));
		IdentSelectorNode varNode = new IdentSelectorNode("varName");
		Int resultIntVar = (Int) instance.eval(varNode, env);
		Integer expResultIntVar = 25;
		assertEquals(expResultIntVar, resultIntVar.getValue());

	}

	@Test
	public void testVisitPlusExpNode() {

		// Test with two integer values
		PlusExpNode nodeInt = new PlusExpNode(new IntExpNode(new Int(2)), new IntExpNode(new Int(3)));
		Int resultInt = (Int) instance.eval(nodeInt, null);
		Integer expResultInt = 5;
		assertEquals(expResultInt, resultInt.getValue());

		// Test with two integer variable values
		env.declareValue("left", new Int(4));
		env.declareValue("right", new Int(5));
		IdentSelectorNode left = new IdentSelectorNode("left");
		IdentSelectorNode right = new IdentSelectorNode("right");
		PlusExpNode nodeIntVar = new PlusExpNode(left, right);
		Int resultIntVar = (Int) instance.eval(nodeIntVar, env);
		Integer expResultIntVar = 9;
		assertEquals(expResultIntVar, resultIntVar.getValue());
	}

	@Test
	public void testVisitMinusExpNode() {

		// Test with two integer values
		MinusExpNode nodeInt = new MinusExpNode(new IntExpNode(new Int(8)), new IntExpNode(new Int(3)));
		Int resultInt = (Int) instance.eval(nodeInt, null);
		Integer expResultInt = 5;
		assertEquals(expResultInt, resultInt.getValue());
	}

	@Test
	public void testVisitMultiplyExpNode() {

		// Test with two integer values
		MultiplyExpNode nodeInt = new MultiplyExpNode(new IntExpNode(new Int(3)), new IntExpNode(new Int(3)));
		Int resultInt = (Int) instance.eval(nodeInt, null);
		Integer expResultInt = 9;
		assertEquals(expResultInt, resultInt.getValue());
	}

	@Test
	public void testVisitDivideExpNode() {

		// Test with two integer values
		DivideExpNode nodeInt = new DivideExpNode(new IntExpNode(new Int(9)), new IntExpNode(new Int(3)));
		Int resultInt = (Int) instance.eval(nodeInt, null);
		Integer expResultInt = 3;
		assertEquals(expResultInt, resultInt.getValue());
	}

	@Test(expected= DivideByZeroException.class)
	public void testVisitDivideExpNodeWithZero() {

		// Test with two integer values
		DivideExpNode nodeInt = new DivideExpNode(new IntExpNode(new Int(9)), new IntExpNode(new Int(0)));
		instance.eval(nodeInt, null);
	}

	@Test
	public void testVisitModuloExpNode() {

		// Test with two integer values
		ModuloExpNode nodeInt = new ModuloExpNode(new IntExpNode(new Int(9)), new IntExpNode(new Int(7)));
		Int resultInt = (Int) instance.eval(nodeInt, null);
		Integer expResultInt = 2;
		assertEquals(expResultInt, resultInt.getValue());
	}

	@Test(expected= ModuloZeroException.class)
	public void testVisitModuloExpNodeWithZero() {

		// Test with two integer values
		ModuloExpNode nodeInt = new ModuloExpNode(new IntExpNode(new Int(9)), new IntExpNode(new Int(0)));
		instance.eval(nodeInt, null);
	}

	@Test
	public void testVisitEqualsExpNode() {

		// Test with two integer values that are equal
		EqualsExpNode nodeTrue = new EqualsExpNode(new IntExpNode(new Int(3)), new IntExpNode(new Int(3)));
		Bool resultTrue = (Bool) instance.eval(nodeTrue, null);
		assertEquals(true, resultTrue.getValue());

		// Test with two integer values that are not equal
		EqualsExpNode nodeFalse = new EqualsExpNode(new IntExpNode(new Int(4)), new IntExpNode(new Int(3)));
		Bool resultFalse = (Bool) instance.eval(nodeFalse, null);
		assertEquals(false, resultFalse.getValue());

		// Test with two integer variable values that are equal
		env.declareValue("left", new Int(4));
		env.declareValue("right", new Int(4));
		IdentSelectorNode leftTrue = new IdentSelectorNode("left");
		IdentSelectorNode rightTrue = new IdentSelectorNode("right");
		EqualsExpNode nodeTrueVar = new EqualsExpNode(leftTrue, rightTrue);
		Bool resultTrueVar = (Bool) instance.eval(nodeTrueVar, env);
		assertEquals(true, resultTrueVar.getValue());

		// Test with two integer variable values that are not equal
		env.declareValue("left", new Int(4));
		env.declareValue("right", new Int(5));
		IdentSelectorNode leftFalse = new IdentSelectorNode("left");
		IdentSelectorNode rightFalse = new IdentSelectorNode("right");
		EqualsExpNode nodeFalseVar = new EqualsExpNode(leftFalse, rightFalse);
		Bool resultFalseVar = (Bool) instance.eval(nodeFalseVar, env);
		assertEquals(false, resultFalseVar.getValue());
	}

	@Test
	public void testVisitNotEqualsExpNode() {

		// Test with two integer values that are not equal
		NotEqualsExpNode nodeFalse = new NotEqualsExpNode(new IntExpNode(new Int(4)), new IntExpNode(new Int(3)));
		Bool resultFalse = (Bool) instance.eval(nodeFalse, null);
		assertEquals(true, resultFalse.getValue());

		// Test with two integer values that are equal
		NotEqualsExpNode nodeTrue = new NotEqualsExpNode(new IntExpNode(new Int(3)), new IntExpNode(new Int(3)));
		Bool resultTrue = (Bool) instance.eval(nodeTrue, null);
		assertEquals(false, resultTrue.getValue());
	}

	@Test
	public void testVisitGreaterExpNode() {

		// Test with two integer values where the left is greater
		GreaterExpNode nodeTrue = new GreaterExpNode(new IntExpNode(new Int(4)), new IntExpNode(new Int(3)));
		Bool resultTrue = (Bool) instance.eval(nodeTrue, null);
		assertEquals(true, resultTrue.getValue());

		// Test with two integer values where the left is not greater
		GreaterExpNode nodeFalse = new GreaterExpNode(new IntExpNode(new Int(2)), new IntExpNode(new Int(3)));
		Bool resultFalse = (Bool) instance.eval(nodeFalse, null);
		assertEquals(false, resultFalse.getValue());

		// Test with two integer values that are equal
		GreaterExpNode nodeEqual = new GreaterExpNode(new IntExpNode(new Int(3)), new IntExpNode(new Int(3)));
		Bool resultEqual = (Bool) instance.eval(nodeEqual, null);
		assertEquals(false, resultEqual.getValue());
	}

	@Test
	public void testVisitGreaterOrEqualsExpNode() {

		// Test with two integer values where the left is greater
		GreaterOrEqualsExpNode nodeTrue = new GreaterOrEqualsExpNode(new IntExpNode(new Int(4)), new IntExpNode(new Int(3)));
		Bool resultTrue = (Bool) instance.eval(nodeTrue, null);
		assertEquals(true, resultTrue.getValue());

		// Test with two integer values where the left is not greater
		GreaterOrEqualsExpNode nodeFalse = new GreaterOrEqualsExpNode(new IntExpNode(new Int(2)), new IntExpNode(new Int(3)));
		Bool resultFalse = (Bool) instance.eval(nodeFalse, null);
		assertEquals(false, resultFalse.getValue());

		// Test with two integer values that are equal
		GreaterOrEqualsExpNode nodeEqual = new GreaterOrEqualsExpNode(new IntExpNode(new Int(3)), new IntExpNode(new Int(3)));
		Bool resultEqual = (Bool) instance.eval(nodeEqual, null);
		assertEquals(true, resultEqual.getValue());
	}

	@Test
	public void testVisitLesserExpNode() {

		// Test with two integer values where the left is lesser
		LesserExpNode nodeTrue = new LesserExpNode(new IntExpNode(new Int(3)), new IntExpNode(new Int(4)));
		Bool resultTrue = (Bool) instance.eval(nodeTrue, null);
		assertEquals(true, resultTrue.getValue());

		// Test with two integer values where the left is not lesser
		LesserExpNode nodeFalse = new LesserExpNode(new IntExpNode(new Int(3)), new IntExpNode(new Int(2)));
		Bool resultFalse = (Bool) instance.eval(nodeFalse, null);
		assertEquals(false, resultFalse.getValue());

		// Test with two integer values that are equal
		LesserExpNode nodeEqual = new LesserExpNode(new IntExpNode(new Int(3)), new IntExpNode(new Int(3)));
		Bool resultEqual = (Bool) instance.eval(nodeEqual, null);
		assertEquals(false, resultEqual.getValue());
	}

	@Test
	public void testVisitLesserOrEqualsExpNode() {

		// Test with two integer values where the left is lesser
		LesserOrEqualsExpNode nodeTrue = new LesserOrEqualsExpNode(new IntExpNode(new Int(3)), new IntExpNode(new Int(4)));
		Bool resultTrue = (Bool) instance.eval(nodeTrue, null);
		assertEquals(true, resultTrue.getValue());

		// Test with two integer values where the left is not lesser
		LesserOrEqualsExpNode nodeFalse = new LesserOrEqualsExpNode(new IntExpNode(new Int(3)), new IntExpNode(new Int(2)));
		Bool resultFalse = (Bool) instance.eval(nodeFalse, null);
		assertEquals(false, resultFalse.getValue());

		// Test with two integer values that are equal
		LesserOrEqualsExpNode nodeEqual = new LesserOrEqualsExpNode(new IntExpNode(new Int(3)), new IntExpNode(new Int(3)));
		Bool resultEqual = (Bool) instance.eval(nodeEqual, null);
		assertEquals(true, resultEqual.getValue());
	}

	@Test
	public void testVisitAndExpNode() {

	}

	@Test
	public void testVisitOrExpNode() {

	}

	@Test
	public void testVisitNotExpNode() {

	}

	@Test
	public void testVisitNegativeExpNode() {

	}
*/
}
