package com.arievanderveek.soo;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.arievanderveek.soo.util.ConfigurationFactory;
import com.arievanderveek.soo.util.SeaOfOberonConfiguration;

/**
 * The main class of the interpreter which runs the program.
 * 
 * @author arieveek
 * 
 */
public class Main {
	
	private final static Logger LOGGER = Logger
	.getLogger(Main.class.getName());
	
	/**
	 * Parses the arguments and instantiates a instance of the oberon-0
	 * interpreter
	 * 
	 * @param args Command line arguments
	 */
	public static void main(String[] args) {
		try {
			SeaOfOberonConfiguration config = ConfigurationFactory.createConfiguration(args);
			SeaOfOberonController sooc = new SeaOfOberonController(config);
			sooc.executeSourceCode();
			System.exit(0);
		} catch (Exception e) {
			LOGGER.log(Level.SEVERE,"Exception encountered, exiting program", e);
			System.exit(1);
		}
	}
}
