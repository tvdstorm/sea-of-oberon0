package org.elcid.oberon0.parser;

import org.elcid.oberon0.ast.visitor.ExpressionVisitor;
import org.elcid.oberon0.ast.env.Environment;
import org.elcid.oberon0.ast.ExpressionNode;
import org.antlr.runtime.*;
import org.elcid.oberon0.ast.IfThenElseStmNode;
import org.elcid.oberon0.ast.values.Array;
import org.elcid.oberon0.ast.values.Bool;
import org.elcid.oberon0.ast.values.Int;
import org.elcid.oberon0.ast.values.Record;
import org.elcid.oberon0.ast.visitor.StatementVisitor;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Pieter Brandwijk
 */
public class IfThenElseTest {

	public IfThenElseTest() { }

	@Test
	public void testIfThenElse() throws Exception {
		// Create an input character stream from smoke test file
		ANTLRInputStream input = new ANTLRInputStream(ClassLoader.getSystemResourceAsStream("org/elcid/oberon0/parser/ifThenElseTest.oberon0"));
		// Create an Oberon0Lexer that feeds from that stream
		Oberon0Lexer lexer = new Oberon0Lexer(input);
		// Create a stream of tokens fed by the lexer
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		// Create a parser that feeds off the token stream
		Oberon0Parser parser = new Oberon0Parser(tokens);
		// Begin parsing at rule if
		IfThenElseStmNode ifNode = parser.ifStatement();

		Environment env = new Environment();
		env.put("a", new Int(5));

		ifNode.run(new StatementVisitor(), env);

		System.out.println("b = " + ((Int)env.getValue("b")).getValue());
		System.out.println("c = " + ((Int)env.getValue("c")).getValue());
		System.out.println("d = " + ((Int)env.getValue("d")).getValue());
	}
}