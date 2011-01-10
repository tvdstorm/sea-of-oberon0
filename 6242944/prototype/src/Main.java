import interpreter.Context;
import interpreter.Interpreter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import ast.Module;

import xtc.parser.ParseException;
import xtc.parser.Result;


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
		Oberon o = new Oberon(reader, file.getPath());

		Module module = null;
		
		try {
			Result result = o.pModule(0);
			module = (ast.Module)o.value(result);
		} catch (IOException e) {
			System.err.println("IOError: " + e.getMessage());
			System.exit(2);
		} catch (ParseException e) {
			System.err.println(e.getMessage());
			System.exit(3);
		}
		
		Context ctx = new Context();
		Interpreter interpreter = new Interpreter(ctx);
		interpreter.initBuiltins();
		interpreter.interpret(module);
	}
}
