/**
 * 
 */
package com.arievanderveek.soo.util;

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

	private final static String OPTION_SOURCE_FILE = "sourcefile";
	private final static String OPTION_PARSER = "parser";
	private final static String OPTION_PRINTTREE = "printtree";
	private final static String DEFAULT_PARSER_IMPL = "com.arievanderveek.soo.parser.AntlrParserImpl";

	/**
	 * Creates a SeaOfOberonConfiguration containing the configuration to be
	 * used by the parser and interpreter.
	 * 
	 * Note: An exception will be thrown if the parsed arguments do not contain
	 * correct information. In case the arguments are not correct, a help is
	 * printed and the program exits.
	 * 
	 * @param args
	 *            Command line arguments
	 * @return A SeaOfOberonConfiguration containing the configuration
	 * @throws SeaOfOberonException
	 *             thrown when the parsed content is not correct.
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
	 * @param args
	 *            Command line arguments
	 * @return A SeaOfOberonConfiguration containing the configuration
	 * @throws SeaOfOberonException
	 *             thrown when the parsed content is not correct.
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
			String parserImplClass = cmd.getOptionValue(OPTION_PARSER);
			if (parserImplClass == null) {
				configuration.setParserImplClass(DEFAULT_PARSER_IMPL);
			} else {
				configuration.setParserImplClass(parserImplClass);
			}
			if (cmd.hasOption(OPTION_PRINTTREE)) {
				configuration.setPrintTree(true);
			} else {
				configuration.setPrintTree(false);
			}
			String sourceFileName = cmd.getOptionValue(OPTION_SOURCE_FILE);
			if (sourceFileName == null) {
				throw new SeaOfOberonException("The source input file was not provided.");
			} else {
				configuration.setSourceCodeFileName(sourceFileName);
			}
			// Done filling the configuration object.
		} catch (ParseException exp) {
			// parsing of arguments went wrong. Print message and help
			printHelp(options, exp.getMessage());
			throw new SeaOfOberonException("Command line arguments where not correct", exp);
		}
		return configuration;

	}

	/**
	 * Method that formats the options and a message and prints them to the
	 * standard out. Finally it exits with a 1, as the printing of a help
	 * message indicates the command line arguments where not correct.
	 * 
	 * @param options
	 *            The expected command line options
	 * @param message
	 *            An informative message
	 */
	private static void printHelp(Options options, String message) {
		// automatically generate the help statement
		HelpFormatter formatter = new HelpFormatter();
		formatter.printHelp(message, options);
		System.out.println("---------------------------------------------------------------");
		System.out.println();
	}

	// TODO: Arie: Remove warnings, think of best solution.For now suppres them
	@SuppressWarnings("static-access")
	private static Options creatOptions() {
		// Create the option objects that represent the arguments
		Option sourceFile = OptionBuilder.withArgName(OPTION_SOURCE_FILE).isRequired().hasArg()
				.withDescription("The input Oberon-0 source file").create(OPTION_SOURCE_FILE);
		Option parserImpl = OptionBuilder
				.withArgName(OPTION_PARSER)
				.hasArg()
				.withDescription(
						"(Optional) The parser implementation fully qualified class name."
								+ "ANTLR is used by default.").create(OPTION_PARSER);
		Option printTree = OptionBuilder
				.withArgName(OPTION_PRINTTREE)
				.withDescription(
						"(Optional) If given as option the tree will be printed before interpreting.")
				.create(OPTION_PRINTTREE);
		// Create an options object to add 0 or more options to.
		Options options = new Options();
		options.addOption(parserImpl);
		options.addOption(printTree);
		options.addOption(sourceFile);
		return options;
	}

}
