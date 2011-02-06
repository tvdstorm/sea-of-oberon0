package org.elcid.oberon0.ast.visitor;

import org.elcid.oberon0.ast.*;
import org.elcid.oberon0.ast.env.Environment;
import org.elcid.oberon0.ast.values.IntVariable;
import org.elcid.oberon0.ast.values.Int;
import org.elcid.oberon0.exceptions.DivideByZeroException;
import org.elcid.oberon0.exceptions.ModuloZeroException;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import static org.junit.Assert.*;

/**
 * Implements test cases for the {@link ExpressionVisitor}.
 *
 * @author Pieter Brandwijk
 */
public class ExpressionVisitorTest {

	private static Logger LOG = LoggerFactory.getLogger(ExpressionVisitorTest.class);

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
		LOG.info("Testing eval ValueExpNode");

		// Test with an integer value
		ValueExpNode intNode = new ValueExpNode(new Int(2));
		Integer resultInt = instance.eval(intNode, null);
		Integer expResultInt = 2;
		assertEquals(expResultInt, resultInt);

		// Test with an integer variable value
		env = new Environment();
		ValueExpNode varNode = new ValueExpNode(new IntVariable("age", 25, env));
		Integer resultIntVar = instance.eval(varNode, env);
		Integer expResultIntVar = 25;
		assertEquals(expResultIntVar, resultIntVar);
	}

	@Test
	public void testVisitPlusExpNode() {
		LOG.info("Testing eval PlusExpNode");

		// Test with two integer values
		PlusExpNode nodeInt = new PlusExpNode(new ValueExpNode(new Int(2)), new ValueExpNode(new Int(3)));
		Integer resultInt = instance.eval(nodeInt, null);
		Integer expResultInt = 5;
		assertEquals(expResultInt, resultInt);

		// Test with two integer variable values
		IntVariable left = new IntVariable("left", 4, env);
		IntVariable right = new IntVariable("right", 5, env);
		PlusExpNode nodeIntVar = new PlusExpNode(new ValueExpNode(left), new ValueExpNode(right));
		Integer resultIntVar = instance.eval(nodeIntVar, env);
		Integer expResultIntVar = 9;
		assertEquals(expResultIntVar, resultIntVar);
	}

	@Test
	public void testVisitMinusExpNode() {
		LOG.info("Testing eval MinusExpNode");

		// Test with two integer values
		MinusExpNode nodeInt = new MinusExpNode(new ValueExpNode(new Int(8)), new ValueExpNode(new Int(3)));
		Integer resultInt = instance.eval(nodeInt, null);
		Integer expResultInt = 5;
		assertEquals(expResultInt, resultInt);
	}

	@Test
	public void testVisitMultiplyExpNode() {
		LOG.info("Testing eval MultiplyExpNode");

		// Test with two integer values
		MultiplyExpNode nodeInt = new MultiplyExpNode(new ValueExpNode(new Int(3)), new ValueExpNode(new Int(3)));
		Integer resultInt = instance.eval(nodeInt, null);
		Integer expResultInt = 9;
		assertEquals(expResultInt, resultInt);
	}

	@Test
	public void testVisitDivideExpNode() {
		LOG.info("Testing eval DivideExpNode");

		// Test with two integer values
		DivideExpNode nodeInt = new DivideExpNode(new ValueExpNode(new Int(9)), new ValueExpNode(new Int(3)));
		Integer resultInt = instance.eval(nodeInt, null);
		Integer expResultInt = 3;
		assertEquals(expResultInt, resultInt);
	}

	@Test(expected= DivideByZeroException.class)
	public void testVisitDivideExpNodeWithZero() {
		LOG.info("Testing eval DivideExpNode for a DivivdeByZeroException");

		// Test with two integer values
		DivideExpNode nodeInt = new DivideExpNode(new ValueExpNode(new Int(9)), new ValueExpNode(new Int(0)));
		Integer resultInt = instance.eval(nodeInt, null);
	}

	@Test
	public void testVisitModuloExpNode() {
		LOG.info("Testing eval ModuloExpNode");

		// Test with two integer values
		ModuloExpNode nodeInt = new ModuloExpNode(new ValueExpNode(new Int(9)), new ValueExpNode(new Int(7)));
		Integer resultInt = instance.eval(nodeInt, null);
		Integer expResultInt = 2;
		assertEquals(expResultInt, resultInt);
	}

	@Test(expected= ModuloZeroException.class)
	public void testVisitModuloExpNodeWithZero() {
		LOG.info("Testing eval ModuloExpNode for a ModuloZeroException");

		// Test with two integer values
		ModuloExpNode nodeInt = new ModuloExpNode(new ValueExpNode(new Int(9)), new ValueExpNode(new Int(0)));
		Integer resultInt = instance.eval(nodeInt, null);
	}

	@Test
	public void testVisitEqualsExpNode() {
		LOG.info("Testing eval EqualsExpNode");

		// Test with two integer values that are equal
		EqualsExpNode nodeTrue = new EqualsExpNode(new ValueExpNode(new Int(3)), new ValueExpNode(new Int(3)));
		Boolean resultTrue = instance.eval(nodeTrue, null);
		assertEquals(true, resultTrue);

		// Test with two integer values that are not equal
		EqualsExpNode nodeFalse = new EqualsExpNode(new ValueExpNode(new Int(4)), new ValueExpNode(new Int(3)));
		Boolean resultFalse = instance.eval(nodeFalse, null);
		assertEquals(false, resultFalse);

		// Test with two integer variable values that are equal
		IntVariable leftTrue = new IntVariable("left", 4, env);
		IntVariable rightTrue = new IntVariable("right", 4, env);
		EqualsExpNode nodeTrueVar = new EqualsExpNode(new ValueExpNode(leftTrue), new ValueExpNode(rightTrue));
		Boolean resultTrueVar = instance.eval(nodeTrueVar, env);
		assertEquals(true, resultTrueVar);

		// Test with two integer variable values that are not equal
		IntVariable leftFalse = new IntVariable("left", 4, env);
		IntVariable rightFalse = new IntVariable("right", 5, env);
		EqualsExpNode nodeFalseVar = new EqualsExpNode(new ValueExpNode(leftFalse), new ValueExpNode(rightFalse));
		Boolean resultFalseVar = instance.eval(nodeFalseVar, env);
		assertEquals(false, resultFalseVar);
	}

	@Test
	public void testVisitGreaterExpNode() {
		LOG.info("Testing eval GreaterExpNode");

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
		LOG.info("Testing eval GreaterOrEqualsExpNode");

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
		LOG.info("Testing eval LesserExpNode");

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
		LOG.info("Testing eval LesserOrEqualsExpNode");

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
