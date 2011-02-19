package org.elcid.oberon0.parser;

import org.elcid.oberon0.ast.ModuleNode;
import org.antlr.runtime.*;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Simple test to see if an Oberon-0 script with a WITH statement functions correctly
 *
 * @author Pieter Brandwijk
 */
public class WithTest {

        public WithTest() {
        }

        @Test
        public void testWithStatement() throws Exception {
                // Create an input character stream from smoke test file
                ANTLRInputStream input = new ANTLRInputStream(ClassLoader.getSystemResourceAsStream("org/elcid/oberon0/parser/with.oberon0"));
                // Create an Oberon0Lexer that feeds from that stream
                Oberon0Lexer lexer = new Oberon0Lexer(input);
                // Create a stream of tokens fed by the lexer
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                // Create a parser that feeds off the token stream
                Oberon0Parser parser = new Oberon0Parser(tokens);
                // Begin parsing at rule module
                ModuleNode mod = parser.module();

				mod.run();

				int syntaxErrorCount = parser.getNumberOfSyntaxErrors();
				int expectedErrors = 0;

                assertEquals(expectedErrors, syntaxErrorCount);
        }
}
