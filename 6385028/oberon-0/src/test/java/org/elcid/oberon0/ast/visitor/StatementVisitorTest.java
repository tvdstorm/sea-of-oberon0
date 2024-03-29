package org.elcid.oberon0.ast.visitor;

import org.elcid.oberon0.visitors.StatementVisitor;
import org.elcid.oberon0.ast.AssignmentNode;
import org.elcid.oberon0.ast.EqualsExpNode;
import org.elcid.oberon0.ast.ExpressionNode;
import org.elcid.oberon0.ast.IdentSelectorNode;
import org.elcid.oberon0.ast.IfStmNode;
import org.elcid.oberon0.ast.IntExpNode;
import org.elcid.oberon0.ast.StatementSequenceNode;
import org.elcid.oberon0.values.Int;
import org.elcid.oberon0.env.Environment;
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

		// Test with true expression
		env.declareValue(A_VARIABLE_NAME, new Int(1));
		StatementSequenceNode ssTrue = new StatementSequenceNode();
		ssTrue.addStatement(new AssignmentNode(new IdentSelectorNode(A_VARIABLE_NAME), new IntExpNode(5)));
		IfStmNode ifNodeTrue = new IfStmNode(new EqualsExpNode(new IntExpNode(2), new IntExpNode(2)), ssTrue);
		ifNodeTrue.run(instance, env);
		int resultTrue = ((Int)env.getValue(A_VARIABLE_NAME)).getValue();
		int expResultTrue = 5;
		assertEquals(expResultTrue, resultTrue);

		// Test with false expression
		StatementSequenceNode ssFalse = new StatementSequenceNode();
		ssFalse.addStatement(new AssignmentNode(new IdentSelectorNode(A_VARIABLE_NAME), new IntExpNode(6)));
		IfStmNode ifNodeFalse = new IfStmNode(new EqualsExpNode(new IntExpNode(2), new IntExpNode(3)), ssFalse);
		ifNodeFalse.run(instance, env);
		int resultFalse = ((Int)env.getValue(A_VARIABLE_NAME)).getValue();
		int expResultFalse = 5;
		assertEquals(expResultFalse, resultFalse);
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