package ar.oberon0.test;

import java.io.IOException;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;

import ar.oberon0.interpreter.Interpretable;
import ar.oberon0.parser.Oberon0Lexer;
import ar.oberon0.parser.Oberon0Parser;




public class Tester {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		CharStream stream = new ANTLRFileStream("C:\\temp\\test.ob");
		Oberon0Lexer lexer = new Oberon0Lexer(stream);
		TokenStream tokenStream = new CommonTokenStream(lexer);
		Oberon0Parser parser = new Oberon0Parser(tokenStream);
		Interpretable program = null;
		try {
			parser.module();
		} catch (RecognitionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println(program.Interpret());
		System.out.println();
		System.out.println("ok - result is ");
	}

}
