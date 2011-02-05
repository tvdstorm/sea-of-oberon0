package mains;

import java.io.IOException;

import oberon0.Interpreter;

import org.antlr.runtime.ANTLRFileStream;

public class RunQuicksort {
	
	public static void main(String [ ] args) throws IOException
	{
		ANTLRFileStream inputfile = new ANTLRFileStream("oberonfiles/quicksort.oberon0");
	    Interpreter.getOutputContextFromFile(inputfile);
	}
}
