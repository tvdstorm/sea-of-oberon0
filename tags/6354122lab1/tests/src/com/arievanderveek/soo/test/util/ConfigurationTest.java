/**
 * 
 */
package com.arievanderveek.soo.test.util;

import static org.junit.Assert.*;

import org.junit.Test;

import com.arievanderveek.soo.SeaOfOberonException;
import com.arievanderveek.soo.util.ConfigurationFactory;
import com.arievanderveek.soo.util.SeaOfOberonConfiguration;

/**
 * @author arieveek
 * 
 */
public class ConfigurationTest {

	private static final String correctAllArguments[] = { "-sourcefile",
			"oberon.0", "-parser", "arie.test.parser.iscorrect", 
			"-printtree"};
	
	private static final boolean printTheTree = true;
	
	private static final String correctRequiredArguments[] = { "-sourcefile",
			"oberon.0" };
	private static final String faultyArguments[] = { "-sourcefile",
			"oberon.0", "-pigscanfly" };

	/**
	 * Test method for
	 * {@link com.arievanderveek.soo.util.ConfigurationFactory#createConfiguration(java.lang.String[])}
	 * .
	 * 
	 * Tests if the {@link SeaOfOberonConfiguration} is created correctly with
	 * all arguments.
	 * 
	 * @throws SeaOfOberonException
	 *             If the given arguments were not correct.
	 */
	@Test
	public void testCreateConfigurationAllArguments()
			throws SeaOfOberonException {
		// Create the reference correct object for the assert
		SeaOfOberonConfiguration refConfig = new SeaOfOberonConfiguration();
		refConfig.setSourceCodeFileName(correctAllArguments[1]);
		refConfig.setParserImplClass(correctAllArguments[3]);
		refConfig.setPrintTree(printTheTree);
		// Create the configuration using the factory
		SeaOfOberonConfiguration config = ConfigurationFactory
				.createConfiguration(correctAllArguments);
		// Assert the config against the reference object
		assertEquals(config.getSourceCodeFileName(),
				refConfig.getSourceCodeFileName());
		assertEquals(config.getParserImplClass(),
				refConfig.getParserImplClass());
		assertEquals(config.printTree(),
				refConfig.printTree());
	}

	/**
	 * Test method for
	 * {@link com.arievanderveek.soo.util.ConfigurationFactory#createConfiguration(java.lang.String[])}
	 * .
	 * 
	 * Tests if the {@link SeaOfOberonConfiguration} is created correctly with
	 * the required arguments.
	 * 
	 * @throws SeaOfOberonException
	 *             If the given arguments were not correct.
	 */
	@Test
	public void testCreateConfigurationRequiredArguments()
			throws SeaOfOberonException {
		// Create the reference correct object for the assert
		SeaOfOberonConfiguration refConfig = new SeaOfOberonConfiguration();
		refConfig.setSourceCodeFileName(correctRequiredArguments[1]);
		// Create the configuration using the factory
		SeaOfOberonConfiguration config = ConfigurationFactory
				.createConfiguration(correctRequiredArguments);
		// Assert the config against the reference object
		assertEquals(config.getSourceCodeFileName(),
				refConfig.getSourceCodeFileName());
	}

	/**
	 * Test method for
	 * {@link com.arievanderveek.soo.util.ConfigurationFactory#createConfiguration(java.lang.String[])}
	 * .
	 * 
	 * Tests if the {@link SeaOfOberonConfiguration} throws a correct exception
	 * with faulty arguments.
	 */
	@Test
	public void testCreateConfigurationFaultyArguments() {
		boolean exceptionThrown = false;
		// Create the configuration using the factory
		try {
			@SuppressWarnings("unused")
			SeaOfOberonConfiguration config = ConfigurationFactory
					.createConfiguration(faultyArguments);
		} catch (SeaOfOberonException sooe) {
			// This should result in a message stating that pigscanfly is a
			// faulty argument
			exceptionThrown = true;
			assertTrue(
					"Exception is thrown, but argument is not in the exception message",
					sooe.getCause().getMessage().contains("-pigscanfly"));
		}
		 finally{
				if (!exceptionThrown){
					fail("No exception is thrown, thus argument is found. That is incorrect.");
				}
			}
	}
}
