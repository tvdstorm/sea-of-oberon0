package jdm.oberon0.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import jdm.oberon0.ast.Module;
import jdm.oberon0.builtins.Builtins;
import jdm.oberon0.interpreter.Context;
import jdm.oberon0.interpreter.Interpreter;
import jdm.oberon0.parser.OberonParser;

import xtc.parser.ParseException;
import xtc.parser.Result;

/**
 * Entry point for the Oberon interpreter.
 */
public class Main {
	
	public static void main(String[] args) {
		File file = new File(args[0]); //XXX
		
		FileReader reader = null;
		try {
			reader = new FileReader(file);
		} catch (FileNotFoundException e1) {
			System.err.println("Error: file not found: " + file.getAbsolutePath());
			System.exit(1);
		}
		run(reader, file.getPath());
	}
	
	public static void run(Reader reader, String name) {
		OberonParser parser = new OberonParser(reader, name);

		Module module = null;
		
		try {
			Result result = parser.pModule(0);
			module = (jdm.oberon0.ast.Module)parser.value(result);
		} catch (IOException e) {
			System.err.println("IOError: " + e.getMessage());
			System.exit(2);
		} catch (ParseException e) {
			System.err.println(e.getMessage());
			System.exit(3);
		}
		
		Context context = new Context();
		Builtins.initBuiltins(context);

		Interpreter interpreter = new Interpreter(context);
		interpreter.interpret(module);
	}
}
