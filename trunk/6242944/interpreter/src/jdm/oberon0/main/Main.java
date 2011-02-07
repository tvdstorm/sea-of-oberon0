package jdm.oberon0.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import xtc.parser.ParseException;

import jdm.oberon0.interpreter.Interpreter;
/**
 * Entry point for the Oberon interpreter.
 */
public class Main {
	
	public static void main(String[] args) {
		if (args.length != 1) {
			System.err.println("Expected filename");
			System.exit(1);
		}
		File file = new File(args[0]);
		
		FileReader reader = null;
		try {
			reader = new FileReader(file);
		} catch (FileNotFoundException e1) {
			System.err.println("Error: file not found: " + file.getAbsolutePath());
			System.exit(1);
		}
		try {
			Interpreter.run(reader, file.getPath());
		} catch (IOException e) {
			System.err.println(e.toString());
		} catch (ParseException e) {
			System.err.println(e.toString());
		} catch (jdm.oberon0.exceptions.RuntimeException e) {
			System.err.println(e.toString());
		}
	}
}
