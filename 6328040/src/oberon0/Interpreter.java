package oberon0;

import oberon0.ast.routines.ICallable;
import oberon0.ast.routines.ModuleNode;
import oberon0.environment.Context;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenRewriteStream;

import generated.*;

public class Interpreter {
	
	/*
	 * Interprets the given file
	 */
	public static void interpretFile(ANTLRFileStream inputfile){
		getOutputContextFromFile(inputfile);
	}
	
	/*
	 * Interprets the given file and returns the context after running
	 * Can be used for testing purposes
	 */
	public static Context getOutputContextFromFile(ANTLRFileStream inputfile){
		// let ANTLR-generated code do the job
		Oberon0Lexer lex = new Oberon0Lexer(inputfile);
		TokenRewriteStream tokens = new TokenRewriteStream(lex);
		Oberon0Parser parser = new Oberon0Parser(tokens);
        
		ModuleNode module = null;
		//start parsing
		try {
			module = (ModuleNode) parser.module();
		} catch (RecognitionException e) {
			e.printStackTrace();
		} 
        //start interpreter by calling module
		module.call(Context.noParent, ICallable.noActualParameters);
		return module.getContextAfterCall();
	}
	
}
