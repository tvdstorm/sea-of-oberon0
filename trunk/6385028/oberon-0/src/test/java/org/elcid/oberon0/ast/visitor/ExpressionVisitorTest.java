package org.elcid.oberon0.ast.visitor;

import org.elcid.oberon0.ast.*;
import org.elcid.oberon0.ast.values.Environment;
import org.elcid.oberon0.ast.values.IntVariable;
import org.elcid.oberon0.ast.values.Int;
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
		LOG.info("Testing method: visitValueExpNode");

		// Test with an integer value
		ValueExpNode intNode = new ValueExpNode(new Int(2));
		Integer resultInt = instance.visitValueExpNode(intNode, null);
		Integer expResultInt = 2;
		assertEquals(expResultInt, resultInt);

		// Test with an integer variable value
		env = new Environment();
		ValueExpNode varNode = new ValueExpNode(new IntVariable("age", 25, env));
		Integer resultIntVar = instance.visitValueExpNode(varNode, env);
		Integer expResultIntVar = 25;
		assertEquals(expResultIntVar, resultIntVar);
	}

	@Test
	public void testVisitPlusExpNode() {
		LOG.info("Testing method: visitPlusExpNode");

		// Test with two integer values
		PlusExpNode nodeInt = new PlusExpNode(new ValueExpNode(new Int(2)), new ValueExpNode(new Int(3)));
		Integer resultInt = instance.visitPlusExpNode(nodeInt, null);
		Integer expResultInt = 5;
		assertEquals(expResultInt, resultInt);

		// Test with two integer variable values
		IntVariable left = new IntVariable("left", 4, env);
		IntVariable right = new IntVariable("right", 5, env);
		PlusExpNode nodeIntVar = new PlusExpNode(new ValueExpNode(left), new ValueExpNode(right));
		Integer resultIntVar = instance.visitPlusExpNode(nodeIntVar, env);
		Integer expResultIntVar = 9;
		assertEquals(expResultIntVar, resultIntVar);
	}

	@Test
	public void testVisitMinusExpNode() {

	}

	@Test
	public void testVisitMultiplyExpNode() {

	}

	@Test
	public void testVisitDivideExpNode() {

	}

	@Test
	public void testVisitModuloExpNode() {

	}

	@Test
	public void testVisitEqualsExpNode() {

	}

	@Test
	public void testVisitGreaterExpNode() {

	}

	@Test
	public void testVisitGreaterOrEqualsExpNode() {

	}

	@Test
	public void testVisitLesserExpNode() {

	}

	@Test
	public void testVisitLesserOrEqualsExpNode() {
		
	}
}
