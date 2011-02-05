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

	public ExpressionVisitorTest() { }

	@Before
	public void setUp() {
		instance = new ExpressionVisitor();
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
		Environment env = new Environment();
		ValueExpNode varNode = new ValueExpNode(new IntVariable("age", 25, env));
		Integer resultIntVar = instance.visitValueExpNode(varNode, env);
		Integer expResultIntVar = 25;
		assertEquals(expResultIntVar, resultIntVar);
	}

	@Test
	public void testVisitPlusExpNode() {

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
