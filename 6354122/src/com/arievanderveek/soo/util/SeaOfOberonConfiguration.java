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
	
	
	
	private String parserImplClass, visitorImplClass, sourceCodeFileName; 

	/**
	 * Setter for Oberon Parser Implementation class. Default value is: 
	 * "com.arievanderveek.soo.parser.antlrimpl.AntlParserImpl"
	 * @param parserImplClass The Oberon-0 parser implementation fully qualified classname
	 */
	public void setParserImplClass(String parserImplClass) {
		this.parserImplClass = parserImplClass;
	}

	/**
	 * Getter for Oberon Parser Implementation class
	 * 
	 * @return the oberonParser
	 */
	public String getParserImplClass() {
		return parserImplClass;
	}

	/**
	 * Setter for source code file name that is input for the Oberon-0 parser
	 * and interpreter
	 * @param sourceCodeFileName the sourceCodeFile to set 
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

	/**
	 * Getter for the visitorImplClass
	 * 
	 * @return the visitorImplClass
	 */
	public String getVisitorImplClass() {
		return visitorImplClass;
	}

	/**
	 * Setter for the visitorImplClass. By default it is: 
	 * "com.arievanderveek.soo.visitors.PrettyPrintVisitor"
	 * 
	 * @param visitorImplClass the visitorImplClass to set
	 */
	public void setVisitorImplClass(String visitorImplClass) {
		this.visitorImplClass = visitorImplClass;
	}
}
