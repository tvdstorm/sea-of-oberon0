package com.arievanderveek.soo;

import java.util.logging.Logger;

import com.arievanderveek.soo.ast.ASTNode;
import com.arievanderveek.soo.parser.Parser;
import com.arievanderveek.soo.util.SeaOfOberonConfiguration;

/**
 * Responsible for calling the Oberon-0 parser and interpreter and coordinating
 * information exchange between those modules.
 * 
 * @author arieveek
 * 
 */
public class SeaOfOberonController {

	private final static Logger LOGGER = Logger
			.getLogger(SeaOfOberonController.class.getName());

	SeaOfOberonConfiguration configuration = null;

	/**
	 * Constructs a SeaOfOberonController instance with a configuration
	 * 
	 * @param configuration
	 *            the configuration used for parsing and interpreting the
	 *            Oberon-0 code
	 */
	public SeaOfOberonController(SeaOfOberonConfiguration configuration) {
		assert (configuration != null);
		this.configuration = configuration;
	}

	public void executeSourceCode() throws SeaOfOberonException {
		try {
			// Create a new Parser by instantiating a new class with the
			// implementation class in the configuration
			Class parserImplClass = Class.forName(configuration
					.getParserImplClass());
			Parser oberon0Parser = (Parser) parserImplClass.newInstance();
			// Parse the source file and create an AST from it.
			ASTNode ast = oberon0Parser.parseFile(configuration.getSourceCodeFileName());
			// Print it to string
			if(configuration.printTree()){
			  System.out.println(ast.toTreeString(" "));
			}
			// Execute Code
			ast.interpret(null);
		} catch (InstantiationException e) {
			throw new SeaOfOberonException(
					"Class could not be instantiated" + "for class "
							+ configuration.getParserImplClass(), e);
		} catch (IllegalAccessException e) {
			throw new SeaOfOberonException(
					"Class or constructor is not accessible "
							+ "for class " + configuration.getParserImplClass(),
					e);
		} catch (ClassNotFoundException e) {
			throw new SeaOfOberonException(
					"Class not found for class"
							+ configuration.getParserImplClass(), e);
		}
	}

}
