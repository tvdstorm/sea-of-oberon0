package oberon.test;

import java.io.IOException;
import java.io.PushbackReader;
import java.io.StringReader;

import oberon.IProcedure;
import oberon.Main;
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
