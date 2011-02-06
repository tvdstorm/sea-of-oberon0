package oberon0;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.CommonTreeNodeStream;

import oberon0.Oberon0Parser.program_return;
import oberon0.interpreter.program.Program;


public class Main{
	
    public static void main(String args[]) throws Exception {
    	String testFile = "./src/oberon0/source/quicksort.oberon0";

        Oberon0Lexer lex = new Oberon0Lexer(new ANTLRFileStream(testFile));
        CommonTokenStream tokens = new CommonTokenStream(lex);
  
        Oberon0Parser parser = new Oberon0Parser(tokens);
    	program_return r = parser.program();
    	
		//Create a tree walker from the tree (as node stream).
		CommonTreeNodeStream nodeStream = new CommonTreeNodeStream(r.getTree());
		Oberon0Interpreter walker = new Oberon0Interpreter(nodeStream);
		
		//Finally evaluate the expression.s
		Program program= walker.program();
		program.addArguments(args);
		program.start();
    }
}

