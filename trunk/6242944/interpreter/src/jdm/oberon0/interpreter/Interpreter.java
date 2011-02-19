package jdm.oberon0.interpreter;

import java.io.IOException;
import java.io.Reader;

import jdm.oberon0.ast.Module;
import jdm.oberon0.builtins.Builtins;
import jdm.oberon0.interpreter.eval.Evaluator;
import jdm.oberon0.parser.OberonParser;
import jdm.oberon0.typechecker.TypeCheckerContext;
import jdm.oberon0.typechecker.typecheck.ModuleChecker;
import xtc.parser.ParseException;
import xtc.parser.Result;

public class Interpreter {
	public static void run(Reader reader, String name) throws IOException, ParseException {
		// parse module
		OberonParser parser = new OberonParser(reader, name);
		Module module = null;
		Result result = parser.pModule(0);
		module = (Module)parser.value(result);
		
		// run type checker and interpreter
		runTypeChecker(module);
		runInterpreter(module);
	}

	// Check types of an Oberon module.
	protected static void runTypeChecker(Module module) {
		TypeCheckerContext context = new TypeCheckerContext();
		Builtins.initBuiltins(context);
		
		ModuleChecker checker = new ModuleChecker(context);
		checker.evaluate(module);
	}

	// Interpret an Oberon module.
	protected static void runInterpreter(Module module) {
		InterpreterContext context = new InterpreterContext();
		Builtins.initBuiltins(context);

		Evaluator evaluator = new Evaluator(context);
		evaluator.evaluate(module);		
	}

}
