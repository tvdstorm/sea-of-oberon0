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
		EvaluationVisitor visitor = new EvaluationVisitor();

		EqualsExpNode trueNode = new EqualsExpNode(new IntegerExpNode(1), new IntegerExpNode(1));
		assertTrue((Boolean) visitor.visitEqualsExpNode(trueNode));

		EqualsExpNode falseNode = new EqualsExpNode(new IntegerExpNode(2), new IntegerExpNode(1));
		assertFalse((Boolean) visitor.visitEqualsExpNode(falseNode));
	}

}