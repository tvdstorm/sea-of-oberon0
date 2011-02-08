package mains.testscripts;

import java.io.IOException;

import oberon0.Interpreter;
import oberon0.environment.Context;
import oberon0.environment.IntegerValue;

import org.antlr.runtime.ANTLRFileStream;

public class TestWhileScript {
	public static void main(String[] args) throws IOException {
		// run script
		ANTLRFileStream inputfile = new ANTLRFileStream(
				"oberonfiles/while.oberon0");
		Context context = Interpreter.getOutputContextFromFile(inputfile);

		// test outcome
		int expectedI = 6;
		int valueOfI = ((IntegerValue) context.getReference("i").getValue())
				.getValue();
		assert (valueOfI == expectedI) : "While testscript failed, expected "
				+ expectedI + " , but got: " + valueOfI;

		// test passed
		System.out.print("While test passed");
	}
}
