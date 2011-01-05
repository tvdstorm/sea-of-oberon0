package oberon.interpret;

import java.io.FileReader;
import java.io.PushbackReader;

import oberon.lexer.Lexer;
import oberon.node.Start;
import oberon.parser.Parser;

public class Main { 
	   public static void main(String[] args) { 
	      if (args.length > 0) { 
	         try { 
	            /* Form our AST */ 
	            Lexer lexer = new PrintLexer (new PushbackReader( 
	               new FileReader(args[0]), 1024)); 
	            Parser parser = new Parser(lexer); 
	            Start ast = parser.parse() ; 
	  
	            /* Get our Interpreter going. */ 
	            Interpreter interp = new Interpreter () ; 
	            ast.apply(interp) ; 
	         } 
	         catch (Exception e) { 
	            System.out.println (e) ; 
	         } 
	      } else { 
	         System.err.println("usage: java simpleAdder inputFile"); 
	         System.exit(1); 
	      } 
	   } 
	}