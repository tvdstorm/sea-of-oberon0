package oberon;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PushbackReader;
import java.util.LinkedList;
import java.util.Queue;

import oberon.interpret.ModuleInterpreter;
import oberon.lexer.Lexer;
import oberon.lexer.LexerException;
import oberon.node.Start;
import oberon.parser.Parser;
import oberon.parser.ParserException;

public class Main { 
   public static void main(final String[] args) { 
      if (args.length > 0) { 
		/* Form our AST */ 
		Lexer lexer = null;
		try {
			lexer = new Lexer (new PushbackReader( 
			   new FileReader(args[0]), 1024));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		final Parser parser = new Parser(lexer); 
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
		final ModuleInterpreter interpreter = new ModuleInterpreter();
		ast.apply(interpreter);	     
		
		ReadProcedure.initialize();
		WriteCall.initialize();
		WriteLnCall.initialize();
		
		final IProcedure mainProc = interpreter.buildInterpreterResult();
		final Queue<IExpression> paramList = new LinkedList<IExpression>();
			 
		try {
			mainProc.call(paramList);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
      } 
      else { 
         System.err.println("usage: java simpleAdder inputFile"); 
         System.exit(1); 
      } 
   }
}