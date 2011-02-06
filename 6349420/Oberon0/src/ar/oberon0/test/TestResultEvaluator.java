package ar.oberon0.test;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

class TestResultEvaluator {
	private ExpectedResult expectedResult;

	protected TestResultEvaluator(ExpectedResult expectedResult) {
		this.expectedResult = expectedResult;
	}

	protected boolean evaluate(ByteArrayOutputStream outputStream) {
		BufferedReader actualResultReader = getReaderForOutputStream(outputStream);
		for (String expectedString : expectedResult) {
			String actualString;
			try {
				actualString = actualResultReader.readLine();
			} catch (Exception e) {
				return false;
			}
			if (actualString == null) {
				return false;
			}
			if (!actualString.equals(expectedString)) {
				return false;
			}
		}

		try {
			if (actualResultReader.readLine() != null) {
				return false;
			}
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	private BufferedReader getReaderForOutputStream(ByteArrayOutputStream outputStream) {
		InputStream input = new ByteArrayInputStream(outputStream.toByteArray());
		return new BufferedReader(new InputStreamReader(input));
	}
}
