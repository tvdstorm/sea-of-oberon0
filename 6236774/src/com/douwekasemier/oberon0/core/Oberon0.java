package com.douwekasemier.oberon0.core;

import java.io.File;
import java.io.IOException;

import com.douwekasemier.oberon0.interpreter.Interpreter;


public class Oberon0 {

	/**
	 * @param args
	 * @throws RecognitionException
	 * @throws IOException
	 */
	public static void main(String[] args) {
		// Laad een bestand oberon0 bestand
		Interpreter interpreter = new Interpreter();
		File file = new File(args[0]);
        String input = "1\n3\n8\n14\n25";
        interpreter.interpret(file, input);
	}
}
