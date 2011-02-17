package com.arievanderveek.soo;

import com.arievanderveek.soo.ast.codeblocks.ModuleNode;
import com.arievanderveek.soo.parser.AntlrParserImpl;
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
	
	/**
	 * Parses and runs the Oberon0 source code.
	 * 
	 * @throws SeaOfOberonException
	 */
	public void executeSourceCode() throws SeaOfOberonException {
		Parser oberon0Parser = new AntlrParserImpl();
		ModuleNode module = oberon0Parser.parseFile(configuration.getSourceCodeFileName());
		if (configuration.printTree()) {
			System.out.println(module.toTreeString(" "));
		}
		module.interpret(null);
	}

}
