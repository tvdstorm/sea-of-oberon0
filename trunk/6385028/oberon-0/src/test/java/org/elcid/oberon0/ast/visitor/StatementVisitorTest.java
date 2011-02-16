package org.elcid.oberon0.ast.visitor;

import org.elcid.oberon0.ast.AssignmentNode;
import org.elcid.oberon0.ast.ExpressionNode;
import org.elcid.oberon0.ast.IdentSelectorNode;
import org.elcid.oberon0.ast.IntExpNode;
import org.elcid.oberon0.ast.values.Int;
import org.elcid.oberon0.ast.env.Environment;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pieter
 */
public class StatementVisitorTest {

	private static String A_VARIABLE_NAME = "a";

	private StatementVisitor instance;
	private Environment env;

    public StatementVisitorTest() {
    }

	@BeforeClass
	public static void setUpClass() throws Exception {
	}

	@AfterClass
	public static void tearDownClass() throws Exception {
	}

    @Before
    public void setUp() {
		instance = new StatementVisitor();
		env = new Environment();
    }

    @After
    public void tearDown() {
    }

	@Test
	public void testRun_StatementSequenceNode_Environment() {
	}

	@Test
	public void testRun_AssignmentNode_Environment() {
		env.declareValue(A_VARIABLE_NAME, new Int(1));
		IdentSelectorNode idSelector = new IdentSelectorNode(A_VARIABLE_NAME);
		ExpressionNode expNode = new IntExpNode(5);
		AssignmentNode assNode = new AssignmentNode(idSelector, expNode);
		assNode.run(instance, env);
		int expectedResult = 5;
		int actualResult = ((Int) env.getValue(A_VARIABLE_NAME)).getValue();
		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void testRun_IfStmNode_Environment() {
	}

	@Test
	public void testRun_ElseStmNode_Environment() {
	}

	@Test
	public void testRun_WhileStmNode_Environment() {
	}

	@Test
	public void testRun_ProcCallStmNode_Environment() {
	}

}