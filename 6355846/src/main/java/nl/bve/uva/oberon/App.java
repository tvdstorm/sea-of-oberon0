package nl.bve.uva.oberon;

import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.util.Scanner;

import nl.bve.uva.oberon.ast.IExecutableNode;
import nl.bve.uva.oberon.env.Environment;
import nl.bve.uva.oberon.parser.Oberon0Lexer;
import nl.bve.uva.oberon.parser.Oberon0Parser;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

public class App {
	private static final String LOCATION_TESTAPPS = "testprogs";

	public static File chooseFile() {
		File testFilesDir = new File(LOCATION_TESTAPPS);
		File[] oberonApps = testFilesDir.listFiles(new FileFilter() {
			@Override
			public boolean accept(File pathname) {
				return pathname.getAbsolutePath().endsWith(".oberon0");
			}
		});
		
		for(int i=0; i < oberonApps.length; i++) {
			System.out.println("[" +i+ "]: " +oberonApps[i].getAbsolutePath());
		}
		System.out.print("Uw keuze: ");
		System.out.flush();
		
		Scanner s = new Scanner(System.in);

		File appToExecute = oberonApps[s.nextInt()];
		
		return appToExecute;
	}
	
	public static void main(String[] args) throws Exception {
		File appToExecute;
		
		if (args.length > 0) {
			appToExecute = new File(args[0]);
		} else {
			appToExecute = chooseFile();
		}
		
		// use the 'smoke test' file quicksort.oberon0 as testfile
		FileInputStream fis = new FileInputStream(appToExecute);

		// read from quicksort.oberon0 file
		ANTLRInputStream input = new ANTLRInputStream(fis);
		// Create an ExprLexer that feeds from that stream
		Oberon0Lexer lexer = new Oberon0Lexer(input);
		// Create a stream of tokens fed by the lexer
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		// Create a parser that feeds off the token stream
		Oberon0Parser parser = new Oberon0Parser(tokens);
		
		try {
			// Begin parsing at rule prog
			IExecutableNode startNode = parser.module();
			
			if ((lexer.getNumberOfSyntaxErrors() == 0) && (parser.getNumberOfSyntaxErrors() == 0)) {
				startNode.execute(new Environment());
			} else {
				System.out.println("lexer errors:  " +lexer.getNumberOfSyntaxErrors());
				System.out.println("parser errors: " +parser.getNumberOfSyntaxErrors());
				System.out.println("There are parse- and/or lexer-errors!");
			}
		} catch (RecognitionException re) {
			re.printStackTrace();
		}
	}
}
