package oberon0;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;

public class Main {

	/**
	 * @param args
	 * @throws RecognitionException 
	 */
	public static void main(String[] args) throws RecognitionException {
		// TODO Auto-generated method stub
		CharStream charStream = new ANTLRStringStream("once upon a time");
		Oberon0Lexer lexer = new Oberon0Lexer(charStream);
		TokenStream tokenStream = new CommonTokenStream(lexer);
		Oberon0Parser parser = new Oberon0Parser(tokenStream);
		parser.program();
		System.out.println("ok");
	}

}
