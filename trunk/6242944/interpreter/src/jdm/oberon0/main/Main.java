package jdm.oberon0.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import jdm.oberon0.interpreter.Interpreter;
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
		Interpreter.run(reader, file.getPath());
	}
}
