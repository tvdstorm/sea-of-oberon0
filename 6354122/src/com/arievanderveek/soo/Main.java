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

	// TODO: Implement logging everywhere
	// TODO: Scope class is to fat, so refactor it!!
	// TODO: Write ALOT OF unit tests, with refactoring of scope in mind.
	// TODO: Write javadoc for every class
	// TODO: Migrate some lists to a Queue/LinkedList interface so FIFO is
	// guaranteed.
	// TODO: Check all classes for variable (final) consistency
	// TODO: Implement record types

	/**
	 * Parses the arguments and instantiates a instance of the oberon-0
	 * interpreter
	 * 
	 * @param args
	 *            Command line arguments
	 */
	public static void main(String[] args) {
		try {
			SeaOfOberonConfiguration config = ConfigurationFactory
					.createConfiguration(args);
			SeaOfOberonController controller = new SeaOfOberonController(config);
			controller.executeSourceCode();
			System.exit(0);
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		}
	}
}
