/**
 * 
 */
package com.arievanderveek.soo.parser.antlrimpl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Logger;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;

import com.arievanderveek.soo.SeaOfOberonException;
import com.arievanderveek.soo.ast.ASTNode;
import com.arievanderveek.soo.parser.Parser;
import com.arievanderveek.soo.parser.antlrimpl.generated.Oberon0Lexer;
import com.arievanderveek.soo.parser.antlrimpl.generated.Oberon0Parser;
import com.arievanderveek.soo.parser.antlrimpl.generated.Oberon0Parser.module_return;


/**
 * @author arieveek
 * 
 */
public class AntlrParserImpl implements Parser {

	private final static Logger LOGGER = Logger.getLogger(AntlrParserImpl.class
			.getName());

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.arievanderveek.soo.parser.Parser#parseFile(java.lang.String)
	 */
	@Override
	public ASTNode parseFile(String fileName) throws SeaOfOberonException {
		// Open a input stream to the file
		CharStream stream = null;
		try {
			InputStream inputStream = new FileInputStream(new File(fileName));
			stream = new ANTLRInputStream(inputStream);
			// Parse the input stream with the lexer and parser to create a tree
			Oberon0Lexer lexer = new Oberon0Lexer(stream);
			TokenStream tokenStream = new CommonTokenStream(lexer);
			Oberon0Parser parser = new Oberon0Parser(tokenStream);
			module_return parseTree = parser.module();
			// Return the AST node from the parsing result
			return parseTree.node;
		} catch (FileNotFoundException e) {
			throw new SeaOfOberonException("Input file " + fileName
					+ " is not found", e);
		} catch (IOException e) {
			throw new SeaOfOberonException("IO error while accessing "
					+ fileName, e);
		} catch (RecognitionException e) {
			throw new SeaOfOberonException("Recognition Error while parsing "
					+ fileName, e);
		}
	}
}
