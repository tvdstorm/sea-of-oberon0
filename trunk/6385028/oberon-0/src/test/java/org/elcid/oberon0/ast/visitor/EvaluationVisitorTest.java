package org.elcid.oberon0.ast.visitor;

import org.elcid.oberon0.ast.EqualsNode;
import org.elcid.oberon0.ast.IntegerNode;
import org.elcid.oberon0.ast.BinaryExpNode;
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
	public void testVisitBinaryExpNode() {
		BinaryExpNode trueBinExp = new BinaryExpNode(new IntegerNode(2), new IntegerNode(2), new EqualsNode());
		assertTrue((Boolean) trueBinExp.accept(new EvaluationVisitor()));

		BinaryExpNode falseBinExp = new BinaryExpNode(new IntegerNode(3), new IntegerNode(2), new EqualsNode());
		assertFalse((Boolean) falseBinExp.accept(new EvaluationVisitor()));
	}

}