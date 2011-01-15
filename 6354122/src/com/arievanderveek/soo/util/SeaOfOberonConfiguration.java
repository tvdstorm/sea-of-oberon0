/**
 * 
 */
package com.arievanderveek.soo.util;

/**
 * Contains the configuration given by the command line arguments and default
 * values.
 * 
 * @author arieveek
 *
 */
public class SeaOfOberonConfiguration {
	
	private String oberonParserClass = "com.arievanderveek.soo.parser.antlrimpl.AntlParserImpl";
	private String sourceCodeFileName = null; 

	/**
	 * Setter for Oberon Parser Implementation
	 * 
	 * @param oberonParser the oberonParser to set
	 */
	public void setOberonParser(String oberonParserClass) {
		this.oberonParserClass = oberonParserClass;
	}

	/**
	 * Getter for Oberon Parser Implementation class
	 * 
	 * @return the oberonParser
	 */
	public String getOberonParserClass() {
		return oberonParserClass;
	}

	/**
	 * Setter for source code file name that is input for the Oberon-0 parser
	 * and interpreter
	 * 
	 * @param sourceCodeFile the sourceCodeFile to set
	 */
	public void setSourceCodeFileName(String sourceCodeFileName) {
		this.sourceCodeFileName = sourceCodeFileName;
	}

	/**
	 * Getter for source code file name that serves input for the Oberon-0
	 * 
	 * @return the sourceCodeFile
	 */
	public String getSourceCodeFileName() {
		return sourceCodeFileName;
	}
	

}
