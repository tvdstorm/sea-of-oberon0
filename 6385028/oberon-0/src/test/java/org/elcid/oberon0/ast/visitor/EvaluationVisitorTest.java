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
		IntegerExpNode intExp = new IntegerExpNode(10);
		assertTrue((Integer) visitor.visitIntegerNode(intExp) == 10);
	}

	@Test
	public void testVisitIdentifierNode() {
		String value = "identifier";
		IdentifierNode ident = new IdentifierNode(value);
		assertTrue(visitor.visitIdentifierNode(ident).equals(value));
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

	@Test
	public void testVisitGreaterOrEqualsExpNode() {
		GreaterOrEqualsExpNode trueGreater = new GreaterOrEqualsExpNode(new IntegerExpNode(2), new IntegerExpNode(1));
		assertTrue((Boolean) visitor.visitGreaterOrEqualsExpNode(trueGreater));

		GreaterOrEqualsExpNode trueEquals = new GreaterOrEqualsExpNode(new IntegerExpNode(2), new IntegerExpNode(2));
		assertTrue((Boolean) visitor.visitGreaterOrEqualsExpNode(trueEquals));

		GreaterOrEqualsExpNode falseGreater = new GreaterOrEqualsExpNode(new IntegerExpNode(2), new IntegerExpNode(3));
		assertFalse((Boolean) visitor.visitGreaterOrEqualsExpNode(falseGreater));
	}

	@Test
	public void testVisitLesserExpNode() {
		LesserExpNode trueExp = new LesserExpNode(new IntegerExpNode(1), new IntegerExpNode(2));
		assertTrue((Boolean) visitor.visitLesserExpNode(trueExp));

		LesserExpNode falseExp = new LesserExpNode(new IntegerExpNode(1), new IntegerExpNode(1));
		assertFalse((Boolean) visitor.visitLesserExpNode(falseExp));
	}

	@Test
	public void testVisitLesserOrEqualsExpNode() {
		LesserOrEqualsExpNode trueLesser = new LesserOrEqualsExpNode(new IntegerExpNode(1), new IntegerExpNode(2));
		assertTrue((Boolean) visitor.visitLesserOrEqualsExpNode(trueLesser));

		LesserOrEqualsExpNode trueEquals = new LesserOrEqualsExpNode(new IntegerExpNode(2), new IntegerExpNode(2));
		assertTrue((Boolean) visitor.visitLesserOrEqualsExpNode(trueEquals));

		LesserOrEqualsExpNode falseLesser = new LesserOrEqualsExpNode(new IntegerExpNode(3), new IntegerExpNode(2));
		assertFalse((Boolean) visitor.visitLesserOrEqualsExpNode(falseLesser));
	}

	@Test
	public void testVisitPlusExpNode() {
		PlusExpNode node = new PlusExpNode(new IntegerExpNode(2), new IntegerExpNode(3));
		assertTrue((Integer) visitor.visitPlusExpNode(node) == 5);
	}

	@Test
	public void testVisitMinusExpNode() {
		MinusExpNode node = new MinusExpNode(new IntegerExpNode(5), new IntegerExpNode(3));
		assertTrue((Integer) visitor.visitMinusExpNode(node) == 2);
	}

	@Test
	public void testVisitMultiplyExpNode() {
		MultiplyExpNode node = new MultiplyExpNode(new IntegerExpNode(2), new IntegerExpNode(3));
		assertTrue((Integer) visitor.visitMultiplyExpNode(node) == 6);
	}

	@Test
	public void testVisitDivideExpNode() {
		DivideExpNode node = new DivideExpNode(new IntegerExpNode(10), new IntegerExpNode(2));
		assertTrue((Integer) visitor.visitDivideExpNode(node) == 5);
	}

	@Test
	public void testVisitModuloExpNode() {
		ModuloExpNode node = new ModuloExpNode(new IntegerExpNode(10), new IntegerExpNode(3));
		assertTrue((Integer) visitor.visitModuloExpNode(node) == 1);
	}
}