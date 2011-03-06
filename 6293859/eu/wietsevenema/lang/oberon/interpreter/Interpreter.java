package eu.wietsevenema.lang.oberon.interpreter;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileReader;
import java.io.Reader;

import xtc.parser.ParseError;
import xtc.parser.Result;
import xtc.parser.SemanticValue;
import xtc.tree.Node;
import eu.wietsevenema.lang.oberon.ast.declarations.Module;
import eu.wietsevenema.lang.oberon.exceptions.InvalidInputException;
import eu.wietsevenema.lang.oberon.parser.Oberon;

public class Interpreter {

	public static void main(String[] args) {
		if ((null == args) || (0 == args.length)) {
			System.err.println("Usage: <file-name> <input>+");

		} else {
			String filename = args[0];
			String newLine = System.getProperty("line.separator");
			String input = "";
			for (int i = 1; i < args.length; i++) {
				input += args[i] + newLine;
			}
			ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
			Reader in = null;
			try {
				in = new BufferedReader(new FileReader(filename));
				Oberon p = new Oberon(in, filename, (int) new File(filename).length());
				Result r = p.pProgram(0);

				if (r.hasValue()) {
					SemanticValue v = (SemanticValue) r;

					if (v.value instanceof Node) {
						Module result = (Module) v.value;
						Environment env = new Environment(inputStream, System.out);
						env.runModule(result);
					} else {
						throw new InvalidInputException();
					}

				} else {
					ParseError err = (ParseError) r;
					if (-1 == err.index) {
						System.err.println("  Parse error");
					} else {
						System.err.println("  " + p.location(err.index) + ": " + err.msg);
					}
				}

			} catch (Throwable x) {
				while (null != x.getCause()) {
					x = x.getCause();
				}
				x.printStackTrace();
			} finally {
				try {
					in.close();
				} catch (Throwable x) {
					/* Ignore. */
				}
			}

		}
	}

}
