package oberon.test;

import java.io.IOException;
import java.io.PushbackReader;
import java.io.StringReader;

import oberon.Main;
import oberon.Scope;
import oberon.lexer.Lexer;
import oberon.lexer.LexerException;
import oberon.parser.ParserException;
import oberon.procedures.ProcedureHeading;

import org.junit.Test;

public class RecordTest extends AbstractTest {

	@Test
	public void test_case_RecordTypeTest() throws ParserException, LexerException, IOException{
		String input = "MODULE module;" +
				"" +
				"VAR persoon : RECORD" +
				"	leeftijd : INTEGER;" +
				"	jaar : INTEGER;" +
				"END;" +
				"" +
				"BEGIN" +
				"	persoon.leeftijd := 23;" +
				"	persoon.jaar := 1923;" +
				"	Write( persoon.jaar );" +
				"	WriteLn;" +
				"	Write( persoon.leeftijd )" +
				"END module.";

		StringReader reader = new StringReader(input); 
		Lexer lexer = new PrintLexer(new PushbackReader(reader));
		
		ProcedureHeading main = (ProcedureHeading)Main.runParser(lexer);
		Scope scope = main.getScope();
	}
	
}
