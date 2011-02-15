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

public class ComparisonExpressionCheckerTest extends AbstractTest {

	@Test(expected=TypeCheckException.class)
	public void TestComparisonWithAnArrayAsAnOperand() throws ParserException, LexerException, IOException{
		String input = "MODULE module;" +
		"" +
		"VAR array : ARRAY 10 OF INTEGER; x, y : INTEGER;" +
		"" +
		"BEGIN" +
		"	IF array > 1 THEN" +
		"		y := y + 1" +
		"	END " +
		"END module.";

		StringReader reader = new StringReader(input); 
		Lexer lexer = new PrintLexer(new PushbackReader(reader));

		IProcedure main = Main.getMain(lexer);
		ProcedureHeadingChecker checker = new ProcedureHeadingChecker((ProcedureHeading)main);
		
		checker.check();
	}
	
	@Test(expected=TypeCheckException.class)
	public void TestComparisonWithARecordAsAnOperand() throws ParserException, LexerException, IOException{
		String input = "MODULE module;" +
		"" +
		"VAR record : RECORD" +
		"		leeftijd : INTEGER;" +
		"		getallen : ARRAY 10 OF INTEGER;" +
		"		adres : RECORD" +
		"			straat : INTEGER" +
		"		END;" +
		"		jaar : INTEGER;" +
		"	END; " +
		"	x, y : INTEGER;" +
		"" +
		"BEGIN" +
		"	IF record > 1 THEN" +
		"		y := y + 1" +
		"	END " +
		"END module.";

		StringReader reader = new StringReader(input); 
		Lexer lexer = new PrintLexer(new PushbackReader(reader));

		IProcedure main = Main.getMain(lexer);
		ProcedureHeadingChecker checker = new ProcedureHeadingChecker((ProcedureHeading)main);
		
		checker.check();
	}

	@Test
	public void TestValidComparison() throws ParserException, LexerException, IOException{
		String input = "MODULE module;" +
		"" +
		"VAR array : ARRAY 10 OF INTEGER; x, y : INTEGER;" +
		"" +
		"BEGIN" +
		"	IF 2 > 1 THEN" +
		"		y := y + 1" +
		"	END " +
		"END module.";

		StringReader reader = new StringReader(input); 
		Lexer lexer = new PrintLexer(new PushbackReader(reader));

		IProcedure main = Main.getMain(lexer);
		ProcedureHeadingChecker checker = new ProcedureHeadingChecker((ProcedureHeading)main);
		
		checker.check();
	}
}
