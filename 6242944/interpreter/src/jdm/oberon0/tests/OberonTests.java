package jdm.oberon0.tests;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import jdm.oberon0.interpreter.Interpreter;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Oberon test runner. This class searches for Oberon scripts in the
 * tests directory and creates test cases for them.
 */
public class OberonTests extends TestCase {
	private File _file;
	
	public OberonTests(String name, File file) {
		super(file.getName());
		this._file = file;
	}

	public static TestSuite suite() {
		TestSuite suite = new TestSuite("OberonTests");
		
		File srcDir = new File("tests");
		assertTrue(srcDir.exists());
		
		File[] files = srcDir.listFiles();
		
        for (int i=0; i<files.length; i++){
            final File file = files[i];
            
            if (file.getName().endsWith(".oberon0")) {
            	Test test = new OberonTests("testFile", file);
            	suite.addTest(test);
            }	
        }
		return suite;
	}
	
	@Override
	public void runBare() {
		FileReader reader;
		try {
			reader = new FileReader(_file);
		} catch (FileNotFoundException e) {
			fail("Unable to open file");
			return;
		}
		try {
			Interpreter.run(reader, _file.getName());
		} catch(jdm.oberon0.exceptions.RuntimeException e) {
			fail(e.getMessage());
		}
	}
}
