/**
 * 
 */
package com.arievanderveek.soo.parser;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;

import com.arievanderveek.soo.SeaOfOberonException;
import com.arievanderveek.soo.ast.codeblocks.ModuleNode;
import com.arievanderveek.soo.parser.antlrimpl.generated.Oberon0Lexer;
import com.arievanderveek.soo.parser.antlrimpl.generated.Oberon0Parser;
import com.arievanderveek.soo.parser.antlrimpl.generated.Oberon0Parser.module_return;

/**
 * Implementation of the parser in ANTLR v3
 * 
 * @author arieveek
 * 
 */
public class AntlrParserImpl implements Parser {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.arievanderveek.soo.parser.Parser#parseFile(java.lang.String)
	 */
	@Override
	public ModuleNode parseFile(String fileName) throws SeaOfOberonException {
		try {
			// Open a input stream to the file
			CharStream stream = null;
			InputStream inputStream = new FileInputStream(new File(fileName));
			stream = new ANTLRInputStream(inputStream);
			// Parse the input stream with the lexer and parser to create a tree
			Oberon0Lexer lexer = new Oberon0Lexer(stream);
			TokenStream tokenStream = new CommonTokenStream(lexer);
			Oberon0Parser parser = new Oberon0Parser(tokenStream);
			module_return parseTree = parser.module();
			// Return the AST node from the parsing result
			return parseTree.node;
		} catch (FileNotFoundException fnfe) {
			throw new SeaOfOberonException("Input file " + fileName + " is not found", fnfe);
		} catch (IOException ioe) {
			throw new SeaOfOberonException("IO error while accessing " + fileName, ioe);
		} catch (RecognitionException re) {
			throw new SeaOfOberonException("Recognition Error while parsing " + fileName, re);
		}
	}
}
