package com.kootsjur.oberon.parser;

import java.io.File;
import java.util.Arrays;
import java.util.Random;

public class QuickSortTests {

	private static final String QUICKSORT = "src/quicksort.oberon0";
	private final Random rand;
	private final int runs;
	private final int inputLength;
	private final AbstractOberon oberon0;

	public static void main(String[] args) {
		int runs = 1;
		int length = 100;
		quickSortTest(new Oberon(), runs, length);
		quickSortTest(new Oberon(), runs, length);
	}

	private static void quickSortTest(AbstractOberon oberon0, int runs,
			int inputLength) {
		QuickSortTests qs = new QuickSortTests(new Oberon(), runs, inputLength);
		long duration = timedRun(qs);
		double seconds = duration / 1000.0;
		System.out.println(runs + " of quicksorting " + inputLength
				+ " elements (" + oberon0.getName() + "): " + seconds
				+ " (avg = " + seconds / runs + ")");
	}

	private static long timedRun(QuickSortTests qs) {
		long start = System.currentTimeMillis();
		qs.run();
		return System.currentTimeMillis() - start;
	}

	public QuickSortTests(AbstractOberon oberon0, int runs, int inputLength) {
		this.oberon0 = oberon0;
		this.runs = runs;
		this.inputLength = inputLength;
		this.rand = new Random();
	}

	public void run() {
		File qs = new File(QUICKSORT);
		int array[] = new int[inputLength];

		for (int i = 0; i < runs; i++) {
			populate(array);

			String input = toIOString(array);
			String output = oberon0.runIntoString(qs, input);

			Arrays.sort(array);
			String expected = toIOString(array);
			output = output.replace("\r\n", "\n");
			if (!output.equals(expected)) {
				throw new RuntimeException("test failed: sorting of '" + input
						+ "' not equal to expected '" + expected + " (got '"
						+ output + "')");
			}

		}
	}

	private void populate(int[] array) {

		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt();
		}
	}

	private String toIOString(int array[]) {
		String str = "";
		for (int i = 0; i < array.length; i++) {
			str += array[i] + "\n";
		}
		return str;
	}

}
