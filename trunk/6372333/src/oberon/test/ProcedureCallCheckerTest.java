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

public class ProcedureCallCheckerTest extends AbstractTest {  

		@Test(expected=TypeCheckException.class)
		public void TestProcedureCallWithAnIntegerPassedIntoAnArray() throws ParserException, LexerException, IOException{
			String input = "MODULE module;" +
			"" +
			"VAR array : ARRAY 10 OF INTEGER; x, y : INTEGER;" +
			"" +
			"PROCEDURE QuickSort(VAR array: ARRAY INPUTLENGTH OF INTEGER; left, right: INTEGER);" +
			"" +
			"	VAR" +
			"		temp: INTEGER;" +
			"BEGIN" +
			"	temp := x;" +
			"    x := y;" +
			"    y := temp " +
			"END QuickSort;" +
			"" +
			"BEGIN" +
			"	QuickSort(x, y, y)" +
			"END module.";

			StringReader reader = new StringReader(input); 
			Lexer lexer = new PrintLexer(new PushbackReader(reader));

			IProcedure main = Main.getMain(lexer);
			ProcedureHeadingChecker checker = new ProcedureHeadingChecker((ProcedureHeading)main);
			
			checker.check();
		}
		@Test(expected=TypeCheckException.class)
		public void TestProcedureCallWithTooFewActualParams() throws ParserException, LexerException, IOException{
			String input = "MODULE module;" +
			"" +
			"VAR array : ARRAY 10 OF INTEGER; x, y : INTEGER;" +
			"" +
			"PROCEDURE QuickSort(VAR array: ARRAY INPUTLENGTH OF INTEGER; left, right: INTEGER);" +
			"" +
			"	VAR" +
			"		temp: INTEGER;" +
			"BEGIN" +
			"	temp := x;" +
			"    x := y;" +
			"    y := temp " +
			"END QuickSort;" +
			"" +
			"BEGIN" +
			"	QuickSort(x, y)" +
			"END module.";

			StringReader reader = new StringReader(input); 
			Lexer lexer = new PrintLexer(new PushbackReader(reader));

			IProcedure main = Main.getMain(lexer);
			ProcedureHeadingChecker checker = new ProcedureHeadingChecker((ProcedureHeading)main);
			
			checker.check();
		}
		@Test(expected=TypeCheckException.class)
		public void TestProcedureCallWithTooFewFormalParams() throws ParserException, LexerException, IOException{
			String input = "MODULE module;" +
			"" +
			"VAR array : ARRAY 10 OF INTEGER; x, y : INTEGER;" +
			"" +
			"PROCEDURE QuickSort(VAR array: ARRAY INPUTLENGTH OF INTEGER; left, right: INTEGER);" +
			"" +
			"	VAR" +
			"		temp: INTEGER;" +
			"BEGIN" +
			"	temp := x;" +
			"    x := y;" +
			"    y := temp " +
			"END QuickSort;" +
			"" +
			"BEGIN" +
			"	QuickSort(x, y, x, y)" +
			"END module.";

			StringReader reader = new StringReader(input); 
			Lexer lexer = new PrintLexer(new PushbackReader(reader));

			IProcedure main = Main.getMain(lexer);
			ProcedureHeadingChecker checker = new ProcedureHeadingChecker((ProcedureHeading)main);
			
			checker.check();
		}
		@Test(expected=TypeCheckException.class)
		public void TestProcedureCallWithArraysPassedToAnIntFormalParam() 
			throws ParserException, LexerException, IOException{
			String input = "MODULE module;" +
			"" +
			"VAR array : ARRAY 10 OF INTEGER; x, y : INTEGER;" +
			"" +
			"PROCEDURE QuickSort(VAR array: ARRAY INPUTLENGTH OF INTEGER; left, right: INTEGER);" +
			"" +
			"	VAR" +
			"		temp: INTEGER;" +
			"BEGIN" +
			"	temp := x;" +
			"    x := y;" +
			"    y := temp " +
			"END QuickSort;" +
			"" +
			"BEGIN" +
			"	QuickSort(x, array, array)" +
			"END module.";

			StringReader reader = new StringReader(input); 
			Lexer lexer = new PrintLexer(new PushbackReader(reader));

			IProcedure main = Main.getMain(lexer);
			ProcedureHeadingChecker checker = new ProcedureHeadingChecker((ProcedureHeading)main);
			
			checker.check();
		}
}
