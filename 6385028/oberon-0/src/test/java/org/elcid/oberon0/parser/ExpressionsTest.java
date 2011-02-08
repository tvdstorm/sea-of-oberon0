package org.elcid.oberon0.parser;

import org.elcid.oberon0.ast.visitor.ExpressionVisitor;
import org.elcid.oberon0.ast.env.Environment;
import org.elcid.oberon0.ast.ExpressionNode;
import org.antlr.runtime.*;
import org.elcid.oberon0.ast.values.Array;
import org.elcid.oberon0.ast.values.Bool;
import org.elcid.oberon0.ast.values.Int;
import org.elcid.oberon0.ast.values.Record;

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
		// Begin parsing at rule expression
		ExpressionNode expr = parser.expression();

		Environment env = new Environment();
		env.put("a", new Int(2));
		Array ar = new Array();
		ar.add(new Int(1));
		ar.add(new Int(2));
		env.put("ar", ar);

		Record rec = new Record();
		rec.put("age", new Int(25));
		rec.put("days", ar);
		env.put("rec", rec);


		//Int result = (Int) expr.eval(new ExpressionVisitor(), env);
		//System.out.println(result.getValue());

		Bool result = (Bool) expr.eval(new ExpressionVisitor(), env);
		System.out.println(result.getValue());
	}
}