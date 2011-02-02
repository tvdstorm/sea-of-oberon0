package oberon;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PushbackReader;
import java.util.LinkedList;
import java.util.Queue;

import oberon.data.IdentifierSelector;
import oberon.data.Selector;
import oberon.interpret.ModuleInterpreter;
import oberon.lexer.Lexer;
import oberon.lexer.LexerException;
import oberon.node.Start;
import oberon.parser.Parser;
import oberon.parser.ParserException;

public class Main { 
	   public static void main(String[] args) { 
	      if (args.length > 0) { 
//	         try { 
	            /* Form our AST */ 
	            Lexer lexer = null;
				try {
					lexer = new PrintLexer (new PushbackReader( 
					   new FileReader(args[0]), 1024));
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
	            Parser parser = new Parser(lexer); 
	            Start ast = null;
				try {
					ast = parser.parse();
				} catch (ParserException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (LexerException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
	            
	            /* Get our Interpreter going. */ 
	            ModuleInterpreter interpreter = new ModuleInterpreter();
	            ast.apply(interpreter);	     
	            
	            ReadProcedure.Initialize();
	            WriteCall.Initialize();
	            WriteLnCall.Initialize();
	            
	            Procedure mainProc = interpreter.BuildInterpreterResult();
	            Queue<Expression> paramList = new LinkedList<Expression>();
	            	            
	            try {
					mainProc.Call(paramList);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
//	         } 
//	         catch (Exception e) { 
//	            System.out.println (e) ; 
//	         } 
	      } else { 
	         System.err.println("usage: java simpleAdder inputFile"); 
	         System.exit(1); 
	      } 
	   }
	}