package org.elcid.oberon0.parser;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.elcid.oberon0.ast.IdentSelectorNode;
import org.elcid.oberon0.ast.ModuleNode;
import org.elcid.oberon0.ast.env.Environment;
import org.elcid.oberon0.ast.values.Int;
import org.junit.Test;

/**
 *
 * @author Pieter Brandwijk
 */
public class DeclarationsTest {

	@Test
	public void testConst() throws Exception {
		// Create an input character stream from smoke test file
		ANTLRInputStream input = new ANTLRInputStream(ClassLoader.getSystemResourceAsStream("org/elcid/oberon0/parser/declarations.oberon0"));
		// Create an Oberon0Lexer that feeds from that stream
		Oberon0Lexer lexer = new Oberon0Lexer(input);
		// Create a stream of tokens fed by the lexer
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		// Create a parser that feeds off the token stream
		Oberon0Parser parser = new Oberon0Parser(tokens);
		// Begin parsing at rule if
		ModuleNode mod = parser.module();

		Environment env = new Environment();

		mod.run(env);

		System.out.println("a = " + ((Int)env.getReference("a").get()).getValue());
	}

}
