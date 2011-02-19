package mains;

import java.io.IOException;

import oberon0.Interpreter;
import oberon0.environment.ArrayValue;
import oberon0.environment.Context;
import oberon0.environment.IntegerValue;
import oberon0.environment.Reference;

import org.antlr.runtime.ANTLRFileStream;

public class QuicksortQuickcheck {
	public static void main(String[] args) throws IOException {
		// quicksorttest.oberon0 is quicksort with Read replaced by ReadRandom
		String filename = "oberonfiles/quicksorttest.oberon0";
		quickcheckQuicksort(1000, filename);
	}

	/*
	 * Test the quicksort for a given number of times Tip: use ReadRandom
	 * instead of Read in the oberon script to generate numbers
	 */
	public static void quickcheckQuicksort(int repeats, String filename)
			throws IOException {
		for (int repeated = 1; repeated <= repeats; repeated++) {
			System.out.print("Test " + filename + " #" + repeated + ":\n");
			ANTLRFileStream inputfile = new ANTLRFileStream(filename);
			// run script
			Context context = Interpreter.getOutputContextFromFile(inputfile);
			// get me the input array
			Reference arrayRef = context.getReference("input");
			ArrayValue array = (ArrayValue) arrayRef.getValue();

			int size = array.getSize();

			// this part will check the quicksort output
			// get first value
			int previousVal = ((IntegerValue) array.getValue(0)).getValue();
			for (int i = 0; i < size; i++) {
				int val = ((IntegerValue) array.getValue(i)).getValue();
				// value array[i] must be higher than value array[i-1]
				assert (val >= previousVal) : "Test #" + repeated
						+ " failed: Quicksort is not working, output was: "
						+ array.toString();
				// save array[i] as array[i-1]
				previousVal = val;
			}
		}
		System.out.print("Test " + filename + " passed " + repeats + " times");
	}
}
