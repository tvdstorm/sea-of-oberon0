package com.kootsjur.oberon.parser;

import java.io.File;
import java.util.Random;

public class WithTest {

	private static final String WITHTEST = "src/withtest.oberon0";
	private final Random rand;
	private final int runs;
	private final int inputLength;
	private final AbstractOberon oberon0;

	public static void main(String[] args) {
		int runs = 1;
		int length = 5;
		withTest(new Oberon(), runs, length);
		withTest(new Oberon(), runs, length);
	}

	private static void withTest(AbstractOberon oberon0, int runs,
			int inputLength) {
		WithTest qs = new WithTest(new Oberon(), runs, inputLength);
		long duration = timedRun(qs);
		double seconds = duration / 1000.0;
		System.out.println(" :" + runs + " of testing WithStatement with "
				+ inputLength + " elements (" + oberon0.getName() + "): "
				+ seconds + " (avg = " + seconds / runs + ")");
	}

	private static long timedRun(WithTest qs) {
		long start = System.currentTimeMillis();
		qs.run();
		return System.currentTimeMillis() - start;
	}

	public WithTest(AbstractOberon oberon0, int runs, int inputLength) {
		this.oberon0 = oberon0;
		this.runs = runs;
		this.inputLength = inputLength;
		this.rand = new Random();
	}

	public void run() {
		File qs = new File(WITHTEST);
		int array[] = new int[inputLength];

		for (int i = 0; i < runs; i++) {
			populate(array);

			String input = toIOString(array);
			String output = oberon0.runIntoString(qs, input);

			int result = 0;
			for (int x = 0; x < array.length - 1; x++) {
				result = result + array[x];
			}

			result = result * array[array.length - 1];

			String expected = Integer.toString(result);
			output = output.replace("\r\n", "");
			if (!output.equals(expected)) {
				throw new RuntimeException("test failed: sorting of '" + input
						+ "' not equal to expected '" + expected + " (got '"
						+ output + "')");
			}

		}
	}

	private void populate(int[] array) {
		array[0] = 1;
		array[1] = 2;
		array[2] = 3;
		array[3] = 4;
		array[4] = 6;

		// for (int i = 0; i < array.length; i++) {
		// array[i] = rand.nextInt();
		// }
	}

	private String toIOString(int array[]) {
		String str = "";
		for (int i = 0; i < array.length; i++) {
			str += array[i] + "\n";
		}
		return str;
	}

}
