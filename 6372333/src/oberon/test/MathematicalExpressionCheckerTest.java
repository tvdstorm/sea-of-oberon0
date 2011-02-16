package oberon.test;

import java.io.IOException;
import java.io.PushbackReader;
import java.io.StringReader;

import junit.framework.Assert;

import oberon.IProcedure;
import oberon.Main;
import oberon.Scope;
import oberon.lexer.Lexer;
import oberon.lexer.LexerException;
import oberon.parser.ParserException;
import oberon.procedures.ProcedureHeading;
import oberon.typechecker.ProcedureHeadingChecker;
import oberon.typechecker.TypeCheckException;

import org.junit.Test;

public class MathematicalExpressionCheckerTest extends AbstractTest {
	@Test(expected=TypeCheckException.class)
	public void TestMathematicalAnIncorrectMathExpression() 
		throws ParserException, LexerException, IOException{
		String input = "MODULE module;" +
		"" +
		"VAR array : ARRAY 10 OF INTEGER; x, y : INTEGER;" +
		"" +
		"BEGIN" +
		"	y := 1 + array" +
		" " +
		"END module.";

		StringReader reader = new StringReader(input); 
		Lexer lexer = new PrintLexer(new PushbackReader(reader));

		IProcedure main = Main.getMain(lexer);
		ProcedureHeadingChecker checker = new ProcedureHeadingChecker((ProcedureHeading)main);
		
		checker.check();
	}
	@Test(expected=TypeCheckException.class)
	public void TestMathematicalAnIncorrectMathExpression2() 
		throws ParserException, LexerException, IOException{
		String input = "MODULE module;" +
		"" +
		"VAR array : ARRAY 10 OF INTEGER; x, y : INTEGER;" +
		"" +
		"BEGIN" +
		"	y := array DIV 1" +
		"" +
		"END module.";

		StringReader reader = new StringReader(input); 
		Lexer lexer = new PrintLexer(new PushbackReader(reader));

		IProcedure main = Main.getMain(lexer);
		ProcedureHeadingChecker checker = new ProcedureHeadingChecker((ProcedureHeading)main);
		
		checker.check();
	}
	@Test
	public void TestMathematicalValidMathExpression() 
		throws ParserException, LexerException, IOException{
		String input = "MODULE module;" +
		"" +
		"VAR array : ARRAY 10 OF INTEGER; x, y : INTEGER;" +
		"" +
		"BEGIN" +
		"	y := 25 MOD 6" +
		"" +
		"END module.";

		StringReader reader = new StringReader(input); 
		Lexer lexer = new PrintLexer(new PushbackReader(reader));

		IProcedure main = Main.getMain(lexer);
		ProcedureHeadingChecker checker = new ProcedureHeadingChecker((ProcedureHeading)main);
		
		checker.check();
		
		reader.reset();
		lexer = new PrintLexer(new PushbackReader(reader));

		ProcedureHeading mainProc = (ProcedureHeading) Main.runParser(lexer);
		Scope scope = mainProc.getScope();
		
		Assert.assertEquals(1, scope.getVariable("y").getValue(scope));
	}
}
