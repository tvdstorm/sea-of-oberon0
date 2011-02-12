package oberon.test;

import java.io.IOException;
import java.io.PushbackReader;
import java.io.StringReader;

import junit.framework.Assert;

import oberon.Main;
import oberon.Scope;
import oberon.data.IntegerArrayDataType;
import oberon.data.RecordDataType;
import oberon.lexer.Lexer;
import oberon.lexer.LexerException;
import oberon.parser.ParserException;
import oberon.procedures.ProcedureHeading;

import org.junit.Test;

public class WithTest extends AbstractTest {
	@Test
	public void withTest() throws ParserException, LexerException, IOException{
		String input = "MODULE module;" +
		"" +
		"VAR persoon : RECORD" +
		"	leeftijd : INTEGER;" +
		"	getallen : ARRAY 10 OF INTEGER;" +
		"	adres : RECORD" +
		"			straat : INTEGER" +
		"		END;" +
		"		jaar : INTEGER;" +
		"END;" +
		"" +
		"BEGIN" +
		"	WITH persoon " +
		"		leeftijd := 23" +
		"		jaar := 1923" +
		"		adres.straat := 2" +
		"		getallen[1] := 3" +
		"	END " +
		"END module.";
		
		StringReader reader = new StringReader(input); 
		Lexer lexer = new PrintLexer(new PushbackReader(reader));
		
		ProcedureHeading main = (ProcedureHeading)Main.runParser(lexer);
		Scope scope = main.getScope();
		
		RecordDataType persoon = (RecordDataType) scope.getVariable("persoon");
		Assert.assertEquals(23, persoon.getValueAtIndex("leeftijd").getValue(scope));
		Assert.assertEquals(1923, persoon.getValueAtIndex("jaar").getValue(scope));
		
		IntegerArrayDataType array = (IntegerArrayDataType) persoon.getValueAtIndex("getallen");
		Assert.assertEquals(3, array.getValueAtIndex(1));
	}
}
