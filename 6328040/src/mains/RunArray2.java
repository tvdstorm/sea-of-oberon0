package mains;

import java.io.IOException;

import oberon0.Interpreter;

import org.antlr.runtime.ANTLRFileStream;

public class RunArray2 {

	public static void main(String[] args) throws IOException {
		ANTLRFileStream inputfile = new ANTLRFileStream(
				"oberonfiles/array2.oberon0");
		Interpreter.interpretFile(inputfile);
	}
}
