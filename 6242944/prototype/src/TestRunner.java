import interpreter.Context;
import interpreter.Interpreter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

import ast.Module;

import xtc.parser.ParseException;
import xtc.parser.Result;


public class TestRunner {

	public void runTests(String path) {
		File dir = new File(path);
		File[] files = dir.listFiles();
		
		if (files == null) {
			//XXX
			assert false;
			return;
		}
		for(File file : files) {
			runTest(file);
		}
	}
	private void runTest(File file) {
		
		String[] command = new String[] { 
				"java", 
				"-classpath", ".:bin:libs/xtc.jar", 
				"Main",
				file.getAbsolutePath() };
		Process p;
		try {
			p = Runtime.getRuntime().exec(command);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return;
		}
		int retcode = 0;
		try {
			retcode = p.waitFor();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
		
		String line;
		boolean ok = true;
		
		if (retcode != 0) {
			ok = false;
		}
		
		try {
			while((line = reader.readLine()) != null) {
				if(line.toLowerCase().indexOf("error") >= 0) {
					ok = false;
					break;
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(file.getPath() + ": " + (ok ? "OK" : "FAIL"));
	}

	public static void main(String[] args) {
		TestRunner runner = new TestRunner();
		runner.runTests("tests/");
	}
}
