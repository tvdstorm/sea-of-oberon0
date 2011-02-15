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

public class AssignmentTypeCheckerTest extends AbstractTest {
	
	@Test(expected=TypeCheckException.class)
	public void TestAssignmentOfIntToAnArrayVariable() throws ParserException, LexerException, IOException{
		String input = "MODULE module;" +
		"" +
		"VAR array : ARRAY 10 OF INTEGER; x, y : INTEGER;" +
		"" +
		"BEGIN" +
		"	array := 1" +
		"END module.";

		StringReader reader = new StringReader(input); 
		Lexer lexer = new PrintLexer(new PushbackReader(reader));

		IProcedure main = Main.getMain(lexer);
		ProcedureHeadingChecker checker = new ProcedureHeadingChecker((ProcedureHeading)main);
		
		checker.check();
	}
	
	@Test
	public void TestAssignmentOfComparisonToAVariable() throws ParserException, LexerException, IOException{
		String input = "MODULE module;" +
		"" +
		"VAR x : INTEGER;" +
		"" +
		"BEGIN" +
		"	x := (1 = 3)" +
		"END module.";

		StringReader reader = new StringReader(input); 
		Lexer lexer = new PrintLexer(new PushbackReader(reader));

		IProcedure main = Main.getMain(lexer);
		ProcedureHeadingChecker checker = new ProcedureHeadingChecker((ProcedureHeading)main);
		
		checker.check();
		
		//reset the reader so the input is parsed again
		reader.reset();
		lexer = new PrintLexer(new PushbackReader(reader));
		ProcedureHeading mainProc = (ProcedureHeading) Main.runParser(lexer);
		
		Scope scope = mainProc.getScope();
		//value should be 0 as 1 = 3 is false
		Assert.assertEquals(0, scope.getVariable("x").getValue(scope));
	}

	@Test
	public void TestAssignmentOfIntToAnArrayIndexerVariable() throws ParserException, LexerException, IOException{
		String input = "MODULE module;" +
		"" +
		"VAR array : ARRAY 10 OF INTEGER; x, y : INTEGER;" +
		"" +
		"BEGIN" +
		"	array[0] := 1" +
		"END module.";

		StringReader reader = new StringReader(input); 
		Lexer lexer = new PrintLexer(new PushbackReader(reader));

		IProcedure main = Main.getMain(lexer);
		ProcedureHeadingChecker checker = new ProcedureHeadingChecker((ProcedureHeading)main);
		
		checker.check();
	}
	
	@Test(expected=TypeCheckException.class)
	public void TestAssignmentOfIntToAnArrayVariableThatDoesNotExist() 
		throws ParserException, LexerException, IOException{
		String input = "MODULE module;" +
		"" +
		"VAR x, y : INTEGER;" +
		"" +
		"BEGIN" +
		"	array := 1" +
		"END module.";

		StringReader reader = new StringReader(input); 
		Lexer lexer = new PrintLexer(new PushbackReader(reader));

		IProcedure main = Main.getMain(lexer);
		ProcedureHeadingChecker checker = new ProcedureHeadingChecker((ProcedureHeading)main);
		
		checker.check();
	}
	
	@Test(expected=TypeCheckException.class)
	public void TestAssignmentOfIntToARecordVariable() throws ParserException, LexerException, IOException{
		String input = "MODULE module;" +
		"" +
		"VAR " +
		"	persoon : RECORD" +
		"		leeftijd : INTEGER;" +
		"		getallen : ARRAY 10 OF INTEGER;" +
		"		adres : RECORD" +
		"			straat : INTEGER" +
		"		END;" +
		"		jaar : INTEGER;" +
		"	END;" +
		"" +
		"BEGIN" +
		"	persoon := 1" +
		"END module.";

		StringReader reader = new StringReader(input); 
		Lexer lexer = new PrintLexer(new PushbackReader(reader));

		IProcedure main = Main.getMain(lexer);
		ProcedureHeadingChecker checker = new ProcedureHeadingChecker((ProcedureHeading)main);
		
		checker.check();
	}
	
	@Test
	public void TestAssignmentOfIntToARecordFieldVariable() throws ParserException, LexerException, IOException{
		String input = "MODULE module;" +
		"" +
		"VAR " +
		"	persoon : RECORD" +
		"		leeftijd : INTEGER;" +
		"		getallen : ARRAY 10 OF INTEGER;" +
		"		adres : RECORD" +
		"			straat : INTEGER" +
		"		END;" +
		"		jaar : INTEGER;" +
		"	END;" +
		"" +
		"BEGIN" +
		"	persoon.leeftijd := 1" +
		"END module.";

		StringReader reader = new StringReader(input); 
		Lexer lexer = new PrintLexer(new PushbackReader(reader));

		IProcedure main = Main.getMain(lexer);
		ProcedureHeadingChecker checker = new ProcedureHeadingChecker((ProcedureHeading)main);
		
		checker.check();
	}
}
