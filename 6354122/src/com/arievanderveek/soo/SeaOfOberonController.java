package com.arievanderveek.soo;

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
	 * @param configuration the configuration used for parsing and interpreting
	 * 						the Oberon-0 code 
	 */
	public SeaOfOberonController(SeaOfOberonConfiguration configuration) {
		this.configuration = configuration;
	}

	public void executeSourceCode(){
		// Interpret the given code and make an AST from it. Might add some logic
		// so interpreters can be swithced by runtime parameters.
		// Pass the AST to the interpreter
	}

}
