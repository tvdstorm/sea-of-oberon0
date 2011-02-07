package org.elcid.oberon0.parser;

import org.elcid.oberon0.ast.visitor.ExpressionVisitor;
import org.elcid.oberon0.ast.env.Environment;
import org.elcid.oberon0.ast.ExpressionNode;
import org.antlr.runtime.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Pieter Brandwijk
 */
public class ExpressionsTest {

	public ExpressionsTest() { }

	@Test
	public void testExpressions() throws Exception {
		// Create an input character stream from smoke test file
		ANTLRInputStream input = new ANTLRInputStream(ClassLoader.getSystemResourceAsStream("org/elcid/oberon0/parser/test.oberon0"));
		// Create an Oberon0Lexer that feeds from that stream
		Oberon0Lexer lexer = new Oberon0Lexer(input);
		// Create a stream of tokens fed by the lexer
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		// Create a parser that feeds off the token stream
		Oberon0Parser parser = new Oberon0Parser(tokens);
		// Begin parsing at rule module
		ExpressionNode expr = parser.expression();
		System.out.println(parser.getNumberOfSyntaxErrors());

		Environment env = new Environment();
		env.put("a", 2);

		System.out.println(expr.accept(new ExpressionVisitor(), env));

		//ExpressionVisitor visitor = new ExpressionVisitor();
		//System.out.println(visitor.eval(expr, env));
	}
}