package tests;

import java.io.IOException;

import oberon0.Main;

import org.antlr.runtime.ANTLRFileStream;

public class Quicksortrun {
	public static void main(String [ ] args) throws IOException
	{
		ANTLRFileStream inputfile = new ANTLRFileStream("oberonfiles/quicksorttest.oberon0");
	    Main.runOberonFile(inputfile);
	}
}
