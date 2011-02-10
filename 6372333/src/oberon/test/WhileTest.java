package oberon.test;

import java.io.IOException;
import java.io.PushbackReader;
import java.io.StringReader;

import junit.framework.Assert;
import oberon.Main;
import oberon.Scope;
import oberon.lexer.Lexer;
import oberon.lexer.LexerException;
import oberon.parser.ParserException;
import oberon.procedures.ProcedureHeading;

import org.junit.Test;

public class WhileTest extends AbstractTest {
	
	@Test
	public void test_case_WhileTestWithValidCondition() throws ParserException, LexerException, IOException {
		String input = "MODULE QuickSort;" +
		"" +
		"		CONST" +
		"			INPUTLENGTH = 5;" +
		"" +
		"VAR i: INTEGER;" +
		"" +
		"		BEGIN" +
		"		 	i := 0;" +
		"			WHILE i < INPUTLENGTH DO" +
		"			i := i + 1" +
		"		END " +
		"		END QuickSort.";

		StringReader reader = new StringReader(input); 
		Lexer lexer = new PrintLexer(new PushbackReader(reader));
		
		ProcedureHeading main = (ProcedureHeading)Main.runParser(lexer);
		Scope scope = main.getScope();
		
		Assert.assertEquals(5, scope.getVariable("i").getValue(scope));
	}

	@Test
	public void test_case_WhileTestWithImmediatelyTrueCondition() throws ParserException, LexerException, IOException {
		String input = "MODULE QuickSort;" +
		"" +
		"		CONST" +
		"			INPUTLENGTH = 5;" +
		"" +
		"VAR i: INTEGER;" +
		"" +
		"		BEGIN" +
		"		 	i := 0;" +
		"			WHILE i < 0 DO" +
		"			i := i + 1" +
		"		END " +
		"		END QuickSort.";

		StringReader reader = new StringReader(input); 
		Lexer lexer = new PrintLexer(new PushbackReader(reader));
		
		ProcedureHeading main = (ProcedureHeading)Main.runParser(lexer);
		Scope scope = main.getScope();
		
		Assert.assertEquals(0, scope.getVariable("i").getValue(scope));
	}
}
