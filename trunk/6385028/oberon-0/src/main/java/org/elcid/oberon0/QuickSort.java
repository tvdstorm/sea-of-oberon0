package org.elcid.oberon0;

import java.io.IOException;
import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.elcid.oberon0.ast.ModuleNode;
import org.elcid.oberon0.parser.Oberon0Lexer;
import org.elcid.oberon0.parser.Oberon0Parser;

/**
 * Executes the QuickSort Oberon-0 script.
 *
 * @author Pieter Brandwijk
 */
public class QuickSort {

	private static ModuleNode mod;

	public static void main(String[] args) {
		parseScript();
		mod.run();
	}

	private static void parseScript() {
		ANTLRInputStream input;
		try {
			input = new ANTLRInputStream(ClassLoader.getSystemResourceAsStream("quicksort.oberon0"));
			Oberon0Lexer lexer = new Oberon0Lexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			Oberon0Parser parser = new Oberon0Parser(tokens);
			try {
				mod = parser.module();
			} catch (RecognitionException ex) {
				throw new RuntimeException("Error while parsing quicksort script");
			}
		} catch (IOException ex) {
			throw new RuntimeException("Quicksort script was not found");
		} 
	}
}
