package org.elcid.oberon0.parser;

import org.antlr.runtime.*;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Simple test to see if a verified Oberon-0 script is parsed without errors.
 *
 * @author Pieter Brandwijk
 */
public class Oberon0ParserTest {

        public Oberon0ParserTest() {
        }

        @Test
        public void testOberon0Parser() throws Exception {
                // Create an input character stream from smoke test file
                ANTLRInputStream input = new ANTLRInputStream(ClassLoader.getSystemResourceAsStream("org/elcid/oberon0/parser/quicksort.oberon0"));
                // Create an Oberon0Lexer that feeds from that stream
                Oberon0Lexer lexer = new Oberon0Lexer(input);
                // Create a stream of tokens fed by the lexer
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                // Create a parser that feeds off the token stream
                Oberon0Parser parser = new Oberon0Parser(tokens);
                // Begin parsing at rule module
                parser.module();

				int syntaxErrorCount = parser.getNumberOfSyntaxErrors();
				int expectedErrors = 0;

                assertEquals(expectedErrors, syntaxErrorCount);
        }
}
