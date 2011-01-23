package org.elcid.oberon0.ast.visitor;

import org.elcid.oberon0.ast.EqualsOpNode;
import org.elcid.oberon0.ast.IntegerExpNode;
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
		EvaluationVisitor visitor = new EvaluationVisitor();

		BinaryExpNode trueBinExp = new BinaryExpNode(new IntegerExpNode(2), new IntegerExpNode(2), new EqualsOpNode());
		assertTrue((Boolean) trueBinExp.accept(visitor));

		BinaryExpNode falseBinExp = new BinaryExpNode(new IntegerExpNode(3), new IntegerExpNode(2), new EqualsOpNode());
		assertFalse((Boolean) falseBinExp.accept(visitor));

		BinaryExpNode falseLogicalBinExp = new BinaryExpNode(
				new BinaryExpNode(new IntegerExpNode(3), new IntegerExpNode(3), new EqualsOpNode() ),
				new BinaryExpNode(new IntegerExpNode(2), new IntegerExpNode(2), new EqualsOpNode() ),
				new EqualsOpNode());
		assertTrue((Boolean) falseLogicalBinExp.accept(visitor));
	}

}