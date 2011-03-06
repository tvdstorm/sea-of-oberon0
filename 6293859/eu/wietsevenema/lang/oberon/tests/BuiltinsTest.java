package eu.wietsevenema.lang.oberon.tests;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.junit.Test;

import eu.wietsevenema.lang.oberon.ast.declarations.Module;
import eu.wietsevenema.lang.oberon.exceptions.InvalidInputException;
import eu.wietsevenema.lang.oberon.exceptions.ParseException;
import eu.wietsevenema.lang.oberon.exceptions.SymbolAlreadyDeclaredException;
import eu.wietsevenema.lang.oberon.interpreter.Environment;

public class BuiltinsTest {

	@Test
	public void testReadWrite() throws IOException, InvalidInputException, ParseException, SymbolAlreadyDeclaredException {
		String newLine = System.getProperty("line.separator");
		String expected = "";
		for (int i = 1; i <= 10; i++) {
			expected += i + newLine;
		}
		ByteArrayInputStream bis = new ByteArrayInputStream(expected.getBytes());
		ByteArrayOutputStream bos = new ByteArrayOutputStream();

		Module result = (Module) Util.parseModuleFile(Util.getAbsFilename("oberon/readwrite.o0"));
		Environment env = new Environment(bis, bos);
		env.runModule(result);

		String actual = bos.toString();

		assertEquals(expected, actual);

	}

	@Test
	public void testQuicksort() throws IOException, InvalidInputException, ParseException, SymbolAlreadyDeclaredException {
		String newLine = System.getProperty("line.separator");
		String input = "";
		for (int i = 5; i > 0; i--) {
			input += i + newLine;
		}
		ByteArrayInputStream bis = new ByteArrayInputStream(input.getBytes());
		ByteArrayOutputStream bos = new ByteArrayOutputStream();

		Module result = (Module) Util.parseModuleFile(Util.getAbsFilename("oberon/quicksort.o0"));
		Environment env = new Environment(bis, bos);
		env.runModule(result);

		String actual = bos.toString();

		String expected = new String();
		for (int i = 1; i <= 5; i++) {
			expected += i + newLine;
		}

		assertEquals(expected, actual);
	}

}
