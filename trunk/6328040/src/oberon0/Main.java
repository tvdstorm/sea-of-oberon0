package oberon0;

import java.io.IOException;

import oberon0.ast.routines.ModuleNode;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenRewriteStream;

import generated.*;

public class Main {
	
	public static void main(String [ ] args) throws IOException
	{
		ANTLRFileStream inputfile = new ANTLRFileStream("oberonfiles/temptest1.oberon0");
	    
	    // let ANTLR-generated code do the job
		Oberon0Lexer lex = new Oberon0Lexer(inputfile);			// lexer/parser are part of the processor
		TokenRewriteStream tokens = new TokenRewriteStream(lex);
		Oberon0Parser parser = new Oberon0Parser(tokens);
        
		ModuleNode module = null;
		try {
			module = parser.module();
		} catch (RecognitionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
        
		module.run(null);
	}
	
}
