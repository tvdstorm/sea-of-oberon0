package org.elcid.oberon0.parser;

import org.antlr.runtime.*;
import org.elcid.oberon0.ast.ModuleNode;

/**
 * The main method of this class allows for text to be typed into the console. After
 * the EOF character is given (CTRL + D on Unix) the input is then parsed and checked
 * for consistency with the Oberon-0 grammar.
 *
 * @author Pieter Brandwijk
 */
public class ManualInputParser {

	public static void main(String[] args) throws Exception {
		// Create an input character stream from smoke test file
		ANTLRInputStream input = new ANTLRInputStream(ClassLoader.getSystemResourceAsStream("quicksort.oberon0"));
		// Create an Oberon0Lexer that feeds from that stream
		Oberon0Lexer lexer = new Oberon0Lexer(input);
		// Create a stream of tokens fed by the lexer
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		// Create a parser that feeds off the token stream
		Oberon0Parser parser = new Oberon0Parser(tokens);
		// Begin parsing at rule module
		ModuleNode mod = parser.module();

		mod.run();
	}
}
