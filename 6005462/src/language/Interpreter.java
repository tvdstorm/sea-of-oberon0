package language;

import java.io.IOException;

import language.parser.*;
import language.parser.oberonParser.root_return;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.Lexer;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeAdaptor;
import org.antlr.runtime.tree.TreeAdaptor;

public class Interpreter {

	public static void main(String[] args) {
		CharStream cs;
		root_return parsedTree;
		try {
			cs = new ANTLRFileStream("C:\\SE\\oberon\\quicksort.oberon0");
		} catch (IOException e) {
			System.out.println("Unable to open file");
			return;
		}
		
		oberonLexer lexer = new oberonLexer(cs);
		CommonTokenStream tokens = new CommonTokenStream(lexer); 
		oberonParser parser = new oberonParser(tokens);
		CommonTreeAdaptor adaptor = new CommonTreeAdaptor();
		parser.setTreeAdaptor(adaptor);
		
		//parser.setTreeAdaptor(adaptor);
		
		try {
			parsedTree = parser.root();
		} catch (RecognitionException e) {
			e.printStackTrace();
			return;
		}
		
		CommonTree tree = (CommonTree) parsedTree.getTree();
		
	}

}
