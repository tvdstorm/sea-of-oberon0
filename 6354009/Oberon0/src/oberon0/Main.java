package oberon0;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;

import oberon0.Oberon0Parser.program_return;
import oberon0.program.Program;


public class Main{
	
    public static void main(String args[]) throws Exception {
    	String testFile = "./sources/quicksort.oberon0";
    	
        Oberon0Lexer lex = new Oberon0Lexer(new ANTLRFileStream(testFile));
        CommonTokenStream tokens = new CommonTokenStream(lex);
  
        Oberon0Parser parser = new Oberon0Parser(tokens);
    	program_return r = parser.program();
		
    	Program program = r.program;
		program.run(args,System.out);
    }
}

