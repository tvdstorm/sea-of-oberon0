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

public class IfTest extends AbstractTest {
	@Test
	public void test_case_IfTestWithValidIfCondition() throws ParserException, LexerException, IOException {
		String input = "MODULE QuickSort;" +
		"" +
		"		CONST" +
		"			INPUTLENGTH = 5;" +
		"" +
		"VAR i, j: INTEGER;" +
		"" +
		"			BEGIN" +
		"		 		i := 0;" +
		"			IF i < INPUTLENGTH THEN" +
		"				i := i + 1" +
		"			END " +
		"		END QuickSort.";
		
		StringReader reader = new StringReader(input); 
		Lexer lexer = new PrintLexer(new PushbackReader(reader));
		
		ProcedureHeading main = (ProcedureHeading)Main.runParser(lexer);
		Scope scope = main.getScope();
		
		Assert.assertEquals(1, scope.getVariable("i").getValue(scope));
		Assert.assertEquals(0, scope.getVariable("j").getValue(scope));
	}
	
	@Test
	public void test_case_IfTestWithValidElseIfCondition() throws ParserException, LexerException, IOException {
		String input = "MODULE QuickSort;" +
		"" +
		"		CONST" +
		"			INPUTLENGTH = 5;" +
		"" +
		"VAR i, j: INTEGER;" +
		"" +
		"		BEGIN" +
		"		 	i := 0;" +
		"			IF i < 0 THEN" +
		"				i := i + 1" +
		"			ELSIF i < INPUTLENGTH THEN " +
		"				j := j + 1" +
		"			END " +
		"		END QuickSort.";
		
		StringReader reader = new StringReader(input); 
		Lexer lexer = new PrintLexer(new PushbackReader(reader));
		
		ProcedureHeading main = (ProcedureHeading)Main.runParser(lexer);
		Scope scope = main.getScope();
		
		Assert.assertEquals(0, scope.getVariable("i").getValue(scope));
		Assert.assertEquals(1, scope.getVariable("j").getValue(scope));
	}
	
	@Test
	public void test_case_IfTestWithElse() throws ParserException, LexerException, IOException {
		String input = "MODULE QuickSort;" +
		"" +
		"		CONST" +
		"			INPUTLENGTH = 5;" +
		"" +
		"VAR i, j: INTEGER;" +
		"" +
		"		BEGIN" +
		"		 	i := 0;" +
		"			IF i < 0 THEN" +
		"				i := i + 1" +
		"			ELSE " +
		"				j := j + 1" +
		"			END " +
		"		END QuickSort.";
		
		StringReader reader = new StringReader(input); 
		Lexer lexer = new PrintLexer(new PushbackReader(reader));
		
		ProcedureHeading main = (ProcedureHeading)Main.runParser(lexer);
		Scope scope = main.getScope();
		
		Assert.assertEquals(0, scope.getVariable("i").getValue(scope));
		Assert.assertEquals(1, scope.getVariable("j").getValue(scope));
	}
	
	@Test
	public void test_case_IfTestWithNestedIfs() throws ParserException, LexerException, IOException {
		String input = "MODULE QuickSort;" +
		"" +
		"		CONST" +
		"			INPUTLENGTH = 5;" +
		"" +
		"VAR i, j: INTEGER;" +
		"" +
		"		BEGIN" +
		"		 	i := 0;" +
		"			IF i <= 0 THEN" +
		"				IF j <= 0 THEN" +
		"					i := i + 1" +
		"				END" +
		"			END " +
		"		END QuickSort.";
		
		StringReader reader = new StringReader(input); 
		Lexer lexer = new PrintLexer(new PushbackReader(reader));
		
		ProcedureHeading main = (ProcedureHeading)Main.runParser(lexer);
		Scope scope = main.getScope();
		
		Assert.assertEquals(1, scope.getVariable("i").getValue(scope));
		Assert.assertEquals(0, scope.getVariable("j").getValue(scope));
	}
}
