package org.elcid.oberon0.ast.visitor;

import org.elcid.oberon0.ast.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Pieter Brandwijk
 */
public class EvaluationVisitorTest {

	EvaluationVisitor visitor;

    public EvaluationVisitorTest() {
    }

	@BeforeClass
	public static void setUpClass() throws Exception {
	}

	@AfterClass
	public static void tearDownClass() throws Exception {
	}

    @Before
    public void setUp() {
		visitor = new EvaluationVisitor();
    }

    @After
    public void tearDown() {
    }

	@Test
	public void testVisitIntegerNode() {
	}

	@Test
	public void testVisitIdentifierNode() {
	}

	@Test
	public void testVisitArrayNode() {
	}

	@Test
	public void testVisitEqualsExpNode() {
		EqualsExpNode trueExp = new EqualsExpNode(new IntegerExpNode(1), new IntegerExpNode(1));
		assertTrue((Boolean) visitor.visitEqualsExpNode(trueExp));

		EqualsExpNode falseExp = new EqualsExpNode(new IntegerExpNode(2), new IntegerExpNode(1));
		assertFalse((Boolean) visitor.visitEqualsExpNode(falseExp));
	}

	@Test
	public void testVisitGreaterExpNode() {
		GreaterExpNode trueExp = new GreaterExpNode(new IntegerExpNode(2), new IntegerExpNode(1));
		assertTrue((Boolean) visitor.visitGreaterExpNode(trueExp));

		GreaterExpNode falseExp = new GreaterExpNode(new IntegerExpNode(1), new IntegerExpNode(1));
		assertFalse((Boolean) visitor.visitGreaterExpNode(falseExp));
	}
}