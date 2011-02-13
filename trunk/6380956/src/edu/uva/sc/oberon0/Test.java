package edu.uva.sc.oberon0;

import org.antlr.runtime.CharStream;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;

public class Test {

	public static void main(String[] args) throws RecognitionException {
		CharStream charStream = new ANTLRStringStream("a:=2;a + 1");
		oberon0Lexer lexer = new oberon0Lexer(charStream);
		TokenStream tokenStream = new CommonTokenStream(lexer);
		oberon0Parser parser = new oberon0Parser(tokenStream);
		
		System.out.println(parser.test().toString());
	}

}
