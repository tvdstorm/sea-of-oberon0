package jdm.oberon0.interpreter;

import java.io.IOException;
import java.io.Reader;

import jdm.oberon0.ast.Module;
import jdm.oberon0.builtins.Builtins;
import jdm.oberon0.interpreter.eval.Evaluator;
import jdm.oberon0.parser.OberonParser;
import xtc.parser.ParseException;
import xtc.parser.Result;

public class Interpreter {
	public static void run(Reader reader, String name) {
		OberonParser parser = new OberonParser(reader, name);

		Module module = null;
		
		try {
			Result result = parser.pModule(0);
			module = (jdm.oberon0.ast.Module)parser.value(result);
		} catch (IOException e) {
			System.err.println("IOError: " + e.getMessage());
			System.exit(1);
		} catch (ParseException e) {
			System.err.println(e.getMessage());
			System.exit(1);
		}
		
		Context context = new Context();
		Builtins.initBuiltins(context);

		Evaluator evaluator = new Evaluator(context);
		evaluator.evaluate(module);
	}
}
