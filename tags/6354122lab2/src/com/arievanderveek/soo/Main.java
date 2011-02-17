package com.arievanderveek.soo;

import com.arievanderveek.soo.util.ConfigurationFactory;
import com.arievanderveek.soo.util.SeaOfOberonConfiguration;

/**
 * The main class of the interpreter which runs the program.
 * 
 * @author arieveek
 * 
 */
public class Main {

	/**
	 * Parses the arguments and instantiates a instance of the oberon-0
	 * interpreter
	 * 
	 * @param args
	 *            Command line arguments
	 */
	public static void main(String[] args) {
		try {
			SeaOfOberonConfiguration config = ConfigurationFactory.createConfiguration(args);
			SeaOfOberonController controller = new SeaOfOberonController(config);
			controller.executeSourceCode();
			System.exit(0);
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		}
	}
}