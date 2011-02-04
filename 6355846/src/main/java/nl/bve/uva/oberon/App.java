package nl.bve.uva.oberon;

import java.io.FileInputStream;

import nl.bve.uva.oberon.ast.IInterpretableNode;
import nl.bve.uva.oberon.parser.Oberon0Lexer;
import nl.bve.uva.oberon.parser.Oberon0Parser;
import nl.bve.uva.oberon.treeadaptor.OberonNodeAdaptor;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;

public class App {
	public static void main(String[] args) throws Exception {
		// use the 'smoke test' file quicksort.oberon0 as testfile
		FileInputStream fis = new FileInputStream("testprogs/test.calc");

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
			IInterpretableNode startNode = parser.prog();
			
			System.out.println("lexer: " +lexer.getNumberOfSyntaxErrors());
			System.out.println("parser: " +parser.getNumberOfSyntaxErrors());
			
			if ((lexer.getNumberOfSyntaxErrors() == 0) && (parser.getNumberOfSyntaxErrors() == 0)) {
				System.out.println("prog result: " + startNode.interpret());
			} else {
				System.out.println("There are parse-errors!");
			}

			
			
			if ( (4 / 2) + (4 * 5) == 26 || 25 < 24) 
				System.out.println("true");
		
			
		} catch (RecognitionException re) {
			re.printStackTrace();
		}
		
	}
	
	public static void printTreeClasses(CommonTree t) {
		System.out.println(t.getClass());
		
		if (t.getChildren() != null) {
			for (Object o : t.getChildren()) {
				printTreeClasses((CommonTree)o);
			}
		}
	}
}
