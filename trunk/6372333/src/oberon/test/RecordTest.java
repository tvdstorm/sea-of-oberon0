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
				"	getallen : ARRAY 10 OF INTEGER;" +
				"	adres : RECORD" +
				"		straat : INTEGER" +
				"	END;" +
				"END;" +
				"" +
				"BEGIN" +
				"	persoon.leeftijd := 23;" +
				"	Write( persoon.leeftijd );" +
				"	WriteLn;" +
//				"	persoon.adres.straat := 2;" +
//				"	Write(persoon.adres.straat);" +
				"	WriteLn;" +
				"	Write( persoon.leeftijd)" +
//				"	persoon.getallen[1] := 3;" +
//				"	Write(persoon.getallen[1])" +
				"END module.";

		StringReader reader = new StringReader(input); 
		Lexer lexer = new PrintLexer(new PushbackReader(reader));
		
		ProcedureHeading main = (ProcedureHeading)Main.runParser(lexer);
		Scope scope = main.getScope();
	}
	
}
