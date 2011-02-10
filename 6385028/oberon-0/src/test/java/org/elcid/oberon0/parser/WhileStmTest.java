package org.elcid.oberon0.parser;

import org.elcid.oberon0.ast.*;
import org.elcid.oberon0.ast.env.*;
import org.elcid.oberon0.ast.values.*;
import org.antlr.runtime.*;
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
public class WhileStmTest {

	public WhileStmTest() { }

	@Test
	public void testIfThenElse() throws Exception {
		// Create an input character stream from smoke test file
		ANTLRInputStream input = new ANTLRInputStream(ClassLoader.getSystemResourceAsStream("org/elcid/oberon0/parser/whileTest.oberon0"));
		// Create an Oberon0Lexer that feeds from that stream
		Oberon0Lexer lexer = new Oberon0Lexer(input);
		// Create a stream of tokens fed by the lexer
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		// Create a parser that feeds off the token stream
		Oberon0Parser parser = new Oberon0Parser(tokens);
		// Begin parsing at rule while
		StatementNode seq = parser.statementSequence();

		Environment env = new Environment();

		seq.run(new StatementVisitor(), env);

		System.out.println("a = " + ((Int)env.getValue("a")).getValue());
	}
}