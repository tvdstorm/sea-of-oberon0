package oberon0;

import java.io.IOException;

import oberon0.ast.routines.ICallable;
import oberon0.environment.Context;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenRewriteStream;

import generated.*;

public class Main {
	
	/*TODO type declarations
	 *TODO quicksort kapot? 13111 -> 11131
	 */
	
	public static void main(String [ ] args) throws IOException
	{
		ANTLRFileStream inputfile = new ANTLRFileStream("oberonfiles/quicksort.oberon0");
	    runOberonFile(inputfile);
	}
	
	public static void runOberonFile(ANTLRFileStream inputfile){
		// let ANTLR-generated code do the job
		Oberon0Lexer lex = new Oberon0Lexer(inputfile);			// lexer/parser are part of the processor
		TokenRewriteStream tokens = new TokenRewriteStream(lex);
		Oberon0Parser parser = new Oberon0Parser(tokens);
        
		ICallable module = null;
		try {
			module = parser.module();
		} catch (RecognitionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
        
		module.call(Context.noParent, ICallable.noActualParameters);
	}
	
}
