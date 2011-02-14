package com.kootsjur.oberon.parser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;

import org.antlr.runtime.CharStream;

import com.kootsjur.oberon.environment.Module;

public class Oberon extends AbstractOberon {
	
	@Override
	protected void evaluate(InputStream src, BufferedReader input, PrintWriter output) throws IOException, RecognitionException {
	   CharStream stream = new ANTLRInputStream(src);
		OberonLexer lexer = new OberonLexer(stream);
		TokenStream tokenStream = new CommonTokenStream(lexer);
		OberonParser parser = new OberonParser(tokenStream);
	   Module module = parser.module();
	   module.declare(input, output);
	   module.run();
		
	}

	@Override
	public String getName() {
		return "interpreter";
	}	
}
