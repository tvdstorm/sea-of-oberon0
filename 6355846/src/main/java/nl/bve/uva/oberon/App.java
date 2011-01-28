package nl.bve.uva.oberon;

import java.io.FileInputStream;

import nl.bve.uva.oberon.ast.OberonRootNode;
import nl.bve.uva.oberon.parser.OberonLexer;
import nl.bve.uva.oberon.parser.OberonParser;

import nl.bve.uva.oberon.treeadaptor.*;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;

public class App {
	public static void main(String[] args) throws Exception {
		// use the 'smoke test' file quicksort.oberon0 as testfile
		FileInputStream fis = new FileInputStream("testprogs/quicksort.oberon0");

		// read from quicksort.oberon0 file
		ANTLRInputStream input = new ANTLRInputStream(fis);
		// Create an ExprLexer that feeds from that stream
		OberonLexer lexer = new OberonLexer(input);
		// Create a stream of tokens fed by the lexer
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		// Create a parser that feeds off the token stream
		OberonParser parser = new OberonParser(tokens);
		parser.setTreeAdaptor(new OberonNodeAdaptor()); 
		
		// Begin parsing at rule prog
		OberonParser.module_return r = parser.module();
		// WALK RESULTING TREE
		OberonRootNode t = (OberonRootNode)r.getTree(); // get tree from parse
		// Create a tree node stream from resulting tree
		CommonTreeNodeStream nodes = new CommonTreeNodeStream(t);
		
		System.out.println(t.toStringTree());
		System.out.println(nodes.toTokenTypeString());
		
//		Eval walker = new Eval(nodes); // create a tree parser
//		walker.prog(); // launch at start rule prog
	}
}
