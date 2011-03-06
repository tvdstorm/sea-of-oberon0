package eu.wietsevenema.lang.oberon.tests;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

import xtc.parser.ParseError;
import xtc.parser.Result;
import xtc.parser.SemanticValue;
import xtc.tree.Node;
import eu.wietsevenema.lang.oberon.exceptions.InvalidInputException;
import eu.wietsevenema.lang.oberon.exceptions.ParseException;
import eu.wietsevenema.lang.oberon.parser.Oberon;

public class Util {

	public static String getAbsFilename(String relName) {
		return Util.class.getResource(relName).getPath();
	}

	public static Node parseExpressionFile(String absPath) throws IOException, InvalidInputException, ParseException {
		return parseFile(absPath, true);
	}

	public static Node parseModuleFile(String absPath) throws IOException, InvalidInputException, ParseException {
		return parseFile(absPath, false);
	}

	public static Node parseModuleString(String text) throws InvalidInputException, ParseException, IOException {
		return parseString(text, false);
	}

	public static Node parseExpressionString(String text) throws InvalidInputException, ParseException, IOException {
		return parseString(text, true);
	}

	private static Node parseString(String text, boolean parseExpression) throws InvalidInputException, ParseException,
			IOException {
		Reader in = null;
		String absPath = "";
		in = new BufferedReader(new StringReader(text));
		return parse(parseExpression, in, absPath);
	}

	private static Node parseFile(String absPath, boolean parseExpression) throws IOException, InvalidInputException,
			ParseException {
		Reader in = null;
		in = new BufferedReader(new FileReader(new File(absPath)));

		return parse(parseExpression, in, absPath);
	}

	private static Node parse(boolean parseExpression, Reader in, String absPath) throws IOException,
			InvalidInputException, ParseException {
		Oberon p = new Oberon(in, absPath);
		Result r;

		if (parseExpression) {
			r = p.pTestExpression(0);
		} else {
			r = p.pProgram(0);
		}

		Node result;
		if (r.hasValue()) {
			SemanticValue v = (SemanticValue) r;
			if (v.value instanceof Node) {
				result = (Node) v.value;
			} else {
				throw new InvalidInputException();
			}

		} else {
			ParseError err = (ParseError) r;
			if (-1 == err.index) {
				throw new ParseException("  Parse error");
			} else {
				throw new ParseException("  " + p.location(err.index) + ": " + err.msg);
			}
		}
		in.close();
		return result;
	}

}
