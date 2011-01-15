/**
 * 
 */
package com.arievanderveek.soo.util;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.GnuParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionBuilder;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

import com.arievanderveek.soo.SeaOfOberonException;

/**
 * Class responsible for creating a configuration for the Oberon-0 parser and
 * interpreter.
 * 
 * @author arieveek
 * 
 */
public class ConfigurationFactory {

	private final static Logger LOGGER = Logger
			.getLogger(SeaOfOberonException.class.getName());
	
	private final static String DEFAULT_PARSER_IMPL = 
			"com.arievanderveek.soo.parser.antlrimpl.AntlParserImpl";

	/**
	 * Creates a SeaOfOberonConfiguration containing the configuration to be 
	 * used by the parser and interpreter.
	 * 
	 * Note: An exception will be thrown if the parsed arguments do not contain
	 * correct information. In case the arguments are not correct, a help is
	 * printed and the program exits. 
	 * 
	 * @param args Command line arguments
	 * @return A SeaOfOberonConfiguration containing the configuration
	 * @throws SeaOfOberonException thrown when the parsed content is not correct. 
	 * 
	 */
	public static SeaOfOberonConfiguration createConfiguration(String args[])
			throws SeaOfOberonException {
		return parseArguments(args);
	}
	

	/**
	 * Parses the command line arguments and returns a SeaOfOberonConfiguration
	 * containing the configuration to be used by the parser and interpreter.
	 * 
	 * @param args Command line arguments
	 * @return A SeaOfOberonConfiguration containing the configuration
	 * @throws SeaOfOberonException thrown when the parsed content is not correct. 
	 * 
	 */
	private static SeaOfOberonConfiguration parseArguments(String[] args)
			throws SeaOfOberonException {
		SeaOfOberonConfiguration configuration = new SeaOfOberonConfiguration();
		CommandLineParser cliParser = new GnuParser();
		Options options = creatOptions();
		try {
			// parse the command line arguments
			CommandLine cmd = cliParser.parse(options, args);
			// Fill the configuration object with all the parsed options or
			// if applicable an default value
			String oberonParserClass = cmd.getOptionValue("implclass");
			if (oberonParserClass == null) {
				LOGGER.log(Level.FINEST,
						"Using default parser. Class:" + " {}",
						new Object[] { DEFAULT_PARSER_IMPL });
				configuration.setOberonParser(DEFAULT_PARSER_IMPL);
			} else {
				LOGGER.log(Level.FINEST, "Using alternative parser. Class:"
						+ " {}", new Object[] { oberonParserClass });
				configuration.setOberonParser(oberonParserClass);
			}
			String sourceFileName = cmd.getOptionValue("sourcefile");
			if (sourceFileName == null) {
				throw new SeaOfOberonException(
						"The source input file was not provided.");
			} else {
				LOGGER.log(Level.FINEST, "Source file: {}",
						new Object[] { sourceFileName });
				configuration.setSourceCodeFileName(sourceFileName);
			}
			// Done filling the configuration object.
		} catch (ParseException exp) {
			// parsing of arguments went wrong. Print message and help
			printHelp(options, exp.getMessage());
		}
		return configuration;

	}

	/**
	 * Method that formats the options and a message and prints them to the 
	 * standard out. Finally it exits with a 1, as the printing of a help message
	 * indicates the command line arguments where not correct.
	 * 
	 * @param options The expected command line options
	 * @param message An informative message
	 */
	private static void printHelp(Options options, String message) {
		// automatically generate the help statement
		HelpFormatter formatter = new HelpFormatter();
		formatter.printHelp(message, options);
		//TODO: Arie: Is it smart to use exit outside main method? Rethinks approach
		System.exit(1);
	}

	private static Options creatOptions() {
		//TODO: Arie: Remove warnings, think of best solution.
		// Create the option objects to add the options
		// Mandatory option Source File Name
		Option sourceFile = OptionBuilder.withArgName("sourcefile")
				.isRequired()
				.hasArg()
				.withDescription("The input Oberon-0 source file")
				.create("sourcefile");
		// Optional Option Parser Implementation Class
		Option implClass = OptionBuilder
				.withArgName("implclass")
				.hasArg()
				.withDescription(
						"The parser implementation class. ANTLR is used by default")
				.create("implclass");
		// Create an options object to add 0 or more options to.
		Options options = new Options();
		options.addOption(implClass);
		options.addOption(sourceFile);
		return options;
	}

}
