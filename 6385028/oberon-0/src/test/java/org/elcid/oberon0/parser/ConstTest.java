package org.elcid.oberon0.parser;

import org.elcid.oberon0.ast.visitor.ExpressionVisitor;
import org.elcid.oberon0.ast.env.Environment;
import org.elcid.oberon0.ast.ExpressionNode;
import org.antlr.runtime.*;
import org.elcid.oberon0.ast.IfThenElseStmNode;
import org.elcid.oberon0.ast.ModuleNode;
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
public class ConstTest {

	public ConstTest() { }

	@Test
	public void testConst() throws Exception {
		// Create an input character stream from smoke test file
		ANTLRInputStream input = new ANTLRInputStream(ClassLoader.getSystemResourceAsStream("org/elcid/oberon0/parser/const.oberon0"));
		// Create an Oberon0Lexer that feeds from that stream
		Oberon0Lexer lexer = new Oberon0Lexer(input);
		// Create a stream of tokens fed by the lexer
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		// Create a parser that feeds off the token stream
		Oberon0Parser parser = new Oberon0Parser(tokens);
		// Begin parsing at rule if
		ModuleNode mod = parser.module();

		Environment env = new Environment();
		env.declareByValue("a", new Int(5));

		mod.run(env);

		System.out.println("a = " + ((Int)env.getReference("a").get()).getValue());
	}
}