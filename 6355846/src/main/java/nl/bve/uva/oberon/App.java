package nl.bve.uva.oberon;

import java.io.FileInputStream;

import nl.bve.uva.oberon.parser.Oberon0Lexer;
import nl.bve.uva.oberon.parser.Oberon0Parser;
import nl.bve.uva.oberon.treeadaptor.OberonNodeAdaptor;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.CommonTokenStream;
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
		parser.setTreeAdaptor(new OberonNodeAdaptor()); 
		
		Oberon0Parser.prog_return r1 = parser.prog();
		CommonToken ct = (CommonToken)r1.getStart();
		
		// Begin parsing at rule prog
//		CalcParser.expr_return r = parser.expr();
		// WALK RESULTING TREE
		CommonTree t = (CommonTree)r1.getTree(); // get tree from parser
		printTreeClasses((CommonTree)t);
	
//		System.out.println(t+ " ## " +t.getClass());
//		System.out.println("$$$$: " +t.toString());
		// Create a tree node stream from resulting tree
		CommonTreeNodeStream nodes = new CommonTreeNodeStream(t);
		
		System.out.println(t.toStringTree());
		System.out.println(nodes.toTokenTypeString());
		
//		Eval walker = new Eval(nodes); // create a tree parser
//		walker.prog(); // launch at start rule prog
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
